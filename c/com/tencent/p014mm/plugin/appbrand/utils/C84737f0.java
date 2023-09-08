package com.tencent.p014mm.plugin.appbrand.utils;

import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.f0 */
public final class C84737f0 {

    /* renamed from: a */
    public static final Set<Object> f247137a = new HashSet();

    /* renamed from: b */
    public static final char[] f247138b = {'<', '>', '\"', '\'', '&', ' ', '\''};

    /* renamed from: c */
    public static final String[] f247139c = {"&lt;", "&gt;", "&quot;", "&apos;", "&amp;", "&nbsp;", "&#39;"};

    /* renamed from: a */
    public static String m104394a(ComponentName componentName) {
        PackageManager packageManager;
        if (componentName == null || (packageManager = MMApplicationContext.getContext().getPackageManager()) == null) {
            return "[UNKNOWN]";
        }
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            if (activityInfo != null) {
                return activityInfo.taskAffinity;
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AppBrandUtil", "getActivityTaskAffinity e = %s", e);
        }
        return "[UNKNOWN]";
    }

    /* renamed from: b */
    public static String m104395b(int i, Object... objArr) {
        return MMApplicationContext.getResources().getString(i, objArr);
    }

    /* renamed from: c */
    public static String m104396c(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = str.length();
        int i = 0;
        while (i < length) {
            int i2 = 0;
            while (i2 < f247138b.length) {
                String str2 = f247139c[i2];
                int i3 = 0;
                while (i3 < str2.length() && (r7 = i + i3) < length && str2.charAt(i3) == str.charAt(r7)) {
                    i3++;
                }
                if (i3 == str2.length()) {
                    break;
                }
                i2++;
            }
            char[] cArr = f247138b;
            if (i2 != cArr.length) {
                stringBuffer.append(cArr[i2]);
                i += f247139c[i2].length();
            } else {
                stringBuffer.append(str.charAt(i));
                i++;
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: d */
    public static String m104397d(String str) {
        if (str == null) {
            return null;
        }
        return str.replace(8232, 10).replace(8233, 10);
    }
}
