public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        boolean lyjaLieyus = true;
        System.out.println(lyjaLieyus);


        if (20 <= 13 ){
            System.out.println("kazys ");
        }else{
            System.out.println( " petras ");
        }



        String name = " Brigita ";
        String surname = " Salina ";
        int birthYear = 1989;
        int thisYear = 2023;

        System.out.println( " As esu " + name + surname + ".Man yra " + (thisYear - birthYear) + " metai. ");


       int num1 = (int) Math.round(Math.random()*4); //1
        int num2 =(int) Math.round(Math.random()*4);  //3

       System.out.println( num1 );
       System.out.println( num2 );

       if(num1 != 0 && num2 != 0) {

           if (num1 < num2) {
               System.out.println(Math.round(100.0 * num2 / num1) / 100.0);
           }
       else {
               System.out.println(Math.round(100.0 * num1 / num2) / 100.0);
           }
       }
       else{
           System.out.println( " rezultatas negalimas ");
       }

       //3.Naudokite funkcija Math.random().
        // Sukurkite tris kintamuosius ir naudodamiesi funkcija Math.random() jiems priskirkite atsitiktines
        // reikšmes nuo 0 iki 25. Raskite ir atspausdinkite kintąmąjį turintį vidurinę reikšmę.

        int num31 =(int) Math.round(Math.random() *25);
       int num32= (int) Math.round(Math.random() *25);
       int num33 = (int) Math.round(Math.random() *25);
//                             16                   8                   23
        System.out.println(" num 31 " + num31 + " num32 " + num32 + " num33 "+ num33);


        if(    (num31 > num32 && num31 < num33)  || (num31 < num32 && num31 > num33) ){

        System.out.println("vidurine reiksme num31");}

        if(    (num32 > num31 && num32 < num33)  || (num32 < num31  && num32 > num33) ){

        System.out.println(("vidurine reiksme num32"));}
        if(    (num33 > num32 && num33 < num31)  || (num33 < num32 && num33 > num31) ){

        System.out.println(" vidurine reiksme num33");}




//        Sukurkite keturis kintamuosius ir ​Math.random()​ funkcija sugeneruokite jiems
//         reikšmes nuo 0 iki 2. Suskaičiuokite kiek yra nulių, vienetų ir dvejetų.


        int num5 = (int) Math.round(Math.random() * 2);
        int num6 = (int) Math.round(Math.random() * 2);
        int num7 = (int) Math.round(Math.random() * 2);
        int num8 = (int) Math.round(Math.random() * 2);

        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);
        System.out.println(num8);
        System.out.println("--------");

        int zeros = 0;

        if(num5 ==0){
            zeros++;
        }
        if(num6 ==0){
            zeros++;
        }
        if(num7 ==0){
            zeros++;
        }
        if(num8 ==0){
            zeros++;
        }

        System.out.println("nuliu yra" + zeros);
        System.out.println(("-------------"));

        int ones = 0;


        if(num5 ==0){
            ones++;
        }
        if(num6 ==0){
           ones++;
        }
        if(num7 ==0){
           ones++;
        }
        if(num8 ==0){
            ones++;
        }
        System.out.println("vienetu yra " + ones);
        System.out.println(("-------------"));

        int twos = 0;


        if(num5 ==0){
            twos++;
        }
        if(num6 ==0){
            twos++;
        }
        if(num7 ==0){
            twos++;
        }
        if(num8 ==0){
            twos++;
        }
        System.out.println("dvejetu yra" + twos);
















































//      double random = Math.random();
//        System.out.println(random);

//        System.out.println(Math.round(random * 8));

//        System.out.println( Math.round(random * 2) );
//        System.out.println(random * 1);






























































    }
}