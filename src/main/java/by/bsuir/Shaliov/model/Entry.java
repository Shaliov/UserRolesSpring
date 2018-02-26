package by.bsuir.Shaliov.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author Shaliou_AG
 */
@Entity
@Table(name = "ENTRY")
public class Entry {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Size(min = 3, max = 20)
    @Column(name = "HEADER")
    private String header;

    @NotNull
//    @Size(min = )
    private String desription;
    private String content;
}
