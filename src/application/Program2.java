package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;

public class Program2 {
    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("===TEST 1: findById===");
        Department department = departmentDao.findById(1);
        System.out.println(department);

        System.out.println();

        System.out.println("===TEST 2: department findAll ===");

        List<Department> list = departmentDao.findAll();

        for (Department dep : list) {
            System.out.println(dep);
        }

        System.out.println();

        System.out.println("===TEST 3: Insert ===");
        Department dep = new Department(8, "Materials");
        departmentDao.insert(dep);

        System.out.println("Inserted! New Id: " + dep.getId());

    }
}
