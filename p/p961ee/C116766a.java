package p961ee;

import android.os.Handler;
import java.util.concurrent.atomic.AtomicReference;
import p329d3.C116555h;
import p961ee.C86507b;

/* renamed from: ee.a */
public class C116766a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AtomicReference f350064d;

    /* renamed from: e */
    public final /* synthetic */ C86507b.C86508a f350065e;

    /* renamed from: f */
    public final /* synthetic */ long f350066f;

    /* renamed from: g */
    public final /* synthetic */ Handler f350067g;

    /* renamed from: h */
    public final /* synthetic */ C116555h f350068h;

    public C116766a(C86507b bVar, AtomicReference atomicReference, C86507b.C86508a aVar, long j, Handler handler, C116555h hVar) {
        this.f350064d = atomicReference;
        this.f350065e = aVar;
        this.f350066f = j;
        this.f350067g = handler;
        this.f350068h = hVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x004e, code lost:
        if (r1.f252123c.get(r0.f350265b, false) == false) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r5 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r5.f350064d
            java.lang.Object r0 = r0.get()
            com.tencent.matrix.batterycanary.monitor.feature.i r0 = (com.tencent.matrix.batterycanary.monitor.feature.C114467i) r0
            if (r0 != 0) goto L_0x0022
            d3.h r0 = r5.f350068h
            java.lang.Object r0 = r0.get()
            com.tencent.matrix.batterycanary.monitor.feature.i r0 = (com.tencent.matrix.batterycanary.monitor.feature.C114467i) r0
            r0.mo173679v()
            java.util.concurrent.atomic.AtomicReference r1 = r5.f350064d
            r1.set(r0)
            android.os.Handler r0 = r5.f350067g
            long r1 = r5.f350066f
            r0.postDelayed(r5, r1)
            goto L_0x0074
        L_0x0022:
            java.util.concurrent.atomic.AtomicReference r1 = r5.f350064d
            r2 = 0
            r1.set(r2)
            r0.mo173662f()
            ee.b$a r1 = r5.f350065e
            fe.e r1 = (p965fe.C116861e) r1
            fe.f r2 = r1.f350263a
            fe.a r2 = r2.f350266c
            android.os.Handler r3 = r2.f252122b
            fe.g r4 = new fe.g
            r4.<init>(r2, r0)
            r3.post(r4)
            fe.f r0 = r1.f350263a
            fe.a r1 = r0.f350266c
            android.view.View r2 = r1.f252125e
            if (r2 == 0) goto L_0x0050
            android.util.SparseBooleanArray r1 = r1.f252123c
            int r0 = r0.f350265b
            r2 = 0
            boolean r0 = r1.get(r0, r2)
            if (r0 != 0) goto L_0x0051
        L_0x0050:
            r2 = 1
        L_0x0051:
            if (r2 == 0) goto L_0x005d
            android.os.Handler r0 = r5.f350067g
            android.os.Looper r0 = r0.getLooper()
            r0.quit()
            goto L_0x0074
        L_0x005d:
            d3.h r0 = r5.f350068h
            java.lang.Object r0 = r0.get()
            com.tencent.matrix.batterycanary.monitor.feature.i r0 = (com.tencent.matrix.batterycanary.monitor.feature.C114467i) r0
            r0.mo173679v()
            java.util.concurrent.atomic.AtomicReference r1 = r5.f350064d
            r1.set(r0)
            android.os.Handler r0 = r5.f350067g
            long r1 = r5.f350066f
            r0.postDelayed(r5, r1)
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p961ee.C116766a.run():void");
    }
}
