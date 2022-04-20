package clientMis.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

public class Order {
    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }

    public OrderInfo[] getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(OrderInfo[] orderInfo) {
        this.orderInfo = orderInfo;
    }

    public OrderingInstitution getOrderingInstitution() {
        return orderingInstitution;
    }

    public void setOrderingInstitution(OrderingInstitution orderingInstitution) {
        this.orderingInstitution = orderingInstitution;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String[] getResults() {
        return results;
    }

    public void setResults(String[] results) {
        this.results = results;
    }

    private Orders order;
    private OrderInfo[] orderInfo;
    private OrderingInstitution orderingInstitution;
    private Patient patient;
    private String[] results;

    @Override
    public String toString() {
        return "Order{" +
                "order=" + order +
                ", orderInfo=" + Arrays.toString(orderInfo) +
                ", orderingInstitution=" + orderingInstitution +
                ", patient=" + patient +
                ", results=" + Arrays.toString(results) +
                '}';
    }
}
