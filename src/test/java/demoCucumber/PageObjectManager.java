package demoCucumber;



public class PageObjectManager {
	
	PojoClass loginPage;
		
	public PojoClass getLoginPage() {
		return (loginPage == null) ? loginPage = new PojoClass():loginPage;
	}

}
