package com.tencent.mapsdk.internal;

import android.content.Context;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.mapsdk.internal.mj */
public class C113957mj extends C113955mh {

    /* renamed from: b */
    private static final String f340842b = "Tencent_MapSDK_SUB_CONFIG";

    /* renamed from: c */
    private static Map<String, C113955mh> f340843c = new HashMap();

    private C113957mj(Context context, String str) {
        this.f340836a = context.getSharedPreferences("Tencent_MapSDK_SUB_CONFIG_".concat(String.valueOf(str)), 0);
    }

    /* renamed from: a */
    public static C113955mh m157958a(Context context, String str) {
        if (C40002he.m42805a(str)) {
            return C113958mk.m157962a(context);
        }
        if (f340843c.get(str) == null) {
            synchronized (C113957mj.class) {
                if (f340843c.get(str) == null) {
                    C113957mj mjVar = new C113957mj(context, str);
                    f340843c.put(str, mjVar);
                    return mjVar;
                }
            }
        }
        return f340843c.get(str);
    }

    /* renamed from: b */
    private static boolean m157961b(Context context, String str) {
        if (C40002he.m42805a(str)) {
            return false;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getFilesDir().getParent());
            String str2 = File.separator;
            sb.append(str2);
            sb.append("shared_prefs");
            sb.append(str2);
            sb.append("Tencent_MapSDK_SUB_CONFIG_");
            sb.append(str);
            File file = new File(sb.toString());
            if (file.exists()) {
                return file.delete();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: b */
    public static void m157960b() {
        Map<String, C113955mh> map = f340843c;
        if (map != null) {
            map.clear();
        }
    }

    /* renamed from: a */
    public static void m157959a(Context context) {
        try {
            File[] listFiles = new File(context.getFilesDir().getParent() + File.separator + "shared_prefs").listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    if (file.getName().startsWith(f340842b)) {
                        file.delete();
                    }
                }
            }
        } catch (Exception unused) {
        }
    }
}
