package Task1_Cities;

import java.util.ArrayList;
import java.util.List;

/*@Data
@AllArgsConstructor*/
public class State {
    /*private List<String> cities = new ArrayList<>();
    public void addCity(String city){
        cities.add(city);
    }
    public List<String> getCities(){
        return this.cities;
    }*/

    //Alternate Solution
    private String name;
    private List<String> cities = new ArrayList<>();

    public void addCity(String city){
        cities.add(city);
    }

    public List<String> getCity(){
        return this.cities;
    }
}
