package rs3;

/* renamed from: rs3.a */
public class C22248a {
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00e1 A[LOOP:0: B:18:0x00db->B:20:0x00e1, LOOP_END] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.tencent.qbar.C19931a.C19932a m25803a(android.graphics.Bitmap r14, int[] r15) {
        /*
            it3.a r0 = new it3.a
            java.lang.String r1 = "MicroMsg.ScanImageUtil"
            r0.<init>(r1)
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.Class<lx.d0> r3 = p200lx.C21473d0.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            lx.d0 r3 = (p200lx.C21473d0) r3
            com.tencent.qbar.QbarNative$QbarAiModelParam r3 = r3.mo33645Gw()
            r4 = 1
            r0.mo33089f(r2, r4, r3)
            boolean r2 = r0.f59753c
            if (r2 == 0) goto L_0x0022
            r0.mo33091h(r15)
        L_0x0022:
            r15 = 0
            r2 = 0
            if (r14 == 0) goto L_0x0108
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r5 = r14.getWidth()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3[r2] = r5
            int r5 = r14.getHeight()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3[r4] = r5
            java.lang.String r5 = "%s,%s"
            java.lang.String r3 = java.lang.String.format(r5, r3)
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
            int r3 = r14.getWidth()
            int r5 = r14.getHeight()
            int r3 = r3 * r5
            int[] r13 = new int[r3]
            r7 = 0
            int r8 = r14.getWidth()
            r9 = 0
            r10 = 0
            int r11 = r14.getWidth()
            int r12 = r14.getHeight()
            r5 = r14
            r6 = r13
            r5.getPixels(r6, r7, r8, r9, r10, r11, r12)
            android.graphics.Point r5 = new android.graphics.Point
            int r6 = r14.getWidth()
            int r14 = r14.getHeight()
            r5.<init>(r6, r14)
            java.lang.String r14 = r0.f59751a
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.String r7 = r5.toString()
            r6[r2] = r7
            java.lang.String r7 = "decode, size %s"
            java.lang.String r6 = java.lang.String.format(r7, r6)
            com.tencent.stubs.logger.Log.m106505i(r14, r6)
            if (r3 > 0) goto L_0x0090
            java.lang.String r14 = r0.f59751a
            java.lang.String r3 = "prepareGrayData , data is null"
            com.tencent.stubs.logger.Log.m106513w(r14, r3)
            goto L_0x00b4
        L_0x0090:
            int r14 = r5.x
            int r3 = r5.y
            int r6 = r14 * r3
            byte[] r6 = new byte[r6]
            int r14 = com.tencent.qbar.QbarNative.nativeTransBytes(r13, r6, r14, r3)
            if (r14 == 0) goto L_0x00b6
            java.lang.String r3 = r0.f59751a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "rotate result "
            r5.append(r6)
            r5.append(r14)
            java.lang.String r14 = r5.toString()
            com.tencent.stubs.logger.Log.m106497e(r3, r14)
        L_0x00b4:
            r14 = r15
            goto L_0x00be
        L_0x00b6:
            int r14 = r5.x
            int r3 = r5.y
            java.util.List r14 = r0.mo33087d(r6, r14, r3)
        L_0x00be:
            java.lang.Object[] r3 = new java.lang.Object[r4]
            if (r14 != 0) goto L_0x00c4
            r5 = 0
            goto L_0x00c8
        L_0x00c4:
            int r5 = r14.size()
        L_0x00c8:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3[r2] = r5
            java.lang.String r5 = "get %d decode results"
            java.lang.String r3 = java.lang.String.format(r5, r3)
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
            java.util.Iterator r3 = r14.iterator()
        L_0x00db:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0109
            java.lang.Object r5 = r3.next()
            com.tencent.qbar.a$a r5 = (com.tencent.qbar.C19931a.C19932a) r5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "result "
            r6.append(r7)
            java.lang.String r7 = r5.f56828e
            r6.append(r7)
            java.lang.String r7 = ","
            r6.append(r7)
            java.lang.String r5 = r5.f56829f
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r5)
            goto L_0x00db
        L_0x0108:
            r14 = r15
        L_0x0109:
            r0.mo33090g()
            int r0 = vl2.C37756o.m41531e()
            if (r0 != r4) goto L_0x0115
            r0 = 1722(0x6ba, float:2.413E-42)
            goto L_0x0117
        L_0x0115:
            r0 = 1229(0x4cd, float:1.722E-42)
        L_0x0117:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "QBar init report, directScanBitmap idKey:"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
            com.tencent.mm.plugin.report.service.n r4 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            long r5 = (long) r0
            r7 = 20
            r9 = 1
            r4.mo175913w(r5, r7, r9)
            if (r14 == 0) goto L_0x0144
            int r0 = r14.size()
            if (r0 <= 0) goto L_0x0144
            java.lang.Object r14 = r14.get(r2)
            com.tencent.qbar.a$a r14 = (com.tencent.qbar.C19931a.C19932a) r14
            return r14
        L_0x0144:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: rs3.C22248a.m25803a(android.graphics.Bitmap, int[]):com.tencent.qbar.a$a");
    }
}
