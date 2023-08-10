package org.example;

public class Main {
    private String value;

    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.setValue("<неко>");
        String valueForCheck = main.getValue();
        main.checkValue(valueForCheck);
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public void checkValue(String value) throws Exception {
        if (value.length() > 10) {
            throw new Exception();
        }
    }

//    public static void main(String[] args) {
//        makeSomeOperation("Толя");
//    }
//
//    public static void makeSomeOperation(String clientName) {
//        System.out.println("Выполнение некоторых операций для клиента - " + clientName);
//    }
}
