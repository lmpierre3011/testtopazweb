package Repositorio;

import java.util.stream.Stream;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

public class repoOper2PJB implements ArgumentsProvider {

	@Override
	public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
		return Stream.of(Arguments.of("TOP", "Systems1", "2", "2", "0", "858", "RUC", "91042619215", "04/05/2016", "N",
				"La Mia", "26/04/2014", "A", "king", "yo", "ADM", "858", "1", "11100", "2226", "5648", "26", "5",
				"096587423", "097381451", "80900", "15/03/2015", "160", "16/02/2016", "N", "yo", "2", "N", "50000", "N",
				"N", "N", "N", "2", "N", "N"));
		}
}
