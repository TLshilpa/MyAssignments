package HomeAssiginments;

public class Browser {

	public static void main(String[] args) {
		Browser pro= new Browser();
		pro.launchBrowser("Browser launched successfully");
		pro.loadUrl();
	}
	
	public void launchBrowser(String browserName)
	{
		System.out.println(browserName);
	}
	
	public void loadUrl()
	{
		System.out.println("Application url loaded successfully");
	}


	}

