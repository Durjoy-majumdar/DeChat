package com.tencent.p014mm.plugin.appbrand.launching.teenmode;

import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo;
import com.tencent.p014mm.plugin.appbrand.appusage.C68585h1;
import com.tencent.p014mm.plugin.appbrand.appusage.C81500i0;
import com.tencent.p014mm.plugin.appbrand.launching.teenmode.C83472a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Map;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.teenmode.d */
public final class C83479d implements MStorage.IOnStorageChange {

    /* renamed from: d */
    public static final C83479d f243925d = new C83479d();

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.teenmode.d$a */
    public static final class C83480a implements Runnable {

        /* renamed from: d */
        public static final C83480a f243926d = new C83480a();

        public final void run() {
            C83472a aVar = C83472a.f243917a;
            C81500i0 i0Var = (C81500i0) C81161g2.Bx0(C81500i0.class);
            Integer num = null;
            ArrayList<AppBrandRecentTaskInfo> Yt = i0Var != null ? i0Var.mo113792Yt(Integer.MAX_VALUE, C68585h1.C68586a.ASC) : null;
            Object[] objArr = new Object[1];
            if (Yt != null) {
                num = Integer.valueOf(Yt.size());
            }
            objArr[0] = num;
            Log.m105925i("MicroMsg.AppBrandTeenModeReporter", "alvinluo checkRemovedCollection allCollection: %d", objArr);
            if (Yt != null) {
                for (AppBrandRecentTaskInfo appBrandRecentTaskInfo : Yt) {
                    C83472a aVar2 = C83472a.f243917a;
                    String str = appBrandRecentTaskInfo.f239040d;
                    C87412m.m108593f(str, "info.username");
                    String b = aVar2.mo115772b(str, appBrandRecentTaskInfo.f239042f);
                    Log.m105925i("MicroMsg.AppBrandTeenModeReporter", "alvinluo checkRemovedCollection key: %s", b);
                    if (C83472a.f243918b.containsKey(b)) {
                        C83472a.f243918b.remove(b);
                    }
                }
            }
            for (Map.Entry next : C83472a.f243918b.entrySet()) {
                Log.m105925i("MicroMsg.AppBrandTeenModeReporter", "alvinluo checkRemovedCollection needRemove key: %s", next.getKey());
                C83472a.m102434c(((C83472a.C83473a) next.getValue()).f243919a);
            }
            aVar.mo115773e(Yt);
        }
    }

    public final void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        Object[] objArr = new Object[3];
        boolean z = false;
        objArr[0] = str;
        Object obj = null;
        objArr[1] = mStorageEventData != null ? Integer.valueOf(mStorageEventData.eventId) : null;
        if (mStorageEventData != null) {
            obj = mStorageEventData.obj;
        }
        objArr[2] = obj;
        Log.m105925i("MicroMsg.AppBrandTeenModeReporter", "alvinluo collectionStorage onNotifyChanged event: %s, eventId: %s, eventData.obj: %s", objArr);
        if (mStorageEventData != null && mStorageEventData.eventId == 3) {
            z = true;
        }
        if (z && C87412m.m108589b(str, MStorageEventData.EventType.BATCH) && mStorageEventData.obj == null) {
            C83472a aVar = C83472a.f243917a;
            ((C119157j) C119157j.f356862d).mo183871b(C83480a.f243926d, "AppBrandTeenModeReporter");
        }
    }
}
