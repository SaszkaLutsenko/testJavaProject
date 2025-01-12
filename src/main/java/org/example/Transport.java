package org.example;

public class Transport {
//    public  int weight;
//    public int speed;
//    public String color;
//    public String numberRegistration;
    public String brand;
    public String model;
    public int year;

    public void setValues( String _brand, int _year, String _model ){
//        weight = _weight;
//        speed = _speed;
//        color = _color;
//        numberRegistration = _numberRegistration;
        brand = _brand;
        model = _model;
        year = _year;
    }

    public String displayInfo() {
        String info = "Cars brand is " + brand + ", cars model is " + model + " year is " + year + "\n";
    return info;}
}

//Transport opel = new Transport();
//opel.weight = 1950;
//opel.color = "Silver";
//opel.speed = 160;
//opel.numberRegistration = "DW123DW";
//opel.brand = "Astra";
//
//Transport bmw = new Transport();
//bmw.setValues(2150, 210, "Black", "DW333DW", "3");
//
//
//System.out.println(opel.getValues());
//System.out.println(bmw.getValues());
