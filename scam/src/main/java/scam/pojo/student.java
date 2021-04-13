package scam.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class student {
    /**
     * 学号
     */
    private String sno;
    /**
     * 姓名
     */
    private String s_name;
    /**
     * 年级
     */
    private Integer grade;
    /**
     * 班级
     */
    private String s_class;
    /**
     * 身份证号
     */
    private String ID_card;
    /**
     * 银行卡号
     */
    private String Bank_card;
    /**
     * 队伍
     */
    private String team;
}
