package com.tencent.p014mm.p136ui.tools;

/* renamed from: com.tencent.mm.ui.tools.t1 */
public class C7021t1 {
    /* renamed from: a */
    public static String m7266a(String str, String... strArr) {
        if (strArr == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        String str2 = "?";
        if (str.contains(str2)) {
            str2 = "&";
        }
        sb.append(str2);
        boolean z = true;
        for (String str3 : strArr) {
            if (z) {
                z = false;
            } else {
                sb.append("&");
            }
            sb.append(str3);
        }
        return sb.toString();
    }
}
