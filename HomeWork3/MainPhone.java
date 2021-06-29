package HomeWork3;

public class MainPhone {
    public static void main(String[] args){
        PhoneBox book = new PhoneBox();
        book.add("Aksenov", "55-35-25");
        book.add("Ivanov", "55-45-37");
        book.add("Aksenov", "95-37-47");
        book.add("Lobin", "93-23-33");
        book.add("Ledunov", "93-23-82");
        book.add("Lobin", "75-25-35");

        book.findString("Ivanov");
        book.findString("Aksenov");
        book.findString("Borinov");
    }
}
