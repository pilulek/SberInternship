
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        print(parseCities());

    }

    public static List<City> parseCities() {
        List<City> citiesList = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("C:\\Lili\\SberInternship\\src\\main\\resources\\city_ru.csv"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] lineTitle = line.split(";");

                scanner.skip("\\d*"); // Необходимо пропустить значение номера строки по условиям задачи
                String name = lineTitle[1];
                String region = lineTitle[2];
                String district = lineTitle[3];
                int population = Integer.parseInt(lineTitle[4]);
                String foundation;

                try {
                    foundation = lineTitle[5];
                } catch (ArrayIndexOutOfBoundsException e) {
                    foundation = "";
                }

                citiesList.add(new City(name, region, district, population, foundation));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return citiesList;
    }

    public static void print(List<City> citiesList) {
        citiesList.forEach(System.out::println);
    }
}
