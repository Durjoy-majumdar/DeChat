package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.content.SharedPreferences;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.concurrent.TimeUnit;
import kj2.C117407d;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.u */
public final class C6599u {
    /* renamed from: a */
    public static void m6904a(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.WebViewReporter", "p1 is null, skip rest logit.");
            return;
        }
        try {
            SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("qar_cycle_rec", 0);
            String str2 = "qab_tick_" + MD5Util.getMD5String(str);
            long j = sharedPreferences.getLong(str2, 0);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - j > TimeUnit.HOURS.toMillis(24)) {
                sharedPreferences.edit().putLong(str2, currentTimeMillis).commit();
                C117407d.INSTANCE.idkeyStat(943, 1, 1, false);
            }
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.WebViewReporter", th, "", new Object[0]);
        }
    }

    /* renamed from: b */
    public static void m6905b(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.WebViewReporter", "p1 is null, skip rest logit.");
            return;
        }
        try {
            SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("qar_cycle_rec", 0);
            String str2 = "qaj_tick_" + MD5Util.getMD5String(str);
            long j = sharedPreferences.getLong(str2, 0);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - j > TimeUnit.HOURS.toMillis(24)) {
                sharedPreferences.edit().putLong(str2, currentTimeMillis).commit();
                C117407d dVar = C117407d.INSTANCE;
                dVar.mo160126c(16195, str.replace(",", "%2C"), false, true);
                dVar.idkeyStat(943, 0, 1, false);
            }
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.WebViewReporter", th, "", new Object[0]);
        }
    }
}
