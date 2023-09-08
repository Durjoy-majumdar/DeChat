package v22;

import com.tencent.p014mm.autogen.events.GetStaticMapEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;

/* renamed from: v22.n */
public class C78321n extends IStaticListener<GetStaticMapEvent> {
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r25) {
        /*
            r24 = this;
            r0 = r25
            com.tencent.mm.autogen.events.GetStaticMapEvent r0 = (com.tencent.p014mm.autogen.events.GetStaticMapEvent) r0
            t22.q r1 = t22.C77832s.yx0()
            com.tencent.mm.autogen.events.GetStaticMapEvent$a r0 = r0.f193661d
            com.tencent.mm.storage.f4 r2 = r0.f193663a
            android.widget.ImageView r3 = r0.f193664b
            android.widget.ProgressBar r4 = r0.f193666d
            android.widget.ImageView r5 = r0.f193665c
            int r10 = r0.f193667e
            int r6 = r0.f193668f
            int r0 = r0.f193669g
            r1.getClass()
            java.lang.String r7 = r2.getContent()
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r8 == 0) goto L_0x0027
            goto L_0x0207
        L_0x0027:
            r1.f226768h = r6
            r1.f226769i = r0
            r8 = 300(0x12c, float:4.2E-43)
            if (r6 <= 0) goto L_0x0031
            if (r0 > 0) goto L_0x0035
        L_0x0031:
            r1.f226768h = r8
            r1.f226769i = r8
        L_0x0035:
            int r9 = r2.mo108769t2()
            r11 = 1
            if (r9 != 0) goto L_0x003e
            r13 = 1
            goto L_0x003f
        L_0x003e:
            r13 = 0
        L_0x003f:
            java.lang.String r9 = r2.mo108768t()
            boolean r9 = com.tencent.p014mm.storage.C72996z1.m85820U5(r9)
            if (r9 == 0) goto L_0x005b
            if (r13 == 0) goto L_0x005b
            int r9 = eb0.C75604z3.m90848t(r7)
            r12 = -1
            if (r9 == r12) goto L_0x005b
            int r9 = r9 + r11
            java.lang.String r7 = r7.substring(r9)
            java.lang.String r7 = r7.trim()
        L_0x005b:
            java.lang.Class<f62.k0> r9 = f62.C75700k0.class
            k40.a r9 = f40.C86709a0.m107533q(r9)
            f62.k0 r9 = (f62.C75700k0) r9
            g62.l r9 = r9.mo96095LE()
            com.tencent.mm.storage.g4 r9 = (com.tencent.p014mm.storage.C72972g4) r9
            com.tencent.mm.storage.f4$e r7 = r9.Tx0(r7)
            int r9 = r2.f230730M
            r12 = 5
            java.lang.String r15 = "MicroMsg.StaticMapMsgLogic"
            if (r9 == r12) goto L_0x0209
            java.util.HashSet<java.lang.Long> r9 = r1.f226767g
            long r16 = r2.getMsgId()
            java.lang.Long r12 = java.lang.Long.valueOf(r16)
            boolean r9 = r9.contains(r12)
            if (r9 == 0) goto L_0x0086
            goto L_0x0209
        L_0x0086:
            dd3.e r9 = new dd3.e
            long r17 = r2.getMsgId()
            double r11 = r7.f212704b
            float r11 = (float) r11
            r12 = r15
            double r14 = r7.f212705c
            float r14 = (float) r14
            int r15 = r7.f212706d
            r23 = r9
            double r8 = (double) r15
            r19 = 4607632778762754458(0x3ff199999999999a, double:1.1)
            double r8 = r8 * r19
            int r8 = (int) r8
            r22 = 0
            r16 = r23
            r19 = r11
            r20 = r14
            r21 = r8
            r16.<init>(r17, r19, r20, r21, r22)
            r8 = 0
            r4.setVisibility(r8)
            r11 = 8
            r5.setVisibility(r11)
            t22.r r8 = t22.C77832s.zx0()
            r8.f226775h = r6
            r8.f226776i = r0
            if (r6 <= 0) goto L_0x00c2
            if (r0 > 0) goto L_0x00c8
        L_0x00c2:
            r0 = 300(0x12c, float:4.2E-43)
            r8.f226775h = r0
            r8.f226776i = r0
        L_0x00c8:
            java.lang.String r0 = t22.C77830r.m93926a(r23)
            boolean r6 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r6 == 0) goto L_0x00de
            boolean r6 = f40.C86709a0.m107522a()
            if (r6 != 0) goto L_0x00d9
            goto L_0x0121
        L_0x00d9:
            r9 = r0
            r6 = r23
            goto L_0x0159
        L_0x00de:
            dd3.e r0 = r8.f226773f
            java.lang.String r6 = "has add queue"
            java.lang.String r9 = "MicroMsg.StaticMapServer"
            if (r0 == 0) goto L_0x00fb
            java.lang.String r0 = r0.toString()
            java.lang.String r14 = r23.toString()
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x00fb
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r6)
            r8.mo107947d()
            goto L_0x0121
        L_0x00fb:
            java.util.LinkedList<dd3.e> r0 = r8.f226772e
            java.util.Iterator r0 = r0.iterator()
        L_0x0101:
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L_0x0124
            java.lang.Object r14 = r0.next()
            dd3.e r14 = (dd3.C75352e) r14
            java.lang.String r15 = r23.toString()
            java.lang.String r14 = r14.toString()
            boolean r14 = r15.equals(r14)
            if (r14 == 0) goto L_0x0101
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r6)
            r8.mo107947d()
        L_0x0121:
            r6 = r23
            goto L_0x0156
        L_0x0124:
            java.util.LinkedList<dd3.e> r0 = r8.f226772e
            r6 = r23
            r0.add(r6)
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.util.LinkedList<dd3.e> r14 = r8.f226772e
            int r14 = r14.size()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r15 = 0
            r0[r15] = r14
            int r14 = r8.f226775h
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r15 = 1
            r0[r15] = r14
            int r14 = r8.f226776i
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r15 = 2
            r0[r15] = r14
            java.lang.String r14 = "task size %d w%d h %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r14, r0)
            r8.mo107947d()
        L_0x0156:
            java.lang.String r0 = ""
            r9 = r0
        L_0x0159:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r0 != 0) goto L_0x01ad
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r9)
            if (r0 == 0) goto L_0x01ad
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            r7 = 0
            r0[r7] = r6
            java.lang.String r6 = "readloc from local %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r12, r6, r0)
            boolean r0 = f40.C86709a0.m107522a()
            if (r0 != 0) goto L_0x017c
            goto L_0x0207
        L_0x017c:
            java.lang.Class<gt.k> r0 = p158gt.C98201k.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            gt.k r0 = (p158gt.C98201k) r0
            gt.m r0 = r0.mo137277xi()
            long r7 = r2.getMsgId()
            int r2 = r1.f226768h
            int r12 = r1.f226769i
            r6 = r0
            com.tencent.mm.modelimage.m r6 = (com.tencent.p014mm.modelimage.C92839m) r6
            r0 = 8
            r11 = r2
            android.graphics.Bitmap r1 = r6.X90(r7, r9, r10, r11, r12, r13)
            if (r1 == 0) goto L_0x0207
            boolean r2 = r1.isRecycled()
            if (r2 != 0) goto L_0x0207
            r3.setImageBitmap(r1)
            r4.setVisibility(r0)
            r0 = 0
            r5.setVisibility(r0)
            goto L_0x0207
        L_0x01ad:
            java.util.HashMap<java.lang.Long, com.tencent.mm.storage.f4$e> r0 = r1.f226762b
            long r8 = r6.f221516d
            java.lang.Long r6 = java.lang.Long.valueOf(r8)
            r0.put(r6, r7)
            java.util.HashMap<java.lang.Long, java.lang.Integer> r0 = r1.f226766f
            long r8 = r2.getMsgId()
            java.lang.Long r6 = java.lang.Long.valueOf(r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            r0.put(r6, r8)
            java.util.HashMap<com.tencent.mm.storage.f4$e, com.tencent.mm.storage.f4> r0 = r1.f226765e
            r0.put(r7, r2)
            java.util.HashMap<java.lang.Long, java.lang.ref.WeakReference<android.widget.ImageView>> r0 = r1.f226761a
            long r6 = r2.getMsgId()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference
            r7.<init>(r3)
            r0.put(r6, r7)
            java.util.HashMap<java.lang.Long, java.lang.ref.WeakReference<android.widget.ProgressBar>> r0 = r1.f226763c
            long r6 = r2.getMsgId()
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference
            r6.<init>(r4)
            r0.put(r3, r6)
            java.util.HashMap<java.lang.Long, java.lang.ref.WeakReference<android.widget.ImageView>> r0 = r1.f226764d
            long r2 = r2.getMsgId()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r5)
            r0.put(r2, r3)
            r1.mo107944c()
        L_0x0207:
            r6 = 0
            goto L_0x022f
        L_0x0209:
            r12 = r15
            r0 = 8
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            long r6 = r2.getMsgId()
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            r6 = 0
            r1[r6] = r3
            int r2 = r2.f230730M
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 1
            r1[r3] = r2
            java.lang.String r2 = "this has die %d errCount %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r2, r1)
            r5.setVisibility(r6)
            r4.setVisibility(r0)
        L_0x022f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: v22.C78321n.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
