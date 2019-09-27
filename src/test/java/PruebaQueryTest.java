
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.runners.MethodSorters;
import Ayuda.ConexionBD;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PruebaQueryTest {

	@Test
	public void c_pruebaBD() throws Exception {
		ConexionBD bd = new ConexionBD();
		bd.QUERYBD("SELECT * FROM CLI_PersonasFisicas WHERE NUMEROPERSONAFISICA = 2114");
	}

}