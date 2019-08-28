import org.junit.Test;
import static org.junit.Assert.*;

public class Happy {
	
	public void showHappiness() {
		System.out.println("extremely happy now!");
		System.out.println("though very hot today");
		System.out.println("so hot today!");
		System.out.println("I'm to be cherry-picked.");
		System.out.println("change after cherry-pick.");
	}

	@Test
	public void testTrue() {
		assertTrue(true);
	}
}
