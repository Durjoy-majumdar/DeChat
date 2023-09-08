package er1;

/* renamed from: er1.h5 */
public final class C58735h5 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f168172d;

    public C58735h5(String str) {
        this.f168172d = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0178  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r22 = this;
            r1 = r22
            er1.g5 r0 = er1.C58730g5.f168158a
            java.util.HashMap<java.lang.String, java.util.ArrayList<te3.va4>> r0 = er1.C58730g5.f168159b
            java.lang.String r2 = r1.f168172d
            java.lang.Object r0 = r0.get(r2)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r5 = 1
            r6 = 0
            if (r0 == 0) goto L_0x01e4
            java.lang.String r7 = r1.f168172d
            er1.g5$b r8 = er1.C58730g5.C58732b.f168167a
            java.lang.String r8 = "id"
            gy3.C87412m.m108594g(r7, r8)
            er1.C58730g5.f168163f = r6
            er1.C58730g5.f168164g = r6
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r8.addAll(r0)
            java.lang.Object r0 = sx3.C110818d0.m150916N(r8)
            te3.va4 r0 = (te3.va4) r0
            java.lang.Object r9 = sx3.C110818d0.m150925W(r8)
            te3.va4 r9 = (te3.va4) r9
            if (r0 == 0) goto L_0x01e4
            if (r9 == 0) goto L_0x01e4
            boolean r10 = gy3.C87412m.m108589b(r0, r9)
            if (r10 != 0) goto L_0x01e4
            long r10 = r9.f185868f
            long r12 = r0.f185868f
            long r10 = r10 - r12
            java.lang.String r0 = r9.f185867e
            er1.e5$c r12 = er1.C58713e5.f168084l
            java.lang.String r12 = r12.f168101b
            boolean r12 = gy3.C87412m.m108589b(r0, r12)
            if (r12 == 0) goto L_0x0050
            r12 = 1
            goto L_0x006b
        L_0x0050:
            er1.e5$c r12 = er1.C58713e5.f168085m
            java.lang.String r12 = r12.f168101b
            boolean r12 = gy3.C87412m.m108589b(r0, r12)
            if (r12 == 0) goto L_0x005d
            r0 = 2
            r12 = 2
            goto L_0x006b
        L_0x005d:
            er1.e5$c r12 = er1.C58713e5.f168083k
            java.lang.String r12 = r12.f168101b
            boolean r0 = gy3.C87412m.m108589b(r0, r12)
            if (r0 == 0) goto L_0x006a
            r0 = 3
            r12 = 3
            goto L_0x006b
        L_0x006a:
            r12 = 0
        L_0x006b:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.util.Iterator r0 = r8.iterator()
            r14 = 0
        L_0x0075:
            boolean r15 = r0.hasNext()
            if (r15 == 0) goto L_0x0100
            java.lang.Object r15 = r0.next()
            int r16 = r14 + 1
            if (r14 < 0) goto L_0x00fb
            te3.va4 r15 = (te3.va4) r15
            if (r14 <= 0) goto L_0x00f2
            int r14 = r14 + -1
            java.lang.Object r14 = r8.get(r14)
            java.lang.String r2 = "dataList.get(index - 1)"
            gy3.C87412m.m108593f(r14, r2)
            te3.va4 r14 = (te3.va4) r14
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r15.f185867e
            r2.append(r3)
            r3 = 58
            r2.append(r3)
            r17 = r7
            long r6 = r15.f185868f
            long r3 = r14.f185868f
            long r6 = r6 - r3
            r2.append(r6)
            r3 = 59
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r13.append(r2)
            int r2 = er1.C58730g5.f168163f
            if (r2 != 0) goto L_0x00e3
            java.lang.String r2 = r15.f185867e
            er1.e5$c r3 = er1.C58713e5.f168089q
            java.lang.String r3 = r3.f168101b
            boolean r2 = gy3.C87412m.m108589b(r2, r3)
            if (r2 != 0) goto L_0x00e1
            java.lang.String r2 = r15.f185867e
            er1.e5$c r3 = er1.C58713e5.f168088p
            java.lang.String r3 = r3.f168101b
            boolean r2 = gy3.C87412m.m108589b(r2, r3)
            if (r2 != 0) goto L_0x00e1
            java.lang.String r2 = r15.f185867e
            er1.e5$c r3 = er1.C58713e5.f168090r
            java.lang.String r3 = r3.f168101b
            boolean r2 = gy3.C87412m.m108589b(r2, r3)
            if (r2 == 0) goto L_0x00e3
        L_0x00e1:
            er1.C58730g5.f168163f = r5
        L_0x00e3:
            java.lang.String r2 = r15.f185867e
            er1.e5$c r3 = er1.C58713e5.f168086n
            java.lang.String r3 = r3.f168101b
            boolean r2 = gy3.C87412m.m108589b(r2, r3)
            if (r2 == 0) goto L_0x00f4
            er1.C58730g5.f168164g = r5
            goto L_0x00f4
        L_0x00f2:
            r17 = r7
        L_0x00f4:
            r14 = r16
            r7 = r17
            r6 = 0
            goto L_0x0075
        L_0x00fb:
            sx3.C64197v.m75542k()
            r2 = 0
            throw r2
        L_0x0100:
            r17 = r7
            boolean r0 = er1.C58730g5.f168164g
            if (r0 != 0) goto L_0x0108
            er1.C58730g5.f168163f = r5
        L_0x0108:
            pe3.b r0 = r9.f185870h
            java.lang.String r2 = ""
            if (r0 == 0) goto L_0x013a
            te3.zo2 r3 = new te3.zo2
            r3.<init>()
            byte[] r0 = r0.mo123703f()
            r3.parseFrom(r0)     // Catch:{ Exception -> 0x011c }
            r4 = 0
            goto L_0x0129
        L_0x011c:
            r0 = move-exception
            r3 = r0
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r4 = 0
            r0[r4] = r3
            java.lang.String r3 = "safeParser"
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r3, r2, r0)
            r3 = 0
        L_0x0129:
            if (r3 == 0) goto L_0x013a
            int r0 = r3.f186779e
            java.lang.String r3 = r3.f186780f
            if (r3 == 0) goto L_0x013b
            java.lang.String r2 = ","
            java.lang.String r6 = ";"
            java.lang.String r2 = z04.C112551y.m153814n(r3, r2, r6, r4)
            goto L_0x013b
        L_0x013a:
            r0 = 0
        L_0x013b:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, er1.k5> r4 = er1.C58730g5.f168162e
            r6 = r17
            boolean r7 = r4.containsKey(r6)
            if (r7 == 0) goto L_0x0178
            java.lang.Object r7 = r4.get(r6)
            er1.k5 r7 = (er1.C58743k5) r7
            if (r7 == 0) goto L_0x0158
            long r7 = r7.f168200a
            r14 = 0
            int r9 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r9 != 0) goto L_0x0158
            r18 = 1
            goto L_0x015a
        L_0x0158:
            r18 = 0
        L_0x015a:
            r18 = r18 ^ 1
            java.lang.Object r7 = r4.get(r6)
            er1.k5 r7 = (er1.C58743k5) r7
            if (r7 == 0) goto L_0x0167
            int r7 = r7.f168201b
            goto L_0x0168
        L_0x0167:
            r7 = 0
        L_0x0168:
            java.lang.Object r4 = r4.get(r6)
            er1.k5 r4 = (er1.C58743k5) r4
            if (r4 == 0) goto L_0x0173
            int r4 = r4.f168202c
            goto L_0x0174
        L_0x0173:
            r4 = 0
        L_0x0174:
            r8 = r4
            r4 = r18
            goto L_0x017b
        L_0x0178:
            r4 = 0
            r7 = 0
            r8 = 0
        L_0x017b:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            r6 = 44
            r9.append(r6)
            r9.append(r10)
            r9.append(r6)
            r9.append(r12)
            r9.append(r6)
            r9.append(r13)
            r9.append(r6)
            r9.append(r0)
            r9.append(r6)
            r9.append(r2)
            r9.append(r6)
            r9.append(r5)
            r9.append(r6)
            r9.append(r4)
            r9.append(r6)
            r9.append(r7)
            r9.append(r6)
            r9.append(r8)
            r9.append(r6)
            int r0 = er1.C58730g5.f168163f
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            int r4 = er1.C58730g5.C58732b.f168169c
            r2.kvStat(r4, r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "reportFlow 21173, "
            r2.append(r4)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "Finder.LiveFlowStats"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
        L_0x01e4:
            er1.g5 r2 = er1.C58730g5.f168158a
            java.lang.String r0 = r1.f168172d
            monitor-enter(r2)
            java.util.HashMap<java.lang.String, java.util.ArrayList<te3.va4>> r4 = er1.C58730g5.f168159b     // Catch:{ all -> 0x0358 }
            java.lang.Object r4 = r4.get(r0)     // Catch:{ all -> 0x0358 }
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch:{ all -> 0x0358 }
            if (r4 == 0) goto L_0x034c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0347 }
            r6.<init>()     // Catch:{ all -> 0x0347 }
            java.lang.Object r7 = sx3.C110818d0.m150916N(r4)     // Catch:{ all -> 0x0347 }
            te3.va4 r7 = (te3.va4) r7     // Catch:{ all -> 0x0347 }
            if (r7 == 0) goto L_0x0203
            long r14 = r7.f185868f     // Catch:{ all -> 0x0358 }
            goto L_0x0205
        L_0x0203:
            r14 = 0
        L_0x0205:
            java.lang.Object r7 = sx3.C110818d0.m150925W(r4)     // Catch:{ all -> 0x0347 }
            te3.va4 r7 = (te3.va4) r7     // Catch:{ all -> 0x0347 }
            if (r7 == 0) goto L_0x0210
            long r7 = r7.f185868f     // Catch:{ all -> 0x0358 }
            goto L_0x0212
        L_0x0210:
            r7 = 0
        L_0x0212:
            long r9 = r7 - r14
            java.util.Iterator r11 = r4.iterator()     // Catch:{ all -> 0x0347 }
            r12 = 0
        L_0x0219:
            boolean r13 = r11.hasNext()     // Catch:{ all -> 0x0347 }
            if (r13 == 0) goto L_0x031e
            java.lang.Object r13 = r11.next()     // Catch:{ all -> 0x0347 }
            int r18 = r12 + 1
            if (r12 < 0) goto L_0x0318
            te3.va4 r13 = (te3.va4) r13     // Catch:{ all -> 0x0347 }
            if (r12 != 0) goto L_0x0258
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0358 }
            r12.<init>()     // Catch:{ all -> 0x0358 }
            java.lang.String r14 = "start at "
            r12.append(r14)     // Catch:{ all -> 0x0358 }
            long r14 = r13.f185868f     // Catch:{ all -> 0x0358 }
            r12.append(r14)     // Catch:{ all -> 0x0358 }
            java.lang.String r14 = "\n "
            r12.append(r14)     // Catch:{ all -> 0x0358 }
            java.lang.String r13 = r13.f185867e     // Catch:{ all -> 0x0358 }
            r12.append(r13)     // Catch:{ all -> 0x0358 }
            java.lang.String r13 = " \n "
            r12.append(r13)     // Catch:{ all -> 0x0358 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0358 }
            r6.append(r12)     // Catch:{ all -> 0x0358 }
            r3 = r2
            r16 = r4
            r4 = r6
            r2 = 0
            goto L_0x030e
        L_0x0258:
            int r14 = r12 + -1
            java.lang.Object r14 = r4.get(r14)     // Catch:{ all -> 0x0347 }
            java.lang.String r15 = r13.f185867e     // Catch:{ all -> 0x0347 }
            if (r14 != 0) goto L_0x026b
            java.lang.String r15 = "null "
            r16 = r4
            r19 = r6
        L_0x0268:
            r3 = 0
            goto L_0x027c
        L_0x026b:
            r16 = r4
            long r3 = r13.f185868f     // Catch:{ all -> 0x0347 }
            r15 = r14
            te3.va4 r15 = (te3.va4) r15     // Catch:{ all -> 0x0347 }
            r19 = r6
            long r5 = r15.f185868f     // Catch:{ all -> 0x0347 }
            long r3 = r3 - r5
            java.lang.String r15 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0347 }
            goto L_0x0268
        L_0x027c:
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x02bf
            if (r14 == 0) goto L_0x02bf
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0347 }
            r5.<init>()     // Catch:{ all -> 0x0347 }
            java.lang.String r6 = "%.1f"
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x0347 }
            r3 = r2
            long r1 = r13.f185868f     // Catch:{ all -> 0x0345 }
            te3.va4 r14 = (te3.va4) r14     // Catch:{ all -> 0x0345 }
            r20 = r7
            long r7 = r14.f185868f     // Catch:{ all -> 0x0345 }
            long r1 = r1 - r7
            float r1 = (float) r1     // Catch:{ all -> 0x0345 }
            r2 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r2
            float r2 = (float) r9     // Catch:{ all -> 0x0345 }
            float r1 = r1 / r2
            java.lang.Float r1 = java.lang.Float.valueOf(r1)     // Catch:{ all -> 0x0345 }
            r2 = 0
            r4[r2] = r1     // Catch:{ all -> 0x0345 }
            r1 = 1
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)     // Catch:{ all -> 0x0345 }
            java.lang.String r1 = java.lang.String.format(r6, r4)     // Catch:{ all -> 0x0345 }
            java.lang.String r4 = "format(format, *args)"
            gy3.C87412m.m108593f(r1, r4)     // Catch:{ all -> 0x0345 }
            r5.append(r1)     // Catch:{ all -> 0x0345 }
            r1 = 37
            r5.append(r1)     // Catch:{ all -> 0x0345 }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x0345 }
            goto L_0x02c5
        L_0x02bf:
            r3 = r2
            r20 = r7
            r2 = 0
            java.lang.String r1 = ""
        L_0x02c5:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0345 }
            r4.<init>()     // Catch:{ all -> 0x0345 }
            java.lang.String r5 = r13.f185867e     // Catch:{ all -> 0x0345 }
            r4.append(r5)     // Catch:{ all -> 0x0345 }
            r5 = 91
            r4.append(r5)     // Catch:{ all -> 0x0345 }
            r4.append(r15)     // Catch:{ all -> 0x0345 }
            java.lang.String r5 = "ms "
            r4.append(r5)     // Catch:{ all -> 0x0345 }
            r4.append(r1)     // Catch:{ all -> 0x0345 }
            java.lang.String r1 = "] \n "
            r4.append(r1)     // Catch:{ all -> 0x0345 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x0345 }
            r4 = r19
            r4.append(r1)     // Catch:{ all -> 0x0345 }
            int r1 = r16.size()     // Catch:{ all -> 0x0345 }
            r5 = 1
            int r1 = r1 - r5
            if (r12 != r1) goto L_0x030c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0345 }
            r1.<init>()     // Catch:{ all -> 0x0345 }
            java.lang.String r6 = "end at "
            r1.append(r6)     // Catch:{ all -> 0x0345 }
            r7 = r20
            r1.append(r7)     // Catch:{ all -> 0x0345 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0345 }
            r4.append(r1)     // Catch:{ all -> 0x0345 }
            goto L_0x030e
        L_0x030c:
            r7 = r20
        L_0x030e:
            r1 = r22
            r2 = r3
            r6 = r4
            r4 = r16
            r12 = r18
            goto L_0x0219
        L_0x0318:
            r3 = r2
            sx3.C64197v.m75542k()     // Catch:{ all -> 0x0345 }
            r1 = 0
            throw r1     // Catch:{ all -> 0x0345 }
        L_0x031e:
            r3 = r2
            r4 = r6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0345 }
            r1.<init>()     // Catch:{ all -> 0x0345 }
            java.lang.String r2 = "Total Cost:"
            r1.append(r2)     // Catch:{ all -> 0x0345 }
            r1.append(r9)     // Catch:{ all -> 0x0345 }
            java.lang.String r2 = "ms... "
            r1.append(r2)     // Catch:{ all -> 0x0345 }
            r1.append(r4)     // Catch:{ all -> 0x0345 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0345 }
            java.util.HashMap<java.lang.String, java.lang.String> r2 = er1.C58730g5.f168160c     // Catch:{ all -> 0x0345 }
            r2.put(r0, r1)     // Catch:{ all -> 0x0345 }
            java.lang.String r0 = "Finder.LiveFlowStats"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ all -> 0x0345 }
            monitor-exit(r3)
            goto L_0x034e
        L_0x0345:
            r0 = move-exception
            goto L_0x0349
        L_0x0347:
            r0 = move-exception
            r3 = r2
        L_0x0349:
            r1 = r22
            goto L_0x035a
        L_0x034c:
            r3 = r2
            monitor-exit(r3)
        L_0x034e:
            er1.g5 r0 = er1.C58730g5.f168158a
            r1 = r22
            java.lang.String r2 = r1.f168172d
            r0.mo83649c(r2)
            return
        L_0x0358:
            r0 = move-exception
            r3 = r2
        L_0x035a:
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: er1.C58735h5.run():void");
    }
}
