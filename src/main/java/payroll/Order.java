package payroll;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER_ORDER")
@NoArgsConstructor
@RequiredArgsConstructor
@Getter @Setter
@ToString
@EqualsAndHashCode
public class Order {

    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String description;
    @NonNull
    private Status status;
}
