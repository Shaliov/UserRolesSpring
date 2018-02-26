package by.bsuir.Shaliov.model.abstracts;

import by.bsuir.Shaliov.model.Entry;
import by.bsuir.Shaliov.model.enums.UserRole;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author Shaliou_AG
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public abstract class User {
    private Integer id;
    private UserRole role;
    private String firstName;
    private String secondName;
    private String email;
    private List<Entry> entryList;
}
