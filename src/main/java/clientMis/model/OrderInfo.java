package clientMis.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderInfo {
    private String code;
    private String id;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public OrderInfo(@JsonProperty(value = "code") String code,
                     @JsonProperty(value = "id") String id) {
        this.id = id;
        this.code = code;
    }


    @Override
    public String toString() {
        return "OrderInfo{" +
                "code='" + code + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
