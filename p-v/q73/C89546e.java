package q73;

import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import gy3.C87412m;
import p1030s6.C90132b;
import z04.C112551y;

/* renamed from: q73.e */
public final class C89546e implements C90132b {
    /* renamed from: a */
    public String mo109801a() {
        return "http";
    }

    public boolean accept(Object obj) {
        C87412m.m108594g(obj, "obj");
        if (!(obj instanceof String)) {
            return false;
        }
        String str = (String) obj;
        return C112551y.m153819s(str, HttpWrapperBase.PROTOCAL_HTTP, false) || C112551y.m153819s(str, HttpWrapperBase.PROTOCAL_HTTPS, false);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:60|(2:61|(1:63)(1:120))|64|(2:66|(1:68))|69|(2:71|(1:73))|74|(2:78|79)|80|81) */
    /* JADX WARNING: Code restructure failed: missing block: B:110:?, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x028e, code lost:
        r15.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0120, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0121, code lost:
        r16 = r9;
        r2 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0235, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0239, code lost:
        r16 = r9;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:80:0x0215 */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0289 A[SYNTHETIC, Splitter:B:109:0x0289] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x028e A[Catch:{ Exception -> 0x0291 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0235 A[ExcHandler: all (th java.lang.Throwable), PHI: r14 r15 
      PHI: (r14v7 java.io.OutputStream) = (r14v1 java.io.OutputStream), (r14v9 java.io.OutputStream), (r14v9 java.io.OutputStream), (r14v1 java.io.OutputStream), (r14v1 java.io.OutputStream), (r14v1 java.io.OutputStream), (r14v1 java.io.OutputStream), (r14v1 java.io.OutputStream), (r14v1 java.io.OutputStream), (r14v1 java.io.OutputStream) binds: [B:13:0x00ba, B:80:0x0215, B:81:?, B:52:0x0148, B:43:0x012a, B:44:?, B:24:0x00fe, B:25:?, B:36:0x011c, B:37:?] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r15v7 java.io.InputStream) = (r15v1 java.io.InputStream), (r15v8 java.io.InputStream), (r15v8 java.io.InputStream), (r15v1 java.io.InputStream), (r15v1 java.io.InputStream), (r15v1 java.io.InputStream), (r15v1 java.io.InputStream), (r15v1 java.io.InputStream), (r15v1 java.io.InputStream), (r15v1 java.io.InputStream) binds: [B:13:0x00ba, B:80:0x0215, B:81:?, B:52:0x0148, B:43:0x012a, B:44:?, B:24:0x00fe, B:25:?, B:36:0x011c, B:37:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:13:0x00ba] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p1030s6.C90132b.C90133a mo109803b(java.lang.Object r20, com.github.henryye.nativeiv.ImageDecodeConfig r21) {
        /*
            r19 = this;
            r0 = r20
            java.lang.String r1 = ".tmp"
            java.lang.String r2 = "obj"
            gy3.C87412m.m108594g(r0, r2)
            java.lang.String r2 = "config"
            r3 = r21
            gy3.C87412m.m108594g(r3, r2)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            s6.b$a r3 = new s6.b$a
            r3.<init>()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            q73.c0 r5 = q73.C35796c0.f95588a
            java.lang.String r5 = r5.mo60410l()
            r4.append(r5)
            java.lang.String r5 = "pic_"
            r4.append(r5)
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r2)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "fetch "
            r6.append(r7)
            r6.append(r0)
            r0 = 32
            r6.append(r0)
            r6.append(r4)
            java.lang.String r0 = " fileExist="
            r6.append(r0)
            r6.append(r5)
            java.lang.String r0 = r6.toString()
            java.lang.String r6 = "MicroMsg.WebCanvasHttpImageStreamFetcher"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            java.lang.String r7 = "format(format, *args)"
            java.lang.String r8 = "getContext().getString(c…_stream_error_http_inner)"
            r9 = 2131839958(0x7f114bd6, float:1.9313182E38)
            java.lang.String r10 = "fetch"
            r11 = 1
            r12 = 0
            if (r5 == 0) goto L_0x00a7
            java.lang.String r0 = "read from cache file"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r0)     // Catch:{ Exception -> 0x0080 }
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x0080 }
            java.io.InputStream r1 = com.tencent.p014mm.vfs.C86013q1.m106423E(r4)     // Catch:{ Exception -> 0x0080 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0080 }
            r3.f258828a = r0     // Catch:{ Exception -> 0x0080 }
            goto L_0x00a6
        L_0x0080:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r12]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r10, r1)
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r1 = r1.getString(r9)
            gy3.C87412m.m108593f(r1, r8)
            java.lang.Object[] r2 = new java.lang.Object[r11]
            java.lang.String r0 = r0.toString()
            r2[r12] = r0
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r11)
            java.lang.String r0 = java.lang.String.format(r1, r0)
            gy3.C87412m.m108593f(r0, r7)
            r3.f258829b = r0
        L_0x00a6:
            return r3
        L_0x00a7:
            gy3.d0 r5 = new gy3.d0
            r5.<init>()
            r13 = 0
            r14 = r13
            r15 = r14
            r16 = r15
            r0 = 0
        L_0x00b2:
            if (r0 != 0) goto L_0x0292
            com.tencent.mm.network.d0 r9 = com.tencent.p014mm.network.C81035d.m98964e(r2, r13)     // Catch:{ Exception -> 0x0241 }
            r0 = 1500(0x5dc, float:2.102E-42)
            r9.f238062r = r0     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            r9.f238054j = r11     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            java.lang.String r0 = "GET"
            r9.f238053i = r0     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            r0 = 30000(0x7530, float:4.2039E-41)
            r9.f238049e = r0     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            r9.f238050f = r0     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            int r0 = r9.mo112916a()     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            r13.<init>()     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            java.lang.String r12 = "fetch response code = "
            r13.append(r12)     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            r13.append(r0)     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            java.lang.String r12 = r13.toString()     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r12)     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            int r12 = r5.f27483d     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            r13 = 15
            if (r12 >= r13) goto L_0x00f0
            r12 = 301(0x12d, float:4.22E-43)
            if (r0 == r12) goto L_0x00ee
            r12 = 302(0x12e, float:4.23E-43)
            if (r0 != r12) goto L_0x00f0
        L_0x00ee:
            r12 = 1
            goto L_0x00f1
        L_0x00f0:
            r12 = 0
        L_0x00f1:
            if (r12 == 0) goto L_0x0126
            java.lang.String r0 = "location"
            java.lang.String r12 = r9.mo112922f(r0)     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            java.lang.String r0 = "httpCon.getHeaderField(\"location\")"
            gy3.C87412m.m108593f(r12, r0)     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            int r0 = r5.f27483d     // Catch:{ Exception -> 0x0120, all -> 0x0235 }
            int r0 = r0 + r11
            r5.f27483d = r0     // Catch:{ Exception -> 0x0120, all -> 0x0235 }
            if (r0 >= r13) goto L_0x011b
            if (r14 == 0) goto L_0x010d
            r14.close()     // Catch:{ Exception -> 0x010b }
            goto L_0x010d
        L_0x010b:
            goto L_0x0112
        L_0x010d:
            if (r15 == 0) goto L_0x0112
            r15.close()     // Catch:{ Exception -> 0x010b }
        L_0x0112:
            r16 = r9
            r2 = r12
            r0 = 0
            r9 = 2131839958(0x7f114bd6, float:1.9313182E38)
            goto L_0x0283
        L_0x011b:
            r2 = 0
            r5.f27483d = r2     // Catch:{ Exception -> 0x0120, all -> 0x0235 }
            r2 = r12
            goto L_0x014f
        L_0x0120:
            r0 = move-exception
            r16 = r9
            r2 = r12
            goto L_0x0242
        L_0x0126:
            r12 = 200(0xc8, float:2.8E-43)
            if (r0 == r12) goto L_0x0148
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            r12.<init>()     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            java.lang.String r13 = "invalid response "
            r12.append(r13)     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            r12.append(r0)     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            java.lang.String r0 = r12.toString()     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            r3.f258829b = r0     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            if (r14 == 0) goto L_0x0142
            r14.close()     // Catch:{ Exception -> 0x0147 }
        L_0x0142:
            if (r15 == 0) goto L_0x0147
            r15.close()     // Catch:{ Exception -> 0x0147 }
        L_0x0147:
            return r3
        L_0x0148:
            java.io.InputStream r15 = r9.getInputStream()     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            r12 = 0
            r5.f27483d = r12     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
        L_0x014f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            r0.<init>()     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            java.lang.String r12 = "read check: is = "
            r0.append(r12)     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            if (r15 != 0) goto L_0x015e
            r12 = 1
            goto L_0x015f
        L_0x015e:
            r12 = 0
        L_0x015f:
            r0.append(r12)     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            java.lang.String r12 = ", stop = "
            r0.append(r12)     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            r0.append(r11)     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            if (r15 == 0) goto L_0x0225
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            r12.<init>()     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            r12.append(r4)     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            r12.append(r1)     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            r13 = 0
            java.io.OutputStream r14 = com.tencent.p014mm.vfs.C86013q1.m106429K(r12, r13)     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
        L_0x018b:
            int r12 = r15.read(r0)     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            r13 = -1
            if (r12 == r13) goto L_0x0197
            r13 = 0
            r14.write(r0, r13, r12)     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            goto L_0x018b
        L_0x0197:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            r0.<init>()     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            r0.append(r4)     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            r0.append(r1)     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            android.net.Uri r0 = com.tencent.p014mm.vfs.C116299g2.m163858n(r0)     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            java.lang.String r12 = r0.getPath()     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            if (r12 == 0) goto L_0x01cb
            r13 = 0
            java.lang.String r12 = com.tencent.p014mm.vfs.C116299g2.m163855k(r12, r13, r13)     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            java.lang.String r13 = r0.getPath()     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            boolean r13 = r13.equals(r12)     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            if (r13 != 0) goto L_0x01cb
            android.net.Uri$Builder r0 = r0.buildUpon()     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            android.net.Uri$Builder r0 = r0.path(r12)     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            android.net.Uri r0 = r0.build()     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
        L_0x01cb:
            android.net.Uri r12 = com.tencent.p014mm.vfs.C116299g2.m163858n(r4)     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            java.lang.String r13 = r12.getPath()     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            if (r13 == 0) goto L_0x01f0
            r11 = 0
            java.lang.String r13 = com.tencent.p014mm.vfs.C116299g2.m163855k(r13, r11, r11)     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            java.lang.String r11 = r12.getPath()     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            boolean r11 = r11.equals(r13)     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            if (r11 != 0) goto L_0x01f0
            android.net.Uri$Builder r11 = r12.buildUpon()     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            android.net.Uri$Builder r11 = r11.path(r13)     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            android.net.Uri r12 = r11.build()     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
        L_0x01f0:
            com.tencent.mm.vfs.f0 r11 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            r13 = 0
            com.tencent.mm.vfs.f0$h r0 = r11.mo177799l(r0, r13)     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            com.tencent.mm.vfs.f0 r11 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            com.tencent.mm.vfs.f0$h r11 = r11.mo177799l(r12, r13)     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            boolean r12 = r0.mo177810a()     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            if (r12 == 0) goto L_0x0215
            boolean r12 = r11.mo177810a()     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            if (r12 != 0) goto L_0x020a
            goto L_0x0215
        L_0x020a:
            com.tencent.mm.vfs.FileSystem$c r12 = r11.f348991a     // Catch:{ IOException -> 0x0215 }
            java.lang.String r11 = r11.f348992b     // Catch:{ IOException -> 0x0215 }
            com.tencent.mm.vfs.FileSystem$c r13 = r0.f348991a     // Catch:{ IOException -> 0x0215 }
            java.lang.String r0 = r0.f348992b     // Catch:{ IOException -> 0x0215 }
            r12.mo119946t(r11, r13, r0)     // Catch:{ IOException -> 0x0215 }
        L_0x0215:
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            java.io.InputStream r11 = com.tencent.p014mm.vfs.C86013q1.m106423E(r4)     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            r0.<init>(r11)     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            r3.f258828a = r0     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            java.lang.String r0 = "download file finish"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
        L_0x0225:
            if (r14 == 0) goto L_0x022d
            r14.close()     // Catch:{ Exception -> 0x022b }
            goto L_0x022d
        L_0x022b:
            goto L_0x0232
        L_0x022d:
            if (r15 == 0) goto L_0x0232
            r15.close()     // Catch:{ Exception -> 0x022b }
        L_0x0232:
            r16 = r9
            goto L_0x027e
        L_0x0235:
            r0 = move-exception
            goto L_0x0239
        L_0x0237:
            r0 = move-exception
            goto L_0x023c
        L_0x0239:
            r16 = r9
            goto L_0x0287
        L_0x023c:
            r16 = r9
            goto L_0x0242
        L_0x023f:
            r0 = move-exception
            goto L_0x0287
        L_0x0241:
            r0 = move-exception
        L_0x0242:
            r9 = 0
            r5.f27483d = r9     // Catch:{ all -> 0x023f }
            android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x023f }
            r11 = 2131839958(0x7f114bd6, float:1.9313182E38)
            java.lang.String r9 = r9.getString(r11)     // Catch:{ all -> 0x023f }
            gy3.C87412m.m108593f(r9, r8)     // Catch:{ all -> 0x023f }
            r12 = 1
            java.lang.Object[] r13 = new java.lang.Object[r12]     // Catch:{ all -> 0x023f }
            java.lang.String r18 = r0.toString()     // Catch:{ all -> 0x023f }
            r17 = 0
            r13[r17] = r18     // Catch:{ all -> 0x023f }
            java.lang.Object[] r13 = java.util.Arrays.copyOf(r13, r12)     // Catch:{ all -> 0x023f }
            java.lang.String r9 = java.lang.String.format(r9, r13)     // Catch:{ all -> 0x023f }
            gy3.C87412m.m108593f(r9, r7)     // Catch:{ all -> 0x023f }
            r3.f258829b = r9     // Catch:{ all -> 0x023f }
            r9 = 0
            java.lang.Object[] r13 = new java.lang.Object[r9]     // Catch:{ all -> 0x023f }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r10, r13)     // Catch:{ all -> 0x023f }
            if (r14 == 0) goto L_0x0279
            r14.close()     // Catch:{ Exception -> 0x0277 }
            goto L_0x0279
        L_0x0277:
            goto L_0x027e
        L_0x0279:
            if (r15 == 0) goto L_0x027e
            r15.close()     // Catch:{ Exception -> 0x0277 }
        L_0x027e:
            r0 = 1
            r9 = 2131839958(0x7f114bd6, float:1.9313182E38)
            r11 = 1
        L_0x0283:
            r12 = 0
            r13 = 0
            goto L_0x00b2
        L_0x0287:
            if (r14 == 0) goto L_0x028c
            r14.close()     // Catch:{ Exception -> 0x0291 }
        L_0x028c:
            if (r15 == 0) goto L_0x0291
            r15.close()     // Catch:{ Exception -> 0x0291 }
        L_0x0291:
            throw r0
        L_0x0292:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: q73.C89546e.mo109803b(java.lang.Object, com.github.henryye.nativeiv.ImageDecodeConfig):s6.b$a");
    }
}
