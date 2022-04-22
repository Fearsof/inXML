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
 private String url; /*
  у тебя всегда ресурс будет расположен на таком урле? А если поменяется? Нужно что бы путь
  задавался из вне, конструктор в помощь.
 */


 private final HttpClient client = new DefaultHttpClient();
 private  HttpGet request ;
 private  HttpResponse response;

    public ClientHttp (String url){
        this.url = url;

    }
 public String getResponse() {
     BufferedReader rd = null;
     StringBuffer result = null;
    request = new HttpGet(url);

     try {
         response = client.execute(request);
         rd = new BufferedReader(
                 new InputStreamReader(response.getEntity().getContent()));

         result = new StringBuffer();
         String line = "";
         while ((line = rd.readLine()) != null) {
             result.append(line);

         }
     } catch (IOException e) {
         e.printStackTrace();
     }
     try {
         rd.close();
     } catch (IOException e) {
         e.printStackTrace();
     }
     return result.toString();
 }
}




