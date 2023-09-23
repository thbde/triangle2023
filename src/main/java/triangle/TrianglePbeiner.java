package triangle;

public class TrianglePbeiner implements Triangle{
    @Override
    public TriangleResult getTriangleResultForLengths(final int... lengths) {
        if(lengths == null){
            return TriangleResult.UNKNOWN;
        }
        assert(lengths != null);
        final int NUMBER_OF_SIDES = 3;
        if(lengths.length != NUMBER_OF_SIDES){
            return TriangleResult.UNKNOWN;
        }

        assert (lengths.length == NUMBER_OF_SIDES);
        final int a = lengths[0];
        final int b = lengths[1];
        final int c = lengths[2];

        if(a <= 0 || b <= 0 || c <= 0){
            return TriangleResult.UNKNOWN;
        }

        assert (a > 0 && b > 0 && c > 0);
        if(a != b && a != c && b != c){
            return TriangleResult.TRIANGLE_NOT_EQUAL;
        }

        if (a == b && a == c && b == c){
            return TriangleResult.TRIANGLE_EQUILATERAL;
        }

        if(a == b){
            return TriangleResult.TRIANGLE_ISOSCELES;
        }

        if(a == c){
            return TriangleResult.TRIANGLE_ISOSCELES;
        }

        if(b == c){
            return TriangleResult.TRIANGLE_ISOSCELES;
        }

        assert(false);
        return TriangleResult.UNKNOWN;
    }
}
