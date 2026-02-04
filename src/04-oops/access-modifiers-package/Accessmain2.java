import mypack.*;

class Accessdemo extends Access {

    void setC(int value) {
        c = value;  
    }

    void sum() {
        System.out.println("Addition is " + (a + b + c));
    }
}

class Accessmain2 {
    public static void main(String[] args) {

        Accessdemo m = new Accessdemo();

        m.a = 10;
        m.b = 20;
        m.setC(30);   

        m.sum();
    }
}
