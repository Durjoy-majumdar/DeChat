package com.tencent.p014mm.sdk.platformtools;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.tencent.mm.sdk.platformtools.LongBitmapHandler */
public class LongBitmapHandler {
    private static final long IDKEY_LONG_BITMAP = 853;
    public static final double SCALE_THRESHOLD = 2.0d;
    private static final String TAG = "MicroMsg.LongBitmapHandler";
    private static final double THRES_CROP_SCALE = 2.5d;
    public static final int THUMB_MAX_LIMIT_SIZE_IN_DP = 144;
    public static final int THUMB_MIN_LIMITE_SIZE_IN_DP = 56;
    public static final int TYPE_HW = 2;
    public static final int TYPE_WH = 1;

    public static Bitmap createLongPictureBitmap(String str, int i, int i2) {
        return createLongPictureBitmap(str, i, 56, 144, THRES_CROP_SCALE, i2);
    }

    public static boolean createLongPictureThumbNail(String str, Bitmap.CompressFormat compressFormat, int i, String str2, int i2, int i3, PInt pInt, PInt pInt2) {
        Bitmap createLongPictureBitmap = createLongPictureBitmap(str, i2, i3);
        try {
            pInt.value = createLongPictureBitmap.getWidth();
            pInt2.value = createLongPictureBitmap.getHeight();
            BitmapUtil.saveBitmapToImage(createLongPictureBitmap, i, compressFormat, str2, true);
            return true;
        } catch (IOException unused) {
            Log.m105920e(TAG, "create thumbnail from orig failed: " + str2);
            return false;
        }
    }

    public static boolean isLongHorizontal(int i, int i2) {
        return ((double) i) > ((double) i2) * 2.0d;
    }

    public static int isLongPicture(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        Bitmap bitmap = null;
        try {
            InputStream E = C86013q1.m106423E(str);
            bitmap = MMBitmapFactory.m98738g(E, (Rect) null, options);
            E.close();
        } catch (FileNotFoundException | IOException unused) {
        }
        if (bitmap != null) {
            Log.m105925i(TAG, "isLongPicture bitmap recycle. %s", bitmap);
            bitmap.recycle();
        }
        int i = options.outWidth;
        int i2 = options.outHeight;
        float f = ((float) i2) / ((float) i);
        if (((float) i) / ((float) i2) >= 2.0f) {
            return 1;
        }
        return f >= 2.0f ? 2 : -1;
    }

    public static boolean isLongVertical(int i, int i2) {
        return ((double) i2) > ((double) i) * 2.0d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x016b A[SYNTHETIC, Splitter:B:65:0x016b] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0172 A[SYNTHETIC, Splitter:B:69:0x0172] */
    /* JADX WARNING: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap createLongPictureBitmap(java.lang.String r22, int r23, int r24, int r25, double r26, int r28) {
        /*
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r28
            fj.a r5 = p966fj.C86869a.INSTANCE
            r6 = 5
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r8 = 0
            r7[r8] = r0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r24)
            r10 = 1
            r7[r10] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r25)
            r11 = 2
            r7[r11] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r23)
            r12 = 3
            r7[r12] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r28)
            r13 = 4
            r7[r13] = r9
            java.lang.String r9 = "MicroMsg.LongBitmapHandler"
            java.lang.String r14 = "hy: createLongPictureBitmap: path: %s, minShorter: %d, maxLonger: %d, type: %d, rotateDegree: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r14, r7)
            r14 = 853(0x355, double:4.214E-321)
            r12 = 0
            r5.mo121329a(r14, r12)
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r22)
            r13 = 0
            if (r12 != 0) goto L_0x0209
            if (r2 < 0) goto L_0x0209
            if (r3 < 0) goto L_0x0209
            if (r1 == r11) goto L_0x004b
            if (r1 != r10) goto L_0x0209
        L_0x004b:
            if (r2 <= r3) goto L_0x004f
            goto L_0x0209
        L_0x004f:
            double r11 = (double) r2
            double r11 = r11 * r26
            double r6 = (double) r3
            int r19 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r19 < 0) goto L_0x006a
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.Double r1 = java.lang.Double.valueOf(r26)
            r0[r8] = r1
            java.lang.String r1 = "hy: not legal min and max size! max must me at least %f times of min!"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r9, r1, r0)
            r0 = 2
            r5.mo121329a(r14, r0)
            return r13
        L_0x006a:
            android.graphics.Point r6 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getPictureSize(r22)
            if (r6 == 0) goto L_0x01fa
            int r7 = r6.x
            if (r7 <= 0) goto L_0x01fa
            int r6 = r6.y
            if (r6 > 0) goto L_0x007a
            goto L_0x01fa
        L_0x007a:
            if (r1 != r10) goto L_0x0084
            double r11 = (double) r7
            double r13 = (double) r6
            double r11 = r11 / r13
            int r13 = (r11 > r26 ? 1 : (r11 == r26 ? 0 : -1))
            if (r13 <= 0) goto L_0x008d
            goto L_0x008b
        L_0x0084:
            double r11 = (double) r6
            double r13 = (double) r7
            double r11 = r11 / r13
            int r13 = (r11 > r26 ? 1 : (r11 == r26 ? 0 : -1))
            if (r13 <= 0) goto L_0x008d
        L_0x008b:
            r11 = 1
            goto L_0x008e
        L_0x008d:
            r11 = 0
        L_0x008e:
            if (r11 == 0) goto L_0x00b3
            r12 = 4611686018427387904(0x4000000000000000, double:2.0)
            if (r1 != r10) goto L_0x00a3
            r20 = r9
            double r8 = (double) r6
            double r8 = r8 * r26
            int r1 = (int) r8
            double r14 = (double) r7
            double r14 = r14 - r8
            double r14 = r14 / r12
            int r14 = (int) r14
            r7 = r1
            r8 = r6
            r9 = r14
            r12 = 0
            goto L_0x00b1
        L_0x00a3:
            r20 = r9
            double r8 = (double) r7
            double r8 = r8 * r26
            int r1 = (int) r8
            double r14 = (double) r6
            double r14 = r14 - r8
            double r14 = r14 / r12
            int r14 = (int) r14
            r6 = r1
            r8 = r7
            r12 = r14
            r9 = 0
        L_0x00b1:
            r13 = 5
            goto L_0x00c7
        L_0x00b3:
            r20 = r9
            if (r1 != r10) goto L_0x00b9
            r8 = r7
            goto L_0x00ba
        L_0x00b9:
            r8 = r6
        L_0x00ba:
            if (r1 != r10) goto L_0x00be
            r1 = r6
            goto L_0x00bf
        L_0x00be:
            r1 = r7
        L_0x00bf:
            r9 = 0
            r12 = 0
            r13 = 5
            r21 = r8
            r8 = r1
            r1 = r21
        L_0x00c7:
            java.lang.Object[] r13 = new java.lang.Object[r13]
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r11)
            r15 = 0
            r13[r15] = r14
            java.lang.Integer r15 = java.lang.Integer.valueOf(r7)
            r13[r10] = r15
            java.lang.Integer r15 = java.lang.Integer.valueOf(r6)
            r17 = 2
            r13[r17] = r15
            java.lang.Integer r15 = java.lang.Integer.valueOf(r9)
            r18 = 3
            r13[r18] = r15
            java.lang.Integer r15 = java.lang.Integer.valueOf(r12)
            r16 = 4
            r13[r16] = r15
            java.lang.String r15 = "hy: need crop: %b, croppedWidth: %d, croppedHeight: %d, rectStartX: %d, rectStartY: %d"
            r14 = r20
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r14, r15, r13)
            r13 = 1065353216(0x3f800000, float:1.0)
            if (r1 <= r3) goto L_0x0117
            int r2 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.calculateInSampleSize(r8, r1, r8, r3)
            float r3 = (float) r3
            int r1 = r1 / r2
            float r1 = (float) r1
            float r3 = r3 / r1
            r1 = 2
            java.lang.Object[] r8 = new java.lang.Object[r1]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r15 = 0
            r8[r15] = r1
            java.lang.Float r15 = java.lang.Float.valueOf(r3)
            r8[r10] = r15
            java.lang.String r15 = "hy: need sample. use sampleSize: %d, need post scale: %f"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r14, r15, r8)
            goto L_0x0130
        L_0x0117:
            if (r8 >= r2) goto L_0x012d
            float r2 = (float) r2
            float r3 = (float) r8
            float r3 = r2 / r3
            java.lang.Object[] r2 = new java.lang.Object[r10]
            java.lang.Float r8 = java.lang.Float.valueOf(r3)
            r1 = 0
            r2[r1] = r8
            java.lang.String r8 = "hy: need scale larger. scale times: %f"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r14, r8, r2)
            r2 = 1
            goto L_0x0130
        L_0x012d:
            r2 = 1
            r3 = 1065353216(0x3f800000, float:1.0)
        L_0x0130:
            android.graphics.BitmapFactory$Options r8 = new android.graphics.BitmapFactory$Options
            r8.<init>()
            r8.inSampleSize = r2
            if (r11 == 0) goto L_0x0176
            java.io.InputStream r15 = com.tencent.p014mm.vfs.C86013q1.m106423E(r22)     // Catch:{ FileNotFoundException -> 0x0158, all -> 0x0155 }
            android.graphics.Rect r0 = new android.graphics.Rect     // Catch:{ FileNotFoundException -> 0x0153 }
            int r7 = r7 + r9
            int r6 = r6 + r12
            r0.<init>(r9, r12, r7, r6)     // Catch:{ FileNotFoundException -> 0x0153 }
            android.graphics.Bitmap r0 = com.tencent.p014mm.graphics.C80876b.m98742a(r15, r0, r8)     // Catch:{ FileNotFoundException -> 0x0153 }
            if (r15 == 0) goto L_0x017a
            r15.close()     // Catch:{ IOException -> 0x014e }
            goto L_0x017a
        L_0x014e:
            goto L_0x017a
        L_0x0150:
            r0 = move-exception
            r13 = r15
            goto L_0x0170
        L_0x0153:
            r0 = move-exception
            goto L_0x015a
        L_0x0155:
            r0 = move-exception
            r13 = 0
            goto L_0x0170
        L_0x0158:
            r0 = move-exception
            r15 = 0
        L_0x015a:
            java.lang.String r2 = "hy: file not found when decode region"
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0150 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r14, r0, r2, r1)     // Catch:{ all -> 0x0150 }
            r0 = 4
            r2 = 853(0x355, double:4.214E-321)
            r5.mo121329a(r2, r0)     // Catch:{ all -> 0x0150 }
            if (r15 == 0) goto L_0x016e
            r15.close()     // Catch:{ IOException -> 0x016e }
        L_0x016e:
            r1 = 0
            return r1
        L_0x0170:
            if (r13 == 0) goto L_0x0175
            r13.close()     // Catch:{ IOException -> 0x0175 }
        L_0x0175:
            throw r0
        L_0x0176:
            android.graphics.Bitmap r0 = com.tencent.p014mm.graphics.MMBitmapFactory.m98735d(r0, r8)
        L_0x017a:
            if (r0 != 0) goto L_0x018a
            java.lang.String r0 = "hy: can not decode non matrixed bitmap!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r0)
            r0 = 5
            r6 = 853(0x355, double:4.214E-321)
            r5.mo121329a(r6, r0)
            r1 = 0
            return r1
        L_0x018a:
            r6 = 853(0x355, double:4.214E-321)
            r8 = 6
            r5.mo121329a(r6, r8)
            int r2 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x019d
            if (r4 != 0) goto L_0x019d
            java.lang.String r1 = "hy: not need to post handle. return directly"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r14, r1)
            return r0
        L_0x019d:
            android.graphics.Matrix r2 = new android.graphics.Matrix
            r2.<init>()
            r2.preScale(r3, r3)
            float r3 = (float) r4
            r2.postRotate(r3)
            r3 = 0
            r4 = 0
            int r5 = r0.getWidth()
            int r6 = r0.getHeight()
            r7 = 1
            r22 = r0
            r23 = r3
            r24 = r4
            r25 = r5
            r26 = r6
            r27 = r2
            r28 = r7
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r22, r23, r24, r25, r26, r27, r28)
            if (r2 == r0) goto L_0x01da
            java.lang.Object[] r3 = new java.lang.Object[r10]
            java.lang.String r4 = r0.toString()
            r1 = 0
            r3[r1] = r4
            java.lang.String r4 = "bitmap recycle %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r4, r3)
            r0.recycle()
            goto L_0x01db
        L_0x01da:
            r1 = 0
        L_0x01db:
            if (r2 == 0) goto L_0x01f9
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r3 = r2.getWidth()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r1] = r3
            int r1 = r2.getHeight()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r10] = r1
            java.lang.String r1 = "hy: created bitmap is %d * %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r14, r1, r0)
        L_0x01f9:
            return r2
        L_0x01fa:
            r14 = r9
            java.lang.String r0 = "hy: can not retrieve original picture size!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r0)
            r0 = 3
            r2 = 853(0x355, double:4.214E-321)
            r5.mo121329a(r2, r0)
            r1 = 0
            return r1
        L_0x0209:
            r1 = r13
            r2 = r14
            r14 = r9
            java.lang.String r0 = "hy: createLongPictureBitmap precheck failed!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r0)
            r6 = 1
            r5.mo121329a(r2, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.LongBitmapHandler.createLongPictureBitmap(java.lang.String, int, int, int, double, int):android.graphics.Bitmap");
    }

    public static boolean createLongPictureThumbNail(String str, Bitmap.CompressFormat compressFormat, int i, String str2, int i2) {
        return createLongPictureThumbNail(str, compressFormat, i, str2, i2, 0, new PInt(), new PInt());
    }

    public static int isLongPicture(Bitmap bitmap) {
        float width = ((float) bitmap.getWidth()) / ((float) bitmap.getHeight());
        float height = ((float) bitmap.getHeight()) / ((float) bitmap.getWidth());
        if (width >= 2.0f) {
            return 1;
        }
        return height >= 2.0f ? 2 : -1;
    }
}
