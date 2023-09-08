package com.tencent.mapsdk.internal;

import android.os.Handler;
import com.tencent.mapsdk.vector.VectorMap;

/* renamed from: com.tencent.mapsdk.internal.ss */
public final class C114317ss implements C113533bb {

    /* renamed from: a */
    private final C114322sx f342493a;

    public C114317ss(C114322sx sxVar) {
        this.f342493a = sxVar;
    }

    /* renamed from: a */
    public final void mo171628a(C114367v vVar) {
        C114322sx sxVar = this.f342493a;
        if (sxVar != null) {
            if (vVar != null) {
                sxVar.mo171552a(((VectorMap) sxVar.f339878e_).f342909o.f340912t.mo173058a());
            }
            C114322sx sxVar2 = this.f342493a;
            Handler handler = sxVar2.f342519B;
            if (handler != null && handler.getLooper().getThread().isAlive()) {
                sxVar2.f342519B.sendEmptyMessage(0);
            }
        }
    }
}
