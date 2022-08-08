
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

        vgp1 = loan * interest * (1 + r)^n / ((1 + r)^n - 1) - cashDown
        System.outPrintln("Your first month's car payment (with very good score) is" + vgp1 + "discounted by your first down payment.")
        vgp = loan * interest * (1 + r)^n / ((1 + r)^n - 1)
        System.outPrintln("Your regular car payment is (with very good score) is" + vgp + ".")

        gosp1 = loan * interest * (1 + r)^n / ((1 + r)^n - 1) - cashDown
        System.outPrintln("Your first month's car payment (with good credit) is" + gosp1 + "discounted by your first down payment.")
        gosp = loan * interest * (1 + r)^n / ((1 + r)^n -1)
        System.outPrintln("Your regular car payment (with good credit) is" + gosp + ".")

        fsp1 = loan * interest * (1 + r)^n / ((1 + r)^n - 1) - cashDown
        System.outPrintln("Your first month's car payment (with fair credit) is" + fsp1 + "discounted by your first down payment.")
        fsp = loan * interest * (1 + r)^n / ((1 + r)^n -1)
        System.outPrintln("Your regular car payment (with fair credit) is") + fsp + ".")

        psp1 = loan * interest * (1 + r)^n / ((1 + r)^n - 1) - cashDown
        System.outPrintln("Your first month's car payment (with poor credit) is" + psp1 + "discounted by your first down payment.")
        psp = loan * interest * (1 + r)^n / ((1 + r)^n -1)
        System.outPrintln("Your regular car payment (with poor credit) is") + psp + ".")

        vpp1 = loan * interest * (1 + r)^n / ((1 + r)^n - 1) - cashDown
        System.outPrintln("Your first month's car payment (with very poor credit) is" + vpp1 + "discounted by your first down payment.")
        vpp =  loan * interest * (1 + r)^n / ((1 + r)^n - 1)
        System.outPrintln("Your regular car payment (with very poor credit) is") + vpp + ".")

        epp1 = loan * interest * (1 + r)^n / ((1 + r)^n - 1) - cashDown
        System.outPrintln("Your first month's car payment (with extremely poor credit) is" + epp1 + "discounted by your first down payment.")
        epp =  loan * interest * (1 + r)^n / ((1 + r)^n - 1)
        System.outPrintln("Your regular car payment (with extremely poor credit) is") + epp + ".")
    }
}
