package Task1_Cities;

import java.util.Arrays;
import java.util.List;

public class StateData {

    static List<String> alabama = Arrays.asList("Anniston","Birmingham","Florence");
    static List<String> california = Arrays.asList("Arcadia","Beverly Hills","Hollywood");
    static List<String> texas = Arrays.asList("Dallas","Austin","Arlington");

    //With @AllArgsConstructor
    /*public static Stream<State> getStates(){
        return Stream.of(
                new State(alabama),
                new State(california),
                new State(texas)
        );
    }*/

    //Without @AllArgsConstructor
    /*public static State createState(List<String> cities){
        State state = new State();
        cities.forEach(state::addCity);
        return state;
    }

    public static List<State> getAll(){
        return Arrays.asList(
                createState(alabama),
                createState(california),
                createState(texas)
        );
    }*/


}
