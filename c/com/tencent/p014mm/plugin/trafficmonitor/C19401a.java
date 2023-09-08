package com.tencent.p014mm.plugin.trafficmonitor;

import c13.C0412w;
import c13.C104238k;
import c13.C113234h;
import c13.C16844r;
import c13.C28475f;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import java.util.TimerTask;

/* renamed from: com.tencent.mm.plugin.trafficmonitor.a */
public class C19401a extends TimerTask {

    /* renamed from: d */
    public long f54770d = 0;

    /* renamed from: e */
    public long f54771e;

    /* renamed from: f */
    public long f54772f;

    /* renamed from: g */
    public long f54773g;

    /* renamed from: h */
    public final /* synthetic */ C16844r f54774h;

    public C19401a(C16844r rVar) {
        long j;
        long j2;
        this.f54774h = rVar;
        long j3 = 0;
        if (C104238k.f308540e) {
            j = C104238k.f308537b + (System.currentTimeMillis() - C104238k.f308539d);
        } else {
            j = C104238k.f308537b;
        }
        this.f54771e = j;
        if (C104238k.f308540e) {
            long currentTimeMillis = System.currentTimeMillis() - C104238k.f308539d;
            long j4 = C104238k.f308538c;
            if (currentTimeMillis > 0) {
                Map<String, Long> map = C0412w.f1020a;
                if (((HashMap) map).containsKey(C104238k.f308541f)) {
                    Object obj = ((HashMap) map).get(C104238k.f308541f);
                    C87412m.m108591d(obj);
                    j3 = (long) (((double) ((Number) obj).longValue()) * ((((double) currentTimeMillis) / ((double) 1000)) / ((double) 60)));
                }
            }
            j2 = j4 + j3;
        } else {
            j2 = C104238k.f308538c;
        }
        this.f54772f = j2;
        Map<String, C28475f> map2 = C113234h.f338832a;
        this.f54773g = MultiProcessMMKV.getDefault().decodeLong("FileTransportStats_accumulateSize");
    }

    /* JADX WARNING: Removed duplicated region for block: B:159:0x0568  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0097 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0252  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r44 = this;
            r1 = r44
            c13.r r0 = r1.f54774h
            c13.l r0 = r0.f45499j
            c13.v r0 = (c13.C16845v) r0
            boolean r0 = r0.mo17893k()
            if (r0 != 0) goto L_0x000f
            return
        L_0x000f:
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r1.f54770d
            long r6 = r2 - r4
            java.lang.String r0 = "MicroMsg.TrafficInspector"
            r8 = 2
            r9 = 0
            r11 = 1
            r12 = 0
            int r13 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r13 != 0) goto L_0x0039
            java.lang.Object[] r13 = new java.lang.Object[r8]
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r13[r12] = r4
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            r13[r11] = r4
            java.lang.String r4 = "skip first time, lastNow=%d, now=%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r4, r13)
            r1.f54770d = r2
            goto L_0x0092
        L_0x0039:
            int r13 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r13 >= 0) goto L_0x0053
            java.lang.Object[] r13 = new java.lang.Object[r8]
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r13[r12] = r4
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            r13[r11] = r4
            java.lang.String r4 = "Time error, lastNow=%d, now=%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r4, r13)
            r1.f54770d = r2
            goto L_0x0092
        L_0x0053:
            r13 = 5
            c13.r r15 = r1.f54774h
            long r9 = r15.f45488b
            long r13 = r13 * r9
            int r15 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r15 <= 0) goto L_0x0075
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r9[r12] = r4
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            r9[r11] = r4
            java.lang.String r4 = "Time too long, lastNow=%d, now=%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r4, r9)
            r1.f54770d = r2
            goto L_0x0092
        L_0x0075:
            double r13 = (double) r6
            r18 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r9 = (double) r9
            double r9 = r9 * r18
            int r15 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r15 >= 0) goto L_0x0094
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r9[r12] = r4
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            r9[r11] = r4
            java.lang.String r4 = "Time too short, lastNow=%d, now=%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r4, r9)
        L_0x0092:
            r0 = 0
            goto L_0x0095
        L_0x0094:
            r0 = 1
        L_0x0095:
            if (r0 != 0) goto L_0x0098
            return
        L_0x0098:
            r1.f54770d = r2
            c13.r r0 = r1.f54774h
            int r4 = r0.f45489c
            if (r4 == 0) goto L_0x0108
            if (r4 == r11) goto L_0x00e9
            if (r4 == r8) goto L_0x00b4
            java.lang.String r0 = "MicroMsg.TrafficInspector"
            java.lang.String r2 = "error traffic type: type=%d"
            java.lang.Object[] r3 = new java.lang.Object[r11]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r12] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r2, r3)
            return
        L_0x00b4:
            c13.l r0 = r0.f45499j
            c13.v r0 = (c13.C16845v) r0
            r4 = 0
            long r16 = r0.mo17894l(r4)
            c13.r r0 = r1.f54774h
            c13.l r0 = r0.f45499j
            c13.v r0 = (c13.C16845v) r0
            long r9 = r0.mo17897o(r4)
            long r13 = r16 + r9
            c13.r r0 = r1.f54774h
            c13.l r0 = r0.f45499j
            c13.v r0 = (c13.C16845v) r0
            long r18 = r0.mo17895m(r4)
            c13.r r0 = r1.f54774h
            c13.l r0 = r0.f45499j
            c13.v r0 = (c13.C16845v) r0
            long r20 = r0.mo17896n(r4)
            long r18 = r18 + r20
            long r20 = r18 + r13
            r4 = r18
            r18 = r9
            r9 = r16
            goto L_0x0126
        L_0x00e9:
            r4 = 0
            c13.l r0 = r0.f45499j
            c13.v r0 = (c13.C16845v) r0
            long r9 = r0.mo17895m(r4)
            c13.r r0 = r1.f54774h
            c13.l r0 = r0.f45499j
            c13.v r0 = (c13.C16845v) r0
            long r13 = r0.mo17896n(r4)
            long r16 = r9 + r13
            r9 = r4
            r13 = r9
            r18 = r13
            r4 = r16
            r20 = r4
            goto L_0x0126
        L_0x0108:
            r4 = 0
            c13.l r0 = r0.f45499j
            c13.v r0 = (c13.C16845v) r0
            long r9 = r0.mo17894l(r4)
            c13.r r0 = r1.f54774h
            c13.l r0 = r0.f45499j
            c13.v r0 = (c13.C16845v) r0
            long r13 = r0.mo17897o(r4)
            long r4 = r9 + r13
            r20 = r4
            r18 = r13
            r13 = r20
            r4 = 0
        L_0x0126:
            java.lang.String r0 = "MicroMsg.TrafficInspector"
            java.lang.String r15 = "wxTotalTraffic=%d, interval=%d, realInterval=%d"
            r8 = 3
            java.lang.Object[] r11 = new java.lang.Object[r8]
            java.lang.Long r22 = java.lang.Long.valueOf(r20)
            r11[r12] = r22
            c13.r r8 = r1.f54774h
            r23 = r13
            long r12 = r8.f45488b
            java.lang.Long r8 = java.lang.Long.valueOf(r12)
            r12 = 1
            r11[r12] = r8
            java.lang.Long r8 = java.lang.Long.valueOf(r6)
            r12 = 2
            r11[r12] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r15, r11)
            boolean r0 = c13.C104238k.f308540e
            if (r0 == 0) goto L_0x015a
            long r11 = java.lang.System.currentTimeMillis()
            long r13 = c13.C104238k.f308539d
            long r11 = r11 - r13
            long r13 = c13.C104238k.f308537b
            long r13 = r13 + r11
            goto L_0x015c
        L_0x015a:
            long r13 = c13.C104238k.f308537b
        L_0x015c:
            long r11 = r1.f54771e
            long r11 = r13 - r11
            r1.f54771e = r13
            java.lang.String r0 = c13.C104238k.f308541f
            java.lang.String r8 = "MicroMsg.TrafficInspector"
            java.lang.String r13 = "floatBallInterval=%d, floatBallScene=%s"
            r14 = 2
            java.lang.Object[] r15 = new java.lang.Object[r14]
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r12 = 0
            r15[r12] = r11
            r11 = 1
            r15[r11] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r13, r15)
            c13.r r0 = r1.f54774h
            c13.l r0 = r0.f45499j
            c13.v r0 = (c13.C16845v) r0
            boolean r8 = r0.f45502b
            if (r8 == 0) goto L_0x01a8
            c13.b r0 = r0.f45501a
            r0.getClass()
            boolean r8 = r0.f234113c     // Catch:{ Exception -> 0x019e }
            if (r8 != 0) goto L_0x018c
            goto L_0x01a8
        L_0x018c:
            long r13 = android.net.TrafficStats.getMobileRxBytes()     // Catch:{ Exception -> 0x019e }
            long r11 = r0.f234111a     // Catch:{ Exception -> 0x019e }
            int r8 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r8 <= 0) goto L_0x0199
            r11 = 0
            goto L_0x019b
        L_0x0199:
            long r11 = r13 - r11
        L_0x019b:
            r0.f234111a = r13     // Catch:{ Exception -> 0x019e }
            goto L_0x01ad
        L_0x019e:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            java.lang.String r8 = "BaseTrafficStats"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
        L_0x01a8:
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x01ad:
            c13.r r0 = r1.f54774h
            c13.l r0 = r0.f45499j
            c13.v r0 = (c13.C16845v) r0
            boolean r8 = r0.f45502b
            if (r8 == 0) goto L_0x01e6
            c13.b r0 = r0.f45501a
            r0.getClass()
            boolean r8 = r0.f234113c     // Catch:{ Exception -> 0x01d9 }
            if (r8 != 0) goto L_0x01c1
            goto L_0x01e6
        L_0x01c1:
            long r13 = android.net.TrafficStats.getMobileTxBytes()     // Catch:{ Exception -> 0x01d9 }
            r27 = r4
            long r4 = r0.f234112b     // Catch:{ Exception -> 0x01d7 }
            int r8 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r8 <= 0) goto L_0x01d0
            r4 = 0
            goto L_0x01d2
        L_0x01d0:
            long r4 = r13 - r4
        L_0x01d2:
            r0.f234112b = r13     // Catch:{ Exception -> 0x01d7 }
            r25 = r4
            goto L_0x01ed
        L_0x01d7:
            r0 = move-exception
            goto L_0x01dc
        L_0x01d9:
            r0 = move-exception
            r27 = r4
        L_0x01dc:
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "BaseTrafficStats"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            goto L_0x01e8
        L_0x01e6:
            r27 = r4
        L_0x01e8:
            r25 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x01ed:
            c13.r r0 = r1.f54774h
            boolean r4 = r0.f45490d
            r5 = 4
            if (r4 != 0) goto L_0x0252
            int r2 = r0.f45489c
            r3 = 1
            if (r2 == r3) goto L_0x0251
            long r2 = r0.f45488b
            long r13 = r23 / r2
            r2 = 36000(0x8ca0, double:1.77864E-319)
            int r0 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x022c
            c13.x r0 = c13.C16846x.m16494b()
            java.util.Map<java.lang.Integer, c13.r> r0 = r0.f45512a
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x0214:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0224
            java.lang.Object r2 = r0.next()
            c13.r r2 = (c13.C16844r) r2
            r3 = 1
            r2.f45492f = r3
            goto L_0x0214
        L_0x0224:
            java.lang.String r0 = "MicroMsg.TrafficInspector"
            java.lang.String r2 = "skip next report, because traffic speed greater than 2G/min"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r2)
        L_0x022c:
            java.lang.String r0 = "MicroMsg.TrafficInspector"
            java.lang.String r2 = "Stats: wechat traffic && system traffic, wxMobileRx/Tx=%d/%d, mobileRx/Tx=%d/%d"
            java.lang.Object[] r3 = new java.lang.Object[r5]
            java.lang.Long r4 = java.lang.Long.valueOf(r9)
            r5 = 0
            r3[r5] = r4
            java.lang.Long r4 = java.lang.Long.valueOf(r18)
            r5 = 1
            r3[r5] = r4
            java.lang.Long r4 = java.lang.Long.valueOf(r11)
            r5 = 2
            r3[r5] = r4
            java.lang.Long r4 = java.lang.Long.valueOf(r25)
            r5 = 3
            r3[r5] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r2, r3)
        L_0x0251:
            return
        L_0x0252:
            r13 = 5242880(0x500000, double:2.590327E-317)
            long r29 = r9 - r13
            int r0 = (r29 > r11 ? 1 : (r29 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x0261
            long r29 = r18 - r13
            int r0 = (r29 > r25 ? 1 : (r29 == r25 ? 0 : -1))
            if (r0 <= 0) goto L_0x028a
        L_0x0261:
            java.lang.String r0 = "MicroMsg.TrafficInspector"
            java.lang.String r4 = "Error stats, wechat traffic more than system traffic, wxMobileRx/Tx=%d/%d, mobileRx/Tx=%d/%d"
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r10 = 0
            r8[r10] = r9
            java.lang.Long r9 = java.lang.Long.valueOf(r18)
            r10 = 1
            r8[r10] = r9
            java.lang.Long r9 = java.lang.Long.valueOf(r11)
            r11 = 2
            r8[r11] = r9
            java.lang.Long r9 = java.lang.Long.valueOf(r25)
            r11 = 3
            r8[r11] = r9
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r4, r8)
            c13.r r0 = r1.f54774h
            r0.f45492f = r10
        L_0x028a:
            long r2 = r2 - r6
            java.util.Map<java.lang.String, com.tencent.mm.plugin.trafficmonitor.TrafficClickFlowReceiver$b> r0 = com.tencent.p014mm.plugin.trafficmonitor.TrafficClickFlowReceiver.f54763a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4 = 0
            com.tencent.p014mm.plugin.trafficmonitor.TrafficClickFlowReceiver.f54766d = r4
            java.util.Deque<com.tencent.mm.plugin.trafficmonitor.TrafficClickFlowReceiver$b> r4 = com.tencent.p014mm.plugin.trafficmonitor.TrafficClickFlowReceiver.f54764b
            monitor-enter(r4)
            r8 = r4
            java.util.ArrayDeque r8 = (java.util.ArrayDeque) r8     // Catch:{ all -> 0x02dc }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x02dc }
        L_0x029f:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x02dc }
            if (r9 == 0) goto L_0x02df
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x02dc }
            com.tencent.mm.plugin.trafficmonitor.TrafficClickFlowReceiver$b r9 = (com.tencent.p014mm.plugin.trafficmonitor.TrafficClickFlowReceiver.C19400b) r9     // Catch:{ all -> 0x02dc }
            java.lang.String r10 = "MsgRetransmitUI"
            java.lang.String r11 = r9.f54767a     // Catch:{ all -> 0x02dc }
            boolean r10 = r10.equals(r11)     // Catch:{ all -> 0x02dc }
            if (r10 == 0) goto L_0x02b8
            r10 = 1
            com.tencent.p014mm.plugin.trafficmonitor.TrafficClickFlowReceiver.f54766d = r10     // Catch:{ all -> 0x02dc }
        L_0x02b8:
            long r10 = r9.f54769c     // Catch:{ all -> 0x02dc }
            int r12 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r12 <= 0) goto L_0x029f
            com.tencent.mm.plugin.trafficmonitor.TrafficClickFlowReceiver$b r10 = new com.tencent.mm.plugin.trafficmonitor.TrafficClickFlowReceiver$b     // Catch:{ all -> 0x02dc }
            r10.<init>()     // Catch:{ all -> 0x02dc }
            java.lang.String r11 = r9.f54767a     // Catch:{ all -> 0x02dc }
            r10.f54767a = r11     // Catch:{ all -> 0x02dc }
            long r11 = r9.f54768b     // Catch:{ all -> 0x02dc }
            r10.f54768b = r11     // Catch:{ all -> 0x02dc }
            long r13 = r9.f54769c     // Catch:{ all -> 0x02dc }
            r10.f54769c = r13     // Catch:{ all -> 0x02dc }
            long r11 = java.lang.Math.max(r11, r2)     // Catch:{ all -> 0x02dc }
            r10.f54768b = r11     // Catch:{ all -> 0x02dc }
            r0.add(r10)     // Catch:{ all -> 0x02dc }
            r13 = 5242880(0x500000, double:2.590327E-317)
            goto L_0x029f
        L_0x02dc:
            r0 = move-exception
            goto L_0x06d9
        L_0x02df:
            monitor-exit(r4)     // Catch:{ all -> 0x02dc }
            java.util.Map<java.lang.String, com.tencent.mm.plugin.trafficmonitor.TrafficClickFlowReceiver$b> r4 = com.tencent.p014mm.plugin.trafficmonitor.TrafficClickFlowReceiver.f54763a
            java.util.concurrent.ConcurrentHashMap r4 = (java.util.concurrent.ConcurrentHashMap) r4
            java.util.Collection r4 = r4.values()
            java.util.Iterator r4 = r4.iterator()
        L_0x02ec:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x0313
            java.lang.Object r8 = r4.next()
            com.tencent.mm.plugin.trafficmonitor.TrafficClickFlowReceiver$b r8 = (com.tencent.p014mm.plugin.trafficmonitor.TrafficClickFlowReceiver.C19400b) r8
            com.tencent.mm.plugin.trafficmonitor.TrafficClickFlowReceiver$b r9 = new com.tencent.mm.plugin.trafficmonitor.TrafficClickFlowReceiver$b
            r9.<init>()
            long r10 = r8.f54768b
            long r10 = java.lang.Math.max(r10, r2)
            r9.f54768b = r10
            java.lang.String r8 = r8.f54767a
            r9.f54767a = r8
            long r10 = java.lang.System.currentTimeMillis()
            r9.f54769c = r10
            r0.add(r9)
            goto L_0x02ec
        L_0x0313:
            boolean r2 = com.tencent.p014mm.plugin.trafficmonitor.TrafficClickFlowReceiver.f54766d
            int r3 = r0.size()
            if (r3 != 0) goto L_0x032a
            java.lang.String r0 = "MicroMsg.TrafficInspector"
            java.lang.String r2 = "Length of uiObjects is 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            c13.r r0 = r1.f54774h
            r2 = 0
            r0.f45491e = r2
            r0.f45492f = r2
            return
        L_0x032a:
            java.util.Map<java.lang.String, c13.f> r3 = c13.C113234h.f338832a
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r3 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
            java.lang.String r4 = "FileTransportStats_accumulateSize"
            long r3 = r3.decodeLong(r4)
            long r8 = r1.f54773g
            long r8 = r3 - r8
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 >= 0) goto L_0x035c
            r10 = 2
            java.lang.Object[] r8 = new java.lang.Object[r10]
            java.lang.Long r9 = java.lang.Long.valueOf(r3)
            r10 = 0
            r8[r10] = r9
            long r9 = r1.f54773g
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r10 = 1
            r8[r10] = r9
            java.lang.String r9 = "MicroMsg.TrafficInspector"
            java.lang.String r10 = "error: fileTransportSize(%d) < lastFileTransportSize(%d)"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r10, r8)
            r8 = 0
        L_0x035c:
            r1.f54773g = r3
            boolean r3 = c13.C104238k.f308540e
            if (r3 == 0) goto L_0x03a1
            long r3 = java.lang.System.currentTimeMillis()
            long r10 = c13.C104238k.f308539d
            long r3 = r3 - r10
            long r10 = c13.C104238k.f308538c
            r12 = 0
            int r14 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x039d
            java.util.Map<java.lang.String, java.lang.Long> r12 = c13.C0412w.f1020a
            java.lang.String r13 = c13.C104238k.f308541f
            r14 = r12
            java.util.HashMap r14 = (java.util.HashMap) r14
            boolean r13 = r14.containsKey(r13)
            if (r13 == 0) goto L_0x039d
            java.lang.String r13 = c13.C104238k.f308541f
            java.util.HashMap r12 = (java.util.HashMap) r12
            java.lang.Object r12 = r12.get(r13)
            gy3.C87412m.m108591d(r12)
            java.lang.Number r12 = (java.lang.Number) r12
            long r12 = r12.longValue()
            double r12 = (double) r12
            double r3 = (double) r3
            r14 = 1000(0x3e8, float:1.401E-42)
            double r14 = (double) r14
            double r3 = r3 / r14
            r14 = 60
            double r14 = (double) r14
            double r3 = r3 / r14
            double r12 = r12 * r3
            long r3 = (long) r12
            goto L_0x039f
        L_0x039d:
            r3 = 0
        L_0x039f:
            long r10 = r10 + r3
            goto L_0x03a3
        L_0x03a1:
            long r10 = c13.C104238k.f308538c
        L_0x03a3:
            long r3 = r1.f54772f
            long r3 = r10 - r3
            r1.f54772f = r10
            java.lang.String r10 = "MicroMsg.TrafficInspector"
            java.lang.String r11 = "fileTransportCost: %d, floatBallPredictCost: %d"
            r12 = 2
            java.lang.Object[] r13 = new java.lang.Object[r12]
            java.lang.Long r12 = java.lang.Long.valueOf(r8)
            r14 = 0
            r13[r14] = r12
            java.lang.Long r12 = java.lang.Long.valueOf(r3)
            r15 = 1
            r13[r15] = r12
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r11, r13)
            c13.r r10 = r1.f54774h
            com.tencent.mm.plugin.trafficmonitor.b r10 = r10.f45487a
            r10.getClass()
            java.lang.Object[] r11 = new java.lang.Object[r15]
            java.lang.Long r12 = java.lang.Long.valueOf(r6)
            r11[r14] = r12
            java.lang.String r12 = "Traf.TrafficModel"
            java.lang.String r13 = "realInterval:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r13, r11)
            r25 = 5000(0x1388, double:2.4703E-320)
            r13 = 6
            int r15 = (r6 > r25 ? 1 : (r6 == r25 ? 0 : -1))
            if (r15 > 0) goto L_0x03e1
            r3 = r6
            goto L_0x0565
        L_0x03e1:
            r10.f54778d = r14
            r14 = 1
            r10.f54779e = r14
            r14 = 0
            r10.f54776b = r14
            r16 = r14
            r14 = 0
        L_0x03ed:
            int r15 = r0.size()
            r29 = 4652007308841189376(0x408f400000000000, double:1000.0)
            r31 = 4707387510509010944(0x4154000000000000, double:5242880.0)
            r33 = 4633641066610819072(0x404e000000000000, double:60.0)
            if (r14 >= r15) goto L_0x04b5
            java.lang.Object r15 = r0.get(r14)
            com.tencent.mm.plugin.trafficmonitor.TrafficClickFlowReceiver$b r15 = (com.tencent.p014mm.plugin.trafficmonitor.TrafficClickFlowReceiver.C19400b) r15
            r35 = r12
            long r11 = r15.f54769c
            java.lang.Object r15 = r0.get(r14)
            com.tencent.mm.plugin.trafficmonitor.TrafficClickFlowReceiver$b r15 = (com.tencent.p014mm.plugin.trafficmonitor.TrafficClickFlowReceiver.C19400b) r15
            r36 = r6
            long r5 = r15.f54768b
            long r11 = r11 - r5
            long r16 = r16 + r11
            java.lang.Object r5 = r0.get(r14)
            com.tencent.mm.plugin.trafficmonitor.TrafficClickFlowReceiver$b r5 = (com.tencent.p014mm.plugin.trafficmonitor.TrafficClickFlowReceiver.C19400b) r5
            java.lang.String r5 = r5.f54767a
            if (r5 != 0) goto L_0x041f
            java.lang.String r5 = "null"
        L_0x041f:
            java.lang.String r6 = "_"
            boolean r15 = r5.contains(r6)
            if (r15 == 0) goto L_0x0430
            int r6 = r5.indexOf(r6)
            r15 = 0
            java.lang.String r5 = r5.substring(r15, r6)
        L_0x0430:
            boolean r6 = r10.f54778d
            if (r6 != 0) goto L_0x0447
            java.lang.String r6 = "AppBrandUI"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x0447
            java.lang.String r6 = "WebViewUI"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L_0x0445
            goto L_0x0447
        L_0x0445:
            r6 = 0
            goto L_0x0448
        L_0x0447:
            r6 = 1
        L_0x0448:
            r10.f54778d = r6
            java.util.Map<java.lang.String, java.lang.Long> r6 = c13.C0412w.f1020a
            java.util.HashMap r6 = (java.util.HashMap) r6
            boolean r15 = r6.containsKey(r5)
            if (r15 == 0) goto L_0x0473
            r38 = r8
            long r7 = r10.f54776b
            double r7 = (double) r7
            java.lang.Object r5 = r6.get(r5)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            double r5 = (double) r5
            double r11 = (double) r11
            double r11 = r11 / r29
            double r11 = r11 / r33
            double r5 = r5 * r11
            double r7 = r7 + r5
            long r5 = (long) r7
            r10.f54776b = r5
            r5 = 0
            r10.f54779e = r5
            goto L_0x04aa
        L_0x0473:
            r38 = r8
            java.lang.String r7 = "Finder"
            boolean r5 = r5.startsWith(r7)
            if (r5 == 0) goto L_0x049c
            long r7 = r10.f54776b
            double r7 = (double) r7
            java.lang.String r5 = "FinderHomeAffinityUI"
            java.lang.Object r5 = r6.get(r5)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            double r5 = (double) r5
            double r11 = (double) r11
            double r11 = r11 / r29
            double r11 = r11 / r33
            double r5 = r5 * r11
            double r7 = r7 + r5
            long r5 = (long) r7
            r10.f54776b = r5
            r5 = 0
            r10.f54779e = r5
            goto L_0x04aa
        L_0x049c:
            long r5 = r10.f54776b
            double r5 = (double) r5
            double r7 = (double) r11
            double r7 = r7 / r29
            double r7 = r7 / r33
            double r7 = r7 * r31
            double r5 = r5 + r7
            long r5 = (long) r5
            r10.f54776b = r5
        L_0x04aa:
            int r14 = r14 + 1
            r12 = r35
            r6 = r36
            r8 = r38
            r5 = 4
            goto L_0x03ed
        L_0x04b5:
            r36 = r6
            r38 = r8
            r35 = r12
            long r5 = r10.f54776b
            long r5 = r5 + r3
            r10.f54776b = r5
            int r3 = (r16 > r36 ? 1 : (r16 == r36 ? 0 : -1))
            if (r3 >= 0) goto L_0x04d2
            double r3 = (double) r5
            long r6 = r36 - r16
            double r5 = (double) r6
            double r5 = r5 * r31
            double r5 = r5 / r29
            double r5 = r5 / r33
            double r3 = r3 + r5
            long r3 = (long) r3
            r10.f54776b = r3
        L_0x04d2:
            r3 = 1000(0x3e8, double:4.94E-321)
            long r6 = r36 / r3
            r3 = 60
            long r6 = r6 / r3
            r3 = 5242880(0x500000, double:2.590327E-317)
            long r6 = r6 * r3
            long r3 = r10.f54776b
            long r3 = java.lang.Math.max(r6, r3)
            long r3 = r3 + r38
            r10.f54776b = r3
            r3 = r36
            double r5 = (double) r3
            r7 = 4678479150791524352(0x40ed4c0000000000, double:60000.0)
            double r11 = r5 / r7
            r14 = -4627718833100826870(0xbfc70a3d70a3d70a, double:-0.18)
            double r14 = r14 * r11
            r7 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r14 = r14 + r7
            double r7 = java.lang.Math.min(r7, r14)
            r14 = 4617315517961601024(0x4014000000000000, double:5.0)
            double r7 = java.lang.Math.max(r7, r14)
            double r11 = r11 * r7
            r7 = 4697254411347427328(0x4130000000000000, double:1048576.0)
            double r11 = r11 * r7
            long r11 = (long) r11
            r10.f54775a = r11
            long r14 = r10.f54776b
            long r11 = r11 + r14
            long r11 = r20 - r11
            double r11 = (double) r11
            double r11 = r11 / r7
            r7 = 0
            double r7 = java.lang.Math.max(r7, r11)
            double r7 = r7 / r5
            r5 = 4678479150791524352(0x40ed4c0000000000, double:60000.0)
            double r5 = r5 * r7
            r10.f54777c = r5
            java.lang.Object[] r8 = new java.lang.Object[r13]
            java.lang.Long r7 = java.lang.Long.valueOf(r20)
            r11 = 0
            r8[r11] = r7
            long r11 = r10.f54775a
            java.lang.Long r7 = java.lang.Long.valueOf(r11)
            r11 = 1
            r8[r11] = r7
            java.lang.Long r7 = java.lang.Long.valueOf(r38)
            r11 = 2
            r8[r11] = r7
            long r10 = r10.f54776b
            java.lang.Long r7 = java.lang.Long.valueOf(r10)
            r10 = 3
            r8[r10] = r7
            java.lang.Long r7 = java.lang.Long.valueOf(r3)
            r9 = 4
            r8[r9] = r7
            java.lang.Double r9 = java.lang.Double.valueOf(r5)
            r10 = 5
            r8[r10] = r9
            java.lang.String r9 = "compute Traffic realTraffic:%d, standardTraffic:%d, fileCost:%d, predictionTraffic:%d, realInterval:%d, result=%f"
            r10 = r35
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r9, r8)
            r8 = 4624633867356078080(0x402e000000000000, double:15.0)
            int r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r10 < 0) goto L_0x0565
            r5 = 1
            goto L_0x0566
        L_0x0565:
            r5 = 0
        L_0x0566:
            if (r5 == 0) goto L_0x06d1
            c13.r r5 = r1.f54774h
            boolean r6 = r5.f45492f
            if (r6 != 0) goto L_0x06d1
            com.tencent.mm.plugin.trafficmonitor.b r5 = r5.f45487a
            double r5 = r5.f54777c
            long r8 = java.lang.Math.round(r5)
            int r9 = (int) r8
            if (r9 < r13) goto L_0x0582
            int r8 = r9 + 54
            r10 = 64
            int r8 = java.lang.Math.min(r8, r10)
            goto L_0x0583
        L_0x0582:
            r8 = 0
        L_0x0583:
            java.lang.String r10 = "MicroMsg.TrafficInspector"
            java.lang.String r11 = "Traffic Exceed ExceedIndex : %s"
            r12 = 1
            java.lang.Object[] r14 = new java.lang.Object[r12]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            r15 = 0
            r14[r15] = r12
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r11, r14)
            kj2.d r36 = kj2.C117407d.INSTANCE
            r37 = 877(0x36d, double:4.333E-321)
            long r10 = (long) r8
            r41 = 1
            r43 = 1
            r39 = r10
            r36.idkeyStat(r37, r39, r41, r43)
            r8 = 20
            if (r9 < r8) goto L_0x06d1
            c13.r r8 = r1.f54774h
            long r10 = r8.f45488b
            c13.a$a r8 = r8.f45493g
            if (r8 == 0) goto L_0x05b5
            c13.x$$a r8 = (c13.x$$a) r8
            c13.x r8 = r8.f45515a
            r8.getClass()
        L_0x05b5:
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.Intent r10 = new android.content.Intent
            java.lang.String r11 = "com.tencent.mm.Intent.ACTION_START_TRAFFIC_COLLECTOR"
            r10.<init>(r11)
            r8.sendBroadcast(r10)
            java.util.Map<java.lang.String, c13.h$$c> r8 = c13.C113234h.f338835d
            java.util.concurrent.ConcurrentHashMap r8 = (java.util.concurrent.ConcurrentHashMap) r8
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
            r10 = 0
            r25 = 0
        L_0x05d2:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L_0x05fb
            java.lang.Object r11 = r8.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r12 = r11.getValue()
            c13.h$$c r12 = (c13.h$$c) r12
            long r14 = r12.f338836a
            int r12 = (r14 > r25 ? 1 : (r14 == r25 ? 0 : -1))
            if (r12 <= 0) goto L_0x05d2
            java.lang.Object r10 = r11.getValue()
            c13.h$$c r10 = (c13.h$$c) r10
            long r14 = r10.f338836a
            java.lang.Object r10 = r11.getKey()
            java.lang.String r10 = (java.lang.String) r10
            r25 = r14
            goto L_0x05d2
        L_0x05fb:
            android.util.Pair r8 = new android.util.Pair
            java.lang.Long r11 = java.lang.Long.valueOf(r25)
            r8.<init>(r10, r11)
            java.util.Locale r10 = java.util.Locale.getDefault()
            java.lang.String r11 = "exceedIndex=%f, standardTraffic=%d, abnormalFileTransport=%b, maxRepetitionFileId=%s, maxRepetitionCount=%d, containMsgRetransmitUI=%b, date=[%s]"
            r12 = 7
            java.lang.Object[] r14 = new java.lang.Object[r12]
            java.lang.Double r5 = java.lang.Double.valueOf(r5)
            r6 = 0
            r14[r6] = r5
            c13.r r5 = r1.f54774h
            com.tencent.mm.plugin.trafficmonitor.b r5 = r5.f45487a
            long r5 = r5.f54775a
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r6 = 1
            r14[r6] = r5
            c13.r r5 = r1.f54774h
            boolean r5 = r5.f45491e
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r6 = 2
            r14[r6] = r5
            java.lang.Object r5 = r8.first
            r6 = 3
            r14[r6] = r5
            java.lang.Object r5 = r8.second
            r6 = 4
            r14[r6] = r5
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r5 = 5
            r14[r5] = r2
            java.text.DateFormat r2 = c13.C16844r.f45496k
            java.util.Date r5 = new java.util.Date
            r5.<init>()
            java.lang.String r2 = r2.format(r5)
            r14[r13] = r2
            java.lang.String r2 = java.lang.String.format(r10, r11, r14)
            kj2.d r5 = kj2.C117407d.INSTANCE
            r6 = 15856(0x3df0, float:2.2219E-41)
            r8 = 13
            java.lang.Object[] r8 = new java.lang.Object[r8]
            c13.r r10 = r1.f54774h
            long r10 = r10.f45488b
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r11 = 0
            r8[r11] = r10
            java.lang.String r0 = r0.toString()
            r10 = 1
            r8[r10] = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r20)
            r10 = 2
            r8[r10] = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r23)
            r10 = 3
            r8[r10] = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r27)
            r7 = 4
            r8[r7] = r0
            c13.r r0 = r1.f54774h
            com.tencent.mm.plugin.trafficmonitor.b r0 = r0.f45487a
            long r10 = r0.f54776b
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            r7 = 5
            r8[r7] = r0
            r8[r13] = r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r8[r12] = r0
            r0 = 8
            boolean r2 = c13.C16846x.f45511e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r8[r0] = r2
            r0 = 9
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getProcessName()
            r8[r0] = r2
            r0 = 10
            java.lang.Long r2 = java.lang.Long.valueOf(r3)
            r8[r0] = r2
            r0 = 11
            c13.r r2 = r1.f54774h
            com.tencent.mm.plugin.trafficmonitor.b r2 = r2.f45487a
            boolean r3 = r2.f54779e
            if (r3 == 0) goto L_0x06b9
            r2 = 401(0x191, float:5.62E-43)
            goto L_0x06c2
        L_0x06b9:
            boolean r2 = r2.f54778d
            if (r2 == 0) goto L_0x06c0
            r2 = 403(0x193, float:5.65E-43)
            goto L_0x06c2
        L_0x06c0:
            r2 = 402(0x192, float:5.63E-43)
        L_0x06c2:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r8[r0] = r2
            r0 = 12
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.BuildInfo.REV
            r8[r0] = r2
            r5.mo160131h(r6, r8)
        L_0x06d1:
            c13.r r0 = r1.f54774h
            r2 = 0
            r0.f45491e = r2
            r0.f45492f = r2
            return
        L_0x06d9:
            monitor-exit(r4)     // Catch:{ all -> 0x02dc }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.trafficmonitor.C19401a.run():void");
    }
}
