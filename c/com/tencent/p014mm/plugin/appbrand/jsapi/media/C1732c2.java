package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import a70.C112760b;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import ck0.C92423c;
import com.tencent.p014mm.compatible.util.Exif;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.wxmm.v2helper;
import gy3.C87412m;
import java.io.IOException;
import java.util.List;
import p1016ob.C89131a;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.c2 */
public final class C1732c2 {
    /* renamed from: a */
    public static final void m1781a(String str) {
        C87412m.m108594g(str, "path");
        try {
            Util.clearExif(str);
        } catch (IllegalArgumentException e) {
            Log.m105925i("MicroMsg.MediaUtils", "clearExif error:%s", e.getMessage());
        } catch (IOException e2) {
            Log.m105925i("MicroMsg.MediaUtils", "clearExif error:%s", e2.getMessage());
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x004d */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0096  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m1782b(java.lang.String r13) {
        /*
            java.lang.String r0 = "MicroMsg.MediaUtils"
            java.lang.String r1 = "srcPath"
            gy3.C87412m.m108594g(r13, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = a70.C112760b.m154203K()
            r1.append(r2)
            java.lang.String r2 = "microMsg."
            r1.append(r2)
            long r2 = java.lang.System.currentTimeMillis()
            r1.append(r2)
            java.lang.String r2 = ".jpg"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 1
            java.lang.String r1 = com.tencent.p014mm.vfs.C86013q1.m106448i(r1, r2)
            gy3.C87412m.m108591d(r1)
            r3 = 0
            android.graphics.Bitmap r4 = com.tencent.p014mm.graphics.MMBitmapFactory.m98734c(r13)     // Catch:{ OutOfMemoryError -> 0x0068, NullPointerException -> 0x004d, Exception -> 0x0037 }
            goto L_0x008e
        L_0x0037:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "doCompressImage, decode bmp e "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r4)
            goto L_0x008d
        L_0x004d:
            android.graphics.Bitmap r4 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeFile(r13, r3)     // Catch:{ Exception -> 0x0052 }
            goto L_0x008e
        L_0x0052:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "doCompressImage, decode bmp npe retry, e "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r4)
            goto L_0x008d
        L_0x0068:
            java.lang.String r4 = "doCompressImage, decode bmp oom"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r4)
            android.graphics.Bitmap r4 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeFile(r13, r3)     // Catch:{ OutOfMemoryError -> 0x0088, Exception -> 0x0072 }
            goto L_0x008e
        L_0x0072:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "doCompressImage, decode bmp oom retry, e "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r4)
            goto L_0x008d
        L_0x0088:
            java.lang.String r4 = "doCompressImage, decode bmp oom retry, oom again"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r4)
        L_0x008d:
            r4 = r3
        L_0x008e:
            if (r4 != 0) goto L_0x0096
            java.lang.String r13 = "doCompressImage, decode bmp return null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r13)
            return r3
        L_0x0096:
            r4.recycle()
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r6 = -1
            boolean r6 = com.tencent.p014mm.plugin.appbrand.utils.C84798z.m104479a(r1, r13, r6, r6)     // Catch:{ OutOfMemoryError -> 0x0118 }
            java.lang.String r7 = "doCompressImage, ret = %b, cost = %d, %s (%d) -> %s (%d)"
            r8 = 6
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ OutOfMemoryError -> 0x0118 }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r6)     // Catch:{ OutOfMemoryError -> 0x0118 }
            r10 = 0
            r8[r10] = r9     // Catch:{ OutOfMemoryError -> 0x0118 }
            long r11 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()     // Catch:{ OutOfMemoryError -> 0x0118 }
            long r11 = r11 - r4
            java.lang.Long r4 = java.lang.Long.valueOf(r11)     // Catch:{ OutOfMemoryError -> 0x0118 }
            r8[r2] = r4     // Catch:{ OutOfMemoryError -> 0x0118 }
            r2 = 2
            r8[r2] = r13     // Catch:{ OutOfMemoryError -> 0x0118 }
            r2 = 3
            long r4 = com.tencent.p014mm.vfs.C86013q1.m106451l(r13)     // Catch:{ OutOfMemoryError -> 0x0118 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ OutOfMemoryError -> 0x0118 }
            r8[r2] = r4     // Catch:{ OutOfMemoryError -> 0x0118 }
            r2 = 4
            r8[r2] = r1     // Catch:{ OutOfMemoryError -> 0x0118 }
            r2 = 5
            android.net.Uri r4 = com.tencent.p014mm.vfs.C116299g2.m163858n(r1)     // Catch:{ OutOfMemoryError -> 0x0118 }
            java.lang.String r5 = r4.getPath()     // Catch:{ OutOfMemoryError -> 0x0118 }
            if (r5 == 0) goto L_0x00ef
            java.lang.String r5 = com.tencent.p014mm.vfs.C116299g2.m163855k(r5, r10, r10)     // Catch:{ OutOfMemoryError -> 0x0118 }
            java.lang.String r9 = r4.getPath()     // Catch:{ OutOfMemoryError -> 0x0118 }
            boolean r9 = r9.equals(r5)     // Catch:{ OutOfMemoryError -> 0x0118 }
            if (r9 != 0) goto L_0x00ef
            android.net.Uri$Builder r4 = r4.buildUpon()     // Catch:{ OutOfMemoryError -> 0x0118 }
            android.net.Uri$Builder r4 = r4.path(r5)     // Catch:{ OutOfMemoryError -> 0x0118 }
            android.net.Uri r4 = r4.build()     // Catch:{ OutOfMemoryError -> 0x0118 }
        L_0x00ef:
            com.tencent.mm.vfs.f0 r5 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ OutOfMemoryError -> 0x0118 }
            com.tencent.mm.vfs.f0$h r3 = r5.mo177799l(r4, r3)     // Catch:{ OutOfMemoryError -> 0x0118 }
            boolean r4 = r3.mo177810a()     // Catch:{ OutOfMemoryError -> 0x0118 }
            r9 = 0
            if (r4 != 0) goto L_0x00fe
            goto L_0x010b
        L_0x00fe:
            com.tencent.mm.vfs.FileSystem$c r4 = r3.f348991a     // Catch:{ OutOfMemoryError -> 0x0118 }
            java.lang.String r3 = r3.f348992b     // Catch:{ OutOfMemoryError -> 0x0118 }
            com.tencent.mm.vfs.b0 r3 = r4.mo119945q(r3)     // Catch:{ OutOfMemoryError -> 0x0118 }
            if (r3 != 0) goto L_0x0109
            goto L_0x010b
        L_0x0109:
            long r9 = r3.f250473c     // Catch:{ OutOfMemoryError -> 0x0118 }
        L_0x010b:
            java.lang.Long r3 = java.lang.Long.valueOf(r9)     // Catch:{ OutOfMemoryError -> 0x0118 }
            r8[r2] = r3     // Catch:{ OutOfMemoryError -> 0x0118 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r7, r8)     // Catch:{ OutOfMemoryError -> 0x0118 }
            if (r6 == 0) goto L_0x011d
            r13 = r1
            goto L_0x011d
        L_0x0118:
            java.lang.String r1 = "compressImage, oom"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
        L_0x011d:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.media.C1732c2.m1782b(java.lang.String):java.lang.String");
    }

    /* renamed from: c */
    public static final String m1783c(String str, boolean z) {
        C87412m.m108594g(str, "srcPath");
        int orientationInDegree = Exif.fromFile(str).getOrientationInDegree();
        if (orientationInDegree == 0) {
            return str;
        }
        int i = orientationInDegree % v2helper.VOIP_ENC_HEIGHT_LV1;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            Bitmap d = MMBitmapFactory.m98735d(str, options);
            if (d == null) {
                Log.m105920e("MicroMsg.MediaUtils", "rotate image, get null bmp");
                return str;
            }
            Bitmap rotate = BitmapUtil.rotate(d, (float) i);
            StringBuilder sb = new StringBuilder();
            sb.append(C112760b.m154203K());
            sb.append("microMsg.tmp.");
            sb.append(System.currentTimeMillis());
            sb.append(C89131a.m111396d(options) ? ".jpg" : ".png");
            String sb4 = sb.toString();
            try {
                BitmapUtil.saveBitmapToImage(rotate, z ? 97 : 80, C89131a.m111396d(options) ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.PNG, sb4, true);
                if (C89131a.m111396d(options)) {
                    C92423c.m116249b(str, sb4);
                }
                return sb4;
            } catch (Exception e) {
                Log.m105921e("MicroMsg.MediaUtils", "rotate image, exception occurred when saving | %s", e);
                C86013q1.m106447h(sb4);
                return str;
            }
        } catch (NullPointerException | OutOfMemoryError unused) {
            return str;
        }
    }

    /* renamed from: d */
    public static final boolean m1784d(List<String> list) {
        C87412m.m108594g(list, "imageFiles");
        if (Util.isNullOrNil((List) list)) {
            return false;
        }
        for (String fromFile : list) {
            if (Exif.fromFile(fromFile).getOrientationInDegree() != 0) {
                return true;
            }
        }
        return false;
    }
}
