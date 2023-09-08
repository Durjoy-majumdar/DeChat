package wl2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import com.tencent.mapsdk.internal.C0947jz;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.wcdb.FileUtils;
import java.io.ByteArrayOutputStream;

/* renamed from: wl2.j */
public class C102461j {

    /* renamed from: a */
    public static final int[] f301717a = {480, FileUtils.S_IRWXU, C0947jz.f2205e, 240};

    /* renamed from: wl2.j$a */
    public interface C102462a {
        /* renamed from: a */
        void mo138141a(boolean z, byte[] bArr);
    }

    /* renamed from: a */
    public static byte[] m135247a(Bitmap bitmap, int i) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ScanImageJpegCompressUtils", e, "compressImageByQuality exception", new Object[0]);
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00df A[EDGE_INSN: B:61:0x00df->B:59:0x00df ?: BREAK  , SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m135248b(java.lang.String r17, int r18, int r19, wl2.C102461j.C102462a r20) {
        /*
            r1 = r19
            r2 = r20
            int[] r3 = f301717a
            r4 = 0
            r0 = 0
            r6 = 0
        L_0x0009:
            r7 = 4
            if (r6 >= r7) goto L_0x00df
            r0 = r3[r6]
            java.lang.String r8 = "MicroMsg.ScanImageJpegCompressUtils"
            r9 = 122880(0x1e000, float:1.72192E-40)
            r10 = r17
            android.graphics.Bitmap r11 = m135249c(r10, r0)     // Catch:{ Exception -> 0x00c3 }
            if (r11 == 0) goto L_0x00c0
            boolean r12 = r11.isRecycled()     // Catch:{ Exception -> 0x00c3 }
            if (r12 != 0) goto L_0x00c0
            r12 = r18
            float r13 = (float) r12
            android.graphics.Bitmap r11 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.rotate(r11, r13)     // Catch:{ Exception -> 0x00be }
            int r13 = r11.getWidth()     // Catch:{ Exception -> 0x00be }
            int r14 = r11.getHeight()     // Catch:{ Exception -> 0x00be }
            int r13 = java.lang.Math.min(r13, r14)     // Catch:{ Exception -> 0x00be }
            r14 = 70
            r15 = 100
            if (r13 >= r0) goto L_0x003d
            r13 = 100
            goto L_0x003f
        L_0x003d:
            r13 = 70
        L_0x003f:
            byte[] r5 = m135247a(r11, r13)     // Catch:{ Exception -> 0x00be }
            if (r1 <= 0) goto L_0x0050
            if (r13 != r15) goto L_0x0050
            if (r5 == 0) goto L_0x0050
            int r15 = r5.length     // Catch:{ Exception -> 0x00be }
            if (r15 <= r1) goto L_0x0050
            byte[] r5 = m135247a(r11, r14)     // Catch:{ Exception -> 0x00be }
        L_0x0050:
            java.lang.String r14 = "alvinluo compressImage decode bitmap width: %d, height: %d, firstCompressQuality: %d, data: %d, targetSize: %d"
            r15 = 5
            java.lang.Object[] r15 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x00be }
            int r16 = r11.getWidth()     // Catch:{ Exception -> 0x00be }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r16)     // Catch:{ Exception -> 0x00be }
            r15[r4] = r16     // Catch:{ Exception -> 0x00be }
            int r16 = r11.getHeight()     // Catch:{ Exception -> 0x00be }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r16)     // Catch:{ Exception -> 0x00be }
            r4 = 1
            r15[r4] = r16     // Catch:{ Exception -> 0x00bb }
            r16 = 2
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x00bb }
            r15[r16] = r13     // Catch:{ Exception -> 0x00bb }
            r13 = 3
            r16 = -1
            if (r5 == 0) goto L_0x0079
            int r4 = r5.length     // Catch:{ Exception -> 0x00bb }
            goto L_0x007a
        L_0x0079:
            r4 = -1
        L_0x007a:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x00bb }
            r15[r13] = r4     // Catch:{ Exception -> 0x00bb }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x00bb }
            r15[r7] = r0     // Catch:{ Exception -> 0x00bb }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r14, r15)     // Catch:{ Exception -> 0x00bb }
            if (r5 == 0) goto L_0x00ae
            int r0 = r5.length     // Catch:{ Exception -> 0x00bb }
            if (r0 <= r9) goto L_0x00ae
            boolean r0 = r11.isRecycled()     // Catch:{ Exception -> 0x00bb }
            if (r0 != 0) goto L_0x00ae
            r0 = 50
            byte[] r5 = m135247a(r11, r0)     // Catch:{ Exception -> 0x00bb }
            java.lang.String r0 = "alvinluo compressImage compressed data: %d"
            r4 = 1
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x00bb }
            if (r5 == 0) goto L_0x00a4
            int r4 = r5.length     // Catch:{ Exception -> 0x00bb }
            r16 = r4
        L_0x00a4:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r16)     // Catch:{ Exception -> 0x00bb }
            r13 = 0
            r7[r13] = r4     // Catch:{ Exception -> 0x00bb }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r0, r7)     // Catch:{ Exception -> 0x00bb }
        L_0x00ae:
            r11.recycle()     // Catch:{ Exception -> 0x00bb }
            if (r2 == 0) goto L_0x00b7
            r0 = 1
            r2.mo138141a(r0, r5)     // Catch:{ Exception -> 0x00bb }
        L_0x00b7:
            r0 = r5
            r4 = 0
            r5 = 0
            goto L_0x00d4
        L_0x00bb:
            r0 = move-exception
            r4 = 0
            goto L_0x00c6
        L_0x00be:
            r0 = move-exception
            goto L_0x00c6
        L_0x00c0:
            r12 = r18
            goto L_0x00cd
        L_0x00c3:
            r0 = move-exception
            r12 = r18
        L_0x00c6:
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r7 = "alvinluo compressImage exception"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r7, r5)
        L_0x00cd:
            r5 = 0
            if (r2 == 0) goto L_0x00d3
            r2.mo138141a(r4, r5)
        L_0x00d3:
            r0 = r5
        L_0x00d4:
            if (r0 != 0) goto L_0x00d7
            goto L_0x00df
        L_0x00d7:
            int r7 = r0.length
            if (r7 > r9) goto L_0x00db
            return r0
        L_0x00db:
            int r6 = r6 + 1
            goto L_0x0009
        L_0x00df:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wl2.C102461j.m135248b(java.lang.String, int, int, wl2.j$a):byte[]");
    }

    /* renamed from: c */
    public static Bitmap m135249c(String str, int i) {
        int i2;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapUtil.decodeFile(str, options);
            int i3 = options.outWidth;
            int i4 = options.outHeight;
            if (i3 > i4) {
                int i5 = (int) (((((float) i3) * 1.0f) * ((float) i)) / ((float) i4));
                i2 = i;
                i = i5;
            } else {
                i2 = (int) (((((float) i4) * 1.0f) * ((float) i)) / ((float) i3));
            }
            Point point = new Point(i, i2);
            int i6 = point.x;
            int i7 = point.y;
            options.inSampleSize = BitmapUtil.calculateInSampleSize(options.outWidth, options.outHeight, i6, i7);
            options.inJustDecodeBounds = false;
            Log.m105925i("MicroMsg.ScanImageJpegCompressUtils", "alvinluo resizeImage width: %d, height: %d, targetWidth: %d, targetHeight: %d, sampleSize: %d", Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(options.inSampleSize));
            Bitmap decodeFile = BitmapUtil.decodeFile(str, options);
            return (decodeFile == null || decodeFile.isRecycled() || decodeFile.getWidth() <= i6) ? decodeFile : BitmapUtil.extractThumbNail(decodeFile, i7, i6, false, true);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ScanImageJpegCompressUtils", e, "alvinluo resizeImage exception", new Object[0]);
            return null;
        }
    }
}
