package clientMis;
import clientMis.client.ClientHttp;
import clientMis.services.OrdersJsonConverter;
import clientMis.services.XmlConvert;

import javax.xml.bind.JAXBException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {


        ClientHttp client = new ClientHttp(args[0]);

        System.out.println(client.getResponse());
        OrdersJsonConverter ordersJsonConverter = new OrdersJsonConverter(client);
        System.out.println(ordersJsonConverter.converterJSON());
        XmlConvert xmlConvert = new XmlConvert(ordersJsonConverter);
        xmlConvert.toConvertedXml();
    }
}