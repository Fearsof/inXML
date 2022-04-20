package clientMis.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

public class XmlConvert {
    private OrdersJsonConverter ordersJsonConverter;

    public XmlConvert(OrdersJsonConverter ordersJsonConverter) {
        this.ordersJsonConverter = ordersJsonConverter;
    }

    public void toConvertedXml() throws IOException {
        ObjectMapper xmlMapper = new XmlMapper();
        String xml = xmlMapper.writeValueAsString(ordersJsonConverter.converterJSON());
// or
        xmlMapper.writeValue(new File("C:\\Users\\perko\\IdeaProjects\\inXML\\src\\main\\java\\clientMis\\services\\XML.xml"), ordersJsonConverter.converterJSON());

    }
}