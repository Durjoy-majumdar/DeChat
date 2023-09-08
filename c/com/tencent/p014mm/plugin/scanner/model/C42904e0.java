package com.tencent.p014mm.plugin.scanner.model;

import android.content.Context;
import android.net.Uri;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.scanner.model.e0 */
public final class C42904e0 {

    /* renamed from: a */
    public static final C42904e0 f116171a = new C42904e0();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: java.io.InputStream} */
    /* JADX WARNING: type inference failed for: r12v1, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r12v2, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r12v3 */
    /* JADX WARNING: type inference failed for: r12v4 */
    /* JADX WARNING: type inference failed for: r12v6 */
    /* JADX WARNING: type inference failed for: r12v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a2 A[SYNTHETIC, Splitter:B:42:0x00a2] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a7 A[Catch:{ Exception -> 0x00aa }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo67100a(android.content.Context r11, java.lang.String r12, java.lang.String r13, boolean r14) {
        /*
            r10 = this;
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r12
            r3 = 1
            r1[r3] = r13
            java.lang.String r4 = "MicroMsg.ScanAssetsManager"
            java.lang.String r5 = "alvinluo copyFileFromAssets src: %s, dst: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r5, r1)
            r1 = 0
            com.tencent.mm.vfs.m1 r5 = new com.tencent.mm.vfs.m1     // Catch:{ Exception -> 0x008b, all -> 0x0088 }
            r5.<init>((java.lang.String) r13)     // Catch:{ Exception -> 0x008b, all -> 0x0088 }
            boolean r13 = r5.mo119967g()     // Catch:{ Exception -> 0x008b, all -> 0x0088 }
            if (r13 != 0) goto L_0x0020
            r5.mo119964e()     // Catch:{ Exception -> 0x008b, all -> 0x0088 }
            goto L_0x0041
        L_0x0020:
            if (r14 == 0) goto L_0x0041
            long r13 = r5.mo119980r()     // Catch:{ Exception -> 0x008b, all -> 0x0088 }
            r6 = 0
            int r8 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0041
            long r13 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getInstallTime()     // Catch:{ Exception -> 0x008b, all -> 0x0088 }
            int r8 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0041
            long r13 = r5.mo119979q()     // Catch:{ Exception -> 0x008b, all -> 0x0088 }
            long r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getInstallTime()     // Catch:{ Exception -> 0x008b, all -> 0x0088 }
            int r8 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0041
            return
        L_0x0041:
            android.content.res.AssetManager r11 = r11.getAssets()     // Catch:{ Exception -> 0x008b, all -> 0x0088 }
            java.io.InputStream r11 = r11.open(r12)     // Catch:{ Exception -> 0x008b, all -> 0x0088 }
            java.io.OutputStream r1 = com.tencent.p014mm.vfs.C86013q1.m106426H(r5)     // Catch:{ Exception -> 0x0082, all -> 0x007c }
            r13 = 1024(0x400, float:1.435E-42)
            byte[] r13 = new byte[r13]     // Catch:{ Exception -> 0x0082, all -> 0x007c }
        L_0x0051:
            gy3.C87412m.m108591d(r11)     // Catch:{ Exception -> 0x0082, all -> 0x007c }
            int r14 = r11.read(r13)     // Catch:{ Exception -> 0x0082, all -> 0x007c }
            r6 = -1
            if (r14 != r6) goto L_0x0078
            r1.flush()     // Catch:{ Exception -> 0x0082, all -> 0x007c }
            java.lang.String r13 = "alvinluo copyFileFromAssets %s successfully, file len: %d"
            java.lang.Object[] r14 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0082, all -> 0x007c }
            r14[r2] = r12     // Catch:{ Exception -> 0x0082, all -> 0x007c }
            long r5 = r5.mo119980r()     // Catch:{ Exception -> 0x0082, all -> 0x007c }
            java.lang.Long r12 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x0082, all -> 0x007c }
            r14[r3] = r12     // Catch:{ Exception -> 0x0082, all -> 0x007c }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r13, r14)     // Catch:{ Exception -> 0x0082, all -> 0x007c }
            r11.close()     // Catch:{ Exception -> 0x009e }
            r1.close()     // Catch:{ Exception -> 0x009e }
            goto L_0x009e
        L_0x0078:
            r1.write(r13, r2, r14)     // Catch:{ Exception -> 0x0082, all -> 0x007c }
            goto L_0x0051
        L_0x007c:
            r12 = move-exception
            r9 = r1
            r1 = r11
            r11 = r12
            r12 = r9
            goto L_0x00a0
        L_0x0082:
            r12 = move-exception
            r9 = r1
            r1 = r11
            r11 = r12
            r12 = r9
            goto L_0x008d
        L_0x0088:
            r11 = move-exception
            r12 = r1
            goto L_0x00a0
        L_0x008b:
            r11 = move-exception
            r12 = r1
        L_0x008d:
            java.lang.String r13 = "alvinluo copyFileFromAssets exception"
            java.lang.Object[] r14 = new java.lang.Object[r2]     // Catch:{ all -> 0x009f }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r11, r13, r14)     // Catch:{ all -> 0x009f }
            if (r1 == 0) goto L_0x0099
            r1.close()     // Catch:{ Exception -> 0x009e }
        L_0x0099:
            if (r12 == 0) goto L_0x009e
            r12.close()     // Catch:{ Exception -> 0x009e }
        L_0x009e:
            return
        L_0x009f:
            r11 = move-exception
        L_0x00a0:
            if (r1 == 0) goto L_0x00a5
            r1.close()     // Catch:{ Exception -> 0x00aa }
        L_0x00a5:
            if (r12 == 0) goto L_0x00aa
            r12.close()     // Catch:{ Exception -> 0x00aa }
        L_0x00aa:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.scanner.model.C42904e0.mo67100a(android.content.Context, java.lang.String, java.lang.String, boolean):void");
    }

    /* renamed from: b */
    public final String mo67101b(Context context) {
        return context.getFilesDir().getParent() + "/scan_goods/";
    }

    /* renamed from: c */
    public final void mo67102c(Context context, boolean z) {
        C87412m.m108594g(context, "context");
        Uri n = C116299g2.m163858n(mo67101b(context));
        String path = n.getPath();
        boolean z2 = false;
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0 f0Var = C116281f0.C116289i.f348994a;
        C116281f0.C116288h l = f0Var.mo177799l(n, (C116281f0.C116288h) null);
        if (l.mo177810a()) {
            z2 = l.f348991a.mo119948x(l.f348992b);
        }
        if (!z2) {
            C116281f0.C116288h l2 = f0Var.mo177799l(n, l);
            if (l2.mo177810a()) {
                l2.f348991a.mo119937g(l2.f348992b);
            }
        }
        mo67100a(context, "scan_goods/center_det.bin", mo67101b(context) + "center_det.bin", z);
        mo67100a(context, "scan_goods/center_det.param", mo67101b(context) + "center_det.param", z);
        mo67100a(context, "scan_goods/version/csc_detect_model.bin", mo67101b(context) + "csc_detect_model.bin", z);
        mo67100a(context, "scan_goods/version/csc_detect_model.param", mo67101b(context) + "csc_detect_model.param", z);
        mo67100a(context, "scan_goods/version/csc_scancls_model.bin", mo67101b(context) + "csc_scancls_model.bin", z);
        mo67100a(context, "scan_goods/version/csc_scancls_model.param", mo67101b(context) + "csc_scancls_model.param", z);
    }
}
