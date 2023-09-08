package com.unionpay.utils;

import android.content.Context;
import android.content.SharedPreferences;
import ix3.C117288d;
import ix3.C76374a;
import java.security.MessageDigest;

public class UPUtils {
    /* renamed from: a */
    public static String m90294a(Context context, String str) {
        String str2;
        if (context == null) {
            return null;
        }
        try {
            str2 = new String(C117288d.m165353a(0, C76374a.m91798b("0000000023456789abcdef12123456786789abcd".substring(0, 32)), C76374a.m91798b(context.getSharedPreferences("UnionPayPluginEx.pref", 0).getString(str, ""))), "utf-8").trim();
        } catch (Exception unused) {
            str2 = "";
        }
        return (str2 != null && str2.endsWith("00000000")) ? str2.substring(0, str2.length() - 8) : "";
    }

    /* renamed from: b */
    public static String m90295b(String str) {
        try {
            byte[] bytes = str.getBytes();
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.reset();
            instance.update(bytes);
            return C76374a.m91797a(instance.digest());
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static void m90296c(Context context, String str, String str2) {
        String str3;
        String str4 = "";
        if (context != null) {
            String substring = "0000000023456789abcdef12123456786789abcd".substring(0, 32);
            try {
                str3 = C76374a.m91797a(C117288d.m165353a(1, C76374a.m91798b(substring), (str + "00000000").getBytes("utf-8")));
            } catch (Exception unused) {
                str3 = str4;
            }
            if (str3 != null) {
                str4 = str3;
            }
            SharedPreferences.Editor edit = context.getSharedPreferences("UnionPayPluginEx.pref", 0).edit();
            edit.putString(str2, str4);
            edit.commit();
        }
    }

    public static native String forConfig(int i, String str);

    public static native String forScanUrl(int i);

    public static native String forUrl(int i);

    public static native String forWap(int i, String str);

    public static native String getIssuer(int i);

    public static native String getSubject(int i);

    public static native String getTalkingDataIdForAssist(int i);
}
