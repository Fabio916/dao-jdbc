package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: department insert ===");
		Department dep = new Department(null, "Movies");
		departmentDao.insert(dep);
		System.out.println("Insert completed!" + dep.getId());
		
		System.out.println("\n=== TEST 2: department update ===");
		dep = new Department(6, "Esports");
		departmentDao.update(dep);
		System.out.println("Update completed!");
		
		/*System.out.println("\n=== TEST 3: department delete ===");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed!");
		*/
		System.out.println("\n=== TEST 4: department findById ===");
		dep = departmentDao.findById(3);
		System.out.println(dep);
		
		System.out.println("\n=== TEST 5: department findAll ===");
		List<Department> list = departmentDao.findAll();
		
		list.forEach(System.out::println);
		
		sc.close();
	}

}
