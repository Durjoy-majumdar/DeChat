package sh3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sticker.loader.StickerLoadInfo;
import gy3.C87412m;

/* renamed from: sh3.l */
public final class C101632l extends C101630j {

    /* renamed from: h */
    public final String f297498h = "MicroMsg.StickerUrlTask";

    /* renamed from: i */
    public final String f297499i;

    /* renamed from: j */
    public final String f297500j;

    /* renamed from: n */
    public final String f297501n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101632l(StickerLoadInfo stickerLoadInfo) {
        super(stickerLoadInfo);
        C87412m.m108594g(stickerLoadInfo, "info");
        this.f297499i = stickerLoadInfo.mo135558a();
        StringBuilder sb = new StringBuilder();
        C101624e eVar = C101624e.f297484a;
        String str = C101624e.f297487d;
        sb.append(str);
        sb.append("preview/");
        this.f297500j = sb.toString();
        this.f297501n = str + "preview.zip";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.io.InputStream} */
    /* JADX WARNING: type inference failed for: r4v0, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: type inference failed for: r4v14 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11852a() {
        /*
            r12 = this;
            com.tencent.mm.network.d$b r0 = new com.tencent.mm.network.d$b
            com.tencent.mm.sticker.loader.StickerLoadInfo r1 = r12.f297495f
            java.lang.String r1 = r1.f284105i
            r0.<init>(r1)
            r1 = 1
            r2 = 0
            r3 = 0
            com.tencent.mm.sticker.loader.StickerLoadInfo r4 = r12.f297495f     // Catch:{ Exception -> 0x012c, all -> 0x0129 }
            java.lang.String r4 = r4.f284105i     // Catch:{ Exception -> 0x012c, all -> 0x0129 }
            com.tencent.mm.network.b0 r0 = com.tencent.p014mm.network.C81035d.m98963d(r4, r0)     // Catch:{ Exception -> 0x012c, all -> 0x0129 }
            int r4 = r0.mo112916a()     // Catch:{ Exception -> 0x012c, all -> 0x0129 }
            java.io.InputStream r5 = r0.getInputStream()     // Catch:{ Exception -> 0x012c, all -> 0x0129 }
            java.lang.String r6 = r0.getContentType()     // Catch:{ Exception -> 0x0125, all -> 0x0121 }
            java.lang.String r7 = r12.f297498h     // Catch:{ Exception -> 0x0125, all -> 0x0121 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0125, all -> 0x0121 }
            r8.<init>()     // Catch:{ Exception -> 0x0125, all -> 0x0121 }
            java.lang.String r9 = "http response: "
            r8.append(r9)     // Catch:{ Exception -> 0x0125, all -> 0x0121 }
            r8.append(r4)     // Catch:{ Exception -> 0x0125, all -> 0x0121 }
            java.lang.String r9 = ", "
            r8.append(r9)     // Catch:{ Exception -> 0x0125, all -> 0x0121 }
            r8.append(r6)     // Catch:{ Exception -> 0x0125, all -> 0x0121 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0125, all -> 0x0121 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)     // Catch:{ Exception -> 0x0125, all -> 0x0121 }
            r7 = 200(0xc8, float:2.8E-43)
            if (r4 == r7) goto L_0x0052
            r0.disconnect()     // Catch:{ Exception -> 0x0125, all -> 0x0121 }
            com.tencent.mm.sticker.loader.StickerLoadInfo r0 = r12.f297495f     // Catch:{ Exception -> 0x0125, all -> 0x0121 }
            r0.f284106j = r1     // Catch:{ Exception -> 0x0125, all -> 0x0121 }
            r12.mo141083e(r3)     // Catch:{ Exception -> 0x0125, all -> 0x0121 }
            if (r5 == 0) goto L_0x0051
            r5.close()
        L_0x0051:
            return
        L_0x0052:
            java.lang.String r4 = r12.f297500j     // Catch:{ Exception -> 0x0125, all -> 0x0121 }
            com.tencent.p014mm.vfs.C86013q1.m106461v(r4)     // Catch:{ Exception -> 0x0125, all -> 0x0121 }
            java.lang.String r4 = r12.f297501n     // Catch:{ Exception -> 0x0125, all -> 0x0121 }
            java.io.OutputStream r4 = com.tencent.p014mm.vfs.C86013q1.m106429K(r4, r3)     // Catch:{ Exception -> 0x0125, all -> 0x0121 }
            r7 = 2
            long r8 = cy3.C86147a.m106660b(r5, r4, r3, r7, r2)     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            java.lang.String r2 = r12.f297498h     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            r10.<init>()     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            java.lang.String r11 = "http save to file: "
            r10.append(r11)     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            r10.append(r8)     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            java.lang.String r8 = r10.toString()     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r8)     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            r0.disconnect()     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            java.lang.String r0 = "application/zip"
            boolean r0 = gy3.C87412m.m108589b(r6, r0)     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            if (r0 == 0) goto L_0x00cc
            java.lang.String r0 = r12.f297500j     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            com.tencent.p014mm.vfs.C86013q1.m106445f(r0)     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            java.lang.String r0 = r12.f297500j     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            com.tencent.p014mm.vfs.C86013q1.m106461v(r0)     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            java.lang.String r0 = r12.f297501n     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            java.lang.String r2 = r12.f297500j     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            int r0 = com.tencent.p014mm.vfs.C86013q1.m106436R(r0, r2)     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            if (r0 == 0) goto L_0x00a7
            com.tencent.mm.sticker.loader.StickerLoadInfo r0 = r12.f297495f     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            r0.f284106j = r7     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            r12.mo141083e(r3)     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            r5.close()
            if (r4 == 0) goto L_0x00a6
            r4.close()
        L_0x00a6:
            return
        L_0x00a7:
            rh3.g r0 = new rh3.g     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            r0.<init>()     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            java.lang.String r2 = r12.f297500j     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            java.lang.String r6 = "<set-?>"
            gy3.C87412m.m108594g(r2, r6)     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            r0.f296978c = r2     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            java.lang.String r2 = r12.f297500j     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            r0.mo140866c(r2)     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            boolean r0 = r0.mo140864a()     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            if (r0 == 0) goto L_0x00c4
            r12.mo141083e(r1)     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            goto L_0x0115
        L_0x00c4:
            com.tencent.mm.sticker.loader.StickerLoadInfo r0 = r12.f297495f     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            r0.f284106j = r7     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            r12.mo141083e(r3)     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            goto L_0x0115
        L_0x00cc:
            java.lang.String r0 = r12.f297501n     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            java.lang.String r0 = com.tencent.p014mm.vfs.C86013q1.m106432N(r0)     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            java.lang.String r2 = r12.f297498h     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            r6.<init>()     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            java.lang.String r8 = "download json "
            r6.append(r8)     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            r6.append(r0)     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r6)     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            r2.<init>(r0)     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            java.lang.String r0 = "base_resp"
            org.json.JSONObject r0 = r2.getJSONObject(r0)     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            java.lang.String r2 = "ret"
            int r0 = r0.getInt(r2)     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            r2 = 1206(0x4b6, float:1.69E-42)
            if (r0 == r2) goto L_0x010d
            r2 = 1207(0x4b7, float:1.691E-42)
            if (r0 == r2) goto L_0x0107
            com.tencent.mm.sticker.loader.StickerLoadInfo r0 = r12.f297495f     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            r0.f284106j = r7     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            goto L_0x0112
        L_0x0107:
            com.tencent.mm.sticker.loader.StickerLoadInfo r0 = r12.f297495f     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            r2 = 5
            r0.f284106j = r2     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            goto L_0x0112
        L_0x010d:
            com.tencent.mm.sticker.loader.StickerLoadInfo r0 = r12.f297495f     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            r2 = 4
            r0.f284106j = r2     // Catch:{ Exception -> 0x011e, all -> 0x011b }
        L_0x0112:
            r12.mo141083e(r3)     // Catch:{ Exception -> 0x011e, all -> 0x011b }
        L_0x0115:
            r5.close()
            if (r4 == 0) goto L_0x0148
            goto L_0x0145
        L_0x011b:
            r0 = move-exception
            r2 = r4
            goto L_0x0122
        L_0x011e:
            r0 = move-exception
            r2 = r4
            goto L_0x0126
        L_0x0121:
            r0 = move-exception
        L_0x0122:
            r4 = r2
            r2 = r5
            goto L_0x014a
        L_0x0125:
            r0 = move-exception
        L_0x0126:
            r4 = r2
            r2 = r5
            goto L_0x012e
        L_0x0129:
            r0 = move-exception
            r4 = r2
            goto L_0x014a
        L_0x012c:
            r0 = move-exception
            r4 = r2
        L_0x012e:
            java.lang.String r5 = r12.f297498h     // Catch:{ all -> 0x0149 }
            java.lang.String r6 = ""
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ all -> 0x0149 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r6, r7)     // Catch:{ all -> 0x0149 }
            com.tencent.mm.sticker.loader.StickerLoadInfo r0 = r12.f297495f     // Catch:{ all -> 0x0149 }
            r0.f284106j = r1     // Catch:{ all -> 0x0149 }
            r12.mo141083e(r3)     // Catch:{ all -> 0x0149 }
            if (r2 == 0) goto L_0x0143
            r2.close()
        L_0x0143:
            if (r4 == 0) goto L_0x0148
        L_0x0145:
            r4.close()
        L_0x0148:
            return
        L_0x0149:
            r0 = move-exception
        L_0x014a:
            if (r2 == 0) goto L_0x014f
            r2.close()
        L_0x014f:
            if (r4 == 0) goto L_0x0154
            r4.close()
        L_0x0154:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sh3.C101632l.mo11852a():void");
    }

    /* renamed from: d */
    public String mo11854d() {
        return this.f297499i;
    }

    /* renamed from: e */
    public void mo141083e(boolean z) {
        String str = this.f297498h;
        Log.m105924i(str, "onResult: " + z + ", " + this.f297495f.f284106j);
        super.mo141083e(z);
    }
}
