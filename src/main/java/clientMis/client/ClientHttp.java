package clientMis.client;

import clientMis.model.JsonAutoDetect;
import clientMis.model.Order;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.temporal.ValueRange;
import java.util.List;
// это для чего?
@JsonAutoDetect


public class ClientHttp {
 private final String url = "http://localhost:8096/server/api/orders"; /*
  у тебя всегда ресурс будет расположен на таком урле? А если поменяется? Нужно что бы путь
  задавался из вне, конструктор в помощь.
 */

 private HttpClient client = new DefaultHttpClient(); // можификатор final, инициализация внутри класса(Хорошая практика)
 private HttpGet request = new HttpGet(url); // можификатор final, инициализация внутри класса(Хорошая практика)
 private HttpResponse response; // можификатор final, инициализация внутри класса(Хорошая практика)


 public ClientHttp() throws IOException { // класс не должен выкидывать исключение, лучше что бы выкидывал только метод getResponse
 }

 public String getResponse() throws IOException { // Пробрасывать исключение на верх не надо, обрабатывай в методе используй try catch finally
response =  client.execute(request);
  BufferedReader rd = new BufferedReader(
          new InputStreamReader(response.getEntity().getContent()));

  StringBuffer result = new StringBuffer();
  String line = "";
  while ((line = rd.readLine()) != null) {
   result.append(line);

  }
  rd.close();
  return result.toString();

 }
}
/** комментарии удали
 * */
 /*public static void main(String[] args) throws IOException {



        ObjectMapper mapper = new ObjectMapper();

        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        List <Order> asArray = mapper.readValue(obj, List.class);
        *//*  System.out.println(asArray.toString());*//*
        System.out.println(asArray.size());
        System.out.println(asArray.toString());*/

       /* ObjectMapper xmlMapper = new XmlMapper();
        String xml = xmlMapper.writeValueAsString(asArray);
// or
        xmlMapper.writeValue(new File("C:\\Users\\perko\\IdeaProjects\\inXML\\src\\main\\java\\clientMis\\services\\XML.xml"), asArray);

    }
*/



