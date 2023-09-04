package Task1_Cities;

import java.util.Arrays;
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
//        StateData.getStates()
//                .map(State::getCities)
//                .flatMap(List::stream)
//                .forEach(System.out::println);

        //Alternate Solution
        State va = new State();
        va.addCity("McLean");
        va.addCity("Arlington");
        va.addCity("Fairfax");
        va.addCity("FallsChurch");

        State tx= new State();
        tx.addCity("Dallas");
        tx.addCity("Plano");
        tx.addCity("Austin");
        tx.addCity("Houston");

        List<State> list = Arrays.asList(va,tx);

//        list.stream().map(state -> state.getCity()).forEach(System.out::println);

        list.stream().map(state -> state.getCity())
                .flatMap(List::stream)
                .forEach(System.out::println);

    }
}
