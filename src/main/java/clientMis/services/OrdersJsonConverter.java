package clientMis.services;

import clientMis.client.ClientHttp;

import clientMis.model.Order;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;
import java.io.IOException;

public class OrdersJsonConverter {
    // инициадизация clientHttp происходит внутри класса, нужен модификатор доступа final. (Хорошая практика)
    private ClientHttp clientHttp;

    public OrdersJsonConverter(ClientHttp client) {
        this.clientHttp = client;
    }

    public List<Order> converterJSON() throws IOException { // обработай исключение try catch finally(finally если работа с ресурсами)
        ObjectMapper mapper = new ObjectMapper();

        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        List <Order> asArray = mapper.readValue(clientHttp.getResponse(), List.class);

      return asArray;
}
}
