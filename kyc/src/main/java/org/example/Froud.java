package org.example;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
@Entity
public class Froud {
    @Id
    @SequenceGenerator(
            sequenceName = "froud_id_sequence",
            name = "froud_id_sequence"
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "froud_id_sequence")
    private Integer id;
    private Integer customerId;
    private boolean isFroud;
    private LocalDateTime createdAt;
}
