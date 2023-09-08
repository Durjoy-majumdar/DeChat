package ba1;

/* renamed from: ba1.d */
public final class C113152d {
    /* renamed from: a */
    public static String m154820a(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        if ("-1".equals(str)) {
            return "-1";
        }
        String[] split = str.split("@");
        if (split.length <= 1) {
            return null;
        }
        return split[1];
    }

    /* renamed from: b */
    public static long m154821b(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        if ("-1".equals(str)) {
            return -1;
        }
        return Long.valueOf(str.split("@")[0]).longValue();
    }
}
