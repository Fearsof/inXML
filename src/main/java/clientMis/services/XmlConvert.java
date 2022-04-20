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

    public void toConvertedXml()  {
        ObjectMapper xmlMapper = new XmlMapper();
        try {
            String xml = xmlMapper.writeValueAsString(ordersJsonConverter.converterJSON());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
// or
        // путь сохранения может меняться, по этому нужно вынести путь в параметры метода и передавать уже оттуда
        try {
            xmlMapper.writeValue(new File("C:\\Users\\perko\\IdeaProjects\\inXML\\src\\main\\java\\clientMis\\services\\XML.xml"), ordersJsonConverter.converterJSON());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}