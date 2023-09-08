package com.tencent.tmassistantsdk.network;

import com.p013qq.taf.jce.JceStruct;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.tmassistantsdk.util.TMLog;
import org.apache.http.client.methods.HttpPost;
import zt3.C119157j;

public abstract class PostHttpRequest {
    public static final String REQUEST_SERVER_URL = (HttpWrapperBase.PROTOCAL_HTTP + WeChatHosts.domainString(C0966R.string.flx) + "/");
    public static final String TAG = "BaseHttpRequest";
    public HttpPost mHttpPost = null;

    public synchronized void cancleRequest() {
        HttpPost httpPost = this.mHttpPost;
        if (httpPost != null && !httpPost.isAborted()) {
            TMLog.m164114i(TAG, "BaseHttpRequest:" + this + " cancleRequest");
            try {
                this.mHttpPost.abort();
            } catch (Exception e) {
                try {
                    Log.printErrStackTrace(TAG, e, "", new Object[0]);
                } catch (Throwable th) {
                    this.mHttpPost = null;
                    throw th;
                }
            }
            this.mHttpPost = null;
        }
    }

    public abstract void onFinished(JceStruct jceStruct, JceStruct jceStruct2, int i);

    public synchronized boolean sendRequest(final JceStruct jceStruct) {
        if (jceStruct == null) {
            return false;
        }
        if (this.mHttpPost != null) {
            return false;
        }
        ((C119157j) C119157j.f356862d).mo183884o(new Runnable() {
            /* JADX WARNING: Removed duplicated region for block: B:62:0x011c  */
            /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
            /* JADX WARNING: Unknown top exception splitter block from list: {B:38:0x00c2=Splitter:B:38:0x00c2, B:56:0x0102=Splitter:B:56:0x0102, B:44:0x00d9=Splitter:B:44:0x00d9, B:50:0x00ee=Splitter:B:50:0x00ee} */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r11 = this;
                    java.lang.String r0 = ""
                    java.lang.String r1 = "BaseHttpRequest"
                    com.qq.taf.jce.JceStruct r2 = r4
                    com.tencent.tmassistantsdk.protocol.jce.Request r2 = com.tencent.tmassistantsdk.protocol.ProtocolPackage.buildRequest(r2)
                    byte[] r3 = com.tencent.tmassistantsdk.protocol.ProtocolPackage.buildPostData(r2)
                    com.tencent.tmassistantsdk.network.PostHttpRequest r4 = com.tencent.tmassistantsdk.network.PostHttpRequest.this
                    org.apache.http.client.methods.HttpPost r5 = new org.apache.http.client.methods.HttpPost
                    java.lang.String r6 = com.tencent.tmassistantsdk.network.PostHttpRequest.REQUEST_SERVER_URL
                    r5.<init>(r6)
                    r4.mHttpPost = r5
                    com.tencent.tmassistantsdk.network.PostHttpRequest r4 = com.tencent.tmassistantsdk.network.PostHttpRequest.this
                    org.apache.http.client.methods.HttpPost r4 = r4.mHttpPost
                    java.lang.String r5 = "User-Agent"
                    java.lang.String r6 = "AssistantDownloader"
                    r4.addHeader(r5, r6)
                    com.tencent.tmassistantsdk.network.PostHttpRequest r4 = com.tencent.tmassistantsdk.network.PostHttpRequest.this
                    org.apache.http.client.methods.HttpPost r4 = r4.mHttpPost
                    org.apache.http.entity.ByteArrayEntity r5 = new org.apache.http.entity.ByteArrayEntity
                    r5.<init>(r3)
                    r4.setEntity(r5)
                    r3 = 0
                    r4 = 0
                    org.apache.http.client.HttpClient r5 = com.tencent.tmassistantsdk.downloadservice.HttpClientUtil.createHttpClient()     // Catch:{ ConnectTimeoutException -> 0x0100, ConnectException -> 0x00ec, SocketTimeoutException -> 0x00d7, Exception -> 0x00c0, all -> 0x00bd }
                    com.tencent.tmassistantsdk.downloadservice.HttpClientUtil.setProxy(r5)     // Catch:{ ConnectTimeoutException -> 0x00bb, ConnectException -> 0x00b9, SocketTimeoutException -> 0x00b7, Exception -> 0x00b5 }
                    com.tencent.tmassistantsdk.network.PostHttpRequest r6 = com.tencent.tmassistantsdk.network.PostHttpRequest.this     // Catch:{ ConnectTimeoutException -> 0x00bb, ConnectException -> 0x00b9, SocketTimeoutException -> 0x00b7, Exception -> 0x00b5 }
                    org.apache.http.client.methods.HttpPost r6 = r6.mHttpPost     // Catch:{ ConnectTimeoutException -> 0x00bb, ConnectException -> 0x00b9, SocketTimeoutException -> 0x00b7, Exception -> 0x00b5 }
                    org.apache.http.HttpResponse r6 = r5.execute(r6)     // Catch:{ ConnectTimeoutException -> 0x00bb, ConnectException -> 0x00b9, SocketTimeoutException -> 0x00b7, Exception -> 0x00b5 }
                    if (r6 == 0) goto L_0x00a5
                    org.apache.http.StatusLine r7 = r6.getStatusLine()     // Catch:{ ConnectTimeoutException -> 0x00bb, ConnectException -> 0x00b9, SocketTimeoutException -> 0x00b7, Exception -> 0x00b5 }
                    int r7 = r7.getStatusCode()     // Catch:{ ConnectTimeoutException -> 0x00bb, ConnectException -> 0x00b9, SocketTimeoutException -> 0x00b7, Exception -> 0x00b5 }
                    r8 = 200(0xc8, float:2.8E-43)
                    if (r7 != r8) goto L_0x00a5
                    org.apache.http.HttpEntity r6 = r6.getEntity()     // Catch:{ ConnectTimeoutException -> 0x00bb, ConnectException -> 0x00b9, SocketTimeoutException -> 0x00b7, Exception -> 0x00b5 }
                    if (r6 == 0) goto L_0x00a5
                    org.apache.http.util.ByteArrayBuffer r7 = new org.apache.http.util.ByteArrayBuffer     // Catch:{ ConnectTimeoutException -> 0x00bb, ConnectException -> 0x00b9, SocketTimeoutException -> 0x00b7, Exception -> 0x00b5 }
                    long r8 = r6.getContentLength()     // Catch:{ ConnectTimeoutException -> 0x00bb, ConnectException -> 0x00b9, SocketTimeoutException -> 0x00b7, Exception -> 0x00b5 }
                    int r9 = (int) r8     // Catch:{ ConnectTimeoutException -> 0x00bb, ConnectException -> 0x00b9, SocketTimeoutException -> 0x00b7, Exception -> 0x00b5 }
                    r7.<init>(r9)     // Catch:{ ConnectTimeoutException -> 0x00bb, ConnectException -> 0x00b9, SocketTimeoutException -> 0x00b7, Exception -> 0x00b5 }
                    java.io.InputStream r6 = r6.getContent()     // Catch:{ ConnectTimeoutException -> 0x00bb, ConnectException -> 0x00b9, SocketTimeoutException -> 0x00b7, Exception -> 0x00b5 }
                    r8 = 2048(0x800, float:2.87E-42)
                    byte[] r8 = new byte[r8]     // Catch:{ ConnectTimeoutException -> 0x00bb, ConnectException -> 0x00b9, SocketTimeoutException -> 0x00b7, Exception -> 0x00b5 }
                L_0x0067:
                    int r9 = r6.read(r8)     // Catch:{ ConnectTimeoutException -> 0x00bb, ConnectException -> 0x00b9, SocketTimeoutException -> 0x00b7, Exception -> 0x00b5 }
                    r10 = -1
                    if (r9 == r10) goto L_0x0072
                    r7.append(r8, r3, r9)     // Catch:{ ConnectTimeoutException -> 0x00bb, ConnectException -> 0x00b9, SocketTimeoutException -> 0x00b7, Exception -> 0x00b5 }
                    goto L_0x0067
                L_0x0072:
                    byte[] r6 = r7.buffer()     // Catch:{ ConnectTimeoutException -> 0x00bb, ConnectException -> 0x00b9, SocketTimeoutException -> 0x00b7, Exception -> 0x00b5 }
                    if (r6 == 0) goto L_0x00a5
                    int r7 = r6.length     // Catch:{ ConnectTimeoutException -> 0x00bb, ConnectException -> 0x00b9, SocketTimeoutException -> 0x00b7, Exception -> 0x00b5 }
                    r8 = 4
                    if (r7 <= r8) goto L_0x00a5
                    com.tencent.tmassistantsdk.protocol.jce.Response r6 = com.tencent.tmassistantsdk.protocol.ProtocolPackage.unpackPackage(r6)     // Catch:{ ConnectTimeoutException -> 0x00bb, ConnectException -> 0x00b9, SocketTimeoutException -> 0x00b7, Exception -> 0x00b5 }
                    if (r6 == 0) goto L_0x00a5
                    byte[] r7 = r6.body     // Catch:{ ConnectTimeoutException -> 0x00bb, ConnectException -> 0x00b9, SocketTimeoutException -> 0x00b7, Exception -> 0x00b5 }
                    if (r7 == 0) goto L_0x00a5
                    com.qq.taf.jce.JceStruct r8 = r4     // Catch:{ ConnectTimeoutException -> 0x00bb, ConnectException -> 0x00b9, SocketTimeoutException -> 0x00b7, Exception -> 0x00b5 }
                    com.qq.taf.jce.JceStruct r7 = com.tencent.tmassistantsdk.protocol.ProtocolPackage.unpageageJceResponse(r8, r7)     // Catch:{ ConnectTimeoutException -> 0x00bb, ConnectException -> 0x00b9, SocketTimeoutException -> 0x00b7, Exception -> 0x00b5 }
                    if (r7 == 0) goto L_0x00a5
                    com.tencent.tmassistantsdk.network.PostHttpRequest r8 = com.tencent.tmassistantsdk.network.PostHttpRequest.this     // Catch:{ ConnectTimeoutException -> 0x00bb, ConnectException -> 0x00b9, SocketTimeoutException -> 0x00b7, Exception -> 0x00b5 }
                    com.qq.taf.jce.JceStruct r9 = r4     // Catch:{ ConnectTimeoutException -> 0x00bb, ConnectException -> 0x00b9, SocketTimeoutException -> 0x00b7, Exception -> 0x00b5 }
                    com.tencent.tmassistantsdk.protocol.jce.RspHead r6 = r6.head     // Catch:{ ConnectTimeoutException -> 0x00bb, ConnectException -> 0x00b9, SocketTimeoutException -> 0x00b7, Exception -> 0x00b5 }
                    int r6 = r6.ret     // Catch:{ ConnectTimeoutException -> 0x00bb, ConnectException -> 0x00b9, SocketTimeoutException -> 0x00b7, Exception -> 0x00b5 }
                    r8.onFinished(r9, r7, r6)     // Catch:{ ConnectTimeoutException -> 0x00bb, ConnectException -> 0x00b9, SocketTimeoutException -> 0x00b7, Exception -> 0x00b5 }
                    com.tencent.tmassistantsdk.network.PostHttpRequest r0 = com.tencent.tmassistantsdk.network.PostHttpRequest.this
                    r0.mHttpPost = r4
                    org.apache.http.conn.ClientConnectionManager r0 = r5.getConnectionManager()
                    r0.shutdown()
                    return
                L_0x00a5:
                    com.tencent.tmassistantsdk.network.PostHttpRequest r0 = com.tencent.tmassistantsdk.network.PostHttpRequest.this
                    r0.mHttpPost = r4
                L_0x00a9:
                    org.apache.http.conn.ClientConnectionManager r0 = r5.getConnectionManager()
                    r0.shutdown()
                    goto L_0x0115
                L_0x00b2:
                    r0 = move-exception
                    goto L_0x0116
                L_0x00b5:
                    r2 = move-exception
                    goto L_0x00c2
                L_0x00b7:
                    r6 = move-exception
                    goto L_0x00d9
                L_0x00b9:
                    r6 = move-exception
                    goto L_0x00ee
                L_0x00bb:
                    r6 = move-exception
                    goto L_0x0102
                L_0x00bd:
                    r0 = move-exception
                    r5 = r4
                    goto L_0x0116
                L_0x00c0:
                    r2 = move-exception
                    r5 = r4
                L_0x00c2:
                    java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x00b2 }
                    com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r2, r0, r3)     // Catch:{ all -> 0x00b2 }
                    com.tencent.tmassistantsdk.network.PostHttpRequest r0 = com.tencent.tmassistantsdk.network.PostHttpRequest.this     // Catch:{ all -> 0x00b2 }
                    com.qq.taf.jce.JceStruct r1 = r4     // Catch:{ all -> 0x00b2 }
                    r2 = 604(0x25c, float:8.46E-43)
                    r0.onFinished(r1, r4, r2)     // Catch:{ all -> 0x00b2 }
                    com.tencent.tmassistantsdk.network.PostHttpRequest r0 = com.tencent.tmassistantsdk.network.PostHttpRequest.this
                    r0.mHttpPost = r4
                    if (r5 == 0) goto L_0x0115
                    goto L_0x00a9
                L_0x00d7:
                    r6 = move-exception
                    r5 = r4
                L_0x00d9:
                    java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x00b2 }
                    com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r6, r0, r3)     // Catch:{ all -> 0x00b2 }
                    com.tencent.tmassistantsdk.network.PostHttpRequest r0 = com.tencent.tmassistantsdk.network.PostHttpRequest.this     // Catch:{ all -> 0x00b2 }
                    r1 = 602(0x25a, float:8.44E-43)
                    r0.onFinished(r2, r4, r1)     // Catch:{ all -> 0x00b2 }
                    com.tencent.tmassistantsdk.network.PostHttpRequest r0 = com.tencent.tmassistantsdk.network.PostHttpRequest.this
                    r0.mHttpPost = r4
                    if (r5 == 0) goto L_0x0115
                    goto L_0x00a9
                L_0x00ec:
                    r6 = move-exception
                    r5 = r4
                L_0x00ee:
                    java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x00b2 }
                    com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r6, r0, r3)     // Catch:{ all -> 0x00b2 }
                    com.tencent.tmassistantsdk.network.PostHttpRequest r0 = com.tencent.tmassistantsdk.network.PostHttpRequest.this     // Catch:{ all -> 0x00b2 }
                    r1 = 1
                    r0.onFinished(r2, r4, r1)     // Catch:{ all -> 0x00b2 }
                    com.tencent.tmassistantsdk.network.PostHttpRequest r0 = com.tencent.tmassistantsdk.network.PostHttpRequest.this
                    r0.mHttpPost = r4
                    if (r5 == 0) goto L_0x0115
                    goto L_0x00a9
                L_0x0100:
                    r6 = move-exception
                    r5 = r4
                L_0x0102:
                    java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x00b2 }
                    com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r6, r0, r3)     // Catch:{ all -> 0x00b2 }
                    com.tencent.tmassistantsdk.network.PostHttpRequest r0 = com.tencent.tmassistantsdk.network.PostHttpRequest.this     // Catch:{ all -> 0x00b2 }
                    r1 = 601(0x259, float:8.42E-43)
                    r0.onFinished(r2, r4, r1)     // Catch:{ all -> 0x00b2 }
                    com.tencent.tmassistantsdk.network.PostHttpRequest r0 = com.tencent.tmassistantsdk.network.PostHttpRequest.this
                    r0.mHttpPost = r4
                    if (r5 == 0) goto L_0x0115
                    goto L_0x00a9
                L_0x0115:
                    return
                L_0x0116:
                    com.tencent.tmassistantsdk.network.PostHttpRequest r1 = com.tencent.tmassistantsdk.network.PostHttpRequest.this
                    r1.mHttpPost = r4
                    if (r5 == 0) goto L_0x0123
                    org.apache.http.conn.ClientConnectionManager r1 = r5.getConnectionManager()
                    r1.shutdown()
                L_0x0123:
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmassistantsdk.network.PostHttpRequest.C1164271.run():void");
            }
        });
        return false;
    }
}
