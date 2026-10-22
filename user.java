package java_practice_task1;

public class user {

	private static int staticBlockCount = 0;
    private static int instanceBlockCount = 0;
    private static int constructorCount = 0;

	public user() {
		constructorCount++;
        System.out.println("Constructor executed! (Current Count: " + constructorCount + ")");
	}
	
	static {
		 staticBlockCount++;
	        System.out.println("Static Block executed! (Current Count: " + staticBlockCount + ")");
	}
	
	{
		 instanceBlockCount++;
	        System.out.println("Instance Initialization Block executed! (Current Count: " + instanceBlockCount + ")");
	}
	
	public static void displayTotalCounts() {
        System.out.println("\n--- Final Execution Summary ---");
        System.out.println("Static Block executed total: " + staticBlockCount + " time(s)");
        System.out.println("Instance Block executed total: " + instanceBlockCount + " time(s)");
        System.out.println("Constructor executed total: " + constructorCount + " time(s)");
    }
}
