package demo.spring_kafka.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class User {

    private Long id;

    private String firstName;

    private String lastName;
}
