package Single_Responsibility;

public class Solution {
    public static void main(String[] args) {
        //s -> single responsibility
        // every class should have single responsibility
        // every class should have only one reason to change
    }
}

//Problem
class Invoice {
    void addInvoice() {

    }
    void deleteInvoice() {

    }
    void generateReport() {

    }
    void sendEmailOfReport() {

    }
}


//Problem solved with single responsibility
class Invoice {
    void addInvoice() {

    }
    void deleteInvoice() {

    }
}

class Report {
    void generateReport() {

    }
}

class Email {
    void sendEmailOfReport() {

    }
}
