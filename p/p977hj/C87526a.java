package p977hj;

/* renamed from: hj.a */
public class C87526a {

    /* renamed from: a */
    public static Object[] f253578a = new Object[0];

    /* renamed from: b */
    public static Object[] f253579b = new Object[73];

    /* renamed from: a */
    public static boolean m108856a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static <T> boolean m108857b(T[] tArr, T t) {
        for (T t2 : tArr) {
            if (t2 == null) {
                if (t == null) {
                    return true;
                }
            } else if (t != null && t2.equals(t)) {
                return true;
            }
        }
        return false;
    }
}
