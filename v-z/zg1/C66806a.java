package zg1;

import fj1.C45795b;
import gy3.C87412m;
import yg1.C16006g;

/* renamed from: zg1.a */
public final class C66806a extends C16006g {

    /* renamed from: c */
    public final String f191930c = "LiveAlertMsgInterceptor";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66806a(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: te3.s41} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: te3.s41} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: te3.s41} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: te3.s41} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: te3.s41} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: te3.s41} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: te3.s41} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: te3.s41} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: te3.s41} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x017e  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14632d(java.util.LinkedList<te3.C52013xs0> r15) {
        /*
            r14 = this;
            java.lang.String r0 = "msgList"
            gy3.C87412m.m108594g(r15, r0)
            fj1.b r0 = r14.f43066a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "handleAlertMsg:"
            r1.<init>(r2)
            java.util.Iterator r15 = r15.iterator()
            r2 = 0
            r3 = 0
            r4 = r2
            r5 = 0
        L_0x0016:
            boolean r6 = r15.hasNext()
            if (r6 == 0) goto L_0x019a
            java.lang.Object r6 = r15.next()
            int r7 = r5 + 1
            if (r5 < 0) goto L_0x0196
            te3.xs0 r6 = (te3.C52013xs0) r6
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r9 = 40
            r8.append(r9)
            r8.append(r5)
            java.lang.String r5 = ")[msgType:"
            r8.append(r5)
            int r5 = r6.f144903e
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r8.append(r5)
            java.lang.String r5 = ",payload is empty:"
            r8.append(r5)
            pe3.b r5 = r6.f144906h
            r9 = 1
            if (r5 != 0) goto L_0x004d
            r5 = 1
            goto L_0x004e
        L_0x004d:
            r5 = 0
        L_0x004e:
            r8.append(r5)
            java.lang.String r5 = ",fromUser:"
            r8.append(r5)
            te3.hx0 r5 = r6.f144914s
            if (r5 == 0) goto L_0x0061
            com.tencent.mm.protocal.protobuf.FinderContact r5 = r5.f134919d
            if (r5 == 0) goto L_0x0061
            java.lang.String r5 = r5.nickname
            goto L_0x0062
        L_0x0061:
            r5 = r2
        L_0x0062:
            r8.append(r5)
            java.lang.String r5 = ",toUser:"
            r8.append(r5)
            te3.hx0 r5 = r6.f144902d
            if (r5 == 0) goto L_0x0075
            com.tencent.mm.protocal.protobuf.FinderContact r5 = r5.f134919d
            if (r5 == 0) goto L_0x0075
            java.lang.String r5 = r5.nickname
            goto L_0x0076
        L_0x0075:
            r5 = r2
        L_0x0076:
            r8.append(r5)
            java.lang.String r5 = "] "
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            r1.append(r5)
            int r5 = r6.f144903e
            java.lang.String r8 = "parseMsgBoxInfo:"
            java.lang.String r10 = "safeParser"
            java.lang.String r11 = ""
            r12 = 20011(0x4e2b, float:2.8041E-41)
            r13 = 20007(0x4e27, float:2.8036E-41)
            if (r5 == r13) goto L_0x013a
            if (r5 == r12) goto L_0x00de
            r12 = 20080(0x4e70, float:2.8138E-41)
            if (r5 == r12) goto L_0x009b
            goto L_0x0193
        L_0x009b:
            te3.lt0 r4 = new te3.lt0
            r4.<init>()
            pe3.b r5 = r6.f144906h
            if (r5 == 0) goto L_0x00a9
            byte[] r5 = r5.mo123703f()
            goto L_0x00aa
        L_0x00a9:
            r5 = r2
        L_0x00aa:
            if (r5 != 0) goto L_0x00ad
            goto L_0x00b9
        L_0x00ad:
            r4.parseFrom(r5)     // Catch:{ Exception -> 0x00b1 }
            goto L_0x00ba
        L_0x00b1:
            r4 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r9]
            r5[r3] = r4
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r10, r11, r5)
        L_0x00b9:
            r4 = r2
        L_0x00ba:
            if (r4 == 0) goto L_0x00bf
            te3.s41 r4 = r4.f184153d
            goto L_0x00c0
        L_0x00bf:
            r4 = r2
        L_0x00c0:
            java.lang.String r5 = r14.f191930c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r8)
            if (r4 != 0) goto L_0x00cd
            goto L_0x00ce
        L_0x00cd:
            r11 = r4
        L_0x00ce:
            org.json.JSONObject r8 = o40.C61937h.m72709h(r11)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            goto L_0x0193
        L_0x00de:
            te3.cv0 r5 = new te3.cv0
            r5.<init>()
            pe3.b r6 = r6.f144906h
            if (r6 == 0) goto L_0x00ec
            byte[] r6 = r6.mo123703f()
            goto L_0x00ed
        L_0x00ec:
            r6 = r2
        L_0x00ed:
            if (r6 != 0) goto L_0x00f0
            goto L_0x00fc
        L_0x00f0:
            r5.parseFrom(r6)     // Catch:{ Exception -> 0x00f4 }
            goto L_0x00fd
        L_0x00f4:
            r5 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r9]
            r6[r3] = r5
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r10, r11, r6)
        L_0x00fc:
            r5 = r2
        L_0x00fd:
            if (r5 == 0) goto L_0x0102
            te3.s41 r5 = r5.f182570d
            goto L_0x0103
        L_0x0102:
            r5 = r2
        L_0x0103:
            java.lang.String r6 = r14.f191930c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            if (r5 != 0) goto L_0x0110
            goto L_0x0111
        L_0x0110:
            r11 = r5
        L_0x0111:
            org.json.JSONObject r8 = o40.C61937h.m72709h(r11)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r8)
            if (r4 != 0) goto L_0x0122
            goto L_0x0137
        L_0x0122:
            if (r5 == 0) goto L_0x0193
            int r6 = r4.f185335d
            if (r6 == r13) goto L_0x0133
            if (r6 == r12) goto L_0x012c
            goto L_0x0193
        L_0x012c:
            int r6 = r5.f185335d
            if (r6 == r12) goto L_0x0137
            if (r6 != r13) goto L_0x0193
            goto L_0x0137
        L_0x0133:
            int r6 = r5.f185335d
            if (r6 != r13) goto L_0x0193
        L_0x0137:
            r4 = r5
            goto L_0x0193
        L_0x013a:
            te3.ct0 r5 = new te3.ct0
            r5.<init>()
            pe3.b r6 = r6.f144906h
            if (r6 == 0) goto L_0x0148
            byte[] r6 = r6.mo123703f()
            goto L_0x0149
        L_0x0148:
            r6 = r2
        L_0x0149:
            if (r6 != 0) goto L_0x014c
            goto L_0x0158
        L_0x014c:
            r5.parseFrom(r6)     // Catch:{ Exception -> 0x0150 }
            goto L_0x0159
        L_0x0150:
            r5 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r9]
            r6[r3] = r5
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r10, r11, r6)
        L_0x0158:
            r5 = r2
        L_0x0159:
            if (r5 == 0) goto L_0x015e
            te3.s41 r5 = r5.f182567d
            goto L_0x015f
        L_0x015e:
            r5 = r2
        L_0x015f:
            java.lang.String r6 = r14.f191930c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            if (r5 != 0) goto L_0x016c
            goto L_0x016d
        L_0x016c:
            r11 = r5
        L_0x016d:
            org.json.JSONObject r8 = o40.C61937h.m72709h(r11)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r8)
            if (r4 != 0) goto L_0x017e
            goto L_0x0137
        L_0x017e:
            if (r5 == 0) goto L_0x0193
            int r6 = r4.f185335d
            if (r6 == r13) goto L_0x018e
            if (r6 == r12) goto L_0x0187
            goto L_0x0193
        L_0x0187:
            int r6 = r5.f185335d
            if (r6 == r12) goto L_0x0137
            if (r6 != r13) goto L_0x0193
            goto L_0x0192
        L_0x018e:
            int r6 = r5.f185335d
            if (r6 != r13) goto L_0x0193
        L_0x0192:
            goto L_0x0137
        L_0x0193:
            r5 = r7
            goto L_0x0016
        L_0x0196:
            sx3.C64197v.m75542k()
            throw r2
        L_0x019a:
            if (r4 == 0) goto L_0x01ac
            java.lang.Class<cl1.o> r15 = cl1.C54991o.class
            androidx.lifecycle.i0 r15 = r0.mo71262a(r15)
            cl1.o r15 = (cl1.C54991o) r15
            cl1.s r0 = new cl1.s
            r0.<init>(r15, r4)
            o40.C61926c.m72668M(r0)
        L_0x01ac:
            java.lang.String r15 = r14.f191930c
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zg1.C66806a.mo14632d(java.util.LinkedList):void");
    }

    /* renamed from: g */
    public int[] mo14635g() {
        return new int[]{20011, 20007, 20080};
    }
}
