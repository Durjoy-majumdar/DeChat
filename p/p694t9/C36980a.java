package p694t9;

import gy3.C87412m;

/* renamed from: t9.a */
public final class C36980a {

    /* renamed from: a */
    public static final C36980a f98063a = new C36980a();

    /* renamed from: b */
    public static char[] f98064b = {19968, 20108, 19977, 22235, 20116, 20845, 19971, 20843, 20061};

    /* renamed from: c */
    public static char[] f98065c = {21313, 30334, 21315, 19975, 20159};

    /* renamed from: a */
    public final String mo60922a(int i) {
        String str;
        String valueOf = String.valueOf(i);
        if (valueOf.length() == 1) {
            if (i == 0) {
                return "";
            }
            return "" + f98064b[i - 1];
        } else if (valueOf.length() == 2) {
            String substring = valueOf.substring(0, 1);
            C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            if (C87412m.m108589b(substring, "1")) {
                str = "十";
                if (i % 10 == 0) {
                    return str;
                }
            } else {
                str = "" + f98064b[(i / 10) - 1] + 21313;
            }
            return str + mo60922a(i % 10);
        } else if (valueOf.length() == 3) {
            String str2 = "" + f98064b[(i / 100) - 1] + 30334;
            int i2 = i % 100;
            if (String.valueOf(i2).length() < 2) {
                if (i2 == 0) {
                    return str2;
                }
                str2 = str2 + 38646;
            }
            return str2 + mo60922a(i2);
        } else if (valueOf.length() == 4) {
            String str3 = "" + f98064b[(i / 1000) - 1] + 21315;
            int i3 = i % 1000;
            if (String.valueOf(i3).length() < 3) {
                if (i3 == 0) {
                    return str3;
                }
                str3 = str3 + 38646;
            }
            return str3 + mo60922a(i3);
        } else if (valueOf.length() != 5) {
            return "";
        } else {
            String str4 = "" + f98064b[(i / 10000) - 1] + 19975;
            int i4 = i % 10000;
            if (String.valueOf(i4).length() < 4) {
                if (i4 == 0) {
                    return str4;
                }
                str4 = str4 + 38646;
            }
            return str4 + mo60922a(i4);
        }
    }
}
