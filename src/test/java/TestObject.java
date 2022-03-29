import lombok.NonNull;

public class TestObject {
	public String nonnullParam(@NonNull String in) {
		return in;
	}

	@NonNull
	public String nonnullReturn(String in) {
		return in;
	}
}
