package Task1_Cities;

import java.util.List;

public class StateTest {

    public static void main(String[] args) {

        //Print all the cities

        //Without @AllArgsConstructor
//        StateData.getAll().stream()
//                .map(State::getCities)
//                .flatMap(List::stream)
//                .forEach(System.out::println);

        //With @AllArgsConstructor
        StateData.getStates()
                .map(State::getCities)
                .flatMap(List::stream)
                .forEach(System.out::println);

    }
}
