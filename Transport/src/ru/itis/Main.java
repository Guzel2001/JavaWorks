package ru.itis;

public class Main {

    public static void main(String[] args) {
        Transport transport = new Transport(10) {
            // явная реализация  метода go без создания  отдельного класса
            @Override
            public void go() {
                System.out.println("hello");
            }
        };
        transport.go();
    }
}
