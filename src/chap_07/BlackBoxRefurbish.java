package chap_07;

public class BlackBoxRefurbish {

    String modelName;
    String resulution;
    int price;
    String color;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getResulution() {
        if (resulution == null || resulution.isEmpty()) {
            return "판매자에게 문의 하세요.";
        }
        return  resulution;
    }

    public void setResulution(String resulution) {
        this.resulution = resulution;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if ( price < 100000){
            this.price = 100000;
        }
        else {
            this.price = price;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



}

