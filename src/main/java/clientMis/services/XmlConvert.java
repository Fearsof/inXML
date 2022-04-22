package clientMis.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

public class XmlConvert {
    private OrdersJsonConverter ordersJsonConverter;

    public XmlConvert(OrdersJsonConverter ordersJsonConverter) {
        this.ordersJsonConverter = ordersJsonConverter;
    }

    public void toConvertedXml() {
        ObjectMapper xmlMapper = new XmlMapper();
        File XML = new File("C:\\Users\\perko\\IdeaProjects\\inXML\\src\\main\\java\\clientMis\\services\\XML1.xml");
        try {
            String xml = xmlMapper.writeValueAsString(ordersJsonConverter.converterJSON());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        try {
            xmlMapper.writeValue(XML, ordersJsonConverter.converterJSON());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}