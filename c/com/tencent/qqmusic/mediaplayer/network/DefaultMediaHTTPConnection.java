package com.tencent.qqmusic.mediaplayer.network;

import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.UnknownServiceException;
import java.util.Map;

public class DefaultMediaHTTPConnection implements IMediaHTTPConnection {
    private static final int CONNECT_TIMEOUT_MS = 30000;
    private static final int HTTP_TEMP_REDIRECT = 307;
    private static final int MAX_REDIRECTS = 20;
    private static final String TAG = "MediaHTTPConnection";
    private static final boolean VERBOSE = false;
    private boolean mAllowCrossDomainRedirect = true;
    private boolean mAllowCrossProtocolRedirect = true;
    private HttpURLConnection mConnection = null;
    private long mCurrentOffset = -1;
    private Map<String, String> mHeaders = null;
    private InputStream mInputStream = null;
    private long mTotalSize = -1;
    private URL mURL = null;

    private boolean filterOutInternalHeaders(String str, String str2) {
        if (!"android-allow-cross-domain-redirect".equalsIgnoreCase(str)) {
            return false;
        }
        boolean parseBoolean = parseBoolean(str2);
        this.mAllowCrossDomainRedirect = parseBoolean;
        this.mAllowCrossProtocolRedirect = parseBoolean;
        return true;
    }

    private static final boolean isLocalHost(URL url) {
        String host;
        if (url == null || (host = url.getHost()) == null) {
            return false;
        }
        try {
            return host.equalsIgnoreCase("localhost");
        } catch (IllegalArgumentException e) {
            Logger.m21788e(TAG, "isLocalHost", (Throwable) e);
        }
    }

    private boolean parseBoolean(String str) {
        try {
            return Long.parseLong(str) != 0;
        } catch (NumberFormatException unused) {
            return "true".equalsIgnoreCase(str) || "yes".equalsIgnoreCase(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d2, code lost:
        if (r1.mAllowCrossDomainRedirect == false) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d4, code lost:
        r1.mURL = r1.mConnection.getURL();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00de, code lost:
        if (r0 != 206) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e0, code lost:
        r9 = r1.mConnection.getHeaderField("Content-Range");
        r1.mTotalSize = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ea, code lost:
        if (r9 == null) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ec, code lost:
        r10 = r9.lastIndexOf(47);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f2, code lost:
        if (r10 < 0) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r1.mTotalSize = java.lang.Long.parseLong(r9.substring(r10 + 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0104, code lost:
        if (r0 != 200) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r1.mTotalSize = (long) r1.mConnection.getContentLength();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0140, code lost:
        throw new java.io.IOException("failed! status code: " + r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void seekTo(long r18) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            java.lang.String r4 = "MediaHTTPConnection"
            r17.teardownConnection()
            r5 = -1
            java.net.URL r0 = r1.mURL     // Catch:{ IOException -> 0x0213 }
            boolean r7 = isLocalHost(r0)     // Catch:{ IOException -> 0x0213 }
            r9 = 0
        L_0x0012:
            if (r7 == 0) goto L_0x001f
            java.net.Proxy r10 = java.net.Proxy.NO_PROXY     // Catch:{ IOException -> 0x0213 }
            java.net.URLConnection r0 = r0.openConnection(r10)     // Catch:{ IOException -> 0x0213 }
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ IOException -> 0x0213 }
            r1.mConnection = r0     // Catch:{ IOException -> 0x0213 }
            goto L_0x0027
        L_0x001f:
            java.net.URLConnection r0 = r0.openConnection()     // Catch:{ IOException -> 0x0213 }
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ IOException -> 0x0213 }
            r1.mConnection = r0     // Catch:{ IOException -> 0x0213 }
        L_0x0027:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0213 }
            r0.<init>()     // Catch:{ IOException -> 0x0213 }
            java.lang.String r10 = "setConnectTimeout "
            r0.append(r10)     // Catch:{ IOException -> 0x0213 }
            java.net.URL r10 = r1.mURL     // Catch:{ IOException -> 0x0213 }
            r0.append(r10)     // Catch:{ IOException -> 0x0213 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x0213 }
            com.tencent.qqmusic.mediaplayer.util.Logger.m21791i(r4, r0)     // Catch:{ IOException -> 0x0213 }
            java.net.HttpURLConnection r0 = r1.mConnection     // Catch:{ IOException -> 0x0213 }
            r10 = 30000(0x7530, float:4.2039E-41)
            r0.setConnectTimeout(r10)     // Catch:{ IOException -> 0x0213 }
            java.net.HttpURLConnection r0 = r1.mConnection     // Catch:{ IOException -> 0x0213 }
            boolean r10 = r1.mAllowCrossDomainRedirect     // Catch:{ IOException -> 0x0213 }
            r0.setInstanceFollowRedirects(r10)     // Catch:{ IOException -> 0x0213 }
            java.lang.String r0 = "Accept-Encoding"
            java.util.Map<java.lang.String, java.lang.String> r10 = r1.mHeaders     // Catch:{ IOException -> 0x0213 }
            r11 = 1
            if (r10 == 0) goto L_0x0089
            java.util.Set r10 = r10.entrySet()     // Catch:{ IOException -> 0x0213 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ IOException -> 0x0213 }
            r12 = 0
        L_0x005c:
            boolean r13 = r10.hasNext()     // Catch:{ IOException -> 0x0213 }
            if (r13 == 0) goto L_0x008a
            java.lang.Object r13 = r10.next()     // Catch:{ IOException -> 0x0213 }
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13     // Catch:{ IOException -> 0x0213 }
            java.net.HttpURLConnection r14 = r1.mConnection     // Catch:{ IOException -> 0x0213 }
            java.lang.Object r15 = r13.getKey()     // Catch:{ IOException -> 0x0213 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ IOException -> 0x0213 }
            java.lang.Object r16 = r13.getValue()     // Catch:{ IOException -> 0x0213 }
            r8 = r16
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ IOException -> 0x0213 }
            r14.setRequestProperty(r15, r8)     // Catch:{ IOException -> 0x0213 }
            if (r12 != 0) goto L_0x005c
            java.lang.Object r8 = r13.getKey()     // Catch:{ IOException -> 0x0213 }
            boolean r8 = r0.equals(r8)     // Catch:{ IOException -> 0x0213 }
            if (r8 == 0) goto L_0x005c
            r12 = 1
            goto L_0x005c
        L_0x0089:
            r12 = 0
        L_0x008a:
            r13 = 0
            int r8 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r8 <= 0) goto L_0x00ad
            java.net.HttpURLConnection r10 = r1.mConnection     // Catch:{ IOException -> 0x0213 }
            java.lang.String r13 = "Range"
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0213 }
            r14.<init>()     // Catch:{ IOException -> 0x0213 }
            java.lang.String r15 = "bytes="
            r14.append(r15)     // Catch:{ IOException -> 0x0213 }
            r14.append(r2)     // Catch:{ IOException -> 0x0213 }
            java.lang.String r15 = "-"
            r14.append(r15)     // Catch:{ IOException -> 0x0213 }
            java.lang.String r14 = r14.toString()     // Catch:{ IOException -> 0x0213 }
            r10.setRequestProperty(r13, r14)     // Catch:{ IOException -> 0x0213 }
        L_0x00ad:
            if (r12 != 0) goto L_0x00b6
            java.net.HttpURLConnection r10 = r1.mConnection     // Catch:{ IOException -> 0x0213 }
            java.lang.String r12 = ""
            r10.setRequestProperty(r0, r12)     // Catch:{ IOException -> 0x0213 }
        L_0x00b6:
            java.net.HttpURLConnection r0 = r1.mConnection     // Catch:{ Exception -> 0x01f7 }
            int r0 = r0.getResponseCode()     // Catch:{ Exception -> 0x01f7 }
            r10 = 300(0x12c, float:4.2E-43)
            r12 = 307(0x133, float:4.3E-43)
            if (r0 == r10) goto L_0x0141
            r10 = 301(0x12d, float:4.22E-43)
            if (r0 == r10) goto L_0x0141
            r10 = 302(0x12e, float:4.23E-43)
            if (r0 == r10) goto L_0x0141
            r10 = 303(0x12f, float:4.25E-43)
            if (r0 == r10) goto L_0x0141
            if (r0 == r12) goto L_0x0141
            boolean r7 = r1.mAllowCrossDomainRedirect     // Catch:{ IOException -> 0x0213 }
            if (r7 == 0) goto L_0x00dc
            java.net.HttpURLConnection r7 = r1.mConnection     // Catch:{ IOException -> 0x0213 }
            java.net.URL r7 = r7.getURL()     // Catch:{ IOException -> 0x0213 }
            r1.mURL = r7     // Catch:{ IOException -> 0x0213 }
        L_0x00dc:
            r7 = 206(0xce, float:2.89E-43)
            if (r0 != r7) goto L_0x0102
            java.net.HttpURLConnection r9 = r1.mConnection     // Catch:{ IOException -> 0x0213 }
            java.lang.String r10 = "Content-Range"
            java.lang.String r9 = r9.getHeaderField(r10)     // Catch:{ IOException -> 0x0213 }
            r1.mTotalSize = r5     // Catch:{ IOException -> 0x0213 }
            if (r9 == 0) goto L_0x010f
            r10 = 47
            int r10 = r9.lastIndexOf(r10)     // Catch:{ IOException -> 0x0213 }
            if (r10 < 0) goto L_0x010f
            int r10 = r10 + r11
            java.lang.String r9 = r9.substring(r10)     // Catch:{ IOException -> 0x0213 }
            long r9 = java.lang.Long.parseLong(r9)     // Catch:{ NumberFormatException -> 0x0100 }
            r1.mTotalSize = r9     // Catch:{ NumberFormatException -> 0x0100 }
            goto L_0x010f
        L_0x0100:
            goto L_0x010f
        L_0x0102:
            r9 = 200(0xc8, float:2.8E-43)
            if (r0 != r9) goto L_0x012a
            java.net.HttpURLConnection r9 = r1.mConnection     // Catch:{ IOException -> 0x0213 }
            int r9 = r9.getContentLength()     // Catch:{ IOException -> 0x0213 }
            long r9 = (long) r9     // Catch:{ IOException -> 0x0213 }
            r1.mTotalSize = r9     // Catch:{ IOException -> 0x0213 }
        L_0x010f:
            if (r8 <= 0) goto L_0x011a
            if (r0 != r7) goto L_0x0114
            goto L_0x011a
        L_0x0114:
            java.net.ProtocolException r0 = new java.net.ProtocolException     // Catch:{ IOException -> 0x0213 }
            r0.<init>()     // Catch:{ IOException -> 0x0213 }
            throw r0     // Catch:{ IOException -> 0x0213 }
        L_0x011a:
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0213 }
            java.net.HttpURLConnection r7 = r1.mConnection     // Catch:{ IOException -> 0x0213 }
            java.io.InputStream r7 = r7.getInputStream()     // Catch:{ IOException -> 0x0213 }
            r0.<init>(r7)     // Catch:{ IOException -> 0x0213 }
            r1.mInputStream = r0     // Catch:{ IOException -> 0x0213 }
            r1.mCurrentOffset = r2     // Catch:{ IOException -> 0x0213 }
            return
        L_0x012a:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x0213 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0213 }
            r3.<init>()     // Catch:{ IOException -> 0x0213 }
            java.lang.String r7 = "failed! status code: "
            r3.append(r7)     // Catch:{ IOException -> 0x0213 }
            r3.append(r0)     // Catch:{ IOException -> 0x0213 }
            java.lang.String r0 = r3.toString()     // Catch:{ IOException -> 0x0213 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0213 }
            throw r2     // Catch:{ IOException -> 0x0213 }
        L_0x0141:
            int r9 = r9 + r11
            r8 = 20
            if (r9 > r8) goto L_0x01e0
            java.net.HttpURLConnection r8 = r1.mConnection     // Catch:{ IOException -> 0x0213 }
            java.lang.String r8 = r8.getRequestMethod()     // Catch:{ IOException -> 0x0213 }
            java.lang.String r10 = "Invalid redirect"
            if (r0 != r12) goto L_0x0167
            java.lang.String r11 = "GET"
            boolean r11 = r8.equals(r11)     // Catch:{ IOException -> 0x0213 }
            if (r11 != 0) goto L_0x0167
            java.lang.String r11 = "HEAD"
            boolean r8 = r8.equals(r11)     // Catch:{ IOException -> 0x0213 }
            if (r8 == 0) goto L_0x0161
            goto L_0x0167
        L_0x0161:
            java.net.NoRouteToHostException r0 = new java.net.NoRouteToHostException     // Catch:{ IOException -> 0x0213 }
            r0.<init>(r10)     // Catch:{ IOException -> 0x0213 }
            throw r0     // Catch:{ IOException -> 0x0213 }
        L_0x0167:
            java.net.HttpURLConnection r8 = r1.mConnection     // Catch:{ IOException -> 0x0213 }
            java.lang.String r11 = "Location"
            java.lang.String r8 = r8.getHeaderField(r11)     // Catch:{ IOException -> 0x0213 }
            if (r8 == 0) goto L_0x01da
            java.net.URL r10 = new java.net.URL     // Catch:{ IOException -> 0x0213 }
            java.net.URL r11 = r1.mURL     // Catch:{ IOException -> 0x0213 }
            r10.<init>(r11, r8)     // Catch:{ IOException -> 0x0213 }
            java.lang.String r8 = r10.getProtocol()     // Catch:{ IOException -> 0x0213 }
            java.lang.String r11 = "https"
            boolean r8 = r8.equals(r11)     // Catch:{ IOException -> 0x0213 }
            if (r8 != 0) goto L_0x0199
            java.lang.String r8 = r10.getProtocol()     // Catch:{ IOException -> 0x0213 }
            java.lang.String r11 = "http"
            boolean r8 = r8.equals(r11)     // Catch:{ IOException -> 0x0213 }
            if (r8 == 0) goto L_0x0191
            goto L_0x0199
        L_0x0191:
            java.net.NoRouteToHostException r0 = new java.net.NoRouteToHostException     // Catch:{ IOException -> 0x0213 }
            java.lang.String r2 = "Unsupported protocol redirect"
            r0.<init>(r2)     // Catch:{ IOException -> 0x0213 }
            throw r0     // Catch:{ IOException -> 0x0213 }
        L_0x0199:
            java.net.URL r8 = r1.mURL     // Catch:{ IOException -> 0x0213 }
            java.lang.String r8 = r8.getProtocol()     // Catch:{ IOException -> 0x0213 }
            java.lang.String r11 = r10.getProtocol()     // Catch:{ IOException -> 0x0213 }
            boolean r8 = r8.equals(r11)     // Catch:{ IOException -> 0x0213 }
            boolean r11 = r1.mAllowCrossProtocolRedirect     // Catch:{ IOException -> 0x0213 }
            if (r11 != 0) goto L_0x01b6
            if (r8 == 0) goto L_0x01ae
            goto L_0x01b6
        L_0x01ae:
            java.net.NoRouteToHostException r0 = new java.net.NoRouteToHostException     // Catch:{ IOException -> 0x0213 }
            java.lang.String r2 = "Cross-protocol redirects are disallowed"
            r0.<init>(r2)     // Catch:{ IOException -> 0x0213 }
            throw r0     // Catch:{ IOException -> 0x0213 }
        L_0x01b6:
            java.net.URL r8 = r1.mURL     // Catch:{ IOException -> 0x0213 }
            java.lang.String r8 = r8.getHost()     // Catch:{ IOException -> 0x0213 }
            java.lang.String r11 = r10.getHost()     // Catch:{ IOException -> 0x0213 }
            boolean r8 = r8.equals(r11)     // Catch:{ IOException -> 0x0213 }
            boolean r11 = r1.mAllowCrossDomainRedirect     // Catch:{ IOException -> 0x0213 }
            if (r11 != 0) goto L_0x01d3
            if (r8 == 0) goto L_0x01cb
            goto L_0x01d3
        L_0x01cb:
            java.net.NoRouteToHostException r0 = new java.net.NoRouteToHostException     // Catch:{ IOException -> 0x0213 }
            java.lang.String r2 = "Cross-domain redirects are disallowed"
            r0.<init>(r2)     // Catch:{ IOException -> 0x0213 }
            throw r0     // Catch:{ IOException -> 0x0213 }
        L_0x01d3:
            if (r0 == r12) goto L_0x01d7
            r1.mURL = r10     // Catch:{ IOException -> 0x0213 }
        L_0x01d7:
            r0 = r10
            goto L_0x0012
        L_0x01da:
            java.net.NoRouteToHostException r0 = new java.net.NoRouteToHostException     // Catch:{ IOException -> 0x0213 }
            r0.<init>(r10)     // Catch:{ IOException -> 0x0213 }
            throw r0     // Catch:{ IOException -> 0x0213 }
        L_0x01e0:
            java.net.NoRouteToHostException r0 = new java.net.NoRouteToHostException     // Catch:{ IOException -> 0x0213 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0213 }
            r2.<init>()     // Catch:{ IOException -> 0x0213 }
            java.lang.String r3 = "Too many redirects: "
            r2.append(r3)     // Catch:{ IOException -> 0x0213 }
            r2.append(r9)     // Catch:{ IOException -> 0x0213 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x0213 }
            r0.<init>(r2)     // Catch:{ IOException -> 0x0213 }
            throw r0     // Catch:{ IOException -> 0x0213 }
        L_0x01f7:
            r0 = move-exception
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x0213 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0213 }
            r3.<init>()     // Catch:{ IOException -> 0x0213 }
            java.lang.String r7 = "An suspicious exception occurred: "
            r3.append(r7)     // Catch:{ IOException -> 0x0213 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ IOException -> 0x0213 }
            r3.append(r0)     // Catch:{ IOException -> 0x0213 }
            java.lang.String r0 = r3.toString()     // Catch:{ IOException -> 0x0213 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0213 }
            throw r2     // Catch:{ IOException -> 0x0213 }
        L_0x0213:
            r0 = move-exception
            r1.mTotalSize = r5
            r2 = 0
            r1.mInputStream = r2
            r1.mConnection = r2
            r1.mCurrentOffset = r5
            java.lang.String r2 = "seekTo"
            com.tencent.qqmusic.mediaplayer.util.Logger.m21788e((java.lang.String) r4, (java.lang.String) r2, (java.lang.Throwable) r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qqmusic.mediaplayer.network.DefaultMediaHTTPConnection.seekTo(long):void");
    }

    private void teardownConnection() {
        HttpURLConnection httpURLConnection = this.mConnection;
        if (httpURLConnection != null) {
            this.mInputStream = null;
            httpURLConnection.disconnect();
            this.mConnection = null;
            this.mCurrentOffset = -1;
        }
    }

    public boolean connect(URL url, Map<String, String> map) {
        disconnect();
        this.mAllowCrossDomainRedirect = true;
        this.mURL = url;
        this.mHeaders = map;
        return true;
    }

    public void disconnect() {
        teardownConnection();
        this.mHeaders = null;
        this.mURL = null;
    }

    public String getMIMEType() {
        if (this.mConnection == null) {
            try {
                seekTo(0);
            } catch (IOException e) {
                Logger.m21788e(TAG, "getMIMEType", (Throwable) e);
                return "application/octet-stream";
            }
        }
        return this.mConnection.getContentType();
    }

    public long getSize() {
        if (this.mConnection == null) {
            try {
                seekTo(0);
            } catch (IOException e) {
                Logger.m21788e(TAG, "getSize", (Throwable) e);
                return -1;
            }
        }
        return this.mTotalSize;
    }

    public String getUri() {
        return this.mURL.toString();
    }

    public int readAt(long j, byte[] bArr, int i, int i2) {
        try {
            if (j != this.mCurrentOffset) {
                seekTo(j);
            }
            int read = this.mInputStream.read(bArr, i, i2);
            if (read == -1) {
                read = 0;
            }
            this.mCurrentOffset += (long) read;
            return read;
        } catch (ProtocolException e) {
            Logger.m21793w(TAG, "readAt " + j + " / " + i2 + " => " + e);
            return -1010;
        } catch (NoRouteToHostException e2) {
            Logger.m21793w(TAG, "readAt " + j + " / " + i2 + " => " + e2);
            return -1010;
        } catch (UnknownServiceException e3) {
            Logger.m21793w(TAG, "readAt " + j + " / " + i2 + " => " + e3);
            return -1010;
        } catch (IOException unused) {
            return -2;
        } catch (Exception unused2) {
            return -3;
        }
    }
}
