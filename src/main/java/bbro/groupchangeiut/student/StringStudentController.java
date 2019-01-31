package bbro.groupchangeiut.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("strStudent")
public class StringStudentController {

    @Autowired
    private StudentService service;

    @GetMapping("all")
    public List<Student> getAllStudent(){
        return service.getAllStudents();
    }

    @GetMapping
    public Student sampleStudent(){
        return new Student();
    }

    @PostMapping
    public void postStudent(@RequestBody String studentString){service.postStudent(new Student(studentString));}

    @PutMapping
    public boolean editStudent(@RequestBody String studentString){
        return service.editStudent(new Student(studentString));
    }

    @DeleteMapping
    public boolean deleteStudent(@RequestBody String studentString){
        return service.deleteStudent(new Student(studentString));
    }

    @GetMapping("allToGroup/{grName}")
    public List<Student> allTG(@PathVariable String grName){
        return service.getAllToGroup(grName);
    }

    @GetMapping("allFromGroup/{grName}")
    public List<Student> allFG(@PathVariable String grName){
        return service.getAllFromGroup(grName);
    }

    @GetMapping("byId/{id}")
    public Student byId(@PathVariable Long id){
        return service.getStudentById(id);
    }

    @GetMapping("byFN/{fullName}")
    public Student byId(@PathVariable String fullName){
        return service.findByFullName(fullName);
    }

    @GetMapping("byIutId/{iutId}")
    public Student byIutId(@PathVariable String iutId){
        return service.findByIutId(iutId);
    }


}
