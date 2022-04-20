package clientMis.services;

import clientMis.client.ClientHttp;

import clientMis.model.Order;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;
import java.io.IOException;

public class OrdersJsonConverter {
    private ClientHttp clientHttp;

    public OrdersJsonConverter(ClientHttp client) {
        this.clientHttp = client;
    }

    public List<Order> converterJSON() throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        List <Order> asArray = mapper.readValue(clientHttp.getResponse(), List.class);

      return asArray;
}
}
