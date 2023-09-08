package com.tencent.p014mm.sdk.http;

import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URLEncoder;

/* renamed from: com.tencent.mm.sdk.http.HttpURLConnectionWrapper */
public class HttpURLConnectionWrapper extends HttpWrapperBase {
    public static final String DEF_ATTACH_NAME = "default_attach_name";
    private static final String TAG = "MicroMsg.HttpURLConnectionWrapper";
    private HttpURLConnection conn;

    public HttpURLConnectionWrapper(HttpURLConnection httpURLConnection) {
        this.conn = httpURLConnection;
    }

    private void writePostStringContent(HttpWrapperBase.Request request, OutputStream outputStream) {
        if (request.params != null) {
            StringBuilder sb = new StringBuilder();
            boolean z = true;
            for (String next : request.params.keySet()) {
                sb.append(z ? "" : "&");
                sb.append(URLEncoder.encode(next, "utf-8"));
                sb.append('=');
                sb.append(URLEncoder.encode(request.params.get(next), "utf-8"));
                z = false;
            }
            outputStream.write(sb.toString().getBytes());
        }
    }

    public void cancel() {
        Log.m105918d(TAG, "cancel conection.");
        HttpURLConnection httpURLConnection = this.conn;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [java.io.OutputStream, com.tencent.mm.vfs.f0$h] */
    /* JADX WARNING: type inference failed for: r9v1, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r9v3 */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: type inference failed for: r9v6, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r9v8 */
    /* JADX WARNING: type inference failed for: r9v9 */
    /* JADX WARNING: type inference failed for: r9v11 */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01bd, code lost:
        r5 = 500;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01c7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01c8, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(TAG, r0, "", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01d4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01d5, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(TAG, r0, "", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01eb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01ec, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(TAG, r0, "", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:?, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01f8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01f9, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(TAG, r0, "", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0203, code lost:
        r0.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01a1, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01a2, code lost:
        r13 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01a5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01a6, code lost:
        r2 = r0;
        r13 = r9;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01bd A[Catch:{ all -> 0x01e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01c3 A[SYNTHETIC, Splitter:B:103:0x01c3] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01d0 A[SYNTHETIC, Splitter:B:108:0x01d0] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01e7 A[SYNTHETIC, Splitter:B:118:0x01e7] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01f4 A[SYNTHETIC, Splitter:B:123:0x01f4] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01a5 A[ExcHandler: all (r0v17 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r10 
      PHI: (r10v13 java.io.OutputStream) = (r10v14 java.io.OutputStream), (r10v17 java.io.OutputStream) binds: [B:16:0x009a, B:12:0x008c] A[DONT_GENERATE, DONT_INLINE], Splitter:B:12:0x008c] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01bc A[Catch:{ all -> 0x01e3 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void send(com.tencent.p014mm.sdk.http.HttpWrapperBase.Request r17, com.tencent.p014mm.sdk.http.HttpWrapperBase.Response r18) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            java.lang.String r3 = ""
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r6 = 0
            r5[r6] = r0
            java.lang.String r7 = "MicroMsg.HttpURLConnectionWrapper"
            java.lang.String r8 = "request : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r5)
            r5 = 503(0x1f7, float:7.05E-43)
            r8 = 500(0x1f4, float:7.0E-43)
            r9 = 0
            java.net.HttpURLConnection r10 = r1.conn     // Catch:{ Exception -> 0x01b2, all -> 0x01ae }
            int r11 = r0.timeout     // Catch:{ Exception -> 0x01b2, all -> 0x01ae }
            r10.setConnectTimeout(r11)     // Catch:{ Exception -> 0x01b2, all -> 0x01ae }
            java.net.HttpURLConnection r10 = r1.conn     // Catch:{ Exception -> 0x01b2, all -> 0x01ae }
            int r11 = r0.method     // Catch:{ Exception -> 0x01b2, all -> 0x01ae }
            if (r11 != 0) goto L_0x002b
            java.lang.String r11 = "GET"
            goto L_0x002d
        L_0x002b:
            java.lang.String r11 = "POST"
        L_0x002d:
            r10.setRequestMethod(r11)     // Catch:{ Exception -> 0x01b2, all -> 0x01ae }
            int r10 = r0.method     // Catch:{ Exception -> 0x01b2, all -> 0x01ae }
            if (r10 != r4) goto L_0x003e
            java.net.HttpURLConnection r10 = r1.conn     // Catch:{ Exception -> 0x01b2, all -> 0x01ae }
            r10.setDoInput(r4)     // Catch:{ Exception -> 0x01b2, all -> 0x01ae }
            java.net.HttpURLConnection r10 = r1.conn     // Catch:{ Exception -> 0x01b2, all -> 0x01ae }
            r10.setDoOutput(r4)     // Catch:{ Exception -> 0x01b2, all -> 0x01ae }
        L_0x003e:
            java.net.HttpURLConnection r10 = r1.conn     // Catch:{ Exception -> 0x01b2, all -> 0x01ae }
            r10.setUseCaches(r6)     // Catch:{ Exception -> 0x01b2, all -> 0x01ae }
            java.net.HttpURLConnection r10 = r1.conn     // Catch:{ Exception -> 0x01b2, all -> 0x01ae }
            java.lang.String r11 = "User-Agent"
            java.lang.String r12 = "weixin/android"
            r10.setRequestProperty(r11, r12)     // Catch:{ Exception -> 0x01b2, all -> 0x01ae }
            java.net.HttpURLConnection r10 = r1.conn     // Catch:{ Exception -> 0x01b2, all -> 0x01ae }
            java.lang.String r11 = "Host"
            java.lang.String r12 = r0.host     // Catch:{ Exception -> 0x01b2, all -> 0x01ae }
            r10.setRequestProperty(r11, r12)     // Catch:{ Exception -> 0x01b2, all -> 0x01ae }
            java.lang.String r10 = "http.keepAlive"
            java.lang.String r11 = "false"
            java.lang.System.setProperty(r10, r11)     // Catch:{ Exception -> 0x01b2, all -> 0x01ae }
            java.net.HttpURLConnection r10 = r1.conn     // Catch:{ Exception -> 0x01b2, all -> 0x01ae }
            java.lang.String r11 = "Accept-Charset"
            java.lang.String r12 = "utf-8"
            r10.setRequestProperty(r11, r12)     // Catch:{ Exception -> 0x01b2, all -> 0x01ae }
            java.net.HttpURLConnection r10 = r1.conn     // Catch:{ Exception -> 0x01b2, all -> 0x01ae }
            java.lang.String r11 = "Accept-Encoding"
            java.lang.String r12 = "compress;q=0.5, gzip;q=1.0"
            r10.setRequestProperty(r11, r12)     // Catch:{ Exception -> 0x01b2, all -> 0x01ae }
            java.net.HttpURLConnection r10 = r1.conn     // Catch:{ Exception -> 0x01b2, all -> 0x01ae }
            java.lang.String r11 = "Cookie"
            java.util.Map<java.lang.String, java.lang.String> r12 = r0.cookie     // Catch:{ Exception -> 0x01b2, all -> 0x01ae }
            java.lang.String r12 = com.tencent.p014mm.sdk.http.HttpWrapperBase.getCookie(r12)     // Catch:{ Exception -> 0x01b2, all -> 0x01ae }
            r10.setRequestProperty(r11, r12)     // Catch:{ Exception -> 0x01b2, all -> 0x01ae }
            java.net.HttpURLConnection r10 = r1.conn     // Catch:{ Exception -> 0x01b2, all -> 0x01ae }
            r10.connect()     // Catch:{ Exception -> 0x01b2, all -> 0x01ae }
            int r10 = r0.method     // Catch:{ Exception -> 0x01b2, all -> 0x01ae }
            if (r10 != r4) goto L_0x0093
            java.net.HttpURLConnection r10 = r1.conn     // Catch:{ Exception -> 0x01b2, all -> 0x01ae }
            java.io.OutputStream r10 = r10.getOutputStream()     // Catch:{ Exception -> 0x01b2, all -> 0x01ae }
            r1.writePostStringContent(r0, r10)     // Catch:{ Exception -> 0x01aa, all -> 0x01a5 }
            r10.flush()     // Catch:{ Exception -> 0x01aa, all -> 0x01a5 }
            goto L_0x0094
        L_0x0093:
            r10 = r9
        L_0x0094:
            java.net.HttpURLConnection r0 = r1.conn     // Catch:{ Exception -> 0x01aa, all -> 0x01a5 }
            int r11 = r0.getResponseCode()     // Catch:{ Exception -> 0x01aa, all -> 0x01a5 }
            java.net.HttpURLConnection r0 = r1.conn     // Catch:{ Exception -> 0x01a1, all -> 0x01a5 }
            java.lang.String r12 = "set-cookie"
            java.lang.String r0 = r0.getHeaderField(r12)     // Catch:{ Exception -> 0x01a1, all -> 0x01a5 }
            java.net.HttpURLConnection r12 = r1.conn     // Catch:{ Exception -> 0x01a1, all -> 0x01a5 }
            java.lang.String r13 = "Content-Encoding"
            java.lang.String r12 = r12.getHeaderField(r13)     // Catch:{ Exception -> 0x01a1, all -> 0x01a5 }
            java.net.HttpURLConnection r13 = r1.conn     // Catch:{ Exception -> 0x01a1, all -> 0x01a5 }
            java.lang.String r14 = "Content-Disposition"
            r13.getHeaderField(r14)     // Catch:{ Exception -> 0x01a1, all -> 0x01a5 }
            java.net.HttpURLConnection r13 = r1.conn     // Catch:{ Exception -> 0x01a1, all -> 0x01a5 }
            java.io.InputStream r13 = r13.getInputStream()     // Catch:{ Exception -> 0x01a1, all -> 0x01a5 }
            if (r12 == 0) goto L_0x00d0
            java.lang.String r14 = "gzip"
            boolean r12 = r12.contains(r14)     // Catch:{ Exception -> 0x00cd, all -> 0x00c9 }
            if (r12 == 0) goto L_0x00d0
            java.util.zip.GZIPInputStream r12 = new java.util.zip.GZIPInputStream     // Catch:{ Exception -> 0x00cd, all -> 0x00c9 }
            r12.<init>(r13)     // Catch:{ Exception -> 0x00cd, all -> 0x00c9 }
            r13 = r12
            goto L_0x00d0
        L_0x00c9:
            r0 = move-exception
            r2 = r0
            goto L_0x01a8
        L_0x00cd:
            r0 = move-exception
            goto L_0x01a3
        L_0x00d0:
            com.tencent.mm.sdk.http.HttpWrapperBase$Attachment r12 = r2.attachment     // Catch:{ Exception -> 0x0108 }
            if (r12 == 0) goto L_0x0115
            java.lang.String r12 = r12.filePath     // Catch:{ Exception -> 0x0108 }
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)     // Catch:{ Exception -> 0x0108 }
            if (r12 == 0) goto L_0x0115
            com.tencent.mm.sdk.http.HttpWrapperBase$Attachment r12 = r2.attachment     // Catch:{ Exception -> 0x0108 }
            java.lang.String r12 = r12.filePath     // Catch:{ Exception -> 0x0108 }
            android.net.Uri r12 = com.tencent.p014mm.vfs.C116299g2.m163858n(r12)     // Catch:{ Exception -> 0x0108 }
            java.lang.String r14 = r12.getPath()     // Catch:{ Exception -> 0x0108 }
            if (r14 == 0) goto L_0x010a
            java.lang.String r14 = com.tencent.p014mm.vfs.C116299g2.m163855k(r14, r6, r6)     // Catch:{ Exception -> 0x0108 }
            java.lang.String r15 = r12.getPath()     // Catch:{ Exception -> 0x0108 }
            boolean r15 = r15.equals(r14)     // Catch:{ Exception -> 0x0108 }
            if (r15 != 0) goto L_0x010a
            android.net.Uri$Builder r12 = r12.buildUpon()     // Catch:{ Exception -> 0x0108 }
            android.net.Uri$Builder r12 = r12.path(r14)     // Catch:{ Exception -> 0x0108 }
            android.net.Uri r12 = r12.build()     // Catch:{ Exception -> 0x0108 }
            goto L_0x010a
        L_0x0105:
            r0 = move-exception
            goto L_0x0198
        L_0x0108:
            r0 = move-exception
            goto L_0x0151
        L_0x010a:
            com.tencent.mm.vfs.f0 r14 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ Exception -> 0x0108 }
            com.tencent.mm.vfs.f0$h r14 = r14.mo177799l(r12, r9)     // Catch:{ Exception -> 0x0108 }
            java.io.OutputStream r4 = com.tencent.p014mm.vfs.C86013q1.m106425G(r12, r14, r4)     // Catch:{ Exception -> 0x0108 }
            goto L_0x011a
        L_0x0115:
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x0108 }
            r4.<init>()     // Catch:{ Exception -> 0x0108 }
        L_0x011a:
            r9 = r4
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r4]     // Catch:{ Exception -> 0x0108 }
        L_0x011f:
            int r12 = r13.read(r4)     // Catch:{ Exception -> 0x0108 }
            if (r12 <= 0) goto L_0x012c
            r9.write(r4, r6, r12)     // Catch:{ Exception -> 0x0108 }
            r9.flush()     // Catch:{ Exception -> 0x0108 }
            goto L_0x011f
        L_0x012c:
            r2.status = r11     // Catch:{ Exception -> 0x0108 }
            java.util.Map r0 = com.tencent.p014mm.sdk.http.HttpWrapperBase.parseCookie(r0)     // Catch:{ Exception -> 0x0108 }
            r2.cookie = r0     // Catch:{ Exception -> 0x0108 }
            boolean r0 = r9 instanceof java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x0108 }
            if (r0 == 0) goto L_0x0145
            java.lang.String r0 = new java.lang.String     // Catch:{ Exception -> 0x0108 }
            r4 = r9
            java.io.ByteArrayOutputStream r4 = (java.io.ByteArrayOutputStream) r4     // Catch:{ Exception -> 0x0108 }
            byte[] r4 = r4.toByteArray()     // Catch:{ Exception -> 0x0108 }
            r0.<init>(r4)     // Catch:{ Exception -> 0x0108 }
            goto L_0x0146
        L_0x0145:
            r0 = r3
        L_0x0146:
            r2.content = r0     // Catch:{ Exception -> 0x0108 }
            if (r9 == 0) goto L_0x0165
            r9.flush()     // Catch:{ Exception -> 0x00cd, all -> 0x00c9 }
        L_0x014d:
            r9.close()     // Catch:{ Exception -> 0x00cd, all -> 0x00c9 }
            goto L_0x0165
        L_0x0151:
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch:{ all -> 0x0105 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r3, r4)     // Catch:{ all -> 0x0105 }
            if (r11 != 0) goto L_0x015b
            r0 = 503(0x1f7, float:7.05E-43)
            goto L_0x015d
        L_0x015b:
            r0 = 500(0x1f4, float:7.0E-43)
        L_0x015d:
            r2.status = r0     // Catch:{ all -> 0x0105 }
            if (r9 == 0) goto L_0x0165
            r9.flush()     // Catch:{ Exception -> 0x00cd, all -> 0x00c9 }
            goto L_0x014d
        L_0x0165:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00cd, all -> 0x00c9 }
            r0.<init>()     // Catch:{ Exception -> 0x00cd, all -> 0x00c9 }
            java.lang.String r4 = "Response: %s"
            r0.append(r4)     // Catch:{ Exception -> 0x00cd, all -> 0x00c9 }
            r0.append(r2)     // Catch:{ Exception -> 0x00cd, all -> 0x00c9 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00cd, all -> 0x00c9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r0)     // Catch:{ Exception -> 0x00cd, all -> 0x00c9 }
            if (r10 == 0) goto L_0x0186
            r10.close()     // Catch:{ IOException -> 0x017f }
            goto L_0x0186
        L_0x017f:
            r0 = move-exception
            r2 = r0
            java.lang.Object[] r0 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r2, r3, r0)
        L_0x0186:
            if (r13 == 0) goto L_0x0193
            r13.close()     // Catch:{ IOException -> 0x018c }
            goto L_0x0193
        L_0x018c:
            r0 = move-exception
            r2 = r0
            java.lang.Object[] r0 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r2, r3, r0)
        L_0x0193:
            java.net.HttpURLConnection r0 = r1.conn
            if (r0 == 0) goto L_0x01e2
            goto L_0x01df
        L_0x0198:
            if (r9 == 0) goto L_0x01a0
            r9.flush()     // Catch:{ Exception -> 0x00cd, all -> 0x00c9 }
            r9.close()     // Catch:{ Exception -> 0x00cd, all -> 0x00c9 }
        L_0x01a0:
            throw r0     // Catch:{ Exception -> 0x00cd, all -> 0x00c9 }
        L_0x01a1:
            r0 = move-exception
            r13 = r9
        L_0x01a3:
            r9 = r10
            goto L_0x01b5
        L_0x01a5:
            r0 = move-exception
            r2 = r0
            r13 = r9
        L_0x01a8:
            r9 = r10
            goto L_0x01e5
        L_0x01aa:
            r0 = move-exception
            r13 = r9
            r9 = r10
            goto L_0x01b4
        L_0x01ae:
            r0 = move-exception
            r2 = r0
            r13 = r9
            goto L_0x01e5
        L_0x01b2:
            r0 = move-exception
            r13 = r9
        L_0x01b4:
            r11 = 0
        L_0x01b5:
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch:{ all -> 0x01e3 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r3, r4)     // Catch:{ all -> 0x01e3 }
            if (r11 != 0) goto L_0x01bd
            goto L_0x01bf
        L_0x01bd:
            r5 = 500(0x1f4, float:7.0E-43)
        L_0x01bf:
            r2.status = r5     // Catch:{ all -> 0x01e3 }
            if (r9 == 0) goto L_0x01ce
            r9.close()     // Catch:{ IOException -> 0x01c7 }
            goto L_0x01ce
        L_0x01c7:
            r0 = move-exception
            r2 = r0
            java.lang.Object[] r0 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r2, r3, r0)
        L_0x01ce:
            if (r13 == 0) goto L_0x01db
            r13.close()     // Catch:{ IOException -> 0x01d4 }
            goto L_0x01db
        L_0x01d4:
            r0 = move-exception
            r2 = r0
            java.lang.Object[] r0 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r2, r3, r0)
        L_0x01db:
            java.net.HttpURLConnection r0 = r1.conn
            if (r0 == 0) goto L_0x01e2
        L_0x01df:
            r0.disconnect()
        L_0x01e2:
            return
        L_0x01e3:
            r0 = move-exception
            r2 = r0
        L_0x01e5:
            if (r9 == 0) goto L_0x01f2
            r9.close()     // Catch:{ IOException -> 0x01eb }
            goto L_0x01f2
        L_0x01eb:
            r0 = move-exception
            r4 = r0
            java.lang.Object[] r0 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r4, r3, r0)
        L_0x01f2:
            if (r13 == 0) goto L_0x01ff
            r13.close()     // Catch:{ IOException -> 0x01f8 }
            goto L_0x01ff
        L_0x01f8:
            r0 = move-exception
            r4 = r0
            java.lang.Object[] r0 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r4, r3, r0)
        L_0x01ff:
            java.net.HttpURLConnection r0 = r1.conn
            if (r0 == 0) goto L_0x0206
            r0.disconnect()
        L_0x0206:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.http.HttpURLConnectionWrapper.send(com.tencent.mm.sdk.http.HttpWrapperBase$Request, com.tencent.mm.sdk.http.HttpWrapperBase$Response):void");
    }
}
