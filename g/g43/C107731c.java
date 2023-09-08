package g43;

import e43.C107226d;
import z33.C112595h;

/* renamed from: g43.c */
public final class C107731c {

    /* renamed from: a */
    public C107226d f322374a;

    /* renamed from: b */
    public int f322375b = C112595h.m153922i();

    /* JADX WARNING: Removed duplicated region for block: B:85:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01d9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo158148a(int r39, p80.C110194c r40, boolean r41) {
        /*
            r38 = this;
            r1 = r38
            r0 = r39
            r2 = r40
            q00.g$a r10 = q00.C110264g.C47730a.APP_VOIP_HIGHRANK
            java.lang.String r3 = "outputTexture"
            gy3.C87412m.m108594g(r2, r3)
            e43.d r3 = r1.f322374a
            r13 = 1
            if (r3 != 0) goto L_0x01db
            e43.d r14 = new e43.d
            r14.<init>()
            r1.f322374a = r14
            java.lang.String r15 = "initial end %s"
            java.lang.String r12 = "init x3dHandle failed and stop render"
            java.lang.String r3 = "initial xLabEffect: again"
            java.lang.String r11 = "initial error"
            java.lang.String r9 = "MicroMsg.VoipFilterProcessTex"
            r16 = 0
            r4 = 2
            r5 = 3
            r6 = 0
            if (r41 == 0) goto L_0x00f8
            int r7 = r1.f322375b
            if (r7 != r4) goto L_0x00ef
            com.tencent.mm.storage.z1 r7 = eb0.C75592q0.m90777g()
            int r7 = r7.f149500H
            if (r7 != r4) goto L_0x0038
            r7 = 1
            goto L_0x0039
        L_0x0038:
            r7 = 0
        L_0x0039:
            r19 = 1
            java.lang.String r8 = "initial %s, %d, beauytParams:%s"
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x00e1 }
            r5[r6] = r14     // Catch:{ Exception -> 0x00e1 }
            java.lang.Thread r21 = java.lang.Thread.currentThread()     // Catch:{ Exception -> 0x00e1 }
            long r21 = r21.getId()     // Catch:{ Exception -> 0x00e1 }
            java.lang.Long r21 = java.lang.Long.valueOf(r21)     // Catch:{ Exception -> 0x00e1 }
            r5[r13] = r21     // Catch:{ Exception -> 0x00e1 }
            if (r7 == 0) goto L_0x0053
            r7 = 2
            goto L_0x0054
        L_0x0053:
            r7 = 1
        L_0x0054:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x00e1 }
            r5[r4] = r7     // Catch:{ Exception -> 0x00e1 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r8, r5)     // Catch:{ Exception -> 0x00e1 }
            ac3.g1 r4 = r14.f320835e     // Catch:{ Exception -> 0x00e1 }
            if (r4 == 0) goto L_0x006c
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r3)     // Catch:{ Exception -> 0x00e1 }
            ac3.g1 r3 = r14.f320835e     // Catch:{ Exception -> 0x00e1 }
            gy3.C87412m.m108591d(r3)     // Catch:{ Exception -> 0x00e1 }
            r3.destroy()     // Catch:{ Exception -> 0x00e1 }
        L_0x006c:
            ac3.g1 r8 = new ac3.g1     // Catch:{ Exception -> 0x00e1 }
            r4 = 1
            r5 = 0
            r7 = 1
            boolean r3 = r14.f320837g     // Catch:{ Exception -> 0x00e1 }
            r21 = 1
            r22 = 2
            r23 = 0
            r24 = r3
            r3 = r8
            r6 = r19
            r13 = r8
            r8 = r24
            r25 = r9
            r9 = r21
            r26 = r11
            r11 = r22
            r1 = r12
            r12 = r23
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x00dc }
            r14.f320835e = r13     // Catch:{ Exception -> 0x00dc }
            long r3 = r13.f304784d     // Catch:{ Exception -> 0x00dc }
            int r5 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r5 == 0) goto L_0x0099
            r6 = 1
            goto L_0x009a
        L_0x0099:
            r6 = 0
        L_0x009a:
            r3 = 1
            r4 = r6 ^ 1
            if (r4 == 0) goto L_0x00ac
            r12 = r25
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r1)     // Catch:{ Exception -> 0x00aa }
            r14.mo157686a()     // Catch:{ Exception -> 0x00aa }
            r1 = 0
            goto L_0x019a
        L_0x00aa:
            r0 = move-exception
            goto L_0x00df
        L_0x00ac:
            r12 = r25
            r1 = 0
            r13.mo143233a(r1)     // Catch:{ Exception -> 0x00da }
            ac3.g1 r3 = r14.f320835e     // Catch:{ Exception -> 0x00da }
            if (r3 == 0) goto L_0x00b9
            com.tencent.mm.autogen.mmdata.rpt.WeVisionBaseDataStruct r8 = r3.f304775D     // Catch:{ Exception -> 0x00da }
            goto L_0x00ba
        L_0x00b9:
            r8 = 0
        L_0x00ba:
            if (r8 != 0) goto L_0x00bd
            goto L_0x00c0
        L_0x00bd:
            r13 = 4
            r8.f194705d = r13     // Catch:{ Exception -> 0x00da }
        L_0x00c0:
            r14.mo157689d()     // Catch:{ Exception -> 0x00da }
            ac3.g1 r3 = r14.f320835e     // Catch:{ Exception -> 0x00da }
            if (r3 == 0) goto L_0x00ca
            r3.mo143223B()     // Catch:{ Exception -> 0x00da }
        L_0x00ca:
            r14.f320831a = r0     // Catch:{ Exception -> 0x00da }
            r14.f320832b = r2     // Catch:{ Exception -> 0x00da }
            r2 = 1
            r14.f320836f = r2     // Catch:{ Exception -> 0x00da }
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x00da }
            r0[r1] = r14     // Catch:{ Exception -> 0x00da }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r12, r15, r0)     // Catch:{ Exception -> 0x00da }
            goto L_0x01c8
        L_0x00da:
            r0 = move-exception
            goto L_0x00e6
        L_0x00dc:
            r0 = move-exception
            r12 = r25
        L_0x00df:
            r1 = 0
            goto L_0x00e6
        L_0x00e1:
            r0 = move-exception
            r12 = r9
            r26 = r11
            goto L_0x00df
        L_0x00e6:
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r11 = r26
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r0, r11, r2)
            goto L_0x01c8
        L_0x00ef:
            r1 = 0
            r3 = 1
            boolean r0 = r14.mo157688c(r0, r2, r3)
            r6 = r0
            goto L_0x01c9
        L_0x00f8:
            r8 = r12
            r13 = 4
            r12 = r9
            r9 = r1
            r1 = 0
            int r6 = r9.f322375b
            if (r6 != r4) goto L_0x0103
            r6 = 1
            goto L_0x0104
        L_0x0103:
            r6 = 0
        L_0x0104:
            java.lang.String r7 = "initialVirtualBg %s, %d, beauytParams:%s, runWithGPU:%b"
            java.lang.Object[] r5 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x01bc }
            r5[r1] = r14     // Catch:{ Exception -> 0x01bc }
            java.lang.Thread r20 = java.lang.Thread.currentThread()     // Catch:{ Exception -> 0x01bc }
            long r20 = r20.getId()     // Catch:{ Exception -> 0x01bc }
            java.lang.Long r20 = java.lang.Long.valueOf(r20)     // Catch:{ Exception -> 0x01bc }
            r18 = 1
            r5[r18] = r20     // Catch:{ Exception -> 0x01bc }
            java.lang.Integer r20 = java.lang.Integer.valueOf(r18)     // Catch:{ Exception -> 0x01bc }
            r5[r4] = r20     // Catch:{ Exception -> 0x01bc }
            boolean r4 = r14.f320837g     // Catch:{ Exception -> 0x01bc }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ Exception -> 0x01bc }
            r19 = 3
            r5[r19] = r4     // Catch:{ Exception -> 0x01bc }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r7, r5)     // Catch:{ Exception -> 0x01bc }
            ac3.g1 r4 = r14.f320835e     // Catch:{ Exception -> 0x01bc }
            if (r4 == 0) goto L_0x013c
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r3)     // Catch:{ Exception -> 0x01bc }
            ac3.g1 r3 = r14.f320835e     // Catch:{ Exception -> 0x01bc }
            gy3.C87412m.m108591d(r3)     // Catch:{ Exception -> 0x01bc }
            r3.destroy()     // Catch:{ Exception -> 0x01bc }
        L_0x013c:
            if (r6 == 0) goto L_0x0163
            ac3.g1 r19 = new ac3.g1     // Catch:{ Exception -> 0x01bc }
            r4 = 1
            r5 = 0
            r7 = 1
            boolean r6 = r14.f320837g     // Catch:{ Exception -> 0x01bc }
            r20 = 1
            r21 = 2
            r22 = 0
            r23 = 1
            r3 = r19
            r24 = r6
            r6 = r23
            r13 = r8
            r8 = r24
            r9 = r20
            r27 = r11
            r11 = r21
            r1 = r12
            r12 = r22
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x01ba }
            goto L_0x0182
        L_0x0163:
            r13 = r8
            r27 = r11
            r1 = r12
            ac3.g1 r19 = new ac3.g1     // Catch:{ Exception -> 0x01ba }
            r29 = 1
            r30 = 0
            r32 = 1
            boolean r3 = r14.f320837g     // Catch:{ Exception -> 0x01ba }
            r34 = 1
            q00.g$a r35 = q00.C110264g.C47730a.APP_VOIP     // Catch:{ Exception -> 0x01ba }
            r36 = 2
            r37 = 0
            r31 = 1
            r28 = r19
            r33 = r3
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37)     // Catch:{ Exception -> 0x01ba }
        L_0x0182:
            r3 = r19
            r14.f320835e = r3     // Catch:{ Exception -> 0x01ba }
            long r4 = r3.f304784d     // Catch:{ Exception -> 0x01ba }
            int r6 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r6 == 0) goto L_0x018e
            r6 = 1
            goto L_0x018f
        L_0x018e:
            r6 = 0
        L_0x018f:
            r4 = 1
            r5 = r6 ^ 1
            if (r5 == 0) goto L_0x019c
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r13)     // Catch:{ Exception -> 0x01ba }
            r14.mo157686a()     // Catch:{ Exception -> 0x01ba }
        L_0x019a:
            r6 = 0
            goto L_0x01c9
        L_0x019c:
            r4 = 0
            r3.mo143233a(r4)     // Catch:{ Exception -> 0x01ba }
            ac3.g1 r3 = r14.f320835e     // Catch:{ Exception -> 0x01ba }
            gy3.C87412m.m108591d(r3)     // Catch:{ Exception -> 0x01ba }
            com.tencent.mm.autogen.mmdata.rpt.WeVisionBaseDataStruct r3 = r3.f304775D     // Catch:{ Exception -> 0x01ba }
            r4 = 4
            r3.f194705d = r4     // Catch:{ Exception -> 0x01ba }
            r14.f320831a = r0     // Catch:{ Exception -> 0x01ba }
            r14.f320832b = r2     // Catch:{ Exception -> 0x01ba }
            r2 = 1
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x01ba }
            r2 = 0
            r0[r2] = r14     // Catch:{ Exception -> 0x01ba }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r15, r0)     // Catch:{ Exception -> 0x01ba }
            r14.f320836f = r2     // Catch:{ Exception -> 0x01ba }
            goto L_0x01c8
        L_0x01ba:
            r0 = move-exception
            goto L_0x01c0
        L_0x01bc:
            r0 = move-exception
            r27 = r11
            r1 = r12
        L_0x01c0:
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r2 = r27
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r2, r3)
        L_0x01c8:
            r6 = 1
        L_0x01c9:
            if (r6 != 0) goto L_0x01d9
            r1 = r38
            e43.d r0 = r1.f322374a
            if (r0 == 0) goto L_0x01d4
            r0.mo157686a()
        L_0x01d4:
            r2 = 0
            r1.f322374a = r2
            r2 = 0
            return r2
        L_0x01d9:
            r1 = r38
        L_0x01db:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g43.C107731c.mo158148a(int, p80.c, boolean):boolean");
    }
}
