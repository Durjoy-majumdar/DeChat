package com.tencent.matrix.batterycanary.monitor.feature;

import android.text.TextUtils;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import java.util.ArrayList;
import java.util.List;
import p1190de.C116608a;
import p723vf.C118672d;
import p981ie.C87713x;

/* renamed from: com.tencent.matrix.batterycanary.monitor.feature.t0 */
public final class C80373t0 extends C116608a {

    /* renamed from: b */
    public final C80375c f235258b = new C80375c();

    /* renamed from: c */
    public C87713x.C87715b f235259c;

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.t0$a */
    public class C80374a implements C87713x.C87715b {
        public C80374a() {
        }

        /* renamed from: a */
        public void mo111827a() {
            String b = C80373t0.this.mo180590h() ? C80373t0.this.f349668a.f339057d.f339026A.mo122130b() : "";
            C118672d.m167353c("Matrix.battery.WifiMonitorFeature", "#onStartScan, stack = " + b, new Object[0]);
            C80375c cVar = C80373t0.this.f235258b;
            cVar.getClass();
            if (!TextUtils.isEmpty(b)) {
                cVar.f235263c = b;
            }
            C80373t0.this.f235258b.f235261a++;
        }

        /* renamed from: b */
        public void mo111828b() {
            String b = C80373t0.this.mo180590h() ? C80373t0.this.f349668a.f339057d.f339026A.mo122130b() : "";
            C118672d.m167353c("Matrix.battery.WifiMonitorFeature", "#onGetScanResults, stack = " + b, new Object[0]);
            C80375c cVar = C80373t0.this.f235258b;
            cVar.getClass();
            if (!TextUtils.isEmpty(b)) {
                cVar.f235263c = b;
            }
            C80373t0.this.f235258b.f235262b++;
        }
    }

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.t0$c */
    public static final class C80375c {

        /* renamed from: a */
        public int f235261a;

        /* renamed from: b */
        public int f235262b;

        /* renamed from: c */
        public String f235263c = "";
    }

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.t0$b */
    public static class C80376b extends C114490k0.C114491a<C80376b> {

        /* renamed from: d */
        public C114490k0.C114491a.C114494b.C114497b<Integer> f235264d;

        /* renamed from: e */
        public C114490k0.C114491a.C114494b.C114497b<Integer> f235265e;

        /* renamed from: f */
        public String f235266f;

        /* renamed from: a */
        public C114490k0.C114491a.C114492a mo111825a(C114490k0.C114491a aVar) {
            return new C114533u0(this, (C80376b) aVar, this);
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
            com.tencent.matrix.batterycanary.monitor.feature.t0$a r0 = new com.tencent.matrix.batterycanary.monitor.feature.t0$a
            r0.<init>()
            r5.f235259c = r0
            java.util.List<ie.x$b> r1 = p981ie.C87713x.f253991a
            java.lang.Class<ie.x> r1 = p981ie.C87713x.class
            monitor-enter(r1)
            java.util.List<ie.x$b> r2 = p981ie.C87713x.f253991a     // Catch:{ all -> 0x0055 }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x0055 }
            boolean r2 = r2.contains(r0)     // Catch:{ all -> 0x0055 }
            if (r2 == 0) goto L_0x0023
            monitor-exit(r1)
            goto L_0x0058
        L_0x0023:
            java.util.List<ie.x$b> r2 = p981ie.C87713x.f253991a     // Catch:{ all -> 0x0055 }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x0055 }
            r2.add(r0)     // Catch:{ all -> 0x0055 }
            boolean r0 = p981ie.C87713x.f253992b     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x002f
            goto L_0x0053
        L_0x002f:
            java.util.List<ie.x$b> r0 = p981ie.C87713x.f253991a     // Catch:{ all -> 0x0055 }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x0055 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x003a
            goto L_0x0053
        L_0x003a:
            ie.u r0 = p981ie.C87713x.f253993c     // Catch:{ all -> 0x0055 }
            boolean r0 = r0.mo122132a()     // Catch:{ all -> 0x0055 }
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x0055 }
            r4 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0055 }
            r3[r4] = r0     // Catch:{ all -> 0x0055 }
            java.lang.String r0 = "Matrix.battery.WifiHooker"
            java.lang.String r4 = "checkHook hookRet:%b"
            p723vf.C118672d.m167353c(r0, r4, r3)     // Catch:{ all -> 0x0055 }
            p981ie.C87713x.f253992b = r2     // Catch:{ all -> 0x0055 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.matrix.batterycanary.monitor.feature.C80373t0.mo111817b():void");
    }

    /* renamed from: d */
    public int mo111818d() {
        return Integer.MIN_VALUE;
    }

    /* renamed from: f */
    public void mo111819f() {
        super.mo111819f();
        C87713x.C87715b bVar = this.f235259c;
        List<C87713x.C87715b> list = C87713x.f253991a;
        synchronized (C87713x.class) {
            if (bVar != null) {
                ((ArrayList) C87713x.f253991a).remove(bVar);
                if (C87713x.f253992b) {
                    if (((ArrayList) C87713x.f253991a).isEmpty()) {
                        C118672d.m167353c("Matrix.battery.WifiHooker", "checkUnHook unHookRet:%b", Boolean.valueOf(C87713x.f253993c.mo122133b()));
                        C87713x.f253992b = false;
                    }
                }
            }
        }
        C80375c cVar = this.f235258b;
        cVar.f235261a = 0;
        cVar.f235262b = 0;
    }

    /* renamed from: g */
    public String mo111820g() {
        return "Matrix.battery.WifiMonitorFeature";
    }
}
