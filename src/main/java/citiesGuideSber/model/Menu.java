package citiesGuideSber.model;

import java.util.Scanner;

import static citiesGuideSber.util.CityUtils.*;

/**
 * Меню для работы со списком городов
 */
public class Menu {

    private static final String COMMAND_LIST = "СПИСОК КОМАНД";
    private static final String CITIES_LIST = "1. СПИСОК ГОРОДОВ";
    private static final String SORT_BY_NAME_CASE_SENSITIVE = "2. СОРТИРОВКА ПО ИМЕНИ С УЧЁТОМ РЕГИСТРА";
    private static final String SORT_BY_NAME_WITHOUT_CASE_SENSITIVE = "3. СОРТИРОВКА ПО ИМЕНИ БЕЗ УЧЁТА РЕГИСТРА";
    private static final String MAX_POPULATION = "4. ГОРОД С НАИБОЛЬШИМ НАСЕЛЕНИЕМ";
    private static final String NUMBER_OF_CITIES_IN_REGION = "5. КОЛИЧЕСТВО ГОРОДОВ В РЕГИОНЕ";
    private static final String EXIT = "6. ВЫХОД";

    public final void startMenu() {
        try (Scanner scan = new Scanner(System.in)) {
            boolean repeatCycle = true;

            while (repeatCycle) {
                System.out.printf("%100s \n", COMMAND_LIST);
                System.out.printf("|| %s || %s || %s || %s || %s || %s || \n\n", CITIES_LIST, SORT_BY_NAME_CASE_SENSITIVE,
                        SORT_BY_NAME_WITHOUT_CASE_SENSITIVE, MAX_POPULATION, NUMBER_OF_CITIES_IN_REGION, EXIT);
                System.out.print("Введите номер команды: ");
                int command = scan.nextInt();
                switch (command) {
                    case 1:
                        printData();
                        break;
                    case 2:
                        sortByDistrictAndNameComparator();
                        break;
                    case 3:
                        sortByNameLambda();
                        break;
                    case 4:
                        findMaxPopulation();
                        break;
                    case 5:
                        numberOfCitiesByStream();
                        break;
                    case 6:
                        repeatCycle = false;
                        break;
                    default:
                        continue;
                }
            }
        }
    }
}
