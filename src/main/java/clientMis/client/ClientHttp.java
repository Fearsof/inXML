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

@JsonAutoDetect


public class ClientHttp {
 private final String url = "http://localhost:8096/server/api/orders";

 private HttpClient client = new DefaultHttpClient();
 private HttpGet request = new HttpGet(url);
 private HttpResponse response;


 public ClientHttp() throws IOException {
 }

 public String getResponse() throws IOException {
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



