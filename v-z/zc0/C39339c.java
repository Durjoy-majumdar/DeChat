package zc0;

/* renamed from: zc0.c */
public class C39339c {
    /* renamed from: a */
    public static String m42094a(String str, long j) {
        if (j == 0) {
            return String.format(str + ";?enc=%d", new Object[]{314159265L});
        }
        return String.format(str + ";?enc=%d", new Object[]{Long.valueOf(j)});
    }
}
