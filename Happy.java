import org.junit.Test;
import static org.junit.Assert.*;

public class Happy {
	public void showHappiness() {
		System.out.println("extremely happy now!");
		// after merging
		// retain remote changes only
		// except for these comments
		System.out.println("though very hot today");
	}

	@Test
	public void testTrue() {
		assertTrue(true);
	}
}
