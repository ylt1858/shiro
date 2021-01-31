package scam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import scam.dao.StudentMapper;
import scam.pojo.student;

import javax.servlet.http.HttpSession;
import javax.websocket.server.PathParam;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentMapper studentMapper;

    @RequestMapping("/updateStudent")
    public String updateStudent(
            @PathParam("sno") String sno,
            @PathParam("s_name") String s_name,
            @PathParam("grade") Integer grade,
            @PathParam("s_class") String s_class,
            @PathParam("ID_card") String ID_card,
            @PathParam("Bank_card") String Bank_card,
            @PathParam("team") String team
    ){
        studentMapper.updateStudent(new student(sno, s_name, grade, s_class, ID_card, Bank_card, team));
        return "redirect:/StudentTable";
    }

    @RequestMapping("/update")
    public String update(
            @PathParam("sno") String sno,
            @PathParam("s_name") String s_name,
            @PathParam("grade") Integer grade,
            @PathParam("s_class") String s_class,
            @PathParam("ID_card") String ID_card,
            @PathParam("Bank_card") String Bank_card,
            @PathParam("team") String team,
            Model model
    ){
        model.addAttribute("student" , new student(sno, s_name, grade, s_class, ID_card, Bank_card, team));
        return "updatestudent";
    }

    @RequestMapping("/StudentTable")
    public String StudentTable(Model model){
        List<student> students = studentMapper.queryStudentList();
        model.addAttribute("students",students);
        return "student";
    }

    @RequestMapping("/deleteStudent")
    public String Delete(@PathParam("sno") String sno){
        studentMapper.deleteStudent(sno);
        return "redirect:/StudentTable";
    }

    @RequestMapping("/addStudent")
    public String Add(
            @PathParam("sno") String sno,
            @PathParam("s_name") String s_name,
            @PathParam("grade") Integer grade,
            @PathParam("s_class") String s_class,
            @PathParam("ID_card") String ID_card,
            @PathParam("Bank_card") String Bank_card,
            @PathParam("team") String team,
            Model model
    ) throws SQLException {
        student student = new student(sno, s_name, grade, s_class, ID_card, Bank_card, team);
        studentMapper.addStudent(student);
        //model.addAttribute("msg", "学号可能重复");
        return "redirect:/StudentTable";
        //return "addstudnet.html";
    }
}
