package hx3;

import java.io.InputStream;

/* renamed from: hx3.b */
public final class C87601b {

    /* renamed from: a */
    public String f253698a = null;

    /* renamed from: b */
    public InputStream f253699b = null;

    /* renamed from: c */
    public C76248c f253700c;

    /* renamed from: d */
    public String f253701d;

    public C87601b(C76248c cVar, String str) {
        this.f253700c = cVar;
        this.f253701d = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0040, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00bf, code lost:
        if (r0 != null) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r1 = r8.f253699b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c7, code lost:
        if (r1 != null) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c9, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00df, code lost:
        if (r0 == null) goto L_0x00e2;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00cd */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040 A[Catch:{ Exception -> 0x0043, all -> 0x0040, SSLHandshakeException -> 0x00dc, IOException -> 0x00d7, IllegalStateException -> 0x00d2, Exception -> 0x00cd, all -> 0x0040 }, ExcHandler: all (r0v6 'th' java.lang.Throwable A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:3:0x0008] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:27:0x00bd=Splitter:B:27:0x00bd, B:37:0x00cd=Splitter:B:37:0x00cd} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo122060a() {
        /*
            r8 = this;
            java.lang.String r0 = "UTF-8"
            hx3.c r1 = r8.f253700c
            r2 = 1
            if (r1 != 0) goto L_0x0008
            return r2
        L_0x0008:
            java.net.URL r1 = r1.mo106503a()     // Catch:{ SSLHandshakeException -> 0x00dc, IOException -> 0x00d7, IllegalStateException -> 0x00d2, Exception -> 0x00cd, all -> 0x0040 }
            java.lang.String r3 = "https"
            java.lang.String r4 = r1.getProtocol()     // Catch:{ SSLHandshakeException -> 0x00dc, IOException -> 0x00d7, IllegalStateException -> 0x00d2, Exception -> 0x00cd, all -> 0x0040 }
            java.lang.String r4 = r4.toLowerCase()     // Catch:{ SSLHandshakeException -> 0x00dc, IOException -> 0x00d7, IllegalStateException -> 0x00d2, Exception -> 0x00cd, all -> 0x0040 }
            boolean r3 = r3.equals(r4)     // Catch:{ SSLHandshakeException -> 0x00dc, IOException -> 0x00d7, IllegalStateException -> 0x00d2, Exception -> 0x00cd, all -> 0x0040 }
            r4 = 0
            if (r3 == 0) goto L_0x004e
            java.net.URLConnection r1 = r1.openConnection()     // Catch:{ SSLHandshakeException -> 0x00dc, IOException -> 0x00d7, IllegalStateException -> 0x00d2, Exception -> 0x00cd, all -> 0x0040 }
            javax.net.ssl.HttpsURLConnection r1 = (javax.net.ssl.HttpsURLConnection) r1     // Catch:{ SSLHandshakeException -> 0x00dc, IOException -> 0x00d7, IllegalStateException -> 0x00d2, Exception -> 0x00cd, all -> 0x0040 }
            java.lang.String r3 = r8.f253701d     // Catch:{ SSLHandshakeException -> 0x00dc, IOException -> 0x00d7, IllegalStateException -> 0x00d2, Exception -> 0x00cd, all -> 0x0040 }
            java.lang.String r5 = "TLS"
            javax.net.ssl.SSLContext r5 = javax.net.ssl.SSLContext.getInstance(r5)     // Catch:{ Exception -> 0x0043, all -> 0x0040 }
            javax.net.ssl.TrustManager[] r6 = new javax.net.ssl.TrustManager[r2]     // Catch:{ Exception -> 0x0043, all -> 0x0040 }
            hx3.a r7 = new hx3.a     // Catch:{ Exception -> 0x0043, all -> 0x0040 }
            r7.<init>(r3)     // Catch:{ Exception -> 0x0043, all -> 0x0040 }
            r6[r4] = r7     // Catch:{ Exception -> 0x0043, all -> 0x0040 }
            r3 = 0
            r5.init(r3, r6, r3)     // Catch:{ Exception -> 0x0043, all -> 0x0040 }
            javax.net.ssl.SSLSocketFactory r3 = r5.getSocketFactory()     // Catch:{ SSLHandshakeException -> 0x00dc, IOException -> 0x00d7, IllegalStateException -> 0x00d2, Exception -> 0x00cd, all -> 0x0040 }
            r1.setSSLSocketFactory(r3)     // Catch:{ SSLHandshakeException -> 0x00dc, IOException -> 0x00d7, IllegalStateException -> 0x00d2, Exception -> 0x00cd, all -> 0x0040 }
            goto L_0x0054
        L_0x0040:
            r0 = move-exception
            goto L_0x00c5
        L_0x0043:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException     // Catch:{ SSLHandshakeException -> 0x00dc, IOException -> 0x00d7, IllegalStateException -> 0x00d2, Exception -> 0x00cd, all -> 0x0040 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ SSLHandshakeException -> 0x00dc, IOException -> 0x00d7, IllegalStateException -> 0x00d2, Exception -> 0x00cd, all -> 0x0040 }
            r1.<init>(r0)     // Catch:{ SSLHandshakeException -> 0x00dc, IOException -> 0x00d7, IllegalStateException -> 0x00d2, Exception -> 0x00cd, all -> 0x0040 }
            throw r1     // Catch:{ SSLHandshakeException -> 0x00dc, IOException -> 0x00d7, IllegalStateException -> 0x00d2, Exception -> 0x00cd, all -> 0x0040 }
        L_0x004e:
            java.net.URLConnection r1 = r1.openConnection()     // Catch:{ SSLHandshakeException -> 0x00dc, IOException -> 0x00d7, IllegalStateException -> 0x00d2, Exception -> 0x00cd, all -> 0x0040 }
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ SSLHandshakeException -> 0x00dc, IOException -> 0x00d7, IllegalStateException -> 0x00d2, Exception -> 0x00cd, all -> 0x0040 }
        L_0x0054:
            hx3.c r3 = r8.f253700c     // Catch:{ SSLHandshakeException -> 0x00dc, IOException -> 0x00d7, IllegalStateException -> 0x00d2, Exception -> 0x00cd, all -> 0x0040 }
            r3.getClass()     // Catch:{ SSLHandshakeException -> 0x00dc, IOException -> 0x00d7, IllegalStateException -> 0x00d2, Exception -> 0x00cd, all -> 0x0040 }
            java.lang.String r3 = "POST"
            r1.setRequestMethod(r3)     // Catch:{ SSLHandshakeException -> 0x00dc, IOException -> 0x00d7, IllegalStateException -> 0x00d2, Exception -> 0x00cd, all -> 0x0040 }
            r3 = 60000(0xea60, float:8.4078E-41)
            r1.setReadTimeout(r3)     // Catch:{ SSLHandshakeException -> 0x00dc, IOException -> 0x00d7, IllegalStateException -> 0x00d2, Exception -> 0x00cd, all -> 0x0040 }
            r3 = 30000(0x7530, float:4.2039E-41)
            r1.setConnectTimeout(r3)     // Catch:{ SSLHandshakeException -> 0x00dc, IOException -> 0x00d7, IllegalStateException -> 0x00d2, Exception -> 0x00cd, all -> 0x0040 }
            r1.setInstanceFollowRedirects(r2)     // Catch:{ SSLHandshakeException -> 0x00dc, IOException -> 0x00d7, IllegalStateException -> 0x00d2, Exception -> 0x00cd, all -> 0x0040 }
            r1.setUseCaches(r4)     // Catch:{ SSLHandshakeException -> 0x00dc, IOException -> 0x00d7, IllegalStateException -> 0x00d2, Exception -> 0x00cd, all -> 0x0040 }
            hx3.c r3 = r8.f253700c     // Catch:{ SSLHandshakeException -> 0x00dc, IOException -> 0x00d7, IllegalStateException -> 0x00d2, Exception -> 0x00cd, all -> 0x0040 }
            r3.getClass()     // Catch:{ SSLHandshakeException -> 0x00dc, IOException -> 0x00d7, IllegalStateException -> 0x00d2, Exception -> 0x00cd, all -> 0x0040 }
            hx3.c r3 = r8.f253700c     // Catch:{ SSLHandshakeException -> 0x00dc, IOException -> 0x00d7, IllegalStateException -> 0x00d2, Exception -> 0x00cd, all -> 0x0040 }
            r3.getClass()     // Catch:{ SSLHandshakeException -> 0x00dc, IOException -> 0x00d7, IllegalStateException -> 0x00d2, Exception -> 0x00cd, all -> 0x0040 }
            r1.setDoOutput(r2)     // Catch:{ SSLHandshakeException -> 0x00dc, IOException -> 0x00d7, IllegalStateException -> 0x00d2, Exception -> 0x00cd, all -> 0x0040 }
            java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter     // Catch:{ SSLHandshakeException -> 0x00dc, IOException -> 0x00d7, IllegalStateException -> 0x00d2, Exception -> 0x00cd, all -> 0x0040 }
            java.io.OutputStream r5 = r1.getOutputStream()     // Catch:{ SSLHandshakeException -> 0x00dc, IOException -> 0x00d7, IllegalStateException -> 0x00d2, Exception -> 0x00cd, all -> 0x0040 }
            r3.<init>(r5, r0)     // Catch:{ SSLHandshakeException -> 0x00dc, IOException -> 0x00d7, IllegalStateException -> 0x00d2, Exception -> 0x00cd, all -> 0x0040 }
            hx3.c r5 = r8.f253700c     // Catch:{ SSLHandshakeException -> 0x00dc, IOException -> 0x00d7, IllegalStateException -> 0x00d2, Exception -> 0x00cd, all -> 0x0040 }
            java.lang.String r5 = r5.f223344b     // Catch:{ SSLHandshakeException -> 0x00dc, IOException -> 0x00d7, IllegalStateException -> 0x00d2, Exception -> 0x00cd, all -> 0x0040 }
            r3.write(r5)     // Catch:{ SSLHandshakeException -> 0x00dc, IOException -> 0x00d7, IllegalStateException -> 0x00d2, Exception -> 0x00cd, all -> 0x0040 }
            r3.flush()     // Catch:{ SSLHandshakeException -> 0x00dc, IOException -> 0x00d7, IllegalStateException -> 0x00d2, Exception -> 0x00cd, all -> 0x0040 }
            r3.close()     // Catch:{ SSLHandshakeException -> 0x00dc, IOException -> 0x00d7, IllegalStateException -> 0x00d2, Exception -> 0x00cd, all -> 0x0040 }
            r1.connect()     // Catch:{ SSLHandshakeException -> 0x00dc, IOException -> 0x00d7, IllegalStateException -> 0x00d2, Exception -> 0x00cd, all -> 0x0040 }
            int r3 = r1.getResponseCode()     // Catch:{ SSLHandshakeException -> 0x00dc, IOException -> 0x00d7, IllegalStateException -> 0x00d2, Exception -> 0x00cd, all -> 0x0040 }
            r5 = 200(0xc8, float:2.8E-43)
            if (r3 != r5) goto L_0x00ad
            java.io.InputStream r1 = r1.getInputStream()     // Catch:{ SSLHandshakeException -> 0x00dc, IOException -> 0x00d7, IllegalStateException -> 0x00d2, Exception -> 0x00cd, all -> 0x0040 }
            r8.f253699b = r1     // Catch:{ SSLHandshakeException -> 0x00dc, IOException -> 0x00d7, IllegalStateException -> 0x00d2, Exception -> 0x00cd, all -> 0x0040 }
            if (r1 == 0) goto L_0x00bd
            java.lang.String r0 = ix3.C76375b.m91802d(r1, r0)     // Catch:{ SSLHandshakeException -> 0x00dc, IOException -> 0x00d7, IllegalStateException -> 0x00d2, Exception -> 0x00cd, all -> 0x0040 }
            r8.f253698a = r0     // Catch:{ SSLHandshakeException -> 0x00dc, IOException -> 0x00d7, IllegalStateException -> 0x00d2, Exception -> 0x00cd, all -> 0x0040 }
            r2 = 0
            goto L_0x00bd
        L_0x00ad:
            int r0 = r1.getResponseCode()     // Catch:{ SSLHandshakeException -> 0x00dc, IOException -> 0x00d7, IllegalStateException -> 0x00d2, Exception -> 0x00cd, all -> 0x0040 }
            r3 = 401(0x191, float:5.62E-43)
            if (r0 != r3) goto L_0x00ba
            r0 = 8
            r2 = 8
            goto L_0x00bd
        L_0x00ba:
            r1.getResponseCode()     // Catch:{ SSLHandshakeException -> 0x00dc, IOException -> 0x00d7, IllegalStateException -> 0x00d2, Exception -> 0x00cd, all -> 0x0040 }
        L_0x00bd:
            java.io.InputStream r0 = r8.f253699b     // Catch:{ Exception -> 0x00e2 }
            if (r0 == 0) goto L_0x00e2
        L_0x00c1:
            r0.close()     // Catch:{ Exception -> 0x00e2 }
            goto L_0x00e2
        L_0x00c5:
            java.io.InputStream r1 = r8.f253699b     // Catch:{ Exception -> 0x00cc }
            if (r1 == 0) goto L_0x00cc
            r1.close()     // Catch:{ Exception -> 0x00cc }
        L_0x00cc:
            throw r0
        L_0x00cd:
            java.io.InputStream r0 = r8.f253699b     // Catch:{ Exception -> 0x00e2 }
            if (r0 == 0) goto L_0x00e2
            goto L_0x00c1
        L_0x00d2:
            java.io.InputStream r0 = r8.f253699b     // Catch:{ Exception -> 0x00e2 }
            if (r0 == 0) goto L_0x00e2
            goto L_0x00c1
        L_0x00d7:
            java.io.InputStream r0 = r8.f253699b     // Catch:{ Exception -> 0x00e2 }
            if (r0 == 0) goto L_0x00e2
            goto L_0x00c1
        L_0x00dc:
            r2 = 4
            java.io.InputStream r0 = r8.f253699b     // Catch:{ Exception -> 0x00e2 }
            if (r0 == 0) goto L_0x00e2
            goto L_0x00c1
        L_0x00e2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: hx3.C87601b.mo122060a():int");
    }
}
