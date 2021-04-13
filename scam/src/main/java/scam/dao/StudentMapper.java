package scam.dao;

import org.springframework.stereotype.Repository;
import scam.pojo.student;
import java.util.List;

/**
 * mybatis的mapper类:DAO
 * 或者在启动类中加那个注释掉的东西不加mapper的话
 * @author y'l'l
 */

@Repository
public interface StudentMapper {
    /**
     * 查找所有学生信息
     * @return
     */
    List<student> queryStudentList();

    /**
     * 通过学号查找
     * @param sno
     * @return
     */
    student queryStudentBySno(String sno);

    /**
     * 添加学生
     * @param student
     * @return
     */
    int addStudent(student student);

    /**
     * 更新学生
     * @param student
     * @return
     */
    int updateStudent(student student);

    /**
     * 删除学生
     * @param sno
     * @return
     */
    int deleteStudent(String sno);

}
