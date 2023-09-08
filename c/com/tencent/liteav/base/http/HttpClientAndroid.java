package com.tencent.liteav.base.http;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.tencent.ilink.auth.FaceProto;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.Authenticator;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.PasswordAuthentication;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import javax.net.ssl.SSLException;

@JNINamespace("liteav")
public class HttpClientAndroid {
    private static final int ERROR_CODE_INVALID_REQUEST = 0;
    private static final String HTTPS_PREFIX = "https://";
    private static final String HTTP_PREFIX = "http://";
    private static final String METHOD_GET = "GET";
    private static final String METHOD_POST = "POST";
    private static final int READ_STREAM_SIZE = 1388;
    private static final String TAG = "HttpClientAndroid";
    private HttpURLConnection mConnection;
    private final C17096b mHttpConfig;
    private final Handler mHttpHandler;
    private volatile C17097c mInternalState = C17097c.NONE;
    private String mLastRequestURL;
    private final Object mLocker = new Object();
    private long mNativeHttpClientAndroidJni;
    private final ConcurrentHashMap<Long, C17098d> mRunningRequestMap = new ConcurrentHashMap<>();

    /* renamed from: com.tencent.liteav.base.http.HttpClientAndroid$a */
    public static class C17095a extends Authenticator {

        /* renamed from: a */
        public String f46087a;

        /* renamed from: b */
        public String f46088b;

        public C17095a(String str, String str2) {
            this.f46087a = str;
            this.f46088b = str2;
        }

        public final PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(this.f46087a, this.f46088b.toCharArray());
        }
    }

    /* renamed from: com.tencent.liteav.base.http.HttpClientAndroid$b */
    public static class C17096b {

        /* renamed from: a */
        public int f46089a;

        /* renamed from: b */
        public int f46090b;

        /* renamed from: c */
        public int f46091c;

        /* renamed from: d */
        public boolean f46092d;

        /* renamed from: e */
        public int f46093e;

        /* renamed from: f */
        public String f46094f;

        /* renamed from: g */
        public String f46095g;

        /* renamed from: h */
        public String f46096h;

        public C17096b(int i, int i2, int i3, boolean z, int i4, String str, String str2, String str3) {
            this.f46089a = i;
            this.f46090b = i2;
            this.f46091c = i3;
            this.f46092d = z;
            this.f46093e = i4;
            this.f46094f = str;
            this.f46095g = str2;
            this.f46096h = str3;
        }
    }

    /* renamed from: com.tencent.liteav.base.http.HttpClientAndroid$c */
    public enum C17097c {
        NONE,
        RUNNING_REPEAT,
        RUNNING_ONCE
    }

    /* renamed from: com.tencent.liteav.base.http.HttpClientAndroid$d */
    public static class C17098d {

        /* renamed from: a */
        public long f46101a;

        /* renamed from: b */
        public String f46102b;

        /* renamed from: c */
        public String f46103c;

        /* renamed from: d */
        public byte[] f46104d;

        /* renamed from: e */
        public Map<String, String> f46105e;

        public C17098d(String str, String str2, byte[] bArr, Map<String, String> map) {
            this.f46102b = str;
            this.f46103c = str2;
            this.f46104d = bArr;
            this.f46105e = map;
        }

        /* renamed from: a */
        public final boolean mo19348a() {
            byte[] bArr = this.f46104d;
            return bArr != null && bArr.length > 0;
        }

        /* renamed from: b */
        public final boolean mo19349b() {
            return HttpClientAndroid.METHOD_POST.equals(mo19350c());
        }

        /* renamed from: c */
        public final String mo19350c() {
            return TextUtils.isEmpty(this.f46103c) ? "" : HttpClientAndroid.METHOD_POST.equalsIgnoreCase(this.f46103c) ? HttpClientAndroid.METHOD_POST : HttpClientAndroid.METHOD_GET.equalsIgnoreCase(this.f46103c) ? HttpClientAndroid.METHOD_GET : "";
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Request{requestId=");
            sb.append(this.f46101a);
            sb.append(", url='");
            sb.append(this.f46102b);
            sb.append('\'');
            sb.append(", method='");
            sb.append(this.f46103c);
            sb.append('\'');
            sb.append(", body.size=");
            sb.append(mo19348a() ? this.f46104d.length : 0);
            sb.append(", headers=");
            sb.append(this.f46105e);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: com.tencent.liteav.base.http.HttpClientAndroid$e */
    public static class C17099e {

        /* renamed from: a */
        public C17101g f46106a = C17101g.kUnknownError;

        /* renamed from: b */
        public String f46107b = "";

        /* renamed from: c */
        public ByteBuffer f46108c;

        /* renamed from: d */
        public int f46109d = 0;

        /* renamed from: e */
        public String f46110e = "";

        /* renamed from: f */
        public Map<String, String> f46111f = null;

        /* renamed from: g */
        public int f46112g = 0;
    }

    /* renamed from: com.tencent.liteav.base.http.HttpClientAndroid$f */
    public enum C17100f {
        CONNECTED(0),
        DISCONNECTED(1),
        FINISHED(2);
        
        public int nativeValue;

        private C17100f(int i) {
            this.nativeValue = i;
        }
    }

    /* renamed from: com.tencent.liteav.base.http.HttpClientAndroid$g */
    public enum C17101g {
        kHTTP200OK(200),
        kHTTP204NoContent(204),
        kHTTP302Found(302),
        kHTTP304NotModified(304),
        kHTTP403Forbidden(403),
        kHTTP404NotFound(404),
        kHTTP503ServiceUnavailable(503),
        kSystemFileOpenFailed(1001),
        kSystemFileWriteFailed(1002),
        kSystemUnknownHost(1003),
        kSystemConnectHostFailed(1004),
        kSystemCreateSocketFailed(1005),
        kSystemNetworkDisabled(1006),
        kSystemConnectTimeout(1007),
        kSystemConnectRefused(1008),
        kSystemProtocolError(1009),
        kSystemSSLError(1010),
        kUnknownError(FaceProto.FaceExtVerifyType.kFaceExtVerifyType_WxPay_End_VALUE);
        
        public final int nativeValue;

        private C17101g(int i) {
            this.nativeValue = i;
        }
    }

    public HttpClientAndroid(int i, int i2, int i3, boolean z, int i4, String str, String str2, String str3, long j) {
        LiteavLog.m16901i(TAG, "Create http client(" + hashCode() + ").");
        this.mHttpConfig = new C17096b(i, i2, i3, z, i4, str, str2, str3);
        this.mNativeHttpClientAndroidJni = j;
        HandlerThread handlerThread = new HandlerThread("HttpClient_" + hashCode());
        handlerThread.start();
        this.mHttpHandler = new Handler(handlerThread.getLooper());
    }

    private boolean checkNativeValid() {
        boolean z;
        synchronized (this.mLocker) {
            z = this.mNativeHttpClientAndroidJni != -1;
        }
        return z;
    }

    private boolean checkRequestValid(long j) {
        return this.mRunningRequestMap.containsKey(Long.valueOf(j));
    }

    private void closeConnectionSafely(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception unused) {
            }
        }
    }

    private HttpURLConnection createConnection(C17098d dVar) {
        Proxy proxy;
        if (!TextUtils.isEmpty(this.mHttpConfig.f46094f) || this.mHttpConfig.f46093e <= 0) {
            proxy = null;
        } else {
            Proxy.Type type = Proxy.Type.SOCKS;
            C17096b bVar = this.mHttpConfig;
            proxy = new Proxy(type, new InetSocketAddress(bVar.f46094f, bVar.f46093e));
            C17096b bVar2 = this.mHttpConfig;
            Authenticator.setDefault(new C17095a(bVar2.f46095g, bVar2.f46096h));
        }
        URL url = new URL(dVar.f46102b.replace(" ", "%20"));
        HttpURLConnection httpURLConnection = proxy != null ? (HttpURLConnection) url.openConnection(proxy) : (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(true);
        httpURLConnection.setConnectTimeout(this.mHttpConfig.f46089a);
        httpURLConnection.setReadTimeout(this.mHttpConfig.f46090b);
        httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        httpURLConnection.setRequestMethod(dVar.mo19350c());
        if (dVar.mo19349b()) {
            httpURLConnection.setDoOutput(true);
        }
        if (this.mHttpConfig.f46092d) {
            httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
        } else {
            httpURLConnection.setRequestProperty("Connection", "close");
        }
        Map<String, String> map = dVar.f46105e;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry next : dVar.f46105e.entrySet()) {
                httpURLConnection.setRequestProperty((String) next.getKey(), (String) next.getValue());
            }
        }
        return httpURLConnection;
    }

    private void doCleanById(long j, boolean z) {
        this.mRunningRequestMap.remove(Long.valueOf(j));
        if (this.mRunningRequestMap.size() == 0) {
            synchronized (this.mLocker) {
                this.mInternalState = C17097c.NONE;
            }
        }
        if (z) {
            closeConnectionSafely(this.mConnection);
            this.mConnection = null;
        }
    }

    private void doOnCallback(C17100f fVar, long j, C17099e eVar) {
        C17099e eVar2 = eVar;
        synchronized (this.mLocker) {
            if (checkNativeValid() && checkRequestValid(j) && eVar2 != null) {
                nativeOnCallback(this.mNativeHttpClientAndroidJni, C17097c.RUNNING_REPEAT == this.mInternalState, fVar.nativeValue, j, eVar2.f46106a.nativeValue, eVar2.f46107b, eVar2.f46112g, eVar2.f46108c, eVar2.f46110e, eVar2.f46111f, eVar2.f46109d);
            }
        }
    }

    private void doReadData(long j, C17099e eVar) {
        boolean z;
        boolean z2;
        if (!checkRequestValid(j)) {
            LiteavLog.m16905w(TAG, "Do read data failed. Invalid request id. id:".concat(String.valueOf(j)));
            return;
        }
        try {
            InputStream inputStream = this.mConnection.getInputStream();
            synchronized (this.mLocker) {
                z = this.mInternalState == C17097c.RUNNING_ONCE;
            }
            if (z) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[READ_STREAM_SIZE];
                do {
                    try {
                        int read = inputStream.read(bArr);
                        if (read > 0) {
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                        if (read <= 0 || !checkRequestValid(j)) {
                            z2 = false;
                            continue;
                        } else {
                            z2 = true;
                            continue;
                        }
                    } catch (Exception e) {
                        LiteavLog.m16898e(TAG, "Do read data failed. Catch error when reading.");
                        eVar.f46106a = getStatusCode(e);
                        eVar.f46107b = e.toString();
                        doOnCallback(C17100f.DISCONNECTED, j, eVar);
                        doCleanById(j, true);
                        return;
                    }
                } while (z2);
                int size = byteArrayOutputStream.size();
                if (size > 0) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(size);
                    eVar.f46108c = allocateDirect;
                    allocateDirect.put(byteArrayOutputStream.toByteArray(), 0, size);
                    eVar.f46109d = size;
                }
            } else {
                byte[] bArr2 = new byte[READ_STREAM_SIZE];
                try {
                    int read2 = inputStream.read(bArr2);
                    if (read2 > 0) {
                        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(read2);
                        eVar.f46108c = allocateDirect2;
                        allocateDirect2.put(bArr2, 0, read2);
                        eVar.f46109d = read2;
                    }
                } catch (Exception e2) {
                    LiteavLog.m16898e(TAG, "Do read data failed. Catch error when reading.");
                    eVar.f46106a = getStatusCode(e2);
                    eVar.f46107b = e2.toString();
                    doOnCallback(C17100f.DISCONNECTED, j, eVar);
                    doCleanById(j, true);
                    return;
                }
            }
            if (eVar.f46109d == 0 && !z) {
                LiteavLog.m16905w(TAG, "Do read data failed. Rsp size is 0.");
                doOnCallback(C17100f.FINISHED, j, eVar);
                doCleanById(j, true);
            } else if (z) {
                doOnCallback(C17100f.FINISHED, j, eVar);
                doCleanById(j, !this.mHttpConfig.f46092d);
            } else {
                doOnCallback(C17100f.CONNECTED, j, eVar);
                this.mHttpHandler.post(C17105d.m16893a(this, eVar, j));
            }
        } catch (Exception e3) {
            LiteavLog.m16898e(TAG, "Do read data failed. Fail to get InputStream.");
            eVar.f46106a = getStatusCode(e3);
            eVar.f46107b = e3.toString();
            doOnCallback(C17100f.DISCONNECTED, j, eVar);
            doCleanById(j, true);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(13:4|1f|12|(1:18)|19|20|21|22|(2:26|27)|33|34|35|(2:37|38)(2:39|40)) */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c6, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c7, code lost:
        com.tencent.liteav.base.util.LiteavLog.m16898e(TAG, "Do send failed. Catch error.");
        r0.f46106a = getStatusCode(r1);
        r0.f46107b = r1.toString();
        doOnCallback(com.tencent.liteav.base.http.HttpClientAndroid.C17100f.f46114b, r6.f46101a, r0);
        doCleanById(r6.f46101a, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e6, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0074 */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void doRequest(com.tencent.liteav.base.http.HttpClientAndroid.C17098d r6) {
        /*
            r5 = this;
            long r0 = r6.f46101a
            boolean r0 = r5.checkRequestValid(r0)
            if (r0 != 0) goto L_0x0018
            java.lang.String r0 = "HttpClientAndroid"
            java.lang.String r1 = "Do send failed. ignore request when cancelled. request:"
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r6 = r1.concat(r6)
            com.tencent.liteav.base.util.LiteavLog.m16905w(r0, r6)
            return
        L_0x0018:
            com.tencent.liteav.base.http.HttpClientAndroid$e r0 = new com.tencent.liteav.base.http.HttpClientAndroid$e
            r0.<init>()
            java.lang.Object r1 = r5.mLocker
            monitor-enter(r1)
            com.tencent.liteav.base.http.HttpClientAndroid$c r2 = r5.mInternalState     // Catch:{ all -> 0x0108 }
            com.tencent.liteav.base.http.HttpClientAndroid$c r3 = com.tencent.liteav.base.http.HttpClientAndroid.C17097c.RUNNING_ONCE     // Catch:{ all -> 0x0108 }
            r4 = 1
            if (r2 != r3) goto L_0x0029
            r2 = 1
            goto L_0x002a
        L_0x0029:
            r2 = 0
        L_0x002a:
            monitor-exit(r1)     // Catch:{ all -> 0x0108 }
            r1 = 0
            if (r2 == 0) goto L_0x0043
            java.net.HttpURLConnection r2 = r5.mConnection
            if (r2 == 0) goto L_0x0043
            java.lang.String r2 = r6.f46102b
            java.lang.String r3 = r5.mLastRequestURL
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0043
            java.net.HttpURLConnection r2 = r5.mConnection
            r5.closeConnectionSafely(r2)
            r5.mConnection = r1
        L_0x0043:
            java.lang.String r2 = r6.f46102b
            r5.mLastRequestURL = r2
            java.net.HttpURLConnection r2 = r5.createConnection(r6)     // Catch:{ Exception -> 0x00e7 }
            r5.mConnection = r2     // Catch:{ Exception -> 0x00e7 }
            boolean r2 = r6.mo19349b()
            if (r2 == 0) goto L_0x0074
            boolean r2 = r6.mo19348a()
            if (r2 == 0) goto L_0x0074
            java.net.HttpURLConnection r2 = r5.mConnection     // Catch:{ Exception -> 0x0068 }
            java.io.OutputStream r1 = r2.getOutputStream()     // Catch:{ Exception -> 0x0068 }
            byte[] r2 = r6.f46104d     // Catch:{ Exception -> 0x0068 }
            r1.write(r2)     // Catch:{ Exception -> 0x0068 }
            r1.flush()     // Catch:{ Exception -> 0x0068 }
            goto L_0x0074
        L_0x0068:
            java.lang.String r2 = "HttpClientAndroid"
            java.lang.String r3 = "Do send body failed."
            com.tencent.liteav.base.util.LiteavLog.m16905w(r2, r3)
            if (r1 == 0) goto L_0x0074
            r1.close()     // Catch:{ Exception -> 0x0074 }
        L_0x0074:
            java.net.HttpURLConnection r1 = r5.mConnection     // Catch:{ Exception -> 0x00c6 }
            int r1 = r1.getResponseCode()     // Catch:{ Exception -> 0x00c6 }
            com.tencent.liteav.base.http.HttpClientAndroid$g r1 = r5.getStatusCode((int) r1)     // Catch:{ Exception -> 0x00c6 }
            r0.f46106a = r1     // Catch:{ Exception -> 0x00c6 }
            java.net.HttpURLConnection r1 = r5.mConnection     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r1 = r1.getResponseMessage()     // Catch:{ Exception -> 0x00c6 }
            r0.f46107b = r1     // Catch:{ Exception -> 0x00c6 }
            java.net.HttpURLConnection r1 = r5.mConnection     // Catch:{ Exception -> 0x00c6 }
            java.net.URL r1 = r1.getURL()     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r1 = r1.getHost()     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r1 = r5.parseHostAddress(r1)     // Catch:{ Exception -> 0x00c6 }
            r0.f46110e = r1     // Catch:{ Exception -> 0x00c6 }
            java.net.HttpURLConnection r1 = r5.mConnection     // Catch:{ Exception -> 0x00c6 }
            java.net.URL r1 = r1.getURL()     // Catch:{ Exception -> 0x00c6 }
            int r1 = r1.getPort()     // Catch:{ Exception -> 0x00c6 }
            r0.f46112g = r1     // Catch:{ Exception -> 0x00c6 }
            java.net.HttpURLConnection r1 = r5.mConnection     // Catch:{ Exception -> 0x00c6 }
            java.util.Map r1 = r1.getHeaderFields()     // Catch:{ Exception -> 0x00c6 }
            java.util.Map r1 = r5.getResponseHeaders(r1)     // Catch:{ Exception -> 0x00c6 }
            r0.f46111f = r1     // Catch:{ Exception -> 0x00c6 }
            long r1 = r6.f46101a
            boolean r1 = r5.checkRequestValid(r1)
            if (r1 != 0) goto L_0x00c0
            java.lang.String r6 = "HttpClientAndroid"
            java.lang.String r0 = "Do send failed. Invalid request, abort request."
            com.tencent.liteav.base.util.LiteavLog.m16905w(r6, r0)
            return
        L_0x00c0:
            long r1 = r6.f46101a
            r5.doReadData(r1, r0)
            return
        L_0x00c6:
            r1 = move-exception
            java.lang.String r2 = "HttpClientAndroid"
            java.lang.String r3 = "Do send failed. Catch error."
            com.tencent.liteav.base.util.LiteavLog.m16898e(r2, r3)
            com.tencent.liteav.base.http.HttpClientAndroid$g r2 = r5.getStatusCode((java.lang.Exception) r1)
            r0.f46106a = r2
            java.lang.String r1 = r1.toString()
            r0.f46107b = r1
            com.tencent.liteav.base.http.HttpClientAndroid$f r1 = com.tencent.liteav.base.http.HttpClientAndroid.C17100f.DISCONNECTED
            long r2 = r6.f46101a
            r5.doOnCallback(r1, r2, r0)
            long r0 = r6.f46101a
            r5.doCleanById(r0, r4)
            return
        L_0x00e7:
            r1 = move-exception
            java.lang.String r2 = "HttpClientAndroid"
            java.lang.String r3 = "Do send failed. Fail to create http connection."
            com.tencent.liteav.base.util.LiteavLog.m16898e(r2, r3)
            com.tencent.liteav.base.http.HttpClientAndroid$g r2 = r5.getStatusCode((java.lang.Exception) r1)
            r0.f46106a = r2
            java.lang.String r1 = r1.toString()
            r0.f46107b = r1
            com.tencent.liteav.base.http.HttpClientAndroid$f r1 = com.tencent.liteav.base.http.HttpClientAndroid.C17100f.DISCONNECTED
            long r2 = r6.f46101a
            r5.doOnCallback(r1, r2, r0)
            long r0 = r6.f46101a
            r5.doCleanById(r0, r4)
            return
        L_0x0108:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0108 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.base.http.HttpClientAndroid.doRequest(com.tencent.liteav.base.http.HttpClientAndroid$d):void");
    }

    public static HashMap getJavaHashMap(String[] strArr, String[] strArr2) {
        if (strArr == null || strArr.length == 0 || strArr2 == null || strArr2.length == 0) {
            return new HashMap();
        }
        if (strArr.length != strArr2.length) {
            LiteavLog.m16905w(TAG, "Invalid parameter, keys and values do not match.");
            return new HashMap();
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < strArr.length; i++) {
            hashMap.put(strArr[i], strArr2[i]);
        }
        return hashMap;
    }

    public static String[] getMapKeys(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return new String[0];
        }
        Set<String> keySet = map.keySet();
        return (String[]) keySet.toArray(new String[keySet.size()]);
    }

    public static String[] getMapValue(Map<String, String> map, String[] strArr) {
        if (map == null || map.isEmpty() || strArr == null || strArr.length == 0) {
            return new String[0];
        }
        String[] strArr2 = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            strArr2[i] = map.get(strArr[i]);
        }
        return strArr2;
    }

    private Map<String, String> getResponseHeaders(Map<String, List<String>> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : map.entrySet()) {
            if (!TextUtils.isEmpty((CharSequence) next.getKey())) {
                hashMap.put(next.getKey(), ((List) next.getValue()).get(0));
            }
        }
        return hashMap;
    }

    private C17101g getStatusCode(int i) {
        C17101g gVar = C17101g.kUnknownError;
        if (i == 200) {
            return C17101g.kHTTP200OK;
        }
        if (i == 204) {
            return C17101g.kHTTP204NoContent;
        }
        if (i == 302) {
            return C17101g.kHTTP302Found;
        }
        if (i == 304) {
            return C17101g.kHTTP304NotModified;
        }
        if (i == 403) {
            return C17101g.kHTTP403Forbidden;
        }
        if (i == 404) {
            return C17101g.kHTTP404NotFound;
        }
        if (i == 503) {
            return C17101g.kHTTP503ServiceUnavailable;
        }
        Log.m97549w(TAG, "Failed to convert status code：", Integer.valueOf(i));
        return gVar;
    }

    public static /* synthetic */ void lambda$cancelAll$1(HttpClientAndroid httpClientAndroid) {
        httpClientAndroid.closeConnectionSafely(httpClientAndroid.mConnection);
        httpClientAndroid.mConnection = null;
        LiteavLog.m16901i(TAG, "Cancel all finish.");
    }

    public static /* synthetic */ void lambda$destroy$2(HttpClientAndroid httpClientAndroid) {
        httpClientAndroid.closeConnectionSafely(httpClientAndroid.mConnection);
        httpClientAndroid.mConnection = null;
        if (LiteavSystemInfo.getSystemOSVersionInt() >= 18) {
            httpClientAndroid.mHttpHandler.getLooper().quitSafely();
        } else {
            httpClientAndroid.mHttpHandler.getLooper().quit();
        }
        LiteavLog.m16901i(TAG, "Quit looper finish.");
    }

    public static /* synthetic */ void lambda$doReadData$3(HttpClientAndroid httpClientAndroid, C17099e eVar, long j) {
        C17099e eVar2 = new C17099e();
        eVar2.f46106a = eVar.f46106a;
        httpClientAndroid.doReadData(j, eVar2);
    }

    private static native void nativeOnCallback(long j, boolean z, int i, long j2, int i2, String str, int i3, ByteBuffer byteBuffer, String str2, Map map, int i4);

    private String parseHostAddress(String str) {
        try {
            return InetAddress.getByName(str).getHostAddress();
        } catch (Exception unused) {
            LiteavLog.m16905w(TAG, "Parse host error. host:".concat(String.valueOf(str)));
            return "";
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0044, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void cancel(long r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.mLocker
            monitor-enter(r0)
            boolean r1 = r2.checkNativeValid()     // Catch:{ all -> 0x0045 }
            if (r1 != 0) goto L_0x0012
            java.lang.String r3 = "HttpClientAndroid"
            java.lang.String r4 = "Cancel request failed. Invalid native handle."
            com.tencent.liteav.base.util.LiteavLog.m16898e(r3, r4)     // Catch:{ all -> 0x0045 }
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            return
        L_0x0012:
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.tencent.liteav.base.http.HttpClientAndroid$d> r1 = r2.mRunningRequestMap     // Catch:{ all -> 0x0045 }
            int r1 = r1.size()     // Catch:{ all -> 0x0045 }
            if (r1 != 0) goto L_0x001c
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            return
        L_0x001c:
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.tencent.liteav.base.http.HttpClientAndroid$d> r1 = r2.mRunningRequestMap     // Catch:{ all -> 0x0045 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0045 }
            java.lang.Object r3 = r1.remove(r3)     // Catch:{ all -> 0x0045 }
            com.tencent.liteav.base.http.HttpClientAndroid$d r3 = (com.tencent.liteav.base.http.HttpClientAndroid.C17098d) r3     // Catch:{ all -> 0x0045 }
            java.lang.String r4 = "HttpClientAndroid"
            java.lang.String r1 = "Cancel request. request:"
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0045 }
            java.lang.String r3 = r1.concat(r3)     // Catch:{ all -> 0x0045 }
            com.tencent.liteav.base.util.LiteavLog.m16901i(r4, r3)     // Catch:{ all -> 0x0045 }
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.tencent.liteav.base.http.HttpClientAndroid$d> r3 = r2.mRunningRequestMap     // Catch:{ all -> 0x0045 }
            int r3 = r3.size()     // Catch:{ all -> 0x0045 }
            if (r3 != 0) goto L_0x0043
            com.tencent.liteav.base.http.HttpClientAndroid$c r3 = com.tencent.liteav.base.http.HttpClientAndroid.C17097c.NONE     // Catch:{ all -> 0x0045 }
            r2.mInternalState = r3     // Catch:{ all -> 0x0045 }
        L_0x0043:
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            return
        L_0x0045:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.base.http.HttpClientAndroid.cancel(long):void");
    }

    public void cancelAll() {
        synchronized (this.mLocker) {
            if (!checkNativeValid()) {
                LiteavLog.m16898e(TAG, "Cancel all request failed. Invalid native handle.");
                return;
            }
            C17097c cVar = this.mInternalState;
            C17097c cVar2 = C17097c.NONE;
            if (cVar != cVar2) {
                this.mInternalState = cVar2;
                LiteavLog.m16901i(TAG, "Cancel all. size:" + this.mRunningRequestMap.size());
                this.mRunningRequestMap.clear();
                this.mHttpHandler.post(C17103b.m16891a(this));
            }
        }
    }

    public void destroy() {
        synchronized (this.mLocker) {
            this.mRunningRequestMap.clear();
            this.mNativeHttpClientAndroidJni = -1;
            LiteavLog.m16901i(TAG, "Destroy http client.");
            this.mHttpHandler.post(C17104c.m16892a(this));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0090, code lost:
        if (r4.mInternalState == com.tencent.liteav.base.http.HttpClientAndroid.C17097c.f46099c) goto L_0x0092;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long send(long r5, java.lang.String r7, java.lang.String r8, byte[] r9, java.util.Map<java.lang.String, java.lang.String> r10, boolean r11) {
        /*
            r4 = this;
            boolean r0 = r4.checkNativeValid()
            r1 = 0
            if (r0 != 0) goto L_0x0010
            java.lang.String r5 = "HttpClientAndroid"
            java.lang.String r6 = "Send request failed. Invalid native handle."
            com.tencent.liteav.base.util.LiteavLog.m16898e(r5, r6)
            return r1
        L_0x0010:
            com.tencent.liteav.base.http.HttpClientAndroid$d r0 = new com.tencent.liteav.base.http.HttpClientAndroid$d
            r0.<init>(r7, r8, r9, r10)
            java.lang.String r7 = r0.f46102b
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            r8 = 0
            r9 = 1
            if (r7 != 0) goto L_0x0035
            java.lang.String r7 = r0.f46102b
            java.lang.String r10 = "http://"
            boolean r7 = r7.startsWith(r10)
            if (r7 != 0) goto L_0x0033
            java.lang.String r7 = r0.f46102b
            java.lang.String r10 = "https://"
            boolean r7 = r7.startsWith(r10)
            if (r7 == 0) goto L_0x0035
        L_0x0033:
            r7 = 1
            goto L_0x0036
        L_0x0035:
            r7 = 0
        L_0x0036:
            if (r7 != 0) goto L_0x0053
            java.lang.String r5 = "HttpClientAndroid"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Send request failed. Invalid request url("
            r6.<init>(r7)
            java.lang.String r7 = r0.f46102b
            r6.append(r7)
            java.lang.String r7 = ")."
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.liteav.base.util.LiteavLog.m16898e(r5, r6)
            return r1
        L_0x0053:
            java.lang.String r7 = r0.mo19350c()
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            r7 = r7 ^ r9
            if (r7 != 0) goto L_0x0079
            java.lang.String r5 = "HttpClientAndroid"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Send request failed. Request method("
            r6.<init>(r7)
            java.lang.String r7 = r0.f46103c
            r6.append(r7)
            java.lang.String r7 = ") is not supported."
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.liteav.base.util.LiteavLog.m16898e(r5, r6)
            return r1
        L_0x0079:
            java.lang.Object r7 = r4.mLocker
            monitor-enter(r7)
            com.tencent.liteav.base.http.HttpClientAndroid$c r10 = r4.mInternalState     // Catch:{ all -> 0x00c4 }
            com.tencent.liteav.base.http.HttpClientAndroid$c r3 = com.tencent.liteav.base.http.HttpClientAndroid.C17097c.NONE     // Catch:{ all -> 0x00c4 }
            if (r10 != r3) goto L_0x008c
            if (r11 == 0) goto L_0x0087
            com.tencent.liteav.base.http.HttpClientAndroid$c r8 = com.tencent.liteav.base.http.HttpClientAndroid.C17097c.RUNNING_REPEAT     // Catch:{ all -> 0x00c4 }
            goto L_0x0089
        L_0x0087:
            com.tencent.liteav.base.http.HttpClientAndroid$c r8 = com.tencent.liteav.base.http.HttpClientAndroid.C17097c.RUNNING_ONCE     // Catch:{ all -> 0x00c4 }
        L_0x0089:
            r4.mInternalState = r8     // Catch:{ all -> 0x00c4 }
            goto L_0x0092
        L_0x008c:
            com.tencent.liteav.base.http.HttpClientAndroid$c r10 = r4.mInternalState     // Catch:{ all -> 0x00c4 }
            com.tencent.liteav.base.http.HttpClientAndroid$c r11 = com.tencent.liteav.base.http.HttpClientAndroid.C17097c.RUNNING_ONCE     // Catch:{ all -> 0x00c4 }
            if (r10 != r11) goto L_0x0093
        L_0x0092:
            r8 = 1
        L_0x0093:
            if (r8 == 0) goto L_0x00ad
            r0.f46101a = r5     // Catch:{ all -> 0x00c4 }
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.tencent.liteav.base.http.HttpClientAndroid$d> r8 = r4.mRunningRequestMap     // Catch:{ all -> 0x00c4 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x00c4 }
            r8.put(r5, r0)     // Catch:{ all -> 0x00c4 }
            android.os.Handler r5 = r4.mHttpHandler     // Catch:{ all -> 0x00c4 }
            java.lang.Runnable r6 = com.tencent.liteav.base.http.C17102a.m16890a(r4, r0)     // Catch:{ all -> 0x00c4 }
            r5.post(r6)     // Catch:{ all -> 0x00c4 }
            long r5 = r0.f46101a     // Catch:{ all -> 0x00c4 }
            monitor-exit(r7)     // Catch:{ all -> 0x00c4 }
            return r5
        L_0x00ad:
            java.lang.String r5 = "HttpClientAndroid"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c4 }
            java.lang.String r8 = "Send request failed. Invalid state:"
            r6.<init>(r8)     // Catch:{ all -> 0x00c4 }
            com.tencent.liteav.base.http.HttpClientAndroid$c r8 = r4.mInternalState     // Catch:{ all -> 0x00c4 }
            r6.append(r8)     // Catch:{ all -> 0x00c4 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00c4 }
            com.tencent.liteav.base.util.LiteavLog.m16898e(r5, r6)     // Catch:{ all -> 0x00c4 }
            monitor-exit(r7)     // Catch:{ all -> 0x00c4 }
            return r1
        L_0x00c4:
            r5 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00c4 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.base.http.HttpClientAndroid.send(long, java.lang.String, java.lang.String, byte[], java.util.Map, boolean):long");
    }

    private C17101g getStatusCode(Exception exc) {
        C17101g gVar = C17101g.kUnknownError;
        if (exc instanceof FileNotFoundException) {
            return C17101g.kSystemFileOpenFailed;
        }
        if (exc instanceof EOFException) {
            return C17101g.kSystemFileWriteFailed;
        }
        if (exc instanceof UnknownHostException) {
            return C17101g.kSystemUnknownHost;
        }
        if (exc instanceof NoRouteToHostException) {
            return C17101g.kSystemConnectHostFailed;
        }
        if ((exc instanceof SocketException) || (exc instanceof MalformedURLException)) {
            return C17101g.kSystemCreateSocketFailed;
        }
        if (exc instanceof SocketTimeoutException) {
            return C17101g.kSystemConnectTimeout;
        }
        if (exc instanceof ConnectException) {
            return C17101g.kSystemConnectRefused;
        }
        if (exc instanceof ProtocolException) {
            return C17101g.kSystemProtocolError;
        }
        if (exc instanceof SSLException) {
            return C17101g.kSystemSSLError;
        }
        Log.m97549w(TAG, "Failed to convert status code, exception：", exc.toString());
        return gVar;
    }
}
