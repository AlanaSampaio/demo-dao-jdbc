package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.DepartmentDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
		System.out.println("\n==TESTE 1: department insert==");
		Department newDdep = new Department(null, "Phones");
		depDao.insert(newDdep);
		System.out.println("Novo ID: " + newDdep.getId());
		
		System.out.println("\n==TESTE 2: department findById==");
		Department findDepId = depDao.findById(3);
		System.out.println(findDepId);
		
		System.out.println("\n==TESTE 3: department findByAll==");
		List<Department> list = depDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n==TESTE 4: department update==");
		findDepId = depDao.findById(6);
		findDepId.setName("Clothes");
		depDao.update(findDepId);
		System.out.println("Atualização feita com sucesso!");
		
		System.out.println("\n==TEST 5: department delete==");
		System.out.println("Insira o id do funcionário que deseja apagar: ");
		int id = sc.nextInt();
		depDao.deleteById(id);
		System.out.println("Apagado!!");
	}

}
