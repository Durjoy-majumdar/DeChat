package com.tencent.p014mm.pluginsdk.res.downloader.model;

/* renamed from: com.tencent.mm.pluginsdk.res.downloader.model.s */
public class C115906s implements Runnable {

    /* renamed from: com.tencent.mm.pluginsdk.res.downloader.model.s$a */
    public class C115907a implements Runnable {
        public C115907a(C115906s sVar) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0024 A[SYNTHETIC, Splitter:B:10:0x0024] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x001d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r5 = this;
                f40.e r0 = f40.C86709a0.m107523b()
                boolean r0 = r0.mo121114l()
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x0018
                f40.C86709a0.m107523b()
                boolean r0 = f40.C86718e.m107551r()
                if (r0 == 0) goto L_0x0016
                goto L_0x0018
            L_0x0016:
                r0 = 1
                goto L_0x0019
            L_0x0018:
                r0 = 0
            L_0x0019:
                java.lang.String r3 = "MicroMsg.PostTaskCheckResume"
                if (r0 != 0) goto L_0x0024
                java.lang.String r0 = "try resumeAllAndEvictExpired but account not ready"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
                return
            L_0x0024:
                com.tencent.mm.pluginsdk.res.downloader.model.t r0 = com.tencent.p014mm.pluginsdk.res.downloader.model.C115908t.C115910b.f347790a     // Catch:{ SQLiteDatabaseCorruptException -> 0x0037, SQLiteDatabaseCorruptException -> 0x0035 }
                int r4 = p156gj.C87198e0.m108253a()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0037, SQLiteDatabaseCorruptException -> 0x0035 }
                if (r4 == 0) goto L_0x0030
                if (r4 == r1) goto L_0x0031
                r1 = 2
                goto L_0x0031
            L_0x0030:
                r1 = 0
            L_0x0031:
                r0.mo176454f(r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0037, SQLiteDatabaseCorruptException -> 0x0035 }
                goto L_0x0040
            L_0x0035:
                r0 = move-exception
                goto L_0x0038
            L_0x0037:
                r0 = move-exception
            L_0x0038:
                java.lang.Object[] r1 = new java.lang.Object[r2]
                java.lang.String r2 = "resumeAllAndEvictExpired"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r2, r1)
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.res.downloader.model.C115906s.C115907a.run():void");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r6 = this;
            f40.e r0 = f40.C86709a0.m107523b()
            boolean r0 = r0.mo121114l()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0018
            f40.C86709a0.m107523b()
            boolean r0 = f40.C86718e.m107551r()
            if (r0 == 0) goto L_0x0016
            goto L_0x0018
        L_0x0016:
            r0 = 1
            goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            if (r0 != 0) goto L_0x001c
            return
        L_0x001c:
            int r0 = p156gj.C87198e0.m108253a()
            if (r0 == 0) goto L_0x0026
            if (r0 == r1) goto L_0x0027
            r1 = 2
            goto L_0x0027
        L_0x0026:
            r1 = 0
        L_0x0027:
            if (r1 != 0) goto L_0x002a
            return
        L_0x002a:
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_RES_DOWNLOADER_CHECK_RESUME_INTERVAL_LONG
            r4 = 0
            java.lang.Object r2 = r2.mo119685f(r3, r4)
            java.lang.Long r2 = (java.lang.Long) r2
            r4 = 0
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Long) r2, (long) r4)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x0070
            r4 = 7200(0x1c20, double:3.5573E-320)
            long r0 = r0 + r4
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.mo119677K(r3, r0)
            java.lang.String r0 = "MicroMsg.PostTaskCheckResume"
            java.lang.String r1 = "doCheckResume"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            com.tencent.mm.pluginsdk.res.downloader.model.t r0 = com.tencent.p014mm.pluginsdk.res.downloader.model.C115908t.C115910b.f347790a
            com.tencent.mm.sdk.platformtools.MMHandler r0 = r0.mo176450b()
            com.tencent.mm.pluginsdk.res.downloader.model.s$a r1 = new com.tencent.mm.pluginsdk.res.downloader.model.s$a
            r1.<init>(r6)
            r0.postToWorker(r1)
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.res.downloader.model.C115906s.run():void");
    }
}
