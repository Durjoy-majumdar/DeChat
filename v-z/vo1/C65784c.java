package vo1;

import yo1.C66688d;

/* renamed from: vo1.c */
public final class C65784c implements C66688d {

    /* renamed from: a */
    public final /* synthetic */ C65770a0 f189223a;

    /* renamed from: b */
    public final /* synthetic */ C65779b f189224b;

    public C65784c(C65770a0 a0Var, C65779b bVar) {
        this.f189223a = a0Var;
        this.f189224b = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:152:0x034a  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x020f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo89821a(te3.C49030co0 r47, boolean r48, java.util.List<? extends te3.C51343t41> r49, java.util.List<? extends te3.C52013xs0> r50) {
        /*
            r46 = this;
            r0 = r46
            r1 = r47
            r2 = r48
            java.lang.String r3 = "resp"
            gy3.C87412m.m108594g(r1, r3)
            if (r2 == 0) goto L_0x0525
            vo1.a0 r3 = r0.f189223a
            int r4 = r1.f131866i
            r5 = 1
            if (r4 != r5) goto L_0x002f
            cp1.m r4 = r3.f189201o
            if (r4 == 0) goto L_0x001b
            r4.mo82763i()
        L_0x001b:
            cp1.o r3 = r3.f189191e
            if (r3 == 0) goto L_0x002f
            android.content.Context r3 = r3.getUIContext()
            if (r3 == 0) goto L_0x002f
            r4 = 2131828696(0x7f111fd8, float:1.929034E38)
            java.lang.String r4 = r3.getString(r4)
            nj3.C76912y0.m92767f(r3, r4)
        L_0x002f:
            vo1.a0 r3 = r0.f189223a
            te3.m31 r1 = r1.f131862e
            java.lang.Class<pg1.d> r4 = pg1.C62283d.class
            androidx.lifecycle.i0 r3 = r3.mo89804e(r4)
            pg1.d r3 = (pg1.C62283d) r3
            if (r3 == 0) goto L_0x0525
            java.lang.Class<cl1.u> r4 = cl1.C55001u.class
            java.lang.Class<ak1.w> r6 = ak1.C54116w.class
            java.lang.Class<cl1.o> r7 = cl1.C54991o.class
            java.lang.Class<cl1.d0> r8 = cl1.C54963d0.class
            if (r1 == 0) goto L_0x004a
            java.util.LinkedList<te3.l31> r10 = r1.f137806j
            goto L_0x004b
        L_0x004a:
            r10 = 0
        L_0x004b:
            if (r10 != 0) goto L_0x0052
            java.util.LinkedList r10 = new java.util.LinkedList
            r10.<init>()
        L_0x0052:
            if (r1 == 0) goto L_0x0057
            te3.o31 r11 = r1.f137807n
            goto L_0x0058
        L_0x0057:
            r11 = 0
        L_0x0058:
            if (r1 == 0) goto L_0x005d
            te3.iw0 r12 = r1.f137808o
            goto L_0x005e
        L_0x005d:
            r12 = 0
        L_0x005e:
            java.lang.String r13 = r3.mo87350c3()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "checkLinkMicStateWhenJoin micUserList.size:"
            r14.append(r15)
            int r15 = r10.size()
            r14.append(r15)
            java.lang.String r15 = " micInfo:[sessionId:"
            r14.append(r15)
            if (r1 == 0) goto L_0x007d
            java.lang.String r1 = r1.f137800d
            goto L_0x007e
        L_0x007d:
            r1 = 0
        L_0x007e:
            r14.append(r1)
            java.lang.String r1 = ", micUserList:"
            r14.append(r1)
            r14.append(r10)
            java.lang.String r1 = "], micPkInfo:[sessionId:"
            r14.append(r1)
            if (r11 == 0) goto L_0x0093
            java.lang.String r1 = r11.f138922d
            goto L_0x0094
        L_0x0093:
            r1 = 0
        L_0x0094:
            r14.append(r1)
            java.lang.String r1 = ", seq:"
            r14.append(r1)
            if (r11 == 0) goto L_0x00a6
            r1 = r10
            long r9 = r11.f138923e
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            goto L_0x00a8
        L_0x00a6:
            r1 = r10
            r9 = 0
        L_0x00a8:
            r14.append(r9)
            java.lang.String r9 = ", micNickname:"
            r14.append(r9)
            if (r11 == 0) goto L_0x00bd
            te3.hx0 r9 = r11.f138925g
            if (r9 == 0) goto L_0x00bd
            com.tencent.mm.protocal.protobuf.FinderContact r9 = r9.f134919d
            if (r9 == 0) goto L_0x00bd
            java.lang.String r9 = r9.nickname
            goto L_0x00be
        L_0x00bd:
            r9 = 0
        L_0x00be:
            r14.append(r9)
            java.lang.String r9 = ", status:"
            r14.append(r9)
            if (r11 == 0) goto L_0x00cf
            int r9 = r11.f138926h
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            goto L_0x00d0
        L_0x00cf:
            r9 = 0
        L_0x00d0:
            r14.append(r9)
            r9 = 93
            r14.append(r9)
            java.lang.String r9 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r9)
            java.lang.String r9 = ""
            java.lang.String r10 = "checkLinkMicStateWhenJoin has unfinished mic others. update mic status"
            java.lang.String r13 = "checkLinkMicStateWhenJoin has unfinished mic self. will close mic"
            if (r11 == 0) goto L_0x03bd
            java.lang.String r15 = r11.f138922d
            if (r15 == 0) goto L_0x00f4
            int r15 = r15.length()
            if (r15 != 0) goto L_0x00f2
            goto L_0x00f4
        L_0x00f2:
            r15 = 0
            goto L_0x00f5
        L_0x00f4:
            r15 = 1
        L_0x00f5:
            if (r15 != 0) goto L_0x03bd
            java.lang.String r15 = r3.mo87350c3()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r5 = "checkLinkMicStateWhenJoin has unfinished mic pk status:"
            r14.append(r5)
            int r5 = r11.f138926h
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r14.append(r5)
            java.lang.String r5 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r5)
            te3.hx0 r5 = r11.f138925g
            if (r5 == 0) goto L_0x0207
            java.lang.String r5 = r11.f138924f
            androidx.lifecycle.i0 r14 = r3.business(r7)
            cl1.o r14 = (cl1.C54991o) r14
            java.lang.String r14 = r14.mo76015n4()
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r5, (java.lang.String) r14)
            if (r5 != 0) goto L_0x0207
            int r5 = r11.f138926h
            r14 = 1
            if (r5 != r14) goto L_0x0138
            androidx.lifecycle.i0 r4 = r3.business(r8)
            cl1.d0 r4 = (cl1.C54963d0) r4
            goto L_0x0207
        L_0x0138:
            r14 = 2
            if (r5 != r14) goto L_0x0207
            androidx.lifecycle.i0 r5 = r3.business(r8)
            cl1.d0 r5 = (cl1.C54963d0) r5
            long r14 = r11.f138923e
            r5.f154069i = r14
            al1.j r5 = new al1.j
            java.lang.String r14 = r11.f138924f
            te3.hx0 r15 = r11.f138925g
            r45 = r9
            if (r15 == 0) goto L_0x0158
            com.tencent.mm.protocal.protobuf.FinderContact r9 = r15.f134919d
            if (r9 == 0) goto L_0x0158
            java.lang.String r9 = r9.headUrl
            r20 = r9
            goto L_0x015a
        L_0x0158:
            r20 = 0
        L_0x015a:
            if (r15 == 0) goto L_0x0165
            com.tencent.mm.protocal.protobuf.FinderContact r9 = r15.f134919d
            if (r9 == 0) goto L_0x0165
            java.lang.String r9 = r9.username
            r21 = r9
            goto L_0x0167
        L_0x0165:
            r21 = 0
        L_0x0167:
            if (r15 == 0) goto L_0x0172
            com.tencent.mm.protocal.protobuf.FinderContact r9 = r15.f134919d
            if (r9 == 0) goto L_0x0172
            java.lang.String r9 = r9.nickname
            r22 = r9
            goto L_0x0174
        L_0x0172:
            r22 = 0
        L_0x0174:
            r23 = 2
            java.lang.String r9 = r11.f138922d
            r25 = 0
            r26 = 1
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            if (r15 == 0) goto L_0x018f
            java.lang.String r2 = r15.f134927o
            r33 = r2
            goto L_0x0191
        L_0x018f:
            r33 = 0
        L_0x0191:
            r34 = 0
            r35 = 0
            r38 = 0
            r39 = 0
            if (r15 == 0) goto L_0x01a0
            te3.up2 r2 = r15.f134935w
            r40 = r2
            goto L_0x01a2
        L_0x01a0:
            r40 = 0
        L_0x01a2:
            r41 = 0
            r42 = 0
            r43 = 7192320(0x6dbf00, float:1.0078587E-38)
            r44 = 0
            r18 = r5
            r19 = r14
            r24 = r9
            r37 = r15
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r37, r38, r39, r40, r41, r42, r43, r44)
            androidx.lifecycle.i0 r2 = r3.business(r8)
            cl1.d0 r2 = (cl1.C54963d0) r2
            r2.mo75917Y3(r5)
            androidx.lifecycle.i0 r2 = r3.business(r8)
            cl1.d0 r2 = (cl1.C54963d0) r2
            r5 = 4
            r2.f154078u = r5
            di3.d r2 = di3.C86312j.m106911c(r6)
            ak1.w r2 = (ak1.C54116w) r2
            androidx.lifecycle.i0 r5 = r3.business(r4)
            cl1.u r5 = (cl1.C55001u) r5
            te3.c21 r5 = r5.f154420q
            long r14 = r5.f182392d
            r5 = 1
            r2.Ax0(r14, r5)
            di3.d r2 = di3.C86312j.m106911c(r6)
            ak1.w r2 = (ak1.C54116w) r2
            androidx.lifecycle.i0 r4 = r3.business(r4)
            cl1.u r4 = (cl1.C55001u) r4
            te3.c21 r4 = r4.f154420q
            long r4 = r4.f182392d
            r2.Bx0(r4)
            androidx.lifecycle.i0 r2 = r3.business(r8)
            cl1.d0 r2 = (cl1.C54963d0) r2
            java.util.LinkedList<te3.l31> r4 = r11.f138927i
            java.util.List r2 = r2.mo75920b4(r4)
            androidx.lifecycle.i0 r4 = r3.business(r8)
            cl1.d0 r4 = (cl1.C54963d0) r4
            java.lang.String r5 = r11.f138922d
            r4.mo75925g3(r2, r5)
            goto L_0x0209
        L_0x0207:
            r45 = r9
        L_0x0209:
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L_0x0348
            java.lang.String r2 = r3.mo87350c3()
            java.lang.String r4 = "checkLinkMicStateWhenJoin has self room audience mic"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            java.util.Iterator r1 = r1.iterator()
        L_0x021c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0348
            java.lang.Object r2 = r1.next()
            te3.l31 r2 = (te3.C50209l31) r2
            if (r2 == 0) goto L_0x022d
            te3.hx0 r4 = r2.f137145d
            goto L_0x022e
        L_0x022d:
            r4 = 0
        L_0x022e:
            if (r4 == 0) goto L_0x021c
            java.lang.String r4 = r2.f137147f
            androidx.lifecycle.i0 r5 = r3.business(r7)
            cl1.o r5 = (cl1.C54991o) r5
            java.lang.String r5 = r5.mo76015n4()
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r4, (java.lang.String) r5)
            if (r4 != 0) goto L_0x02be
            java.lang.String r4 = r3.mo87350c3()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r10)
            androidx.lifecycle.i0 r4 = r3.business(r8)
            cl1.d0 r4 = (cl1.C54963d0) r4
            al1.j r5 = new al1.j
            java.lang.String r6 = r2.f137147f
            te3.hx0 r9 = r2.f137145d
            if (r9 == 0) goto L_0x0260
            com.tencent.mm.protocal.protobuf.FinderContact r11 = r9.f134919d
            if (r11 == 0) goto L_0x0260
            java.lang.String r11 = r11.headUrl
            r19 = r11
            goto L_0x0262
        L_0x0260:
            r19 = 0
        L_0x0262:
            if (r9 == 0) goto L_0x026d
            com.tencent.mm.protocal.protobuf.FinderContact r11 = r9.f134919d
            if (r11 == 0) goto L_0x026d
            java.lang.String r11 = r11.username
            r20 = r11
            goto L_0x026f
        L_0x026d:
            r20 = 0
        L_0x026f:
            if (r9 == 0) goto L_0x027a
            com.tencent.mm.protocal.protobuf.FinderContact r11 = r9.f134919d
            if (r11 == 0) goto L_0x027a
            java.lang.String r11 = r11.nickname
            r21 = r11
            goto L_0x027c
        L_0x027a:
            r21 = 0
        L_0x027c:
            int r11 = r2.f137146e
            java.lang.String r2 = r2.f137148g
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            if (r9 == 0) goto L_0x0293
            int r14 = r9.f134923h
            r30 = r14
            goto L_0x0295
        L_0x0293:
            r30 = 0
        L_0x0295:
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 8253376(0x7defc0, float:1.1565443E-38)
            r43 = 0
            r17 = r5
            r18 = r6
            r22 = r11
            r23 = r2
            r36 = r9
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r36, r37, r38, r39, r40, r41, r42, r43)
            r4.mo75917Y3(r5)
            goto L_0x021c
        L_0x02be:
            java.lang.String r4 = r3.mo87350c3()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r13)
            androidx.lifecycle.i0 r4 = r3.business(r8)
            cl1.d0 r4 = (cl1.C54963d0) r4
            java.lang.String r5 = r2.f137148g
            if (r5 != 0) goto L_0x02d1
            r5 = r45
        L_0x02d1:
            r4.f154070j = r5
            androidx.lifecycle.i0 r4 = r3.business(r7)
            cl1.o r4 = (cl1.C54991o) r4
            al1.j r5 = new al1.j
            java.lang.String r6 = r2.f137147f
            te3.hx0 r9 = r2.f137145d
            if (r9 == 0) goto L_0x02ea
            com.tencent.mm.protocal.protobuf.FinderContact r11 = r9.f134919d
            if (r11 == 0) goto L_0x02ea
            java.lang.String r11 = r11.headUrl
            r19 = r11
            goto L_0x02ec
        L_0x02ea:
            r19 = 0
        L_0x02ec:
            if (r9 == 0) goto L_0x02f7
            com.tencent.mm.protocal.protobuf.FinderContact r11 = r9.f134919d
            if (r11 == 0) goto L_0x02f7
            java.lang.String r11 = r11.username
            r20 = r11
            goto L_0x02f9
        L_0x02f7:
            r20 = 0
        L_0x02f9:
            if (r9 == 0) goto L_0x0304
            com.tencent.mm.protocal.protobuf.FinderContact r11 = r9.f134919d
            if (r11 == 0) goto L_0x0304
            java.lang.String r11 = r11.nickname
            r21 = r11
            goto L_0x0306
        L_0x0304:
            r21 = 0
        L_0x0306:
            int r11 = r2.f137146e
            java.lang.String r2 = r2.f137148g
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            if (r9 == 0) goto L_0x031d
            int r14 = r9.f134923h
            r30 = r14
            goto L_0x031f
        L_0x031d:
            r30 = 0
        L_0x031f:
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 8253376(0x7defc0, float:1.1565443E-38)
            r43 = 0
            r17 = r5
            r18 = r6
            r22 = r11
            r23 = r2
            r36 = r9
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r36, r37, r38, r39, r40, r41, r42, r43)
            r4.mo76009k4(r5)
            goto L_0x021c
        L_0x0348:
            if (r12 == 0) goto L_0x0525
            int r1 = r12.f135700f
            r2 = 10
            java.lang.String r4 = "battleInfo.player_info"
            if (r1 == r2) goto L_0x0390
            r2 = 20
            if (r1 == r2) goto L_0x0358
            goto L_0x0525
        L_0x0358:
            androidx.lifecycle.i0 r1 = r3.business(r8)
            cl1.d0 r1 = (cl1.C54963d0) r1
            cj1.a1 r1 = r1.f154051E
            if (r1 == 0) goto L_0x036b
            int r2 = r12.f135703i
            r5 = 3
            r1.f153392e = r5
            r1.f153391d = r2
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x036b:
            androidx.lifecycle.i0 r1 = r3.business(r8)
            cl1.d0 r1 = (cl1.C54963d0) r1
            cj1.a1 r1 = r1.f154051E
            if (r1 != 0) goto L_0x0376
            goto L_0x037a
        L_0x0376:
            int r2 = r12.f135701g
            r1.f153390c = r2
        L_0x037a:
            androidx.lifecycle.i0 r1 = r3.business(r8)
            cl1.d0 r1 = (cl1.C54963d0) r1
            cj1.a1 r1 = r1.f154051E
            if (r1 == 0) goto L_0x0525
            java.util.LinkedList<te3.ae3> r2 = r12.f135702h
            gy3.C87412m.m108593f(r2, r4)
            r1.mo75625d(r2)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0525
        L_0x0390:
            androidx.lifecycle.i0 r1 = r3.business(r8)
            cl1.d0 r1 = (cl1.C54963d0) r1
            cj1.a1 r2 = new cj1.a1
            java.lang.String r14 = r12.f135698d
            long r5 = r12.f135699e
            int r3 = r12.f135701g
            r18 = -1
            r19 = 2
            r20 = 0
            r21 = 32
            r22 = 0
            r13 = r2
            r15 = r5
            r17 = r3
            r13.<init>(r14, r15, r17, r18, r19, r20, r21, r22)
            java.util.LinkedList<te3.ae3> r3 = r12.f135702h
            gy3.C87412m.m108593f(r3, r4)
            r2.mo75625d(r3)
            rx3.b0 r3 = rx3.C13598b0.f38549a
            r1.f154051E = r2
            goto L_0x0525
        L_0x03bd:
            r45 = r9
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L_0x0525
            java.lang.String r2 = r3.mo87350c3()
            java.lang.String r5 = "checkLinkMicStateWhenJoin has unfinished mic"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r5)
            java.util.Iterator r1 = r1.iterator()
        L_0x03d2:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x04fe
            java.lang.Object r2 = r1.next()
            te3.l31 r2 = (te3.C50209l31) r2
            if (r2 == 0) goto L_0x03e3
            te3.hx0 r5 = r2.f137145d
            goto L_0x03e4
        L_0x03e3:
            r5 = 0
        L_0x03e4:
            if (r5 == 0) goto L_0x03d2
            java.lang.String r5 = r2.f137147f
            androidx.lifecycle.i0 r9 = r3.business(r7)
            cl1.o r9 = (cl1.C54991o) r9
            java.lang.String r9 = r9.mo76015n4()
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r5, (java.lang.String) r9)
            if (r5 != 0) goto L_0x0474
            java.lang.String r5 = r3.mo87350c3()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r10)
            androidx.lifecycle.i0 r5 = r3.business(r8)
            cl1.d0 r5 = (cl1.C54963d0) r5
            al1.j r9 = new al1.j
            java.lang.String r11 = r2.f137147f
            te3.hx0 r12 = r2.f137145d
            if (r12 == 0) goto L_0x0416
            com.tencent.mm.protocal.protobuf.FinderContact r14 = r12.f134919d
            if (r14 == 0) goto L_0x0416
            java.lang.String r14 = r14.headUrl
            r20 = r14
            goto L_0x0418
        L_0x0416:
            r20 = 0
        L_0x0418:
            if (r12 == 0) goto L_0x0423
            com.tencent.mm.protocal.protobuf.FinderContact r14 = r12.f134919d
            if (r14 == 0) goto L_0x0423
            java.lang.String r14 = r14.username
            r21 = r14
            goto L_0x0425
        L_0x0423:
            r21 = 0
        L_0x0425:
            if (r12 == 0) goto L_0x0430
            com.tencent.mm.protocal.protobuf.FinderContact r14 = r12.f134919d
            if (r14 == 0) goto L_0x0430
            java.lang.String r14 = r14.nickname
            r22 = r14
            goto L_0x0432
        L_0x0430:
            r22 = 0
        L_0x0432:
            int r14 = r2.f137146e
            java.lang.String r2 = r2.f137148g
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            if (r12 == 0) goto L_0x0449
            int r15 = r12.f134923h
            r31 = r15
            goto L_0x044b
        L_0x0449:
            r31 = 0
        L_0x044b:
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 8253376(0x7defc0, float:1.1565443E-38)
            r44 = 0
            r18 = r9
            r19 = r11
            r23 = r14
            r24 = r2
            r37 = r12
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r37, r38, r39, r40, r41, r42, r43, r44)
            r5.mo75917Y3(r9)
            goto L_0x03d2
        L_0x0474:
            java.lang.String r5 = r3.mo87350c3()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r13)
            androidx.lifecycle.i0 r5 = r3.business(r8)
            cl1.d0 r5 = (cl1.C54963d0) r5
            java.lang.String r9 = r2.f137148g
            if (r9 != 0) goto L_0x0487
            r9 = r45
        L_0x0487:
            r5.f154070j = r9
            androidx.lifecycle.i0 r5 = r3.business(r7)
            cl1.o r5 = (cl1.C54991o) r5
            al1.j r9 = new al1.j
            java.lang.String r11 = r2.f137147f
            te3.hx0 r12 = r2.f137145d
            if (r12 == 0) goto L_0x04a0
            com.tencent.mm.protocal.protobuf.FinderContact r14 = r12.f134919d
            if (r14 == 0) goto L_0x04a0
            java.lang.String r14 = r14.headUrl
            r20 = r14
            goto L_0x04a2
        L_0x04a0:
            r20 = 0
        L_0x04a2:
            if (r12 == 0) goto L_0x04ad
            com.tencent.mm.protocal.protobuf.FinderContact r14 = r12.f134919d
            if (r14 == 0) goto L_0x04ad
            java.lang.String r14 = r14.username
            r21 = r14
            goto L_0x04af
        L_0x04ad:
            r21 = 0
        L_0x04af:
            if (r12 == 0) goto L_0x04ba
            com.tencent.mm.protocal.protobuf.FinderContact r14 = r12.f134919d
            if (r14 == 0) goto L_0x04ba
            java.lang.String r14 = r14.nickname
            r22 = r14
            goto L_0x04bc
        L_0x04ba:
            r22 = 0
        L_0x04bc:
            int r14 = r2.f137146e
            java.lang.String r2 = r2.f137148g
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            if (r12 == 0) goto L_0x04d3
            int r15 = r12.f134923h
            r31 = r15
            goto L_0x04d5
        L_0x04d3:
            r31 = 0
        L_0x04d5:
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 8253376(0x7defc0, float:1.1565443E-38)
            r44 = 0
            r18 = r9
            r19 = r11
            r23 = r14
            r24 = r2
            r37 = r12
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r37, r38, r39, r40, r41, r42, r43, r44)
            r5.mo76009k4(r9)
            goto L_0x03d2
        L_0x04fe:
            di3.d r1 = di3.C86312j.m106911c(r6)
            ak1.w r1 = (ak1.C54116w) r1
            androidx.lifecycle.i0 r2 = r3.business(r4)
            cl1.u r2 = (cl1.C55001u) r2
            te3.c21 r2 = r2.f154420q
            long r7 = r2.f182392d
            r2 = 1
            r1.Ax0(r7, r2)
            di3.d r1 = di3.C86312j.m106911c(r6)
            ak1.w r1 = (ak1.C54116w) r1
            androidx.lifecycle.i0 r2 = r3.business(r4)
            cl1.u r2 = (cl1.C55001u) r2
            te3.c21 r2 = r2.f154420q
            long r2 = r2.f182392d
            r1.Bx0(r2)
        L_0x0525:
            vo1.a0 r1 = r0.f189223a
            cp1.o r1 = r1.f189191e
            if (r1 == 0) goto L_0x0534
            r2 = r48
            r3 = r49
            r4 = r50
            r1.mo78577a(r2, r3, r4)
        L_0x0534:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vo1.C65784c.mo89821a(te3.co0, boolean, java.util.List, java.util.List):void");
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [rx3.b0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo89822b(te3.C48742ao0 r10) {
        /*
            r9 = this;
            vo1.a0 r0 = r9.f189223a
            vo1.b r1 = r9.f189224b
            java.lang.Class<cl1.u> r2 = cl1.C55001u.class
            r3 = 0
            if (r10 == 0) goto L_0x00a2
            java.lang.Class<vo1.u> r4 = vo1.C65824u.class
            androidx.lifecycle.i0 r4 = r0.mo89804e(r4)
            vo1.u r4 = (vo1.C65824u) r4
            if (r4 == 0) goto L_0x003a
            yg1.a r5 = new yg1.a
            r5.<init>()
            int r6 = r5.f105068a
            r5.f105068a = r6
            int r6 = r5.f105069b
            r5.f105069b = r6
            yg1.a$a r6 = new yg1.a$a
            r7 = 0
            r8 = 2
            r6.<init>(r10, r7, r8, r3)
            r5.f105070c = r6
            androidx.lifecycle.i0 r10 = r0.mo89804e(r2)
            cl1.u r10 = (cl1.C55001u) r10
            if (r10 == 0) goto L_0x0034
            java.lang.String r10 = r10.f154426w
            goto L_0x0035
        L_0x0034:
            r10 = r3
        L_0x0035:
            r5.f105071d = r10
            r4.mo89859e3(r5)
        L_0x003a:
            java.lang.String r10 = r1.f189213b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "handleMsg,cur liveId:"
            r1.append(r4)
            java.lang.Class<bp1.d> r4 = bp1.C54519d.class
            androidx.lifecycle.i0 r4 = r0.mo89804e(r4)
            bp1.d r4 = (bp1.C54519d) r4
            if (r4 == 0) goto L_0x0059
            long r4 = r4.mo75371d3()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            goto L_0x005a
        L_0x0059:
            r4 = r3
        L_0x005a:
            r1.append(r4)
            java.lang.String r4 = ",uv:"
            r1.append(r4)
            androidx.lifecycle.i0 r4 = r0.mo89804e(r2)
            cl1.u r4 = (cl1.C55001u) r4
            if (r4 == 0) goto L_0x0079
            te3.c21 r4 = r4.f154420q
            if (r4 == 0) goto L_0x0079
            te3.e71 r4 = r4.f182388Z
            if (r4 == 0) goto L_0x0079
            long r4 = r4.f182929e
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            goto L_0x007a
        L_0x0079:
            r4 = r3
        L_0x007a:
            r1.append(r4)
            java.lang.String r4 = ",liveCharge:"
            r1.append(r4)
            sk1.a r4 = sk1.C63947a.f181274a
            androidx.lifecycle.i0 r0 = r0.mo89804e(r2)
            cl1.u r0 = (cl1.C55001u) r0
            if (r0 == 0) goto L_0x0092
            te3.c21 r0 = r0.f154420q
            if (r0 == 0) goto L_0x0092
            te3.e61 r3 = r0.f182363I
        L_0x0092:
            java.lang.String r0 = r4.mo88725k(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x00a2:
            if (r3 != 0) goto L_0x00a9
            y50.k r10 = y50.C53496k.f150436a
            r10.mo74169b()
        L_0x00a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vo1.C65784c.mo89822b(te3.ao0):void");
    }
}
