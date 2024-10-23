
import java.util.*;

import static java.util.Collections.sort;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Date datum = new Date(2018, 8, 2);
//        Date datum2 = datum;
//        datum2.setDate(21);
//        System.out.println(datum);
//        double x=15.6167;
//        System.out.println(Math.round(x));
//        System.out.println(Math.floor(x));
//        System.out.println(Math.ceil(x));
//        String s = new String("Hello World");
//        s+= x;
//        System.out.println(s);
//        double[] temp = new double[10];
        ArrayList<Integer> brojevi = new ArrayList<Integer>();
        brojevi.add(1);
        brojevi.add(1);
        brojevi.add(1);
        brojevi.add(1);
        brojevi.add(1);
        brojevi.add(0,6);
        brojevi.add(1,3);
        System.out.println(brojevi.get(2));
        Iterator<Integer> it= brojevi.iterator();
        int b = it.next();
        System.out.println(b);
         b = it.next();
        System.out.println(b);
         b = it.next();
        System.out.println(b);
        sort(brojevi);
        System.out.println(brojevi);
        brojevi.sort(Collections.reverseOrder());
        System.out.println(brojevi);





    }
}

