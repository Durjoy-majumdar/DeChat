package com.tencent.liteav.audio.route;

import com.tencent.liteav.audio.route.C17069b;
import com.tencent.liteav.base.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.liteav.audio.route.l */
public final class C17081l {

    /* renamed from: a */
    public static final C17069b.C17070a f46060a = C17069b.C17070a.SPEAKERPHONE;

    /* renamed from: b */
    public final HashMap<C17069b.C17070a, C17069b> f46061b = new HashMap<>();

    /* renamed from: c */
    public boolean f46062c = false;

    /* renamed from: b */
    private void m16859b(C17069b.C17070a aVar) {
        int i;
        C17069b bVar = this.f46061b.get(aVar);
        if (bVar == null) {
            Log.m97546e("AudioRouteSupervisor", "error in promoteRoutePriority, route(%s) is not existed", aVar);
            return;
        }
        int i2 = bVar.f46037c;
        if (i2 != this.f46061b.size() - 1) {
            bVar.f46037c = this.f46061b.size() - 1;
            for (Map.Entry<C17069b.C17070a, C17069b> value : this.f46061b.entrySet()) {
                C17069b bVar2 = (C17069b) value.getValue();
                if (aVar != bVar2.f46035a && (i = bVar2.f46037c) >= i2) {
                    bVar2.f46037c = i - 1;
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo19329a(C17069b.C17070a aVar, boolean z) {
        if (!this.f46062c) {
            Log.m97546e("AudioRouteSupervisor", "error in updateRouteAvailability(), it's not been initialized yet", new Object[0]);
            return false;
        }
        C17069b bVar = this.f46061b.get(aVar);
        if (bVar == null) {
            Log.m97546e("AudioRouteSupervisor", "updateRouteAvailability failed, name: %s", aVar);
            return false;
        }
        bVar.f46036b = z;
        if (z && m16858a(aVar)) {
            m16859b(aVar);
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m16858a(C17069b.C17070a aVar) {
        return aVar == C17069b.C17070a.WIRED_HEADSET || aVar == C17069b.C17070a.BLUETOOTH_HEADSET;
    }
}
