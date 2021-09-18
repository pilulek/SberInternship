import java.util.Comparator;
import java.util.List;

public class Sort {

     static void sortByNameIgnoreCase(List<City> citiesList) {
        citiesList.sort(new Comparator<City>() {
            @Override
            public int compare(City o1, City o2){

                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });

    }

    static void sortByDistrictNameNotIgnoreCase(List<City> citiesList) {

        citiesList.sort(Comparator.comparing(City::getDistrict).thenComparing(City::getName));
    }

}
