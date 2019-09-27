package Repositorio;

import java.util.stream.Stream;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;


public class repoOper7_CB_SG implements ArgumentsProvider 
{
	@Override 
	public Stream<? extends Arguments> provideArguments(ExtensionContext context) 
	{
		return Stream.of(Arguments.of("TOP", "Systems1", "7","G-Sector Gubernamental","56387640"));
	}
}
