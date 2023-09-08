package com.pay.http;

import com.pay.tool.APMidasTools;
import com.tencent.midas.api.APMidasPayAPI;
import com.tencent.midas.comm.APLog;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.util.HashMap;

public abstract class APBaseHttpReq extends Thread {
    public IAPHttpAns httpAns;
    public APBaseHttpParam httpParam;
    public HttpURLConnection httpURLConnection;
    private boolean isStop = false;
    private byte[] resultContent;

    public APBaseHttpReq() {
        APBaseHttpParam aPBaseHttpParam = new APBaseHttpParam();
        this.httpParam = aPBaseHttpParam;
        aPBaseHttpParam.reqParam = new HashMap<>();
        this.httpParam.domain = APMidasTools.getSysServerDomain();
    }

    private void closeOutput() {
        try {
            if (this.httpURLConnection.getDoOutput()) {
                try {
                    this.httpURLConnection.getOutputStream().flush();
                    this.httpURLConnection.getOutputStream().close();
                } catch (Throwable unused) {
                }
            }
        } catch (Exception e) {
            APLog.m161214i("closeOutput", e.toString());
        }
    }

    private void closeStream(InputStream inputStream, OutputStream outputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Exception unused) {
                return;
            }
        }
        if (outputStream != null) {
            outputStream.flush();
            outputStream.close();
        }
        this.httpURLConnection.disconnect();
    }

    private void createConnection() {
        URL url;
        try {
            url = new URL(this.httpParam.url);
        } catch (MalformedURLException unused) {
            url = null;
        }
        if (APMidasPayAPI.env.equals(APMidasPayAPI.ENV_TESTING)) {
            APLog.m161214i("APHttp Request", "URL = " + this.httpParam.url);
        } else {
            APLog.m161214i("APHttp Request", "URL = " + this.httpParam.url + " HOST = " + this.httpParam.defaultDomain);
        }
        this.httpAns.onStart(this);
        try {
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) url.openConnection();
            this.httpURLConnection = httpURLConnection2;
            httpURLConnection2.setConnectTimeout(this.httpParam.connectTimeout);
            this.httpURLConnection.setReadTimeout(this.httpParam.readTimeout);
            this.httpURLConnection.setRequestProperty("Host", this.httpParam.defaultDomain);
            this.httpURLConnection.setUseCaches(false);
        } catch (Exception e) {
            APLog.m161214i("createConnection", e.toString());
        }
    }

    private void initRequest() {
        constructParam();
        this.httpParam.constructUrl();
        preCreateConnection();
        createConnection();
        closeOutput();
        setHeader();
        setBody();
    }

    /* JADX WARNING: type inference failed for: r15v0 */
    /* JADX WARNING: type inference failed for: r15v1, types: [javax.net.ssl.TrustManager[], javax.net.ssl.KeyManager[]] */
    /* JADX WARNING: type inference failed for: r15v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:152:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0069, code lost:
        closeStream(r6, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0074, code lost:
        if (r7.httpParam.reqType.equals(com.tencent.p014mm.sdk.http.HttpWrapperBase.PROTOCAL_HTTPS) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0076, code lost:
        com.tencent.midas.comm.APLog.m161212e("APBaseHttpReq", "finally https");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r0 = javax.net.ssl.SSLContext.getInstance("TLS");
        r0.init(r15, r15, new java.security.SecureRandom());
        javax.net.ssl.HttpsURLConnection.setDefaultSSLSocketFactory(r0.getSocketFactory());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008e, code lost:
        com.tencent.midas.comm.APLog.m161212e("APBaseHttpReq", "finally Exception" + r0.toString());
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void requestProgress() {
        /*
            r18 = this;
            r7 = r18
            java.lang.String r8 = "finally Exception"
            java.lang.String r9 = "TLS"
            java.lang.String r10 = "finally https"
            java.lang.String r11 = "https://"
            java.lang.String r12 = "APBaseHttpReq"
            java.io.ByteArrayOutputStream r13 = new java.io.ByteArrayOutputStream
            r13.<init>()
            com.pay.http.APBaseHttpParam r0 = r7.httpParam
            long r1 = java.lang.System.currentTimeMillis()
            r0.begTime = r1
            r18.initRequest()
            com.pay.http.APBaseHttpParam r0 = r7.httpParam     // Catch:{ all -> 0x0041 }
            java.lang.String r0 = r0.sendType     // Catch:{ all -> 0x0041 }
            java.lang.String r1 = "POST"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x0041
            java.io.DataOutputStream r0 = new java.io.DataOutputStream     // Catch:{ all -> 0x0041 }
            java.net.HttpURLConnection r1 = r7.httpURLConnection     // Catch:{ all -> 0x0041 }
            java.io.OutputStream r1 = r1.getOutputStream()     // Catch:{ all -> 0x0041 }
            r0.<init>(r1)     // Catch:{ all -> 0x0041 }
            com.pay.http.APBaseHttpParam r1 = r7.httpParam     // Catch:{ all -> 0x0041 }
            java.lang.String r1 = r1.urlParams     // Catch:{ all -> 0x0041 }
            byte[] r1 = r1.getBytes()     // Catch:{ all -> 0x0041 }
            r0.write(r1)     // Catch:{ all -> 0x0041 }
            r0.flush()     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r15 = 0
            java.net.HttpURLConnection r0 = r7.httpURLConnection     // Catch:{ ConnectTimeoutException -> 0x0254, SocketTimeoutException -> 0x021b, IOException -> 0x01e1, Exception -> 0x01a6, all -> 0x01a1 }
            java.io.InputStream r6 = r0.getInputStream()     // Catch:{ ConnectTimeoutException -> 0x0254, SocketTimeoutException -> 0x021b, IOException -> 0x01e1, Exception -> 0x01a6, all -> 0x01a1 }
            java.net.HttpURLConnection r0 = r7.httpURLConnection     // Catch:{ ConnectTimeoutException -> 0x019d, SocketTimeoutException -> 0x0199, IOException -> 0x0196, Exception -> 0x0193, all -> 0x018f }
            int r0 = r0.getResponseCode()     // Catch:{ ConnectTimeoutException -> 0x019d, SocketTimeoutException -> 0x0199, IOException -> 0x0196, Exception -> 0x0193, all -> 0x018f }
            r4 = 200(0xc8, float:2.8E-43)
            if (r0 != r4) goto L_0x0118
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]     // Catch:{ ConnectTimeoutException -> 0x0113, SocketTimeoutException -> 0x010e, IOException -> 0x0109, Exception -> 0x0104, all -> 0x00ff }
            r5 = 0
            r1 = 0
        L_0x0058:
            int r3 = r6.read(r0)     // Catch:{ ConnectTimeoutException -> 0x0113, SocketTimeoutException -> 0x010e, IOException -> 0x0109, Exception -> 0x0104, all -> 0x00ff }
            if (r3 <= 0) goto L_0x00cf
            boolean r2 = r7.isStop     // Catch:{ ConnectTimeoutException -> 0x0113, SocketTimeoutException -> 0x010e, IOException -> 0x0109, Exception -> 0x0104, all -> 0x00ff }
            if (r2 == 0) goto L_0x00b1
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ ConnectTimeoutException -> 0x00ae, SocketTimeoutException -> 0x00ab, IOException -> 0x00a8, Exception -> 0x00a5 }
            r0.interrupt()     // Catch:{ ConnectTimeoutException -> 0x00ae, SocketTimeoutException -> 0x00ab, IOException -> 0x00a8, Exception -> 0x00a5 }
            r7.closeStream(r6, r13)
            com.pay.http.APBaseHttpParam r0 = r7.httpParam
            java.lang.String r0 = r0.reqType
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x00a4
            com.tencent.midas.comm.APLog.m161212e(r12, r10)
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r9)     // Catch:{ Exception -> 0x008d }
            java.security.SecureRandom r1 = new java.security.SecureRandom     // Catch:{ Exception -> 0x008d }
            r1.<init>()     // Catch:{ Exception -> 0x008d }
            r0.init(r15, r15, r1)     // Catch:{ Exception -> 0x008d }
            javax.net.ssl.SSLSocketFactory r0 = r0.getSocketFactory()     // Catch:{ Exception -> 0x008d }
            javax.net.ssl.HttpsURLConnection.setDefaultSSLSocketFactory(r0)     // Catch:{ Exception -> 0x008d }
            goto L_0x00a4
        L_0x008d:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            java.lang.String r0 = r0.toString()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.midas.comm.APLog.m161212e(r12, r0)
        L_0x00a4:
            return
        L_0x00a5:
            r0 = move-exception
            goto L_0x01a8
        L_0x00a8:
            r0 = move-exception
            goto L_0x01e3
        L_0x00ab:
            r0 = move-exception
            goto L_0x021d
        L_0x00ae:
            r0 = move-exception
            goto L_0x0256
        L_0x00b1:
            r13.write(r0, r5, r3)     // Catch:{ ConnectTimeoutException -> 0x0113, SocketTimeoutException -> 0x010e, IOException -> 0x0109, Exception -> 0x0104, all -> 0x00ff }
            int r2 = r1 + r3
            com.pay.http.IAPHttpAns r1 = r7.httpAns     // Catch:{ ConnectTimeoutException -> 0x0113, SocketTimeoutException -> 0x010e, IOException -> 0x0109, Exception -> 0x0104, all -> 0x00ff }
            long r4 = (long) r2
            r16 = r2
            r2 = r0
            r14 = 200(0xc8, float:2.8E-43)
            r15 = 0
            r17 = r6
            r6 = r18
            r1.onReceive(r2, r3, r4, r6)     // Catch:{ ConnectTimeoutException -> 0x00fa, SocketTimeoutException -> 0x00f5, IOException -> 0x00f0, Exception -> 0x00eb, all -> 0x00e5 }
            r1 = r16
            r6 = r17
            r4 = 200(0xc8, float:2.8E-43)
            r5 = 0
            r15 = 0
            goto L_0x0058
        L_0x00cf:
            r17 = r6
            r14 = 200(0xc8, float:2.8E-43)
            r15 = 0
            byte[] r0 = r13.toByteArray()     // Catch:{ ConnectTimeoutException -> 0x00fa, SocketTimeoutException -> 0x00f5, IOException -> 0x00f0, Exception -> 0x00eb, all -> 0x00e5 }
            r7.resultContent = r0     // Catch:{ ConnectTimeoutException -> 0x00fa, SocketTimeoutException -> 0x00f5, IOException -> 0x00f0, Exception -> 0x00eb, all -> 0x00e5 }
            com.pay.http.IAPHttpAns r0 = r7.httpAns     // Catch:{ ConnectTimeoutException -> 0x00fa, SocketTimeoutException -> 0x00f5, IOException -> 0x00f0, Exception -> 0x00eb, all -> 0x00e5 }
            r0.onFinish(r7)     // Catch:{ ConnectTimeoutException -> 0x00fa, SocketTimeoutException -> 0x00f5, IOException -> 0x00f0, Exception -> 0x00eb, all -> 0x00e5 }
            r7.sendReportData(r15, r14)     // Catch:{ ConnectTimeoutException -> 0x00fa, SocketTimeoutException -> 0x00f5, IOException -> 0x00f0, Exception -> 0x00eb, all -> 0x00e5 }
        L_0x00e2:
            r1 = r17
            goto L_0x0144
        L_0x00e5:
            r0 = move-exception
            r1 = r0
            r6 = r17
            goto L_0x02a0
        L_0x00eb:
            r0 = move-exception
            r6 = r17
            goto L_0x01a8
        L_0x00f0:
            r0 = move-exception
            r6 = r17
            goto L_0x01e3
        L_0x00f5:
            r0 = move-exception
            r6 = r17
            goto L_0x021d
        L_0x00fa:
            r0 = move-exception
            r6 = r17
            goto L_0x0256
        L_0x00ff:
            r0 = move-exception
            r17 = r6
            goto L_0x029f
        L_0x0104:
            r0 = move-exception
            r17 = r6
            goto L_0x01a8
        L_0x0109:
            r0 = move-exception
            r17 = r6
            goto L_0x01e3
        L_0x010e:
            r0 = move-exception
            r17 = r6
            goto L_0x021d
        L_0x0113:
            r0 = move-exception
            r17 = r6
            goto L_0x0256
        L_0x0118:
            r17 = r6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ ConnectTimeoutException -> 0x0189, SocketTimeoutException -> 0x0183, IOException -> 0x017d, Exception -> 0x0178, all -> 0x0172 }
            r0.<init>()     // Catch:{ ConnectTimeoutException -> 0x0189, SocketTimeoutException -> 0x0183, IOException -> 0x017d, Exception -> 0x0178, all -> 0x0172 }
            java.lang.String r1 = "网络错误(错误码"
            r0.append(r1)     // Catch:{ ConnectTimeoutException -> 0x0189, SocketTimeoutException -> 0x0183, IOException -> 0x017d, Exception -> 0x0178, all -> 0x0172 }
            java.net.HttpURLConnection r1 = r7.httpURLConnection     // Catch:{ ConnectTimeoutException -> 0x0189, SocketTimeoutException -> 0x0183, IOException -> 0x017d, Exception -> 0x0178, all -> 0x0172 }
            int r1 = r1.getResponseCode()     // Catch:{ ConnectTimeoutException -> 0x0189, SocketTimeoutException -> 0x0183, IOException -> 0x017d, Exception -> 0x0178, all -> 0x0172 }
            r0.append(r1)     // Catch:{ ConnectTimeoutException -> 0x0189, SocketTimeoutException -> 0x0183, IOException -> 0x017d, Exception -> 0x0178, all -> 0x0172 }
            java.lang.String r1 = ")"
            r0.append(r1)     // Catch:{ ConnectTimeoutException -> 0x0189, SocketTimeoutException -> 0x0183, IOException -> 0x017d, Exception -> 0x0178, all -> 0x0172 }
            java.lang.String r0 = r0.toString()     // Catch:{ ConnectTimeoutException -> 0x0189, SocketTimeoutException -> 0x0183, IOException -> 0x017d, Exception -> 0x0178, all -> 0x0172 }
            r1 = -10
            java.net.HttpURLConnection r2 = r7.httpURLConnection     // Catch:{ ConnectTimeoutException -> 0x0189, SocketTimeoutException -> 0x0183, IOException -> 0x017d, Exception -> 0x0178, all -> 0x0172 }
            int r2 = r2.getResponseCode()     // Catch:{ ConnectTimeoutException -> 0x0189, SocketTimeoutException -> 0x0183, IOException -> 0x017d, Exception -> 0x0178, all -> 0x0172 }
            r3 = 0
            r7.tryAgain(r1, r2, r3, r0)     // Catch:{ ConnectTimeoutException -> 0x0189, SocketTimeoutException -> 0x0183, IOException -> 0x017d, Exception -> 0x0178, all -> 0x0172 }
            goto L_0x00e2
        L_0x0144:
            r7.closeStream(r1, r13)
            com.pay.http.APBaseHttpParam r0 = r7.httpParam
            java.lang.String r0 = r0.reqType
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x029d
            com.tencent.midas.comm.APLog.m161212e(r12, r10)
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r9)     // Catch:{ Exception -> 0x016a }
            java.security.SecureRandom r1 = new java.security.SecureRandom     // Catch:{ Exception -> 0x016a }
            r1.<init>()     // Catch:{ Exception -> 0x016a }
            r2 = 0
            r0.init(r2, r2, r1)     // Catch:{ Exception -> 0x016a }
            javax.net.ssl.SSLSocketFactory r0 = r0.getSocketFactory()     // Catch:{ Exception -> 0x016a }
            javax.net.ssl.HttpsURLConnection.setDefaultSSLSocketFactory(r0)     // Catch:{ Exception -> 0x016a }
            goto L_0x029d
        L_0x016a:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L_0x028c
        L_0x0172:
            r0 = move-exception
            r1 = r17
            r6 = r1
            goto L_0x029f
        L_0x0178:
            r0 = move-exception
            r1 = r17
            r6 = r1
            goto L_0x01a8
        L_0x017d:
            r0 = move-exception
            r1 = r17
            r6 = r1
            goto L_0x01e3
        L_0x0183:
            r0 = move-exception
            r1 = r17
            r6 = r1
            goto L_0x021d
        L_0x0189:
            r0 = move-exception
            r1 = r17
            r6 = r1
            goto L_0x0256
        L_0x018f:
            r0 = move-exception
            r1 = r6
            goto L_0x029f
        L_0x0193:
            r0 = move-exception
            r1 = r6
            goto L_0x01a8
        L_0x0196:
            r0 = move-exception
            r1 = r6
            goto L_0x01e3
        L_0x0199:
            r0 = move-exception
            r1 = r6
            goto L_0x021d
        L_0x019d:
            r0 = move-exception
            r1 = r6
            goto L_0x0256
        L_0x01a1:
            r0 = move-exception
            r1 = r0
            r6 = 0
            goto L_0x02a0
        L_0x01a6:
            r0 = move-exception
            r6 = 0
        L_0x01a8:
            java.lang.String r1 = "网络错误，请稍后再试"
            r7.closeStream(r6, r13)     // Catch:{ all -> 0x029e }
            r2 = -6
            r3 = -1
            r7.tryAgain(r2, r3, r0, r1)     // Catch:{ all -> 0x029e }
            r7.closeStream(r6, r13)
            com.pay.http.APBaseHttpParam r0 = r7.httpParam
            java.lang.String r0 = r0.reqType
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x029d
            com.tencent.midas.comm.APLog.m161212e(r12, r10)
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r9)     // Catch:{ Exception -> 0x01d9 }
            java.security.SecureRandom r1 = new java.security.SecureRandom     // Catch:{ Exception -> 0x01d9 }
            r1.<init>()     // Catch:{ Exception -> 0x01d9 }
            r2 = 0
            r0.init(r2, r2, r1)     // Catch:{ Exception -> 0x01d9 }
            javax.net.ssl.SSLSocketFactory r0 = r0.getSocketFactory()     // Catch:{ Exception -> 0x01d9 }
            javax.net.ssl.HttpsURLConnection.setDefaultSSLSocketFactory(r0)     // Catch:{ Exception -> 0x01d9 }
            goto L_0x029d
        L_0x01d9:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L_0x028c
        L_0x01e1:
            r0 = move-exception
            r6 = 0
        L_0x01e3:
            java.lang.String r1 = "网络连接异常,请检查网络"
            int r2 = com.pay.tool.APMidasTools.getErrorCodeFromException(r0)     // Catch:{ all -> 0x029e }
            r3 = -1
            r7.tryAgain(r2, r3, r0, r1)     // Catch:{ all -> 0x029e }
            r7.closeStream(r6, r13)
            com.pay.http.APBaseHttpParam r0 = r7.httpParam
            java.lang.String r0 = r0.reqType
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x029d
            com.tencent.midas.comm.APLog.m161212e(r12, r10)
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r9)     // Catch:{ Exception -> 0x0214 }
            java.security.SecureRandom r1 = new java.security.SecureRandom     // Catch:{ Exception -> 0x0214 }
            r1.<init>()     // Catch:{ Exception -> 0x0214 }
            r2 = 0
            r0.init(r2, r2, r1)     // Catch:{ Exception -> 0x0214 }
            javax.net.ssl.SSLSocketFactory r0 = r0.getSocketFactory()     // Catch:{ Exception -> 0x0214 }
            javax.net.ssl.HttpsURLConnection.setDefaultSSLSocketFactory(r0)     // Catch:{ Exception -> 0x0214 }
            goto L_0x029d
        L_0x0214:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L_0x028c
        L_0x021b:
            r0 = move-exception
            r6 = 0
        L_0x021d:
            java.lang.String r1 = "网络响应超时,请检查网络"
            r7.closeStream(r6, r13)     // Catch:{ all -> 0x029e }
            r2 = -8
            r3 = -1
            r7.tryAgain(r2, r3, r0, r1)     // Catch:{ all -> 0x029e }
            r7.closeStream(r6, r13)
            com.pay.http.APBaseHttpParam r0 = r7.httpParam
            java.lang.String r0 = r0.reqType
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x029d
            com.tencent.midas.comm.APLog.m161212e(r12, r10)
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r9)     // Catch:{ Exception -> 0x024d }
            java.security.SecureRandom r1 = new java.security.SecureRandom     // Catch:{ Exception -> 0x024d }
            r1.<init>()     // Catch:{ Exception -> 0x024d }
            r2 = 0
            r0.init(r2, r2, r1)     // Catch:{ Exception -> 0x024d }
            javax.net.ssl.SSLSocketFactory r0 = r0.getSocketFactory()     // Catch:{ Exception -> 0x024d }
            javax.net.ssl.HttpsURLConnection.setDefaultSSLSocketFactory(r0)     // Catch:{ Exception -> 0x024d }
            goto L_0x029d
        L_0x024d:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L_0x028c
        L_0x0254:
            r0 = move-exception
            r6 = 0
        L_0x0256:
            java.lang.String r1 = "网络连接超时,请检查网络"
            r7.closeStream(r6, r13)     // Catch:{ all -> 0x029e }
            r2 = -7
            r3 = -1
            r7.tryAgain(r2, r3, r0, r1)     // Catch:{ all -> 0x029e }
            r7.closeStream(r6, r13)
            com.pay.http.APBaseHttpParam r0 = r7.httpParam
            java.lang.String r0 = r0.reqType
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x029d
            com.tencent.midas.comm.APLog.m161212e(r12, r10)
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r9)     // Catch:{ Exception -> 0x0286 }
            java.security.SecureRandom r1 = new java.security.SecureRandom     // Catch:{ Exception -> 0x0286 }
            r1.<init>()     // Catch:{ Exception -> 0x0286 }
            r2 = 0
            r0.init(r2, r2, r1)     // Catch:{ Exception -> 0x0286 }
            javax.net.ssl.SSLSocketFactory r0 = r0.getSocketFactory()     // Catch:{ Exception -> 0x0286 }
            javax.net.ssl.HttpsURLConnection.setDefaultSSLSocketFactory(r0)     // Catch:{ Exception -> 0x0286 }
            goto L_0x029d
        L_0x0286:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
        L_0x028c:
            r1.append(r8)
            java.lang.String r0 = r0.toString()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.midas.comm.APLog.m161212e(r12, r0)
        L_0x029d:
            return
        L_0x029e:
            r0 = move-exception
        L_0x029f:
            r1 = r0
        L_0x02a0:
            r7.closeStream(r6, r13)
            com.pay.http.APBaseHttpParam r0 = r7.httpParam
            java.lang.String r0 = r0.reqType
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02dc
            com.tencent.midas.comm.APLog.m161212e(r12, r10)
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r9)     // Catch:{ Exception -> 0x02c5 }
            java.security.SecureRandom r2 = new java.security.SecureRandom     // Catch:{ Exception -> 0x02c5 }
            r2.<init>()     // Catch:{ Exception -> 0x02c5 }
            r3 = 0
            r0.init(r3, r3, r2)     // Catch:{ Exception -> 0x02c5 }
            javax.net.ssl.SSLSocketFactory r0 = r0.getSocketFactory()     // Catch:{ Exception -> 0x02c5 }
            javax.net.ssl.HttpsURLConnection.setDefaultSSLSocketFactory(r0)     // Catch:{ Exception -> 0x02c5 }
            goto L_0x02dc
        L_0x02c5:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r8)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.midas.comm.APLog.m161212e(r12, r0)
        L_0x02dc:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pay.http.APBaseHttpReq.requestProgress():void");
    }

    private void sendReportData(int i, int i2) {
        this.httpParam.urlName.endsWith("log_data");
    }

    private void tryAgain(int i, int i2, Exception exc, String str) {
        sendReportData(i, i2);
        APLog.m161214i("APBaseHttpReq", getClass().getName() + " tryAgain reqTimes = " + this.httpParam.requestTimes + " tryTimes = " + this.httpParam.reTryTimes);
        try {
            APBaseHttpParam aPBaseHttpParam = this.httpParam;
            if (aPBaseHttpParam.requestTimes < aPBaseHttpParam.reTryTimes) {
                aPBaseHttpParam.constructReTryUrl();
                requestProgress();
                return;
            }
            if (aPBaseHttpParam.reqType.equals(HttpWrapperBase.PROTOCAL_HTTPS)) {
                Throwable th = exc;
                while (th != null) {
                    if (!(th instanceof CertificateExpiredException)) {
                        if (!(th instanceof CertificateNotYetValidException)) {
                            th = th.getCause();
                        }
                    }
                    APLog.m161212e("APBaseHttpReq", "您的设备系统时间不正确，请更改");
                    this.httpAns.onError(this, 1100, str);
                    return;
                }
            }
            this.httpAns.onError(this, 1000, str);
            APLog.m161214i("APBaseHttpReq", str);
            exc.getClass();
        } catch (Exception unused) {
        }
    }

    public void constructParam() {
    }

    public byte[] getContent() {
        return this.resultContent;
    }

    public IAPHttpAns getHttpAns() {
        return this.httpAns;
    }

    public void preCreateConnection() {
    }

    public void requestAgain() {
        requestProgress();
    }

    public void run() {
        requestProgress();
        super.run();
    }

    public void setBody() {
    }

    public void setContent(byte[] bArr) {
        this.resultContent = bArr;
    }

    public void setHeader() {
    }

    public void setHttpAns(IAPHttpAns iAPHttpAns) {
        this.httpAns = iAPHttpAns;
    }

    public void setReportUrl(String str, String str2, String str3) {
        this.httpParam.setReportUrl(str, str2, str3);
    }

    public void setUrl(String str, String str2, String str3, String str4) {
        this.httpParam.setUrl(str, str2, str3, str4);
    }

    public void startRequest() {
        start();
    }

    public void stopRequest() {
        this.isStop = true;
        this.httpAns.onStop(this);
    }
}
