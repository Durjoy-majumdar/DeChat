package com.tencent.p014mm.app;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.tencent.mm.app.k */
public class C0989k {
    /* renamed from: a */
    public static void m942a(Context context, String str, String str2) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("crash_status_file", 4);
            String string = sharedPreferences.getString("crashlist", "");
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("crashlist", string + ";" + str + "," + str2);
            edit.commit();
        } catch (Throwable unused) {
        }
    }
}
