public class bill {
    public static void main(String[] args) {
        BillPayment newBill = new BillPayment("Electric", 250);
        newBill.setBill_currentUnit(450);
        System.out.println(newBill.getBill_currentUnit());
        newBill.displayBill();
    }
}

class BillPayment {
    private String bill_type;
    private int bill_lastUnit;
    private int bill_currentUnit;
    private double bill_result;

    public BillPayment(String type, int lastUnit) {
        this.bill_type = type;
        this.bill_lastUnit = lastUnit;
    }

    public int getBill_currentUnit() {
        return this.bill_currentUnit;
    }

    public int getBill_lastUnit() {
        return this.bill_lastUnit;
    }

    public void setBill_currentUnit(int bill_newUnit) {
        if (bill_newUnit >= this.bill_lastUnit) {
            this.bill_currentUnit = bill_newUnit;
        } else {
            System.out.println("Please Insert a correct unit");
        }
    }

    public int calculateUnit() {
        int returnUnit = bill_currentUnit - bill_lastUnit;
        return returnUnit;
    }

    public double calculateBill() {
        if (this.bill_type == "Water") {
            bill_result = calculateUnit() * 5;

        } else if (this.bill_type == "Electric") {
            bill_result = calculateUnit() * 6;
        }
        return bill_result;

    }

    public void displayBill() {
        System.out.println("My Payment bill is : " + this.bill_type + "\n\n" + "The result is : "
                + calculateBill());
    }
}
