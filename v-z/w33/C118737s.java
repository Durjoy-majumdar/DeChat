package w33;

import c30.C104289g;
import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import p981ie.C87705i;

/* renamed from: w33.s */
public final class C118737s<T> implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ C114467i f355273a;

    /* renamed from: b */
    public final /* synthetic */ C104289g f355274b;

    public C118737s(C114467i iVar, C104289g gVar) {
        this.f355273a = iVar;
        this.f355274b = gVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x017e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void accept(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$a r1 = (com.tencent.matrix.batterycanary.monitor.feature.C114490k0.C114491a.C114492a) r1
            com.tencent.matrix.batterycanary.monitor.feature.i r2 = r0.f355273a
            ce.a r2 = r2.f343163l
            if (r2 != 0) goto L_0x000f
            r2 = r0
            goto L_0x0281
        L_0x000f:
            boolean r2 = p212oe.C117750b.m166049g()
            if (r2 == 0) goto L_0x0018
            r4 = 10
            goto L_0x0019
        L_0x0018:
            r4 = 5
        L_0x0019:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "totalCpuLoad = "
            r5.append(r6)
            com.tencent.matrix.batterycanary.monitor.feature.i r6 = r0.f355273a
            int r6 = r6.mo173666j()
            r5.append(r6)
            java.lang.String r6 = ", threadNum = "
            r5.append(r6)
            RECORD r6 = r1.f343207c
            com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot r6 = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.JiffiesSnapshot) r6
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$b<java.lang.Integer> r6 = r6.f343064i
            r5.append(r6)
            java.lang.String r6 = ", deadNum = "
            r5.append(r6)
            RECORD r6 = r1.f343207c
            com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot r6 = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.JiffiesSnapshot) r6
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$c<com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot$ThreadJiffiesSnapshot> r6 = r6.f343065j
            java.util.List<ITEM> r6 = r6.f343212a
            int r6 = r6.size()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "MicroMsg.VoIPProfileReport"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            c30.g r5 = r0.f355274b
            com.tencent.matrix.batterycanary.monitor.feature.i r7 = r0.f355273a
            int r7 = r7.mo173666j()
            java.lang.String r8 = "total"
            r5.mo145953n(r8, r7)
            c30.g r5 = r0.f355274b
            com.tencent.matrix.batterycanary.monitor.feature.i r7 = r0.f355273a
            int r7 = r7.mo173672p()
            java.lang.String r8 = "totalNor"
            r5.mo145953n(r8, r7)
            c30.g r5 = r0.f355274b
            w33.f r7 = new w33.f
            r7.<init>(r1)
            java.lang.String r8 = "thread"
            w33.C118738t.m167430a(r5, r8, r7)
            gy3.d0 r5 = new gy3.d0
            r5.<init>()
            gy3.e0 r7 = new gy3.e0
            r7.<init>()
            RECORD r8 = r1.f343207c
            com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot r8 = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.JiffiesSnapshot) r8
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$c<com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot$ThreadJiffiesSnapshot> r8 = r8.f343063h
            java.util.List<ITEM> r8 = r8.f343212a
            java.util.Iterator r8 = r8.iterator()
            r10 = 0
        L_0x0094:
            boolean r11 = r8.hasNext()
            java.lang.String r12 = ": "
            if (r11 == 0) goto L_0x0134
            int r11 = r10 + 1
            java.lang.Object r14 = r8.next()
            com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot$ThreadJiffiesSnapshot r14 = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.JiffiesSnapshot.ThreadJiffiesSnapshot) r14
            java.lang.String r15 = r14.f343067c
            java.lang.String r9 = "threadEntry.name"
            gy3.C87412m.m108593f(r15, r9)
            int r9 = r14.f343066b
            DIGIT r13 = r14.f343211a
            java.lang.Long r13 = (java.lang.Long) r13
            java.lang.String r3 = "jiffies"
            gy3.C87412m.m108593f(r13, r3)
            r16 = r2
            long r2 = r13.longValue()
            com.tencent.matrix.batterycanary.monitor.feature.i r13 = r0.f355273a
            ce.a r13 = r13.f343163l
            if (r13 == 0) goto L_0x00c7
            r17 = r1
            long r0 = r13.f338976n
            goto L_0x00cb
        L_0x00c7:
            r17 = r1
            r0 = 0
        L_0x00cb:
            float r0 = w33.C118738t.m167431b(r2, r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x00ff
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "thread "
            r1.append(r2)
            r1.append(r10)
            r1.append(r12)
            r1.append(r15)
            r2 = 40
            r1.append(r2)
            r1.append(r9)
            java.lang.String r2 = ") = "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
        L_0x00ff:
            r1 = 10
            if (r10 < r1) goto L_0x011c
            int r0 = r5.f27483d
            r2 = 1
            int r0 = r0 + r2
            r5.f27483d = r0
            long r2 = r7.f124000d
            DIGIT r0 = r14.f343211a
            java.lang.String r9 = "threadEntry.get()"
            gy3.C87412m.m108593f(r0, r9)
            long r9 = r0.longValue()
            long r2 = r2 + r9
            r7.f124000d = r2
            r2 = r18
            goto L_0x012c
        L_0x011c:
            r2 = r18
            c30.g r3 = r2.f355274b
            java.lang.String r10 = java.lang.String.valueOf(r10)
            w33.g r12 = new w33.g
            r12.<init>(r15, r9, r0)
            w33.C118738t.m167430a(r3, r10, r12)
        L_0x012c:
            r0 = r2
            r10 = r11
            r2 = r16
            r1 = r17
            goto L_0x0094
        L_0x0134:
            r16 = r2
            r2 = r0
            r0 = r1
            RECORD r0 = r0.f343207c
            com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot r0 = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.JiffiesSnapshot) r0
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$c<com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot$ThreadJiffiesSnapshot> r0 = r0.f343063h
            java.util.List<ITEM> r0 = r0.f343212a
            java.lang.String r1 = "delta.dlt.threadEntries.list"
            gy3.C87412m.m108593f(r0, r1)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x014e:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0171
            java.lang.Object r3 = r0.next()
            r8 = r3
            com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot$ThreadJiffiesSnapshot r8 = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.JiffiesSnapshot.ThreadJiffiesSnapshot) r8
            java.lang.String r8 = r8.f343067c
            java.lang.Object r9 = r1.get(r8)
            if (r9 != 0) goto L_0x016b
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r1.put(r8, r9)
        L_0x016b:
            java.util.List r9 = (java.util.List) r9
            r9.add(r3)
            goto L_0x014e
        L_0x0171:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x017e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x01d0
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r8 = r3.getValue()
            java.util.List r8 = (java.util.List) r8
            int r8 = r8.size()
            r9 = 1
            if (r8 <= r9) goto L_0x01c0
            java.lang.Object r8 = r3.getKey()
            java.lang.String r10 = "it.key"
            gy3.C87412m.m108593f(r8, r10)
            java.lang.String r8 = (java.lang.String) r8
            java.util.Locale r10 = java.util.Locale.getDefault()
            java.lang.String r11 = "getDefault()"
            gy3.C87412m.m108593f(r10, r11)
            java.lang.String r8 = r8.toLowerCase(r10)
            java.lang.String r10 = "this as java.lang.String).toLowerCase(locale)"
            gy3.C87412m.m108593f(r8, r10)
            java.lang.String r10 = "voip"
            r11 = 0
            boolean r8 = z04.C112550d0.m153801u(r8, r10, r11)
            if (r8 == 0) goto L_0x01c1
            r8 = 1
            goto L_0x01c2
        L_0x01c0:
            r11 = 0
        L_0x01c1:
            r8 = 0
        L_0x01c2:
            if (r8 == 0) goto L_0x017e
            java.lang.Object r8 = r3.getKey()
            java.lang.Object r3 = r3.getValue()
            r0.put(r8, r3)
            goto L_0x017e
        L_0x01d0:
            com.tencent.matrix.batterycanary.monitor.feature.i r1 = r2.f355273a
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x01da:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0247
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Duplicated thread name: "
            r8.append(r9)
            java.lang.Object r9 = r3.getKey()
            java.lang.String r9 = (java.lang.String) r9
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r8)
            java.lang.Object r3 = r3.getValue()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x020a:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x01da
            java.lang.Object r8 = r3.next()
            com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot$ThreadJiffiesSnapshot r8 = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.JiffiesSnapshot.ThreadJiffiesSnapshot) r8
            ce.g r9 = r1.f343162k
            if (r9 == 0) goto L_0x0229
            ce.f r9 = r9.f339057d
            if (r9 == 0) goto L_0x0229
            ie.h r9 = r9.f339026A
            if (r9 == 0) goto L_0x0229
            int r10 = r8.f343066b
            java.lang.String r9 = r9.mo122129a(r10)
            goto L_0x022a
        L_0x0229:
            r9 = 0
        L_0x022a:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = " - "
            r10.append(r11)
            int r8 = r8.f343066b
            r10.append(r8)
            r10.append(r12)
            r10.append(r9)
            java.lang.String r8 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r8)
            goto L_0x020a
        L_0x0247:
            c30.g r0 = r2.f355274b
            w33.h r1 = new w33.h
            com.tencent.matrix.batterycanary.monitor.feature.i r3 = r2.f355273a
            r1.<init>(r7, r3, r5)
            java.lang.String r3 = "other"
            w33.C118738t.m167430a(r0, r3, r1)
            c30.g r0 = r2.f355274b
            w33.k r1 = new w33.k
            com.tencent.matrix.batterycanary.monitor.feature.i r3 = r2.f355273a
            r1.<init>(r3, r4)
            java.lang.String r3 = "task"
            w33.C118738t.m167430a(r0, r3, r1)
            c30.g r0 = r2.f355274b
            w33.n r1 = new w33.n
            com.tencent.matrix.batterycanary.monitor.feature.i r3 = r2.f355273a
            r1.<init>(r3, r4)
            java.lang.String r3 = "looper"
            w33.C118738t.m167430a(r0, r3, r1)
            c30.g r0 = r2.f355274b
            w33.r r1 = new w33.r
            com.tencent.matrix.batterycanary.monitor.feature.i r3 = r2.f355273a
            r4 = r16
            r1.<init>(r4, r3)
            java.lang.String r3 = "stats"
            w33.C118738t.m167430a(r0, r3, r1)
        L_0x0281:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w33.C118737s.accept(java.lang.Object):void");
    }
}
