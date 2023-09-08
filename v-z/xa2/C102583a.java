package xa2;

import android.net.Uri;
import android.text.TextUtils;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.p014mm.plugin.appbrand.jsapi.C83039u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.qqmusic.mediaplayer.network.IMediaHTTPConnection;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import ha2.C32752h;
import ha2.C98326a;
import ha2.C98327c;
import ha2.C98328d;
import ha2.C98329e;
import ha2.C98330i;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import la2.C99355b;
import la2.C99364n;
import qc0.C101108q;
import ua2.C101991b;

/* renamed from: xa2.a */
public class C102583a implements IMediaHTTPConnection {

    /* renamed from: a */
    public C98326a f302056a;

    /* renamed from: b */
    public long f302057b = -1;

    /* renamed from: c */
    public URL f302058c = null;

    /* renamed from: d */
    public URL f302059d = null;

    /* renamed from: e */
    public Map<String, String> f302060e = null;

    /* renamed from: f */
    public HttpURLConnection f302061f = null;

    /* renamed from: g */
    public long f302062g = -1;

    /* renamed from: h */
    public String f302063h = "";

    /* renamed from: i */
    public InputStream f302064i = null;

    /* renamed from: j */
    public boolean f302065j = true;

    /* renamed from: k */
    public byte[] f302066k = new byte[1];

    /* renamed from: l */
    public final Map<String, String> f302067l;

    public C102583a(Map<String, String> map) {
        this.f302067l = map;
    }

    /* renamed from: a */
    public String mo142207a() {
        return this.f302059d.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0119, code lost:
        if (r1.f302065j == false) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x011b, code lost:
        r1.f302058c = r1.f302061f.getURL();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0125, code lost:
        if (r6 != 206) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0127, code lost:
        r7 = r1.f302061f.getHeaderField("Content-Range");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r1.f302062g = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0133, code lost:
        if (r7 == null) goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        r9 = r7.lastIndexOf(47);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x013b, code lost:
        if (r9 < 0) goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x013d, code lost:
        r7 = r7.substring(r9 + 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0149, code lost:
        if (r1.f302062g > 0) goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        r1.f302062g = com.tencent.p014mm.sdk.platformtools.Util.getLong(r7, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0152, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0157, code lost:
        if (r6 != 200) goto L_0x01a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x015f, code lost:
        if (r1.f302062g > 0) goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0161, code lost:
        r1.f302062g = (long) r1.f302061f.getContentLength();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01a6, code lost:
        throw new java.io.IOException();
     */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0239 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0043 A[SYNTHETIC, Splitter:B:18:0x0043] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004e A[Catch:{ IOException -> 0x00fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0081 A[Catch:{ IOException -> 0x00fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bb A[Catch:{ IOException -> 0x00fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c2 A[Catch:{ IOException -> 0x00fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e1 A[Catch:{ IOException -> 0x00fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f4 A[Catch:{ IOException -> 0x00fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0101 A[Catch:{ IOException -> 0x00fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01ad A[Catch:{ IOException -> 0x0250 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo142208b(long r18) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            java.lang.String r4 = ""
            java.lang.String r5 = "MicroMsg.Music.MMMediaHTTPConnection"
            r17.mo142209c()
            r8 = 1
            r9 = 0
            java.net.URL r10 = r1.f302058c     // Catch:{ IOException -> 0x0256 }
            if (r10 != 0) goto L_0x0012
            goto L_0x003e
        L_0x0012:
            java.lang.String r0 = r10.getHost()     // Catch:{ IOException -> 0x0256 }
            if (r0 != 0) goto L_0x0019
            goto L_0x003e
        L_0x0019:
            java.lang.String r11 = "localhost"
            boolean r0 = r0.equalsIgnoreCase(r11)     // Catch:{ IllegalArgumentException -> 0x0024 }
            if (r0 == 0) goto L_0x003e
            r0 = 1
            goto L_0x003f
        L_0x0024:
            r0 = move-exception
            java.lang.Object[] r11 = new java.lang.Object[r8]     // Catch:{ IOException -> 0x0256 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0256 }
            r12.<init>()     // Catch:{ IOException -> 0x0256 }
            r12.append(r4)     // Catch:{ IOException -> 0x0256 }
            r12.append(r0)     // Catch:{ IOException -> 0x0256 }
            java.lang.String r0 = r12.toString()     // Catch:{ IOException -> 0x0256 }
            r11[r9] = r0     // Catch:{ IOException -> 0x0256 }
            java.lang.String r0 = "isLocalHost IllegalArgumentException:%s"
            com.tencent.qqmusic.mediaplayer.util.Logger.m21789e((java.lang.String) r5, (java.lang.String) r0, (java.lang.Object[]) r11)     // Catch:{ IOException -> 0x0256 }
        L_0x003e:
            r0 = 0
        L_0x003f:
            r11 = 0
            r12 = 0
        L_0x0041:
            if (r0 == 0) goto L_0x004e
            java.net.Proxy r13 = java.net.Proxy.NO_PROXY     // Catch:{ IOException -> 0x00fe }
            java.net.URLConnection r10 = r10.openConnection(r13)     // Catch:{ IOException -> 0x00fe }
            java.net.HttpURLConnection r10 = (java.net.HttpURLConnection) r10     // Catch:{ IOException -> 0x00fe }
            r1.f302061f = r10     // Catch:{ IOException -> 0x00fe }
            goto L_0x0056
        L_0x004e:
            java.net.URLConnection r10 = r10.openConnection()     // Catch:{ IOException -> 0x00fe }
            java.net.HttpURLConnection r10 = (java.net.HttpURLConnection) r10     // Catch:{ IOException -> 0x00fe }
            r1.f302061f = r10     // Catch:{ IOException -> 0x00fe }
        L_0x0056:
            java.net.HttpURLConnection r10 = r1.f302061f     // Catch:{ IOException -> 0x00fe }
            r13 = 30000(0x7530, float:4.2039E-41)
            r10.setConnectTimeout(r13)     // Catch:{ IOException -> 0x00fe }
            java.net.HttpURLConnection r10 = r1.f302061f     // Catch:{ IOException -> 0x00fe }
            boolean r13 = r1.f302065j     // Catch:{ IOException -> 0x00fe }
            r10.setInstanceFollowRedirects(r13)     // Catch:{ IOException -> 0x00fe }
            java.lang.String r10 = "Accept-Encoding"
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00fe }
            r13.<init>()     // Catch:{ IOException -> 0x00fe }
            java.lang.String r14 = "mHeaders="
            r13.append(r14)     // Catch:{ IOException -> 0x00fe }
            java.util.Map<java.lang.String, java.lang.String> r14 = r1.f302060e     // Catch:{ IOException -> 0x00fe }
            r13.append(r14)     // Catch:{ IOException -> 0x00fe }
            java.lang.String r13 = r13.toString()     // Catch:{ IOException -> 0x00fe }
            com.tencent.qqmusic.mediaplayer.util.Logger.m21786d(r5, r13)     // Catch:{ IOException -> 0x00fe }
            java.util.Map<java.lang.String, java.lang.String> r13 = r1.f302060e     // Catch:{ IOException -> 0x00fe }
            if (r13 == 0) goto L_0x00bb
            java.util.Set r13 = r13.entrySet()     // Catch:{ IOException -> 0x00fe }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ IOException -> 0x00fe }
            r14 = 0
        L_0x008a:
            boolean r15 = r13.hasNext()     // Catch:{ IOException -> 0x00fe }
            if (r15 == 0) goto L_0x00bc
            java.lang.Object r15 = r13.next()     // Catch:{ IOException -> 0x00fe }
            java.util.Map$Entry r15 = (java.util.Map.Entry) r15     // Catch:{ IOException -> 0x00fe }
            java.net.HttpURLConnection r9 = r1.f302061f     // Catch:{ IOException -> 0x00fe }
            java.lang.Object r16 = r15.getKey()     // Catch:{ IOException -> 0x00fe }
            r8 = r16
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ IOException -> 0x00fe }
            java.lang.Object r16 = r15.getValue()     // Catch:{ IOException -> 0x00fe }
            r6 = r16
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x00fe }
            r9.setRequestProperty(r8, r6)     // Catch:{ IOException -> 0x00fe }
            if (r14 != 0) goto L_0x00b8
            java.lang.Object r6 = r15.getKey()     // Catch:{ IOException -> 0x00fe }
            boolean r6 = r10.equals(r6)     // Catch:{ IOException -> 0x00fe }
            if (r6 == 0) goto L_0x00b8
            r14 = 1
        L_0x00b8:
            r8 = 1
            r9 = 0
            goto L_0x008a
        L_0x00bb:
            r14 = 0
        L_0x00bc:
            r6 = 0
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x00df
            java.net.HttpURLConnection r9 = r1.f302061f     // Catch:{ IOException -> 0x00fe }
            java.lang.String r13 = "Range"
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00fe }
            r15.<init>()     // Catch:{ IOException -> 0x00fe }
            java.lang.String r6 = "bytes="
            r15.append(r6)     // Catch:{ IOException -> 0x00fe }
            r15.append(r2)     // Catch:{ IOException -> 0x00fe }
            java.lang.String r6 = "-"
            r15.append(r6)     // Catch:{ IOException -> 0x00fe }
            java.lang.String r6 = r15.toString()     // Catch:{ IOException -> 0x00fe }
            r9.setRequestProperty(r13, r6)     // Catch:{ IOException -> 0x00fe }
        L_0x00df:
            if (r14 != 0) goto L_0x00e6
            java.net.HttpURLConnection r6 = r1.f302061f     // Catch:{ IOException -> 0x00fe }
            r6.setRequestProperty(r10, r4)     // Catch:{ IOException -> 0x00fe }
        L_0x00e6:
            java.net.HttpURLConnection r6 = r1.f302061f     // Catch:{ IOException -> 0x00fe }
            int r6 = r6.getResponseCode()     // Catch:{ IOException -> 0x00fe }
            java.net.URL r7 = r1.f302059d     // Catch:{ IOException -> 0x00fe }
            java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x00fe }
            if (r7 == 0) goto L_0x0101
            com.tencent.mm.sdk.platformtools.LruCache<java.lang.String, java.lang.Integer> r9 = ha2.C32752h.f89141c     // Catch:{ IOException -> 0x00fe }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)     // Catch:{ IOException -> 0x00fe }
            r9.put(r7, r10)     // Catch:{ IOException -> 0x00fe }
            goto L_0x0103
        L_0x00fe:
            r0 = move-exception
            goto L_0x0252
        L_0x0101:
            com.tencent.mm.sdk.platformtools.LruCache<java.lang.String, java.lang.String> r7 = ha2.C32752h.f89139a     // Catch:{ IOException -> 0x00fe }
        L_0x0103:
            r7 = 300(0x12c, float:4.2E-43)
            r9 = 307(0x133, float:4.3E-43)
            if (r6 == r7) goto L_0x01a7
            r7 = 301(0x12d, float:4.22E-43)
            if (r6 == r7) goto L_0x01a7
            r7 = 302(0x12e, float:4.23E-43)
            if (r6 == r7) goto L_0x01a7
            r7 = 303(0x12f, float:4.25E-43)
            if (r6 == r7) goto L_0x01a7
            if (r6 == r9) goto L_0x01a7
            boolean r0 = r1.f302065j     // Catch:{ IOException -> 0x0250 }
            if (r0 == 0) goto L_0x0123
            java.net.HttpURLConnection r0 = r1.f302061f     // Catch:{ IOException -> 0x0250 }
            java.net.URL r0 = r0.getURL()     // Catch:{ IOException -> 0x0250 }
            r1.f302058c = r0     // Catch:{ IOException -> 0x0250 }
        L_0x0123:
            r0 = 206(0xce, float:2.89E-43)
            if (r6 != r0) goto L_0x0155
            java.net.HttpURLConnection r7 = r1.f302061f     // Catch:{ IOException -> 0x0250 }
            java.lang.String r9 = "Content-Range"
            java.lang.String r7 = r7.getHeaderField(r9)     // Catch:{ IOException -> 0x0250 }
            r9 = -1
            r1.f302062g = r9     // Catch:{ IOException -> 0x0152 }
            if (r7 == 0) goto L_0x016a
            r9 = 47
            int r9 = r7.lastIndexOf(r9)     // Catch:{ IOException -> 0x0250 }
            if (r9 < 0) goto L_0x016a
            r10 = 1
            int r9 = r9 + r10
            java.lang.String r7 = r7.substring(r9)     // Catch:{ IOException -> 0x0250 }
            long r9 = r1.f302062g     // Catch:{ IOException -> 0x0250 }
            r11 = 0
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 > 0) goto L_0x016a
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r7, r11)     // Catch:{ NumberFormatException -> 0x016a }
            r1.f302062g = r9     // Catch:{ NumberFormatException -> 0x016a }
            goto L_0x016a
        L_0x0152:
            r0 = move-exception
            goto L_0x0253
        L_0x0155:
            r7 = 200(0xc8, float:2.8E-43)
            if (r6 != r7) goto L_0x01a1
            long r9 = r1.f302062g     // Catch:{ IOException -> 0x0250 }
            r11 = 0
            int r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r7 > 0) goto L_0x016a
            java.net.HttpURLConnection r7 = r1.f302061f     // Catch:{ IOException -> 0x0250 }
            int r7 = r7.getContentLength()     // Catch:{ IOException -> 0x0250 }
            long r9 = (long) r7     // Catch:{ IOException -> 0x0250 }
            r1.f302062g = r9     // Catch:{ IOException -> 0x0250 }
        L_0x016a:
            java.lang.String r7 = r1.f302063h     // Catch:{ IOException -> 0x0250 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IOException -> 0x0250 }
            if (r7 == 0) goto L_0x0186
            java.net.HttpURLConnection r7 = r1.f302061f     // Catch:{ IOException -> 0x0250 }
            java.lang.String r7 = r7.getContentType()     // Catch:{ IOException -> 0x0250 }
            r1.f302063h = r7     // Catch:{ IOException -> 0x0250 }
            java.lang.String r9 = "mimeType:"
            r10 = 1
            java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ IOException -> 0x0250 }
            r10 = 0
            r11[r10] = r7     // Catch:{ IOException -> 0x0250 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r9, r11)     // Catch:{ IOException -> 0x0250 }
        L_0x0186:
            if (r8 <= 0) goto L_0x0191
            if (r6 != r0) goto L_0x018b
            goto L_0x0191
        L_0x018b:
            java.net.ProtocolException r0 = new java.net.ProtocolException     // Catch:{ IOException -> 0x0250 }
            r0.<init>()     // Catch:{ IOException -> 0x0250 }
            throw r0     // Catch:{ IOException -> 0x0250 }
        L_0x0191:
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0250 }
            java.net.HttpURLConnection r7 = r1.f302061f     // Catch:{ IOException -> 0x0250 }
            java.io.InputStream r7 = r7.getInputStream()     // Catch:{ IOException -> 0x0250 }
            r0.<init>(r7)     // Catch:{ IOException -> 0x0250 }
            r1.f302064i = r0     // Catch:{ IOException -> 0x0250 }
            r1.f302057b = r2     // Catch:{ IOException -> 0x0250 }
            return
        L_0x01a1:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0250 }
            r0.<init>()     // Catch:{ IOException -> 0x0250 }
            throw r0     // Catch:{ IOException -> 0x0250 }
        L_0x01a7:
            r7 = 1
            int r11 = r11 + r7
            r7 = 20
            if (r11 > r7) goto L_0x0239
            java.net.HttpURLConnection r7 = r1.f302061f     // Catch:{ IOException -> 0x0250 }
            java.lang.String r7 = r7.getRequestMethod()     // Catch:{ IOException -> 0x0250 }
            java.lang.String r8 = "Invalid redirect"
            if (r6 != r9) goto L_0x01ce
            java.lang.String r10 = "GET"
            boolean r10 = r7.equals(r10)     // Catch:{ IOException -> 0x0250 }
            if (r10 != 0) goto L_0x01ce
            java.lang.String r10 = "HEAD"
            boolean r7 = r7.equals(r10)     // Catch:{ IOException -> 0x0250 }
            if (r7 == 0) goto L_0x01c8
            goto L_0x01ce
        L_0x01c8:
            java.net.NoRouteToHostException r0 = new java.net.NoRouteToHostException     // Catch:{ IOException -> 0x0250 }
            r0.<init>(r8)     // Catch:{ IOException -> 0x0250 }
            throw r0     // Catch:{ IOException -> 0x0250 }
        L_0x01ce:
            java.net.HttpURLConnection r7 = r1.f302061f     // Catch:{ IOException -> 0x0250 }
            java.lang.String r10 = "Location"
            java.lang.String r7 = r7.getHeaderField(r10)     // Catch:{ IOException -> 0x0250 }
            if (r7 == 0) goto L_0x0233
            java.net.URL r10 = new java.net.URL     // Catch:{ IOException -> 0x0250 }
            java.net.URL r8 = r1.f302058c     // Catch:{ IOException -> 0x0250 }
            r10.<init>(r8, r7)     // Catch:{ IOException -> 0x0250 }
            java.lang.String r7 = r10.getProtocol()     // Catch:{ IOException -> 0x0250 }
            java.lang.String r8 = "https"
            boolean r7 = r7.equals(r8)     // Catch:{ IOException -> 0x0250 }
            if (r7 != 0) goto L_0x0200
            java.lang.String r7 = r10.getProtocol()     // Catch:{ IOException -> 0x0250 }
            java.lang.String r8 = "http"
            boolean r7 = r7.equals(r8)     // Catch:{ IOException -> 0x0250 }
            if (r7 == 0) goto L_0x01f8
            goto L_0x0200
        L_0x01f8:
            java.net.NoRouteToHostException r0 = new java.net.NoRouteToHostException     // Catch:{ IOException -> 0x0250 }
            java.lang.String r2 = "Unsupported protocol redirect"
            r0.<init>(r2)     // Catch:{ IOException -> 0x0250 }
            throw r0     // Catch:{ IOException -> 0x0250 }
        L_0x0200:
            java.net.URL r7 = r1.f302058c     // Catch:{ IOException -> 0x0250 }
            java.lang.String r7 = r7.getProtocol()     // Catch:{ IOException -> 0x0250 }
            java.lang.String r8 = r10.getProtocol()     // Catch:{ IOException -> 0x0250 }
            r7.equals(r8)     // Catch:{ IOException -> 0x0250 }
            java.net.URL r7 = r1.f302058c     // Catch:{ IOException -> 0x0250 }
            java.lang.String r7 = r7.getHost()     // Catch:{ IOException -> 0x0250 }
            java.lang.String r8 = r10.getHost()     // Catch:{ IOException -> 0x0250 }
            boolean r7 = r7.equals(r8)     // Catch:{ IOException -> 0x0250 }
            boolean r8 = r1.f302065j     // Catch:{ IOException -> 0x0250 }
            if (r8 != 0) goto L_0x022a
            if (r7 == 0) goto L_0x0222
            goto L_0x022a
        L_0x0222:
            java.net.NoRouteToHostException r0 = new java.net.NoRouteToHostException     // Catch:{ IOException -> 0x0250 }
            java.lang.String r2 = "Cross-domain redirects are disallowed"
            r0.<init>(r2)     // Catch:{ IOException -> 0x0250 }
            throw r0     // Catch:{ IOException -> 0x0250 }
        L_0x022a:
            if (r6 == r9) goto L_0x022e
            r1.f302058c = r10     // Catch:{ IOException -> 0x0250 }
        L_0x022e:
            r12 = r6
            r8 = 1
            r9 = 0
            goto L_0x0041
        L_0x0233:
            java.net.NoRouteToHostException r0 = new java.net.NoRouteToHostException     // Catch:{ IOException -> 0x0250 }
            r0.<init>(r8)     // Catch:{ IOException -> 0x0250 }
            throw r0     // Catch:{ IOException -> 0x0250 }
        L_0x0239:
            java.net.NoRouteToHostException r0 = new java.net.NoRouteToHostException     // Catch:{ IOException -> 0x0250 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0250 }
            r2.<init>()     // Catch:{ IOException -> 0x0250 }
            java.lang.String r3 = "Too many redirects: "
            r2.append(r3)     // Catch:{ IOException -> 0x0250 }
            r2.append(r11)     // Catch:{ IOException -> 0x0250 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x0250 }
            r0.<init>(r2)     // Catch:{ IOException -> 0x0250 }
            throw r0     // Catch:{ IOException -> 0x0250 }
        L_0x0250:
            r0 = move-exception
            r12 = r6
        L_0x0252:
            r6 = r12
        L_0x0253:
            r2 = -1
            goto L_0x025a
        L_0x0256:
            r0 = move-exception
            r2 = -1
            r6 = 0
        L_0x025a:
            r1.f302062g = r2
            r17.mo142209c()
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            r3.append(r0)
            java.lang.String r4 = ", response:"
            r3.append(r4)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "seekTo exception:%s"
            com.tencent.qqmusic.mediaplayer.util.Logger.m21789e((java.lang.String) r5, (java.lang.String) r3, (java.lang.Object[]) r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xa2.C102583a.mo142208b(long):void");
    }

    /* renamed from: c */
    public final void mo142209c() {
        InputStream inputStream = this.f302064i;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.Music.MMMediaHTTPConnection", e, "teardownConnection", new Object[0]);
            }
            this.f302064i = null;
        }
        HttpURLConnection httpURLConnection = this.f302061f;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.getInputStream().close();
            } catch (Exception e2) {
                Log.m105920e("MicroMsg.Music.MMMediaHTTPConnection", e2.getMessage());
            }
            this.f302061f.disconnect();
            this.f302061f = null;
            this.f302057b = -1;
        }
    }

    public boolean connect(URL url, Map<String, String> map) {
        long r;
        int i;
        String str;
        URL url2 = url;
        HashMap hashMap = map;
        Class cls = C98327c.class;
        Logger.m21791i("MicroMsg.Music.MMMediaHTTPConnection", "connect");
        Logger.m21791i("MicroMsg.Music.MMMediaHTTPConnection", "connect: uri=" + url2 + ", headers=" + hashMap);
        disconnect();
        this.f302065j = true;
        this.f302058c = url2;
        this.f302059d = url2;
        this.f302060e = hashMap;
        if (hashMap == null) {
            HashMap hashMap2 = new HashMap();
            this.f302060e = hashMap2;
            hashMap = hashMap2;
        }
        this.f302062g = -1;
        this.f302063h = "";
        if (MMApplicationContext.isMMProcess()) {
            String url3 = this.f302058c.toString();
            if (C98329e.m127108d()) {
                str = ((C98327c) C101991b.m134284b(cls)).mo137642W(url3);
            } else {
                Log.m105920e("MicroMsg.Music.MusicDataStorageImpl", "IMusicDataStorage service not exist");
                str = null;
            }
            if (!TextUtils.isEmpty(str) && !str.equalsIgnoreCase(this.f302058c.toString())) {
                Log.m105925i("MicroMsg.Music.MMMediaHTTPConnection", "use temp shake music url to play:%s", str);
                try {
                    this.f302058c = new URL(str);
                } catch (MalformedURLException e) {
                    Log.printErrStackTrace("MicroMsg.Music.MMMediaHTTPConnection", e, V2TXJSAdapterConstants.PLAYER_KEY_PLAY_URL, new Object[0]);
                }
            }
            C99355b m = C99364n.m129618m();
            if (m != null) {
                try {
                    URL M = m.mo138775M(this.f302058c.toString());
                    if (M != null && !TextUtils.isEmpty(M.toString())) {
                        this.f302058c = M;
                        Log.m105925i("MicroMsg.Music.MMMediaHTTPConnection", "use getRedirectURL url to play:%s", M.toString());
                    }
                } catch (MalformedURLException e2) {
                    Log.printErrStackTrace("MicroMsg.Music.MMMediaHTTPConnection", e2, "getRedirectURL", new Object[0]);
                }
            }
        }
        URL url4 = this.f302058c;
        if (url4 != null) {
            String url5 = url4.toString();
            if (C32752h.f89140b.check(url5)) {
                C32752h.f89140b.get(url5).booleanValue();
            }
            String url6 = this.f302059d.toString();
            Logger.m21786d("MicroMsg.Music.MMMediaHTTPConnection", "connect, originUrlStr: " + url6);
            String str2 = this.f302067l.get(url6);
            if (!"invalidReferrer".equals(str2)) {
                hashMap.remove("referer");
                if (!Util.isNullOrNil(str2)) {
                    Logger.m21791i("MicroMsg.Music.MMMediaHTTPConnection", "connect, add referrer: " + str2);
                    try {
                        hashMap.put("Referer", str2);
                    } catch (Exception e3) {
                        Logger.m21791i("MicroMsg.Music.MMMediaHTTPConnection", "connect, put referrer fail since " + e3.toString());
                        HashMap hashMap3 = new HashMap(hashMap);
                        hashMap3.put("Referer", str2);
                        hashMap = hashMap3;
                    }
                }
            }
            Logger.m21791i("MicroMsg.Music.MMMediaHTTPConnection", "headers=" + hashMap);
        }
        C98326a aVar = new C98326a(this);
        this.f302056a = aVar;
        String a = aVar.f288211a.mo142207a();
        C98328d dVar = new C98328d(a);
        aVar.f288212b = dVar;
        dVar.f288220b = aVar.mo137633c();
        C98328d dVar2 = aVar.f288212b;
        dVar2.getClass();
        Log.m105924i("MicroMsg.Music.IndexBitMgr", "initData");
        long j = dVar2.f288220b;
        if (j <= 0) {
            Log.m105920e("MicroMsg.Music.IndexBitMgr", "fileLength is invalid!");
        } else {
            if (j % 8192 == 0 || j < 8192) {
                dVar2.f288221c = (int) (j / 8192);
            } else {
                dVar2.f288221c = ((int) (j / 8192)) + 1;
            }
            if (j <= 8192) {
                Log.m105924i("MicroMsg.Music.IndexBitMgr", "fileLength < PIECE_SIZE, count should be 1");
                dVar2.f288221c = 1;
            }
            Log.m105925i("MicroMsg.Music.IndexBitMgr", "fileLength:%d, count:%d", Long.valueOf(dVar2.f288220b), Integer.valueOf(dVar2.f288221c));
            dVar2.f288219a = new BitSet(dVar2.f288221c);
            String b = C32752h.m39803b(dVar2.f288223e);
            dVar2.f288222d = b;
            if (TextUtils.isEmpty(b)) {
                Log.m105920e("MicroMsg.Music.IndexBitMgr", "initData musicId is null!'");
            } else {
                Log.m105925i("MicroMsg.Music.IndexBitMgr", "musicId:%s", dVar2.f288222d);
                C101108q c = C98329e.m127107c(dVar2.f288222d);
                if (c == null) {
                    Log.m105920e("MicroMsg.Music.IndexBitMgr", "initData pMusic is null!'");
                } else {
                    Log.m105925i("MicroMsg.Music.IndexBitMgr", "initData music field_fileCacheComplete:%d", Integer.valueOf(c.f295983e));
                    byte[] bArr = c.f295982d;
                    if (bArr == null || bArr.length == 0) {
                        Log.m105920e("MicroMsg.Music.IndexBitMgr", "initData field_indexBitData is null!'");
                    } else {
                        BitSet bitSet = new BitSet(bArr.length * 8);
                        int i2 = 0;
                        int i3 = 0;
                        while (i2 < bArr.length) {
                            int i4 = 7;
                            while (true) {
                                i = i3;
                                if (i4 < 0) {
                                    break;
                                }
                                i3 = i + 1;
                                bitSet.set(i, ((bArr[i2] & (1 << i4)) >> i4) == 1);
                                i4--;
                            }
                            i2++;
                            i3 = i;
                        }
                        dVar2.f288219a = bitSet;
                        if (dVar2.f288221c < bitSet.cardinality()) {
                            Log.m105921e("MicroMsg.Music.IndexBitMgr", "initData cont < bitSet.cardinality(), count:%d, cardinality:%d", Integer.valueOf(dVar2.f288221c), Integer.valueOf(dVar2.f288219a.cardinality()));
                            dVar2.mo137656a();
                        } else if (c.f295985g != 1) {
                            Log.m105924i("MicroMsg.Music.IndexBitMgr", "remove dirty bit set from db, reset cache complete to 0");
                            int i5 = dVar2.f288221c;
                            if (i5 > 1) {
                                dVar2.f288219a.set(i5 - 1, false);
                                dVar2.f288219a.set(dVar2.f288221c - 2, false);
                            } else {
                                dVar2.f288219a.set(i5 - 1, false);
                            }
                            dVar2.mo137660e(0);
                        }
                        Log.m105924i("MicroMsg.Music.IndexBitMgr", "initData bitSet:" + dVar2.f288219a.toString());
                        Log.m105924i("MicroMsg.Music.IndexBitMgr", "initData bitSet count %d, cardinality:" + dVar2.f288221c + "," + dVar2.f288219a.cardinality());
                    }
                }
            }
        }
        C98330i iVar = new C98330i(a);
        aVar.f288213c = iVar;
        Uri n = C116299g2.m163858n(iVar.f288226c);
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
            Log.m105924i("MicroMsg.Music.FileBytesCacheMgr", "piece file not exist, clear cache!");
            aVar.f288212b.mo137656a();
        } else {
            C98330i iVar2 = aVar.f288213c;
            synchronized (iVar2) {
                C86009m1 m1Var = new C86009m1(iVar2.f288226c);
                r = m1Var.mo119967g() ? m1Var.mo119980r() : -1;
            }
            if (r != aVar.mo137633c() && aVar.mo137633c() != -1) {
                Log.m105924i("MicroMsg.Music.FileBytesCacheMgr", "piece file length is not equals to real file length exist, clear cache!");
                aVar.f288212b.mo137656a();
                C98330i iVar3 = aVar.f288213c;
                iVar3.getClass();
                Logger.m21791i("MicroMsg.Music.PieceFileCache", "deleteFile");
                C98330i.m127111a(iVar3.f288226c);
            } else if (aVar.mo137633c() == -1) {
                Log.m105924i("MicroMsg.Music.FileBytesCacheMgr", "getFileLength is -1, network is disconnect!");
            } else {
                Log.m105924i("MicroMsg.Music.FileBytesCacheMgr", "piece file exist!");
            }
        }
        long c2 = aVar.mo137633c();
        C98330i iVar4 = aVar.f288213c;
        iVar4.getClass();
        Logger.m21791i("MicroMsg.Music.PieceFileCache", WeChatBrands.Business.GROUP_OPEN);
        try {
            C86009m1 m1Var2 = new C86009m1(iVar4.f288226c);
            if (!m1Var2.mo119967g()) {
                Log.m105925i("MicroMsg.Music.PieceFileCache", "create file:%b", Boolean.valueOf(m1Var2.mo119964e()));
            }
            iVar4.f288224a = C86013q1.m106420B(m1Var2.mo119976n(), true);
        } catch (FileNotFoundException e4) {
            Logger.m21788e("MicroMsg.Music.PieceFileCache", "file not found", (Throwable) e4);
        } catch (IOException e5) {
            Logger.m21788e("MicroMsg.Music.PieceFileCache", "io ", (Throwable) e5);
        } finally {
            Logger.m21789e("MicroMsg.Music.PieceFileCache", "create RandomAccessFile file  %s  success", iVar4.f288226c);
        }
        C98330i iVar5 = aVar.f288213c;
        synchronized (iVar5) {
            if (iVar5.f288224a == null) {
                Logger.m21787e("MicroMsg.Music.PieceFileCache", "setLength error, randomAccessFile is null");
            } else if (c2 <= 0) {
                Logger.m21787e("MicroMsg.Music.PieceFileCache", "setLength error, length is " + c2);
            } else {
                Logger.m21789e("MicroMsg.Music.PieceFileCache", "set file length %s ", "" + c2);
                try {
                    iVar5.f288224a.setLength(c2);
                } catch (IOException e6) {
                    Logger.m21789e("MicroMsg.Music.PieceFileCache", "Error set length of file, err %s", "" + e6.getMessage());
                }
            }
        }
        if (c2 > 0) {
            C32752h.f89143e.put(a, Long.valueOf(c2));
        }
        Log.m105924i("MicroMsg.Music.FileBytesCacheMgr", "attach() fileLength is " + c2 + ",pieceFileCache length is " + aVar.f288213c.mo137661d());
        String mIMEType = aVar.f288211a.getMIMEType();
        if (!TextUtils.isEmpty(mIMEType) && !"application/octet-stream".equalsIgnoreCase(mIMEType)) {
            String b2 = C32752h.m39803b(a);
            if (TextUtils.isEmpty(b2)) {
                Log.m105920e("MicroMsg.Music.PieceCacheHelper", "setMusicMIMEType musicId is empty!");
            } else {
                if (TextUtils.isEmpty(C32752h.f89144f.check(a) ? C32752h.f89144f.get(a) : null)) {
                    Log.m105925i("MicroMsg.Music.PieceCacheHelper", "setMusicMIMEType url:%s mimeType:%s", a, mIMEType);
                    if (!TextUtils.isEmpty(a) && !TextUtils.isEmpty(mIMEType)) {
                        C32752h.f89144f.put(a, mIMEType);
                    }
                    if (C98329e.m127108d()) {
                        ((C98327c) C101991b.m134284b(cls)).mo137651m(b2, mIMEType);
                    } else {
                        Log.m105920e("MicroMsg.Music.MusicDataStorageImpl", "IMusicDataStorage service not exist");
                    }
                }
            }
        }
        aVar.f288215e = -1;
        aVar.f288216f = 0;
        aVar.f288217g = -1;
        aVar.f288218h = 0;
        return true;
    }

    public void disconnect() {
        Logger.m21791i("MicroMsg.Music.MMMediaHTTPConnection", "disconnect");
        mo142209c();
        this.f302060e = null;
        this.f302058c = null;
        C98326a aVar = this.f302056a;
        if (aVar != null) {
            aVar.mo137632b();
            aVar.f288212b.mo137659d();
            C98330i iVar = aVar.f288213c;
            synchronized (iVar) {
                Logger.m21791i("MicroMsg.Music.PieceFileCache", "close");
                RandomAccessFile randomAccessFile = iVar.f288224a;
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException e) {
                        Logger.m21789e("MicroMsg.Music.PieceFileCache", "close RandomAccessFile error ", "" + e.getMessage());
                    }
                }
            }
            aVar.f288211a = null;
            Log.m105924i("MicroMsg.Music.FileBytesCacheMgr", "detach()");
            this.f302056a = null;
            return;
        }
        return;
    }

    public String getMIMEType() {
        if (!TextUtils.isEmpty(this.f302063h)) {
            Logger.m21791i("MicroMsg.Music.MMMediaHTTPConnection", "getMIMEType mimeType:" + this.f302063h);
            return this.f302063h;
        }
        String a = mo142207a();
        String str = C32752h.f89144f.check(a) ? C32752h.f89144f.get(a) : null;
        if (!TextUtils.isEmpty(str)) {
            this.f302063h = str;
            return str;
        }
        String str2 = "";
        if (this.f302061f == null) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                mo142208b(0);
                String contentType = this.f302061f.getContentType();
                Log.m105919d("MicroMsg.Music.MMMediaHTTPConnection", "getMIMEType cost time :%d!", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                str2 = contentType;
            } catch (IOException e) {
                Logger.m21789e("MicroMsg.Music.MMMediaHTTPConnection", "getMIMEType exception:%s", str2 + e);
            }
        } else {
            long currentTimeMillis2 = System.currentTimeMillis();
            str2 = this.f302061f.getContentType();
            Logger.m21791i("MicroMsg.Music.MMMediaHTTPConnection", "getMIMEType mimeType:" + str2);
            Log.m105919d("MicroMsg.Music.MMMediaHTTPConnection", "getMIMEType cost time2 :%d!", Long.valueOf(System.currentTimeMillis() - currentTimeMillis2));
        }
        this.f302063h = str2;
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        String c = C32752h.m39804c(mo142207a());
        this.f302063h = c;
        return !TextUtils.isEmpty(c) ? c : "application/octet-stream";
    }

    public long getSize() {
        long j = this.f302062g;
        if (j > 0) {
            return j;
        }
        String a = mo142207a();
        long j2 = -1;
        if ((C32752h.f89143e.check(a) ? C32752h.f89143e.get(a).longValue() : -1) > 0) {
            String a2 = mo142207a();
            if (C32752h.f89143e.check(a2)) {
                j2 = C32752h.f89143e.get(a2).longValue();
            }
            this.f302062g = j2;
            return j2;
        }
        if (this.f302061f == null) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                mo142208b(0);
                Log.m105919d("MicroMsg.Music.MMMediaHTTPConnection", "getSize cost time :%d!", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            } catch (IOException e) {
                Logger.m21789e("MicroMsg.Music.MMMediaHTTPConnection", "getSize exception:%s", "" + e);
                this.f302062g = -1;
            }
        }
        long j3 = this.f302062g;
        if (j3 > 0) {
            return j3;
        }
        if (C98330i.m127113c(mo142207a()) <= 0) {
            return -1;
        }
        long c = C98330i.m127113c(mo142207a());
        this.f302062g = c;
        return c;
    }

    public String getUri() {
        return this.f302058c.toString();
    }

    public int readAt(long j, byte[] bArr, int i, int i2) {
        int f;
        long j2 = j;
        byte[] bArr2 = bArr;
        int i3 = i;
        int i4 = i2;
        if (i4 > this.f302066k.length) {
            this.f302066k = new byte[i4];
        }
        byte[] bArr3 = this.f302066k;
        int i5 = 0;
        Arrays.fill(bArr3, 0, bArr3.length, (byte) 0);
        try {
            if (!C32752h.m39805d(this.f302059d.toString())) {
                C98326a aVar = this.f302056a;
                if (aVar != null && (f = aVar.mo137636f(this.f302066k, (int) j2, i4)) > 0) {
                    if (f != i4) {
                        Logger.m21791i("MicroMsg.Music.MMMediaHTTPConnection", "read from cache, n%d, size %d " + f + "," + i4);
                    }
                    System.arraycopy(this.f302066k, 0, bArr2, i3, f);
                    return f;
                }
            }
            long j3 = this.f302062g;
            if (j3 <= 0 || j2 < j3 || i4 <= 0) {
                Logger.m21786d("MicroMsg.Music.MMMediaHTTPConnection", "read from network");
                if (j2 != this.f302057b) {
                    mo142208b(j);
                }
                int read = this.f302064i.read(this.f302066k, 0, i4);
                if (read != -1) {
                    System.arraycopy(this.f302066k, 0, bArr2, i3, read);
                    i5 = read;
                }
                this.f302057b += (long) i5;
                C98326a aVar2 = this.f302056a;
                if (aVar2 != null) {
                    aVar2.mo137638h(this.f302066k, (int) j2, i5);
                }
                return i5;
            }
            Log.m105921e("MicroMsg.Music.MMMediaHTTPConnection", "offset is illegal, mTotalSize:%d, offset:%d, size:%d", Long.valueOf(j3), Long.valueOf(j), Integer.valueOf(i2));
            return 0;
        } catch (ProtocolException e) {
            Logger.m21787e("MicroMsg.Music.MMMediaHTTPConnection", "readAt " + j2 + " / " + i4 + " => " + e);
            C32752h.m39806e(this.f302059d.toString(), 750);
            mo142209c();
            return -1010;
        } catch (NoRouteToHostException e2) {
            Logger.m21787e("MicroMsg.Music.MMMediaHTTPConnection", "readAt " + j2 + " / " + i4 + " => " + e2);
            C32752h.m39806e(this.f302059d.toString(), 751);
            mo142209c();
            return -1010;
        } catch (UnknownServiceException e3) {
            Logger.m21787e("MicroMsg.Music.MMMediaHTTPConnection", "readAt " + j2 + " / " + i4 + " => " + e3);
            C32752h.m39806e(this.f302059d.toString(), 752);
            mo142209c();
            return -1010;
        } catch (IOException e4) {
            Logger.m21787e("MicroMsg.Music.MMMediaHTTPConnection", "readAt " + j2 + " / " + i4 + " => -1 " + e4);
            C32752h.m39806e(this.f302059d.toString(), 753);
            mo142209c();
            return -1;
        } catch (Exception e5) {
            Logger.m21787e("MicroMsg.Music.MMMediaHTTPConnection", "unknown exception " + e5);
            Logger.m21787e("MicroMsg.Music.MMMediaHTTPConnection", "readAt " + j2 + " / " + i4 + " => -1");
            C32752h.m39806e(this.f302059d.toString(), C83039u.CTRL_INDEX);
            mo142209c();
            return -1;
        }
    }
}
