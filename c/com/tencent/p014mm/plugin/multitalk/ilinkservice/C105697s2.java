package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import lu3.C34379c;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.s2 */
public class C105697s2 {

    /* renamed from: a */
    public C105689s f314270a;

    /* renamed from: b */
    public int f314271b = 0;

    /* renamed from: c */
    public int f314272c = 0;

    /* renamed from: d */
    public C34379c<?> f314273d = null;

    /* renamed from: e */
    public C34379c<?> f314274e = null;

    /* renamed from: f */
    public boolean f314275f = false;

    public C105697s2(C105689s sVar) {
        this.f314270a = sVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r1 = r4.f314273d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001c, code lost:
        if (r1 == null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001e, code lost:
        r1.cancel(false);
        r4.f314273d = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0023, code lost:
        r1 = r4.f314274e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0025, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0027, code lost:
        r1.cancel(false);
        r4.f314274e = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo150561a() {
        /*
            r4 = this;
            boolean r0 = c92.C104331h.m139314g()
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.String r0 = "MicroMsg.Multitalk.ILinkVideoMgr"
            java.lang.String r1 = "release"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            monitor-enter(r4)     // Catch:{ Exception -> 0x0030 }
            boolean r0 = r4.f314275f     // Catch:{ all -> 0x002d }
            if (r0 != 0) goto L_0x0015
            monitor-exit(r4)     // Catch:{ all -> 0x002d }
            return
        L_0x0015:
            r0 = 0
            r4.f314275f = r0     // Catch:{ all -> 0x002d }
            monitor-exit(r4)     // Catch:{ all -> 0x002d }
            lu3.c<?> r1 = r4.f314273d     // Catch:{ Exception -> 0x0030 }
            r2 = 0
            if (r1 == 0) goto L_0x0023
            r1.cancel(r0)     // Catch:{ Exception -> 0x0030 }
            r4.f314273d = r2     // Catch:{ Exception -> 0x0030 }
        L_0x0023:
            lu3.c<?> r1 = r4.f314274e     // Catch:{ Exception -> 0x0030 }
            if (r1 == 0) goto L_0x004b
            r1.cancel(r0)     // Catch:{ Exception -> 0x0030 }
            r4.f314274e = r2     // Catch:{ Exception -> 0x0030 }
            goto L_0x004b
        L_0x002d:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x002d }
            throw r0     // Catch:{ Exception -> 0x0030 }
        L_0x0030:
            r0 = move-exception
            java.lang.String r1 = "MicroMsg.Multitalk.ILinkVideoMgr"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "release error:"
            r2.append(r3)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitalk.ilinkservice.C105697s2.mo150561a():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r2 = r10.f314273d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001d, code lost:
        if (r2 == null) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001f, code lost:
        r2.cancel(false);
        r10.f314273d = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0024, code lost:
        r10.f314273d = ((zt3.C119157j) zt3.C119157j.f356862d).mo183872c(new com.tencent.p014mm.plugin.multitalk.ilinkservice.C105673o2(r10), 0, 10);
        r2 = r10.f314274e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        if (r2 == null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        r2.cancel(false);
        r10.f314274e = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        r10.f314274e = ((zt3.C119157j) zt3.C119157j.f356862d).mo183872c(new com.tencent.p014mm.plugin.multitalk.ilinkservice.C105688r2(r10), 0, 10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
        return true;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo150562b() {
        /*
            r10 = this;
            boolean r0 = c92.C104331h.m139314g()
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.lang.String r0 = "MicroMsg.Multitalk.ILinkVideoMgr"
            java.lang.String r2 = "startPlay"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)
            monitor-enter(r10)     // Catch:{ Exception -> 0x0059 }
            boolean r0 = r10.f314275f     // Catch:{ all -> 0x0056 }
            if (r0 == 0) goto L_0x0016
            monitor-exit(r10)     // Catch:{ all -> 0x0056 }
            return r1
        L_0x0016:
            r0 = 1
            r10.f314275f = r0     // Catch:{ all -> 0x0056 }
            monitor-exit(r10)     // Catch:{ all -> 0x0056 }
            lu3.c<?> r2 = r10.f314273d     // Catch:{ Exception -> 0x0059 }
            r3 = 0
            if (r2 == 0) goto L_0x0024
            r2.cancel(r1)     // Catch:{ Exception -> 0x0059 }
            r10.f314273d = r3     // Catch:{ Exception -> 0x0059 }
        L_0x0024:
            zt3.t r2 = zt3.C119157j.f356862d     // Catch:{ Exception -> 0x0059 }
            com.tencent.mm.plugin.multitalk.ilinkservice.o2 r5 = new com.tencent.mm.plugin.multitalk.ilinkservice.o2     // Catch:{ Exception -> 0x0059 }
            r5.<init>(r10)     // Catch:{ Exception -> 0x0059 }
            r6 = 0
            r8 = 10
            r4 = r2
            zt3.j r4 = (zt3.C119157j) r4     // Catch:{ Exception -> 0x0059 }
            lu3.c r2 = r4.mo183872c(r5, r6, r8)     // Catch:{ Exception -> 0x0059 }
            r10.f314273d = r2     // Catch:{ Exception -> 0x0059 }
            lu3.c<?> r2 = r10.f314274e     // Catch:{ Exception -> 0x0059 }
            if (r2 == 0) goto L_0x0041
            r2.cancel(r1)     // Catch:{ Exception -> 0x0059 }
            r10.f314274e = r3     // Catch:{ Exception -> 0x0059 }
        L_0x0041:
            zt3.t r2 = zt3.C119157j.f356862d     // Catch:{ Exception -> 0x0059 }
            com.tencent.mm.plugin.multitalk.ilinkservice.r2 r4 = new com.tencent.mm.plugin.multitalk.ilinkservice.r2     // Catch:{ Exception -> 0x0059 }
            r4.<init>(r10)     // Catch:{ Exception -> 0x0059 }
            r5 = 0
            r7 = 10
            r3 = r2
            zt3.j r3 = (zt3.C119157j) r3     // Catch:{ Exception -> 0x0059 }
            lu3.c r2 = r3.mo183872c(r4, r5, r7)     // Catch:{ Exception -> 0x0059 }
            r10.f314274e = r2     // Catch:{ Exception -> 0x0059 }
            return r0
        L_0x0056:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0056 }
            throw r0     // Catch:{ Exception -> 0x0059 }
        L_0x0059:
            r0 = move-exception
            java.lang.String r2 = "MicroMsg.Multitalk.ILinkVideoMgr"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "startPlay error:"
            r3.append(r4)
            java.lang.String r0 = r0.toString()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitalk.ilinkservice.C105697s2.mo150562b():boolean");
    }
}
