package scam.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class student {
    private String sno;
    private String s_name;
    private Integer grade;
    private String s_class;
    private String ID_card;
    private String Bank_card;
    private String team;
}
