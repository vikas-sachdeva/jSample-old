package jsample.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import jsample.model.Employee;

@XmlRootElement(name = "employees")
@XmlAccessorType(XmlAccessType.FIELD)
public class Employees {

	private List<Employee> employeeList = new ArrayList<Employee>() {
		private static final long serialVersionUID = 1L;
		{
			add(new Employee(101, "Bob"));
			add(new Employee(102, "Alice"));
		}
	};

	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}

	@Override
	public String toString() {
		return "Employees [employeeList=" + employeeList + "]";
	}

}
