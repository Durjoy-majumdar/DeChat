package mb3;

import android.net.SSLCertificateSocketFactory;
import android.net.SSLSessionCache;
import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.security.SecureRandom;
import java.util.concurrent.Future;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import rd3.C48020a;

/* renamed from: mb3.c */
public class C46982c implements Runnable {

    /* renamed from: d */
    public C46985f f126312d;

    /* renamed from: e */
    public Future<?> f126313e;

    /* renamed from: f */
    public HttpURLConnection f126314f;

    /* renamed from: g */
    public int f126315g;

    /* renamed from: h */
    public int f126316h = 0;

    /* renamed from: i */
    public String f126317i;

    /* renamed from: j */
    public String f126318j;

    /* renamed from: n */
    public String f126319n;

    /* renamed from: o */
    public String f126320o;

    /* renamed from: p */
    public boolean f126321p;

    /* renamed from: q */
    public boolean f126322q;

    /* renamed from: r */
    public boolean f126323r = false;

    public C46982c(C46985f fVar) {
        this.f126312d = fVar;
    }

    /* renamed from: e */
    public static long m52293e(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            return Long.valueOf(str).longValue();
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public final void mo72166a(int i, HttpsURLConnection httpsURLConnection) {
        SSLContext sSLContext;
        SSLContext sSLContext2;
        try {
            sSLContext = SSLContext.getInstance("TLSv1.2");
        } catch (Exception unused) {
            sSLContext = null;
        }
        if (sSLContext == null) {
            try {
                sSLContext2 = SSLContext.getInstance("TLSv1");
            } catch (Exception unused2) {
                sSLContext2 = null;
            }
            if (sSLContext == null) {
                try {
                    sSLContext = SSLContext.getDefault();
                } catch (Exception unused3) {
                }
            }
        }
        if (sSLContext != null) {
            try {
                sSLContext.init((KeyManager[]) null, (TrustManager[]) null, new SecureRandom());
                httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
                return;
            } catch (Exception unused4) {
            }
        }
        httpsURLConnection.setSSLSocketFactory(SSLCertificateSocketFactory.getDefault(i, new SSLSessionCache(MMApplicationContext.getContext())));
    }

    /* renamed from: b */
    public final boolean mo72167b() {
        long c = C48020a.m53386c(this.f126312d.f126334g);
        Log.m105925i("MicroMsg.Wepkg.WePkgDownloadTask", "%s: RangeOffset = %d", this.f126312d.f126328a, Long.valueOf(c));
        if (c == 0) {
            return false;
        }
        HttpURLConnection httpURLConnection = this.f126314f;
        httpURLConnection.addRequestProperty("Range", "bytes=" + c + "-");
        return true;
    }

    /* renamed from: c */
    public final OutputStream mo72168c(String str, String str2, boolean z) {
        Log.m105919d("MicroMsg.Wepkg.WePkgDownloadTask", "%s: getOutputStream, filePath %s", str2, str);
        if (!Util.isNullOrNil(str)) {
            return new BufferedOutputStream(C86013q1.m106429K(str, z));
        }
        throw new FileNotFoundException(String.format("%s filePath is null or nil", new Object[]{str2}));
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x007b A[Catch:{ Exception -> 0x01c1, all -> 0x01bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c7 A[Catch:{ Exception -> 0x01c1, all -> 0x01bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fb A[Catch:{ Exception -> 0x01c1, all -> 0x01bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0102 A[Catch:{ Exception -> 0x01c1, all -> 0x01bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01c7 A[Catch:{ all -> 0x0224 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01cc A[Catch:{ all -> 0x0224 }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo72169d() {
        /*
            r17 = this;
            r1 = r17
            java.lang.String r2 = "MicroMsg.Wepkg.WePkgDownloadTask"
            r3 = 0
            r1.f126315g = r3
            r4 = 0
            r5 = 1
            java.net.HttpURLConnection r0 = r1.f126314f     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            int r0 = r0.getResponseCode()     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            r1.f126315g = r0     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            java.lang.String r6 = "%s: received status code = %d"
            r7 = 2
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            mb3.f r9 = r1.f126312d     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            java.lang.String r9 = r9.f126328a     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            r8[r3] = r9     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            r8[r5] = r0     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r6, r8)     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            int r0 = r1.f126315g     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            r6 = 200(0xc8, float:2.8E-43)
            if (r0 == r6) goto L_0x0033
            r6 = 206(0xce, float:2.89E-43)
            if (r0 == r6) goto L_0x0033
            r1.f126316h = r0     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            goto L_0x00ff
        L_0x0033:
            java.net.HttpURLConnection r0 = r1.f126314f     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            java.lang.String r6 = "Content-Type"
            java.lang.String r0 = r0.getHeaderField(r6)     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            r1.f126317i = r0     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            java.net.HttpURLConnection r0 = r1.f126314f     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            r0.getHeaderFields()     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            java.net.HttpURLConnection r0 = r1.f126314f     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            java.lang.String r6 = "Content-Range"
            java.lang.String r0 = r0.getHeaderField(r6)     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            r1.f126318j = r0     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            java.net.HttpURLConnection r0 = r1.f126314f     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            java.lang.String r6 = "Content-Length"
            java.lang.String r0 = r0.getHeaderField(r6)     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            r1.f126319n = r0     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            java.net.HttpURLConnection r0 = r1.f126314f     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            java.lang.String r6 = "Accept-Ranges"
            java.lang.String r0 = r0.getHeaderField(r6)     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            java.lang.String r6 = "bytes"
            boolean r0 = r6.equals(r0)     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            if (r0 == 0) goto L_0x0067
            goto L_0x0071
        L_0x0067:
            java.lang.String r0 = r1.f126318j     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            if (r0 == 0) goto L_0x0073
            boolean r0 = r0.startsWith(r6)     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            if (r0 == 0) goto L_0x0073
        L_0x0071:
            r0 = 1
            goto L_0x0074
        L_0x0073:
            r0 = 0
        L_0x0074:
            boolean r6 = r1.f126322q     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            r8 = -1
            r10 = -1
            if (r6 == 0) goto L_0x00c7
            if (r0 != 0) goto L_0x0090
            java.lang.String r6 = "Header no Accept-Ranges, not support range"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r6)     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            mb3.f r6 = r1.f126312d     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            java.lang.String r6 = r6.f126334g     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            rd3.C48020a.m53384a(r6)     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            java.lang.String r6 = r1.f126319n     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            long r11 = m52293e(r6)     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            goto L_0x00d3
        L_0x0090:
            java.lang.String r6 = r1.f126318j     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            boolean r11 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            if (r11 != 0) goto L_0x00ae
            java.lang.String r11 = "/"
            java.lang.String[] r6 = r6.split(r11)     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            if (r6 == 0) goto L_0x00ae
            int r11 = r6.length     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            if (r11 != r7) goto L_0x00ae
            r6 = r6[r5]     // Catch:{ NumberFormatException -> 0x00ae }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ NumberFormatException -> 0x00ae }
            int r6 = r6.intValue()     // Catch:{ NumberFormatException -> 0x00ae }
            goto L_0x00af
        L_0x00ae:
            r6 = -1
        L_0x00af:
            long r11 = (long) r6
            int r6 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r6 != 0) goto L_0x00d3
            java.lang.String r0 = "content-range in header is error, not support range"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            mb3.f r0 = r1.f126312d     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            java.lang.String r0 = r0.f126334g     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            rd3.C48020a.m53384a(r0)     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            java.lang.String r0 = r1.f126319n     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            long r11 = m52293e(r0)     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            goto L_0x00d2
        L_0x00c7:
            java.lang.String r0 = "local dont have download file. not support range"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            java.lang.String r0 = r1.f126319n     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            long r11 = m52293e(r0)     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
        L_0x00d2:
            r0 = 0
        L_0x00d3:
            r1.f126323r = r0     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            java.lang.String r6 = "%s: content-range = %s, content-length = %s, content-type = %s, isSupportRange = %b"
            r13 = 5
            java.lang.Object[] r13 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            mb3.f r14 = r1.f126312d     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            java.lang.String r14 = r14.f126328a     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            r13[r3] = r14     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            java.lang.String r14 = r1.f126318j     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            r13[r5] = r14     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            java.lang.String r14 = r1.f126319n     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            r13[r7] = r14     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            java.lang.String r14 = r1.f126317i     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            r15 = 3
            r13[r15] = r14     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            r14 = 4
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            r13[r14] = r16     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r6, r13)     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            int r6 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r6 != 0) goto L_0x0102
            r0 = 1010(0x3f2, float:1.415E-42)
            r1.f126316h = r0     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
        L_0x00ff:
            r0 = r4
            goto L_0x01ac
        L_0x0102:
            java.lang.String r6 = "ServerLength(%d) and HeaderLength(%d)"
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            mb3.f r9 = r1.f126312d     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            long r13 = r9.f126335h     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            java.lang.Long r9 = java.lang.Long.valueOf(r13)     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            r8[r3] = r9     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            java.lang.Long r9 = java.lang.Long.valueOf(r11)     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            r8[r5] = r9     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r6, r8)     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            java.net.HttpURLConnection r6 = r1.f126314f     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            java.lang.String r6 = r6.getContentEncoding()     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            r1.f126320o = r6     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            java.net.HttpURLConnection r6 = r1.f126314f     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            java.io.InputStream r6 = r6.getInputStream()     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            java.lang.String r8 = r1.f126320o     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            if (r8 != 0) goto L_0x0144
            java.lang.String r8 = r1.f126320o     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            java.lang.String r9 = "gzip"
            boolean r8 = r8.contains(r9)     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            if (r8 == 0) goto L_0x0144
            java.lang.String r8 = "Content encoding is gzip"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r8)     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            java.util.zip.GZIPInputStream r8 = new java.util.zip.GZIPInputStream     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            r8.<init>(r6)     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            goto L_0x0149
        L_0x0144:
            java.io.BufferedInputStream r8 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
            r8.<init>(r6)     // Catch:{ Exception -> 0x01c1, all -> 0x01bd }
        L_0x0149:
            mb3.f r6 = r1.f126312d     // Catch:{ Exception -> 0x01b9, all -> 0x01b4 }
            java.lang.String r9 = r6.f126334g     // Catch:{ Exception -> 0x01b9, all -> 0x01b4 }
            java.lang.String r6 = r6.f126328a     // Catch:{ Exception -> 0x01b9, all -> 0x01b4 }
            boolean r11 = r1.f126322q     // Catch:{ Exception -> 0x01b9, all -> 0x01b4 }
            if (r11 == 0) goto L_0x0157
            if (r0 == 0) goto L_0x0157
            r11 = 1
            goto L_0x0158
        L_0x0157:
            r11 = 0
        L_0x0158:
            java.io.OutputStream r4 = r1.mo72168c(r9, r6, r11)     // Catch:{ Exception -> 0x01b9, all -> 0x01b4 }
            java.lang.String r6 = "%s: append = %b, isSupportRange = %s"
            java.lang.Object[] r9 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x01b9, all -> 0x01b4 }
            mb3.f r11 = r1.f126312d     // Catch:{ Exception -> 0x01b9, all -> 0x01b4 }
            java.lang.String r11 = r11.f126328a     // Catch:{ Exception -> 0x01b9, all -> 0x01b4 }
            r9[r3] = r11     // Catch:{ Exception -> 0x01b9, all -> 0x01b4 }
            boolean r11 = r1.f126322q     // Catch:{ Exception -> 0x01b9, all -> 0x01b4 }
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)     // Catch:{ Exception -> 0x01b9, all -> 0x01b4 }
            r9[r5] = r11     // Catch:{ Exception -> 0x01b9, all -> 0x01b4 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x01b9, all -> 0x01b4 }
            r9[r7] = r0     // Catch:{ Exception -> 0x01b9, all -> 0x01b4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r6, r9)     // Catch:{ Exception -> 0x01b9, all -> 0x01b4 }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r6 = new byte[r0]     // Catch:{ Exception -> 0x01b9, all -> 0x01b4 }
            r9 = 0
        L_0x017c:
            int r11 = r8.read(r6, r3, r0)     // Catch:{ Exception -> 0x01b9, all -> 0x01b4 }
            if (r11 == r10) goto L_0x0187
            r4.write(r6, r3, r11)     // Catch:{ Exception -> 0x01b9, all -> 0x01b4 }
            int r9 = r9 + r11
            goto L_0x017c
        L_0x0187:
            java.lang.String r0 = "%s: read count = %d"
            java.lang.Object[] r6 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x01b9, all -> 0x01b4 }
            mb3.f r7 = r1.f126312d     // Catch:{ Exception -> 0x01b9, all -> 0x01b4 }
            java.lang.String r7 = r7.f126333f     // Catch:{ Exception -> 0x01b9, all -> 0x01b4 }
            r6[r3] = r7     // Catch:{ Exception -> 0x01b9, all -> 0x01b4 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x01b9, all -> 0x01b4 }
            r6[r5] = r7     // Catch:{ Exception -> 0x01b9, all -> 0x01b4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r0, r6)     // Catch:{ Exception -> 0x01b9, all -> 0x01b4 }
            r4.flush()     // Catch:{ Exception -> 0x01b9, all -> 0x01b4 }
            java.lang.String r0 = "%s: download complete, flush and send complete status"
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x01b9, all -> 0x01b4 }
            mb3.f r7 = r1.f126312d     // Catch:{ Exception -> 0x01b9, all -> 0x01b4 }
            java.lang.String r7 = r7.f126333f     // Catch:{ Exception -> 0x01b9, all -> 0x01b4 }
            r6[r3] = r7     // Catch:{ Exception -> 0x01b9, all -> 0x01b4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r0, r6)     // Catch:{ Exception -> 0x01b9, all -> 0x01b4 }
            r0 = r4
            r4 = r8
        L_0x01ac:
            rd3.C48020a.m53388e(r4)
            rd3.C48020a.m53388e(r0)
            goto L_0x0223
        L_0x01b4:
            r0 = move-exception
            r6 = r4
            r4 = r8
            goto L_0x0225
        L_0x01b9:
            r0 = move-exception
            r6 = r4
            r4 = r8
            goto L_0x01c3
        L_0x01bd:
            r0 = move-exception
            r6 = r4
            goto L_0x0225
        L_0x01c1:
            r0 = move-exception
            r6 = r4
        L_0x01c3:
            boolean r7 = r1.f126321p     // Catch:{ all -> 0x0224 }
            if (r7 == 0) goto L_0x01cc
            r7 = 1001(0x3e9, float:1.403E-42)
            r1.f126316h = r7     // Catch:{ all -> 0x0224 }
            goto L_0x0210
        L_0x01cc:
            ob0.b0 r7 = f40.C86709a0.m107524d()     // Catch:{ all -> 0x0224 }
            int r7 = r7.mo123467m()     // Catch:{ all -> 0x0224 }
            if (r7 != 0) goto L_0x01db
            r7 = 1002(0x3ea, float:1.404E-42)
            r1.f126316h = r7     // Catch:{ all -> 0x0224 }
            goto L_0x0210
        L_0x01db:
            boolean r7 = r0 instanceof javax.net.ssl.SSLException     // Catch:{ all -> 0x0224 }
            if (r7 == 0) goto L_0x01e2
            r7 = 1013(0x3f5, float:1.42E-42)
            goto L_0x020e
        L_0x01e2:
            boolean r7 = r0 instanceof java.net.SocketTimeoutException     // Catch:{ all -> 0x0224 }
            if (r7 == 0) goto L_0x01e9
            r7 = 1003(0x3eb, float:1.406E-42)
            goto L_0x020e
        L_0x01e9:
            boolean r7 = r0 instanceof java.net.UnknownHostException     // Catch:{ all -> 0x0224 }
            if (r7 == 0) goto L_0x01f0
            r7 = 1004(0x3ec, float:1.407E-42)
            goto L_0x020e
        L_0x01f0:
            boolean r7 = r0 instanceof java.net.ConnectException     // Catch:{ all -> 0x0224 }
            if (r7 == 0) goto L_0x01f7
            r7 = 1005(0x3ed, float:1.408E-42)
            goto L_0x020e
        L_0x01f7:
            boolean r7 = r0 instanceof java.net.SocketException     // Catch:{ all -> 0x0224 }
            if (r7 == 0) goto L_0x01fe
            r7 = 1006(0x3ee, float:1.41E-42)
            goto L_0x020e
        L_0x01fe:
            boolean r7 = r0 instanceof java.io.IOException     // Catch:{ all -> 0x0224 }
            if (r7 == 0) goto L_0x0205
            r7 = 1007(0x3ef, float:1.411E-42)
            goto L_0x020e
        L_0x0205:
            boolean r7 = r0 instanceof java.lang.InterruptedException     // Catch:{ all -> 0x0224 }
            if (r7 == 0) goto L_0x020c
            r7 = 1008(0x3f0, float:1.413E-42)
            goto L_0x020e
        L_0x020c:
            r7 = 1000(0x3e8, float:1.401E-42)
        L_0x020e:
            r1.f126316h = r7     // Catch:{ all -> 0x0224 }
        L_0x0210:
            java.lang.String r7 = "exception : %s"
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0224 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0224 }
            r5[r3] = r0     // Catch:{ all -> 0x0224 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r7, r5)     // Catch:{ all -> 0x0224 }
            rd3.C48020a.m53388e(r4)
            rd3.C48020a.m53388e(r6)
        L_0x0223:
            return
        L_0x0224:
            r0 = move-exception
        L_0x0225:
            rd3.C48020a.m53388e(r4)
            rd3.C48020a.m53388e(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mb3.C46982c.mo72169d():void");
    }

    /* renamed from: f */
    public final void mo72170f() {
        this.f126314f.setRequestProperty("Accept-Encoding", "gzip, deflate");
        String property = System.getProperty("http.agent");
        if (!Util.isNullOrNil(property)) {
            this.f126314f.setRequestProperty("User-agent", property);
        }
    }

    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r7v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0104, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0105, code lost:
        r6 = 1013;
        r7 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0147, code lost:
        if (r1.f126312d.f126333f.startsWith(com.tencent.mapsdk.internal.C113600ck.f339986i) == false) goto L_0x01a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x014b, code lost:
        if (r1.f126316h != 1013) goto L_0x01a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x014d, code lost:
        if (r14 < 2) goto L_0x01a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x014f, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.Wepkg.WePkgDownloadTask", "change https to http request");
        r0 = r1.f126312d;
        r0.f126333f = r0.f126333f.replaceFirst(com.tencent.mapsdk.internal.C113600ck.f339986i, "http");
        r1.f126316h = 0;
        r1.f126323r = false;
        r24 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0164, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0165, code lost:
        r6 = 1013;
        r7 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105921e("MicroMsg.Wepkg.WePkgDownloadTask", "run exception : %s", r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0188, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.Wepkg.WePkgDownloadTask", "change https to http request");
        r0 = r1.f126312d;
        r0.f126333f = r0.f126333f.replaceFirst(com.tencent.mapsdk.internal.C113600ck.f339986i, "http");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c6, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01d7, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.Wepkg.WePkgDownloadTask", "change https to http request");
        r3 = r1.f126312d;
        r3.f126333f = r3.f126333f.replaceFirst(com.tencent.mapsdk.internal.C113600ck.f339986i, "http");
        r1.f126316h = 0;
        r1.f126323r = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01e9, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0164 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:8:0x001d] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01c3 A[LOOP:0: B:7:0x0019->B:82:0x01c3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01a2 A[EDGE_INSN: B:97:0x01a2->B:78:0x01a2 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r25 = this;
            r1 = r25
            java.lang.String r2 = "http"
            java.lang.String r3 = "change https to http request"
            java.lang.String r4 = "MicroMsg.Wepkg.WePkgDownloadTask"
            java.lang.String r5 = "https"
            mb3.f r0 = r1.f126312d
            if (r0 != 0) goto L_0x000f
            return
        L_0x000f:
            java.lang.String r6 = r0.f126333f
            if (r6 != 0) goto L_0x0014
            return
        L_0x0014:
            r0.getClass()
            r7 = 0
            r14 = 0
        L_0x0019:
            r13 = 2
            r12 = 1013(0x3f5, float:1.42E-42)
            r11 = 1
            java.net.URL r8 = new java.net.URL     // Catch:{ Exception -> 0x0104, all -> 0x0164 }
            mb3.f r0 = r1.f126312d     // Catch:{ Exception -> 0x0104, all -> 0x0164 }
            java.lang.String r0 = r0.f126333f     // Catch:{ Exception -> 0x0104, all -> 0x0164 }
            r8.<init>(r0)     // Catch:{ Exception -> 0x0104, all -> 0x0164 }
            java.net.HttpURLConnection r0 = r1.f126314f     // Catch:{ Exception -> 0x0104, all -> 0x0164 }
            if (r0 == 0) goto L_0x003f
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ Exception -> 0x0032, all -> 0x0164 }
            r0.close()     // Catch:{ Exception -> 0x0032, all -> 0x0164 }
            goto L_0x003a
        L_0x0032:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x0104, all -> 0x0164 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)     // Catch:{ Exception -> 0x0104, all -> 0x0164 }
        L_0x003a:
            java.net.HttpURLConnection r0 = r1.f126314f     // Catch:{ Exception -> 0x0104, all -> 0x0164 }
            r0.disconnect()     // Catch:{ Exception -> 0x0104, all -> 0x0164 }
        L_0x003f:
            java.net.URLConnection r0 = r8.openConnection()     // Catch:{ Exception -> 0x0104, all -> 0x0164 }
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ Exception -> 0x0104, all -> 0x0164 }
            r1.f126314f = r0     // Catch:{ Exception -> 0x0104, all -> 0x0164 }
            mb3.f r9 = r1.f126312d     // Catch:{ Exception -> 0x0104, all -> 0x0164 }
            r9.getClass()     // Catch:{ Exception -> 0x0104, all -> 0x0164 }
            r9 = 20000(0x4e20, float:2.8026E-41)
            r0.setConnectTimeout(r9)     // Catch:{ Exception -> 0x0104, all -> 0x0164 }
            java.net.HttpURLConnection r0 = r1.f126314f     // Catch:{ Exception -> 0x0104, all -> 0x0164 }
            mb3.f r10 = r1.f126312d     // Catch:{ Exception -> 0x0104, all -> 0x0164 }
            r10.getClass()     // Catch:{ Exception -> 0x0104, all -> 0x0164 }
            r0.setReadTimeout(r9)     // Catch:{ Exception -> 0x0104, all -> 0x0164 }
            java.net.HttpURLConnection r0 = r1.f126314f     // Catch:{ Exception -> 0x0104, all -> 0x0164 }
            r0.setUseCaches(r7)     // Catch:{ Exception -> 0x0104, all -> 0x0164 }
            java.net.HttpURLConnection r0 = r1.f126314f     // Catch:{ Exception -> 0x0104, all -> 0x0164 }
            r0.setDoInput(r11)     // Catch:{ Exception -> 0x0104, all -> 0x0164 }
            java.net.HttpURLConnection r0 = r1.f126314f     // Catch:{ Exception -> 0x0104, all -> 0x0164 }
            java.lang.String r10 = "GET"
            r0.setRequestMethod(r10)     // Catch:{ Exception -> 0x0104, all -> 0x0164 }
            java.net.HttpURLConnection r0 = r1.f126314f     // Catch:{ Exception -> 0x0104, all -> 0x0164 }
            r0.setDoOutput(r7)     // Catch:{ Exception -> 0x0104, all -> 0x0164 }
            java.net.HttpURLConnection r0 = r1.f126314f     // Catch:{ Exception -> 0x0104, all -> 0x0164 }
            r0.setInstanceFollowRedirects(r11)     // Catch:{ Exception -> 0x0104, all -> 0x0164 }
            r25.mo72170f()     // Catch:{ Exception -> 0x0104, all -> 0x0164 }
            mb3.f r0 = r1.f126312d     // Catch:{ Exception -> 0x0104, all -> 0x0164 }
            r0.getClass()     // Catch:{ Exception -> 0x0104, all -> 0x0164 }
            boolean r0 = r25.mo72167b()     // Catch:{ Exception -> 0x0104, all -> 0x0164 }
            r1.f126322q = r0     // Catch:{ Exception -> 0x0104, all -> 0x0164 }
            java.lang.String r0 = r8.getProtocol()     // Catch:{ Exception -> 0x0104, all -> 0x0164 }
            boolean r0 = r5.equalsIgnoreCase(r0)     // Catch:{ Exception -> 0x0104, all -> 0x0164 }
            if (r0 == 0) goto L_0x009a
            mb3.f r0 = r1.f126312d     // Catch:{ Exception -> 0x0104, all -> 0x0164 }
            r0.getClass()     // Catch:{ Exception -> 0x0104, all -> 0x0164 }
            java.net.HttpURLConnection r0 = r1.f126314f     // Catch:{ Exception -> 0x0104, all -> 0x0164 }
            javax.net.ssl.HttpsURLConnection r0 = (javax.net.ssl.HttpsURLConnection) r0     // Catch:{ Exception -> 0x0104, all -> 0x0164 }
            r1.mo72166a(r9, r0)     // Catch:{ Exception -> 0x0104, all -> 0x0164 }
        L_0x009a:
            r25.mo72169d()     // Catch:{ Exception -> 0x0104, all -> 0x0164 }
            java.lang.String r0 = "handle responose retcode:%s"
            java.lang.Object[] r8 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x0104, all -> 0x0164 }
            int r9 = r1.f126316h     // Catch:{ Exception -> 0x0104, all -> 0x0164 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x0104, all -> 0x0164 }
            r8[r7] = r9     // Catch:{ Exception -> 0x0104, all -> 0x0164 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r0, r8)     // Catch:{ Exception -> 0x0104, all -> 0x0164 }
            int r0 = r1.f126316h     // Catch:{ Exception -> 0x0104, all -> 0x0164 }
            if (r0 != 0) goto L_0x0109
            mb3.f r9 = r1.f126312d     // Catch:{ Exception -> 0x0104, all -> 0x0164 }
            mb3.a r0 = r9.f126338k     // Catch:{ Exception -> 0x0104, all -> 0x0164 }
            if (r0 == 0) goto L_0x0100
            mb3.g r10 = new mb3.g     // Catch:{ Exception -> 0x0104, all -> 0x0164 }
            r16 = 1
            r17 = 0
            boolean r8 = r1.f126323r     // Catch:{ Exception -> 0x0104, all -> 0x0164 }
            if (r8 == 0) goto L_0x00c3
            r18 = 1
            goto L_0x00c5
        L_0x00c3:
            r18 = 0
        L_0x00c5:
            r8 = r10
            r15 = r10
            r10 = r16
            r6 = 1
            r11 = r17
            r6 = 1013(0x3f5, float:1.42E-42)
            r12 = r18
            r7 = 2
            r13 = r14
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x00fd }
            com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader$b r0 = (com.tencent.p014mm.plugin.wepkg.downloader.WePkgDownloader.C44473b) r0     // Catch:{ Exception -> 0x00fd }
            r0.mo69241a(r15)     // Catch:{ Exception -> 0x00fd }
            mb3.f r0 = r1.f126312d
            java.lang.String r0 = r0.f126333f
            boolean r0 = r0.startsWith(r5)
            if (r0 == 0) goto L_0x00fc
            int r0 = r1.f126316h
            if (r0 != r6) goto L_0x00fc
            if (r14 < r7) goto L_0x00fc
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            mb3.f r0 = r1.f126312d
            java.lang.String r3 = r0.f126333f
            java.lang.String r2 = r3.replaceFirst(r5, r2)
            r0.f126333f = r2
            r2 = 0
            r1.f126316h = r2
            r1.f126323r = r2
        L_0x00fc:
            return
        L_0x00fd:
            r0 = move-exception
            goto L_0x0169
        L_0x0100:
            r6 = 1013(0x3f5, float:1.42E-42)
            r7 = 2
            goto L_0x0121
        L_0x0104:
            r0 = move-exception
            r6 = 1013(0x3f5, float:1.42E-42)
            r7 = 2
            goto L_0x0169
        L_0x0109:
            r6 = 1013(0x3f5, float:1.42E-42)
            r7 = 2
            r8 = 1011(0x3f3, float:1.417E-42)
            if (r0 == r8) goto L_0x013f
            r8 = 1001(0x3e9, float:1.403E-42)
            if (r0 == r8) goto L_0x013f
            r8 = 1009(0x3f1, float:1.414E-42)
            if (r0 == r8) goto L_0x013f
            r8 = 1002(0x3ea, float:1.404E-42)
            if (r0 == r8) goto L_0x013f
            r8 = 1007(0x3ef, float:1.411E-42)
            if (r0 != r8) goto L_0x0121
            goto L_0x013f
        L_0x0121:
            mb3.f r0 = r1.f126312d
            java.lang.String r0 = r0.f126333f
            boolean r0 = r0.startsWith(r5)
            if (r0 == 0) goto L_0x019d
            int r0 = r1.f126316h
            if (r0 != r6) goto L_0x019d
            if (r14 < r7) goto L_0x019d
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            mb3.f r0 = r1.f126312d
            java.lang.String r6 = r0.f126333f
            java.lang.String r6 = r6.replaceFirst(r5, r2)
            r0.f126333f = r6
            goto L_0x0195
        L_0x013f:
            mb3.f r0 = r1.f126312d
            java.lang.String r0 = r0.f126333f
            boolean r0 = r0.startsWith(r5)
            if (r0 == 0) goto L_0x01a2
            int r0 = r1.f126316h
            if (r0 != r6) goto L_0x01a2
            if (r14 < r7) goto L_0x01a2
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            mb3.f r0 = r1.f126312d
            java.lang.String r3 = r0.f126333f
            java.lang.String r2 = r3.replaceFirst(r5, r2)
            r0.f126333f = r2
            r2 = 0
            r1.f126316h = r2
            r1.f126323r = r2
            r24 = -1
            goto L_0x01a4
        L_0x0164:
            r0 = move-exception
            r6 = 1013(0x3f5, float:1.42E-42)
            r7 = 2
            goto L_0x01c7
        L_0x0169:
            java.lang.String r8 = "run exception : %s"
            r9 = 1
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ all -> 0x01c6 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x01c6 }
            r9 = 0
            r10[r9] = r0     // Catch:{ all -> 0x01c6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r8, r10)     // Catch:{ all -> 0x01c6 }
            mb3.f r0 = r1.f126312d
            java.lang.String r0 = r0.f126333f
            boolean r0 = r0.startsWith(r5)
            if (r0 == 0) goto L_0x019d
            int r0 = r1.f126316h
            if (r0 != r6) goto L_0x019d
            if (r14 < r7) goto L_0x019d
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            mb3.f r0 = r1.f126312d
            java.lang.String r6 = r0.f126333f
            java.lang.String r6 = r6.replaceFirst(r5, r2)
            r0.f126333f = r6
        L_0x0195:
            r6 = 0
            r1.f126316h = r6
            r1.f126323r = r6
            r6 = 1
            r14 = -1
            goto L_0x019e
        L_0x019d:
            r6 = 1
        L_0x019e:
            int r14 = r14 + r6
            r8 = 3
            if (r14 < r8) goto L_0x01c3
        L_0x01a2:
            r24 = r14
        L_0x01a4:
            mb3.f r0 = r1.f126312d
            mb3.a r2 = r0.f126338k
            if (r2 == 0) goto L_0x01c2
            mb3.g r3 = new mb3.g
            r21 = 2
            int r4 = r1.f126316h
            boolean r5 = r1.f126323r
            r19 = r3
            r20 = r0
            r22 = r4
            r23 = r5
            r19.<init>(r20, r21, r22, r23, r24)
            com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader$b r2 = (com.tencent.p014mm.plugin.wepkg.downloader.WePkgDownloader.C44473b) r2
            r2.mo69241a(r3)
        L_0x01c2:
            return
        L_0x01c3:
            r7 = 0
            goto L_0x0019
        L_0x01c6:
            r0 = move-exception
        L_0x01c7:
            mb3.f r8 = r1.f126312d
            java.lang.String r8 = r8.f126333f
            boolean r8 = r8.startsWith(r5)
            if (r8 == 0) goto L_0x01e9
            int r8 = r1.f126316h
            if (r8 != r6) goto L_0x01e9
            if (r14 < r7) goto L_0x01e9
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            mb3.f r3 = r1.f126312d
            java.lang.String r4 = r3.f126333f
            java.lang.String r2 = r4.replaceFirst(r5, r2)
            r3.f126333f = r2
            r2 = 0
            r1.f126316h = r2
            r1.f126323r = r2
        L_0x01e9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mb3.C46982c.run():void");
    }
}
