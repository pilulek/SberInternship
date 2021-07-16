
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<City> citiesList = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("C:\\Lili\\SberVirtInternship\\SberInternship\\src\\main\\resources\\city_ru.csv"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] lineTitle = line.split(";");

                String col2 = lineTitle[1];
                String col3 = lineTitle[2];
                String col4 = lineTitle[3];
                int col5 = Integer.parseInt(lineTitle[4]);
                String col6;

                try {
                    col6 = lineTitle[5];
                } catch (ArrayIndexOutOfBoundsException e) {
                    col6 = "";
                }

                citiesList.add(new City(col2, col3, col4, col5, col6));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        citiesList.forEach(System.out::println);

    }
}
