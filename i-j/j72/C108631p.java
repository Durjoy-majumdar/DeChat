package j72;

/* renamed from: j72.p */
public class C108631p implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ byte[] f325284d;

    /* renamed from: e */
    public final /* synthetic */ C108620n f325285e;

    public C108631p(C108620n nVar, byte[] bArr) {
        this.f325285e = nVar;
        this.f325284d = bArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0034 A[Catch:{ Exception -> 0x011c }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0084 A[Catch:{ Exception -> 0x011c }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0085 A[Catch:{ Exception -> 0x011c }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008b A[Catch:{ Exception -> 0x011c }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0094 A[Catch:{ Exception -> 0x011c }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a7 A[Catch:{ Exception -> 0x011c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r15 = this;
            j72.n r0 = r15.f325285e
            byte[] r2 = r15.f325284d
            r0.getClass()
            r7 = 1
            java.lang.String r8 = "MicroMsg.MMSightFFMpegRecorder"
            r9 = 0
            if (r2 == 0) goto L_0x0114
            int r1 = r2.length     // Catch:{ Exception -> 0x011c }
            if (r1 != 0) goto L_0x0012
            goto L_0x0114
        L_0x0012:
            java.lang.String r1 = r0.f325259x     // Catch:{ Exception -> 0x011c }
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)     // Catch:{ Exception -> 0x011c }
            if (r1 == 0) goto L_0x0023
            java.lang.String r1 = "saveVideoThumbImpl, thumbpath is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r1)     // Catch:{ Exception -> 0x011c }
            r0.f325261z = r9     // Catch:{ Exception -> 0x011c }
            goto L_0x012c
        L_0x0023:
            int r1 = r0.f325252q     // Catch:{ Exception -> 0x011c }
            r10 = 180(0xb4, float:2.52E-43)
            if (r1 == 0) goto L_0x002f
            if (r1 != r10) goto L_0x002c
            goto L_0x002f
        L_0x002c:
            int r3 = r0.f325251p     // Catch:{ Exception -> 0x011c }
            goto L_0x0031
        L_0x002f:
            int r3 = r0.f325250o     // Catch:{ Exception -> 0x011c }
        L_0x0031:
            r11 = r3
            if (r1 == 0) goto L_0x003a
            if (r1 != r10) goto L_0x0037
            goto L_0x003a
        L_0x0037:
            int r1 = r0.f325250o     // Catch:{ Exception -> 0x011c }
            goto L_0x003c
        L_0x003a:
            int r1 = r0.f325251p     // Catch:{ Exception -> 0x011c }
        L_0x003c:
            r12 = r1
            android.graphics.YuvImage r13 = new android.graphics.YuvImage     // Catch:{ Exception -> 0x011c }
            r3 = 17
            r6 = 0
            r1 = r13
            r4 = r11
            r5 = r12
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x011c }
            android.graphics.Rect r1 = new android.graphics.Rect     // Catch:{ Exception -> 0x011c }
            r1.<init>(r9, r9, r11, r12)     // Catch:{ Exception -> 0x011c }
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x011c }
            r2.<init>()     // Catch:{ Exception -> 0x011c }
            r3 = 100
            r13.compressToJpeg(r1, r3, r2)     // Catch:{ Exception -> 0x011c }
            byte[] r1 = r2.toByteArray()     // Catch:{ Exception -> 0x011c }
            int r2 = r1.length     // Catch:{ Exception -> 0x011c }
            android.graphics.Bitmap r1 = com.tencent.p014mm.graphics.MMBitmapFactory.m98732a(r1, r9, r2)     // Catch:{ Exception -> 0x011c }
            com.tencent.mm.modelcontrol.VideoTransPara r2 = r0.f325225A     // Catch:{ Exception -> 0x011c }
            if (r2 == 0) goto L_0x00a3
            int r2 = r1.getWidth()     // Catch:{ Exception -> 0x011c }
            int r3 = r1.getHeight()     // Catch:{ Exception -> 0x011c }
            int r2 = java.lang.Math.min(r2, r3)     // Catch:{ Exception -> 0x011c }
            com.tencent.mm.modelcontrol.VideoTransPara r3 = r0.f325225A     // Catch:{ Exception -> 0x011c }
            int r3 = r3.f267179t     // Catch:{ Exception -> 0x011c }
            if (r2 <= r3) goto L_0x00a3
            int r2 = r1.getWidth()     // Catch:{ Exception -> 0x011c }
            int r3 = r1.getHeight()     // Catch:{ Exception -> 0x011c }
            com.tencent.mm.modelcontrol.VideoTransPara r4 = r0.f325225A     // Catch:{ Exception -> 0x011c }
            int r5 = r4.f267179t     // Catch:{ Exception -> 0x011c }
            if (r5 <= 0) goto L_0x0085
            goto L_0x0087
        L_0x0085:
            int r5 = r4.f267166d     // Catch:{ Exception -> 0x011c }
        L_0x0087:
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r2 >= r3) goto L_0x0094
            float r2 = (float) r2     // Catch:{ Exception -> 0x011c }
            float r2 = r2 * r4
            float r4 = (float) r5     // Catch:{ Exception -> 0x011c }
            float r2 = r2 / r4
            float r3 = (float) r3     // Catch:{ Exception -> 0x011c }
            float r3 = r3 / r2
            int r2 = (int) r3     // Catch:{ Exception -> 0x011c }
            goto L_0x009f
        L_0x0094:
            float r3 = (float) r3     // Catch:{ Exception -> 0x011c }
            float r3 = r3 * r4
            float r4 = (float) r5     // Catch:{ Exception -> 0x011c }
            float r3 = r3 / r4
            float r2 = (float) r2     // Catch:{ Exception -> 0x011c }
            float r2 = r2 / r3
            int r2 = (int) r2     // Catch:{ Exception -> 0x011c }
            r14 = r5
            r5 = r2
            r2 = r14
        L_0x009f:
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createScaledBitmap(r1, r5, r2, r7)     // Catch:{ Exception -> 0x011c }
        L_0x00a3:
            boolean r2 = r0.f325230F     // Catch:{ Exception -> 0x011c }
            if (r2 == 0) goto L_0x00cd
            int r2 = r0.f325231G     // Catch:{ Exception -> 0x011c }
            if (r2 != r10) goto L_0x00ac
            goto L_0x00cd
        L_0x00ac:
            int r3 = r0.f325252q     // Catch:{ Exception -> 0x011c }
            int r3 = r3 - r2
            int r2 = java.lang.Math.abs(r3)     // Catch:{ Exception -> 0x011c }
            if (r2 != 0) goto L_0x00e0
            r2 = 1127481344(0x43340000, float:180.0)
            android.graphics.Bitmap r2 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.rotate(r1, r2)     // Catch:{ Exception -> 0x011c }
            java.lang.String r3 = "bitmap recycle %s"
            java.lang.Object[] r4 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x011c }
            java.lang.String r5 = r1.toString()     // Catch:{ Exception -> 0x011c }
            r4[r9] = r5     // Catch:{ Exception -> 0x011c }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r3, r4)     // Catch:{ Exception -> 0x011c }
            r1.recycle()     // Catch:{ Exception -> 0x011c }
            r1 = r2
            goto L_0x00e0
        L_0x00cd:
            int r2 = r0.f325252q     // Catch:{ Exception -> 0x011c }
            int r3 = r0.f325231G     // Catch:{ Exception -> 0x011c }
            if (r3 != r10) goto L_0x00db
            int r2 = r2 + 180
            r3 = 360(0x168, float:5.04E-43)
            if (r2 <= r3) goto L_0x00db
            int r2 = r2 + -360
        L_0x00db:
            float r2 = (float) r2     // Catch:{ Exception -> 0x011c }
            android.graphics.Bitmap r1 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.rotate(r1, r2)     // Catch:{ Exception -> 0x011c }
        L_0x00e0:
            r2 = 60
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x011c }
            java.lang.String r4 = r0.f325259x     // Catch:{ Exception -> 0x011c }
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r1, r2, r3, r4, r7)     // Catch:{ Exception -> 0x011c }
            java.lang.String r2 = "saveVideoThumb to: %s, cameraOrientation: %s, width: %s, height: %s"
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x011c }
            java.lang.String r4 = r0.f325259x     // Catch:{ Exception -> 0x011c }
            r3[r9] = r4     // Catch:{ Exception -> 0x011c }
            int r4 = r0.f325252q     // Catch:{ Exception -> 0x011c }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x011c }
            r3[r7] = r4     // Catch:{ Exception -> 0x011c }
            r4 = 2
            int r5 = r1.getWidth()     // Catch:{ Exception -> 0x011c }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x011c }
            r3[r4] = r5     // Catch:{ Exception -> 0x011c }
            r4 = 3
            int r1 = r1.getHeight()     // Catch:{ Exception -> 0x011c }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x011c }
            r3[r4] = r1     // Catch:{ Exception -> 0x011c }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r2, r3)     // Catch:{ Exception -> 0x011c }
            goto L_0x012c
        L_0x0114:
            java.lang.String r1 = "saveVideoThumbImpl, data is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r1)     // Catch:{ Exception -> 0x011c }
            r0.f325261z = r9     // Catch:{ Exception -> 0x011c }
            goto L_0x012c
        L_0x011c:
            r1 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r7]
            java.lang.String r1 = r1.getMessage()
            r2[r9] = r1
            java.lang.String r1 = "saveVideoThumb error: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r8, r1, r2)
            r0.f325261z = r9
        L_0x012c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j72.C108631p.run():void");
    }
}
