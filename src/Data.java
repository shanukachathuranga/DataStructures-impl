/**
 * Data class to store data in the data structures
 */
public class Data {
    private int value;
    private String description;

    public Data(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public Data(int value){
        this(value, "empty");
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
