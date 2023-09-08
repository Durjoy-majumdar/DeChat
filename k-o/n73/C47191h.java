package n73;

import java.util.ArrayList;
import java.util.List;

/* renamed from: n73.h */
public class C47191h extends C47188b {
    /* renamed from: a */
    public List<Integer> mo11243a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(11005);
        arrayList.add(11006);
        arrayList.add(11007);
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01ec, code lost:
        if (com.tencent.p014mm.vfs.C86013q1.m106450k(r13) != false) goto L_0x0261;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x023c, code lost:
        if (com.tencent.p014mm.vfs.C86013q1.m106450k(r13) != false) goto L_0x0240;
     */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0267  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] mo11244b(int r12, byte[] r13) {
        /*
            r11 = this;
            java.lang.Class<z51.g> r0 = z51.C39315g.class
            java.lang.Class<gt.k> r1 = p158gt.C98201k.class
            r2 = 0
            java.lang.String r3 = "MicroMsg.Wear.HttpImageServer"
            r4 = 1
            r5 = 0
            java.lang.String r6 = ""
            r7 = 11005(0x2afd, float:1.5421E-41)
            if (r12 != r7) goto L_0x0061
            te3.g05 r12 = new te3.g05
            r12.<init>()
            r12.parseFrom(r13)     // Catch:{ IOException -> 0x0018 }
            goto L_0x001e
        L_0x0018:
            r13 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r13, r6, r0)
        L_0x001e:
            te3.h05 r13 = new te3.h05
            r13.<init>()
            java.lang.String r0 = r12.f133771e
            android.graphics.Bitmap r0 = com.tencent.p014mm.plugin.wear.model.C43465i.m46973c(r0)
            if (r0 == 0) goto L_0x0054
            long r7 = java.lang.System.currentTimeMillis()
            r13.f134396d = r7
            byte[] r0 = com.tencent.p014mm.plugin.wear.model.C43465i.m46971a(r0)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r12 = r12.f133771e
            r1[r5] = r12
            java.lang.String r12 = "return avatar data username=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r12, r1)
            pe3.b r12 = new pe3.b
            r12.<init>(r0)
            r13.f134397e = r12
            byte[] r12 = r13.toByteArray()     // Catch:{ IOException -> 0x004c }
            return r12
        L_0x004c:
            r12 = move-exception
            java.lang.Object[] r13 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r12, r6, r13)
            goto L_0x0277
        L_0x0054:
            java.lang.Object[] r13 = new java.lang.Object[r4]
            java.lang.String r12 = r12.f133771e
            r13[r5] = r12
            java.lang.String r12 = "get avatar fail, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r12, r13)
            goto L_0x0277
        L_0x0061:
            r7 = 11006(0x2afe, float:1.5423E-41)
            r8 = -1
            if (r12 != r7) goto L_0x0125
            java.lang.String r12 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x011e }
            java.lang.String r1 = "utf8"
            r12.<init>(r13, r1)     // Catch:{ UnsupportedEncodingException -> 0x011e }
            di3.d r13 = di3.C86312j.m106911c(r0)
            z51.g r13 = (z51.C39315g) r13
            zc3.a r13 = r13.mo58035cm()
            i61.h r13 = (i61.C98602h) r13
            com.tencent.mm.storage.emotion.EmojiInfo r12 = r13.mo137999G(r12)
            if (r12 == 0) goto L_0x0277
            boolean r13 = r12.mo62678k()
            if (r13 == 0) goto L_0x0093
            android.content.Context r13 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.graphics.Bitmap r12 = r12.mo135615l2(r13, r4)
            byte[] r12 = com.tencent.p014mm.plugin.wear.model.C43465i.m46971a(r12)
            return r12
        L_0x0093:
            int r13 = r12.field_catalog
            r1 = 17
            if (r13 != r1) goto L_0x00cb
            android.content.Context r13 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x00b1, all -> 0x00af }
            java.lang.String r12 = r12.getName()     // Catch:{ Exception -> 0x00b1, all -> 0x00af }
            java.io.InputStream r12 = v51.C52762d.m59141a(r13, r12)     // Catch:{ Exception -> 0x00b1, all -> 0x00af }
            byte[] r13 = p823sg.C48377f.m53723b(r12)     // Catch:{ Exception -> 0x00ad }
            com.tencent.p014mm.vfs.C116299g2.m163847c(r12)
            return r13
        L_0x00ad:
            r13 = move-exception
            goto L_0x00b3
        L_0x00af:
            r13 = move-exception
            goto L_0x00c7
        L_0x00b1:
            r13 = move-exception
            r12 = r2
        L_0x00b3:
            java.lang.String r0 = "exception:%s"
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x00c5 }
            java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r13)     // Catch:{ all -> 0x00c5 }
            r1[r5] = r13     // Catch:{ all -> 0x00c5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r0, r1)     // Catch:{ all -> 0x00c5 }
            com.tencent.p014mm.vfs.C116299g2.m163847c(r12)
            goto L_0x0277
        L_0x00c5:
            r13 = move-exception
            r2 = r12
        L_0x00c7:
            com.tencent.p014mm.vfs.C116299g2.m163847c(r2)
            throw r13
        L_0x00cb:
            java.lang.String r13 = r12.mo62640K1()
            long r1 = com.tencent.p014mm.vfs.C86013q1.m106451l(r13)
            r6 = 819200(0xc8000, double:4.047386E-318)
            int r13 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r13 <= 0) goto L_0x010d
            java.lang.Object[] r13 = new java.lang.Object[r4]
            java.lang.String r0 = r12.getMd5()
            r13[r5] = r0
            java.lang.String r0 = "handleData: emoji file size too large, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r0, r13)
            java.lang.String r13 = r12.getCoverPath()
            boolean r13 = com.tencent.p014mm.vfs.C86013q1.m106450k(r13)
            if (r13 == 0) goto L_0x00fa
            java.lang.String r12 = r12.getCoverPath()
            byte[] r12 = com.tencent.p014mm.vfs.C86013q1.m106433O(r12, r5, r8)
            return r12
        L_0x00fa:
            java.lang.String r13 = "handleData: emoji thumb not exist"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r13)
            zk.c$a r13 = p833zk.C103041c.f304024a
            r13.mo142750a(r12)
            java.lang.String r12 = r12.getCoverPath()
            byte[] r12 = com.tencent.p014mm.vfs.C86013q1.m106433O(r12, r5, r8)
            return r12
        L_0x010d:
            di3.d r13 = di3.C86312j.m106911c(r0)
            z51.g r13 = (z51.C39315g) r13
            zc3.a r13 = r13.mo58035cm()
            i61.h r13 = (i61.C98602h) r13
            byte[] r12 = r13.mo138036u(r12)
            return r12
        L_0x011e:
            r12 = move-exception
            java.lang.Object[] r13 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r12, r6, r13)
            return r2
        L_0x0125:
            r0 = 11007(0x2aff, float:1.5424E-41)
            if (r12 != r0) goto L_0x0277
            te3.y05 r12 = new te3.y05
            r12.<init>()
            r12.parseFrom(r13)     // Catch:{ IOException -> 0x0132 }
            goto L_0x0138
        L_0x0132:
            r13 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r13, r6, r0)
        L_0x0138:
            eb0.c r13 = eb0.C97625j3.m125812b()
            g62.l r13 = r13.mo105911z()
            long r9 = r12.f145067d
            com.tencent.mm.storage.g4 r13 = (com.tencent.p014mm.storage.C72972g4) r13
            com.tencent.mm.storage.f4 r13 = r13.b00(r9)
            boolean r12 = r12.f145068e
            if (r12 != 0) goto L_0x0181
            di3.d r12 = di3.C86312j.m106911c(r1)
            gt.k r12 = (p158gt.C98201k) r12
            gt.m r12 = r12.mo137277xi()
            java.lang.String r13 = r13.mo108765s2()
            com.tencent.mm.modelimage.m r12 = (com.tencent.p014mm.modelimage.C92839m) r12
            java.lang.String r12 = r12.mo127161CZ(r13)
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r13 != 0) goto L_0x0277
            te3.z05 r13 = new te3.z05
            r13.<init>()
            long r0 = java.lang.System.currentTimeMillis()
            r13.f145627d = r0
            pe3.b r0 = new pe3.b
            byte[] r12 = com.tencent.p014mm.vfs.C86013q1.m106433O(r12, r5, r8)
            r0.<init>(r12)
            r13.f145628e = r0
            byte[] r12 = r13.toByteArray()     // Catch:{ IOException -> 0x0277 }
            return r12
        L_0x0181:
            te3.z05 r12 = new te3.z05
            r12.<init>()
            long r9 = java.lang.System.currentTimeMillis()
            r12.f145627d = r9
            int r0 = r13.mo108769t2()
            if (r0 != r4) goto L_0x01f0
            di3.d r0 = di3.C86312j.m106911c(r1)
            gt.k r0 = (p158gt.C98201k) r0
            gt.m r0 = r0.mo137277xi()
            java.lang.String r3 = r13.mo108768t()
            long r9 = r13.getMsgId()
            com.tencent.mm.modelimage.m r0 = (com.tencent.p014mm.modelimage.C92839m) r0
            com.tencent.mm.modelimage.k r0 = r0.mo127200vP(r3, r9)
            di3.d r3 = di3.C86312j.m106911c(r1)
            gt.k r3 = (p158gt.C98201k) r3
            gt.m r3 = r3.mo137277xi()
            di3.d r7 = di3.C86312j.m106911c(r1)
            gt.k r7 = (p158gt.C98201k) r7
            gt.m r7 = r7.mo137277xi()
            java.lang.String r13 = r13.mo108768t()
            com.tencent.mm.modelimage.m r7 = (com.tencent.p014mm.modelimage.C92839m) r7
            java.lang.String r13 = r7.r50(r13, r0)
            com.tencent.mm.modelimage.m r3 = (com.tencent.p014mm.modelimage.C92839m) r3
            java.lang.String r13 = r3.mo127174TY(r13, r6, r6, r4)
            boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106450k(r13)
            if (r3 == 0) goto L_0x01d6
            goto L_0x0261
        L_0x01d6:
            di3.d r13 = di3.C86312j.m106911c(r1)
            gt.k r13 = (p158gt.C98201k) r13
            gt.m r13 = r13.mo137277xi()
            java.lang.String r0 = r0.f267378e
            com.tencent.mm.modelimage.m r13 = (com.tencent.p014mm.modelimage.C92839m) r13
            java.lang.String r13 = r13.mo127174TY(r0, r6, r6, r4)
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r13)
            if (r0 == 0) goto L_0x0260
            goto L_0x0261
        L_0x01f0:
            di3.d r0 = di3.C86312j.m106911c(r1)
            gt.k r0 = (p158gt.C98201k) r0
            gt.m r0 = r0.mo137277xi()
            java.lang.String r3 = r13.mo108768t()
            long r9 = r13.mo108774y2()
            com.tencent.mm.modelimage.m r0 = (com.tencent.p014mm.modelimage.C92839m) r0
            com.tencent.mm.modelimage.k r0 = r0.mo127168NQ(r3, r9)
            boolean r3 = r0.mo127146q()
            if (r3 == 0) goto L_0x0260
            boolean r3 = r0.mo127145p()
            if (r3 == 0) goto L_0x023f
            di3.d r3 = di3.C86312j.m106911c(r1)
            gt.k r3 = (p158gt.C98201k) r3
            gt.m r3 = r3.mo137277xi()
            di3.d r7 = di3.C86312j.m106911c(r1)
            gt.k r7 = (p158gt.C98201k) r7
            gt.m r7 = r7.mo137277xi()
            java.lang.String r13 = r13.mo108768t()
            com.tencent.mm.modelimage.m r7 = (com.tencent.p014mm.modelimage.C92839m) r7
            java.lang.String r13 = r7.r50(r13, r0)
            com.tencent.mm.modelimage.m r3 = (com.tencent.p014mm.modelimage.C92839m) r3
            java.lang.String r13 = r3.mo127174TY(r13, r6, r6, r4)
            boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106450k(r13)
            if (r3 == 0) goto L_0x023f
            goto L_0x0240
        L_0x023f:
            r13 = r2
        L_0x0240:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r3 == 0) goto L_0x0261
            di3.d r1 = di3.C86312j.m106911c(r1)
            gt.k r1 = (p158gt.C98201k) r1
            gt.m r1 = r1.mo137277xi()
            java.lang.String r0 = r0.f267378e
            com.tencent.mm.modelimage.m r1 = (com.tencent.p014mm.modelimage.C92839m) r1
            java.lang.String r0 = r1.mo127174TY(r0, r6, r6, r4)
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r1 == 0) goto L_0x0261
            r13 = r0
            goto L_0x0261
        L_0x0260:
            r13 = r2
        L_0x0261:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r0 != 0) goto L_0x0277
            pe3.b r0 = new pe3.b
            byte[] r13 = com.tencent.p014mm.vfs.C86013q1.m106433O(r13, r5, r8)
            r0.<init>(r13)
            r12.f145628e = r0
            byte[] r12 = r12.toByteArray()     // Catch:{ IOException -> 0x0277 }
            return r12
        L_0x0277:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: n73.C47191h.mo11244b(int, byte[]):byte[]");
    }
}
