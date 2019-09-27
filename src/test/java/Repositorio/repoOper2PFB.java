package Repositorio;

import java.util.stream.Stream;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

public class repoOper2PFB implements ArgumentsProvider {

	@Override
	public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
		return Stream.of(Arguments.of("TOP", "Systems1", "2", "0", "0", "858", "IDE", "63935346", "15/12/2022",
				"Rosabal", "Martínez", "Alejandro", " ", "26/04/1991", "858", "0", "C", "prueba", "N", "858", "1",
				"11100", "2226", "5648", "26", "5", "096587423", "097381451", "ANA", "1", "85120", "D", "60000", "S",
				"S", "N", "80000", "N", "N", "N", "N", "N", "N"));
	}
}
