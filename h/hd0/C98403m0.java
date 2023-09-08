package hd0;

import androidx.exifinterface.media.ExifInterface;

/* renamed from: hd0.m0 */
public class C98403m0 {
    /* renamed from: a */
    public static String m127701a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & ExifInterface.MARKER);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: oj.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: oj.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: oj.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0061 A[LOOP:0: B:11:0x0035->B:28:0x0061, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0075 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x005d A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m127702b(java.lang.String r12) {
        /*
            java.lang.String r0 = "video/hevc"
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r12)
            r2 = 0
            if (r1 != 0) goto L_0x000b
            return r2
        L_0x000b:
            r1 = 1
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r3[r2] = r12
            java.lang.String r4 = "MicroMsg.VideoFile"
            java.lang.String r5 = "check is h265 video %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r3)
            java.lang.Class<h81.h> r3 = h81.C32735h.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            h81.h r3 = (h81.C32735h) r3
            h81.h$c r6 = h81.C32735h.C32737c.clicfg_videofile_ish265_use_native
            int r3 = r3.mo58779Qe(r6, r1)
            if (r3 != 0) goto L_0x0080
            r3 = 0
            oj.b r6 = new oj.b     // Catch:{ all -> 0x006b }
            r6.<init>()     // Catch:{ all -> 0x006b }
            r6.mo161392k(r12)     // Catch:{ all -> 0x0068 }
            int r7 = r6.mo161385d()     // Catch:{ all -> 0x0068 }
            r8 = 0
        L_0x0035:
            if (r8 >= r7) goto L_0x0064
            android.media.MediaFormat r9 = r6.mo161386e(r8)     // Catch:{ all -> 0x004e }
            java.lang.String r10 = "mime"
            java.lang.String r9 = r9.getString(r10)     // Catch:{ all -> 0x004e }
            boolean r10 = r0.equalsIgnoreCase(r9)     // Catch:{ all -> 0x004c }
            if (r10 == 0) goto L_0x0057
            r6.mo161388g()
            return r1
        L_0x004c:
            r10 = move-exception
            goto L_0x0050
        L_0x004e:
            r10 = move-exception
            r9 = r3
        L_0x0050:
            java.lang.Object[] r11 = new java.lang.Object[r1]     // Catch:{ all -> 0x0068 }
            r11[r2] = r12     // Catch:{ all -> 0x0068 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r10, r5, r11)     // Catch:{ all -> 0x0068 }
        L_0x0057:
            boolean r9 = r0.equalsIgnoreCase(r9)     // Catch:{ all -> 0x0068 }
            if (r9 == 0) goto L_0x0061
            r6.mo161388g()
            return r1
        L_0x0061:
            int r8 = r8 + 1
            goto L_0x0035
        L_0x0064:
            r6.mo161388g()
            goto L_0x0078
        L_0x0068:
            r0 = move-exception
            r3 = r6
            goto L_0x006c
        L_0x006b:
            r0 = move-exception
        L_0x006c:
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0079 }
            r1[r2] = r12     // Catch:{ all -> 0x0079 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r5, r1)     // Catch:{ all -> 0x0079 }
            if (r3 == 0) goto L_0x0078
            r3.mo161388g()
        L_0x0078:
            return r2
        L_0x0079:
            r12 = move-exception
            if (r3 == 0) goto L_0x007f
            r3.mo161388g()
        L_0x007f:
            throw r12
        L_0x0080:
            boolean r12 = com.tencent.p014mm.plugin.sight.base.SightVideoJNI.isH265VideoVFS(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: hd0.C98403m0.m127702b(java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0072, code lost:
        if (r0 == null) goto L_0x0075;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m127703c(java.lang.String r6) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = " filepath "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.VideoFile"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            r2 = 0
            if (r0 == 0) goto L_0x001e
            return r2
        L_0x001e:
            r0 = 0
            r3 = 1
            java.io.InputStream r0 = com.tencent.p014mm.vfs.C86013q1.m106423E(r6)     // Catch:{ Exception -> 0x0064 }
            r6 = 10
            byte[] r4 = new byte[r6]     // Catch:{ Exception -> 0x0064 }
            r0.read(r4, r2, r6)     // Catch:{ Exception -> 0x0064 }
            java.lang.String r6 = m127701a(r4)     // Catch:{ Exception -> 0x0064 }
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)     // Catch:{ Exception -> 0x0064 }
            if (r4 != 0) goto L_0x005e
            java.lang.String r6 = r6.toUpperCase()     // Catch:{ Exception -> 0x0064 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0064 }
            r4.<init>()     // Catch:{ Exception -> 0x0064 }
            java.lang.String r5 = "file type "
            r4.append(r5)     // Catch:{ Exception -> 0x0064 }
            r4.append(r6)     // Catch:{ Exception -> 0x0064 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0064 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r4)     // Catch:{ Exception -> 0x0064 }
            java.lang.String r4 = "00000014667479707174"
            boolean r6 = r6.contains(r4)     // Catch:{ Exception -> 0x0064 }
            if (r6 == 0) goto L_0x005e
            java.lang.String r6 = "file type qt "
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r6)     // Catch:{ Exception -> 0x0064 }
            r0.close()     // Catch:{ IOException -> 0x005d }
        L_0x005d:
            return r3
        L_0x005e:
            r0.close()     // Catch:{ IOException -> 0x0075 }
            goto L_0x0075
        L_0x0062:
            r6 = move-exception
            goto L_0x0076
        L_0x0064:
            r6 = move-exception
            java.lang.String r4 = "exception:%s"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0062 }
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r6)     // Catch:{ all -> 0x0062 }
            r3[r2] = r6     // Catch:{ all -> 0x0062 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r4, r3)     // Catch:{ all -> 0x0062 }
            if (r0 == 0) goto L_0x0075
            goto L_0x005e
        L_0x0075:
            return r2
        L_0x0076:
            if (r0 == 0) goto L_0x007b
            r0.close()     // Catch:{ IOException -> 0x007b }
        L_0x007b:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: hd0.C98403m0.m127703c(java.lang.String):boolean");
    }
}
