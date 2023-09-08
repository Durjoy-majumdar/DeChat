package com.tencent.p014mm.plugin.webview.p128ui.tools;

import ce2.C28545b;
import oa1.C117731d;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.t */
public final class C30608t {

    /* renamed from: a */
    public static Boolean f82423a;

    /* renamed from: a */
    public static String m39140a(String str, String str2) {
        return C117731d.m166007c().mo182444f(str, str2, false, true);
    }

    /* renamed from: b */
    public static boolean m39141b() {
        Class<C30608t> cls = C30608t.class;
        StringBuilder sb = new StringBuilder(8);
        try {
            sb.append(C28545b.m38262a("²¾º¯«©¹¨£­¶¥¬®¡¨"));
            String sb4 = sb.toString();
            sb.delete(0, sb.length());
            sb.append(((cls.hashCode() >>> 31) | 1) ^ 1);
            return !sb.toString().equals(m39140a(sb4, sb.toString()));
        } catch (Throwable unused) {
            String sb5 = sb.toString();
            sb.delete(0, sb.length());
            sb.append(((cls.hashCode() >>> 31) | 1) ^ 1);
            return !sb.toString().equals(m39140a(sb5, sb.toString()));
        }
    }

    /* renamed from: c */
    public static boolean m39142c() {
        if (f82423a == null) {
            Class<C30608t> cls = C30608t.class;
            StringBuilder sb = new StringBuilder(8);
            try {
                sb.append(C28545b.m38262a("´¼¸±µ«¿®¡£¸ ¨¦¢­§§"));
            } catch (Throwable unused) {
            }
            String sb4 = sb.toString();
            sb.delete(0, sb.length());
            sb.append(((cls.hashCode() >>> 31) | 1) ^ 1);
            f82423a = Boolean.valueOf(!sb.toString().equals(m39140a(sb4, sb.toString())));
        }
        return f82423a.booleanValue();
    }
}
