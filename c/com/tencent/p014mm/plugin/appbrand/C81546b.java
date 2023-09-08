package com.tencent.p014mm.plugin.appbrand;

import ai0.C79553f;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC$$n;
import com.tencent.p014mm.plugin.appbrand.C84073q2;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84185b;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84217q;
import com.tencent.p014mm.plugin.appbrand.report.quality.QualitySessionRuntime;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import gu0.C87386b;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import rx3.C13604l;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.appbrand.b */
public final class C81546b implements C84073q2.C84078e {

    /* renamed from: a */
    public final List<C83195k3> f239161a = new ArrayList();

    /* renamed from: b */
    public final byte[] f239162b = {0};

    /* renamed from: c */
    public C80669j f239163c;

    /* renamed from: d */
    public String f239164d;

    /* renamed from: e */
    public C13604l<Long, Long> f239165e = new C13604l<>(-1L, -1L);

    /* renamed from: f */
    public C81925i2 f239166f;

    /* renamed from: g */
    public long f239167g = -1;

    /* renamed from: h */
    public long f239168h = -1;

    /* renamed from: i */
    public C84253s4 f239169i;

    /* renamed from: a */
    public void mo113812a(long j, long j2) {
        this.f239167g = j;
        this.f239168h = j2;
    }

    /* renamed from: b */
    public boolean mo113813b() {
        StringBuilder sb = new StringBuilder();
        sb.append("wokrerCreateInterruptor == null:  ");
        sb.append(this.f239169i == null);
        Log.m105924i("MicroMsg.AppBrandAdWorkerHolder", sb.toString());
        C84253s4 s4Var = this.f239169i;
        if (s4Var == null) {
            return false;
        }
        C87412m.m108591d(s4Var);
        AppBrandRuntimeWC$$n.C81094a aVar = (AppBrandRuntimeWC$$n.C81094a) s4Var;
        QualitySessionRuntime a = C84185b.m103768a(AppBrandRuntimeWC$$n.this.f238331a);
        if (a == null) {
            Log.m105925i("MicroMsg.AppBrandRuntimeWC", "[createWXLibWorker]mAdWorkerHolder.WorkerCreateInterruptor.isInterrupt, qualitySession not open for appId:%s, return", AppBrandRuntimeWC$$n.this.f238331a.f238147j);
        } else {
            Log.m105925i("MicroMsg.AppBrandRuntimeWC", "[createWXLibWorker]mAdWorkerHolder.WorkerCreateInterruptor.isInterrupt, appId:%s serviceInitType:%s", AppBrandRuntimeWC$$n.this.f238331a.f238147j, a.f245842C);
            if (a.f245842C != C84217q.PreloadOnProcessCreated) {
                Log.m105924i("MicroMsg.AppBrandRuntimeWC", "[createWXLibWorker]  not in preloading");
                if (!C79553f.m96594a(AppBrandRuntimeWC$$n.this.f238331a)) {
                    Log.m105924i("MicroMsg.AppBrandRuntimeWC", "[createWXLibWorker]  not adcontact");
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public void mo113814c(C87386b bVar) {
        C87412m.m108594g(bVar, "adWorkerInfo");
        Log.m105924i("MicroMsg.AppBrandAdWorkerHolder", "AdWorker created. store to holder, " + bVar);
        String decodeString = MultiProcessMMKV.getMMKV("paramsCache").decodeString("paramsCache", (String) null);
        C81925i2 i2Var = bVar.f253242g;
        C87412m.m108591d(i2Var);
        ICommLibReader k = i2Var.mo114272k();
        C87412m.m108591d(k);
        String valueOf = String.valueOf(k.mo113371a());
        if (decodeString == null || !C112551y.m153819s(decodeString, valueOf, false)) {
            StringBuilder sb = new StringBuilder();
            sb.append(valueOf);
            sb.append("#@#");
            sb.append(bVar.f253243h);
            Log.m105924i("MicroMsg.AppBrandAdWorkerHolder", "[createWXLibWorker]  params=" + bVar + ".params");
            MultiProcessMMKV.getMMKV("paramsCache").clear();
            MultiProcessMMKV.getMMKV("paramsCache").encode("paramsCache", sb.toString());
        }
        mo113818g(bVar);
    }

    /* renamed from: d */
    public final void mo113815d(AppBrandRuntime appBrandRuntime) {
        C84073q2 r0;
        C87412m.m108594g(appBrandRuntime, "runtime");
        C80669j jVar = this.f239163c;
        if (jVar != null) {
            jVar.mo112499c();
        }
        this.f239163c = null;
        ((ArrayList) this.f239161a).clear();
        this.f239165e = new C13604l<>(-1L, -1L);
        this.f239164d = null;
        C81925i2 b0 = appBrandRuntime.mo113047b0();
        if (b0 != null && (r0 = b0.mo114347r0()) != null) {
            synchronized (r0.f245482g) {
                r0.f245482g.remove(this);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006f, code lost:
        return true;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo113816e(com.tencent.p014mm.plugin.appbrand.C83195k3 r8) {
        /*
            r7 = this;
            byte[] r0 = r7.f239162b
            monitor-enter(r0)
            com.tencent.mm.appbrand.v8.j r1 = r7.f239163c     // Catch:{ all -> 0x0073 }
            r2 = 0
            if (r1 != 0) goto L_0x000e
            java.lang.String r3 = r7.f239164d     // Catch:{ all -> 0x0073 }
            if (r3 != 0) goto L_0x000e
            monitor-exit(r0)
            return r2
        L_0x000e:
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L_0x0051
            java.lang.String r1 = r7.f239164d     // Catch:{ all -> 0x0073 }
            if (r1 == 0) goto L_0x001c
            int r1 = r1.length()     // Catch:{ all -> 0x0073 }
            if (r1 != 0) goto L_0x001d
        L_0x001c:
            r2 = 1
        L_0x001d:
            if (r2 != 0) goto L_0x0051
            java.lang.String r1 = "MicroMsg.AppBrandAdWorkerHolder"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0073 }
            r2.<init>()     // Catch:{ all -> 0x0073 }
            java.lang.String r5 = "[obtainWorkerAsync]  workerEngine had created, but fail for["
            r2.append(r5)     // Catch:{ all -> 0x0073 }
            java.lang.String r5 = r7.f239164d     // Catch:{ all -> 0x0073 }
            r2.append(r5)     // Catch:{ all -> 0x0073 }
            java.lang.String r5 = "], trigger listener"
            r2.append(r5)     // Catch:{ all -> 0x0073 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0073 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ all -> 0x0073 }
            rx3.l r1 = new rx3.l     // Catch:{ all -> 0x0073 }
            r5 = -1
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0073 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0073 }
            r1.<init>(r2, r5)     // Catch:{ all -> 0x0073 }
            java.lang.String r2 = r7.f239164d     // Catch:{ all -> 0x0073 }
            r8.mo109680a(r4, r1, r2)     // Catch:{ all -> 0x0073 }
            goto L_0x006e
        L_0x0051:
            java.lang.String r1 = "MicroMsg.AppBrandAdWorkerHolder"
            java.lang.String r2 = "[obtainWorkerAsync]  workerEngine had created,trigger listener"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ all -> 0x0073 }
            byte[] r1 = r7.f239162b     // Catch:{ all -> 0x0073 }
            monitor-enter(r1)     // Catch:{ all -> 0x0073 }
            com.tencent.mm.appbrand.v8.j r2 = r7.f239163c     // Catch:{ all -> 0x0070 }
            if (r2 != 0) goto L_0x0061
            monitor-exit(r1)     // Catch:{ all -> 0x0073 }
            goto L_0x0067
        L_0x0061:
            monitor-exit(r1)     // Catch:{ all -> 0x0073 }
            com.tencent.mm.plugin.appbrand.a r4 = new com.tencent.mm.plugin.appbrand.a     // Catch:{ all -> 0x0073 }
            r4.<init>(r2)     // Catch:{ all -> 0x0073 }
        L_0x0067:
            rx3.l<java.lang.Long, java.lang.Long> r1 = r7.f239165e     // Catch:{ all -> 0x0073 }
            java.lang.String r2 = ""
            r8.mo109680a(r4, r1, r2)     // Catch:{ all -> 0x0073 }
        L_0x006e:
            monitor-exit(r0)
            return r3
        L_0x0070:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0073 }
            throw r8     // Catch:{ all -> 0x0073 }
        L_0x0073:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.C81546b.mo113816e(com.tencent.mm.plugin.appbrand.k3):boolean");
    }

    /* renamed from: f */
    public final boolean mo113817f(C83195k3 k3Var) {
        C87412m.m108594g(k3Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        if (mo113816e(k3Var)) {
            return true;
        }
        synchronized (this.f239161a) {
            ((ArrayList) this.f239161a).add(k3Var);
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.AppBrandAdWorkerHolder", "[storeWorker]  CreatedListeners size=" + ((java.util.ArrayList) r3.f239161a).size());
        r4 = new java.util.ArrayList();
        r0 = r3.f239161a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004e, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r4.addAll(r3.f239161a);
        ((java.util.ArrayList) r3.f239161a).clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005b, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005c, code lost:
        r4 = r4.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0064, code lost:
        if (r4.hasNext() == false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0066, code lost:
        mo113816e((com.tencent.p014mm.plugin.appbrand.C83195k3) r4.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0070, code lost:
        return;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo113818g(gu0.C87386b r4) {
        /*
            r3 = this;
            java.lang.String r0 = "adWorkerInfo"
            gy3.C87412m.m108594g(r4, r0)
            byte[] r0 = r3.f239162b
            monitor-enter(r0)
            com.tencent.mm.appbrand.v8.j r1 = r3.f239163c     // Catch:{ all -> 0x0074 }
            if (r1 == 0) goto L_0x000e
            monitor-exit(r0)
            return
        L_0x000e:
            com.tencent.mm.appbrand.v8.j r1 = r4.f253237b     // Catch:{ all -> 0x0074 }
            r3.f239163c = r1     // Catch:{ all -> 0x0074 }
            rx3.l<java.lang.Long, java.lang.Long> r1 = r4.f253238c     // Catch:{ all -> 0x0074 }
            r3.f239165e = r1     // Catch:{ all -> 0x0074 }
            java.lang.String r1 = r4.f253239d     // Catch:{ all -> 0x0074 }
            r3.f239164d = r1     // Catch:{ all -> 0x0074 }
            long r1 = r4.f253240e     // Catch:{ all -> 0x0074 }
            r3.f239168h = r1     // Catch:{ all -> 0x0074 }
            long r1 = r4.f253241f     // Catch:{ all -> 0x0074 }
            r3.f239167g = r1     // Catch:{ all -> 0x0074 }
            com.tencent.mm.plugin.appbrand.i2 r4 = r4.f253242g     // Catch:{ all -> 0x0074 }
            r3.f239166f = r4     // Catch:{ all -> 0x0074 }
            rx3.b0 r4 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0074 }
            monitor-exit(r0)
            java.lang.String r4 = "MicroMsg.AppBrandAdWorkerHolder"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[storeWorker]  CreatedListeners size="
            r0.append(r1)
            java.util.List<com.tencent.mm.plugin.appbrand.k3> r1 = r3.f239161a
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List<com.tencent.mm.plugin.appbrand.k3> r0 = r3.f239161a
            monitor-enter(r0)
            java.util.List<com.tencent.mm.plugin.appbrand.k3> r1 = r3.f239161a     // Catch:{ all -> 0x0071 }
            r4.addAll(r1)     // Catch:{ all -> 0x0071 }
            java.util.List<com.tencent.mm.plugin.appbrand.k3> r1 = r3.f239161a     // Catch:{ all -> 0x0071 }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x0071 }
            r1.clear()     // Catch:{ all -> 0x0071 }
            monitor-exit(r0)
            java.util.Iterator r4 = r4.iterator()
        L_0x0060:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0070
            java.lang.Object r0 = r4.next()
            com.tencent.mm.plugin.appbrand.k3 r0 = (com.tencent.p014mm.plugin.appbrand.C83195k3) r0
            r3.mo113816e(r0)
            goto L_0x0060
        L_0x0070:
            return
        L_0x0071:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        L_0x0074:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.C81546b.mo113818g(gu0.b):void");
    }
}
