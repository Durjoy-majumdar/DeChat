package com.tencent.p014mm.plugin.appbrand.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tencent.p014mm.memory.C92712l;
import com.tencent.p014mm.plugin.performance.watchdogs.MemoryWatchDog;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import p757xv.C91353u;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.z */
public enum C84798z {
    ;

    /* JADX WARNING: Removed duplicated region for block: B:103:0x01e5 A[SYNTHETIC, Splitter:B:103:0x01e5] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0083 A[SYNTHETIC, Splitter:B:30:0x0083] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01de A[SYNTHETIC, Splitter:B:99:0x01de] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m104479a(java.lang.String r24, java.lang.String r25, int r26, int r27) {
        /*
            r7 = r24
            r8 = r25
            long r0 = com.tencent.p014mm.vfs.C86013q1.m106451l(r25)
            int r9 = (int) r0
            if (r26 <= 0) goto L_0x000e
            r1 = r26
            goto L_0x0012
        L_0x000e:
            r0 = 960(0x3c0, float:1.345E-42)
            r1 = 960(0x3c0, float:1.345E-42)
        L_0x0012:
            if (r27 <= 0) goto L_0x0017
            r2 = r27
            goto L_0x001b
        L_0x0017:
            r0 = 640(0x280, float:8.97E-43)
            r2 = 640(0x280, float:8.97E-43)
        L_0x001b:
            android.graphics.BitmapFactory$Options r3 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getImageOptions(r25)
            java.lang.String r11 = "MicroMsg.AppBrandImgUtil"
            r12 = 1
            r13 = 0
            if (r3 != 0) goto L_0x002f
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r13] = r8
            java.lang.String r1 = "compressImage, get null bitmap.option from path %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r1, r0)
            return r13
        L_0x002f:
            if (r3 != 0) goto L_0x0033
        L_0x0031:
            r14 = 0
            goto L_0x006d
        L_0x0033:
            java.lang.String r0 = r3.outMimeType
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "mimetype: "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r4)
            if (r0 != 0) goto L_0x004c
            goto L_0x0031
        L_0x004c:
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r4 = "jpg"
            int r4 = r0.indexOf(r4)
            if (r4 < 0) goto L_0x005a
        L_0x0058:
            r14 = 1
            goto L_0x006d
        L_0x005a:
            java.lang.String r4 = "jpeg"
            int r4 = r0.indexOf(r4)
            if (r4 < 0) goto L_0x0063
            goto L_0x0058
        L_0x0063:
            java.lang.String r4 = "png"
            int r0 = r0.indexOf(r4)
            if (r0 < 0) goto L_0x0031
            goto L_0x0058
        L_0x006d:
            boolean r0 = p1016ob.C89131a.m111396d(r3)
            r4 = -1
            r5 = 70
            if (r0 == 0) goto L_0x0081
            int r4 = com.tencent.p014mm.sdk.platformtools.MMNativeJpeg.queryQuality(r25)
            if (r4 >= r5) goto L_0x0081
            r6 = 25
            if (r4 <= r6) goto L_0x0081
            r5 = r4
        L_0x0081:
            if (r0 == 0) goto L_0x00c1
            com.tencent.mm.compatible.util.Exif r0 = com.tencent.p014mm.compatible.util.Exif.fromFile(r25)     // Catch:{ Exception -> 0x00a5 }
            if (r0 == 0) goto L_0x00a3
            int r6 = r0.getOrientationInDegree()     // Catch:{ Exception -> 0x00a5 }
            int r6 = r6 % 360
            java.lang.String r15 = "compressImage exif rotation %d"
            java.lang.Object[] r10 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x00a1 }
            int r0 = r0.getOrientationInDegree()     // Catch:{ Exception -> 0x00a1 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x00a1 }
            r10[r13] = r0     // Catch:{ Exception -> 0x00a1 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r15, r10)     // Catch:{ Exception -> 0x00a1 }
            goto L_0x00bf
        L_0x00a1:
            r0 = move-exception
            goto L_0x00a7
        L_0x00a3:
            r6 = 0
            goto L_0x00bf
        L_0x00a5:
            r0 = move-exception
            r6 = 0
        L_0x00a7:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r15 = "get degree error "
            r10.append(r15)
            java.lang.String r0 = r0.getMessage()
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
        L_0x00bf:
            r0 = r6
            goto L_0x00c2
        L_0x00c1:
            r0 = 0
        L_0x00c2:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r10 = "option info "
            r6.append(r10)
            int r10 = r3.outWidth
            r6.append(r10)
            java.lang.String r10 = " "
            r6.append(r10)
            int r15 = r3.outHeight
            r6.append(r15)
            r6.append(r10)
            r6.append(r14)
            java.lang.String r15 = " origQuality: "
            r6.append(r15)
            r6.append(r4)
            java.lang.String r4 = " degree:"
            r6.append(r4)
            r6.append(r0)
            java.lang.String r4 = " filelen "
            r6.append(r4)
            r6.append(r9)
            java.lang.String r4 = " target "
            r6.append(r4)
            r6.append(r1)
            r6.append(r10)
            r6.append(r2)
            java.lang.String r4 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r4)
            int r4 = r3.outWidth
            int r6 = r3.outHeight
            int r15 = r6 * 2
            r16 = 100
            java.lang.String r13 = "filelen %d newFileLen %d picCompressAvoidanceRemainderPerc %d"
            r18 = 0
            r20 = 2
            if (r4 >= r15) goto L_0x0123
            int r15 = r4 * 2
            if (r6 < r15) goto L_0x01e9
        L_0x0123:
            int r15 = r4 * r6
            r12 = 10240000(0x9c4000, float:1.4349296E-38)
            if (r15 > r12) goto L_0x01e9
            r1 = 204800(0x32000, float:2.86986E-40)
            if (r9 >= r1) goto L_0x0145
            if (r14 == 0) goto L_0x0145
            if (r0 != 0) goto L_0x0145
            java.lang.String r0 = "filelen is control in picCompressAvoidanceActiveSizeLong 204800"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            r1 = 0
            long r2 = com.tencent.p014mm.vfs.C86013q1.m106443d(r8, r7, r1)
            int r0 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r0 < 0) goto L_0x0143
            r12 = 1
            goto L_0x0144
        L_0x0143:
            r12 = 0
        L_0x0144:
            return r12
        L_0x0145:
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options
            r1.<init>()
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.bindlowMemeryOption(r1)
            r2 = 0
            java.io.InputStream r3 = com.tencent.p014mm.vfs.C86013q1.m106423E(r25)     // Catch:{ IOException -> 0x01c4 }
            r4 = 1048576(0x100000, float:1.469368E-39)
            r3.mark(r4)     // Catch:{ IOException -> 0x01bf, all -> 0x01bc }
            android.graphics.Bitmap r1 = com.tencent.p014mm.graphics.MMBitmapFactory.m98738g(r3, r2, r1)     // Catch:{ IOException -> 0x01bf, all -> 0x01bc }
            r3.reset()     // Catch:{ IOException -> 0x01bf, all -> 0x01bc }
            if (r1 != 0) goto L_0x0165
            r3.close()     // Catch:{ IOException -> 0x0163 }
        L_0x0163:
            r1 = 0
            return r1
        L_0x0165:
            float r2 = (float) r0
            android.graphics.Bitmap r1 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.rotate(r1, r2)     // Catch:{ IOException -> 0x01bf, all -> 0x01bc }
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ IOException -> 0x01bf, all -> 0x01bc }
            r4 = 1
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r1, r5, r2, r7, r4)     // Catch:{ IOException -> 0x01bf, all -> 0x01bc }
            if (r14 == 0) goto L_0x01b7
            if (r0 != 0) goto L_0x01b7
            long r0 = com.tencent.p014mm.vfs.C86013q1.m106451l(r24)     // Catch:{ IOException -> 0x01bf, all -> 0x01bc }
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x01bf, all -> 0x01bc }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ IOException -> 0x01bf, all -> 0x01bc }
            r5 = 0
            r2[r5] = r4     // Catch:{ IOException -> 0x01bf, all -> 0x01bc }
            java.lang.Long r4 = java.lang.Long.valueOf(r0)     // Catch:{ IOException -> 0x01bf, all -> 0x01bc }
            r5 = 1
            r2[r5] = r4     // Catch:{ IOException -> 0x01bf, all -> 0x01bc }
            r4 = 10
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch:{ IOException -> 0x01bf, all -> 0x01bc }
            r2[r20] = r5     // Catch:{ IOException -> 0x01bf, all -> 0x01bc }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r13, r2)     // Catch:{ IOException -> 0x01bf, all -> 0x01bc }
            long r5 = (long) r9     // Catch:{ IOException -> 0x01bf, all -> 0x01bc }
            long r5 = r5 - r0
            long r5 = r5 * r16
            int r9 = r9 * 10
            long r0 = (long) r9     // Catch:{ IOException -> 0x01bf, all -> 0x01bc }
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x01b2
            com.tencent.p014mm.vfs.C86013q1.m106447h(r24)     // Catch:{ IOException -> 0x01bf, all -> 0x01bc }
            r1 = 0
            long r4 = com.tencent.p014mm.vfs.C86013q1.m106443d(r8, r7, r1)     // Catch:{ IOException -> 0x01bf, all -> 0x01bc }
            int r0 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r0 < 0) goto L_0x01ad
            r12 = 1
            goto L_0x01ae
        L_0x01ad:
            r12 = 0
        L_0x01ae:
            r3.close()     // Catch:{ IOException -> 0x01b1 }
        L_0x01b1:
            return r12
        L_0x01b2:
            r3.close()     // Catch:{ IOException -> 0x01b5 }
        L_0x01b5:
            r1 = 1
            return r1
        L_0x01b7:
            r3.close()     // Catch:{ IOException -> 0x01ba }
        L_0x01ba:
            r1 = 1
            return r1
        L_0x01bc:
            r0 = move-exception
            r2 = r3
            goto L_0x01e3
        L_0x01bf:
            r0 = move-exception
            r2 = r3
            goto L_0x01c5
        L_0x01c2:
            r0 = move-exception
            goto L_0x01e3
        L_0x01c4:
            r0 = move-exception
        L_0x01c5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c2 }
            r1.<init>()     // Catch:{ all -> 0x01c2 }
            java.lang.String r3 = "Decode bitmap failed: "
            r1.append(r3)     // Catch:{ all -> 0x01c2 }
            r1.append(r8)     // Catch:{ all -> 0x01c2 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01c2 }
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x01c2 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r0, r1, r4)     // Catch:{ all -> 0x01c2 }
            if (r2 == 0) goto L_0x01e1
            r2.close()     // Catch:{ IOException -> 0x01e1 }
        L_0x01e1:
            r1 = 0
            return r1
        L_0x01e3:
            if (r2 == 0) goto L_0x01e8
            r2.close()     // Catch:{ IOException -> 0x01e8 }
        L_0x01e8:
            throw r0
        L_0x01e9:
            r12 = 102400(0x19000, float:1.43493E-40)
            if (r9 >= r12) goto L_0x0204
            if (r14 == 0) goto L_0x0204
            if (r0 != 0) goto L_0x0204
            java.lang.String r0 = "filelen is control in picCompressAvoidanceActiveSizeNormal 102400"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            r1 = 0
            long r2 = com.tencent.p014mm.vfs.C86013q1.m106443d(r8, r7, r1)
            int r0 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r0 < 0) goto L_0x0202
            r12 = 1
            goto L_0x0203
        L_0x0202:
            r12 = 0
        L_0x0203:
            return r12
        L_0x0204:
            if (r4 > r1) goto L_0x020b
            if (r6 <= r2) goto L_0x0209
            goto L_0x020b
        L_0x0209:
            r1 = 3
            goto L_0x0210
        L_0x020b:
            if (r6 > r1) goto L_0x02b7
            if (r4 > r2) goto L_0x02b7
            goto L_0x0209
        L_0x0210:
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r4 = 0
            r2[r4] = r1
            int r1 = r3.outWidth
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4 = 1
            r2[r4] = r1
            int r1 = r3.outHeight
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2[r20] = r1
            java.lang.String r1 = "hello ieg this is little img  %d w: %d h: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r1, r2)
            long r1 = com.tencent.p014mm.vfs.C86013q1.m106451l(r25)
            r21 = 71680(0x11800, double:3.54146E-319)
            int r6 = (r1 > r21 ? 1 : (r1 == r21 ? 0 : -1))
            if (r6 >= 0) goto L_0x0269
            if (r14 == 0) goto L_0x0252
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r1 = 0
            r0[r1] = r8
            java.lang.String r2 = "isSysSupportedPic %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r2, r0)
            long r2 = com.tencent.p014mm.vfs.C86013q1.m106443d(r8, r7, r1)
            int r0 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r0 < 0) goto L_0x0250
            r12 = 1
            goto L_0x0251
        L_0x0250:
            r12 = 0
        L_0x0251:
            return r12
        L_0x0252:
            int r4 = r3.outWidth
            r1 = 150(0x96, float:2.1E-43)
            if (r4 >= r1) goto L_0x0269
            int r2 = r3.outHeight
            if (r2 >= r1) goto L_0x0269
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG
            r1 = r25
            r3 = r4
            r4 = r0
            r6 = r24
            boolean r0 = m104480b(r1, r2, r3, r4, r5, r6)
            return r0
        L_0x0269:
            int r2 = r3.outHeight
            int r3 = r3.outWidth
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.JPEG
            r1 = r25
            r6 = r24
            boolean r1 = m104480b(r1, r2, r3, r4, r5, r6)
            if (r14 == 0) goto L_0x02b6
            if (r0 != 0) goto L_0x02b6
            long r2 = com.tencent.p014mm.vfs.C86013q1.m106451l(r24)
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            r5 = 0
            r0[r5] = r4
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            r5 = 1
            r0[r5] = r4
            r4 = 10
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r0[r20] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r13, r0)
            long r5 = (long) r9
            long r5 = r5 - r2
            long r5 = r5 * r16
            int r10 = r4 * r9
            long r2 = (long) r10
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x02b6
            com.tencent.p014mm.vfs.C86013q1.m106447h(r24)
            r1 = 0
            long r2 = com.tencent.p014mm.vfs.C86013q1.m106443d(r8, r7, r1)
            int r0 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r0 < 0) goto L_0x02b4
            r12 = 1
            goto L_0x02b5
        L_0x02b4:
            r12 = 0
        L_0x02b5:
            return r12
        L_0x02b6:
            return r1
        L_0x02b7:
            if (r4 < r6) goto L_0x02bb
            r12 = r1
            goto L_0x02bc
        L_0x02bb:
            r12 = r2
        L_0x02bc:
            if (r4 < r6) goto L_0x02bf
            r1 = r2
        L_0x02bf:
            int r2 = r6 * 2
            if (r4 >= r2) goto L_0x02cc
            int r4 = r4 * 2
            if (r6 < r4) goto L_0x02c8
            goto L_0x02cc
        L_0x02c8:
            r2 = r1
            r3 = r12
            goto L_0x0344
        L_0x02cc:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "too max pic "
            r1.append(r2)
            int r2 = r3.outWidth
            r1.append(r2)
            r1.append(r10)
            int r2 = r3.outHeight
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)
            int r1 = r3.outHeight
            if (r1 > 0) goto L_0x02f3
            r1 = 1
            r3.outHeight = r1
            goto L_0x02f4
        L_0x02f3:
            r1 = 1
        L_0x02f4:
            int r2 = r3.outWidth
            if (r2 > 0) goto L_0x02fa
            r3.outWidth = r1
        L_0x02fa:
            int r1 = r3.outWidth
            int r2 = r3.outHeight
            if (r1 <= r2) goto L_0x0303
            int r1 = r1 / r2
            r4 = r1
            goto L_0x0305
        L_0x0303:
            int r2 = r2 / r1
            r4 = r2
        L_0x0305:
            r1 = 10240000(0x9c4000, float:1.4349296E-38)
            if (r4 != 0) goto L_0x030b
            r4 = 1
        L_0x030b:
            int r12 = r1 / r4
            double r1 = (double) r12
            double r1 = java.lang.Math.sqrt(r1)
            int r1 = (int) r1
            int r2 = r3.outWidth
            int r3 = r3.outHeight
            if (r2 <= r3) goto L_0x0321
            int r2 = r1 * r4
            r23 = r2
            r2 = r1
            r1 = r23
            goto L_0x0323
        L_0x0321:
            int r2 = r1 * r4
        L_0x0323:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "new width height "
            r3.append(r6)
            r3.append(r1)
            r3.append(r10)
            r3.append(r2)
            r3.append(r10)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r3)
            r3 = r1
        L_0x0344:
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.JPEG
            r1 = r25
            r6 = r24
            boolean r1 = m104480b(r1, r2, r3, r4, r5, r6)
            if (r14 == 0) goto L_0x038d
            if (r0 != 0) goto L_0x038d
            long r2 = com.tencent.p014mm.vfs.C86013q1.m106451l(r24)
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            r5 = 0
            r0[r5] = r4
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            r5 = 1
            r0[r5] = r4
            r4 = 10
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r0[r20] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r13, r0)
            long r10 = (long) r9
            long r10 = r10 - r2
            long r10 = r10 * r16
            int r0 = r4 * r9
            long r2 = (long) r0
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x038d
            com.tencent.p014mm.vfs.C86013q1.m106447h(r24)
            r1 = 0
            long r2 = com.tencent.p014mm.vfs.C86013q1.m106443d(r8, r7, r1)
            int r0 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r0 < 0) goto L_0x038b
            r12 = 1
            goto L_0x038c
        L_0x038b:
            r12 = 0
        L_0x038c:
            return r12
        L_0x038d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.utils.C84798z.m104479a(java.lang.String, java.lang.String, int, int):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0106 A[Catch:{ IOException -> 0x015f }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0112 A[Catch:{ IOException -> 0x015f }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0173 A[SYNTHETIC, Splitter:B:68:0x0173] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m104480b(java.lang.String r22, int r23, int r24, android.graphics.Bitmap.CompressFormat r25, int r26, java.lang.String r27) {
        /*
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r27
            android.graphics.BitmapFactory$Options r4 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getImageOptions(r22)
            r5 = 0
            if (r4 == 0) goto L_0x0178
            int r6 = r4.outWidth
            if (r6 <= 0) goto L_0x0178
            int r4 = r4.outHeight
            if (r4 > 0) goto L_0x0019
            goto L_0x0178
        L_0x0019:
            java.lang.String r7 = "MicroMsg.AppBrandImgUtil"
            r8 = 1
            java.lang.String r9 = "createThumbNailUnScale, srcWidth: %s, srcHeight: %s, width: %s, height: %s"
            r10 = 4
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ IOException -> 0x0163 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)     // Catch:{ IOException -> 0x0163 }
            r10[r5] = r11     // Catch:{ IOException -> 0x0163 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)     // Catch:{ IOException -> 0x0163 }
            r10[r8] = r11     // Catch:{ IOException -> 0x0163 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r24)     // Catch:{ IOException -> 0x0163 }
            r12 = 2
            r10[r12] = r11     // Catch:{ IOException -> 0x0163 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r23)     // Catch:{ IOException -> 0x0163 }
            r13 = 3
            r10[r13] = r11     // Catch:{ IOException -> 0x0163 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r9, r10)     // Catch:{ IOException -> 0x0163 }
            android.graphics.BitmapFactory$Options r9 = new android.graphics.BitmapFactory$Options     // Catch:{ IOException -> 0x0163 }
            r9.<init>()     // Catch:{ IOException -> 0x0163 }
            double r10 = (double) r4     // Catch:{ IOException -> 0x0163 }
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r16 = r10 * r14
            double r12 = (double) r1     // Catch:{ IOException -> 0x0163 }
            double r16 = r16 / r12
            r18 = r9
            double r8 = (double) r6     // Catch:{ IOException -> 0x0163 }
            double r19 = r8 * r14
            double r14 = (double) r2     // Catch:{ IOException -> 0x0163 }
            double r19 = r19 / r14
            if (r6 != r2) goto L_0x005f
            if (r4 != r1) goto L_0x005f
            r5 = r18
            android.graphics.Bitmap r4 = m104481c(r0, r5)     // Catch:{ IOException -> 0x0163 }
            r3 = 0
            goto L_0x009c
        L_0x005f:
            r5 = r18
            r3 = 1
            r5.inSampleSize = r3     // Catch:{ IOException -> 0x015f }
            if (r4 > r1) goto L_0x0068
            if (r6 <= r2) goto L_0x0079
        L_0x0068:
            int r3 = (r16 > r19 ? 1 : (r16 == r19 ? 0 : -1))
            if (r3 >= 0) goto L_0x006f
            r1 = r19
            goto L_0x0071
        L_0x006f:
            r1 = r16
        L_0x0071:
            int r1 = (int) r1     // Catch:{ IOException -> 0x015f }
            r5.inSampleSize = r1     // Catch:{ IOException -> 0x015f }
            r2 = 1
            if (r1 > r2) goto L_0x0079
            r5.inSampleSize = r2     // Catch:{ IOException -> 0x015f }
        L_0x0079:
            int r1 = r4 * r6
            int r2 = r5.inSampleSize     // Catch:{ IOException -> 0x015f }
            int r1 = r1 / r2
            int r1 = r1 / r2
            r3 = 2764800(0x2a3000, float:3.87431E-39)
            if (r1 <= r3) goto L_0x0089
            int r2 = r2 + 1
            r5.inSampleSize = r2     // Catch:{ IOException -> 0x015f }
            goto L_0x0079
        L_0x0089:
            java.lang.String r1 = "createThumbNailUnScale, sampleSize: %s"
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ IOException -> 0x015f }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x015f }
            r3 = 0
            r4[r3] = r2     // Catch:{ IOException -> 0x015f }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r1, r4)     // Catch:{ IOException -> 0x015f }
            android.graphics.Bitmap r4 = m104481c(r0, r5)     // Catch:{ IOException -> 0x015f }
        L_0x009c:
            java.lang.String r1 = "createThumbNailUnScale, result bm: %s"
            r2 = 1
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x015f }
            r5[r3] = r4     // Catch:{ IOException -> 0x015f }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r1, r5)     // Catch:{ IOException -> 0x015f }
            if (r4 != 0) goto L_0x00aa
            goto L_0x0176
        L_0x00aa:
            java.lang.String r1 = "createThumbNailUnScale, bm.width: %s, bm.height: %s"
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x015f }
            int r2 = r4.getWidth()     // Catch:{ IOException -> 0x015f }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x015f }
            r5 = 0
            r3[r5] = r2     // Catch:{ IOException -> 0x015f }
            int r2 = r4.getHeight()     // Catch:{ IOException -> 0x015f }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x015f }
            r5 = 1
            r3[r5] = r2     // Catch:{ IOException -> 0x015f }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r1, r3)     // Catch:{ IOException -> 0x015f }
            int r1 = (r16 > r19 ? 1 : (r16 == r19 ? 0 : -1))
            if (r1 >= 0) goto L_0x00db
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r14 = r14 * r1
            double r14 = r14 * r10
            double r14 = r14 / r8
            double r1 = java.lang.Math.ceil(r14)     // Catch:{ IOException -> 0x015f }
            int r1 = (int) r1     // Catch:{ IOException -> 0x015f }
            r2 = r24
            goto L_0x00ea
        L_0x00db:
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r12 = r12 * r1
            double r12 = r12 * r8
            double r12 = r12 / r10
            double r1 = java.lang.Math.ceil(r12)     // Catch:{ IOException -> 0x015f }
            int r1 = (int) r1     // Catch:{ IOException -> 0x015f }
            r2 = r1
            r1 = r23
        L_0x00ea:
            int r0 = com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil.ExifHelper.getExifOrientation(r22)     // Catch:{ IOException -> 0x015f }
            r3 = 90
            if (r0 == r3) goto L_0x00fd
            r3 = 270(0x10e, float:3.78E-43)
            if (r0 != r3) goto L_0x00f7
            goto L_0x00fd
        L_0x00f7:
            r21 = r2
            r2 = r1
            r1 = r21
            goto L_0x0102
        L_0x00fd:
            float r3 = (float) r0     // Catch:{ IOException -> 0x015f }
            android.graphics.Bitmap r4 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.rotate(r4, r3)     // Catch:{ IOException -> 0x015f }
        L_0x0102:
            r3 = 180(0xb4, float:2.52E-43)
            if (r0 != r3) goto L_0x010b
            float r3 = (float) r0     // Catch:{ IOException -> 0x015f }
            android.graphics.Bitmap r4 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.rotate(r4, r3)     // Catch:{ IOException -> 0x015f }
        L_0x010b:
            r3 = 1
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createScaledBitmap(r4, r1, r2, r3)     // Catch:{ IOException -> 0x015f }
            if (r1 == 0) goto L_0x011c
            if (r4 == r1) goto L_0x011b
            com.tencent.mm.memory.l r2 = com.tencent.p014mm.memory.C92712l.m116840c()     // Catch:{ IOException -> 0x015f }
            r2.mo126912d(r4)     // Catch:{ IOException -> 0x015f }
        L_0x011b:
            r4 = r1
        L_0x011c:
            java.lang.String r1 = "createThumbNailUnScalebyUpload, degree %d, bm.width: %s, bm.height: %s"
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x015f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x015f }
            r3 = 0
            r2[r3] = r0     // Catch:{ IOException -> 0x015f }
            int r0 = r4.getWidth()     // Catch:{ IOException -> 0x015f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x015f }
            r3 = 1
            r2[r3] = r0     // Catch:{ IOException -> 0x015f }
            int r0 = r4.getHeight()     // Catch:{ IOException -> 0x015f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x015f }
            r3 = 2
            r2[r3] = r0     // Catch:{ IOException -> 0x015f }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r1, r2)     // Catch:{ IOException -> 0x015f }
            r1 = r27
            r2 = 0
            java.io.OutputStream r3 = com.tencent.p014mm.vfs.C86013q1.m106429K(r1, r2)     // Catch:{ IOException -> 0x015d }
            r0 = r25
            r5 = r26
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToStream(r4, r5, r0, r3, r2)     // Catch:{ IOException -> 0x015b }
            com.tencent.mm.memory.l r0 = com.tencent.p014mm.memory.C92712l.m116840c()     // Catch:{ IOException -> 0x015b }
            r0.mo126912d(r4)     // Catch:{ IOException -> 0x015b }
            r3.close()     // Catch:{ IOException -> 0x015b }
            r5 = 1
            goto L_0x0177
        L_0x015b:
            r0 = move-exception
            goto L_0x0166
        L_0x015d:
            r0 = move-exception
            goto L_0x0165
        L_0x015f:
            r0 = move-exception
            r1 = r27
            goto L_0x0165
        L_0x0163:
            r0 = move-exception
            r1 = r3
        L_0x0165:
            r3 = 0
        L_0x0166:
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r4 = 0
            r2[r4] = r1
            java.lang.String r1 = "create thumbnail from orig failed: %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r1, r2)
            if (r3 == 0) goto L_0x0176
            r3.close()     // Catch:{ IOException -> 0x0176 }
        L_0x0176:
            r5 = 0
        L_0x0177:
            return r5
        L_0x0178:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.utils.C84798z.m104480b(java.lang.String, int, int, android.graphics.Bitmap$CompressFormat, int, java.lang.String):boolean");
    }

    /* renamed from: c */
    public static Bitmap m104481c(String str, BitmapFactory.Options options) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Bitmap b = C92712l.m116840c().mo126911b(str, options);
            Log.m105919d("MicroMsg.AppBrandImgUtil", "decodeWithRotateByExif used %dms bitmap: %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), b);
            return b;
        } catch (OutOfMemoryError e) {
            Log.m105921e("MicroMsg.AppBrandImgUtil", "%s", ((MemoryWatchDog) ((C91353u) C86312j.m106911c(C91353u.class)).mo112623CU()).mo118581g());
            Log.m105920e("MicroMsg.AppBrandImgUtil", "OutOfMemoryError e " + e.getMessage());
            return null;
        }
    }
}
