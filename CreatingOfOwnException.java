class KishoreException extends Exception{
    KishoreException(String str){
        super(str);
    }
}
public class CreatingOfOwnException {
    public static void main(String[] args) {
     int a=9;
     int b=0;
     int c =a+b;
     try {
         if (c > 5) throw new KishoreException("exception success");
     }
     catch (KishoreException e) {
         System.out.println(e);
     }

    }
}
