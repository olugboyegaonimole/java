package emailapp;

public class EmailApp {

	public static void main(String[] args) {

		Email em1 = new Email("Emeka", "Ofoegbu");
		
		em1.setMailboxCapacity(4500);
		em1.setAltEmail("olugboyega@gmail.com");
		//System.out.println(em1.getPassword());
		//System.out.println(em1.getAltEmail());
		System.out.println(em1.showInfo());
		
	}

}
