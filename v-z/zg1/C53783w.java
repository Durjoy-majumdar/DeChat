package zg1;

import fj1.C45795b;
import gy3.C87412m;
import yg1.C16006g;

/* renamed from: zg1.w */
public final class C53783w extends C16006g {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53783w(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    /* JADX WARNING: Removed duplicated region for block: B:119:0x0011 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0011 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0011 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01d4  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14632d(java.util.LinkedList<te3.C52013xs0> r23) {
        /*
            r22 = this;
            r1 = r22
            java.lang.Class<cl1.o> r2 = cl1.C54991o.class
            java.lang.Class<cl1.t0> r3 = cl1.C39981t0.class
            java.lang.String r0 = "msgList"
            r4 = r23
            gy3.C87412m.m108594g(r4, r0)
            java.util.Iterator r4 = r23.iterator()
        L_0x0011:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x022a
            java.lang.Object r0 = r4.next()
            r5 = r0
            te3.xs0 r5 = (te3.C52013xs0) r5
            int r0 = r5.f144903e
            r6 = 20059(0x4e5b, float:2.8109E-41)
            java.lang.String r7 = "safeParser"
            r8 = 0
            r9 = 1
            java.lang.String r10 = "userId: "
            java.lang.String r11 = "MicIntercomMsgInterceptor"
            r12 = 125(0x7d, float:1.75E-43)
            java.lang.String r13 = ",info: "
            java.lang.String r14 = ""
            if (r0 == r6) goto L_0x0155
            r6 = 20060(0x4e5c, float:2.811E-41)
            java.lang.String r15 = " scene: "
            if (r0 == r6) goto L_0x00ca
            r6 = 20065(0x4e61, float:2.8117E-41)
            if (r0 == r6) goto L_0x003e
            goto L_0x0011
        L_0x003e:
            te3.mu0 r0 = new te3.mu0
            r0.<init>()
            pe3.b r6 = r5.f144906h
            if (r6 == 0) goto L_0x004c
            byte[] r6 = r6.mo123703f()
            goto L_0x004d
        L_0x004c:
            r6 = 0
        L_0x004d:
            if (r6 != 0) goto L_0x0050
            goto L_0x005d
        L_0x0050:
            r0.parseFrom(r6)     // Catch:{ Exception -> 0x0054 }
            goto L_0x005e
        L_0x0054:
            r0 = move-exception
            r6 = r0
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r8] = r6
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r7, r14, r0)
        L_0x005d:
            r0 = 0
        L_0x005e:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "handleMicIntercomChange apply sessionId:"
            r6.append(r7)
            java.lang.String r5 = r5.f144909n
            r6.append(r5)
            r6.append(r13)
            if (r0 == 0) goto L_0x008c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r10)
            java.lang.String r7 = r0.f138209d
            r5.append(r7)
            r5.append(r15)
            int r7 = r0.f138210e
            r5.append(r7)
            java.lang.String r15 = r5.toString()
            goto L_0x008d
        L_0x008c:
            r15 = 0
        L_0x008d:
            r6.append(r15)
            r6.append(r12)
            java.lang.String r5 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r5)
            if (r0 == 0) goto L_0x0011
            int r5 = r0.f138210e
            if (r5 != r9) goto L_0x0011
            java.lang.String r0 = r0.f138209d
            if (r0 != 0) goto L_0x00a5
            goto L_0x00a6
        L_0x00a5:
            r14 = r0
        L_0x00a6:
            fj1.b r0 = r1.f43066a
            androidx.lifecycle.i0 r0 = r0.mo71262a(r2)
            cl1.o r0 = (cl1.C54991o) r0
            java.lang.String r0 = r0.mo76015n4()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r14, (java.lang.String) r0)
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = "handleUserCloseMicIntercom startTrtcExitRoom"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            fj1.b r0 = r1.f43066a
            androidx.lifecycle.i0 r0 = r0.mo71262a(r3)
            cl1.t0 r0 = (cl1.C39981t0) r0
            r0.mo62591i3()
            goto L_0x0011
        L_0x00ca:
            te3.rt0 r0 = new te3.rt0
            r0.<init>()
            pe3.b r6 = r5.f144906h
            if (r6 == 0) goto L_0x00d8
            byte[] r6 = r6.mo123703f()
            goto L_0x00d9
        L_0x00d8:
            r6 = 0
        L_0x00d9:
            if (r6 != 0) goto L_0x00dc
            goto L_0x00e9
        L_0x00dc:
            r0.parseFrom(r6)     // Catch:{ Exception -> 0x00e0 }
            goto L_0x00ea
        L_0x00e0:
            r0 = move-exception
            r6 = r0
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r8] = r6
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r7, r14, r0)
        L_0x00e9:
            r0 = 0
        L_0x00ea:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "checkMicIntercomApplyMsg close sessionId:"
            r6.append(r7)
            java.lang.String r7 = r5.f144909n
            r6.append(r7)
            r6.append(r13)
            if (r0 == 0) goto L_0x0118
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r10)
            java.lang.String r8 = r0.f141124d
            r7.append(r8)
            r7.append(r15)
            int r8 = r0.f141125e
            r7.append(r8)
            java.lang.String r15 = r7.toString()
            goto L_0x0119
        L_0x0118:
            r15 = 0
        L_0x0119:
            r6.append(r15)
            r6.append(r12)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r6)
            if (r0 == 0) goto L_0x0011
            fj1.b r6 = r1.f43066a
            androidx.lifecycle.i0 r6 = r6.mo71262a(r3)
            cl1.t0 r6 = (cl1.C39981t0) r6
            java.lang.String r7 = r0.f141124d
            if (r7 != 0) goto L_0x0135
            goto L_0x0136
        L_0x0135:
            r14 = r7
        L_0x0136:
            fj1.b r7 = r6.f107146d
            androidx.lifecycle.i0 r7 = r7.mo71262a(r2)
            cl1.o r7 = (cl1.C54991o) r7
            java.lang.String r7 = r7.mo76015n4()
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r14, (java.lang.String) r7)
            if (r7 == 0) goto L_0x0011
            int r0 = r0.f141125e
            if (r0 != r9) goto L_0x0011
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData<java.lang.String> r0 = r6.f107201p
            java.lang.String r5 = r5.f144909n
            r0.postValue(r5)
            goto L_0x0011
        L_0x0155:
            te3.gt0 r0 = new te3.gt0
            r0.<init>()
            pe3.b r6 = r5.f144906h
            if (r6 == 0) goto L_0x0163
            byte[] r6 = r6.mo123703f()
            goto L_0x0164
        L_0x0163:
            r6 = 0
        L_0x0164:
            if (r6 != 0) goto L_0x0167
            goto L_0x0174
        L_0x0167:
            r0.parseFrom(r6)     // Catch:{ Exception -> 0x016b }
            goto L_0x0175
        L_0x016b:
            r0 = move-exception
            r6 = r0
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r8] = r6
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r7, r14, r0)
        L_0x0174:
            r0 = 0
        L_0x0175:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "checkMicIntercomApplyMsg apply sessionId:"
            r6.append(r7)
            java.lang.String r7 = r5.f144909n
            r6.append(r7)
            r6.append(r13)
            if (r0 == 0) goto L_0x01c4
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r10)
            java.lang.String r8 = r0.f134256e
            r7.append(r8)
            java.lang.String r8 = " username: "
            r7.append(r8)
            te3.hx0 r8 = r0.f134255d
            if (r8 == 0) goto L_0x01a6
            com.tencent.mm.protocal.protobuf.FinderContact r8 = r8.f134919d
            if (r8 == 0) goto L_0x01a6
            java.lang.String r8 = r8.username
            goto L_0x01a7
        L_0x01a6:
            r8 = 0
        L_0x01a7:
            r7.append(r8)
            java.lang.String r8 = "} nickName: "
            r7.append(r8)
            te3.hx0 r8 = r0.f134255d
            if (r8 == 0) goto L_0x01bb
            com.tencent.mm.protocal.protobuf.FinderContact r8 = r8.f134919d
            if (r8 == 0) goto L_0x01bb
            java.lang.String r15 = r8.nickname
            goto L_0x01bc
        L_0x01bb:
            r15 = 0
        L_0x01bc:
            r7.append(r15)
            java.lang.String r15 = r7.toString()
            goto L_0x01c5
        L_0x01c4:
            r15 = 0
        L_0x01c5:
            r6.append(r15)
            r6.append(r12)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r6)
            if (r0 == 0) goto L_0x0011
            fj1.b r6 = r1.f43066a
            androidx.lifecycle.i0 r6 = r6.mo71262a(r3)
            cl1.t0 r6 = (cl1.C39981t0) r6
            cl1.t0$a r7 = cl1.C39981t0.C39982a.CACHE
            al1.s r8 = new al1.s
            java.lang.String r9 = r0.f134256e
            if (r9 != 0) goto L_0x01e7
            r16 = r14
            goto L_0x01e9
        L_0x01e7:
            r16 = r9
        L_0x01e9:
            te3.hx0 r0 = r0.f134255d
            if (r0 == 0) goto L_0x01f9
            com.tencent.mm.protocal.protobuf.FinderContact r9 = r0.f134919d
            if (r9 == 0) goto L_0x01f9
            java.lang.String r9 = r9.headUrl
            if (r9 != 0) goto L_0x01f6
            goto L_0x01f9
        L_0x01f6:
            r17 = r9
            goto L_0x01fb
        L_0x01f9:
            r17 = r14
        L_0x01fb:
            if (r0 == 0) goto L_0x0209
            com.tencent.mm.protocal.protobuf.FinderContact r9 = r0.f134919d
            if (r9 == 0) goto L_0x0209
            java.lang.String r9 = r9.username
            if (r9 != 0) goto L_0x0206
            goto L_0x0209
        L_0x0206:
            r18 = r9
            goto L_0x020b
        L_0x0209:
            r18 = r14
        L_0x020b:
            if (r0 == 0) goto L_0x0219
            com.tencent.mm.protocal.protobuf.FinderContact r0 = r0.f134919d
            if (r0 == 0) goto L_0x0219
            java.lang.String r0 = r0.nickname
            if (r0 != 0) goto L_0x0216
            goto L_0x0219
        L_0x0216:
            r19 = r0
            goto L_0x021b
        L_0x0219:
            r19 = r14
        L_0x021b:
            java.lang.String r0 = r5.f144909n
            r21 = 0
            r15 = r8
            r20 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21)
            r6.mo62586c3(r7, r8)
            goto L_0x0011
        L_0x022a:
            fj1.b r0 = r1.f43066a
            androidx.lifecycle.i0 r0 = r0.mo71262a(r3)
            cl1.t0 r0 = (cl1.C39981t0) r0
            r0.mo62589f3()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zg1.C53783w.mo14632d(java.util.LinkedList):void");
    }

    /* renamed from: g */
    public int[] mo14635g() {
        return new int[]{20059, 20060, 20065};
    }
}
