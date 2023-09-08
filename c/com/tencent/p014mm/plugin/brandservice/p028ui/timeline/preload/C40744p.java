package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.MMSlotKt;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import java.util.Arrays;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.p */
public final class C40744p {
    /* renamed from: a */
    public static final String m44015a(Bundle bundle) {
        StringBuilder sb = new StringBuilder("Bundle[");
        if (bundle == null) {
            sb.append("null");
        } else {
            boolean z = true;
            try {
                for (String next : bundle.keySet()) {
                    if (!z) {
                        sb.append(", ");
                    }
                    sb.append(next);
                    sb.append('=');
                    Object obj = bundle.get(next);
                    if (obj instanceof Object[]) {
                        sb.append(Arrays.toString((Object[]) obj));
                    } else if (obj instanceof Bundle) {
                        sb.append(m44015a((Bundle) obj));
                    } else {
                        sb.append(obj);
                    }
                    z = false;
                }
            } catch (Exception unused) {
                sb.append("can not read bundle");
            }
        }
        sb.append("]");
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "out.toString()");
        return sb4;
    }

    /* renamed from: b */
    public static final boolean m44016b(Context context, C32226l<? super ActivityManager.RunningAppProcessInfo, Boolean> lVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(lVar, "predicate");
        Object systemService = context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        for (ActivityManager.RunningAppProcessInfo next : ((ActivityManager) systemService).getRunningAppProcesses()) {
            C87412m.m108593f(next, "info");
            if (lVar.invoke(next).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static final void m44017c(MultiProcessMMKV multiProcessMMKV, String str) {
        C87412m.m108594g(multiProcessMMKV, "<this>");
        C87412m.m108594g(str, "key");
        multiProcessMMKV.putLong(str, MMSlotKt.now());
    }

    /* renamed from: d */
    public static final String m44018d(Intent intent) {
        C87412m.m108594g(intent, "<this>");
        return intent.toString() + ' ' + m44015a(intent.getExtras());
    }
}
