package scam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import scam.dao.TeacherMapper;
import scam.pojo.student;
import scam.pojo.teacher;

import javax.websocket.server.PathParam;
import java.util.List;

/**
 * @author y'l'l
 */
@Controller
public class TeacherController {
    @Autowired
    private  TeacherMapper teacherMapper;

    @RequestMapping("/updateTeacher")
    public String updateStudent(
            @PathParam("tno") String tno,
            @PathParam("t_name") String t_name,
            @PathParam("phone") String phone,
            @PathParam("e_mail") String e_mail
    ){
        teacherMapper.updateTeacher(new teacher(tno, t_name, phone, e_mail));
        return "redirect:/TeacherTable";
    }

    @RequestMapping("/update_t")
    public String update(
            @PathParam("tno") String tno,
            @PathParam("t_name") String t_name,
            @PathParam("phone") String phone,
            @PathParam("e_mail") String e_mail,
            Model model
    ){
        model.addAttribute("teacher" , new teacher(tno, t_name, phone, e_mail));
        return "updateteacher";
    }

    @RequestMapping("/TeacherTable")
    public String teacherList(Model model){
        List<teacher> teachers = teacherMapper.queryTeacherList();
        model.addAttribute("teachers",teachers);
        return "teacher";
    }

    @RequestMapping("/deleteTeacher")
    public String deleteTeacher(@PathParam("tno") String tno){
        teacherMapper.deleteTeacher(tno);
        return "redirect:/TeacherTable";
    }

    @RequestMapping("/addTeacher")
    public String addTeacher(
        @PathParam("tno") String tno,
        @PathParam("t_name") String t_name,
        @PathParam("phone") String phone,
        @PathParam("e_mail") String e_mail,
        Model model
    ){
        teacher teacher = new teacher(tno, t_name, phone, e_mail);
        teacherMapper.addTeacher(teacher);
        return "redirect:/TeacherTable";
    }
}
