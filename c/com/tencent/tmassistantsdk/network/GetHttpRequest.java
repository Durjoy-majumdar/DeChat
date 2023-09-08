package com.tencent.tmassistantsdk.network;

import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import org.apache.http.client.methods.HttpGet;
import org.json.JSONObject;
import zt3.C119157j;

public abstract class GetHttpRequest {
    public static final String REQUEST_SERVER_URL = (HttpWrapperBase.PROTOCAL_HTTP + WeChatHosts.domainString(C0966R.string.flh) + "/cgi-bin/appstage/yyb_get_userapp_info");
    public static final String TAG = "NetworkTask";
    public HttpGet mHttpGet = null;

    public abstract void onFinished(JSONObject jSONObject, int i);

    public synchronized boolean sendData(final String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.mHttpGet != null) {
            return false;
        }
        ((C119157j) C119157j.f356862d).mo183884o(new Runnable() {
            /* JADX WARNING: Removed duplicated region for block: B:66:0x0128  */
            /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
            /* JADX WARNING: Unknown top exception splitter block from list: {B:52:0x00f3=Splitter:B:52:0x00f3, B:58:0x0107=Splitter:B:58:0x0107, B:40:0x00c9=Splitter:B:40:0x00c9, B:46:0x00de=Splitter:B:46:0x00de} */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r9 = this;
                    java.lang.String r0 = ""
                    java.lang.String r1 = "NetworkTask"
                    java.lang.String r2 = r4
                    r3 = 0
                    r4 = 0
                    com.tencent.tmassistantsdk.network.GetHttpRequest r5 = com.tencent.tmassistantsdk.network.GetHttpRequest.this     // Catch:{ ConnectTimeoutException -> 0x0105, ConnectException -> 0x00f1, SocketTimeoutException -> 0x00dc, Exception -> 0x00c7, all -> 0x00c4 }
                    org.apache.http.client.methods.HttpGet r6 = new org.apache.http.client.methods.HttpGet     // Catch:{ ConnectTimeoutException -> 0x0105, ConnectException -> 0x00f1, SocketTimeoutException -> 0x00dc, Exception -> 0x00c7, all -> 0x00c4 }
                    r6.<init>()     // Catch:{ ConnectTimeoutException -> 0x0105, ConnectException -> 0x00f1, SocketTimeoutException -> 0x00dc, Exception -> 0x00c7, all -> 0x00c4 }
                    r5.mHttpGet = r6     // Catch:{ ConnectTimeoutException -> 0x0105, ConnectException -> 0x00f1, SocketTimeoutException -> 0x00dc, Exception -> 0x00c7, all -> 0x00c4 }
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ ConnectTimeoutException -> 0x0105, ConnectException -> 0x00f1, SocketTimeoutException -> 0x00dc, Exception -> 0x00c7, all -> 0x00c4 }
                    r5.<init>()     // Catch:{ ConnectTimeoutException -> 0x0105, ConnectException -> 0x00f1, SocketTimeoutException -> 0x00dc, Exception -> 0x00c7, all -> 0x00c4 }
                    java.lang.String r6 = com.tencent.tmassistantsdk.network.GetHttpRequest.REQUEST_SERVER_URL     // Catch:{ ConnectTimeoutException -> 0x0105, ConnectException -> 0x00f1, SocketTimeoutException -> 0x00dc, Exception -> 0x00c7, all -> 0x00c4 }
                    r5.append(r6)     // Catch:{ ConnectTimeoutException -> 0x0105, ConnectException -> 0x00f1, SocketTimeoutException -> 0x00dc, Exception -> 0x00c7, all -> 0x00c4 }
                    r5.append(r2)     // Catch:{ ConnectTimeoutException -> 0x0105, ConnectException -> 0x00f1, SocketTimeoutException -> 0x00dc, Exception -> 0x00c7, all -> 0x00c4 }
                    java.lang.String r2 = r5.toString()     // Catch:{ ConnectTimeoutException -> 0x0105, ConnectException -> 0x00f1, SocketTimeoutException -> 0x00dc, Exception -> 0x00c7, all -> 0x00c4 }
                    com.tencent.tmassistantsdk.network.GetHttpRequest r5 = com.tencent.tmassistantsdk.network.GetHttpRequest.this     // Catch:{ ConnectTimeoutException -> 0x0105, ConnectException -> 0x00f1, SocketTimeoutException -> 0x00dc, Exception -> 0x00c7, all -> 0x00c4 }
                    org.apache.http.client.methods.HttpGet r5 = r5.mHttpGet     // Catch:{ ConnectTimeoutException -> 0x0105, ConnectException -> 0x00f1, SocketTimeoutException -> 0x00dc, Exception -> 0x00c7, all -> 0x00c4 }
                    java.net.URI r6 = new java.net.URI     // Catch:{ ConnectTimeoutException -> 0x0105, ConnectException -> 0x00f1, SocketTimeoutException -> 0x00dc, Exception -> 0x00c7, all -> 0x00c4 }
                    r6.<init>(r2)     // Catch:{ ConnectTimeoutException -> 0x0105, ConnectException -> 0x00f1, SocketTimeoutException -> 0x00dc, Exception -> 0x00c7, all -> 0x00c4 }
                    r5.setURI(r6)     // Catch:{ ConnectTimeoutException -> 0x0105, ConnectException -> 0x00f1, SocketTimeoutException -> 0x00dc, Exception -> 0x00c7, all -> 0x00c4 }
                    org.apache.http.client.HttpClient r2 = com.tencent.tmassistantsdk.downloadservice.HttpClientUtil.createHttpClient()     // Catch:{ ConnectTimeoutException -> 0x0105, ConnectException -> 0x00f1, SocketTimeoutException -> 0x00dc, Exception -> 0x00c7, all -> 0x00c4 }
                    com.tencent.tmassistantsdk.downloadservice.HttpClientUtil.setProxy(r2)     // Catch:{ ConnectTimeoutException -> 0x00c2, ConnectException -> 0x00c0, SocketTimeoutException -> 0x00be, Exception -> 0x00bc }
                    com.tencent.tmassistantsdk.network.GetHttpRequest r5 = com.tencent.tmassistantsdk.network.GetHttpRequest.this     // Catch:{ ConnectTimeoutException -> 0x00c2, ConnectException -> 0x00c0, SocketTimeoutException -> 0x00be, Exception -> 0x00bc }
                    org.apache.http.client.methods.HttpGet r5 = r5.mHttpGet     // Catch:{ ConnectTimeoutException -> 0x00c2, ConnectException -> 0x00c0, SocketTimeoutException -> 0x00be, Exception -> 0x00bc }
                    org.apache.http.HttpResponse r5 = r2.execute(r5)     // Catch:{ ConnectTimeoutException -> 0x00c2, ConnectException -> 0x00c0, SocketTimeoutException -> 0x00be, Exception -> 0x00bc }
                    r6 = 704(0x2c0, float:9.87E-43)
                    if (r5 == 0) goto L_0x00b2
                    org.apache.http.StatusLine r7 = r5.getStatusLine()     // Catch:{ ConnectTimeoutException -> 0x00c2, ConnectException -> 0x00c0, SocketTimeoutException -> 0x00be, Exception -> 0x00bc }
                    int r7 = r7.getStatusCode()     // Catch:{ ConnectTimeoutException -> 0x00c2, ConnectException -> 0x00c0, SocketTimeoutException -> 0x00be, Exception -> 0x00bc }
                    r8 = 200(0xc8, float:2.8E-43)
                    if (r7 != r8) goto L_0x00b2
                    org.apache.http.HttpEntity r5 = r5.getEntity()     // Catch:{ ConnectTimeoutException -> 0x00c2, ConnectException -> 0x00c0, SocketTimeoutException -> 0x00be, Exception -> 0x00bc }
                    if (r5 == 0) goto L_0x00b2
                    byte[] r5 = org.apache.http.util.EntityUtils.toByteArray(r5)     // Catch:{ ConnectTimeoutException -> 0x00c2, ConnectException -> 0x00c0, SocketTimeoutException -> 0x00be, Exception -> 0x00bc }
                    if (r5 == 0) goto L_0x009c
                    int r7 = r5.length     // Catch:{ ConnectTimeoutException -> 0x00c2, ConnectException -> 0x00c0, SocketTimeoutException -> 0x00be, Exception -> 0x00bc }
                    if (r7 <= 0) goto L_0x009c
                    java.lang.String r6 = new java.lang.String     // Catch:{ ConnectTimeoutException -> 0x00c2, ConnectException -> 0x00c0, SocketTimeoutException -> 0x00be, Exception -> 0x00bc }
                    java.lang.String r7 = "utf-8"
                    r6.<init>(r5, r7)     // Catch:{ ConnectTimeoutException -> 0x00c2, ConnectException -> 0x00c0, SocketTimeoutException -> 0x00be, Exception -> 0x00bc }
                    boolean r5 = android.text.TextUtils.isEmpty(r6)     // Catch:{ ConnectTimeoutException -> 0x00c2, ConnectException -> 0x00c0, SocketTimeoutException -> 0x00be, Exception -> 0x00bc }
                    if (r5 != 0) goto L_0x0084
                    org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ ConnectTimeoutException -> 0x00c2, ConnectException -> 0x00c0, SocketTimeoutException -> 0x00be, Exception -> 0x00bc }
                    r5.<init>(r6)     // Catch:{ ConnectTimeoutException -> 0x00c2, ConnectException -> 0x00c0, SocketTimeoutException -> 0x00be, Exception -> 0x00bc }
                    java.lang.String r6 = "success to received data"
                    com.tencent.tmassistantsdk.util.TMLog.m164114i(r1, r6)     // Catch:{ ConnectTimeoutException -> 0x00c2, ConnectException -> 0x00c0, SocketTimeoutException -> 0x00be, Exception -> 0x00bc }
                    com.tencent.tmassistantsdk.network.GetHttpRequest r6 = com.tencent.tmassistantsdk.network.GetHttpRequest.this     // Catch:{ ConnectTimeoutException -> 0x00c2, ConnectException -> 0x00c0, SocketTimeoutException -> 0x00be, Exception -> 0x00bc }
                    r6.onFinished(r5, r3)     // Catch:{ ConnectTimeoutException -> 0x00c2, ConnectException -> 0x00c0, SocketTimeoutException -> 0x00be, Exception -> 0x00bc }
                    com.tencent.tmassistantsdk.network.GetHttpRequest r0 = com.tencent.tmassistantsdk.network.GetHttpRequest.this
                    r0.mHttpGet = r4
                    org.apache.http.conn.ClientConnectionManager r0 = r2.getConnectionManager()
                    r0.shutdown()
                    return
                L_0x0084:
                    java.lang.String r5 = "failed to convert byte[] to string"
                    com.tencent.tmassistantsdk.util.TMLog.m164114i(r1, r5)     // Catch:{ ConnectTimeoutException -> 0x00c2, ConnectException -> 0x00c0, SocketTimeoutException -> 0x00be, Exception -> 0x00bc }
                    com.tencent.tmassistantsdk.network.GetHttpRequest r5 = com.tencent.tmassistantsdk.network.GetHttpRequest.this     // Catch:{ ConnectTimeoutException -> 0x00c2, ConnectException -> 0x00c0, SocketTimeoutException -> 0x00be, Exception -> 0x00bc }
                    r6 = 606(0x25e, float:8.49E-43)
                    r5.onFinished(r4, r6)     // Catch:{ ConnectTimeoutException -> 0x00c2, ConnectException -> 0x00c0, SocketTimeoutException -> 0x00be, Exception -> 0x00bc }
                    com.tencent.tmassistantsdk.network.GetHttpRequest r0 = com.tencent.tmassistantsdk.network.GetHttpRequest.this
                    r0.mHttpGet = r4
                    org.apache.http.conn.ClientConnectionManager r0 = r2.getConnectionManager()
                    r0.shutdown()
                    return
                L_0x009c:
                    java.lang.String r5 = "data invalidate"
                    com.tencent.tmassistantsdk.util.TMLog.m164114i(r1, r5)     // Catch:{ ConnectTimeoutException -> 0x00c2, ConnectException -> 0x00c0, SocketTimeoutException -> 0x00be, Exception -> 0x00bc }
                    com.tencent.tmassistantsdk.network.GetHttpRequest r5 = com.tencent.tmassistantsdk.network.GetHttpRequest.this     // Catch:{ ConnectTimeoutException -> 0x00c2, ConnectException -> 0x00c0, SocketTimeoutException -> 0x00be, Exception -> 0x00bc }
                    r5.onFinished(r4, r6)     // Catch:{ ConnectTimeoutException -> 0x00c2, ConnectException -> 0x00c0, SocketTimeoutException -> 0x00be, Exception -> 0x00bc }
                    com.tencent.tmassistantsdk.network.GetHttpRequest r0 = com.tencent.tmassistantsdk.network.GetHttpRequest.this
                    r0.mHttpGet = r4
                    org.apache.http.conn.ClientConnectionManager r0 = r2.getConnectionManager()
                    r0.shutdown()
                    return
                L_0x00b2:
                    com.tencent.tmassistantsdk.network.GetHttpRequest r5 = com.tencent.tmassistantsdk.network.GetHttpRequest.this     // Catch:{ ConnectTimeoutException -> 0x00c2, ConnectException -> 0x00c0, SocketTimeoutException -> 0x00be, Exception -> 0x00bc }
                    r5.onFinished(r4, r6)     // Catch:{ ConnectTimeoutException -> 0x00c2, ConnectException -> 0x00c0, SocketTimeoutException -> 0x00be, Exception -> 0x00bc }
                    com.tencent.tmassistantsdk.network.GetHttpRequest r0 = com.tencent.tmassistantsdk.network.GetHttpRequest.this
                    r0.mHttpGet = r4
                    goto L_0x0119
                L_0x00bc:
                    r5 = move-exception
                    goto L_0x00c9
                L_0x00be:
                    r5 = move-exception
                    goto L_0x00de
                L_0x00c0:
                    r5 = move-exception
                    goto L_0x00f3
                L_0x00c2:
                    r5 = move-exception
                    goto L_0x0107
                L_0x00c4:
                    r0 = move-exception
                    r2 = r4
                    goto L_0x0122
                L_0x00c7:
                    r5 = move-exception
                    r2 = r4
                L_0x00c9:
                    java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0121 }
                    com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r5, r0, r3)     // Catch:{ all -> 0x0121 }
                    com.tencent.tmassistantsdk.network.GetHttpRequest r0 = com.tencent.tmassistantsdk.network.GetHttpRequest.this     // Catch:{ all -> 0x0121 }
                    r1 = 604(0x25c, float:8.46E-43)
                    r0.onFinished(r4, r1)     // Catch:{ all -> 0x0121 }
                    com.tencent.tmassistantsdk.network.GetHttpRequest r0 = com.tencent.tmassistantsdk.network.GetHttpRequest.this
                    r0.mHttpGet = r4
                    if (r2 == 0) goto L_0x0120
                    goto L_0x0119
                L_0x00dc:
                    r5 = move-exception
                    r2 = r4
                L_0x00de:
                    java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0121 }
                    com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r5, r0, r3)     // Catch:{ all -> 0x0121 }
                    com.tencent.tmassistantsdk.network.GetHttpRequest r0 = com.tencent.tmassistantsdk.network.GetHttpRequest.this     // Catch:{ all -> 0x0121 }
                    r1 = 602(0x25a, float:8.44E-43)
                    r0.onFinished(r4, r1)     // Catch:{ all -> 0x0121 }
                    com.tencent.tmassistantsdk.network.GetHttpRequest r0 = com.tencent.tmassistantsdk.network.GetHttpRequest.this
                    r0.mHttpGet = r4
                    if (r2 == 0) goto L_0x0120
                    goto L_0x0119
                L_0x00f1:
                    r5 = move-exception
                    r2 = r4
                L_0x00f3:
                    java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0121 }
                    com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r5, r0, r3)     // Catch:{ all -> 0x0121 }
                    com.tencent.tmassistantsdk.network.GetHttpRequest r0 = com.tencent.tmassistantsdk.network.GetHttpRequest.this     // Catch:{ all -> 0x0121 }
                    r1 = 1
                    r0.onFinished(r4, r1)     // Catch:{ all -> 0x0121 }
                    com.tencent.tmassistantsdk.network.GetHttpRequest r0 = com.tencent.tmassistantsdk.network.GetHttpRequest.this
                    r0.mHttpGet = r4
                    if (r2 == 0) goto L_0x0120
                    goto L_0x0119
                L_0x0105:
                    r5 = move-exception
                    r2 = r4
                L_0x0107:
                    java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0121 }
                    com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r5, r0, r3)     // Catch:{ all -> 0x0121 }
                    com.tencent.tmassistantsdk.network.GetHttpRequest r0 = com.tencent.tmassistantsdk.network.GetHttpRequest.this     // Catch:{ all -> 0x0121 }
                    r1 = 601(0x259, float:8.42E-43)
                    r0.onFinished(r4, r1)     // Catch:{ all -> 0x0121 }
                    com.tencent.tmassistantsdk.network.GetHttpRequest r0 = com.tencent.tmassistantsdk.network.GetHttpRequest.this
                    r0.mHttpGet = r4
                    if (r2 == 0) goto L_0x0120
                L_0x0119:
                    org.apache.http.conn.ClientConnectionManager r0 = r2.getConnectionManager()
                    r0.shutdown()
                L_0x0120:
                    return
                L_0x0121:
                    r0 = move-exception
                L_0x0122:
                    com.tencent.tmassistantsdk.network.GetHttpRequest r1 = com.tencent.tmassistantsdk.network.GetHttpRequest.this
                    r1.mHttpGet = r4
                    if (r2 == 0) goto L_0x012f
                    org.apache.http.conn.ClientConnectionManager r1 = r2.getConnectionManager()
                    r1.shutdown()
                L_0x012f:
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmassistantsdk.network.GetHttpRequest.C1164261.run():void");
            }
        });
        return false;
    }
}
