class Mobile{
    int price;
    String brand;
    float size;
}
public class ArrayObject {
    public static void main(String[]args){
        Mobile m1 = new Mobile();
        m1.price =10000;
        m1.brand=" samsung ";
        m1.size=6.7f;
        Mobile m2 = new Mobile();
        m2.price =12000;
        m2.brand=" xiaomi ";
        m2.size=6.2f;
        Mobile m3 = new Mobile();
        m3.price =15000;
        m3.brand="iq 15";
        m3.size=6.8f;

        Mobile shop[]=new Mobile[3];
        shop[0]=m1;
        shop[1]=m2;
        shop[2]=m3;
        for(int i=0;i<shop.length;i++){
            System.out.println(shop[i].price+":"+shop[i].brand+":"+shop[i].size);
        }
    }
}
