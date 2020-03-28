package phonebook;

public class Main {
    public static void main(String[] args) {
        Phonebook mybook = new Phonebook();
        mybook.addPhoneRecord("Dee", "932-78937");
        mybook.addPhoneRecord("Nick", "748-8383");

        mybook.removePhoneRecord("Dee");
        mybook.getAllPhoneRecords();
        System.out.println(mybook.getAllPhoneRecords());
        System.out.println(mybook.returnNumber("Nick"));
        System.out.println(mybook.returnName("748-8383"));

        //Reverse lookup give number get back person name

    }
}
