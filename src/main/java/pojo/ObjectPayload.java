package pojo;


public class ObjectPayload {

    private String name;
    private Data data;

    public ObjectPayload() {}

    public ObjectPayload(String name, Data data) {
        this.name = name;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public Data getData() {
        return data;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
