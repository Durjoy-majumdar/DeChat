package eb0;

/* renamed from: eb0.d6 */
public class C75571d6 {
    /* renamed from: a */
    public static boolean m90695a(Object obj, boolean z) {
        if (obj instanceof Boolean) {
            try {
                return ((Boolean) obj).booleanValue();
            } catch (Exception unused) {
            }
        }
        return z;
    }

    /* renamed from: b */
    public static int m90696b(Object obj, int i) {
        if (obj instanceof Integer) {
            try {
                return ((Integer) obj).intValue();
            } catch (Exception unused) {
            }
        }
        return i;
    }

    /* renamed from: c */
    public static String m90697c(Object obj, String str) {
        if (obj instanceof String) {
            try {
                return (String) obj;
            } catch (Exception unused) {
            }
        }
        return str;
    }
}
