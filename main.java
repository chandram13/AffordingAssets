
import math

public class AffordingAssets {

    public static void calculateMortgage(String [] loan,interest,years){
        r = (interest / 100) / 12
        n = 12 * years
        mortgage = loan * interest * (1 + r)^n / ((1 + r)^n - 1))
        totalRepay = m * n
        totalInterest = totalRepay - loan
    }

    public calculateCar (String [] excellentScore,greatScore,verygoodScore,goodScore,fairScore,poorScore,verypoorScore,extremelypoorScore,cashDown,years){
        // credit score arguments are for set interests
        excellentScore = int;
        greatScore = int;
        verygoodScore = int;
        goodScore = int;
        fairScore = int;
        poorScore = int;
        verypoorScore = int;
        r = (interest / 100) /12
        n = 12 * years
        totalRepay = m * n
        totalInterest = totalRepay - loan
        mortgage = loan * interest * (1 + r)^n / ((1 + r)^n - 1)
        esp1 = loan * interest * (1 + r)^n / ((1 + r)^n - 1) - cashDown
        System.outPrintln("Your first month's car payment (with excellent credit) is" + esp1 + "discounted by your first down payment.")
        esp =  loan * interest * (1 + r)^n / ((1 + r)^n - 1)
        System.outPrintln("Your regular car payment is (with excellent credit) is" + esp1 + ".")

        gsp1 = loan * interest * (1 + r)^n / ((1 + r)^n - 1) - cashDown
        System.outPrintln("Your first month's car payment (with great credit) is" + gsp1 + "discounted by your first down payment.")
        gsp =  loan * interest * (1 + r)^n / ((1 + r)^n - 1)
        System.outPrintln("Your regular car payment is (with great credit) is" + gsp + ".")
    }
}
