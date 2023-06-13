import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercise {
    // Константи для розрахунку біоритмів
    private static final double PHYSICAL_CYCLE = 23;
    private static final double EMOTIONAL_CYCLE = 28;
    private static final double INTELLECTUAL_CYCLE = 33;
    // Метод для розрахунку біоритму за заданою датою народження
    public static double calculateBioRhythm(LocalDate birthDate) {
        LocalDate currentDate = LocalDate.now();
        int days = (int) Math.abs(currentDate.toEpochDay() - birthDate.toEpochDay());
        // Розрахунок значень біоритмів
        double physical = Math.sin(2 * Math.PI * days / PHYSICAL_CYCLE);
        double emotional = Math.sin(2 * Math.PI * days / EMOTIONAL_CYCLE);
        double intellectual = Math.sin(2 * Math.PI * days / INTELLECTUAL_CYCLE);
        // Повернення суми біоритмів
        return physical + emotional + intellectual;}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Date of birth (yyyy-mm-dd): ");
        String birthDateString = scanner.next();
        // Парсинг дати народження
        LocalDate birthDate = LocalDate.parse(birthDateString, DateTimeFormatter.ISO_DATE);
        // Розрахунок поточного значення біоритму
        double bioRhythmValue = calculateBioRhythm(birthDate);

        System.out.println("The current value of your biorhythm is: " + bioRhythmValue); 
    } }