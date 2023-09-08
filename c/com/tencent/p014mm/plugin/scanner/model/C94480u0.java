package com.tencent.p014mm.plugin.scanner.model;

/* renamed from: com.tencent.mm.plugin.scanner.model.u0 */
public final class C94480u0 {

    /* renamed from: a */
    public static final C94480u0 f273191a = new C94480u0();

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0050 A[Catch:{ Exception -> 0x003a, all -> 0x0037 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.tencent.p014mm.plugin.scanner.api.ScanImagePHashInfo mo129952a(java.lang.String r19) {
        /*
            r18 = this;
            r1 = r19
            java.lang.String r2 = "MicroMsg.ScanImagePHashUtil"
            java.lang.String r0 = "imagePath"
            gy3.C87412m.m108594g(r1, r0)
            r3 = 1
            r5 = 0
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x003a }
            r0.<init>()     // Catch:{ Exception -> 0x003a }
            r0.inJustDecodeBounds = r3     // Catch:{ Exception -> 0x003a }
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeFile(r1, r0)     // Catch:{ Exception -> 0x003a }
            int r6 = r0.outWidth     // Catch:{ Exception -> 0x003a }
            int r0 = r0.outHeight     // Catch:{ Exception -> 0x003a }
            int r6 = r6 * r0
            r0 = 1166400(0x11cc40, float:1.634475E-39)
            if (r6 <= r0) goto L_0x0042
            float r6 = (float) r6     // Catch:{ Exception -> 0x003a }
            float r0 = (float) r0     // Catch:{ Exception -> 0x003a }
            float r6 = r6 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0042
            double r6 = (double) r6     // Catch:{ Exception -> 0x003a }
            double r6 = java.lang.Math.sqrt(r6)     // Catch:{ Exception -> 0x003a }
            float r0 = (float) r6     // Catch:{ Exception -> 0x003a }
            double r6 = (double) r0     // Catch:{ Exception -> 0x003a }
            double r6 = java.lang.Math.ceil(r6)     // Catch:{ Exception -> 0x003a }
            float r0 = (float) r6
            int r0 = (int) r0
            goto L_0x0043
        L_0x0037:
            r0 = move-exception
            goto L_0x00c7
        L_0x003a:
            r0 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x0037 }
            java.lang.String r7 = "computeSampleSize exception"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r7, r6)     // Catch:{ all -> 0x0037 }
        L_0x0042:
            r0 = 1
        L_0x0043:
            android.graphics.BitmapFactory$Options r6 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x0037 }
            r6.<init>()     // Catch:{ all -> 0x0037 }
            r6.inSampleSize = r0     // Catch:{ all -> 0x0037 }
            android.graphics.Bitmap r1 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeFile(r1, r6)     // Catch:{ all -> 0x0037 }
            if (r1 == 0) goto L_0x00ce
            int r6 = r1.getWidth()     // Catch:{ all -> 0x0037 }
            int r15 = r1.getHeight()     // Catch:{ all -> 0x0037 }
            java.lang.String r7 = "computeImagePHash width: %d, height: %d, sampleSize: %d"
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x0037 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0037 }
            r8[r5] = r9     // Catch:{ all -> 0x0037 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x0037 }
            r8[r3] = r9     // Catch:{ all -> 0x0037 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0037 }
            r14 = 2
            r8[r14] = r0     // Catch:{ all -> 0x0037 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r7, r8)     // Catch:{ all -> 0x0037 }
            int r0 = r6 * r15
            int[] r13 = new int[r0]     // Catch:{ all -> 0x0037 }
            r9 = 0
            int r10 = r1.getWidth()     // Catch:{ all -> 0x0037 }
            r11 = 0
            r12 = 0
            int r16 = r1.getWidth()     // Catch:{ all -> 0x0037 }
            int r17 = r1.getHeight()     // Catch:{ all -> 0x0037 }
            r7 = r1
            r8 = r13
            r4 = r13
            r13 = r16
            r14 = r17
            r7.getPixels(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0037 }
            r1.recycle()     // Catch:{ all -> 0x0037 }
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0037 }
            int r1 = com.tencent.qbar.QbarNative.nativeTransBytes(r4, r0, r6, r15)     // Catch:{ all -> 0x0037 }
            if (r1 == 0) goto L_0x00aa
            java.lang.String r0 = "computeImagePHash transBytes failed result: %d"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0037 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0037 }
            r3[r5] = r1     // Catch:{ all -> 0x0037 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r0, r3)     // Catch:{ all -> 0x0037 }
            r1 = 0
            return r1
        L_0x00aa:
            com.tencent.mm.plugin.scanner.api.ScanImagePHashInfo r0 = com.tencent.p014mm.plugin.scanner.model.C19021i0.m20097c(r0, r6, r15, r5)     // Catch:{ all -> 0x0037 }
            java.lang.String r1 = "alvinluo computeImagePHash pHash: %s, pHashVersion: %s"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x00b8
            java.lang.String r6 = r0.pHash     // Catch:{ all -> 0x0037 }
            goto L_0x00b9
        L_0x00b8:
            r6 = 0
        L_0x00b9:
            r4[r5] = r6     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x00c0
            java.lang.String r6 = r0.pHashVersion     // Catch:{ all -> 0x0037 }
            goto L_0x00c1
        L_0x00c0:
            r6 = 0
        L_0x00c1:
            r4[r3] = r6     // Catch:{ all -> 0x0037 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r1, r4)     // Catch:{ all -> 0x0037 }
            return r0
        L_0x00c7:
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r3 = "computeImagePHash exception"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r3, r1)
        L_0x00ce:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.scanner.model.C94480u0.mo129952a(java.lang.String):com.tencent.mm.plugin.scanner.api.ScanImagePHashInfo");
    }
}
