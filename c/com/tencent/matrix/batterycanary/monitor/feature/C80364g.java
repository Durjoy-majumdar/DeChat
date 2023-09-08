package com.tencent.matrix.batterycanary.monitor.feature;

import android.bluetooth.le.ScanSettings;
import android.text.TextUtils;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import java.util.ArrayList;
import java.util.List;
import p1190de.C116608a;
import p723vf.C118672d;
import p981ie.C87699e;

/* renamed from: com.tencent.matrix.batterycanary.monitor.feature.g */
public final class C80364g extends C116608a {

    /* renamed from: b */
    public final C80366c f235235b = new C80366c();

    /* renamed from: c */
    public C87699e.C87701b f235236c;

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.g$a */
    public class C80365a implements C87699e.C87701b {
        public C80365a() {
        }

        /* renamed from: a */
        public void mo111821a(ScanSettings scanSettings) {
            C118672d.m167353c("Matrix.battery.BlueToothMonitorFeature", "#onStartScanForIntent", new Object[0]);
            C80364g.this.f235235b.f235240c++;
        }

        /* renamed from: b */
        public void mo111822b(int i, ScanSettings scanSettings) {
            C118672d.m167353c("Matrix.battery.BlueToothMonitorFeature", "#onStartScan, id = " + i, new Object[0]);
            C80366c cVar = C80364g.this.f235235b;
            cVar.f235240c = cVar.f235240c + 1;
        }

        /* renamed from: c */
        public void mo111823c() {
            String b = C80364g.this.mo180590h() ? C80364g.this.f349668a.f339057d.f339026A.mo122130b() : "";
            C118672d.m167353c("Matrix.battery.BlueToothMonitorFeature", "#onRegisterScanner, stack = " + b, new Object[0]);
            C80366c cVar = C80364g.this.f235235b;
            cVar.getClass();
            if (!TextUtils.isEmpty(b)) {
                cVar.f235241d = b;
            }
            C80364g.this.f235235b.f235238a++;
        }

        /* renamed from: d */
        public void mo111824d() {
            String b = C80364g.this.mo180590h() ? C80364g.this.f349668a.f339057d.f339026A.mo122130b() : "";
            C118672d.m167353c("Matrix.battery.BlueToothMonitorFeature", "#onStartDiscovery, stack = " + b, new Object[0]);
            C80366c cVar = C80364g.this.f235235b;
            cVar.getClass();
            if (!TextUtils.isEmpty(b)) {
                cVar.f235241d = b;
            }
            C80364g.this.f235235b.f235239b++;
        }
    }

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.g$c */
    public static final class C80366c {

        /* renamed from: a */
        public int f235238a;

        /* renamed from: b */
        public int f235239b;

        /* renamed from: c */
        public int f235240c;

        /* renamed from: d */
        public String f235241d = "";
    }

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.g$b */
    public static class C80367b extends C114490k0.C114491a<C80367b> {

        /* renamed from: d */
        public C114490k0.C114491a.C114494b.C114497b<Integer> f235242d;

        /* renamed from: e */
        public C114490k0.C114491a.C114494b.C114497b<Integer> f235243e;

        /* renamed from: f */
        public C114490k0.C114491a.C114494b.C114497b<Integer> f235244f;

        /* renamed from: g */
        public String f235245g;

        /* renamed from: a */
        public C114490k0.C114491a.C114492a mo111825a(C114490k0.C114491a aVar) {
            return new C114466h(this, (C80367b) aVar, this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo111817b() {
        /*
            r5 = this;
            super.mo111817b()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 26
            if (r0 >= r2) goto L_0x0015
            java.lang.String r0 = "Matrix.battery.BlueToothMonitorFeature"
            java.lang.String r2 = "only support >= android 8.0 for the moment"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            p723vf.C118672d.m167356f(r0, r2, r1)
            return
        L_0x0015:
            ce.g r0 = r5.f349668a
            ce.f r0 = r0.f339057d
            boolean r2 = r0.f339046q
            r3 = 1
            if (r2 != 0) goto L_0x0023
            int r0 = r0.f339047r
            r0 = r0 & r3
            if (r0 != r3) goto L_0x006a
        L_0x0023:
            com.tencent.matrix.batterycanary.monitor.feature.g$a r0 = new com.tencent.matrix.batterycanary.monitor.feature.g$a
            r0.<init>()
            r5.f235236c = r0
            java.util.List<ie.e$b> r2 = p981ie.C87699e.f253974a
            java.lang.Class<ie.e> r2 = p981ie.C87699e.class
            monitor-enter(r2)
            java.util.List<ie.e$b> r4 = p981ie.C87699e.f253974a     // Catch:{ all -> 0x006b }
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch:{ all -> 0x006b }
            boolean r4 = r4.contains(r0)     // Catch:{ all -> 0x006b }
            if (r4 == 0) goto L_0x003b
            monitor-exit(r2)
            goto L_0x006a
        L_0x003b:
            java.util.List<ie.e$b> r4 = p981ie.C87699e.f253974a     // Catch:{ all -> 0x006b }
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch:{ all -> 0x006b }
            r4.add(r0)     // Catch:{ all -> 0x006b }
            boolean r0 = p981ie.C87699e.f253975b     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0047
            goto L_0x0069
        L_0x0047:
            java.util.List<ie.e$b> r0 = p981ie.C87699e.f253974a     // Catch:{ all -> 0x006b }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x006b }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0052
            goto L_0x0069
        L_0x0052:
            ie.u r0 = p981ie.C87699e.f253976c     // Catch:{ all -> 0x006b }
            boolean r0 = r0.mo122132a()     // Catch:{ all -> 0x006b }
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x006b }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x006b }
            r4[r1] = r0     // Catch:{ all -> 0x006b }
            java.lang.String r0 = "Matrix.battery.BluetoothHooker"
            java.lang.String r1 = "checkHook hookRet:%b"
            p723vf.C118672d.m167353c(r0, r1, r4)     // Catch:{ all -> 0x006b }
            p981ie.C87699e.f253975b = r3     // Catch:{ all -> 0x006b }
        L_0x0069:
            monitor-exit(r2)
        L_0x006a:
            return
        L_0x006b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.matrix.batterycanary.monitor.feature.C80364g.mo111817b():void");
    }

    /* renamed from: d */
    public int mo111818d() {
        return Integer.MIN_VALUE;
    }

    /* renamed from: f */
    public void mo111819f() {
        super.mo111819f();
        C87699e.C87701b bVar = this.f235236c;
        List<C87699e.C87701b> list = C87699e.f253974a;
        synchronized (C87699e.class) {
            if (bVar != null) {
                ((ArrayList) C87699e.f253974a).remove(bVar);
                if (C87699e.f253975b) {
                    if (((ArrayList) C87699e.f253974a).isEmpty()) {
                        C118672d.m167353c("Matrix.battery.BluetoothHooker", "checkUnHook unHookRet:%b", Boolean.valueOf(C87699e.f253976c.mo122133b()));
                        C87699e.f253975b = false;
                    }
                }
            }
        }
        C80366c cVar = this.f235235b;
        cVar.f235238a = 0;
        cVar.f235239b = 0;
        cVar.f235240c = 0;
    }

    /* renamed from: g */
    public String mo111820g() {
        return "Matrix.battery.BlueToothMonitorFeature";
    }
}
