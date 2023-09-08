package com.tencent.mapsdk.internal;

import android.os.Build;
import com.tencent.map.tools.net.NetMethod;
import com.tencent.map.tools.net.NetRequest;
import com.tencent.map.tools.net.NetResponse;
import com.tencent.map.tools.net.processor.Processor;
import com.tencent.map.tools.net.processor.RequestProcessor;
import com.tencent.map.tools.net.processor.ResponseProcessor;
import java.net.HttpURLConnection;
import java.util.Collections;
import java.util.List;

/* renamed from: com.tencent.mapsdk.internal.le */
public final class C113928le extends C113927ld {

    /* renamed from: b */
    private static final String f340780b = "URLNetImpl";

    /* renamed from: c */
    private static final boolean f340781c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public HttpURLConnection f340782d;

    /* renamed from: com.tencent.mapsdk.internal.le$a */
    public static class C113930a {

        /* renamed from: c */
        private static final int f340785c = 3;

        /* renamed from: a */
        public int f340786a;

        /* renamed from: b */
        public boolean f340787b = true;

        public C113930a(int i) {
            this.f340786a = i;
            if (i > 3) {
                this.f340786a = 3;
            }
            if (this.f340786a <= 0) {
                this.f340786a = 1;
            }
        }

        /* renamed from: b */
        private boolean m157831b() {
            return this.f340787b && this.f340786a > 0;
        }

        /* renamed from: c */
        private void m157832c() {
            this.f340787b = false;
        }

        /* renamed from: a */
        public final void mo172349a() {
            this.f340786a--;
        }
    }

    /* renamed from: b */
    private static void m157824b() {
        if (Integer.parseInt(Build.VERSION.SDK) < 8) {
            System.setProperty("http.keepAlive", "false");
        }
    }

    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r4v18 */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0181, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0182, code lost:
        r11 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:?, code lost:
        m157823a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0186, code lost:
        com.tencent.map.tools.net.NetUtil.safeClose(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0189, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c1, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c4, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0159, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x015a, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x015c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x015e, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0169, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x016b, code lost:
        r4 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0159 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:29:0x005f] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.tencent.map.tools.net.NetResponse m157825c(com.tencent.map.tools.net.NetRequest r19) {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            java.util.List<com.tencent.map.tools.net.processor.Processor> r0 = r2.processors     // Catch:{ Exception -> 0x0020 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0020 }
        L_0x000a:
            boolean r3 = r0.hasNext()     // Catch:{ Exception -> 0x0020 }
            if (r3 == 0) goto L_0x0020
            java.lang.Object r3 = r0.next()     // Catch:{ Exception -> 0x0020 }
            com.tencent.map.tools.net.processor.Processor r3 = (com.tencent.map.tools.net.processor.Processor) r3     // Catch:{ Exception -> 0x0020 }
            boolean r4 = r3 instanceof com.tencent.map.tools.net.processor.RequestProcessor     // Catch:{ Exception -> 0x0020 }
            if (r4 == 0) goto L_0x000a
            com.tencent.map.tools.net.processor.RequestProcessor r3 = (com.tencent.map.tools.net.processor.RequestProcessor) r3     // Catch:{ Exception -> 0x0020 }
            r3.onRequest(r2)     // Catch:{ Exception -> 0x0020 }
            goto L_0x000a
        L_0x0020:
            com.tencent.map.tools.net.NetResponse r3 = new com.tencent.map.tools.net.NetResponse
            r3.<init>(r2)
            java.lang.String r0 = r2.url
            int r4 = r2.retryMethod
            int r5 = r2.timeout
            byte[] r6 = r2.postData
            java.util.Map<java.lang.String, java.lang.String> r7 = r2.mapHeaders
            com.tencent.map.tools.net.http.HttpCanceler r8 = r2.canceler
            com.tencent.map.tools.net.http.HttpProxy r9 = r2.proxy
            java.util.Set<java.lang.String> r10 = r2.respHeaders
            java.net.URL r12 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0044 }
            r12.<init>(r0)     // Catch:{ MalformedURLException -> 0x0044 }
            java.net.URL r0 = com.tencent.map.tools.net.http.HttpProxy.getProxyURL(r9)     // Catch:{ MalformedURLException -> 0x0042 }
            if (r0 == 0) goto L_0x0049
            r12 = r0
            goto L_0x0049
        L_0x0042:
            r0 = move-exception
            goto L_0x0046
        L_0x0044:
            r0 = move-exception
            r12 = 0
        L_0x0046:
            r3.exception(r0)
        L_0x0049:
            if (r12 == 0) goto L_0x018a
            com.tencent.mapsdk.internal.le$a r13 = new com.tencent.mapsdk.internal.le$a
            r13.<init>(r4)
        L_0x0050:
            boolean r0 = r13.f340787b
            r4 = 1
            r14 = 0
            if (r0 == 0) goto L_0x005c
            int r0 = r13.f340786a
            if (r0 <= 0) goto L_0x005c
            r0 = 1
            goto L_0x005d
        L_0x005c:
            r0 = 0
        L_0x005d:
            if (r0 == 0) goto L_0x018a
            java.net.Proxy r0 = com.tencent.map.tools.net.http.HttpProxy.getForwardProxy(r9)     // Catch:{ SocketTimeoutException -> 0x0169, IOException -> 0x015c, all -> 0x0159 }
            java.net.URLConnection r0 = r12.openConnection(r0)     // Catch:{ SocketTimeoutException -> 0x0169, IOException -> 0x015c, all -> 0x0159 }
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ SocketTimeoutException -> 0x0169, IOException -> 0x015c, all -> 0x0159 }
            com.tencent.map.tools.net.NetMethod r15 = r2.mNetMethod     // Catch:{ SocketTimeoutException -> 0x0169, IOException -> 0x015c, all -> 0x0159 }
            java.lang.String r15 = r15.name()     // Catch:{ SocketTimeoutException -> 0x0169, IOException -> 0x015c, all -> 0x0159 }
            r0.setRequestMethod(r15)     // Catch:{ SocketTimeoutException -> 0x0169, IOException -> 0x015c, all -> 0x0159 }
            r0.setUseCaches(r14)     // Catch:{ SocketTimeoutException -> 0x0169, IOException -> 0x015c, all -> 0x0159 }
            if (r5 <= 0) goto L_0x0086
            r0.setConnectTimeout(r5)     // Catch:{ SocketTimeoutException -> 0x0082, IOException -> 0x007e, all -> 0x0159 }
            r0.setReadTimeout(r5)     // Catch:{ SocketTimeoutException -> 0x0082, IOException -> 0x007e, all -> 0x0159 }
            goto L_0x0086
        L_0x007e:
            r0 = move-exception
            r4 = 0
            goto L_0x0160
        L_0x0082:
            r0 = move-exception
            r4 = 0
            goto L_0x016d
        L_0x0086:
            boolean r15 = r7.isEmpty()     // Catch:{ SocketTimeoutException -> 0x0169, IOException -> 0x015c, all -> 0x0159 }
            if (r15 != 0) goto L_0x00c7
            java.util.Set r15 = r7.entrySet()     // Catch:{ SocketTimeoutException -> 0x00c4, IOException -> 0x00c1, all -> 0x0159 }
            java.util.Iterator r15 = r15.iterator()     // Catch:{ SocketTimeoutException -> 0x00c4, IOException -> 0x00c1, all -> 0x0159 }
        L_0x0094:
            boolean r16 = r15.hasNext()     // Catch:{ SocketTimeoutException -> 0x00c4, IOException -> 0x00c1, all -> 0x0159 }
            if (r16 == 0) goto L_0x00c7
            java.lang.Object r16 = r15.next()     // Catch:{ SocketTimeoutException -> 0x00c4, IOException -> 0x00c1, all -> 0x0159 }
            java.util.Map$Entry r16 = (java.util.Map.Entry) r16     // Catch:{ SocketTimeoutException -> 0x00c4, IOException -> 0x00c1, all -> 0x0159 }
            java.lang.Object r17 = r16.getKey()     // Catch:{ SocketTimeoutException -> 0x00c4, IOException -> 0x00c1, all -> 0x0159 }
            r11 = r17
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ SocketTimeoutException -> 0x00c4, IOException -> 0x00c1, all -> 0x0159 }
            java.lang.Object r16 = r16.getValue()     // Catch:{ SocketTimeoutException -> 0x00c4, IOException -> 0x00c1, all -> 0x0159 }
            r14 = r16
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ SocketTimeoutException -> 0x00c4, IOException -> 0x00c1, all -> 0x0159 }
            boolean r16 = android.text.TextUtils.isEmpty(r11)     // Catch:{ SocketTimeoutException -> 0x00c4, IOException -> 0x00c1, all -> 0x0159 }
            if (r16 != 0) goto L_0x00bf
            boolean r16 = android.text.TextUtils.isEmpty(r14)     // Catch:{ SocketTimeoutException -> 0x00c4, IOException -> 0x00c1, all -> 0x0159 }
            if (r16 != 0) goto L_0x00bf
            r0.addRequestProperty(r11, r14)     // Catch:{ SocketTimeoutException -> 0x00c4, IOException -> 0x00c1, all -> 0x0159 }
        L_0x00bf:
            r14 = 0
            goto L_0x0094
        L_0x00c1:
            r0 = move-exception
            goto L_0x015e
        L_0x00c4:
            r0 = move-exception
            goto L_0x016b
        L_0x00c7:
            if (r8 == 0) goto L_0x00d3
            com.tencent.mapsdk.internal.le$1 r11 = new com.tencent.mapsdk.internal.le$1     // Catch:{ SocketTimeoutException -> 0x00c4, IOException -> 0x00c1, all -> 0x0159 }
            r11.<init>(r13)     // Catch:{ SocketTimeoutException -> 0x00c4, IOException -> 0x00c1, all -> 0x0159 }
            r8.setHttpAccessRequest(r1, r11)     // Catch:{ SocketTimeoutException -> 0x00c4, IOException -> 0x00c1, all -> 0x0159 }
            r1.f340782d = r0     // Catch:{ SocketTimeoutException -> 0x00c4, IOException -> 0x00c1, all -> 0x0159 }
        L_0x00d3:
            if (r6 == 0) goto L_0x00e9
            int r11 = r6.length     // Catch:{ SocketTimeoutException -> 0x00c4, IOException -> 0x00c1, all -> 0x0159 }
            if (r11 <= 0) goto L_0x00e9
            r0.setDoOutput(r4)     // Catch:{ SocketTimeoutException -> 0x00c4, IOException -> 0x00c1, all -> 0x0159 }
            java.io.OutputStream r4 = r0.getOutputStream()     // Catch:{ SocketTimeoutException -> 0x00c4, IOException -> 0x00c1, all -> 0x0159 }
            com.tencent.map.tools.net.NetUtil.writeBytesWithoutClose(r6, r4)     // Catch:{ SocketTimeoutException -> 0x00e6, IOException -> 0x00e3 }
            goto L_0x00ea
        L_0x00e3:
            r0 = move-exception
            goto L_0x015f
        L_0x00e6:
            r0 = move-exception
            goto L_0x016c
        L_0x00e9:
            r4 = 0
        L_0x00ea:
            r0.connect()     // Catch:{ SocketTimeoutException -> 0x0156, IOException -> 0x0153 }
            int r11 = r0.getResponseCode()     // Catch:{ SocketTimeoutException -> 0x0156, IOException -> 0x0153 }
            r3.statusCode = r11     // Catch:{ SocketTimeoutException -> 0x0150, IOException -> 0x014d }
            java.lang.String r14 = r0.getContentType()     // Catch:{ SocketTimeoutException -> 0x0150, IOException -> 0x014d }
            java.lang.String r14 = com.tencent.mapsdk.internal.C113927ld.m157812a((java.lang.String) r14)     // Catch:{ SocketTimeoutException -> 0x0150, IOException -> 0x014d }
            r3.charset = r14     // Catch:{ SocketTimeoutException -> 0x0150, IOException -> 0x014d }
            boolean r14 = r10.isEmpty()     // Catch:{ SocketTimeoutException -> 0x0150, IOException -> 0x014d }
            if (r14 != 0) goto L_0x0121
            java.util.Iterator r14 = r10.iterator()     // Catch:{ SocketTimeoutException -> 0x0150, IOException -> 0x014d }
        L_0x0107:
            boolean r15 = r14.hasNext()     // Catch:{ SocketTimeoutException -> 0x0150, IOException -> 0x014d }
            if (r15 == 0) goto L_0x0121
            java.lang.Object r15 = r14.next()     // Catch:{ SocketTimeoutException -> 0x0150, IOException -> 0x014d }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ SocketTimeoutException -> 0x0150, IOException -> 0x014d }
            java.lang.String r1 = r0.getHeaderField(r15)     // Catch:{ SocketTimeoutException -> 0x0150, IOException -> 0x014d }
            java.util.Map<java.lang.String, java.lang.String> r2 = r3.respHeads     // Catch:{ SocketTimeoutException -> 0x0150, IOException -> 0x014d }
            r2.put(r15, r1)     // Catch:{ SocketTimeoutException -> 0x0150, IOException -> 0x014d }
            r1 = r18
            r2 = r19
            goto L_0x0107
        L_0x0121:
            r1 = 200(0xc8, float:2.8E-43)
            if (r11 != r1) goto L_0x013f
            r1 = 0
            r3.errorCode = r1     // Catch:{ SocketTimeoutException -> 0x0150, IOException -> 0x014d }
            java.lang.String r1 = r0.getContentEncoding()     // Catch:{ SocketTimeoutException -> 0x0150, IOException -> 0x014d }
            r3.contentEncoding = r1     // Catch:{ SocketTimeoutException -> 0x0150, IOException -> 0x014d }
            int r1 = r0.getContentLength()     // Catch:{ SocketTimeoutException -> 0x0150, IOException -> 0x014d }
            r3.contentLength = r1     // Catch:{ SocketTimeoutException -> 0x0150, IOException -> 0x014d }
            com.tencent.map.tools.net.http.HttpConnectionInputStream r1 = new com.tencent.map.tools.net.http.HttpConnectionInputStream     // Catch:{ SocketTimeoutException -> 0x0150, IOException -> 0x014d }
            r1.<init>(r0)     // Catch:{ SocketTimeoutException -> 0x0150, IOException -> 0x014d }
            r3.dataStream = r1     // Catch:{ SocketTimeoutException -> 0x0150, IOException -> 0x014d }
            r1 = 0
            r13.f340787b = r1     // Catch:{ SocketTimeoutException -> 0x0150, IOException -> 0x014d }
            goto L_0x0175
        L_0x013f:
            java.io.InputStream r0 = r0.getErrorStream()     // Catch:{ SocketTimeoutException -> 0x0150, IOException -> 0x014d }
            byte[] r0 = com.tencent.map.tools.net.NetUtil.toBytesThrow(r0)     // Catch:{ SocketTimeoutException -> 0x0150, IOException -> 0x014d }
            r3.errorData = r0     // Catch:{ SocketTimeoutException -> 0x0150, IOException -> 0x014d }
            r13.mo172349a()     // Catch:{ SocketTimeoutException -> 0x0150, IOException -> 0x014d }
            goto L_0x0175
        L_0x014d:
            r0 = move-exception
            r14 = r11
            goto L_0x0160
        L_0x0150:
            r0 = move-exception
            r14 = r11
            goto L_0x016d
        L_0x0153:
            r0 = move-exception
            r1 = 0
            goto L_0x015f
        L_0x0156:
            r0 = move-exception
            r1 = 0
            goto L_0x016c
        L_0x0159:
            r0 = move-exception
            r11 = 0
            goto L_0x0183
        L_0x015c:
            r0 = move-exception
            r1 = 0
        L_0x015e:
            r4 = 0
        L_0x015f:
            r14 = 0
        L_0x0160:
            r3.exception(r0)     // Catch:{ all -> 0x0181 }
            r3.statusCode = r14     // Catch:{ all -> 0x0181 }
            r13.mo172349a()     // Catch:{ all -> 0x0181 }
            goto L_0x0175
        L_0x0169:
            r0 = move-exception
            r1 = 0
        L_0x016b:
            r4 = 0
        L_0x016c:
            r14 = 0
        L_0x016d:
            r3.exception(r0)     // Catch:{ all -> 0x0181 }
            r3.statusCode = r14     // Catch:{ all -> 0x0181 }
            r13.mo172349a()     // Catch:{ all -> 0x0181 }
        L_0x0175:
            m157823a((com.tencent.map.tools.net.NetResponse) r3)     // Catch:{ Exception -> 0x0178 }
        L_0x0178:
            com.tencent.map.tools.net.NetUtil.safeClose(r4)
            r1 = r18
            r2 = r19
            goto L_0x0050
        L_0x0181:
            r0 = move-exception
            r11 = r4
        L_0x0183:
            m157823a((com.tencent.map.tools.net.NetResponse) r3)     // Catch:{ Exception -> 0x0186 }
        L_0x0186:
            com.tencent.map.tools.net.NetUtil.safeClose(r11)
            throw r0
        L_0x018a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113928le.m157825c(com.tencent.map.tools.net.NetRequest):com.tencent.map.tools.net.NetResponse");
    }

    /* renamed from: d */
    private static void m157826d(NetRequest netRequest) {
        for (Processor next : netRequest.processors) {
            if (next instanceof RequestProcessor) {
                ((RequestProcessor) next).onRequest(netRequest);
            }
        }
    }

    public final boolean cancel() {
        HttpURLConnection httpURLConnection = this.f340782d;
        if (httpURLConnection == null) {
            return false;
        }
        httpURLConnection.disconnect();
        return true;
    }

    public final NetResponse doRequest(NetRequest netRequest) {
        netRequest.addProcessor(new C113945lr());
        return m157825c(netRequest);
    }

    public final NetResponse openStream(NetRequest netRequest) {
        netRequest.addProcessor(new C113952lx());
        return m157825c(netRequest);
    }

    /* renamed from: a */
    private static void m157823a(NetResponse netResponse) {
        List<Processor> processors = netResponse.getProcessors();
        Collections.reverse(processors);
        for (Processor next : processors) {
            if (next instanceof ResponseProcessor) {
                ((ResponseProcessor) next).onResponse(netResponse);
            }
        }
    }

    /* renamed from: b */
    public final NetResponse mo172348b(NetRequest netRequest) {
        netRequest.setNetMethod(NetMethod.POST);
        return doRequest(netRequest);
    }

    /* renamed from: a */
    public final NetResponse mo172346a(NetRequest netRequest) {
        netRequest.setNetMethod(NetMethod.GET);
        return doRequest(netRequest);
    }

    /* renamed from: a */
    public final void mo172347a() {
        if (Integer.parseInt(Build.VERSION.SDK) < 8) {
            System.setProperty("http.keepAlive", "false");
        }
    }
}
