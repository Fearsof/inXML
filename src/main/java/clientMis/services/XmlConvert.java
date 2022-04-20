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

    public void toConvertedXml() throws IOException { // обработай исклчение try catch finally
        ObjectMapper xmlMapper = new XmlMapper();
        String xml = xmlMapper.writeValueAsString(ordersJsonConverter.converterJSON());
// or
        // путь сохранения может меняться, по этому нужно вынести путь в параметры метода и передавать уже оттуда
        xmlMapper.writeValue(new File("C:\\Users\\perko\\IdeaProjects\\inXML\\src\\main\\java\\clientMis\\services\\XML.xml"), ordersJsonConverter.converterJSON());

    }
}