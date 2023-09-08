package com.tencent.p014mm.plugin.appbrand.task;

import android.content.Context;
import android.os.Build;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.launching.params.LaunchParcel;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import java.util.concurrent.ConcurrentHashMap;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.appbrand.task.c */
public final class C29636c extends C86301e {

    /* renamed from: d */
    public final ConcurrentHashMap<String, LaunchParcel> f80569d = new ConcurrentHashMap<>();

    public static void vx0(C29636c cVar, String str, LaunchParcel launchParcel, int i, Object obj) {
        if ((i & 2) != 0) {
            launchParcel = null;
        }
        cVar.getClass();
        if (!(str == null || str.length() == 0)) {
            Log.m105924i("MicroMsg.AppBrandLaunchParcelStoreService", '[' + cVar.hashCode() + "]remove(instanceId:" + str + ')');
            if (launchParcel == null || Build.VERSION.SDK_INT < 24) {
                cVar.f80569d.remove(str);
            } else {
                cVar.f80569d.remove(str, launchParcel);
            }
        }
    }

    public void onAccountReleased(Context context) {
        C87412m.m108594g(context, "context");
        super.onAccountReleased(context);
        Log.m105924i("MicroMsg.AppBrandLaunchParcelStoreService", '[' + hashCode() + "]onAccountReleased");
        this.f80569d.clear();
    }
}
