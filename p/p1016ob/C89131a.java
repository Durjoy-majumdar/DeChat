package p1016ob;

import android.graphics.BitmapFactory;

/* renamed from: ob.a */
public class C89131a {
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0032 A[Catch:{ Error | Exception -> 0x0016, all -> 0x0024, all -> 0x002b, Exception -> 0x0036 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m111393a(java.lang.String r6) {
        /*
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r6)
            r1 = 0
            java.lang.String r2 = "Luggage.ImageInfoUtils"
            if (r0 != 0) goto L_0x000f
            java.lang.String r6 = "getExifOrientation err "
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r6)
            return r1
        L_0x000f:
            r0 = 1
            java.io.InputStream r3 = com.tencent.p014mm.vfs.C86013q1.m106423E(r6)     // Catch:{ Exception -> 0x0036 }
            if (r3 != 0) goto L_0x0018
        L_0x0016:
            r4 = 0
            goto L_0x0030
        L_0x0018:
            androidx.exifinterface.media.ExifInterface r4 = new androidx.exifinterface.media.ExifInterface     // Catch:{ Error | Exception -> 0x0016, all -> 0x0024 }
            r4.<init>((java.io.InputStream) r3)     // Catch:{ Error | Exception -> 0x0016, all -> 0x0024 }
            java.lang.String r5 = "Orientation"
            int r4 = r4.getAttributeInt(r5, r0)     // Catch:{ Error | Exception -> 0x0016, all -> 0x0024 }
            goto L_0x0030
        L_0x0024:
            r4 = move-exception
            if (r3 == 0) goto L_0x002f
            r3.close()     // Catch:{ all -> 0x002b }
            goto L_0x002f
        L_0x002b:
            r3 = move-exception
            r4.addSuppressed(r3)     // Catch:{ Exception -> 0x0036 }
        L_0x002f:
            throw r4     // Catch:{ Exception -> 0x0036 }
        L_0x0030:
            if (r3 == 0) goto L_0x0035
            r3.close()     // Catch:{ Exception -> 0x0036 }
        L_0x0035:
            return r4
        L_0x0036:
            r3 = move-exception
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r6
            r4[r0] = r3
            java.lang.String r6 = "getExifOrientation, path = %s, e = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r6, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p1016ob.C89131a.m111393a(java.lang.String):int");
    }

    /* renamed from: b */
    public static String m111394b(int i) {
        switch (i) {
            case 2:
                return "up-mirrored";
            case 3:
                return "down";
            case 4:
                return "down-mirrored";
            case 5:
                return "left-mirrored";
            case 6:
                return "right";
            case 7:
                return "right-mirrored";
            case 8:
                return "left";
            default:
                return "up";
        }
    }

    /* renamed from: c */
    public static String m111395c(BitmapFactory.Options options) {
        String str;
        if (options == null || (str = options.outMimeType) == null) {
            return "unknown";
        }
        String lowerCase = str.toLowerCase();
        return (lowerCase.indexOf("jpg") < 0 && lowerCase.indexOf("jpeg") < 0) ? lowerCase.indexOf("png") >= 0 ? "png" : lowerCase.indexOf("gif") >= 0 ? "gif" : "unknown" : "jpeg";
    }

    /* renamed from: d */
    public static boolean m111396d(BitmapFactory.Options options) {
        String str;
        if (options == null || (str = options.outMimeType) == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        return lowerCase.indexOf("jpg") >= 0 || lowerCase.indexOf("jpeg") >= 0;
    }
}
