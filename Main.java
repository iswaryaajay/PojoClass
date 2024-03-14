/*
   * favorite places
   * india
   * canada
   * paris
 */

import java.util.Scanner;
class Places {
    Scanner sc = new Scanner(System.in); /* scanner class */
    final String place = "famous places"; /* final keyword */
    private  int number = sc.nextInt();   /* private */
    private String shops = "places";  /* private */
    Places() {  /* default constructor */
        System.out.println("its a super class constructor");
    }
    Places(String shops) {  /* parameterized constructor */
        this.shops = shops; /* this keyword */
    }
    public int getNumber() { /* getter method */
        return number;
    }
    public void setNumber(int number) {  /* setter method */
        this.number = number;
    }
    public String getShops() { /* getter method */
        return shops;
    }
    public void setShops(String shops) { /* setter method */
        this.shops = shops;
    }
    public void show() { /* method */
        System.out.println("famous places in all country");
    }
    final public void finalmethod() { /* final method */
        System.out.println("final method is does not inherit");
    }
    public void add() {  /* method */
        System.out.println("superclass:" + place);
    }
    public void display1(){ /* display method */
        System.out.println(shops);
        System.out.println(number);
    }
}
class India extends Places { /* inheritance */
    final String indian = "tajmahal"; /* final variable */
    private String name2 = "iswarya"; /* private variable */
    India() { /* constructor */
        System.out.println("its a sub class constructor");
    }
    public String getName2() { /* getter method */
        return name2;
    }
    public void setName2(String name2) { /* setter method */
        this.name2 = name2;
    }
    public void show() { /* method */
        super.show(); /* super keyword */
        System.out.println("india famous places is tajmahal");
    }
    public void sub() { /* method */
        System.out.println("subclass:" + indian);
    }
    public  void display2(){ /* display method2 */
        super.display1();
        System.out.println(name2);
    }
}
class Paris extends Places { /* inner class */
    private class inner { /* private class */
        int n = 9944;
        String s = "nila";
    }
    public void display() { /*  object creation method*/
        inner n = new inner();
        System.out.println(n.n);
        System.out.println(n.s);
    }
    public void show() { /*  method */
        super.show(); /*  super method*/
        System.out.println("paris famous place is tower");
    }
}
class Abudhabii extends Places {  /* inheritance */
    private String name3 = "ishu"; /* private variable*/
    public String getName3() { /* getter method */
        return name3;
    }
    public void setName3(String name3) { /* setter method*/
        this.name3 = name3;
    }
    public void display3(){ /* display3 method */
        super.display1();
        System.out.println(name3);
    }
    final public void show() { /* final method */
        System.out.println("abudhabhii famous place is dessert");
    }
}
class PojoClass {
    public static void main(String[] args) {
        India i = new India();
        Abudhabii a = new Abudhabii();
        Paris p = new Paris();
        i.show();
        i.add();
        i.display1();
        i.finalmethod();
        i.sub();
        i.display2();
        i.show();
        a.show();
        a.display3();
        p.show();
        p.display();
    }
}