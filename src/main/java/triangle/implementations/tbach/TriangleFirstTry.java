package triangle.implementations.tbach;

import triangle.Triangle;
import triangle.TriangleResult;

public class TriangleFirstTry implements Triangle {

	/** This implementation is a first try for the triangle problem and may lack some functionality */
	@Override
	public TriangleResult getTriangleResultForLengths(final int... lengths) {
		return TriangleResult.TRIANGLE_NOT_EQUAL;
	}

}
