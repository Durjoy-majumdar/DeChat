package c13;

import android.content.BroadcastReceiver;

/* renamed from: c13.t */
public class C79919t extends BroadcastReceiver {
    public C79919t(C28478s sVar) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f3 A[Catch:{ all -> 0x01a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0105 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0108 A[SYNTHETIC, Splitter:B:55:0x0108] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r14, android.content.Intent r15) {
        /*
            r13 = this;
            java.lang.Class<h81.h> r14 = h81.C32735h.class
            r15 = 1
            c13.C16846x.f45511e = r15
            boolean r0 = qe3.C89625d.f257845k
            r1 = 0
            if (r0 != 0) goto L_0x0015
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r0 != 0) goto L_0x0015
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r0 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r0 = 0
            goto L_0x0016
        L_0x0015:
            r0 = 1
        L_0x0016:
            if (r0 != 0) goto L_0x0029
            di3.d r2 = di3.C86312j.m106911c(r14)
            h81.h r2 = (h81.C32735h) r2
            h81.h$c r3 = h81.C32735h.C32737c.clicfg_matrix_traffic_tx_new
            boolean r2 = r2.mo58784wf(r3, r1)
            if (r2 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r2 = 0
            goto L_0x002a
        L_0x0029:
            r2 = 1
        L_0x002a:
            if (r0 != 0) goto L_0x003d
            di3.d r3 = di3.C86312j.m106911c(r14)
            h81.h r3 = (h81.C32735h) r3
            h81.h$c r4 = h81.C32735h.C32737c.clicfg_matrix_traffic_dump_stacktrace_new
            boolean r3 = r3.mo58784wf(r4, r1)
            if (r3 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r3 = 0
            goto L_0x003e
        L_0x003d:
            r3 = 1
        L_0x003e:
            if (r0 != 0) goto L_0x0051
            di3.d r4 = di3.C86312j.m106911c(r14)
            h81.h r4 = (h81.C32735h) r4
            h81.h$c r5 = h81.C32735h.C32737c.clicfg_matrix_traffic_dump_native_backtrace_new
            boolean r4 = r4.mo58784wf(r5, r1)
            if (r4 == 0) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            r4 = 0
            goto L_0x0052
        L_0x0051:
            r4 = 1
        L_0x0052:
            if (r0 != 0) goto L_0x0065
            di3.d r5 = di3.C86312j.m106911c(r14)
            h81.h r5 = (h81.C32735h) r5
            h81.h$c r6 = h81.C32735h.C32737c.clicfg_matrix_traffic_lookup_ip_address
            boolean r5 = r5.mo58784wf(r6, r15)
            if (r5 == 0) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            r5 = 0
            goto L_0x0066
        L_0x0065:
            r5 = 1
        L_0x0066:
            if (r0 != 0) goto L_0x0079
            di3.d r14 = di3.C86312j.m106911c(r14)
            h81.h r14 = (h81.C32735h) r14
            h81.h$c r0 = h81.C32735h.C32737c.clicfg_matrix_traffic_enable_cluster
            boolean r14 = r14.mo58784wf(r0, r1)
            if (r14 == 0) goto L_0x0077
            goto L_0x0079
        L_0x0077:
            r14 = 0
            goto L_0x007a
        L_0x0079:
            r14 = 1
        L_0x007a:
            java.lang.String r0 = "Traf.WxTrafficStatsManager"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "setupTrafficCollector rxEnable = true, txEnable = "
            r6.append(r7)
            r6.append(r2)
            java.lang.String r7 = ", dumpStackTrace = "
            r6.append(r7)
            r6.append(r3)
            java.lang.String r7 = ", dumpNativeBacktrace = "
            r6.append(r7)
            r6.append(r4)
            java.lang.String r7 = ", hookAllSoReadWrite = "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r7 = ", enableTrafficCluster = "
            r6.append(r7)
            r6.append(r14)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r6)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.app.Application r0 = (android.app.Application) r0
            com.tencent.matrix.traffic.TrafficPlugin r6 = c13.C79914m.f234114a
            java.lang.Class<c13.m> r6 = c13.C79914m.class
            monitor-enter(r6)
            java.lang.String r7 = "MatrixTrafficCollector"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c3 }
            r8.<init>()     // Catch:{ all -> 0x01c3 }
            java.lang.String r9 = "setup, hasStarted = "
            r8.append(r9)     // Catch:{ all -> 0x01c3 }
            boolean r9 = c13.C79914m.f234116c     // Catch:{ all -> 0x01c3 }
            r8.append(r9)     // Catch:{ all -> 0x01c3 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x01c3 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)     // Catch:{ all -> 0x01c3 }
            r7 = 0
            c13.C79914m.f234119f = r7     // Catch:{ all -> 0x01c3 }
            c13.C79914m.f234120g = r1     // Catch:{ all -> 0x01c3 }
            c13.C79914m.f234125l = r7     // Catch:{ all -> 0x01c3 }
            c13.C79914m.f234124k = r7     // Catch:{ all -> 0x01c3 }
            c13.C79914m.f234117d = r15     // Catch:{ all -> 0x01c3 }
            boolean r7 = qe3.C89625d.f257845k     // Catch:{ all -> 0x01c3 }
            if (r7 != 0) goto L_0x00f0
            boolean r7 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG     // Catch:{ all -> 0x01c3 }
            if (r7 != 0) goto L_0x00f0
            boolean r7 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED     // Catch:{ all -> 0x01c3 }
            if (r7 == 0) goto L_0x00ee
            goto L_0x00f0
        L_0x00ee:
            r7 = 0
            goto L_0x00f1
        L_0x00f0:
            r7 = 1
        L_0x00f1:
            if (r7 != 0) goto L_0x00fe
            java.lang.String r7 = "clicfg_matrix_traffic_safe_check"
            boolean r7 = p761yd.C38993b.m41995e(r7, r1)     // Catch:{ all -> 0x01c3 }
            if (r7 == 0) goto L_0x00fc
            goto L_0x00fe
        L_0x00fc:
            r7 = 0
            goto L_0x00ff
        L_0x00fe:
            r7 = 1
        L_0x00ff:
            c13.C79914m.f234122i = r7     // Catch:{ all -> 0x01c3 }
            boolean r7 = c13.C79914m.f234116c     // Catch:{ all -> 0x01c3 }
            if (r7 == 0) goto L_0x0108
            monitor-exit(r6)
            goto L_0x01c2
        L_0x0108:
            c13.C79914m.f234116c = r15     // Catch:{ all -> 0x01c3 }
            c13.C79917p.f234136d = r14     // Catch:{ all -> 0x01a1 }
            uf.a r14 = new uf.a     // Catch:{ all -> 0x01a1 }
            r14.<init>()     // Catch:{ all -> 0x01a1 }
            c13.C79914m.f234115b = r14     // Catch:{ all -> 0x01a1 }
            r14.f260466a = r15     // Catch:{ all -> 0x01a1 }
            r14.f260467b = r2     // Catch:{ all -> 0x01a1 }
            r14.f260468c = r3     // Catch:{ all -> 0x01a1 }
            r14.f260469d = r4     // Catch:{ all -> 0x01a1 }
            if (r5 != 0) goto L_0x011f
            r14.f260470e = r1     // Catch:{ all -> 0x01a1 }
        L_0x011f:
            java.lang.String r15 = "libwcdb.so"
            r14.mo124801a(r15)     // Catch:{ all -> 0x01a1 }
            uf.a r14 = c13.C79914m.f234115b     // Catch:{ all -> 0x01a1 }
            java.lang.String r15 = "libwechatxlog.so"
            r14.mo124801a(r15)     // Catch:{ all -> 0x01a1 }
            uf.a r14 = c13.C79914m.f234115b     // Catch:{ all -> 0x01a1 }
            java.lang.String r15 = "libmmkv.so"
            r14.mo124801a(r15)     // Catch:{ all -> 0x01a1 }
            uf.a r14 = c13.C79914m.f234115b     // Catch:{ all -> 0x01a1 }
            java.lang.String r15 = "libhardcoder.so"
            r14.mo124801a(r15)     // Catch:{ all -> 0x01a1 }
            uf.a r14 = c13.C79914m.f234115b     // Catch:{ all -> 0x01a1 }
            java.lang.String r15 = "libmmnode.so"
            r14.mo124801a(r15)     // Catch:{ all -> 0x01a1 }
            uf.a r14 = c13.C79914m.f234115b     // Catch:{ all -> 0x01a1 }
            java.lang.String r15 = "libFFmpeg.so"
            r14.mo124801a(r15)     // Catch:{ all -> 0x01a1 }
            uf.a r14 = c13.C79914m.f234115b     // Catch:{ all -> 0x01a1 }
            java.lang.String r15 = "libdynamicBg.so"
            r14.mo124801a(r15)     // Catch:{ all -> 0x01a1 }
            uf.a r14 = c13.C79914m.f234115b     // Catch:{ all -> 0x01a1 }
            java.lang.String r15 = "libwechatnormsg.so"
            r14.mo124801a(r15)     // Catch:{ all -> 0x01a1 }
            uf.a r14 = c13.C79914m.f234115b     // Catch:{ all -> 0x01a1 }
            java.lang.String r15 = "libwechatlv.so"
            r14.mo124801a(r15)     // Catch:{ all -> 0x01a1 }
            uf.a r14 = c13.C79914m.f234115b     // Catch:{ all -> 0x01a1 }
            java.lang.String r15 = "libwcwss.so"
            r14.mo124801a(r15)     // Catch:{ all -> 0x01a1 }
            uf.a r14 = c13.C79914m.f234115b     // Catch:{ all -> 0x01a1 }
            java.lang.String r15 = "libxffmpeg.so"
            r14.mo124801a(r15)     // Catch:{ all -> 0x01a1 }
            com.tencent.matrix.traffic.TrafficPlugin r14 = new com.tencent.matrix.traffic.TrafficPlugin     // Catch:{ all -> 0x01a1 }
            uf.a r15 = c13.C79914m.f234115b     // Catch:{ all -> 0x01a1 }
            r14.<init>(r15)     // Catch:{ all -> 0x01a1 }
            c13.C79914m.f234114a = r14     // Catch:{ all -> 0x01a1 }
            c13.n r15 = new c13.n     // Catch:{ all -> 0x01a1 }
            r15.<init>()     // Catch:{ all -> 0x01a1 }
            r14.mo112099c(r0, r15)     // Catch:{ all -> 0x01a1 }
            com.tencent.matrix.traffic.TrafficPlugin r14 = c13.C79914m.f234114a     // Catch:{ all -> 0x01a1 }
            r14.mo112100d()     // Catch:{ all -> 0x01a1 }
            java.lang.String r14 = "MatrixTrafficCollector"
            java.lang.String r15 = "setup, start done"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r15)     // Catch:{ all -> 0x01a1 }
            java.lang.String r14 = "clicfg_matrix_traffic_hook_report_interval"
            r2 = 60000(0xea60, double:2.9644E-319)
            long r11 = p761yd.C38993b.m41992b(r14, r2)     // Catch:{ all -> 0x01a1 }
            zt3.t r14 = zt3.C119157j.f356862d     // Catch:{ all -> 0x01a1 }
            c13.m$$a r8 = new c13.m$$a     // Catch:{ all -> 0x01a1 }
            r8.<init>()     // Catch:{ all -> 0x01a1 }
            r9 = 0
            r7 = r14
            zt3.j r7 = (zt3.C119157j) r7     // Catch:{ all -> 0x01a1 }
            r7.mo183872c(r8, r9, r11)     // Catch:{ all -> 0x01a1 }
            goto L_0x01c1
        L_0x01a1:
            r14 = move-exception
            c13.C79917p.f234136d = r1     // Catch:{ all -> 0x01c3 }
            c13.C79914m.f234116c = r1     // Catch:{ all -> 0x01c3 }
            java.lang.String r15 = "MatrixTrafficCollector"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c3 }
            r0.<init>()     // Catch:{ all -> 0x01c3 }
            java.lang.String r1 = "setup Matrix Traffic Collector failed, t = "
            r0.append(r1)     // Catch:{ all -> 0x01c3 }
            java.lang.String r14 = r14.getMessage()     // Catch:{ all -> 0x01c3 }
            r0.append(r14)     // Catch:{ all -> 0x01c3 }
            java.lang.String r14 = r0.toString()     // Catch:{ all -> 0x01c3 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r14)     // Catch:{ all -> 0x01c3 }
        L_0x01c1:
            monitor-exit(r6)
        L_0x01c2:
            return
        L_0x01c3:
            r14 = move-exception
            monitor-exit(r6)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: c13.C79919t.onReceive(android.content.Context, android.content.Intent):void");
    }
}
