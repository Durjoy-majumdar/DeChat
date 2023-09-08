package tr0;

/* renamed from: tr0.b */
public interface C37240b {

    /* renamed from: tr0.b$a */
    public static class C37241a {
        /* renamed from: a */
        public static String m41249a(String[] strArr) {
            String str = " PRIMARY KEY ( ";
            for (String str2 : strArr) {
                str = str + ", " + str2;
            }
            return "" + "," + (str.replaceFirst(",", "") + " )");
        }
    }

    String[] getKeys();
}
