package vv1;

import hp3.C87581a;

/* renamed from: vv1.k */
public final class C22803k<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C22801j f65557a;

    /* renamed from: b */
    public final /* synthetic */ long f65558b;

    /* renamed from: c */
    public final /* synthetic */ String f65559c;

    /* renamed from: d */
    public final /* synthetic */ boolean f65560d;

    public C22803k(C22801j jVar, long j, String str, boolean z) {
        this.f65557a = jVar;
        this.f65558b = j;
        this.f65559c = str;
        this.f65560d = z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: java.lang.Object} */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01b3, code lost:
        if (r14 == null) goto L_0x01b9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object call(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            ob0.b$c r1 = (ob0.C89132b.C89134c) r1
            vv1.j r2 = r0.f65557a
            java.lang.String r2 = r2.f65551d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "OnPardusSearchSceneEnd "
            r3.append(r4)
            int r4 = r1.f256793a
            r3.append(r4)
            r4 = 32
            r3.append(r4)
            int r5 = r1.f256794b
            r3.append(r5)
            r3.append(r4)
            java.lang.String r4 = r1.f256795c
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            bp3.p r2 = bp3.C79758p.f233760a
            sf3.c r3 = new sf3.c
            r3.<init>()
            int r2 = r2.mo109883f(r3)
            long r2 = (long) r2
            java.lang.Thread.sleep(r2)
            vv1.j r2 = r0.f65557a
            long r3 = r2.f65552e
            long r5 = r0.f65558b
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x005d
            java.lang.String r2 = r2.f65553f
            java.lang.String r3 = r0.f65559c
            boolean r2 = gy3.C87412m.m108589b(r2, r3)
            if (r2 == 0) goto L_0x005d
            vv1.j r2 = r0.f65557a
            boolean r2 = r2.f65554g
            if (r2 == 0) goto L_0x005d
            r2 = 1
            goto L_0x005f
        L_0x005d:
            boolean r2 = r0.f65560d
        L_0x005f:
            T r3 = r1.f256796d
            te3.fb3 r3 = (te3.C49404fb3) r3
            if (r3 == 0) goto L_0x006f
            te3.qd4 r4 = r3.f133396j
            if (r4 == 0) goto L_0x006f
            te3.pw r4 = r4.f140254g
            if (r4 == 0) goto L_0x006f
            boolean r2 = r4.f140027d
        L_0x006f:
            java.lang.String r15 = ""
            if (r3 == 0) goto L_0x0082
            te3.qd4 r4 = r3.f133396j
            if (r4 == 0) goto L_0x0082
            te3.pw r4 = r4.f140254g
            if (r4 == 0) goto L_0x0082
            java.lang.String r4 = r4.f140028e
            if (r4 == 0) goto L_0x0082
            r16 = r4
            goto L_0x0084
        L_0x0082:
            r16 = r15
        L_0x0084:
            r4 = 10
            if (r3 == 0) goto L_0x0095
            te3.qd4 r3 = r3.f133396j
            if (r3 == 0) goto L_0x0095
            te3.pw r3 = r3.f140254g
            if (r3 == 0) goto L_0x0095
            int r3 = r3.f140029f
            if (r3 == 0) goto L_0x0095
            goto L_0x0097
        L_0x0095:
            r3 = 10
        L_0x0097:
            vv1.j r5 = r0.f65557a
            java.lang.String r5 = r5.f65551d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "stickBottom:"
            r6.append(r7)
            T r7 = r1.f256796d
            te3.fb3 r7 = (te3.C49404fb3) r7
            r14 = 0
            if (r7 == 0) goto L_0x00bc
            te3.qd4 r7 = r7.f133396j
            if (r7 == 0) goto L_0x00bc
            te3.pw r7 = r7.f140254g
            if (r7 == 0) goto L_0x00bc
            boolean r7 = r7.f140027d
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto L_0x00bd
        L_0x00bc:
            r7 = r14
        L_0x00bd:
            r6.append(r7)
            java.lang.String r7 = ", stickBottomClient:"
            r6.append(r7)
            r6.append(r2)
            java.lang.String r7 = ", sugTitle:"
            r6.append(r7)
            T r7 = r1.f256796d
            te3.fb3 r7 = (te3.C49404fb3) r7
            if (r7 == 0) goto L_0x00de
            te3.qd4 r7 = r7.f133396j
            if (r7 == 0) goto L_0x00de
            te3.pw r7 = r7.f140254g
            if (r7 == 0) goto L_0x00de
            java.lang.String r7 = r7.f140028e
            goto L_0x00df
        L_0x00de:
            r7 = r14
        L_0x00df:
            r6.append(r7)
            java.lang.String r7 = ", recommendNum:"
            r6.append(r7)
            T r7 = r1.f256796d
            te3.fb3 r7 = (te3.C49404fb3) r7
            if (r7 == 0) goto L_0x00fc
            te3.qd4 r7 = r7.f133396j
            if (r7 == 0) goto L_0x00fc
            te3.pw r7 = r7.f140254g
            if (r7 == 0) goto L_0x00fc
            int r7 = r7.f140029f
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x00fd
        L_0x00fc:
            r7 = r14
        L_0x00fd:
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            int r5 = r1.f256793a
            if (r5 != 0) goto L_0x01ef
            int r5 = r1.f256794b
            if (r5 != 0) goto L_0x01ef
            T r5 = r1.f256796d
            te3.fb3 r5 = (te3.C49404fb3) r5
            if (r5 == 0) goto L_0x01b6
            te3.qd4 r5 = r5.f133396j
            if (r5 == 0) goto L_0x01b6
            vv1.j r6 = r0.f65557a
            java.lang.String r7 = r0.f65559c
            long r8 = r0.f65558b
            java.lang.String r10 = r6.f65551d
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "relatedResults: "
            r11.append(r12)
            java.util.LinkedList<te3.pd4> r12 = r5.f140251d
            if (r12 == 0) goto L_0x014e
            java.util.ArrayList r13 = new java.util.ArrayList
            int r4 = sx3.C36907w.m41090l(r12, r4)
            r13.<init>(r4)
            java.util.Iterator r4 = r12.iterator()
        L_0x013c:
            boolean r12 = r4.hasNext()
            if (r12 == 0) goto L_0x014f
            java.lang.Object r12 = r4.next()
            te3.pd4 r12 = (te3.pd4) r12
            java.lang.String r12 = r12.f139710d
            r13.add(r12)
            goto L_0x013c
        L_0x014e:
            r13 = r14
        L_0x014f:
            r11.append(r13)
            java.lang.String r4 = " ExtInfo:"
            r11.append(r4)
            java.lang.String r4 = r5.f140253f
            r11.append(r4)
            java.lang.String r4 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r4)
            com.tencent.mm.sdk.statecenter.UIStateCenter r13 = r6.mo14599e3()
            if (r13 == 0) goto L_0x01b0
            w00.c r12 = new w00.c
            T r4 = r1.f256796d
            te3.fb3 r4 = (te3.C49404fb3) r4
            if (r4 == 0) goto L_0x0174
            java.lang.String r4 = r4.f133390d
            goto L_0x0175
        L_0x0174:
            r4 = r14
        L_0x0175:
            if (r4 != 0) goto L_0x0179
            r10 = r15
            goto L_0x017a
        L_0x0179:
            r10 = r4
        L_0x017a:
            r11 = 0
            java.util.LinkedList<te3.pd4> r4 = r5.f140251d
            if (r4 != 0) goto L_0x0184
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
        L_0x0184:
            r17 = r4
            java.lang.String r4 = r5.f140253f
            if (r4 != 0) goto L_0x018d
            r18 = r15
            goto L_0x018f
        L_0x018d:
            r18 = r4
        L_0x018f:
            r4 = r12
            r5 = r7
            r6 = r8
            r8 = r10
            r9 = r11
            r10 = r17
            r11 = r2
            r19 = r12
            r12 = r18
            r20 = r13
            r13 = r16
            r22 = r15
            r15 = r14
            r14 = r3
            r4.<init>(r5, r6, r8, r9, r10, r11, r12, r13, r14)
            r5 = r19
            r4 = r20
            r4.dispatch(r5)
            rx3.b0 r14 = rx3.C13598b0.f38549a
            goto L_0x01b3
        L_0x01b0:
            r22 = r15
            r15 = r14
        L_0x01b3:
            if (r14 != 0) goto L_0x0226
            goto L_0x01b9
        L_0x01b6:
            r22 = r15
            r15 = r14
        L_0x01b9:
            vv1.j r4 = r0.f65557a
            java.lang.String r5 = r0.f65559c
            long r6 = r0.f65558b
            com.tencent.mm.sdk.statecenter.UIStateCenter r14 = r4.mo14599e3()
            if (r14 == 0) goto L_0x0226
            w00.c r13 = new w00.c
            T r1 = r1.f256796d
            te3.fb3 r1 = (te3.C49404fb3) r1
            if (r1 == 0) goto L_0x01d0
            java.lang.String r1 = r1.f133390d
            goto L_0x01d1
        L_0x01d0:
            r1 = r15
        L_0x01d1:
            if (r1 != 0) goto L_0x01d6
            r8 = r22
            goto L_0x01d7
        L_0x01d6:
            r8 = r1
        L_0x01d7:
            r9 = 0
            java.util.LinkedList r10 = new java.util.LinkedList
            r10.<init>()
            java.lang.String r12 = ""
            r4 = r13
            r11 = r2
            r1 = r13
            r13 = r16
            r2 = r14
            r14 = r3
            r4.<init>(r5, r6, r8, r9, r10, r11, r12, r13, r14)
            r2.dispatch(r1)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0226
        L_0x01ef:
            r22 = r15
            r15 = r14
            vv1.j r4 = r0.f65557a
            com.tencent.mm.sdk.statecenter.UIStateCenter r14 = r4.mo14599e3()
            if (r14 == 0) goto L_0x0226
            w00.c r13 = new w00.c
            java.lang.String r5 = r0.f65559c
            long r6 = r0.f65558b
            T r4 = r1.f256796d
            te3.fb3 r4 = (te3.C49404fb3) r4
            if (r4 == 0) goto L_0x0209
            java.lang.String r4 = r4.f133390d
            goto L_0x020a
        L_0x0209:
            r4 = r15
        L_0x020a:
            if (r4 != 0) goto L_0x020f
            r8 = r22
            goto L_0x0210
        L_0x020f:
            r8 = r4
        L_0x0210:
            int r9 = r1.f256794b
            java.util.LinkedList r10 = new java.util.LinkedList
            r10.<init>()
            java.lang.String r12 = ""
            r4 = r13
            r11 = r2
            r1 = r13
            r13 = r16
            r2 = r14
            r14 = r3
            r4.<init>(r5, r6, r8, r9, r10, r11, r12, r13, r14)
            r2.dispatch(r1)
        L_0x0226:
            vv1.j r1 = r0.f65557a
            r1.f65555h = r15
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: vv1.C22803k.call(java.lang.Object):java.lang.Object");
    }
}
