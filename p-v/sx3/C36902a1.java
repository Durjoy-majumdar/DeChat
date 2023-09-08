package sx3;

/* renamed from: sx3.a1 */
public final class C36902a1 {
    /* renamed from: a */
    public static final void m41087a(int i, int i2) {
        String str;
        if (!(i > 0 && i2 > 0)) {
            if (i != i2) {
                str = "Both size " + i + " and step " + i2 + " must be greater than zero.";
            } else {
                str = "size " + i + " must be greater than zero.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }
}
