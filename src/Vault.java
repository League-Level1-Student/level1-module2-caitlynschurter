import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Vault {
	private int vaultCode = 0;
	
	public int getVaultCode() {
		return vaultCode;
	}
	
	public void setVaultCode(int vaultCode) {
		this.vaultCode = vaultCode;
	}
	
	public boolean tryCode(int code) {
		if(code == vaultCode) {
			return true;
		}
		
		else {
			return false;
		}
	}	
}
