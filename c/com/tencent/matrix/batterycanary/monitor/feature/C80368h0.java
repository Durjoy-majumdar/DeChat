package com.tencent.matrix.batterycanary.monitor.feature;

import android.text.TextUtils;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import java.util.ArrayList;
import java.util.List;
import p1190de.C116608a;
import p723vf.C118672d;
import p981ie.C87706m;

/* renamed from: com.tencent.matrix.batterycanary.monitor.feature.h0 */
public final class C80368h0 extends C116608a {

    /* renamed from: b */
    public final C80370c f235246b = new C80370c();

    /* renamed from: c */
    public C87706m.C87708b f235247c;

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.h0$a */
    public class C80369a implements C87706m.C87708b {
        public C80369a() {
        }

        /* renamed from: a */
        public void mo111826a(long j, float f) {
            String b = C80368h0.this.mo180590h() ? C80368h0.this.f349668a.f339057d.f339026A.mo122130b() : "";
            C118672d.m167353c("Matrix.battery.LocationMonitorFeature", "#onRequestLocationUpdates, time = " + j + ", distance = " + f + ", stack = " + b, new Object[0]);
            C80370c cVar = C80368h0.this.f235246b;
            cVar.getClass();
            if (!TextUtils.isEmpty(b)) {
                cVar.f235250b = b;
            }
            C80368h0.this.f235246b.f235249a++;
        }
    }

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.h0$c */
    public static final class C80370c {

        /* renamed from: a */
        public int f235249a;

        /* renamed from: b */
        public String f235250b = "";
    }

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.h0$b */
    public static class C80371b extends C114490k0.C114491a<C80371b> {

        /* renamed from: d */
        public C114490k0.C114491a.C114494b.C114497b<Integer> f235251d;

        /* renamed from: e */
        public String f235252e;

        /* renamed from: a */
        public C114490k0.C114491a.C114492a mo111825a(C114490k0.C114491a aVar) {
            return new C114484i0(this, (C80371b) aVar, this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo111817b() {
        /*
            r5 = this;
            super.mo111817b()
            ce.g r0 = r5.f349668a
            ce.f r0 = r0.f339057d
            boolean r0 = r0.f339046q
            if (r0 == 0) goto L_0x0058
            com.tencent.matrix.batterycanary.monitor.feature.h0$a r0 = new com.tencent.matrix.batterycanary.monitor.feature.h0$a
            r0.<init>()
            r5.f235247c = r0
            java.util.List<ie.m$b> r1 = p981ie.C87706m.f253979a
            java.lang.Class<ie.m> r1 = p981ie.C87706m.class
            monitor-enter(r1)
            java.util.List<ie.m$b> r2 = p981ie.C87706m.f253979a     // Catch:{ all -> 0x0055 }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x0055 }
            boolean r2 = r2.contains(r0)     // Catch:{ all -> 0x0055 }
            if (r2 == 0) goto L_0x0023
            monitor-exit(r1)
            goto L_0x0058
        L_0x0023:
            java.util.List<ie.m$b> r2 = p981ie.C87706m.f253979a     // Catch:{ all -> 0x0055 }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x0055 }
            r2.add(r0)     // Catch:{ all -> 0x0055 }
            boolean r0 = p981ie.C87706m.f253980b     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x002f
            goto L_0x0053
        L_0x002f:
            java.util.List<ie.m$b> r0 = p981ie.C87706m.f253979a     // Catch:{ all -> 0x0055 }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x0055 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x003a
            goto L_0x0053
        L_0x003a:
            ie.u r0 = p981ie.C87706m.f253981c     // Catch:{ all -> 0x0055 }
            boolean r0 = r0.mo122132a()     // Catch:{ all -> 0x0055 }
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x0055 }
            r4 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0055 }
            r3[r4] = r0     // Catch:{ all -> 0x0055 }
            java.lang.String r0 = "Matrix.battery.LocationHooker"
            java.lang.String r4 = "checkHook hookRet:%b"
            p723vf.C118672d.m167353c(r0, r4, r3)     // Catch:{ all -> 0x0055 }
            p981ie.C87706m.f253980b = r2     // Catch:{ all -> 0x0055 }
        L_0x0053:
            monitor-exit(r1)
            goto L_0x0058
        L_0x0055:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.matrix.batterycanary.monitor.feature.C80368h0.mo111817b():void");
    }

    /* renamed from: d */
    public int mo111818d() {
        return Integer.MIN_VALUE;
    }

    /* renamed from: f */
    public void mo111819f() {
        super.mo111819f();
        C87706m.C87708b bVar = this.f235247c;
        List<C87706m.C87708b> list = C87706m.f253979a;
        synchronized (C87706m.class) {
            if (bVar != null) {
                ((ArrayList) C87706m.f253979a).remove(bVar);
                if (C87706m.f253980b) {
                    if (((ArrayList) C87706m.f253979a).isEmpty()) {
                        C118672d.m167353c("Matrix.battery.LocationHooker", "checkUnHook unHookRet:%b", Boolean.valueOf(C87706m.f253981c.mo122133b()));
                        C87706m.f253980b = false;
                    }
                }
            }
        }
        this.f235246b.f235249a = 0;
    }

    /* renamed from: g */
    public String mo111820g() {
        return "Matrix.battery.LocationMonitorFeature";
    }
}
