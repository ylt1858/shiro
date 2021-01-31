package scam.dao;

/**
 * @author y'l'l
 */

import org.springframework.stereotype.Repository;
import scam.pojo.student;

import java.util.List;

/**
 * mybatis的mapper类:DAO
 * 或者在启动类中加那个注释掉的东西不加mapper的话
 */

//@Mapper
@Repository
public interface StudentMapper {
    List<student> queryStudentList();
    student queryStudentBySno(int sno);
    int addStudent(student student);
    int updateStudent(student student);
    int deleteStudent(String sno);
//    List<User> queryUserList();
//
//    User queryUserById(int id);
//
//    int addUser(User user);
//
//    int updateUser(User user);
//
//    int deleteUser(int id);


}