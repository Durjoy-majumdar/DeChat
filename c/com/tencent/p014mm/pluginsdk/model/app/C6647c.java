package com.tencent.p014mm.pluginsdk.model.app;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.pluginsdk.model.app.c */
public class C6647c {
    /* renamed from: a */
    public static Signature[] m6936a(Context context, String str) {
        if (str == null || str.length() == 0) {
            Log.m105920e("MicroMsg.AndroidAppUtil", "getSignature, packageName is null");
            return null;
        } else if (context == null) {
            Log.m105920e("MicroMsg.AndroidAppUtil", "getSignature, context is null");
            return null;
        } else {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
                if (packageInfo != null) {
                    return packageInfo.signatures;
                }
                Log.m105920e("MicroMsg.AndroidAppUtil", "info is null, packageName = " + str);
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.m105920e("MicroMsg.AndroidAppUtil", "NameNotFoundException");
                return null;
            }
        }
    }
}
