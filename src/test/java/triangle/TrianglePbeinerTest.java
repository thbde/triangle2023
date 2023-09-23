package triangle;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TrianglePbeinerTest {

	public static final Triangle triangle = new TrianglePbeiner();

	@Test
	public void testGetTriangleResultForLengthsNotEqual() {
		final int[] input = { 5, 6, 7 };
		final TriangleResult expected = TriangleResult.TRIANGLE_NOT_EQUAL;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLengthsNotEqualVariables() {
		final int a = 5;
		final int b = 6;
		final int c = 7;
		final TriangleResult expected = TriangleResult.TRIANGLE_NOT_EQUAL;
		final TriangleResult result = triangle.getTriangleResultForLengths(a, b, c);
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLengthsNotEqual2() {
		final int[] input = { 50, 70, 90 };
		final TriangleResult expected = TriangleResult.TRIANGLE_NOT_EQUAL;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLengthsIsosceles() {
		final int[] input = { 2, 2, 3 };
		final TriangleResult expected = TriangleResult.TRIANGLE_ISOSCELES;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLengthsIsosceles2() {
		final int[] input = { 80, 50, 50 };
		final TriangleResult expected = TriangleResult.TRIANGLE_ISOSCELES;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLengthsIsosceles3() {
		final int[] input = { 80, 50, 80 };
		final TriangleResult expected = TriangleResult.TRIANGLE_ISOSCELES;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLengthsEquiliteral() {
		final int[] input = { 1, 1, 1 };
		final TriangleResult expected = TriangleResult.TRIANGLE_EQUILATERAL;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLengthsEquiliteral2() {
		final int[] input = { 42, 42, 42 };
		final TriangleResult expected = TriangleResult.TRIANGLE_EQUILATERAL;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForNegativeValue() {
		final int[] input = { -1, -2, -3 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForNegativeValue2() {
		final int[] input = { -1, 42, -500 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultZero() {
		final int[] input = { 0, 1, 1 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleTooFewParams() {
		final int[] input = { 5, 3 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleTooManyParams() {
		final int[] input = { 5, 3, 4, 10 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleNoParams() {
		final int[] input = {  };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleNull() {
		final int[] input = null;
		final TriangleResult expected = TriangleResult.UNKNOWN;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}
}
