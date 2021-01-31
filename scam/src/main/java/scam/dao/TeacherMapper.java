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
 */

//@Mapper
@Repository
public interface TeacherMapper {
    List<teacher> queryTeacherList();
    student queryTeacherByTno(int tno);
    int addTeacher(teacher teacher );
    int updateTeacher(teacher teacher);
    int deleteTeacher(String tno);
}
