import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Student {

    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String passWord;
    private String confirmPassWord;
    private int age;


}
