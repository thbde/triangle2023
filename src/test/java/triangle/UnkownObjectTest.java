package triangle;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UnkownObjectTest {

	public static final Triangle triangle = new TriangleThomas();

	@Test
	public void testGetTriangleResultForLengthsNotEqual() {
		final int[] input = { 5, 6, 7, 8 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLengthsNotEqualVariables() {
		final int a = 5;
		final int b = 6;

		final TriangleResult expected = TriangleResult.UNKNOWN;
		final TriangleResult result = triangle.getTriangleResultForLengths(a, b);
		assertThat(result).isEqualTo(expected);
	}


}
