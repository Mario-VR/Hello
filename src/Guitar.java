public class Guitar {

    private String serialNumber;

    public String getSerialNumber(){
        return serialNumber;
    }
    public  void setSerialNumber(String serialNumber){
        this.serialNumber = serialNumber;
    }


    private double price;

    public double getPrice() {
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    private String builder;
    public String getBuilder(){
        return builder;
    }

    public void setBuilder(String builder) {
        this.builder = builder;
    }


    private String model;
    public String getModel(){
        return builder;
    }

    public void setModel(String model) {
        this.model = model;
    }

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String bacWood;

    public String getBacWood() {
        return bacWood;
    }

    public void setBacWood(String bacWood) {
        this.bacWood = bacWood;
    }

    private String topWood;

    public String getTopWood() {
        return topWood;
    }

    public void setTopWood(String topWood) {
        this.topWood = topWood;
    }
}
