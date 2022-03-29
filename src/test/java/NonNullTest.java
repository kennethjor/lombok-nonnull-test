import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class NonNullTest {
	TestObject obj = new TestObject();

	@Test
	public void testNonNullParameter() {
		obj.nonnullParam("not null");
		assertThrows(NullPointerException.class, () -> obj.nonnullParam(null));
	}

	@Test
	public void testNonNullReturn() {
		obj.nonnullReturn("not null");
		assertThrows(NullPointerException.class, () -> obj.nonnullReturn(null));
	}
}
