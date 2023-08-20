public class Main {
    public static void main(String[] args) {
        byte a = 126;
        short b = 32766;
        int c = 2147483646;
        long d = 9223372036854775806l;
        float e = 3.457895f;
        double f = 1.111222333444555;
        System.out.println("Значение переменной а с типом byte равно " + a);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной c с типом int равно " + c);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);

        double one = 27.12;
        float three = 2.786f;
        short four = 569;
        short five = -159;
        short six = 27897;
        byte seven = 67;

        byte lydmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        int numberStudent = (lydmilaPavlovna+annaSergeevna+ekaterinaAndreevna);
        int sheet = 480;
        int studentSheet = (sheet / numberStudent);
        System.out.println("На каждого ученика рассчитано " + studentSheet + " листов бумаги ");

        byte machineTwoMinute = 16;
        byte twentyMinutes = 20;
        short twentyFour = 24*60;
        int threeDay = 24*3*60;
        int oneMonth = 31*24*60;
        int resultTwenty = (twentyMinutes * machineTwoMinute / 2 );
        int resultFour = (twentyFour * machineTwoMinute / 2);
        int resultDay = (threeDay * machineTwoMinute / 2);
        int resultMonth = (oneMonth * machineTwoMinute / 2);
        System.out.println("За " + twentyMinutes + " минут машина произвела " + resultTwenty + " штук бутылок" );
        System.out.println("За сутки машина произвела " + resultFour + " штук бутылок" );
        System.out.println("За три дня машина произвела " + resultDay + " штук бутылок" );
        System.out.println("За за один месяц машина произвела " + resultMonth + " штук бутылок" );

        byte cansPaint = 120;
        byte oneClassWhite = 2;
        byte oneClassBrown = 4;
        int resultOneClasse = (oneClassWhite+oneClassBrown);
        int numberClasses = (cansPaint / resultOneClasse);
        System.out.println(" В школе, где " + numberClasses + " классов, нужно " + (numberClasses * oneClassWhite) + " банок белой краски и " + (numberClasses * oneClassBrown) + " банок коричневой краски ");


        float quantityBanana = 5;
        float quantityMilk = 200;
        float quantityIceCream = 2;
        float quantityEgg = 4;

        float weightBanana = 80;
        float weightMilk = 105;
        float weightIceCream = 100;
        float weightEgg = 70;

        System.out.println( "Вес спортзавтрака составялет " +(((quantityBanana * weightBanana ) + (quantityMilk * 2) + (weightIceCream * quantityIceCream) + (quantityEgg * weightEgg)) / 1000) + " кг ");


        byte purposeWeight = 7;
        short expenseDay = 250;
        short expenseDay2 = 500;
        System.out.println((( "Если терять в весе по " + expenseDay + " грамм, то необходимо " + ((purposeWeight * 1000) / expenseDay)) + " дней. А если по " + expenseDay2 + " грамм, то необходимо " + ((purposeWeight * 1000) / expenseDay2)) + " дней ");


        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;

        int mashaYear = (masha * 12);
        int mashaAddition = ((( masha * 10) / 100 ) + (masha));
        int mashaYearAddition = (mashaAddition * 12);
        int mashaDifference = (mashaYearAddition - mashaYear);

        System.out.println(" Маша теперь получает " + mashaAddition + " Годовой доход вырос на " + mashaDifference ) ;

        int denisYear = (denis * 12);
        int denisAddition = ((( denis * 10) / 100 ) + (denis));
        int denisYearAddition = (denisAddition * 12);
        int denisDifference = (denisYearAddition - denisYear);

        System.out.println(" Денис теперь получает " + denisAddition + " Годовой доход вырос на " + denisDifference ) ;

        int kristinaYear = (kristina * 12);
        int kristinaAddition = ((( kristina * 10) / 100 ) + (kristina));
        int kristinaYearAddition = (kristinaAddition * 12);
        int kristinaDifference = (kristinaYearAddition - kristinaYear);

        System.out.println(" Кристина теперь получает " + kristinaAddition + " Годовой доход вырос на " + kristinaDifference ) ;
        }

}