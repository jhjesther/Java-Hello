package edu.global.prj.shape;

private String name;
private int age;

public class Person (String name,int age){
	this.name=name;
	this.age=age;
}
}

@Override
public boolean equals(Object obj) {
	
	Person person = (person)obj;
	
	if((this.name.equals(person.name)&&(this.age==person.age)))
	
	return false;
}

public class ShapMain{
	public static void main(String[] args) {
		Person kim = new Person("홍길동", 35);
		Person park = new Person(new String("홍길동"),35);
	    Person heo = new Person("홍길동", 34);
	
if (kim.equals(heo))
	System.out.println("같은 사람입니다")
	else
		