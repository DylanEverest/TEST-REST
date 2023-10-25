import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.List;

import jakarta.ws.rs.GET;

@Path("/Emp")
public class Employee 
{
    String name;
    int status ;
    public Employee( int status,String name )
    {
        this.name=name;
        this.status=status ;
    }

    public Employee() {
    }

    @GET
    @Path("/employ")
    @Produces({MediaType.APPLICATION_JSON})
    public ResponseEmploye[] getEmployee() {
        // Suppose you have a list of employees
        List<Employee> employees = new ArrayList<>();
        
        // Add employee objects to the list
        employees.add(new Employee(1, "Dylan"));
        employees.add(new Employee(2, "Alice"));
        employees.add(new Employee(3, "Bob"));
        
        // Create an array of ResponseEmploye objects to hold the results
        ResponseEmploye[] responseEmployees = new ResponseEmploye[employees.size()];
        
        // Populate the ResponseEmploye array with data from the Employee objects
        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            responseEmployees[i] = new ResponseEmploye(employee.getName(), employee.getStatus());
        }
        
        // Return the array of ResponseEmploye objects
        return responseEmployees;
    }
    

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public int getStatus() 
    {
        return status;
    }

    public void setStatus(int status) 
    {
        this.status = status;
    }

    
    
}

