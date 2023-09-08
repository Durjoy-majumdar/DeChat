package com.tencent.p014mm.booter;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.vendor.Honor;
import com.tencent.p014mm.sdk.vendor.Huawei;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import j20.C117292a;
import k20.C9556a;
import kj2.C117407d;
import p206nj.C11171e;

/* renamed from: com.tencent.mm.booter.c */
public class C28862c {
    /* renamed from: a */
    public static MultiProcessMMKV m38400a() {
        return MultiProcessMMKV.getMMKV("service_launch_way");
    }

    /* renamed from: b */
    public static boolean m38401b(Context context) {
        if (BuildInfo.IS_UAT) {
            Log.m105924i("MicroMsg.CoreServiceUtil", "ignorePermissionActivity for uat wechat pay.");
            return true;
        } else if (Build.VERSION.SDK_INT < 23) {
            return true;
        } else {
            boolean isIgnoringBatteryOptimizations = ((PowerManager) context.getSystemService("power")).isIgnoringBatteryOptimizations(context.getPackageName());
            Log.m105925i("MicroMsg.CoreServiceUtil", "ifIgnoreBatteryOptimizations() result=%s", Boolean.valueOf(isIgnoringBatteryOptimizations));
            return isIgnoringBatteryOptimizations;
        }
    }

    /* renamed from: c */
    public static boolean m38402c() {
        if (C11171e.m11046c(26)) {
            boolean ifHONOR = Honor.INSTANCE.ifHONOR();
            Log.m105925i("MicroMsg.CoreServiceUtil", "ifUseOnlyBindToCoreService() isHonor:%s", Boolean.valueOf(ifHONOR));
            int i = MMApplicationContext.getContext().getSharedPreferences("service_launch_way", 4).getInt("huawei_switch", 0);
            boolean isNotBelowEMUI10 = Huawei.isNotBelowEMUI10();
            Log.m105925i("MicroMsg.CoreServiceUtil", "ifUseOnlyBindToCoreService() isHonor:%s huaweiEnable:%s isNotBelowEmui10:%s", Boolean.valueOf(ifHONOR), Integer.valueOf(i), Boolean.valueOf(isNotBelowEMUI10));
            if (isNotBelowEMUI10 || ifHONOR) {
                return false;
            }
            if (Util.isEqual(i, 0)) {
                Log.m105924i("MicroMsg.CoreServiceUtil", "ifUseOnlyBindToCoreService() true (huawei)");
                return true;
            }
        }
        if (C11171e.m11046c(26)) {
            boolean z = m38400a().getBoolean("target26_start_service", false);
            Log.m105925i("MicroMsg.CoreServiceUtil", "ifTarget26StartService() result:%s", Boolean.valueOf(z));
            if (!z) {
                Log.m105924i("MicroMsg.CoreServiceUtil", "ifUseOnlyBindToCoreService() true");
                return true;
            }
        }
        Log.m105924i("MicroMsg.CoreServiceUtil", "ifUseOnlyBindToCoreService() false");
        return false;
    }

    /* renamed from: d */
    public static void m38403d() {
        Context context = MMApplicationContext.getContext();
        Intent className = new Intent().setClassName(context, "com.tencent.mm.pluginsdk.permission.PermissionActivity");
        className.setFlags(268435456);
        className.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 4);
        C9556a aVar = new C9556a();
        aVar.mo10233c(className);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/booter/CoreServiceUtil", "ignoreBatteryOptimizations", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/booter/CoreServiceUtil", "ignoreBatteryOptimizations", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        Log.m105924i("MicroMsg.CoreServiceUtil", "ignoreBatteryOptimizations()");
    }

    /* renamed from: e */
    public static void m38404e() {
        int i;
        try {
            String lowerCase = Build.BRAND.toLowerCase();
            if (Honor.INSTANCE.ifHONOR()) {
                i = 46;
            } else {
                if (!lowerCase.contains("xiaomi")) {
                    if (!lowerCase.contains("redmi")) {
                        if (!lowerCase.contains("huawei")) {
                            if (!lowerCase.contains("honor")) {
                                i = lowerCase.contains("vivo") ? 43 : lowerCase.contains("oppo") ? 42 : lowerCase.contains("samsung") ? 44 : 45;
                            }
                        }
                        i = 40;
                    }
                }
                i = 41;
            }
            C117407d dVar = C117407d.INSTANCE;
            dVar.idkeyStat(954, (long) i, 1, false);
            dVar.mo160131h(20661, 0);
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.CoreServiceUtil", th, "", new Object[0]);
        }
    }

    /* renamed from: f */
    public static void m38405f(boolean z) {
        m38400a().edit().putBoolean("target26_start_service", z).commit();
        Log.m105925i("MicroMsg.CoreServiceUtil", "setTarget26StartService() enable: %s", Boolean.valueOf(z));
    }

    /* renamed from: g */
    public static void m38406g(int i) {
        MMApplicationContext.getContext().getSharedPreferences("service_launch_way", 4).edit().putInt("huawei_switch", i).commit();
        Log.m105925i("MicroMsg.CoreServiceUtil", "setTarget26StartServiceHuawei() enable: %s", Integer.valueOf(i));
    }
}
