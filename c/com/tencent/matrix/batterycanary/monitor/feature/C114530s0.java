package com.tencent.matrix.batterycanary.monitor.feature;

import android.os.Handler;
import com.tencent.matrix.batterycanary.monitor.feature.C114519q0;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.tencent.matrix.batterycanary.monitor.feature.s0 */
public class C114530s0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Handler f343295d;

    /* renamed from: e */
    public final /* synthetic */ long f343296e;

    /* renamed from: f */
    public final /* synthetic */ C114519q0.C114524d f343297f;

    public C114530s0(C114519q0.C114524d dVar, Handler handler, long j) {
        this.f343297f = dVar;
        this.f343295d = handler;
        this.f343296e = j;
    }

    public void run() {
        C114519q0.C114524d dVar = this.f343297f;
        boolean z = true;
        int i = dVar.f343276c + 1;
        dVar.f343276c = i;
        C114519q0.C114524d.C114525a aVar = dVar.f343278e;
        if (aVar != null) {
            C114519q0.C114520a.C114521a aVar2 = (C114519q0.C114520a.C114521a) aVar;
            C114519q0.this.f349668a.mo165849d(i, dVar.f343275b);
            C114519q0.C114524d dVar2 = aVar2.f343267a;
            if (dVar2.f343276c < 30) {
                z = false;
            }
            if (z) {
                dVar2.mo173703a(C114519q0.this.f349668a.f339059f);
                Iterator it = ((ConcurrentHashMap) C114519q0.this.f343263c).entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((Map.Entry) it.next()).getValue() == aVar2.f343267a) {
                            it.remove();
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        C114519q0.C114524d dVar3 = this.f343297f;
        int i2 = dVar3.f343276c;
        dVar3.getClass();
        if (i2 < 30) {
            this.f343295d.postDelayed(this, this.f343296e);
        }
    }
}
