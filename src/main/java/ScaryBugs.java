
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class ScaryBugs {
	public static final DateFormat dateFormat = new SimpleDateFormat("yyy");

	private String checkStrValue = null;

	public ScaryBugs() {
		this.checkStrValue = "SomeValue";
	}

	private String executeSomeConditions() {
		if ("SomeValue".equals(this.checkStrValue)) {
			return "cat";
		} else if ("SomeValue".equals(this.checkStrValue)) {
			return "dog";
		}
		return "cow";
	}

	private static void incorrectAssignmentInIfCondition() {
		boolean value = false;
		if (value = true) {
			System.out.println("true");
			// do Something
		} else {
			System.out.println("false");
		}
		System.out.println(value);
	}

	public static void main(final String[] args) {
		new ScaryBugs().executeSomeConditions();
		incorrectAssignmentInIfCondition();
	}
}
