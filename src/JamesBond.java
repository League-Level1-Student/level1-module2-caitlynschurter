import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class JamesBond {
	@Test
	public void findCode() {
		Vault v = new Vault();
		v.setVaultCode(665);
		v.tryCode(556);
		assertEquals(false, v.tryCode(556));
		assertEquals(true, v.tryCode(665));
	}
}
