package com.tencent.p014mm.plugin.appbrand.backgroundrunning;

import com.tencent.p014mm.plugin.appbrand.ipc.MMToClientEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;

/* renamed from: com.tencent.mm.plugin.appbrand.backgroundrunning.h */
public class C81582h implements MMToClientEvent.C81947d {
    /* renamed from: a */
    public void mo22085a(Object obj) {
        Class cls = C81590r.class;
        if (obj instanceof MMBackgroundRunningOperationParcel) {
            MMBackgroundRunningOperationParcel mMBackgroundRunningOperationParcel = (MMBackgroundRunningOperationParcel) obj;
            Log.m105925i("MicroMsg.AppBrandBackgroundRunningMonitor", "app received data, operation:%s", mMBackgroundRunningOperationParcel);
            if (C86312j.m106911c(cls) != null) {
                ((C81590r) C86312j.m106911c(cls)).mo56712qa(mMBackgroundRunningOperationParcel);
            }
        }
    }
}
