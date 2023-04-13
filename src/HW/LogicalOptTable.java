package HW;

public class LogicalOptTable {
    public static void main(String[] args) {

        boolean p =true;
        boolean q = true;



        System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR\t\tNOT");


        System.out.print(boolToInt(p) + "\t\t" + boolToInt(q) + "\t\t");
        System.out.print(boolToInt(p&q)+ "\t\t" + boolToInt(p|q) + "\t\t");
        System.out.println(boolToInt(p^q)  + "\t\t" + boolToInt(!p));
        p = true;
        q = false;

        System.out.print(boolToInt(p)+ "\t\t" + boolToInt(q) + "\t\t");
        System.out.print(boolToInt(p&q)  + "\t\t" + boolToInt(p|q) + "\t\t");
        System.out.println(boolToInt(p^q) + "\t\t" + boolToInt(!p));
        p = false;
        q = true;

        System.out.print(boolToInt(p)  + "\t\t" + boolToInt(q)+ "\t\t") ;
        System.out.print(boolToInt(p&q) + "\t\t" + boolToInt(p|q) + "\t\t");
        System.out.println(boolToInt(p^q)+ "\t\t" + boolToInt(!p));
        p = false;
        q = false;
        System.out.print(boolToInt(p) + "\t\t" + boolToInt(q) + "\t\t" );
        System.out.print(boolToInt(p&q)+ "\t\t" + boolToInt(p|q) + "\t\t");
        System.out.println(boolToInt(p^q) + "\t\t" + boolToInt(!p));

    }
    public static int boolToInt(boolean b){
        return b ? 1 : 0;
    }

}
