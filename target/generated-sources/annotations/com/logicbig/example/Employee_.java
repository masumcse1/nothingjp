package com.logicbig.example;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Employee.class)
public abstract class Employee_ {

	public static volatile SingularAttribute<Employee, String> name;
	public static volatile SingularAttribute<Employee, Long> id;
	public static volatile SingularAttribute<Employee, String> dept;
	public static volatile SingularAttribute<Employee, Double> salary;

	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String DEPT = "dept";
	public static final String SALARY = "salary";

}

