package triangle;

public class TriangleThomas implements Triangle {

	/** This implementation is a first try for the triangle problem and may lack some functionality */
	@Override
	public TriangleResult getTriangleResultForLengths(final int... lengths) {

		if(lengths.length == 3 && containsPos(lengths)){
			if (lengths[0] == lengths[1]  && lengths[1] == lengths[2]){
				return TriangleResult.TRIANGLE_EQUILATERAL;
			} else if (lengths[0] == lengths[1] ||  lengths[1] == lengths[2]) {
				return TriangleResult.TRIANGLE_ISOSCELES;
			}
			return TriangleResult.TRIANGLE_NOT_EQUAL;
		}
		return TriangleResult.UNKNOWN;
	}

	public static boolean containsPos(final int... numbers) {
		for (int number : numbers) {
			if (number > 0) {
				return true;
			}
		}
		return false;
	}
}


