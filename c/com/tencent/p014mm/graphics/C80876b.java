package com.tencent.p014mm.graphics;

/* renamed from: com.tencent.mm.graphics.b */
public class C80876b {
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001b A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap m98742a(java.io.InputStream r5, android.graphics.Rect r6, android.graphics.BitmapFactory.Options r7) {
        /*
            java.lang.String r0 = "MicroMsg.MMBitmapRegionDecoder"
            r1 = 1
            r2 = 0
            android.graphics.BitmapRegionDecoder r1 = android.graphics.BitmapRegionDecoder.newInstance(r5, r1)     // Catch:{ all -> 0x0012 }
            android.graphics.Bitmap r3 = r1.decodeRegion(r6, r7)     // Catch:{ all -> 0x0010 }
            r1.recycle()
            goto L_0x001f
        L_0x0010:
            r3 = move-exception
            goto L_0x0014
        L_0x0012:
            r3 = move-exception
            r1 = r2
        L_0x0014:
            java.lang.String r4 = "exception in MMBitmapRegionDecoder."
            com.tencent.stubs.logger.Log.m106499e((java.lang.String) r0, (java.lang.Throwable) r3, (java.lang.String) r4)     // Catch:{ all -> 0x0041 }
            if (r1 == 0) goto L_0x001e
            r1.recycle()
        L_0x001e:
            r3 = r2
        L_0x001f:
            if (r3 != 0) goto L_0x0040
            java.lang.String r1 = "fail to do regional decode with BitmapRegionDecoder, decode fully and crop instead."
            com.tencent.stubs.logger.Log.m106513w(r0, r1)
            android.graphics.Bitmap r5 = com.tencent.p014mm.graphics.MMBitmapFactory.m98738g(r5, r2, r7)
            if (r5 == 0) goto L_0x003f
            int r7 = r6.left
            int r0 = r6.top
            int r1 = r6.right
            int r1 = r1 - r7
            int r6 = r6.bottom
            int r6 = r6 - r0
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r5, r7, r0, r1, r6)
            if (r2 == r5) goto L_0x003f
            r5.recycle()
        L_0x003f:
            r3 = r2
        L_0x0040:
            return r3
        L_0x0041:
            r5 = move-exception
            if (r1 == 0) goto L_0x0047
            r1.recycle()
        L_0x0047:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.graphics.C80876b.m98742a(java.io.InputStream, android.graphics.Rect, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x001b A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap m98743b(byte[] r5, int r6, int r7, android.graphics.Rect r8, android.graphics.BitmapFactory.Options r9) {
        /*
            java.lang.String r0 = "MicroMsg.MMBitmapRegionDecoder"
            r1 = 1
            r2 = 0
            android.graphics.BitmapRegionDecoder r1 = android.graphics.BitmapRegionDecoder.newInstance(r5, r6, r7, r1)     // Catch:{ all -> 0x0012 }
            android.graphics.Bitmap r3 = r1.decodeRegion(r8, r9)     // Catch:{ all -> 0x0010 }
            r1.recycle()
            goto L_0x001f
        L_0x0010:
            r3 = move-exception
            goto L_0x0014
        L_0x0012:
            r3 = move-exception
            r1 = r2
        L_0x0014:
            java.lang.String r4 = "exception in MMBitmapRegionDecoder."
            com.tencent.stubs.logger.Log.m106499e((java.lang.String) r0, (java.lang.Throwable) r3, (java.lang.String) r4)     // Catch:{ all -> 0x0041 }
            if (r1 == 0) goto L_0x001e
            r1.recycle()
        L_0x001e:
            r3 = r2
        L_0x001f:
            if (r3 != 0) goto L_0x0040
            java.lang.String r1 = "fail to do regional decode with BitmapRegionDecoder, decode fully and crop instead."
            com.tencent.stubs.logger.Log.m106513w(r0, r1)
            android.graphics.Bitmap r5 = com.tencent.p014mm.graphics.MMBitmapFactory.m98733b(r5, r6, r7, r9)
            if (r5 == 0) goto L_0x003f
            int r6 = r8.left
            int r7 = r8.top
            int r9 = r8.right
            int r9 = r9 - r6
            int r8 = r8.bottom
            int r8 = r8 - r7
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r5, r6, r7, r9, r8)
            if (r2 == r5) goto L_0x003f
            r5.recycle()
        L_0x003f:
            r3 = r2
        L_0x0040:
            return r3
        L_0x0041:
            r5 = move-exception
            if (r1 == 0) goto L_0x0047
            r1.recycle()
        L_0x0047:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.graphics.C80876b.m98743b(byte[], int, int, android.graphics.Rect, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }
}
