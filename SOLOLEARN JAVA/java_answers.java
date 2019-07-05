
class Bobomi{
	
	public static void main(String[] args){

		System.out.println("haba!!");

	}
}



//package
//class
//stream
//method



// single line comment


/* single line comment



/* multi 
line 
comment*/




/* 

// single line comment
 
*/



/** documentation comment*/



/** documentation 
comment*/




/**************************************
documentation comment, create a "box" around the comment in the source code
**************************************/





class MyVariables{
	
	public static void main(String[] args){

		String name = "bob";
		int age = 45;
		double score = 6.7;
		char team = 'A';
		boolean alive = true;
	}
}



class MyMultipleDeclarations{
	
	public static void main(String[] args){

		int age1 = 34, age2 = 456;
		double score1 = 8.0, score345 = 0;
	}
}



//naming convention for variables

//never use $
//never begin with _
//if only one word use lower case throughout
//if more than one word start every subsequent word with Capital letter
//if a constant CAPITALISE every letter and separate subsequent words with _


class MathOperators{
	
	public static void main(String[] args){

		int a = 10 + 9;
		int b = 10 - 9;
		int c = 10 * 9;
		double d = 10 / 9;
		int e = 10 % 9;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);

	}
	
}



class Addition{
	
	public static void main(String[] args){

		int a = 10 + 9;
		int b = 10 + a;
		int c = a + b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}



class Multiplication{

	public static void main(String[] args){

		int a = 10 * 9;
		int b = 10 * a;
		int c = a * b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}




class IntDivision{

	public static void main(String[] args){

		int a = 10 / 9;
		int b = 10 / a;
		int c = a / b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}






class DoubleDivision{

	public static void main(String[] args){

		double a = 10 / 9;
		double b = 10 / a;
		double c = a / b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}






class Modulo{

	public static void main(String[] args){

		int a = 1 % 9;
		int b = 0 % 9;
		System.out.println(a);
		System.out.println(b);
     	
     	double c = 1 % 9;
        double d = 0 % 9;
        System.out.println(c);
        System.out.println(d);
	}
}


class Increment{

	public static void main(String[] args) {

		int a = 4;
		++a;
		System.out.println(a);
		
	}
}




class Decrement{

	public static void main(String[] args) {

		int a = 4;
		--a;
		System.out.println(a);
		
	}
}




class Prefix{

	public static void main(String[] args) {

		int a = 4;
		System.out.println(--a);
		
	}
}



class Postfix{

	public static void main(String[] args) {

		int a = 4;
		System.out.println(a--);
		
	}
}




class Strings{

	public static void main(String[] args) {

		String a = "boy";
		String b = "george";		
		System.out.println(a);
		System.out.println(b);
		String c = a + " " + b + " " + "is " + "here";
		System.out.println(c);

	}
}



class Characters{

	public static void main(String[] args) {

		char a = 'b';
		char b = 'g';		
		System.out.println(a);
		System.out.println(b);
		String c = a + " " + b + " " + "is " + "here";
		System.out.println(c);

	}
}


import java.util.Scanner;

class TakeLine{

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);

		System.out.println(userInput.nextLine());
	}
}




import java.util.Scanner;

class TakeWord{ //takes only the first word entered by user

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);

		System.out.println(userInput.next());

	}
}




import java.util.Scanner;

class TakeByte{

	public static void main(String[] args) {
		 
		 Scanner userInput = new Scanner(System.in);

		 System.out.println(userInput.nextByte());
	}
}




import java.util.Scanner;

class TakeShort{

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);

		System.out.println(userInput.nextShort());

	}
}




import java.util.Scanner;

class TakeInt{

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);

		System.out.println(userInput.nextInt());

	}
}



import java.util.Scanner;

class TakeLong{

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);

		System.out.println(userInput.nextLong());
	}
}



//CONDITIONALS AND LOOPS

	//CONDITIONAL STATEMENTS
	//if statement

class IfStatement{

	public static void main(String[] args) {
		
		int age = 78;

		if (age < 568) {
			
			System.out.println("yes");
		}
	}
}
	
	//if else statement

class IfElseStatement{

	public static void main(String[] args) {
		
		int age = 8;

		if (age < 7) {
			
			System.out.println("yes");

		} else {

			System.out.println("no");
		}
	}
}


	//NESTED IF STATEMENTS

class NestedIf{

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);

		int age = userInput.nextInt();

		//age = 67
		
		if (age < 68){

			if (age > 56) {
				
				System.out.println("enter");

			} else {

				System.out.println("denied");
			
			}

		} else {

			System.out.println("error");

		}
	
	}

}

	//ELSE IF STATEMENT

class ElseIf{

	public static void main(String[] args) {
		
		System.out.println("user must be between 16 and 100 years old");

		System.out.println("enter age please");

		Scanner userInput = new Scanner(System.in);

		int age = userInput.nextInt();

		if (age < 16) {

			System.out.println("young");
		
		} else if (age > 100) {
			
			System.out.println("old");

		} else if (age == 45) {

			System.out.println("perfect");
			
		}

	}

}

	//LOGICAL STATEMENTS


//import java.util.Scanner;

class LogicalAnd {

	public static void main(String[] args) {
		
		System.out.println("enter first number");
		Scanner userInput = new Scanner(System.in);
		int a = userInput.nextInt();


		System.out.println("enter second number");
		Scanner userInput2 = new Scanner(System.in);
		int b = userInput2.nextInt();

		if (a < 34 && b > 89) {

			System.out.println("yes");

		} else {

			System.out.println("no");

		}
	}
}



class LogicalOr{

	public static void main(String[] args) {
		
		System.out.println("age 1:");
		Scanner userInput = new Scanner(System.in);
		int age = userInput.nextInt();


		System.out.println("age 2:");
		Scanner userInput2 = new Scanner(System.in);
		int age2 = userInput2.nextInt();


		if (age < 12 || age2 > 678) {

			System.out.println("yes");
			
		} else if (age > 5 || age2 < 0) {
			
			System.out.println("ok");

		}
	}
}


class LogicalNot{

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		int age = userInput.nextInt();

		if (!(age < 78)) {

			System.out.println("no");
			
		} else if (!(age > 800)) {
			
			System.out.println("yes");

		}

	}

}



	//THE SWITCH STATEMENT

class SwitchStatement {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);

		System.out.println("age 1");
		int age = userInput.nextInt();

		switch(age) {

			case 2:
				System.out.println("yes");
				break;

			case 789:
				System.out.println("no");
				break;

			default:
				System.out.println("unknown");

		}
	}
}


class SwitchStatement2 { /* this class is written to show that your switch statement will work 
	regardless of how you tabulate the case and default statements contained in your switch statement */

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("age");
        int age = userInput.nextInt();

        switch(age) {

        case 2:
          case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("yes");
                break;

            case 789:
                System.out.println("no");
                break;

                case 15:
                    System.out.println("works");
                    break;
                    default: System.out.println("unknown");

        }
    }
}

	//WHILE LOOPS


class WhileLoop{

	public static void main(String[] args) {
		
		int d = 45;

		while (d > 0) {

			System.out.println(d);
			d = d/2;
		}
		System.out.println("loop end");

	}
}



	//FOR LOOPS

class ForLoop{

	public static void main(String[] args) {
		
		for (int u = 0; u>= 89; u = u*u) {

			System.out.println(u);
			
		}

		System.out.println("end");
	}
	
}



	//DO WHILE LOOPS

class DoWhile {

	public static void main(String[] args) {
		
		int y = 90;

		do {

			System.out.println(y);
			y--;
		
		} while(y > 0);
	}
}


class DoWhile2{

	public static void main(String[] args) {
		
		int i = 90;

		do{

			System.out.println(i);
			i--;
		
		} while(i < 0);
	}
}


class BreakStatement{

	public static void main(String[] args) {
		
		int e = 78;

		while (e > 23){

			System.out.println(e);

			if(e == 45){
				break;
			}

			e--;
		}
	}
}


class ContinueStatement{

	public static void main(String[] args) {
		
		int u = 40;

		while(u > 2){

			u--;

			if (u == 22) {
				
				continue;

			}

			System.out.println(u);

		}
	}
}





//ARRAYS

//create

class ArrayPractice{

	public static void main(String[] args) {
		
		int[] myarray = new int[4];

		myarray[0] = 1464;
		myarray[1] = 1;
		myarray[2] = 164;
		myarray[3] = 34351;



		System.out.println(myarray[0]);
        System.out.println(myarray[1]);
        System.out.println(myarray[2]);
        System.out.println(myarray[3]);


	}
}


//initialise

class ArrayP2{

	public static void main(String[] args) {
		
		int[] myarray = {4,56,7,9,334};

		System.out.println(myarray[0]);
		System.out.println(myarray[1]);
		System.out.println(myarray[2]);
		System.out.println(myarray[3]);
		System.out.println(myarray[4]);

	}
}


//find length
class ArrayLength{

	public static void main(String[] args) {
		
		int[] myarray = new int[6];

		System.out.println(myarray.length);

	}
}


//sum up
class SumArray{

	public static void main(String[] args) {
		
		int[] myarray = {56, 8, 972723, 1, 32};

		int sum  = 0;

		for (int x=0; x < myarray.length ;x++ ) { //remember to declare the type (int) of your counter 'x'
			
			sum += myarray[x];
		}

		System.out.println(sum);

	}
}



class SumArray2{

	public static void main(String[] args) {
		
		int[] myarray = {0, 555, 465, 1, 6776677, 5, 98};
		int sum = 0;

		for (int d = 0; d < myarray.length; d++) {
			
			sum += myarray[d];
		}

		System.out.println(sum);

	}
}

//	enhanced for ('for each') loop
class EnhancedFor{

	public static void main(String[] args) {
		
		int[] myarray = {6, 98, 0, 44455, 23, 543};

		for (int u: myarray) {

			System.out.println(u);
			
		}
	}
}


//	enhanced for ('for each') loop
class ForEach{

	public static void main(String[] args) {
		
		//String[] myarray = {'q', 'u', 'e', 'r', 't', 'y'}; wont work, single quotes reserved for characters

        String[] myarray = {"q", "u", "e", "r", "t", "y"};


		for(String s: myarray){

			System.out.println(s);
		}
	}
}

class ForEach22{

	public static void main(String[] args) {
		
		//int[] myarray = new int(6); wrong 

		int[] myarray = new int[67];

		System.out.println(myarray.length);

		//int[] myarray = {3,2,334,8}; wrong, myarray is already defined

		System.out.println(myarray[3]);

	}
}



class Enhanced22{

	public static void main(String[] args) {
		
		String[] myarray = {"yak", "yam", "yim", "vim", "yes"};

		for(String u: myarray){

			System.out.println(u);
		}
	}
}


//multidimensional arrays

class Multi2Step{

	public static void main(String[] args) {
		
		int[][]myarray = {{44,5,6,7,8}, {0,9,45,6554,1}, {5,8,6}};

		System.out.println(myarray[1][1]);

		//myarray[1][1] = 98724723988923; wrong, too long to be int

		myarray[1][1] = 988923;

		System.out.println(myarray[1][1]);
	}
}


class Multi4Step{

    public static void main(String[] args) {

        int[][][][] myarray = {{{{8}, {4,5,6}}, {}}, {}, {}};

        System.out.println(myarray[0][0][1][2]);

        System.out.println(myarray[0][1]);//will print gibberish: referencing an integer which is not at the fourth level of an array hierarchy

        System.out.println(myarray[1]);//will print gibberish: referencing an integer which is not at the fourth level of an array hierarchy


    }
}

class Multi4Step2 {

	public static void main(String[] args) {
		

		int[][][][] myarray = {{{{45,5}}}, {{{76,12,900}}}, {{{77,0,4455}}}, {{{3,56,7}}}};

		System.out.println(myarray[0][0][0][1]);
	}
}


//CLASSES AND OBJECTS

//the attributes and behaviour of an object are defined by the object's class


//create and call a method from within its source class
class MyClass{

	//create method
	static void sayHello(){

		System.out.println("hello");
	
	}

	public static void main(String[] args) {
		
		//call method
		sayHello();

	}

}


//call a method from an external class by first importing the method
import static MyPackage.MyClass.sayHello; //import static package.class.method;

public class Test{

    public static void main(String[] args){

        sayHello();

    }

}



//call a method from an external class by prefixing method call with name of source class
public class Test{

    public static void main(String[] args){

        MyClass.sayHello();

    }

}



//multiple method calls
class MyClass {

	public static void main(String[] args) {
		
		hello();
		hello();
		hello();
		hello();
	}

	static void hello(){

		System.out.println("whassup");
	}

}


//specifying method parameters
class MyClass{

	public static void main(String[] args) {
		
		hello("david");
		hello("bosun");
	}

	static void hello(String name){

		System.out.println("hello " + name);
	}
}


//specifying multiple parameters
class MyClass{

	public static void main(String[] args) {
		
		hello("David", "school");
	}

	//static void hello(String name, place){ //wont work, variable type not defined for place

	static void hello(String name, String place){

		System.out.println("hello " + name + "! " + "Welcome to " + place + "!")
	}
}



//parameters for math operations
class MyClass{

	public static void main(String[] args) {
		
		System.out.println("enter first number");
		Scanner userInput = new Scanner(System.in);
		int i = userInput.nextInt();

		System.out.println("enter second number");
		Scanner userInput2 = new Scanner(System.in);
		int j = userInput2.nextInt();


		add(i, j);
	}

	static void add(int a, int b){

		System.out.println(a + b);
	}
}



//specifying multiple parameters
class MyClass {

	public static void main(String[] args) {
		
		System.out.println("name");
		Scanner userInput = new Scanner(System.in);
		String name = userInput.nextLine();

		System.out.println("age");
		Scanner userInput2 = new Scanner(System.in);
		int age = userInput2.nextInt();

		salute(name, age);


	}

	static void salute(String name, int age){

		System.out.println("your name is " + name + ". You are " + age + " years old.");
	}
}



//the return keyword and the return type
class MyClass{

	public static void main(String[] args) {
		
		int x = add(6, 7);

		System.out.println(x);

	}

	//static returnType methodName(){
	//}

	static int add(int a, int b){

		return a + b;

	}
}


//the return keyword and the return type
class MyClass{

	public static void main(String[] args) {
		
		int y = multiply(u,v,w);

		System.out.println(y);
	}


	static int multiply(int a, int b, int c){

		return a*b*c;

	}
}


//the return keyword and the return type
class MyClass {

	public static void main(String[] args) {
		
		System.out.println("please enter first name");
		Scanner userInput = new Scanner (System.in);
		String a = userInput.nextLine();


		System.out.println("please enter second name");
		Scanner userInput2 = new Scanner (System.in);
		String b = userInput2.nextLine();


		System.out.println("please enter third name");
		Scanner userInput3 = new Scanner (System.in);
		String c = userInput3.nextLine();


		String r = join(a,b,c);

		System.out.println(r);
	}

	static String join(String a, String b, String c){

		//System.out.println("This book belongs to " + a + ", " + b + ", and " + c + ".");  wrong, use return keyword
		return "This book belongs to " + a + ", " + b + ", and " + c + ".";
	}
}


//the return keyword and the return type
class MyClass{

	static String larger(int a, int b){

		if (a>b) {
			return a + " is greater than " + b;			
		} else if (b>a) {
			return b + " is greater than " + a;
		} else {
			return a + " and " + b + " are equal";
		}
	}

	public static void main(String[] args) {
		
		System.out.println("first number");
		Scanner userInput = new Scanner(System.in);
		int a = userInput.nextInt();

		System.out.println("second number");
		Scanner userInput2 = new Scanner(System.in);
		int b = userInput2.nextInt();

		String c = larger(a, b);

		System.out.println(c);

	}
}



//CREATING CLASSES AND OBJECTS


//creating classes
public class FighterJet{

	//attributes
	int maxSpeed = 56;
	String color = "red";
	String manufacturer = "boeing";
	double fuelCapacity = 678.9;
	int weaponsCapacity = 15000;
	String weaponsSystem = "haliburton";


	//methods
	void sound(){

		System.out.println("whoosh");

	}
}


//creating classes
public class Animal{

	String hair = "brown";


	public void bark(){
	//OR void bark(){

		System.out.println("woof!");

	}
}


//creating objects
class MyClass {

    public static void main(String[] args){

        Animal animal1 = new Animal();
        Animal animal2 = new Animal();

        animal1.bark();

        String.out.println(animal2.hair);



        FighterJet jet2 = new FighterJet();
        FighterJet jet1 = new FighterJet();

        jet1.sound();
        System.out.println(jet1.color);
        System.out.println(jet1.fuelCapacity);
        System.out.println(jet1.manufacturer);

        System.out.println(jet2.maxSpeed);
        System.out.println(jet2.weaponsCapacity);
        System.out.println(jet2.weaponsSystem);

    }

}




//access modifiers - CLASSES - public

public class Animal{

	//accessible by any other class anywhere

}



//access modifiers - CLASSES - default

class Animal{

	//accessible only by classes in the same package

}




//access modifiers - attributes and methods - public

class Animal{

	public bark(){

		//accessible by any other class anywhere

	}

}



//access modifiers - attributes and methods - default

class Animal{

	bark(){

		//accessible only by classes in the same package

	}

}



//access modifiers - attributes and methods - protected

class Animal{

	protected bark(){

		//a subclass can access protected stuff belonging to the superclass

	}

}



//access modifiers - attributes and methods - private

class Animal{

	private bark(){

		//accessible only from this class

	}

}




//GETTERS AND SETTERS

//getters and setters

//your setter must assign a value to one of your private attributes (this.attribute = value;) the keyword 'this' refers to an object you've created
//the value may be literal or may be passed as a variable argument to the setter method
//your setter returns nothing and so return type is 'void'


//your getter must return your private attribute (return attribute;)
//your getter must have the return type of your class attribute


//using an object of your class, you may either
//call your getters and setters from within their source class, or
//you may call your getters and setters from an external class




//calling getters and setters from within their source class
class MySampleClass {

    private int speed;



    //setter
    public void setSpeed(){
        this.speed = 8767; //the keyword 'this' refers to the name of an object of the class
    }
    //getter
    public int getSpeed(){
        return speed;
    }



    public static void main(String[] args){

        MySampleClass m2 = new MySampleClass();

        m2.setSpeed();

        System.out.println(m2.getSpeed());

    }

}



//example 1 - creating getters and setters in the source class 
class Animal{

	String name = "lion";
	String age = 78;
	String gender = "male";
	private int children;
	private int wives;


	void sound(){
		System.out.println("roar");
	}

	void movement(){
		System.out.println("run");
	}

	//setter
	public void setChildren(int number){
		this.children = number;
	}

	//setter
	public void setWives(int number){
		this.wives = number
	}

	//getter
	public int getChildren(){
		return children;
	}

	//getter
	public int getWives(){
		return wives;
	}
}


//example 1 - calling getters and setters from the external class
class MyClass{

	public static void main(String[] args) {
		
		Animal animal1 = new Animal();
		Animal animal2 = new Animal();

		animal1.sound();
		animal2.movement();

		System.out.println(animal2.name);
		System.out.println(animal1.gender);


		animal1.setWives(74);

		System.out.println(animal1.getWives());
	}
}



//example 2 - creating getters and setters in the source class (Animal class)
class Animal{

    String name = "lion";
    int age = 78;
    String gender = "male";
    private int children;
    private int wives;
    private String tvChannel;
    private double weight;


    void sound(){
        System.out.println("roar");
    }

    void movement(){
        System.out.println("run");
    }



    //setter
    public void setChildren(int number){
        this.children = number;
    }
    //getter
    public int getChildren(){
        return children;
    }




    //setter
    public void setWives(int number){
        this.wives = number;
    }
    //getter
    public int getWives(){
        return wives;
    }




    //setter
    public void setTvChannel(String tv){
        this.tvChannel = tv;
    }
    //getter
    public String getTvChannel(){
        return tvChannel;
    }




    //setter
    public void setWeight(double w){
        this.weight = w;
    }
    //getter
    public double getWeight(){
        return weight;
    }

}



//example 2 - creating getters and setters in the source class (Fighterjet class)
public class FighterJet{

    int maxSpeed = 56;
    String color = "red";
    String manufacturer = "boeing";
    double fuelCapacity = 678.9;
    int weaponsCapacity = 15000;
    String weaponsSystem = "haliburton";


    private int wheels;
    private String windows;

    void sound(){
        System.out.println("whoosh");
    }


    void engine(){
        System.out.println("rolls royce");
    }



    //setter
    public void setWheels(int w){
        this.wheels = w;
    }
    //getter
    public int getWheels(){
        return wheels;
    }
    
    
    
    //setter
    public void setWindows(String window){
        this.windows = window;
    }
    //getter
    public String getWindows(){
        return windows;
    }
}



//example 2 - creating getters and setters in the source class (Lagos class)
public class Lagos {

    int population = 8908908;
    String nickname = "eko akete ilu ogbon!";
    String capital = "ikeja";
    private int gdp;
    private String stateGovernor;


    void chant(){
        System.out.println("shine your eye!");
    }

    void LGAs(){
        System.out.println(17);
    }



    //setter
    public void setGdp(int gdpValue){
        this.gdp = gdpValue;
    }
    //getter
    public int getGdp(){
        return gdp;
    }
	
	
	
    //setter
    public void setStateGovernor(String governorName){
        this.stateGovernor = governorName;
    }
    //getter
    public String getStateGovernor(){
        return stateGovernor;
    }

}


//example 2 - calling getters and setters from the external class
class MyClass{

    public static void main(String[] args) {

        Animal animal1 = new Animal();
        Animal animal2 = new Animal();
        Animal animal3 = new Animal();
        Animal animal4 = new Animal();
        FighterJet fjet1 = new FighterJet();
        FighterJet fjet2 = new FighterJet();

        animal1.sound();
        animal2.movement();

        fjet1.engine();
        fjet2.sound();


        System.out.println(animal2.name);
        System.out.println(animal1.gender);


        animal1.setWives(74);
        System.out.println(animal1.getWives());


        animal2.setChildren(899);
        System.out.println(animal2.getChildren());


        animal3.setTvChannel("bcc and cnn");
        System.out.println(animal3.getTvChannel());


        animal4.setWeight(6);
        System.out.println(animal4.getWeight());


        animal1.setWeight(67.456);
        System.out.println(animal1.getWeight());

        fjet1.setWheels(67);;
        System.out.println(fjet1.getWheels());

        fjet2.setWindows("Debenhams");
        System.out.println(fjet2.getWindows());
	    
	    
	
        Lagos lag1 = new Lagos();

        lag1.chant();
        lag1.LGAs();


        System.out.println(lag1.capital);

        lag1.setGdp(79897);
        System.out.println(lag1.getGdp());
	   
		lag23.setGdp(6);
        System.out.println(lag23.getGdp());

        lag23.setStateGovernor("otedola");
        System.out.println(lag23.getStateGovernor());


    }
}

//CONSTRUCTORS

//constructor without arguments
class Bats{

    private String sound;


    //constructor
    Bats(){

        sound = "shriek"; //assign a literal to your attribute
    }

    public static void main(String[] args){
        Bats b1 = new Bats();

        System.out.println(b1.sound);
    }
}



//passing arguments to constructors - example 1
class Bats{

    private String color;


    //constructor
    Bats(String colorOfBat){
        
        color = colorOfBat; //assign, to your attribute, the argument that was passed in
    
    }


    //main method
    public static void main(String[] args){
        
        Bats b67 = new Bats("mauve and yellow");

        System.out.println(b67.color);
        
    }

}



//passing arguments to constructors - example 2
public class Mice {

    private int noOfChildren;


    Mice(int enterChildren){

        noOfChildren = enterChildren; //assign, to your attribute, the argument that was passed in

    }


    public static void main(String[] args){

        Mice m1 = new Mice(789);

        System.out.println(m1.noOfChildren);
    }
}



//calling this.setter within constructors - example 1 (this.setter takes either literal or variable argument)
public class Mice{

    private String color;



    //constructor1
    Mice(){
        this.setColor("green"); //pass a literal to this. your setter
    }



    //constructor2
    Mice(String c){
        this.setColor(c); //pass the argument (that was passed in) to this. your setter
    }



    //setter
    public void setColor(String colorOfMice){
        this.color = colorOfMice;
    }



    //main method
    public static void main(String[] args){

        Mice m8 = new Mice();
        System.out.println(m8.color);

        Mice m11 = new Mice("yellow and blue");
        System.out.println(m11.color);

    }
}


//calling this.setter within constructors - example 2 (this.setter takes either literal or variable argument)
class cat{


    private String name;
    private String color;
    private int children;


    //constructor without parameters
    cat(){
        name = "aj";
        this.setChildren(67009); //go to setChildren, call it and pass argument 67009 to it
    }



    //consructor with parameters
    cat(String c){
        name = "isa";
        color = c;
    }



    //constructor, takes no argument, literal passed to setter

    //cat(){ 
        
        //won't work, because constructor 'cat' already defined

    //}



    //constructor, takes variable argument, passes to setter
    cat(int howmany){
        this.setChildren(howmany); //go to setChildren, call it and pass argument howmany to it
    }



    //setter
    public void setChildren(int mykids){
        this.children = mykids;
    }


    public static void main(String[] args){

        cat c1 = new  cat(); //what you pass to the constructor determines which of the 3 constructors is called
        System.out.println("c1's name is " + c1.name);


        cat c2 = new cat("pink"); //what you pass to the constructor determines which of the 3 constructors is called
        System.out.println("c2's color is " + c2.color);
        System.out.println("c2's name is " + c2.name);


        cat c3 = new cat(78); //what you pass to the constructor determines which of the 3 constructors is called
        System.out.println("c3 has " + c3.children + " children");


        cat c4 = new cat(); //what you pass to the constructor determines which of the 3 constructors is called
        System.out.println("c4 has " + c4.children + " children");

    }
}



//calling this.setter within constructors - example 3 (this.setter takes either literal or variable argument)
class Jet{

    private String make;
    private String model;
    private int speed;
    private double fuelCapacity;


    //constructor without parameter
    Jet(){
        make = "Boeing";
        this.setSpeed(67000);
    }


    //constructor with parameter
    Jet(String mymodel){
        model = mymodel;
    }


	//constructor with setter (constructor takes in no arguments but passes a literal to the setter)	
	//Jet(){

        //won't work, because constructor 'Jet' already defined

    //}


    //constructor with setter (constructor takes in a variable argument and passes it to the setter)
    Jet(int myspeed){
        this.setSpeed(myspeed);
    }


    //setter
    public void setSpeed(int myspeed){
        this.speed = myspeed;
    }


    public static void main(String[] a){

        Jet j1 = new Jet();
        System.out.println(j1.make);
        System.out.println(j1.speed);


        Jet j2 = new Jet(45646);
        System.out.println(j2.speed);


        Jet j3 = new Jet("yellow");
        System.out.println(j3.model);
        

        Jet j4 = new Jet();
        System.out.println(j4.speed);

    }
}


//manipulating variables using constructors - creating the source class
class Bus{

	//varible to be manipulated
	public static int COUNT = 0;


	//constructor
	Bus(){ //every time this constructor is called, it will increment the static variable COUNT, by 1

		COUNT++;

	}

}
//manipulating variables using constructors - calling constructor from external class
public class Test{

    public static void main(String[] args) {

        System.out.println(Bus.COUNT);

        Bus b1 =  new Bus ();

        System.out.println(Bus.COUNT);

        Bus b2 =  new Bus ();

        System.out.println(Bus.COUNT);
    }
}


//VALUE AND REFERENCE TYPES

//primitive type
//in example 1 below, y is a primitive type
public class Test {


    public static void main(String[] args){

        int y = 90; //y is a primitive type

        System.out.println(addOne(y));
    }

    static int addOne(int myNum){

        myNum = myNum + 1;
        return myNum;
    }
}



//reference type
//in the example below, p1 is a reference type
class Person{

	private int age;

	//setter
	public void setAge(int myage){
		this.age = myage;
	}
	//getter
	public int getAge(){
		return age;
	}

}
public class Test{

	public static void main(String[] args) {
		
		Person p1 = new Person(); //p1 is a reference type

		p1.setAge(90);

		System.out.println(p1.getAge());

		celebrateBirthday(p1);

		System.out.println(p1.getAge());


	}

	static void celebrateBirthday(Person p){
		p.setAge(p.getAge() + 5);
	}
}


//primitive type
//in example 2 below, y is a primitive type
class test{

	public static void main(String[] args) {
		
		int a = 78;

		System.out.println(a);

		int b = addOne(a);

		System.out.println(b);

	}

	static int addOne(int myint){

		myint = myint + 1;
		return myint;
	}
}



//THE MATH CLASS

//the math class
//the math class
class MathClass{

    public static void main(String[] args) {

        int a = Math.abs(-788);
        double b = Math.pow(35, 2);
        double c = Math.ceil(6.049494);
        double d = Math.floor(4.999999999);
        double e = Math.max(5.098098, 3.09809890);
        double f = Math.min(-84847, 233);
        double g = Math.sqrt(7899955);
        double h = Math.sin(0.52359878);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);



    }
}



//STATIC


//IMPLICATIONS
//what are the implications of making an item static
//if you make an item static, you have two options for accessing it:
// - call it directly, or
// - create an object of its class, call it using the object

//what are the implications of not making an item static
//if you don't make an item static, you must call it using an object of its class




//GENERAL RULES
//a static item belongs to the class
//it doesn't belong to any object of the class
//only one instance of a static item exists
//a static item will be shared by all objects, whether you create many objects, or you create none




//EXAMPLES OF STATIC AND NON-STATIC ENTITIES
//1. The class name and any other identifiers that can stand in the place of the object are static entities
//2. 'this.' and any other identifiers that can stand in the place of the object are non-static entities
//3. private fields (private attributes, private methods) are non-static







//if you make an item static, you have two options for accessing it:
// - call it directly, or
// - create an object of its class, call it using the object
class Test{

	static void hello(){
		System.out.println("hello");
	}


	public static void main(String[] args) {
		
		hello();// call it directly


		Test t1 = new Test();
		t1.hello();// create an object of its class, call it using the object
	}

}


//if you don't make an item static, you must call it using an object of its class
class Test{

	void hello(){
		System.out.println("hello");
	}


	public static void main(String[] args) {
		//hello(); //this will yield an error

		Test t1 = new Test();
		t1.hello();
	}

}





//examples of static variables
class Warrior{

	public static int swords = 8; //this is a static variable - it can be called either by the class or by an object of the class

}
class Test{

	public static void main(String[] args) {
		
		System.out.println(Warrior.swords); //here the static variable is called by the class

		Warrior w1 = new Warrior();

		System.out.println(w1.swords); //here the static variable is called by an object of the class

	}
}




//examples of static methods
class Cat{

	public static void meow(){  //this is a static method - it can be called either by the class or by an object of the class

		System.out.println("meow");

	}
}
class Test{

	public static void main(String[] args) {
		
		Cat.meow(); //here the static method is called by the class

		Cat c1 = new Cat();

		c1.meow(); //here the static method is called by an object of the class
	}
}





//FINAL

//final - keyword used for turning a variable into a constant - you cant assign a new value to the variable

class Bird{

	public static final int wings = 2; //'wings' is a constant - you can't assign a new value to it
	public static int feathers = 89;

}

class Test{

    public static void main(String[] args) {

        Bird.feathers = 78;

        System.out.println(Bird.feathers);

        //Bird.wings = 7; //error, cannot assign a value to final variable 'wings'

        System.out.println(Bird.wings);
    }
}




//PACKAGES

//we need to import the classes that are inside a package to be able to use them in another package
package Vehicles; //source package

public class MyVehicles {

    public static void main(String[] args){

        System.out.println(Bus.COUNT);

        Bus b1 = new Bus();

        System.out.println(Bus.COUNT);

        Bus.COUNT = 67;

        System.out.println(Bus.COUNT);

        Bus b2 = new Bus();

        System.out.println(Bus.COUNT);
    }
}






package Vehicles; //the source package

//class Bus{ //not public, can't be accessed from another package

public class Bus{ //public, can be accessed from another package

    
    //a static variable
    public static int COUNT = 0; //this is a static variable, and so it can be called either by the class or by an object of the class, whether or not you create objects of the class

    
    
    //a constructor, this is called every time an object of this class is created
    Bus(){ 

        COUNT++; //every time this constructor is called, it will increment the static variable COUNT, by 1
    }
}




package Animals; //destination package

class Animal{

    //attributes
    String color = "red";
    String hair = "brown";


    //private attributes
    private String name;
    private int noOfChildren;
    private boolean caged;


    //methods
    void bark(){

        System.out.println("woofies");
    }



    //setter
    public void setName(String nameOfAnimal){
        this.name = nameOfAnimal;
    }
    //getter
    public String getName(){
        return name;
    }



    //setter
    public void setCaged(boolean ifcaged){
        this.caged = ifcaged;
    }
    //getter
    public boolean getCaged(){
        return caged;
    }


    public static void main(String[] args){
        Animal a34 = new Animal();

        a34.setCaged(true);

        System.out.println(a34.getCaged());
    }


}




package Animals; //destination package

import Vehicles.Bus; //importing from the source package

class MyAnimals {


    public static void main(String[]  args){

        Animal a1 = new Animal();
        Animal a3789 = new Animal();



        System.out.println(a1.hair);
        System.out.println(a1.color);



        a1.bark();
        
        

        a1.setName("fish");
        System.out.println(a1.getName());



        a1.setCaged(false);
        System.out.println(a1.getCaged());

        

        a3789.setCaged(true);
        System.out.println(a3789.getCaged());

    }


}





//MORE ON CLASSES






//EXCEPTIONS, LISTS, THREADS AND FILES
