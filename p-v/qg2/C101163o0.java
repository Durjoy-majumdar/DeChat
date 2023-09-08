package qg2;

import com.tencent.p014mm.autogen.events.RecordOperationEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;

/* renamed from: qg2.o0 */
public class C101163o0 extends IStaticListener<RecordOperationEvent> {
    /* JADX WARNING: Removed duplicated region for block: B:119:0x05ca  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x05f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r32) {
        /*
            r31 = this;
            r0 = r32
            com.tencent.mm.autogen.events.RecordOperationEvent r0 = (com.tencent.p014mm.autogen.events.RecordOperationEvent) r0
            java.lang.Class<cp.b> r1 = p478cp.C45137b.class
            java.lang.Class<ym.s> r2 = p763ym.C53543s.class
            java.lang.Class<rn.o> r3 = p227rn.C101397o.class
            java.lang.Class<f62.k0> r4 = f62.C75700k0.class
            java.lang.Class<rn.v> r5 = p227rn.C48053v.class
            java.lang.Class<ln.i> r6 = p196ln.C76708i.class
            java.lang.Class<gt.k> r7 = p158gt.C98201k.class
            r8 = 1
            java.lang.Object[] r9 = new java.lang.Object[r8]
            com.tencent.mm.autogen.events.RecordOperationEvent$a r10 = r0.f265027d
            int r10 = r10.f265029a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r11 = 0
            r9[r11] = r10
            java.lang.String r10 = "MicroMsg.RecordOperationListener"
            java.lang.String r12 = "on record operation listener, %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r12, r9)
            com.tencent.mm.autogen.events.RecordOperationEvent$a r9 = r0.f265027d
            int r12 = r9.f265029a
            java.lang.String r13 = " thumbData MsgInfo path:"
            java.lang.String r14 = "insert msg failed :"
            r15 = -1
            java.lang.Long r15 = java.lang.Long.valueOf(r15)
            java.lang.String r11 = " new msg inserted to db , local id = "
            r16 = 0
            java.lang.String r8 = " msginfo insert id: "
            r18 = r1
            java.lang.String r1 = "send record msg error, touser is null"
            r19 = r2
            java.lang.String r2 = "MicroMsg.RecordMsgLogic"
            r20 = r11
            r11 = 2
            switch(r12) {
                case 0: goto L_0x0696;
                case 1: goto L_0x060b;
                case 2: goto L_0x03fb;
                case 3: goto L_0x03df;
                case 4: goto L_0x03b6;
                case 5: goto L_0x00a2;
                case 6: goto L_0x007b;
                case 7: goto L_0x004b;
                case 8: goto L_0x005b;
                case 9: goto L_0x004d;
                case 10: goto L_0x007b;
                default: goto L_0x004b;
            }
        L_0x004b:
            goto L_0x06a1
        L_0x004d:
            com.tencent.mm.autogen.events.RecordOperationEvent$b r0 = r0.f265028e
            te3.rc0 r1 = r9.f265031c
            long r2 = r9.f265032d
            boolean r1 = qg2.C101147j0.m132628i(r1, r2)
            r0.f265051d = r1
            goto L_0x06a1
        L_0x005b:
            java.lang.String r1 = r9.f265038j
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x006f
            com.tencent.mm.autogen.events.RecordOperationEvent$a r0 = r0.f265027d
            te3.rc0 r1 = r0.f265031c
            long r2 = r0.f265032d
            r4 = 1
            qg2.C101147j0.m132618K(r1, r2, r4)
            goto L_0x06a1
        L_0x006f:
            r4 = 1
            com.tencent.mm.autogen.events.RecordOperationEvent$a r0 = r0.f265027d
            te3.rc0 r1 = r0.f265031c
            long r2 = r0.f265032d
            qg2.C101147j0.m132619L(r1, r2, r4)
            goto L_0x06a1
        L_0x007b:
            com.tencent.mm.autogen.events.DoFavoriteEvent r1 = new com.tencent.mm.autogen.events.DoFavoriteEvent
            r1.<init>()
            com.tencent.mm.autogen.events.RecordOperationEvent$a r2 = r0.f265027d
            android.content.Context r5 = r2.f265041m
            java.lang.String r7 = r2.f265042n
            java.util.List<com.tencent.mm.storage.f4> r8 = r2.f265040l
            r9 = 1
            r10 = 1
            int r11 = r2.f265029a
            r6 = r1
            qg2.C101146j.m132600i(r5, r6, r7, r8, r9, r10, r11)
            com.tencent.mm.autogen.events.RecordOperationEvent$a r2 = r0.f265027d
            android.content.Context r3 = r2.f265041m
            java.lang.String r2 = r2.f265042n
            se3.c r2 = qg2.C101147j0.m132637r(r3, r1, r2)
            com.tencent.mm.autogen.events.RecordOperationEvent$b r0 = r0.f265028e
            r0.f265053f = r1
            r0.f265054g = r2
            goto L_0x06a1
        L_0x00a2:
            java.lang.Object[] r11 = new java.lang.Object[r11]
            java.lang.String r12 = r9.f265033e
            r21 = 0
            r11[r21] = r12
            java.lang.String r9 = r9.f265047s
            java.lang.String r12 = ""
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r9, (java.lang.String) r12)
            r12 = 1
            r11[r12] = r9
            java.lang.String r9 = "summerrecord forward multi record msg, to %s(%s)"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r9, r11)
            com.tencent.mm.autogen.events.RecordOperationEvent$a r9 = r0.f265027d
            android.content.Context r10 = r9.f265041m
            java.lang.String r11 = r9.f265033e
            java.lang.String r12 = r9.f265042n
            r28 = r0
            java.util.List<com.tencent.mm.storage.f4> r0 = r9.f265040l
            r29 = r14
            com.tencent.mm.autogen.events.DoFavoriteEvent r14 = r9.f265044p
            r30 = r8
            se3.c r8 = r9.f265045q
            java.lang.String r9 = r9.f265047s
            sg.g<java.lang.Integer, te3.dp3> r21 = qg2.C101147j0.f296056a
            boolean r21 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r21 == 0) goto L_0x00e7
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r1)
            android.util.Pair r0 = new android.util.Pair
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.<init>(r15, r1)
        L_0x00e3:
            r14 = r28
            goto L_0x039c
        L_0x00e7:
            if (r0 == 0) goto L_0x038d
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x00f1
            goto L_0x038d
        L_0x00f1:
            if (r14 == 0) goto L_0x00f5
            if (r8 != 0) goto L_0x011b
        L_0x00f5:
            com.tencent.mm.autogen.events.DoFavoriteEvent r1 = new com.tencent.mm.autogen.events.DoFavoriteEvent
            r1.<init>()
            r25 = 1
            r26 = 1
            r27 = -1
            r21 = r10
            r22 = r1
            r23 = r12
            r24 = r0
            boolean r0 = qg2.C101146j.m132600i(r21, r22, r23, r24, r25, r26, r27)
            if (r0 != 0) goto L_0x0116
            android.util.Pair r0 = new android.util.Pair
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.<init>(r15, r1)
            goto L_0x00e3
        L_0x0116:
            se3.c r8 = qg2.C101147j0.m132637r(r10, r1, r12)
            r14 = r1
        L_0x011b:
            java.lang.String r0 = r8.f226460d
            java.lang.String r1 = r8.f226461e
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r10 = r14.f264674d
            te3.kd0 r10 = r10.f264676a
            com.tencent.mm.message.l$b r0 = qg2.C101147j0.m132625f(r0, r1, r10)
            com.tencent.mm.storage.f4 r1 = new com.tencent.mm.storage.f4
            r1.<init>()
            java.lang.String r10 = r8.f226462f
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 != 0) goto L_0x013b
            java.lang.String r6 = r8.f226462f
            byte[] r6 = com.tencent.p014mm.sdk.platformtools.Util.readFromFile(r6)
            goto L_0x015a
        L_0x013b:
            int r10 = r8.f226463g
            if (r10 == 0) goto L_0x0140
            goto L_0x0159
        L_0x0140:
            java.lang.String r10 = r8.f226464h
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 != 0) goto L_0x0159
            di3.d r6 = di3.C86312j.m106911c(r6)
            ln.i r6 = (p196ln.C76708i) r6
            java.lang.String r8 = r8.f226464h
            android.graphics.Bitmap r6 = r6.N50(r8)
            byte[] r6 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.Bitmap2Bytes(r6)
            goto L_0x015a
        L_0x0159:
            r6 = 0
        L_0x015a:
            if (r6 == 0) goto L_0x01a7
            int r8 = r6.length
            r10 = 65536(0x10000, float:9.18355E-41)
            if (r8 <= r10) goto L_0x0175
            di3.d r7 = di3.C86312j.m106911c(r7)
            gt.k r7 = (p158gt.C98201k) r7
            gt.m r7 = r7.mo137277xi()
            android.graphics.Bitmap$CompressFormat r8 = android.graphics.Bitmap.CompressFormat.JPEG
            com.tencent.mm.modelimage.m r7 = (com.tencent.p014mm.modelimage.C92839m) r7
            r10 = 0
            java.lang.String r6 = r7.zx0(r6, r10, r8, r10)
            goto L_0x0185
        L_0x0175:
            di3.d r7 = di3.C86312j.m106911c(r7)
            gt.k r7 = (p158gt.C98201k) r7
            gt.m r7 = r7.mo137277xi()
            com.tencent.mm.modelimage.m r7 = (com.tencent.p014mm.modelimage.C92839m) r7
            java.lang.String r6 = r7.mo127179bD(r6)
        L_0x0185:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = p206nj.C76861g.m92660c()
            r7.append(r8)
            r7.append(r13)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r7)
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r7 != 0) goto L_0x01a7
            r1.mo108739S2(r6)
        L_0x01a7:
            hc3.f1 r6 = qg2.C101164q0.m132677c(r0)
            java.lang.String r6 = r6.mo141118z()
            r1.mo108732L2(r6)
            r6 = 1
            r1.mo100991d(r6)
            r1.mo108749c3(r11)
            long r7 = eb0.C75604z3.m90843o(r11)
            r1.mo108733M2(r7)
            r1.mo108740T2(r6)
            r6 = 49
            r1.setType(r6)
            di3.d r5 = di3.C86312j.m106911c(r5)
            rn.v r5 = (p227rn.C48053v) r5
            boolean r5 = r5.mo72614OE(r11)
            if (r5 == 0) goto L_0x01e1
            di3.d r3 = di3.C86312j.m106911c(r3)
            rn.o r3 = (p227rn.C101397o) r3
            java.lang.String r3 = r3.getMsgSource()
            r1.mo101012p4(r3)
        L_0x01e1:
            k40.a r3 = f40.C86709a0.m107533q(r4)
            f62.k0 r3 = (f62.C75700k0) r3
            g62.l r3 = r3.mo96095LE()
            com.tencent.mm.storage.g4 r3 = (com.tencent.p014mm.storage.C72972g4) r3
            long r3 = r3.my0(r1)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = p206nj.C76861g.m92660c()
            r5.append(r6)
            r8 = r30
            r5.append(r8)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r5)
            int r5 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r5 >= 0) goto L_0x0240
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = p206nj.C76861g.m92660c()
            r0.append(r1)
            r12 = r29
            r0.append(r12)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            android.util.Pair r0 = new android.util.Pair
            int r1 = p206nj.C76861g.m92658a()
            r2 = 0
            int r11 = 0 - r1
            long r1 = (long) r11
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.<init>(r1, r2)
            goto L_0x00e3
        L_0x0240:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            int r6 = p206nj.C76861g.m92658a()
            r5.append(r6)
            r6 = r20
            r5.append(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r5)
            r1.setMsgId(r3)
            java.lang.Long r5 = java.lang.Long.valueOf(r3)
            qg2.C101147j0.m132632m(r15, r5, r11)
            com.tencent.mm.message.l r5 = new com.tencent.mm.message.l
            r5.<init>()
            java.lang.String r6 = r1.getContent()
            r5.field_xml = r6
            java.lang.String r6 = r0.f195570f
            r5.field_title = r6
            int r6 = r0.f195582i
            r5.field_type = r6
            java.lang.String r6 = r0.f195574g
            r5.field_description = r6
            r5.field_msgId = r3
            java.lang.String r6 = r0.f195562d
            r5.field_appId = r6
            di3.d r6 = di3.C86312j.m106911c(r19)
            ym.s r6 = (p763ym.C53543s) r6
            ym.n r6 = r6.mo74023HM()
            com.tencent.mm.pluginsdk.model.app.s r6 = (com.tencent.p014mm.pluginsdk.model.app.C96776s) r6
            r6.mo135039jo(r5)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r5 = r14.f264674d
            te3.kd0 r5 = r5.f264676a
            java.util.LinkedList<te3.rc0> r5 = r5.f298618f
            java.util.Iterator r5 = r5.iterator()
            r6 = 0
        L_0x029c:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x02f2
            java.lang.Object r7 = r5.next()
            te3.rc0 r7 = (te3.C101834rc0) r7
            java.lang.String r8 = r7.f299280T
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 == 0) goto L_0x02bd
            java.lang.String r8 = r7.toString()
            int r10 = r7.f299258I
            java.lang.String r8 = qg2.C101147j0.m132633n(r8, r10)
            r7.mo141257m(r8)
        L_0x02bd:
            if (r6 != 0) goto L_0x02f0
            java.lang.String r8 = r7.f299284V
            boolean r8 = com.tencent.p014mm.vfs.C86013q1.m106450k(r8)
            if (r8 != 0) goto L_0x02f0
            java.lang.String r8 = r7.f299286W
            boolean r8 = com.tencent.p014mm.vfs.C86013q1.m106450k(r8)
            if (r8 != 0) goto L_0x02f0
            java.lang.String r8 = r7.f299325s
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 == 0) goto L_0x02f0
            java.lang.String r8 = r7.f299305h
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 == 0) goto L_0x02f0
            java.lang.String r8 = r7.f299342z1
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 == 0) goto L_0x02f0
            java.lang.String r7 = r7.f299334w1
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 == 0) goto L_0x02f0
            goto L_0x029c
        L_0x02f0:
            r6 = 1
            goto L_0x029c
        L_0x02f2:
            r7 = 1
            java.lang.Object[] r5 = new java.lang.Object[r7]
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r6)
            r8 = 0
            r5[r8] = r7
            java.lang.String r7 = "summerrecord needNetScene:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r7, r5)
            if (r6 == 0) goto L_0x035b
            boolean r2 = eb0.C45628s0.m50745J(r11)
            if (r2 == 0) goto L_0x0311
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r2 != 0) goto L_0x0311
            goto L_0x0312
        L_0x0311:
            r9 = r11
        L_0x0312:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r2 = r14.f264674d
            te3.kd0 r2 = r2.f264676a
            java.util.List r2 = qg2.C101147j0.m132615H(r3, r9, r2)
            int r5 = r2.size()
            if (r5 <= 0) goto L_0x0345
            ob0.b0 r5 = f40.C86709a0.m107524d()
            di3.d r7 = di3.C86312j.m106911c(r18)
            cp.b r7 = (p478cp.C45137b) r7
            qg2.i0 r8 = new qg2.i0
            r21 = r8
            r22 = r3
            r24 = r0
            r25 = r11
            r26 = r14
            r27 = r1
            r21.<init>(r22, r24, r25, r26, r27)
            cp.c r0 = r7.mo62458tK(r2, r8)
            ob0.y r0 = (ob0.C117747y) r0
            r5.mo123460f(r0)
            goto L_0x037c
        L_0x0345:
            java.lang.String r23 = r0.mo93550m()
            java.lang.String r24 = r0.mo93548k()
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r14.f264674d
            te3.kd0 r0 = r0.f264676a
            r21 = r3
            r25 = r11
            r26 = r0
            qg2.C101147j0.m132622c(r21, r23, r24, r25, r26)
            goto L_0x037c
        L_0x035b:
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r5 = 0
            r1[r5] = r0
            java.lang.String r0 = "summerrecord do not trans cdn, directly send msg id:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r0, r1)
            boolean r0 = eb0.C45628s0.m50745J(r11)
            if (r0 != 0) goto L_0x037c
            java.lang.Class<og2.j> r0 = og2.C77006j.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            og2.j r0 = (og2.C77006j) r0
            r0.mo107330Uc(r3)
        L_0x037c:
            android.util.Pair r0 = new android.util.Pair
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2 = 1
            r2 = r2 ^ r6
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.<init>(r1, r2)
            goto L_0x00e3
        L_0x038d:
            java.lang.String r0 = "send record msg error, msginfo error"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
            android.util.Pair r0 = new android.util.Pair
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.<init>(r15, r1)
            goto L_0x00e3
        L_0x039c:
            com.tencent.mm.autogen.events.RecordOperationEvent$b r1 = r14.f265028e
            java.lang.Object r2 = r0.first
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r1.f265055h = r2
            com.tencent.mm.autogen.events.RecordOperationEvent$b r1 = r14.f265028e
            java.lang.Object r0 = r0.second
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1.f265056i = r0
            goto L_0x06a1
        L_0x03b6:
            r14 = r0
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.String r1 = r9.f265033e
            r2 = 0
            r0[r2] = r1
            com.tencent.mm.storage.f4 r1 = r9.f265039k
            long r1 = r1.getMsgId()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = "forward record msg, to %s, msg id %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r1, r0)
            com.tencent.mm.autogen.events.RecordOperationEvent$a r0 = r14.f265027d
            java.lang.String r1 = r0.f265033e
            java.lang.String r2 = r0.f265034f
            com.tencent.mm.storage.f4 r3 = r0.f265039k
            boolean r0 = r0.f265046r
            qg2.C101147j0.m132616I(r1, r2, r3, r0)
            goto L_0x06a1
        L_0x03df:
            r14 = r0
            r2 = 1
            java.lang.Object[] r0 = new java.lang.Object[r2]
            long r1 = r9.f265032d
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r20 = 0
            r0[r20] = r1
            java.lang.String r1 = "clear resouces, msg id %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r1, r0)
            com.tencent.mm.autogen.events.RecordOperationEvent$a r0 = r14.f265027d
            long r0 = r0.f265032d
            qg2.C101147j0.m132629j(r0)
            goto L_0x06a1
        L_0x03fb:
            r12 = r14
            r14 = r0
            r0 = r20
            r20 = 0
            r11 = 3
            java.lang.Object[] r11 = new java.lang.Object[r11]
            r22 = r15
            java.lang.String r15 = r9.f265033e
            r11[r20] = r15
            java.lang.String r9 = r9.f265038j
            r15 = 1
            r11[r15] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r20)
            r15 = 2
            r11[r15] = r9
            java.lang.String r9 = "send record msg, to %s, thumbPath %s, thumbId %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r9, r11)
            com.tencent.mm.autogen.events.RecordOperationEvent$a r9 = r14.f265027d
            java.lang.String r10 = r9.f265033e
            te3.kd0 r11 = r9.f265035g
            java.lang.String r14 = r9.f265036h
            java.lang.String r15 = r9.f265037i
            r20 = r0
            java.lang.String r0 = r9.f265038j
            java.lang.String r9 = r9.f265043o
            sg.g<java.lang.Integer, te3.dp3> r23 = qg2.C101147j0.f296056a
            boolean r23 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r23 == 0) goto L_0x0439
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r1)
            goto L_0x06a1
        L_0x0439:
            if (r11 == 0) goto L_0x0603
            java.util.LinkedList<te3.rc0> r1 = r11.f298618f
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0445
            goto L_0x0603
        L_0x0445:
            com.tencent.mm.message.l$b r1 = qg2.C101147j0.m132625f(r14, r15, r11)
            com.tencent.mm.storage.f4 r14 = new com.tencent.mm.storage.f4
            r14.<init>()
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r15 != 0) goto L_0x0459
            byte[] r0 = com.tencent.p014mm.sdk.platformtools.Util.readFromFile(r0)
            goto L_0x046f
        L_0x0459:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r0 != 0) goto L_0x046e
            di3.d r0 = di3.C86312j.m106911c(r6)
            ln.i r0 = (p196ln.C76708i) r0
            android.graphics.Bitmap r0 = r0.N50(r9)
            byte[] r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.Bitmap2Bytes(r0)
            goto L_0x046f
        L_0x046e:
            r0 = 0
        L_0x046f:
            if (r0 == 0) goto L_0x04bc
            int r6 = r0.length
            r9 = 65536(0x10000, float:9.18355E-41)
            if (r6 <= r9) goto L_0x048a
            di3.d r6 = di3.C86312j.m106911c(r7)
            gt.k r6 = (p158gt.C98201k) r6
            gt.m r6 = r6.mo137277xi()
            android.graphics.Bitmap$CompressFormat r7 = android.graphics.Bitmap.CompressFormat.JPEG
            com.tencent.mm.modelimage.m r6 = (com.tencent.p014mm.modelimage.C92839m) r6
            r9 = 0
            java.lang.String r0 = r6.zx0(r0, r9, r7, r9)
            goto L_0x049a
        L_0x048a:
            di3.d r6 = di3.C86312j.m106911c(r7)
            gt.k r6 = (p158gt.C98201k) r6
            gt.m r6 = r6.mo137277xi()
            com.tencent.mm.modelimage.m r6 = (com.tencent.p014mm.modelimage.C92839m) r6
            java.lang.String r0 = r6.mo127179bD(r0)
        L_0x049a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = p206nj.C76861g.m92660c()
            r6.append(r7)
            r6.append(r13)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r6)
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r6 != 0) goto L_0x04bc
            r14.mo108739S2(r0)
        L_0x04bc:
            hc3.f1 r0 = qg2.C101164q0.m132677c(r1)
            java.lang.String r0 = r0.mo141118z()
            r14.mo108732L2(r0)
            r0 = 1
            r14.mo100991d(r0)
            r14.mo108749c3(r10)
            long r6 = eb0.C75604z3.m90843o(r10)
            r14.mo108733M2(r6)
            r14.mo108740T2(r0)
            r0 = 49
            r14.setType(r0)
            di3.d r0 = di3.C86312j.m106911c(r5)
            rn.v r0 = (p227rn.C48053v) r0
            boolean r0 = r0.mo72614OE(r10)
            if (r0 == 0) goto L_0x04f6
            di3.d r0 = di3.C86312j.m106911c(r3)
            rn.o r0 = (p227rn.C101397o) r0
            java.lang.String r0 = r0.getMsgSource()
            r14.mo101012p4(r0)
        L_0x04f6:
            r0 = 2
            java.lang.String r0 = eb0.C75569c4.m90655A(r0)
            r3 = 0
            eb0.C75569c4.m90664J(r14, r0, r3)
            k40.a r0 = f40.C86709a0.m107533q(r4)
            f62.k0 r0 = (f62.C75700k0) r0
            g62.l r0 = r0.mo96095LE()
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
            long r3 = r0.my0(r14)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = p206nj.C76861g.m92660c()
            r0.append(r5)
            r0.append(r8)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)
            int r0 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x054a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = p206nj.C76861g.m92660c()
            r0.append(r1)
            r0.append(r12)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            p206nj.C76861g.m92658a()
            goto L_0x06a1
        L_0x054a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r5 = p206nj.C76861g.m92658a()
            r0.append(r5)
            r5 = r20
            r0.append(r5)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            r14.setMsgId(r3)
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r2 = r22
            qg2.C101147j0.m132632m(r2, r0, r10)
            com.tencent.mm.message.l r0 = new com.tencent.mm.message.l
            r0.<init>()
            java.lang.String r2 = r14.getContent()
            r0.field_xml = r2
            java.lang.String r2 = r1.f195570f
            r0.field_title = r2
            int r2 = r1.f195582i
            r0.field_type = r2
            java.lang.String r2 = r1.f195574g
            r0.field_description = r2
            r0.field_msgId = r3
            java.lang.String r2 = r1.f195562d
            r0.field_appId = r2
            di3.d r2 = di3.C86312j.m106911c(r19)
            ym.s r2 = (p763ym.C53543s) r2
            ym.n r2 = r2.mo74023HM()
            com.tencent.mm.pluginsdk.model.app.s r2 = (com.tencent.p014mm.pluginsdk.model.app.C96776s) r2
            r2.mo135039jo(r0)
            java.util.LinkedList<te3.rc0> r0 = r11.f298618f
            java.util.Iterator r0 = r0.iterator()
        L_0x05a3:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x05c0
            java.lang.Object r2 = r0.next()
            te3.rc0 r2 = (te3.C101834rc0) r2
            java.lang.String r5 = r2.f299325s
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 == 0) goto L_0x05c0
            java.lang.String r2 = r2.f299305h
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x05c0
            goto L_0x05a3
        L_0x05c0:
            java.util.List r0 = qg2.C101147j0.m132615H(r3, r10, r11)
            int r2 = r0.size()
            if (r2 <= 0) goto L_0x05f0
            ob0.b0 r2 = f40.C86709a0.m107524d()
            di3.d r5 = di3.C86312j.m106911c(r18)
            cp.b r5 = (p478cp.C45137b) r5
            qg2.k0 r6 = new qg2.k0
            r23 = r6
            r24 = r3
            r26 = r1
            r27 = r10
            r28 = r11
            r29 = r14
            r23.<init>(r24, r26, r27, r28, r29)
            cp.c r0 = r5.mo62458tK(r0, r6)
            ob0.y r0 = (ob0.C117747y) r0
            r2.mo123460f(r0)
            goto L_0x06a1
        L_0x05f0:
            java.lang.String r25 = r1.mo93550m()
            java.lang.String r26 = r1.mo93548k()
            r23 = r3
            r27 = r10
            r28 = r11
            qg2.C101147j0.m132623d(r23, r25, r26, r27, r28)
            goto L_0x06a1
        L_0x0603:
            java.lang.String r0 = "send record msg error, favprotoitem error"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
            goto L_0x06a1
        L_0x060b:
            r14 = r0
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            long r2 = r9.f265032d
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = "get record paths, msg id %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r0, r1)
            com.tencent.mm.autogen.events.RecordOperationEvent$b r0 = r14.f265028e
            com.tencent.mm.autogen.events.RecordOperationEvent$a r1 = r14.f265027d
            te3.rc0 r2 = r1.f265031c
            long r3 = r1.f265032d
            boolean r1 = qg2.C101147j0.m132614G(r2, r3)
            r0.f265051d = r1
            com.tencent.mm.autogen.events.RecordOperationEvent$b r0 = r14.f265028e
            com.tencent.mm.autogen.events.RecordOperationEvent$a r1 = r14.f265027d
            te3.rc0 r2 = r1.f265031c
            long r3 = r1.f265032d
            r1 = 1
            java.lang.String r2 = qg2.C101147j0.m132636q(r2, r3, r1)
            r0.f265049b = r2
            com.tencent.mm.autogen.events.RecordOperationEvent$b r0 = r14.f265028e
            com.tencent.mm.autogen.events.RecordOperationEvent$a r2 = r14.f265027d
            te3.rc0 r3 = r2.f265031c
            long r4 = r2.f265032d
            java.lang.String r2 = qg2.C101147j0.m132611D(r3, r4, r1)
            android.net.Uri r1 = com.tencent.p014mm.vfs.C116299g2.m163858n(r2)
            java.lang.String r2 = r1.getPath()
            if (r2 == 0) goto L_0x066b
            r3 = 0
            java.lang.String r2 = com.tencent.p014mm.vfs.C116299g2.m163855k(r2, r3, r3)
            java.lang.String r3 = r1.getPath()
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L_0x066b
            android.net.Uri$Builder r1 = r1.buildUpon()
            android.net.Uri$Builder r1 = r1.path(r2)
            android.net.Uri r1 = r1.build()
        L_0x066b:
            com.tencent.mm.vfs.f0 r2 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r3 = 0
            com.tencent.mm.vfs.f0$h r1 = r2.mo177799l(r1, r3)
            boolean r2 = r1.mo177810a()
            if (r2 != 0) goto L_0x067a
            r1 = 0
            goto L_0x0684
        L_0x067a:
            com.tencent.mm.vfs.FileSystem$c r2 = r1.f348991a
            java.lang.String r1 = r1.f348992b
            boolean r21 = r2.mo119948x(r1)
            r1 = r21
        L_0x0684:
            r0.f265052e = r1
            com.tencent.mm.autogen.events.RecordOperationEvent$b r0 = r14.f265028e
            com.tencent.mm.autogen.events.RecordOperationEvent$a r1 = r14.f265027d
            te3.rc0 r2 = r1.f265031c
            long r3 = r1.f265032d
            r1 = 1
            java.lang.String r1 = qg2.C101147j0.m132611D(r2, r3, r1)
            r0.f265050c = r1
            goto L_0x06a1
        L_0x0696:
            r14 = r0
            com.tencent.mm.autogen.events.RecordOperationEvent$b r0 = r14.f265028e
            java.lang.String r1 = r9.f265030b
            te3.dp3 r1 = qg2.C101147j0.m132643x(r1)
            r0.f265048a = r1
        L_0x06a1:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qg2.C101163o0.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
