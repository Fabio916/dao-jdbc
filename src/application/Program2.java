package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: department insert ===");
		Department dep = new Department(null, "Movies");
		departmentDao.insert(dep);
		System.out.println("Insert completed!" + dep.getId());
		
		System.out.println("\n=== TEST 2: department update ===");
		dep = new Department(6, "Esports");
		departmentDao.update(dep);
		System.out.println("Update completed!");
		
	}

}
