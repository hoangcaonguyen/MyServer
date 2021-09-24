package nguyen.myserver.Repository;
import nguyen.myserver.Entity.ClassRoom;
import nguyen.myserver.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClassRoomRepository extends JpaRepository<ClassRoom, Integer> {
    @Query("select Student from Student ,ClassRoom where (ClassRoom .student_id = Student.id) in (select class_name from  ClassRoom where class_name=: class_name)")
    List<Student> getAllStudentsByClassname(String Class_name);
}
