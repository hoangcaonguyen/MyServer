package nguyen.myserver.Controller;

import nguyen.myserver.Entity.*;
import nguyen.myserver.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/student")
public class StudentController {
    private StudentService studentService;
    @Autowired
    public StudentController(StudentService studentService){this.studentService = studentService;}
    @GetMapping("/id")
    public Optional<Student> findStudentById(@RequestParam Integer id){
        return studentService.findStudentById(id);
    }
    @GetMapping
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }
    @GetMapping("/class_name")
    public List<Student> findStudentByClassname(@RequestParam String class_name){
        return studentService.findStudentByClassname(class_name);
    }
    @GetMapping("/class/id")
    public Optional<ClassRoom> findClassRoomById(@RequestParam Integer class_id){
        return studentService.findClassRoomById(class_id);
    }
    @GetMapping("/class")
    public List<ClassRoom> getAllClass(){
        return studentService.getAllClassRoom();
    }
    @DeleteMapping(value = "/delete/class/{id}")
    public ClassRoom DeleteClass(@PathVariable(name = "id") Integer class_id, ClassRoom classRoom){
        studentService.DeleteClassRoom(classRoom);
        return classRoom;
    }
    @PostMapping(value = "/add/class", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ClassRoom SaveClass(@RequestBody ClassRoom classRoom){
        studentService.SaveClassRoom(classRoom);
        return classRoom;
    }
    @GetMapping("/knowledge/id")
    public Optional<Knowledge> findKnowledgeById(@RequestParam Integer knowledge_id){
        return studentService.findKnowledgeById(knowledge_id);
    }
    @GetMapping("/knowledge")
    public List<Knowledge> getAllKnowledge(){
        return studentService.getAllKnowledge();
    }
    @DeleteMapping(value = "/delete/knowledge/{id}")
    public Knowledge DeleteKnowledge(@PathVariable(name = "id") Integer knowledge_id, Knowledge knowledge){
        studentService.DeleteKnowledge(knowledge);
        return knowledge;
    }
    @PostMapping(value = "/add/knowledge", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Knowledge SaveKnowledge(@RequestBody Knowledge knowledge){
        studentService.SaveKnowledge(knowledge);
        return knowledge;
    }
    @GetMapping("/department")
    public List<Student> findByDepartment(@RequestParam String department){
        return studentService.findByDepartment(department);
    }
}
