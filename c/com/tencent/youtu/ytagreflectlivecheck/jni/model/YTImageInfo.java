package com.tencent.youtu.ytagreflectlivecheck.jni.model;

import android.util.Base64;
import com.tencent.youtu.ytagreflectlivecheck.data.YTActReflectImage;
import java.util.ArrayList;

public class YTImageInfo {
    public String checksum;
    public ArrayList<Float> five_points;
    public String image;

    public YTImageInfo(YTActReflectImage yTActReflectImage) {
        this.image = new String(Base64.encode(yTActReflectImage.image, 2));
        this.checksum = yTActReflectImage.checksum;
        ArrayList<Float> arrayList = new ArrayList<>();
        this.five_points = arrayList;
        float[] fArr = yTActReflectImage.xys;
        if (fArr != null) {
            arrayList.add(Float.valueOf(fArr[176]));
            this.five_points.add(Float.valueOf(yTActReflectImage.xys[177]));
            this.five_points.add(Float.valueOf(yTActReflectImage.xys[178]));
            this.five_points.add(Float.valueOf(yTActReflectImage.xys[179]));
            this.five_points.add(Float.valueOf(yTActReflectImage.xys[64]));
            this.five_points.add(Float.valueOf(yTActReflectImage.xys[65]));
            this.five_points.add(Float.valueOf(yTActReflectImage.xys[90]));
            this.five_points.add(Float.valueOf(yTActReflectImage.xys[91]));
            this.five_points.add(Float.valueOf(yTActReflectImage.xys[102]));
            this.five_points.add(Float.valueOf(yTActReflectImage.xys[103]));
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0025 */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0036 A[SYNTHETIC, Splitter:B:25:0x0036] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x003d A[SYNTHETIC, Splitter:B:29:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0044 A[SYNTHETIC, Splitter:B:36:0x0044] */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void createFileWithByte(java.lang.String r3, byte[] r4) {
        /*
            r2 = this;
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            r3 = 0
            boolean r1 = r0.exists()     // Catch:{ Exception -> 0x0041, all -> 0x0032 }
            if (r1 == 0) goto L_0x000f
            r0.delete()     // Catch:{ Exception -> 0x0041, all -> 0x0032 }
        L_0x000f:
            r0.createNewFile()     // Catch:{ Exception -> 0x0041, all -> 0x0032 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0041, all -> 0x0032 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0041, all -> 0x0032 }
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x002f, all -> 0x002b }
            r0.<init>(r1)     // Catch:{ Exception -> 0x002f, all -> 0x002b }
            r0.write(r4)     // Catch:{ Exception -> 0x0030, all -> 0x0029 }
            r0.flush()     // Catch:{ Exception -> 0x0030, all -> 0x0029 }
            r1.close()     // Catch:{ IOException -> 0x0025 }
        L_0x0025:
            r0.close()     // Catch:{ Exception -> 0x004c }
            goto L_0x004c
        L_0x0029:
            r4 = move-exception
            goto L_0x002d
        L_0x002b:
            r4 = move-exception
            r0 = r3
        L_0x002d:
            r3 = r1
            goto L_0x0034
        L_0x002f:
            r0 = r3
        L_0x0030:
            r3 = r1
            goto L_0x0042
        L_0x0032:
            r4 = move-exception
            r0 = r3
        L_0x0034:
            if (r3 == 0) goto L_0x003b
            r3.close()     // Catch:{ IOException -> 0x003a }
            goto L_0x003b
        L_0x003a:
        L_0x003b:
            if (r0 == 0) goto L_0x0040
            r0.close()     // Catch:{ Exception -> 0x0040 }
        L_0x0040:
            throw r4
        L_0x0041:
            r0 = r3
        L_0x0042:
            if (r3 == 0) goto L_0x0049
            r3.close()     // Catch:{ IOException -> 0x0048 }
            goto L_0x0049
        L_0x0048:
        L_0x0049:
            if (r0 == 0) goto L_0x004c
            goto L_0x0025
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.youtu.ytagreflectlivecheck.jni.model.YTImageInfo.createFileWithByte(java.lang.String, byte[]):void");
    }
}
