package triangle;

public class TriangleMSchneider implements Triangle {

    @Override
    public TriangleResult getTriangleResultForLengths(int... lengths) {
        if (lengths != null && lengths.length == 3 && lengths[0] > 0 && lengths[1] > 0 && lengths[2] > 0) {
            if (lengths[0] == lengths[1] && lengths[1] == lengths[2]) {
                return TriangleResult.TRIANGLE_EQUILATERAL;
            }
            if (lengths[0] == lengths[1] || lengths[1] == lengths[2] || lengths[0] == lengths[2]) {
                return TriangleResult.TRIANGLE_ISOSCELES;
            }
            return TriangleResult.TRIANGLE_NOT_EQUAL;
        }
        return TriangleResult.UNKNOWN;
    }

}
