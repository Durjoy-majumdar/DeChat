package p551hq;

import android.content.res.AssetManager;
import com.tencent.p014mm.plugin.expansions.C85175k;
import com.tencent.p014mm.plugin.expansions.C85176l;
import com.tencent.p014mm.plugin.expansions.C85177m;
import com.tencent.p014mm.plugin.expansions.C85178q;
import di3.C86301e;
import ei3.C86522b;
import fy3.C32226l;
import gy3.C87412m;
import java.util.concurrent.Future;
import p564iq.C87789a;
import p564iq.C87790d;
import p564iq.C98782c;
import rx3.C13598b0;

@C86522b
/* renamed from: hq.a */
public final class C87582a extends C86301e implements C87790d {
    /* renamed from: Cp */
    public AssetManager mo122028Cp() {
        return C85178q.m105044h();
    }

    /* renamed from: Ey */
    public void mo122029Ey() {
        C85178q.m105037a();
    }

    /* renamed from: Fy */
    public void mo122030Fy(String str) {
        C85178q.m105046j(str);
    }

    /* renamed from: GY */
    public void mo122031GY(C32226l<? super C98782c, C13598b0> lVar) {
        C85177m mVar = new C85177m();
        if (lVar != null) {
            lVar.invoke(mVar);
        }
        if (mVar.f248170b != null) {
            C85178q.m105038b(new C85175k(mVar));
        } else {
            C85178q.m105040d(new C85176l(mVar));
        }
    }

    public boolean Jw0(String str) {
        C87412m.m108594g(str, "module");
        byte[] bArr = C85178q.f248171a;
        return false;
    }

    /* renamed from: Ka */
    public boolean mo122033Ka(boolean z) {
        return C85178q.m105043g(z);
    }

    /* renamed from: R0 */
    public boolean mo122034R0(String str) {
        C87412m.m108594g(str, "libName");
        return C85178q.m105045i(str);
    }

    public boolean W90() {
        byte[] bArr = C85178q.f248171a;
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.io.InputStream} */
    /* JADX WARNING: type inference failed for: r8v2, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r8v4, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* JADX WARNING: type inference failed for: r8v7 */
    /* JADX WARNING: type inference failed for: r8v8 */
    /* JADX WARNING: type inference failed for: r8v11 */
    /* JADX WARNING: type inference failed for: r2v9, types: [java.io.OutputStream, java.io.BufferedOutputStream] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0067 A[SYNTHETIC, Splitter:B:39:0x0067] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0073 A[SYNTHETIC, Splitter:B:44:0x0073] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0082 A[SYNTHETIC, Splitter:B:51:0x0082] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x008e A[SYNTHETIC, Splitter:B:56:0x008e] */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: Xk */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo122036Xk(android.content.res.AssetManager r7, java.lang.String r8, java.io.File r9) {
        /*
            r6 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "MicroMsg.exp.Expansions"
            boolean r2 = android.text.TextUtils.isEmpty(r8)
            if (r2 != 0) goto L_0x0099
            si3.C90200b.m112896a(r9)
            r2 = 0
            r3 = 0
            java.io.InputStream r7 = r7.open(r8)     // Catch:{ IOException -> 0x005c, all -> 0x0059 }
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0054, all -> 0x004f }
            r8.<init>(r9)     // Catch:{ IOException -> 0x0054, all -> 0x004f }
            java.io.FileDescriptor r9 = r8.getFD()     // Catch:{ IOException -> 0x004d, all -> 0x004b }
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x004d, all -> 0x004b }
            r2.<init>(r8)     // Catch:{ IOException -> 0x004d, all -> 0x004b }
            r8 = 16384(0x4000, float:2.2959E-41)
            byte[] r8 = new byte[r8]     // Catch:{ IOException -> 0x0054, all -> 0x004f }
        L_0x0025:
            r4 = -1
            int r5 = r7.read(r8)     // Catch:{ IOException -> 0x0054, all -> 0x004f }
            if (r4 == r5) goto L_0x0030
            r2.write(r8, r3, r5)     // Catch:{ IOException -> 0x0054, all -> 0x004f }
            goto L_0x0025
        L_0x0030:
            r2.flush()     // Catch:{ IOException -> 0x0054, all -> 0x004f }
            r9.sync()     // Catch:{ IOException -> 0x0054, all -> 0x004f }
            r7.close()     // Catch:{ IOException -> 0x003a }
            goto L_0x0040
        L_0x003a:
            r7 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r7, r0, r8)
        L_0x0040:
            r2.close()     // Catch:{ IOException -> 0x0044 }
            goto L_0x007d
        L_0x0044:
            r7 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r7, r0, r8)
            goto L_0x007d
        L_0x004b:
            r9 = move-exception
            goto L_0x0052
        L_0x004d:
            r9 = move-exception
            goto L_0x0057
        L_0x004f:
            r8 = move-exception
            r9 = r8
            r8 = r2
        L_0x0052:
            r2 = r7
            goto L_0x0080
        L_0x0054:
            r8 = move-exception
            r9 = r8
            r8 = r2
        L_0x0057:
            r2 = r7
            goto L_0x005e
        L_0x0059:
            r9 = move-exception
            r8 = r2
            goto L_0x0080
        L_0x005c:
            r9 = move-exception
            r8 = r2
        L_0x005e:
            java.lang.String r7 = android.util.Log.getStackTraceString(r9)     // Catch:{ all -> 0x007e }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r7)     // Catch:{ all -> 0x007e }
            if (r2 == 0) goto L_0x0071
            r2.close()     // Catch:{ IOException -> 0x006b }
            goto L_0x0071
        L_0x006b:
            r7 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r7, r0, r9)
        L_0x0071:
            if (r8 == 0) goto L_0x007d
            r8.close()     // Catch:{ IOException -> 0x0077 }
            goto L_0x007d
        L_0x0077:
            r7 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r7, r0, r8)
        L_0x007d:
            return
        L_0x007e:
            r7 = move-exception
            r9 = r7
        L_0x0080:
            if (r2 == 0) goto L_0x008c
            r2.close()     // Catch:{ IOException -> 0x0086 }
            goto L_0x008c
        L_0x0086:
            r7 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r7, r0, r2)
        L_0x008c:
            if (r8 == 0) goto L_0x0098
            r8.close()     // Catch:{ IOException -> 0x0092 }
            goto L_0x0098
        L_0x0092:
            r7 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r7, r0, r8)
        L_0x0098:
            throw r9
        L_0x0099:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "Asset path is empty."
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p551hq.C87582a.mo122036Xk(android.content.res.AssetManager, java.lang.String, java.io.File):void");
    }

    /* renamed from: ZY */
    public boolean mo122037ZY(String str) {
        C87412m.m108594g(str, "module");
        byte[] bArr = C85178q.f248171a;
        return false;
    }

    public String getLastObbErrorInfo() {
        return C85178q.m105039c();
    }

    public String getObbInfo() {
        byte[] bArr = C85178q.f248171a;
        return null;
    }

    public boolean isInstalled(String str) {
        C87412m.m108594g(str, "module");
        byte[] bArr = C85178q.f248171a;
        return true;
    }

    public boolean needObbRes() {
        byte[] bArr = C85178q.f248171a;
        return false;
    }

    public Future<?> nx0(C87790d.C33382a aVar) {
        return C85178q.m105040d(aVar);
    }

    public Future<?> vr0(C87789a aVar) {
        return C85178q.m105038b(aVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006d A[SYNTHETIC, Splitter:B:28:0x006d] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007b A[SYNTHETIC, Splitter:B:35:0x007b] */
    /* renamed from: xY */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo122044xY(android.content.res.AssetManager r10, java.lang.String r11) {
        /*
            r9 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "MicroMsg.exp.Expansions"
            boolean r2 = android.text.TextUtils.isEmpty(r11)
            r3 = 0
            if (r2 == 0) goto L_0x000d
            goto L_0x0077
        L_0x000d:
            r2 = 0
            java.io.InputStream r10 = r10.open(r11)     // Catch:{ Exception -> 0x0062, all -> 0x0060 }
            java.lang.String r11 = "MD5"
            java.security.MessageDigest r11 = java.security.MessageDigest.getInstance(r11)     // Catch:{ Exception -> 0x005e }
            r4 = 2048(0x800, float:2.87E-42)
            byte[] r4 = new byte[r4]     // Catch:{ Exception -> 0x005e }
        L_0x001c:
            int r5 = r10.read(r4)     // Catch:{ Exception -> 0x005e }
            if (r5 < 0) goto L_0x0026
            r11.update(r4, r2, r5)     // Catch:{ Exception -> 0x005e }
            goto L_0x001c
        L_0x0026:
            byte[] r11 = r11.digest()     // Catch:{ Exception -> 0x005e }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x005e }
            r5 = 32
            r4.<init>(r5)     // Catch:{ Exception -> 0x005e }
            int r5 = r11.length     // Catch:{ Exception -> 0x005e }
            r6 = 0
        L_0x0033:
            if (r6 >= r5) goto L_0x004c
            byte r7 = r11[r6]     // Catch:{ Exception -> 0x005e }
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 + 256
            r8 = 16
            java.lang.String r7 = java.lang.Integer.toString(r7, r8)     // Catch:{ Exception -> 0x005e }
            r8 = 1
            java.lang.String r7 = r7.substring(r8)     // Catch:{ Exception -> 0x005e }
            r4.append(r7)     // Catch:{ Exception -> 0x005e }
            int r6 = r6 + 1
            goto L_0x0033
        L_0x004c:
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x005e }
            r10.close()     // Catch:{ IOException -> 0x0054 }
            goto L_0x0077
        L_0x0054:
            r10 = move-exception
            java.lang.Object[] r11 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r10, r0, r11)
            goto L_0x0077
        L_0x005b:
            r11 = move-exception
            r3 = r10
            goto L_0x0078
        L_0x005e:
            r11 = move-exception
            goto L_0x0064
        L_0x0060:
            r10 = move-exception
            goto L_0x0079
        L_0x0062:
            r11 = move-exception
            r10 = r3
        L_0x0064:
            java.lang.String r11 = android.util.Log.getStackTraceString(r11)     // Catch:{ all -> 0x005b }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r11)     // Catch:{ all -> 0x005b }
            if (r10 == 0) goto L_0x0077
            r10.close()     // Catch:{ IOException -> 0x0071 }
            goto L_0x0077
        L_0x0071:
            r10 = move-exception
            java.lang.Object[] r11 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r10, r0, r11)
        L_0x0077:
            return r3
        L_0x0078:
            r10 = r11
        L_0x0079:
            if (r3 == 0) goto L_0x0085
            r3.close()     // Catch:{ IOException -> 0x007f }
            goto L_0x0085
        L_0x007f:
            r11 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r11, r0, r2)
        L_0x0085:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p551hq.C87582a.mo122044xY(android.content.res.AssetManager, java.lang.String):java.lang.String");
    }
}
