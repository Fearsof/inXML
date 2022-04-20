package clientMis.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

public class Orders {
    private String hisid;
    private String id;


    public String getHisid() {
        return hisid;
    }

    public void setHisid(String hisid) {
        this.hisid = hisid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Orders(@JsonProperty(value = "hisid") String hisid,
                  @JsonProperty(value = "id") String id) {
        this.id = id;
        this.hisid = hisid;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "hisid='" + hisid + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}


