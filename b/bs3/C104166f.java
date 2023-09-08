package bs3;

/* renamed from: bs3.f */
public final class C104166f {
    /* renamed from: a */
    public static boolean m139001a(String str, String str2) {
        if (str != str2) {
            return (str == null || str2 == null || !str.equals(str2)) ? false : true;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m139002b(String str) {
        return str == null || str.length() == 0;
    }

    /* renamed from: c */
    public static boolean m139003c(String str, String str2) {
        return str == null ? str2 == null : str.equals(str2);
    }
}
