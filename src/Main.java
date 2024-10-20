//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //task 1
        int total = 0;
        int deposit = 15_000;
        int months = 0;
        while (total <= 2_459_000) {
            months++;
            total = total+deposit;
            System.out.println("Месяц "+months+", сумма накоплений равна "+total+" рублей");
        }

        //task 2
        int num = 0;
        while (num < 10){
            num++;
            System.out.print(num+" ");
        }
        System.out.println();
        for (;num > 0; num--){
            System.out.print(num+" ");
        }
        System.out.println();

        //task 3
        int population = 12_000_000;
        int birthRatePerThousand= 17;
        int mortalityRatePerThousand = 8;
        int year =2024;
        while (year < 2034){
            year++;
            population = population+(population/1000)*(birthRatePerThousand-mortalityRatePerThousand);
            System.out.println("Год "+year+", численность населения составляет "+population+".");
        }

        //task 4
        int dep = 15_000;
        int percent = 7;
        int month = 0;
        while (dep < 12_000_000){
            month++;
           dep = dep+dep*percent/100;
            System.out.println("Месяц "+month+", сумма накоплений - "+dep);
        }

        //task 5
        dep=15_000;
        month=0;
        while (dep<12_000_000){
            month++;
            dep = dep+dep*percent/100;
            if (month%6==0){
                System.out.println("Месяц "+month+", сумма накоплений - "+dep);
            }

        }

        //task 6
        dep=15_000;
        month=0;
        while (month <= 9*12){
            month++;
            dep = dep+dep*percent/100;
            if (month%6==0){
                System.out.println("Месяц "+month+", сумма накоплений - "+dep);
            }
        }

        //task 7
        int firstFriday=3;
        do{
            firstFriday+=7;
            System.out.println("Сегодня пятница, "+firstFriday+"-е число. Необходимо подготовить отчет»");
        } while (firstFriday<31);

        //task 8
        int cometFrequency= 79;
        int currentYear=2024;
        int pastYear=2024-200;
        int futureYear=2024+100;
        for (int i = 0; i < futureYear; i++) {
            if (i%cometFrequency==0){
                if (i>pastYear&&i<futureYear){
                    System.out.println(i);
                }
            }


        }




    }
}