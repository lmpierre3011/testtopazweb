package Repositorio;

import java.util.stream.Stream;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

public class repoOper3PF implements ArgumentsProvider {

	@Override
	public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
		return Stream.of(Arguments.of("TOP", "Systems1", "3", "858", "63940821", "N-No", "IDE", "Mier", "Pierre", "Liz",
				"Leydi", "30/11/1990", "858", "858", "Montevideo", "10400", "Montevideo", "Florida", "1169", "202",
				"2"));
	}
}