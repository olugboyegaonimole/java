class Animal{

	private String name;

	Animal(){

		this.name = "yellow";
	}

}


class test{

	public static void main(String[] args) {
		
		Animal a1 = new Animal();

		System.out.println(a1.name);
	}
}