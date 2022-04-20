package clientMis.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderingInstitution {
    private String name;
    private String id;

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public OrderingInstitution(@JsonProperty(value = "name") String name,
                               @JsonProperty(value = "id") String id) {
        this.id = id;
        this.name = name;

    }

    @Override
    public String toString() {
        return "OrderingInstitution{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
