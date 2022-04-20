package clientMis.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Patient {

    private String middleName;
    private String secondName;
    private String id;
    private String firstName;
    // Такая же херня
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Patient(@JsonProperty(value = "firstName") String firstName,
                   @JsonProperty(value = "middleName") String middleName,
                   @JsonProperty(value = "secondName") String secondNameName,

                   @JsonProperty(value = "id") String id) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.secondName = secondNameName;

    }

    @Override
    public String toString() {
        return "Patient{" +
                "middleName='" + middleName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
