package m90;

import lu3.C88656g;

/* renamed from: m90.p */
public class C109593p implements C88656g {

    /* renamed from: d */
    public final /* synthetic */ byte[] f328102d;

    /* renamed from: e */
    public final /* synthetic */ C109582n f328103e;

    public C109593p(C109582n nVar, byte[] bArr) {
        this.f328103e = nVar;
        this.f328102d = bArr;
    }

    public String getKey() {
        return "BigSightMediaCodecMP4MuxRecorder_saveThumb";
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0036 A[Catch:{ Exception -> 0x0120 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0086 A[Catch:{ Exception -> 0x0120 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0087 A[Catch:{ Exception -> 0x0120 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008d A[Catch:{ Exception -> 0x0120 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0096 A[Catch:{ Exception -> 0x0120 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ab A[Catch:{ Exception -> 0x0120 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r14 = this;
            m90.n r0 = r14.f328103e
            byte[] r2 = r14.f328102d
            r0.getClass()
            r7 = 1
            java.lang.String r8 = "MicroMsg.X264YUVMP4MuxRecorder"
            r9 = 0
            if (r2 == 0) goto L_0x0118
            int r1 = r2.length     // Catch:{ Exception -> 0x0120 }
            if (r1 != 0) goto L_0x0012
            goto L_0x0118
        L_0x0012:
            java.lang.String r1 = r0.f328079y     // Catch:{ Exception -> 0x0120 }
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)     // Catch:{ Exception -> 0x0120 }
            if (r1 == 0) goto L_0x0023
            java.lang.String r1 = "saveVideoThumbImpl, thumbpath is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r1)     // Catch:{ Exception -> 0x0120 }
            r0.f328040A = r9     // Catch:{ Exception -> 0x0120 }
            goto L_0x0130
        L_0x0023:
            int r1 = r0.f328071q     // Catch:{ Exception -> 0x0120 }
            r3 = 270(0x10e, float:3.78E-43)
            r4 = 90
            if (r1 == r4) goto L_0x0031
            if (r1 != r3) goto L_0x002e
            goto L_0x0031
        L_0x002e:
            int r5 = r0.f328070p     // Catch:{ Exception -> 0x0120 }
            goto L_0x0033
        L_0x0031:
            int r5 = r0.f328069o     // Catch:{ Exception -> 0x0120 }
        L_0x0033:
            r10 = r5
            if (r1 == r4) goto L_0x003c
            if (r1 != r3) goto L_0x0039
            goto L_0x003c
        L_0x0039:
            int r1 = r0.f328069o     // Catch:{ Exception -> 0x0120 }
            goto L_0x003e
        L_0x003c:
            int r1 = r0.f328070p     // Catch:{ Exception -> 0x0120 }
        L_0x003e:
            r11 = r1
            android.graphics.YuvImage r12 = new android.graphics.YuvImage     // Catch:{ Exception -> 0x0120 }
            r3 = 17
            r6 = 0
            r1 = r12
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0120 }
            android.graphics.Rect r1 = new android.graphics.Rect     // Catch:{ Exception -> 0x0120 }
            r1.<init>(r9, r9, r10, r11)     // Catch:{ Exception -> 0x0120 }
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x0120 }
            r2.<init>()     // Catch:{ Exception -> 0x0120 }
            r3 = 100
            r12.compressToJpeg(r1, r3, r2)     // Catch:{ Exception -> 0x0120 }
            byte[] r1 = r2.toByteArray()     // Catch:{ Exception -> 0x0120 }
            int r2 = r1.length     // Catch:{ Exception -> 0x0120 }
            android.graphics.Bitmap r1 = com.tencent.p014mm.graphics.MMBitmapFactory.m98732a(r1, r9, r2)     // Catch:{ Exception -> 0x0120 }
            com.tencent.mm.modelcontrol.VideoTransPara r2 = r0.f328041B     // Catch:{ Exception -> 0x0120 }
            if (r2 == 0) goto L_0x00a5
            int r2 = r1.getWidth()     // Catch:{ Exception -> 0x0120 }
            int r3 = r1.getHeight()     // Catch:{ Exception -> 0x0120 }
            int r2 = java.lang.Math.min(r2, r3)     // Catch:{ Exception -> 0x0120 }
            com.tencent.mm.modelcontrol.VideoTransPara r3 = r0.f328041B     // Catch:{ Exception -> 0x0120 }
            int r3 = r3.f267179t     // Catch:{ Exception -> 0x0120 }
            if (r2 <= r3) goto L_0x00a5
            int r2 = r1.getWidth()     // Catch:{ Exception -> 0x0120 }
            int r3 = r1.getHeight()     // Catch:{ Exception -> 0x0120 }
            com.tencent.mm.modelcontrol.VideoTransPara r4 = r0.f328041B     // Catch:{ Exception -> 0x0120 }
            int r5 = r4.f267179t     // Catch:{ Exception -> 0x0120 }
            if (r5 <= 0) goto L_0x0087
            goto L_0x0089
        L_0x0087:
            int r5 = r4.f267166d     // Catch:{ Exception -> 0x0120 }
        L_0x0089:
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r2 >= r3) goto L_0x0096
            float r2 = (float) r2     // Catch:{ Exception -> 0x0120 }
            float r2 = r2 * r4
            float r4 = (float) r5     // Catch:{ Exception -> 0x0120 }
            float r2 = r2 / r4
            float r3 = (float) r3     // Catch:{ Exception -> 0x0120 }
            float r3 = r3 / r2
            int r2 = (int) r3     // Catch:{ Exception -> 0x0120 }
            goto L_0x00a1
        L_0x0096:
            float r3 = (float) r3     // Catch:{ Exception -> 0x0120 }
            float r3 = r3 * r4
            float r4 = (float) r5     // Catch:{ Exception -> 0x0120 }
            float r3 = r3 / r4
            float r2 = (float) r2     // Catch:{ Exception -> 0x0120 }
            float r2 = r2 / r3
            int r2 = (int) r2     // Catch:{ Exception -> 0x0120 }
            r13 = r5
            r5 = r2
            r2 = r13
        L_0x00a1:
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createScaledBitmap(r1, r5, r2, r7)     // Catch:{ Exception -> 0x0120 }
        L_0x00a5:
            boolean r2 = r0.f328046G     // Catch:{ Exception -> 0x0120 }
            r3 = 180(0xb4, float:2.52E-43)
            if (r2 == 0) goto L_0x00d1
            int r2 = r0.f328047H     // Catch:{ Exception -> 0x0120 }
            if (r2 != r3) goto L_0x00b0
            goto L_0x00d1
        L_0x00b0:
            int r3 = r0.f328071q     // Catch:{ Exception -> 0x0120 }
            int r3 = r3 - r2
            int r2 = java.lang.Math.abs(r3)     // Catch:{ Exception -> 0x0120 }
            if (r2 != 0) goto L_0x00e4
            r2 = 1127481344(0x43340000, float:180.0)
            android.graphics.Bitmap r2 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.rotate(r1, r2)     // Catch:{ Exception -> 0x0120 }
            java.lang.String r3 = "bitmap recycle %s"
            java.lang.Object[] r4 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0120 }
            java.lang.String r5 = r1.toString()     // Catch:{ Exception -> 0x0120 }
            r4[r9] = r5     // Catch:{ Exception -> 0x0120 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r3, r4)     // Catch:{ Exception -> 0x0120 }
            r1.recycle()     // Catch:{ Exception -> 0x0120 }
            r1 = r2
            goto L_0x00e4
        L_0x00d1:
            int r2 = r0.f328071q     // Catch:{ Exception -> 0x0120 }
            int r4 = r0.f328047H     // Catch:{ Exception -> 0x0120 }
            if (r4 != r3) goto L_0x00df
            int r2 = r2 + 180
            r3 = 360(0x168, float:5.04E-43)
            if (r2 <= r3) goto L_0x00df
            int r2 = r2 + -360
        L_0x00df:
            float r2 = (float) r2     // Catch:{ Exception -> 0x0120 }
            android.graphics.Bitmap r1 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.rotate(r1, r2)     // Catch:{ Exception -> 0x0120 }
        L_0x00e4:
            r2 = 60
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x0120 }
            java.lang.String r4 = r0.f328079y     // Catch:{ Exception -> 0x0120 }
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r1, r2, r3, r4, r7)     // Catch:{ Exception -> 0x0120 }
            java.lang.String r2 = "saveVideoThumb to: %s, cameraOrientation: %s, width: %s, height: %s"
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0120 }
            java.lang.String r4 = r0.f328079y     // Catch:{ Exception -> 0x0120 }
            r3[r9] = r4     // Catch:{ Exception -> 0x0120 }
            int r4 = r0.f328071q     // Catch:{ Exception -> 0x0120 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0120 }
            r3[r7] = r4     // Catch:{ Exception -> 0x0120 }
            r4 = 2
            int r5 = r1.getWidth()     // Catch:{ Exception -> 0x0120 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x0120 }
            r3[r4] = r5     // Catch:{ Exception -> 0x0120 }
            r4 = 3
            int r1 = r1.getHeight()     // Catch:{ Exception -> 0x0120 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x0120 }
            r3[r4] = r1     // Catch:{ Exception -> 0x0120 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r2, r3)     // Catch:{ Exception -> 0x0120 }
            goto L_0x0130
        L_0x0118:
            java.lang.String r1 = "saveVideoThumbImpl, data is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r1)     // Catch:{ Exception -> 0x0120 }
            r0.f328040A = r9     // Catch:{ Exception -> 0x0120 }
            goto L_0x0130
        L_0x0120:
            r1 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r7]
            java.lang.String r1 = r1.getMessage()
            r2[r9] = r1
            java.lang.String r1 = "saveVideoThumb error: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r8, r1, r2)
            r0.f328040A = r9
        L_0x0130:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m90.C109593p.run():void");
    }
}
