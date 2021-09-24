package nguyen.myserver.Service;

import nguyen.myserver.Entity.ClassRoom;
import nguyen.myserver.Entity.Knowledge;
import nguyen.myserver.Entity.Student;
import nguyen.myserver.Repository.ClassRoomRepository;
import nguyen.myserver.Repository.KnowledgeRepository;
import nguyen.myserver.Repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;
    private final ClassRoomRepository classRoomRepository;
    private final KnowledgeRepository knowledgeRepository;

    public StudentService(StudentRepository studentRepository, ClassRoomRepository classRoomRepository, KnowledgeRepository knowledgeRepository) {
        this.studentRepository = studentRepository;
        this.classRoomRepository = classRoomRepository;
        this.knowledgeRepository = knowledgeRepository;
    }
    public Optional<Student> findStudentById(Integer id){return studentRepository.findById(id);}
    public List<Student> getAllStudent(){return studentRepository.findAll();}
    public List<Student> findStudentByClassname(String class_name){return  classRoomRepository.getAllStudentsByClassname(class_name);}
    public Optional<ClassRoom> findClassRoomById(Integer Class_id){return  classRoomRepository.findById(Class_id);}
    public List<ClassRoom> getAllClassRoom(){return classRoomRepository.findAll();}
    public void SaveClassRoom (ClassRoom classRoom){classRoomRepository.save(classRoom);}
    public void DeleteClassRoom (ClassRoom classRoom){classRoomRepository.delete(classRoom);}
    public Optional<Knowledge> findKnowledgeById (Integer knowledge_id){return knowledgeRepository.findById(knowledge_id);}
    public List<Knowledge> getAllKnowledge(){return knowledgeRepository.findAll();}
    public void SaveKnowledge (Knowledge knowledge){knowledgeRepository.save(knowledge);}
    public void DeleteKnowledge (Knowledge knowledge){knowledgeRepository.delete(knowledge);}
    public List<Student> findByDepartment (String department){return studentRepository.findByDepartment(department);}
}
