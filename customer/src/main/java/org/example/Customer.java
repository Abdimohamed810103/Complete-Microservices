package org.example;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Entity(name = "customers")
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Id
    @SequenceGenerator(name = "customer_id_sequence",
     sequenceName = "customer_id_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "customer_id_sequence")
    private Integer id;
    private String fname;
    private String lname;
    private long age;
}
