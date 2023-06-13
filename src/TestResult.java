//package test;

//import domain.Exercise;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TestResult {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Date of birth (yyyy-mm-dd): ");
        String birthDateString = scanner.next();

        // Парсинг дати народження
        LocalDate birthDate = LocalDate.parse(birthDateString, DateTimeFormatter.ISO_DATE);

        // Виклик методу для розрахунку біоритму з класу Exercise
        double bioRhythmValue = Exercise.calculateBioRhythm(birthDate);

        System.out.println("The current value of your biorhythm is: " + bioRhythmValue);
    }
}