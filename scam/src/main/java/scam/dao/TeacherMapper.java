package scam.dao;

/**
 * @author y'l'l
 */

import org.springframework.stereotype.Repository;
import scam.pojo.student;
import scam.pojo.teacher;

import java.util.List;

/**
 * mybatis的mapper类:DAO
 * 或者在启动类中加那个注释掉的东西不加mapper的话
 * @author y'l'l
 */

@Repository
public interface TeacherMapper {
    /**
     * 教师列表
     * @return
     */
    List<teacher> queryTeacherList();

    /**
     * 通过教师编号查找
     * @param tno 教师编号
     * @return
     */
    teacher queryTeacherByTno(int tno);

    /**
     * 添加教师
     * @param teacher
     * @return
     */
    int addTeacher(teacher teacher );

    /**
     * 更新教师
     * @param teacher
     * @return
     */
    int updateTeacher(teacher teacher);

    /**
     * 通过tno删除教师
     * @param tno
     * @return
     */
    int deleteTeacher(String tno);

}
