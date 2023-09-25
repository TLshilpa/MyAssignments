package HomeAssiginments;

public class Browser {
	public void launchBrowser(String browserName)
	{
		System.out.println(browserName);
		System.out.println("Browser launched successfully")
	}
	
	public void loadUrl()
	{
		System.out.println("Application url loaded successfully");
	}

	public static void main(String[] args) {
		Browser pro= new Browser();
		pro.launchBrowser("Google");
		pro.loadUrl();
	}
	
	


}

