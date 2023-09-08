package com.facebook.soloader;

import android.os.Trace;

/* renamed from: com.facebook.soloader.a */
public class C80145a {
    /* renamed from: a */
    public static void m97445a(String str, String str2, String str3) {
        String str4 = str + str2 + str3;
        if (str4.length() > 127 && str2 != null) {
            int length = (127 - str.length()) - str3.length();
            str4 = str + str2.substring(0, length) + str3;
        }
        Trace.beginSection(str4);
    }
}
