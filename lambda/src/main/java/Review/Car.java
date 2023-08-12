package Review;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@RequiredArgsConstructor

public class Car {

    private String make;
    private int topSpeed;
    private final int year;

}
