
package dao;
import bean.*;
import java.util.*;
public interface StudentDAO{
    public void insert(Student s);
    public void update(Student s);
    public void delete(String iD);
    public Student findByID(long iD);
    public List<Student> findAll();
} 


