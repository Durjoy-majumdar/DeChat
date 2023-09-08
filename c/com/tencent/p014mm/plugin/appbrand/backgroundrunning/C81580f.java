package com.tencent.p014mm.plugin.appbrand.backgroundrunning;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C81682d;
import com.tencent.p014mm.plugin.appbrand.ipc.MMToClientEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import java.util.HashSet;
import li0.C88508b;
import li0.C88509c;

/* renamed from: com.tencent.mm.plugin.appbrand.backgroundrunning.f */
public class C81580f implements C88509c.C88512b {
    /* renamed from: b */
    public void mo113102b(String str, C88508b bVar) {
        AppBrandRuntimeWC b;
        Class cls = C81590r.class;
        if (bVar == C88508b.DESTROYED) {
            Log.m105924i("MicroMsg.AppBrandBackgroundRunningMonitor", "AppBrandRuntime state changed to destroyed");
            if (C86312j.m106911c(cls) != null) {
                AppBrandBackgroundRunningOperationParcel appBrandBackgroundRunningOperationParcel = new AppBrandBackgroundRunningOperationParcel();
                appBrandBackgroundRunningOperationParcel.f239222d = str;
                appBrandBackgroundRunningOperationParcel.f239224f = 65535;
                appBrandBackgroundRunningOperationParcel.f239225g = 2;
                if (!(C81682d.m100222b(str) == null || (b = C81682d.m100222b(str)) == null)) {
                    appBrandBackgroundRunningOperationParcel.f239231p = b.mo113210l1().f234811P;
                    appBrandBackgroundRunningOperationParcel.f239223e = b.f238149o.f239365g;
                    if (b.mo113026R() != null) {
                        appBrandBackgroundRunningOperationParcel.f239226h = b.mo113026R().getClass().getName();
                    }
                }
                ((C81590r) C86312j.m106911c(cls)).mo56711qO(appBrandBackgroundRunningOperationParcel);
            }
            if (!((HashSet) AppBrandBackgroundRunningMonitor.f239219d).remove(str)) {
                Log.m105928w("MicroMsg.AppBrandBackgroundRunningMonitor", "onRunningStateChanged, not start, return");
                return;
            }
            boolean isEmpty = ((HashSet) AppBrandBackgroundRunningMonitor.f239219d).isEmpty();
            if (isEmpty) {
                Log.m105924i("MicroMsg.AppBrandBackgroundRunningMonitor", "stopListeningOperationReceivedIfNeed");
                if (AppBrandBackgroundRunningMonitor.f239217b != null) {
                    if (C86312j.m106911c(cls) != null) {
                        ((C81590r) C86312j.m106911c(cls)).mo56707O7(AppBrandBackgroundRunningMonitor.f239217b);
                    }
                    AppBrandBackgroundRunningMonitor.f239217b = null;
                }
            }
            Log.m105925i("MicroMsg.AppBrandBackgroundRunningMonitor", "stopListeningOperationEvent, appId:%s, lastStop: %b", str, Boolean.valueOf(isEmpty));
            MMToClientEvent.C81947d dVar = AppBrandBackgroundRunningMonitor.f239216a;
            if (dVar != null) {
                MMToClientEvent.m100657u(str, dVar);
                if (isEmpty) {
                    AppBrandBackgroundRunningMonitor.f239216a = null;
                }
            }
            if (isEmpty) {
                Log.m105924i("MicroMsg.AppBrandBackgroundRunningMonitor", "onRunningStateChanged, last stop, dead listener");
                AppBrandBackgroundRunningMonitor.f239218c.dead();
            }
        }
    }
}
