package Repositorio;

import java.util.stream.Stream;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;


public class repoOper7_CB_EB implements ArgumentsProvider 
{
	@Override 
	public Stream<? extends Arguments> provideArguments(ExtensionContext context) 
	{
		return Stream.of(Arguments.of("TOP", "Systems1", "7","E-EMPLEADO  BANCO","IDE","63935401","2-RESIDENTE","00","9999","S-Si","N-No"));
	}
}
