package com.tencent.p014mm.plugin.appbrand.task;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.tencent.luggage.sdk.processes.LuggageServiceType;
import com.tencent.p014mm.plugin.appbrand.app.C29147m;
import com.tencent.p014mm.plugin.appbrand.app.C81168l;
import com.tencent.p014mm.plugin.appbrand.app.C81176n;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import kr0.C88273g1;

/* renamed from: com.tencent.mm.plugin.appbrand.task.AppBrandTaskPreloadReceiver */
public class AppBrandTaskPreloadReceiver extends BroadcastReceiver {
    /* renamed from: a */
    public static void m103893a(String str, Intent intent) {
        C84343y yVar;
        C88273g1 g1Var;
        Intent intent2 = intent;
        if (intent2 == null) {
            Log.m105921e("MicroMsg.AppBrandTaskPreloadReceiver", "[PreloadProfile][%s] Receiver get NULL intent", str);
            return;
        }
        intent2.setExtrasClassLoader(AppBrandPreloadProfiler.class.getClassLoader());
        int intExtra = intent2.getIntExtra("EXTRA_KEY_LEVEL", 2);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long longExtra = intent2.getLongExtra("EXTRA_KEY_TRIGGER_TIME", -1);
        AppBrandPreloadProfiler appBrandPreloadProfiler = (AppBrandPreloadProfiler) intent2.getParcelableExtra("preloadProfiler");
        LuggageServiceType luggageServiceType = LuggageServiceType.values()[intent2.getIntExtra("Luggage.LuggageServiceType", 2)];
        if (luggageServiceType == LuggageServiceType.NIL) {
            yVar = C84343y.NIL;
        } else if (luggageServiceType == LuggageServiceType.WAGAME) {
            yVar = C84343y.WAGAME;
        } else if (luggageServiceType == LuggageServiceType.WASERVICE) {
            yVar = C84343y.WASERVICE;
        } else {
            C84343y yVar2 = C84343y.WASERVICE;
            throw new IllegalStateException("unknown type:" + luggageServiceType.name());
        }
        boolean booleanExtra = intent2.getBooleanExtra("EXTRA_KEY_AGGRESSIVE", false);
        int intExtra2 = IntentUtil.getIntExtra(intent2, "EXTRA_KEY_PRELOAD_SCENE", -1);
        C88273g1[] values = C88273g1.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                g1Var = null;
                break;
            }
            g1Var = values[i];
            if (intExtra2 == g1Var.ordinal()) {
                break;
            }
            i++;
        }
        C81176n.f238501c = true;
        if (yVar == null || yVar == C84343y.NIL) {
            Log.m105924i("MicroMsg.AppBrandProcessProfileInit[applaunch][PreloadProfile][preload]", "dl: AppBrandProcessPreloader said I can not preload [nil] type.");
        } else {
            AppBrandPreloadProfiler appBrandPreloadProfiler2 = appBrandPreloadProfiler == null ? new AppBrandPreloadProfiler() : appBrandPreloadProfiler;
            appBrandPreloadProfiler2.f246127h = SystemClock.elapsedRealtime();
            MMHandlerThread.postToMainThread(new C29147m(new C81168l(yVar, booleanExtra, intExtra, appBrandPreloadProfiler2, g1Var)));
        }
        Log.m105925i("MicroMsg.AppBrandTaskPreloadReceiver", "[PreloadProfile][%s] Trigger cost [%d]ms Receiver cost [%d]ms, at [%d], level [%d], scene[%s]", str, Long.valueOf(SystemClock.elapsedRealtime() - longExtra), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime), Long.valueOf(elapsedRealtime), Integer.valueOf(intExtra), g1Var);
    }

    public void onReceive(Context context, Intent intent) {
        m103893a("", intent);
    }
}
