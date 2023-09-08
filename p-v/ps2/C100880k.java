package ps2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: ps2.k */
public class C100880k extends C100864f {

    /* renamed from: f */
    public C100881a f295424f;

    /* renamed from: g */
    public String f295425g;

    /* renamed from: ps2.k$a */
    public interface C100881a {
        /* renamed from: a */
        void mo76113a();

        /* renamed from: b */
        void mo76114b();

        /* renamed from: c */
        void mo76115c(String str);
    }

    public C100880k(String str, String str2, boolean z, int i, int i2, C100881a aVar) {
        this.f295394a = str;
        this.f295395b = str2;
        this.f295425g = str2 + "_tmp";
        this.f295396c = z;
        this.f295397d = i;
        this.f295398e = i2;
        this.f295424f = aVar;
        Log.m105924i("MicroMsg.AdLandingPageDownloadSmallFileTask", "add downloadTask, url=" + str);
    }

    /* renamed from: a */
    public final int mo140348a() {
        SnsMethodCalculate.markStartTimeMs("getMediaType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadSmallFileTask");
        int i = this.f295397d;
        if (i == 41) {
            SnsMethodCalculate.markEndTimeMs("getMediaType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadSmallFileTask");
            return 1;
        } else if (i == 133) {
            SnsMethodCalculate.markEndTimeMs("getMediaType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadSmallFileTask");
            return 1;
        } else if (i == 1000000001) {
            SnsMethodCalculate.markEndTimeMs("getMediaType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadSmallFileTask");
            return 1;
        } else if (i == 44) {
            SnsMethodCalculate.markEndTimeMs("getMediaType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadSmallFileTask");
            return 1;
        } else if (i == 45) {
            SnsMethodCalculate.markEndTimeMs("getMediaType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadSmallFileTask");
            return 1;
        } else if (i == 61) {
            SnsMethodCalculate.markEndTimeMs("getMediaType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadSmallFileTask");
            return 2;
        } else if (i != 62) {
            SnsMethodCalculate.markEndTimeMs("getMediaType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadSmallFileTask");
            return 0;
        } else {
            SnsMethodCalculate.markEndTimeMs("getMediaType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadSmallFileTask");
            return 3;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v28, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v9, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r25v0, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r0v69, types: [java.net.URLConnection] */
    /* JADX WARNING: type inference failed for: r25v11 */
    /* JADX WARNING: type inference failed for: r25v12 */
    /* JADX WARNING: type inference failed for: r25v15 */
    /* JADX WARNING: Can't wrap try/catch for region: R(10:160|73|(2:75|76)|77|78|79|82|83|84|87) */
    /* JADX WARNING: Can't wrap try/catch for region: R(15:117|118|119|120|121|122|123|(0)|(0)|129|130|(0)|135|136|137) */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0655, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0656, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.AdLandingPageDownloadSmallFileTask", r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x025f, code lost:
        if (r4 == null) goto L_0x0264;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0264, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r7.getInputStream().close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x026f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0270, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.AdLandingPageDownloadSmallFileTask", r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0277, code lost:
        r7.disconnect();
        r0 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String(r1.f295394a);
        r2 = mo140348a();
        r5 = (int) com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r19);
        r4 = new ad0.C0033t();
        r4.mo32a("20UrlMd5", r0 + ",");
        r4.mo32a("21MediaType", r2 + ",");
        r4.mo32a("22IsPreload", r1.f295396c + ",");
        r4.mo32a("23CostTime", r5 + ",");
        r4.mo32a("24RetCode", r3 + ",");
        r4.mo32a(r9, r1.f295398e + ",");
        r4.mo32a(r27, r28 + ",");
        r4.mo32a(r26, (r19 / 1000) + ",");
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.AdLandingPageDownloadSmallFileTask", r24 + r4.mo34c());
        com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE.mo160131h(13572, r4);
        r2 = r21;
        r3 = r25;
        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x03cd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x03ce, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.AdLandingPageDownloadSmallFileTask", r0.getMessage());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:129:0x064d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:152:0x0762 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:58:0x0267 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:78:0x03c5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0645 A[SYNTHETIC, Splitter:B:125:0x0645] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x064a A[Catch:{ IOException -> 0x064d }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x065f  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x075a A[SYNTHETIC, Splitter:B:148:0x075a] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x075f A[Catch:{ IOException -> 0x0762 }] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0774  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object doInBackground(java.lang.Object[] r39) {
        /*
            r38 = this;
            r1 = r38
            java.lang.String r2 = "doInBackground"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadSmallFileTask"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            r0 = r39
            java.lang.Void[] r0 = (java.lang.Void[]) r0
            java.lang.String r4 = ", netType="
            java.lang.String r5 = "httpRetCode="
            java.lang.String r6 = "report logbuffer MM_KVSTAT_AdDownload(13572): "
            java.lang.String r7 = "27StartDownloadTime"
            java.lang.String r8 = "26Size"
            java.lang.String r9 = "25Scene"
            java.lang.String r10 = "24RetCode"
            java.lang.String r11 = "23CostTime"
            java.lang.String r12 = "22IsPreload"
            java.lang.String r13 = "21MediaType"
            java.lang.String r14 = "20UrlMd5"
            java.lang.String r15 = ","
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            java.lang.String r0 = r1.f295395b
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            r16 = 0
            r39 = r6
            java.lang.String r6 = "MicroMsg.AdLandingPageDownloadSmallFileTask"
            if (r0 == 0) goto L_0x0042
            java.lang.String r0 = "file already exists"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            r5 = r3
            goto L_0x0733
        L_0x0042:
            java.lang.String r0 = r1.f295425g
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r0 == 0) goto L_0x0073
            java.lang.String r0 = r1.f295425g
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106447h(r0)
            r17 = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r18 = r3
            java.lang.String r3 = "delete old tmpFile, path="
            r2.append(r3)
            java.lang.String r3 = r1.f295425g
            r2.append(r3)
            java.lang.String r3 = ", ret="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r0)
            goto L_0x0077
        L_0x0073:
            r17 = r2
            r18 = r3
        L_0x0077:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.getFormatedNetType(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "downloadTask start, netType="
            r0.append(r3)
            r0.append(r2)
            java.lang.String r3 = ", url="
            r0.append(r3)
            java.lang.String r3 = r1.f295394a
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            long r19 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            java.lang.String r0 = r1.f295395b
            java.lang.String r3 = "/"
            int r3 = r0.lastIndexOf(r3)
            r21 = r7
            r7 = 0
            java.lang.String r0 = r0.substring(r7, r3)
            com.tencent.p014mm.vfs.C86013q1.m106461v(r0)
            ps2.k$a r0 = r1.f295424f
            r0.mo76114b()
            r22 = 1000(0x3e8, double:4.94E-321)
            java.net.URL r0 = new java.net.URL     // Catch:{ all -> 0x05d8 }
            java.lang.String r7 = r1.f295394a     // Catch:{ all -> 0x05d8 }
            r0.<init>(r7)     // Catch:{ all -> 0x05d8 }
            java.net.URLConnection r0 = r0.openConnection()     // Catch:{ all -> 0x05d8 }
            r7 = r0
            java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch:{ all -> 0x05d8 }
            r0 = 10000(0x2710, float:1.4013E-41)
            r7.setConnectTimeout(r0)     // Catch:{ all -> 0x05bf }
            r7.setReadTimeout(r0)     // Catch:{ all -> 0x05bf }
            r7.connect()     // Catch:{ all -> 0x05bf }
            int r3 = r7.getResponseCode()     // Catch:{ all -> 0x05bf }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x059d }
            r0.<init>()     // Catch:{ all -> 0x059d }
            r24 = r8
            java.lang.String r8 = "downloadTask retCode="
            r0.append(r8)     // Catch:{ all -> 0x0582 }
            r0.append(r3)     // Catch:{ all -> 0x0582 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0582 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)     // Catch:{ all -> 0x0582 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r3 == r0) goto L_0x021e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fa }
            r0.<init>()     // Catch:{ all -> 0x01fa }
            r0.append(r5)     // Catch:{ all -> 0x01fa }
            int r8 = r7.getResponseCode()     // Catch:{ all -> 0x01fa }
            r0.append(r8)     // Catch:{ all -> 0x01fa }
            r0.append(r4)     // Catch:{ all -> 0x01fa }
            r0.append(r2)     // Catch:{ all -> 0x01fa }
            java.lang.String r8 = ", msg="
            r0.append(r8)     // Catch:{ all -> 0x01fa }
            java.lang.String r8 = r7.getResponseMessage()     // Catch:{ all -> 0x01fa }
            r0.append(r8)     // Catch:{ all -> 0x01fa }
            java.lang.String r16 = r0.toString()     // Catch:{ all -> 0x01fa }
            java.io.InputStream r0 = r7.getInputStream()     // Catch:{ Exception -> 0x011e }
            r0.close()     // Catch:{ Exception -> 0x011e }
            goto L_0x0126
        L_0x011e:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
        L_0x0126:
            r7.disconnect()
            java.lang.String r0 = r1.f295394a
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r0)
            int r2 = r38.mo140348a()
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r19)
            int r5 = (int) r4
            ad0.t r4 = new ad0.t
            r4.<init>()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            r7.append(r15)
            java.lang.String r0 = r7.toString()
            r4.mo32a(r14, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r4.mo32a(r13, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r2 = r1.f295396c
            r0.append(r2)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r4.mo32a(r12, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r4.mo32a(r11, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r4.mo32a(r10, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r2 = r1.f295398e
            r0.append(r2)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r4.mo32a(r9, r0)
            java.lang.String r0 = "0,"
            r8 = r24
            r4.mo32a(r8, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r2 = r19 / r22
            r0.append(r2)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r2 = r21
            r4.mo32a(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r2 = r39
            r0.append(r2)
            java.lang.String r2 = r4.mo34c()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r3 = 13572(0x3504, float:1.9018E-41)
            r0.mo160131h(r3, r2)
            r3 = r17
            r2 = r18
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r2)
        L_0x01f6:
            r5 = r2
            r2 = r3
            goto L_0x0733
        L_0x01fa:
            r0 = move-exception
            r25 = r17
            r8 = r24
            r17 = r4
            r4 = r21
            r34 = r2
            r2 = r39
            r39 = r34
            r35 = r18
            r18 = r5
            r5 = r35
            r21 = r3
            r3 = r4
            r4 = r5
            r24 = r16
            r5 = r25
            r34 = r9
            r9 = r8
            r8 = r34
            goto L_0x05ba
        L_0x021e:
            r25 = r17
            r8 = r24
            r17 = r4
            r4 = r21
            r34 = r2
            r2 = r39
            r39 = r34
            r35 = r18
            r18 = r5
            r5 = r35
            r7.getContentLength()     // Catch:{ all -> 0x0575 }
            r21 = r5
            java.io.InputStream r5 = r7.getInputStream()     // Catch:{ all -> 0x0563 }
            java.lang.String r0 = r1.f295425g     // Catch:{ all -> 0x054a }
            r24 = r2
            r26 = r4
            r2 = 0
            java.io.OutputStream r4 = com.tencent.p014mm.vfs.C86013q1.m106429K(r0, r2)     // Catch:{ all -> 0x0535 }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x051e }
            r27 = r8
            r2 = 0
        L_0x024d:
            int r8 = r5.read(r0)     // Catch:{ all -> 0x0500 }
            r28 = r2
            r2 = -1
            if (r8 == r2) goto L_0x03af
            boolean r2 = r38.isCancelled()     // Catch:{ all -> 0x038b }
            if (r2 == 0) goto L_0x0368
            r5.close()     // Catch:{ all -> 0x0358 }
            if (r4 == 0) goto L_0x0264
            r4.close()     // Catch:{ IOException -> 0x0267 }
        L_0x0264:
            r5.close()     // Catch:{ IOException -> 0x0267 }
        L_0x0267:
            java.io.InputStream r0 = r7.getInputStream()     // Catch:{ Exception -> 0x026f }
            r0.close()     // Catch:{ Exception -> 0x026f }
            goto L_0x0277
        L_0x026f:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
        L_0x0277:
            r7.disconnect()
            java.lang.String r0 = r1.f295394a
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r0)
            int r2 = r38.mo140348a()
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r19)
            int r5 = (int) r4
            ad0.t r4 = new ad0.t
            r4.<init>()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            r7.append(r15)
            java.lang.String r0 = r7.toString()
            r4.mo32a(r14, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r4.mo32a(r13, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r2 = r1.f295396c
            r0.append(r2)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r4.mo32a(r12, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r4.mo32a(r11, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r4.mo32a(r10, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r2 = r1.f295398e
            r0.append(r2)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r4.mo32a(r9, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r2 = r28
            r0.append(r2)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r8 = r27
            r4.mo32a(r8, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r2 = r19 / r22
            r0.append(r2)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r2 = r26
            r4.mo32a(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r2 = r24
            r0.append(r2)
            java.lang.String r2 = r4.mo34c()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r3 = 13572(0x3504, float:1.9018E-41)
            r0.mo160131h(r3, r2)
            r2 = r21
            r3 = r25
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r2)
            goto L_0x01f6
        L_0x0358:
            r0 = move-exception
            r31 = r21
            r29 = r24
            r32 = r25
            r30 = r26
            r2 = r28
            r21 = r9
            r33 = r27
            goto L_0x039a
        L_0x0368:
            r31 = r21
            r29 = r24
            r32 = r25
            r30 = r26
            r33 = r27
            r2 = r28
            r21 = r9
            r9 = 0
            r4.write(r0, r9, r8)     // Catch:{ all -> 0x0389 }
            int r2 = r2 + r8
            r9 = r21
            r24 = r29
            r26 = r30
            r21 = r31
            r25 = r32
            r27 = r33
            goto L_0x024d
        L_0x0389:
            r0 = move-exception
            goto L_0x039a
        L_0x038b:
            r0 = move-exception
            r31 = r21
            r29 = r24
            r32 = r25
            r30 = r26
            r33 = r27
            r2 = r28
            r21 = r9
        L_0x039a:
            r24 = r4
            r25 = r5
            r16 = r7
            r8 = r21
            r5 = r32
            r9 = r33
            r7 = r2
            r21 = r3
            r2 = r29
            r3 = r30
            goto L_0x05fd
        L_0x03af:
            r31 = r21
            r29 = r24
            r32 = r25
            r30 = r26
            r33 = r27
            r2 = r28
            r21 = r9
            if (r4 == 0) goto L_0x03c2
            r4.close()     // Catch:{ IOException -> 0x03c5 }
        L_0x03c2:
            r5.close()     // Catch:{ IOException -> 0x03c5 }
        L_0x03c5:
            java.io.InputStream r0 = r7.getInputStream()     // Catch:{ Exception -> 0x03cd }
            r0.close()     // Catch:{ Exception -> 0x03cd }
            goto L_0x03d5
        L_0x03cd:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
        L_0x03d5:
            r7.disconnect()
            java.lang.String r0 = r1.f295394a
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r0)
            int r4 = r38.mo140348a()
            long r7 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r19)
            int r5 = (int) r7
            ad0.t r7 = new ad0.t
            r7.<init>()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r0)
            r8.append(r15)
            java.lang.String r0 = r8.toString()
            r7.mo32a(r14, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r7.mo32a(r13, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r4 = r1.f295396c
            r0.append(r4)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r7.mo32a(r12, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r7.mo32a(r11, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r7.mo32a(r10, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r3 = r1.f295398e
            r0.append(r3)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r8 = r21
            r7.mo32a(r8, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r9 = r33
            r7.mo32a(r9, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r2 = r19 / r22
            r0.append(r2)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r2 = r30
            r7.mo32a(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r2 = r29
            r0.append(r2)
            java.lang.String r2 = r7.mo34c()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r7
            r3 = 13572(0x3504, float:1.9018E-41)
            r0.mo160131h(r3, r2)
            java.lang.String r0 = r1.f295425g
            java.lang.String r2 = r1.f295395b
            java.lang.String r3 = "renameFile"
            r4 = r31
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106463x(r0, r2)     // Catch:{ all -> 0x04db }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x04db }
            r5.<init>()     // Catch:{ all -> 0x04db }
            java.lang.String r7 = "rename tmpFile, ret="
            r5.append(r7)     // Catch:{ all -> 0x04db }
            r5.append(r0)     // Catch:{ all -> 0x04db }
            java.lang.String r0 = ", path="
            r5.append(r0)     // Catch:{ all -> 0x04db }
            r5.append(r2)     // Catch:{ all -> 0x04db }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x04db }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)     // Catch:{ all -> 0x04db }
            goto L_0x04f5
        L_0x04db:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "renameFile exp="
            r2.append(r5)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
        L_0x04f5:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            r2 = r32
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r4)
            r5 = r4
            goto L_0x0733
        L_0x0500:
            r0 = move-exception
            r28 = r2
            r8 = r9
            r2 = r24
            r9 = r27
            r24 = r4
            r4 = r21
            r21 = r3
            r3 = r26
            r34 = r25
            r25 = r5
            r5 = r34
            r31 = r4
            r16 = r7
            r7 = r28
            goto L_0x05fd
        L_0x051e:
            r0 = move-exception
            r2 = r24
            r24 = r4
            r4 = r21
            r21 = r3
            r3 = r26
            r34 = r25
            r25 = r5
            r5 = r34
            r35 = r9
            r9 = r8
            r8 = r35
            goto L_0x055f
        L_0x0535:
            r0 = move-exception
            r4 = r21
            r2 = r24
            r21 = r3
            r3 = r26
            r34 = r25
            r25 = r5
            r5 = r34
            r35 = r9
            r9 = r8
            r8 = r35
            goto L_0x055d
        L_0x054a:
            r0 = move-exception
            r34 = r21
            r21 = r3
            r3 = r4
            r4 = r34
            r35 = r25
            r25 = r5
            r5 = r35
            r36 = r9
            r9 = r8
            r8 = r36
        L_0x055d:
            r24 = r16
        L_0x055f:
            r16 = r25
            goto L_0x05ba
        L_0x0563:
            r0 = move-exception
            r5 = r25
            r34 = r21
            r21 = r3
            r3 = r4
            r4 = r34
            r35 = r9
            r9 = r8
            r8 = r35
        L_0x0572:
            r24 = r16
            goto L_0x05ba
        L_0x0575:
            r0 = move-exception
            r21 = r3
            r3 = r4
            r4 = r5
            r5 = r25
            r34 = r9
            r9 = r8
            r8 = r34
            goto L_0x0572
        L_0x0582:
            r0 = move-exception
            r8 = r9
            r9 = r24
            r34 = r2
            r2 = r39
            r39 = r34
            r35 = r21
            r21 = r3
            r3 = r35
            r36 = r17
            r17 = r4
            r4 = r18
            r18 = r5
            r5 = r36
            goto L_0x0572
        L_0x059d:
            r0 = move-exception
            r34 = r2
            r2 = r39
            r39 = r34
            r35 = r21
            r21 = r3
            r3 = r35
            r36 = r17
            r17 = r4
            r4 = r18
            r18 = r5
            r5 = r36
            r37 = r9
            r9 = r8
            r8 = r37
            goto L_0x0572
        L_0x05ba:
            r31 = r4
            r25 = r16
            goto L_0x05fa
        L_0x05bf:
            r0 = move-exception
            r3 = r21
            r34 = r2
            r2 = r39
            r39 = r34
            r35 = r17
            r17 = r4
            r4 = r18
            r18 = r5
            r5 = r35
            r36 = r9
            r9 = r8
            r8 = r36
            goto L_0x05f2
        L_0x05d8:
            r0 = move-exception
            r3 = r21
            r34 = r2
            r2 = r39
            r39 = r34
            r35 = r17
            r17 = r4
            r4 = r18
            r18 = r5
            r5 = r35
            r36 = r9
            r9 = r8
            r8 = r36
            r7 = r16
        L_0x05f2:
            r31 = r4
            r24 = r16
            r25 = r24
            r21 = 0
        L_0x05fa:
            r16 = r7
            r7 = 0
        L_0x05fd:
            java.lang.String r4 = r1.f295425g     // Catch:{ all -> 0x074e }
            boolean r4 = com.tencent.p014mm.vfs.C86013q1.m106447h(r4)     // Catch:{ all -> 0x074e }
            r32 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x074c }
            r5.<init>()     // Catch:{ all -> 0x074c }
            r29 = r2
            java.lang.String r2 = "delete failed tmpFile, ret="
            r5.append(r2)     // Catch:{ all -> 0x0744 }
            r5.append(r4)     // Catch:{ all -> 0x0744 }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x0744 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)     // Catch:{ all -> 0x0744 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0737 }
            r2.<init>()     // Catch:{ all -> 0x0737 }
            r4 = r18
            r2.append(r4)     // Catch:{ all -> 0x0737 }
            r4 = -1
            r2.append(r4)     // Catch:{ all -> 0x0737 }
            r5 = r17
            r2.append(r5)     // Catch:{ all -> 0x0737 }
            r5 = r39
            r2.append(r5)     // Catch:{ all -> 0x0737 }
            java.lang.String r5 = ", exp="
            r2.append(r5)     // Catch:{ all -> 0x0737 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0737 }
            r2.append(r0)     // Catch:{ all -> 0x0737 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0737 }
            if (r24 == 0) goto L_0x0648
            r24.close()     // Catch:{ IOException -> 0x064d }
        L_0x0648:
            if (r25 == 0) goto L_0x064d
            r25.close()     // Catch:{ IOException -> 0x064d }
        L_0x064d:
            java.io.InputStream r0 = r16.getInputStream()     // Catch:{ Exception -> 0x0655 }
            r0.close()     // Catch:{ Exception -> 0x0655 }
            goto L_0x065d
        L_0x0655:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
        L_0x065d:
            if (r16 == 0) goto L_0x0662
            r16.disconnect()
        L_0x0662:
            java.lang.String r0 = r1.f295394a
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r0)
            int r4 = r38.mo140348a()
            r39 = r6
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r19)
            int r6 = (int) r5
            ad0.t r5 = new ad0.t
            r5.<init>()
            r17 = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r15)
            java.lang.String r0 = r2.toString()
            r5.mo32a(r14, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r5.mo32a(r13, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r2 = r1.f295396c
            r0.append(r2)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r5.mo32a(r12, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r5.mo32a(r11, r0)
            java.lang.String r0 = "-1,"
            r5.mo32a(r10, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r2 = r1.f295398e
            r0.append(r2)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r5.mo32a(r8, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r5.mo32a(r9, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r6 = r19 / r22
            r0.append(r6)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r5.mo32a(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r2 = r29
            r0.append(r2)
            java.lang.String r2 = r5.mo34c()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r6 = r39
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r3 = 13572(0x3504, float:1.9018E-41)
            r0.mo160131h(r3, r2)
            r5 = r31
            r2 = r32
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r5)
            r16 = r17
        L_0x0733:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r5)
            return r16
        L_0x0737:
            r0 = move-exception
            r2 = r29
            r5 = r31
            r4 = r32
            r17 = r0
            r32 = r4
            r4 = -1
            goto L_0x0758
        L_0x0744:
            r0 = move-exception
            r2 = r29
        L_0x0747:
            r5 = r31
            r4 = r32
            goto L_0x0752
        L_0x074c:
            r0 = move-exception
            goto L_0x0747
        L_0x074e:
            r0 = move-exception
            r4 = r5
            r5 = r31
        L_0x0752:
            r17 = r0
            r32 = r4
            r4 = r21
        L_0x0758:
            if (r24 == 0) goto L_0x075d
            r24.close()     // Catch:{ IOException -> 0x0762 }
        L_0x075d:
            if (r25 == 0) goto L_0x0762
            r25.close()     // Catch:{ IOException -> 0x0762 }
        L_0x0762:
            java.io.InputStream r0 = r16.getInputStream()     // Catch:{ Exception -> 0x076a }
            r0.close()     // Catch:{ Exception -> 0x076a }
            goto L_0x0772
        L_0x076a:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
        L_0x0772:
            if (r16 == 0) goto L_0x0777
            r16.disconnect()
        L_0x0777:
            java.lang.String r0 = r1.f295394a
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r0)
            r18 = r5
            int r5 = r38.mo140348a()
            r39 = r2
            r21 = r3
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r19)
            int r3 = (int) r2
            ad0.t r2 = new ad0.t
            r2.<init>()
            r16 = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            r6.append(r15)
            java.lang.String r0 = r6.toString()
            r2.mo32a(r14, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r2.mo32a(r13, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r5 = r1.f295396c
            r0.append(r5)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r2.mo32a(r12, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r2.mo32a(r11, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r2.mo32a(r10, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r3 = r1.f295398e
            r0.append(r3)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r2.mo32a(r8, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r2.mo32a(r9, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r3 = r19 / r22
            r0.append(r3)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r3 = r21
            r2.mo32a(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r3 = r39
            r0.append(r3)
            java.lang.String r3 = r2.mo34c()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r3 = r16
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r2
            r2 = 13572(0x3504, float:1.9018E-41)
            r0.mo160131h(r2, r3)
            r2 = r18
            r3 = r32
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r2)
            throw r17
        */
        throw new UnsupportedOperationException("Method not decompiled: ps2.C100880k.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    public void onPostExecute(Object obj) {
        SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadSmallFileTask");
        String str = (String) obj;
        SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadSmallFileTask");
        if (str == null) {
            this.f295424f.mo76115c(this.f295395b);
        } else {
            Log.m105920e("MicroMsg.AdLandingPageDownloadSmallFileTask", "onPostExecute, errMsg=" + str + ", url=" + this.f295394a);
            this.f295424f.mo76113a();
        }
        SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadSmallFileTask");
        SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadSmallFileTask");
    }
}
