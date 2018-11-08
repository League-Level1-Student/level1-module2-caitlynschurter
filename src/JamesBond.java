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
/*
 * Minions stuart = new Minions("Stuart", 1, "yellow", "");
 * assertEquals("Stuart", stuart.getName()); assertEquals(1, stuart.getEyes());
 * assertEquals("yellow", stuart.getColor());
 * 
 * Minions dave = new Minions("Dave", 2, "yellow", ""); assertEquals("Dave",
 * dave.getName()); assertEquals(2, dave.getEyes()); assertEquals("yellow",
 * dave.getColor()); }
 */