package p300c8;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import p300c8.C79958t;
import p333e8.C20551y;
import p333e8.C86463o;
import p984j7.C87901b;

/* renamed from: c8.p */
public class C79953p implements C79958t {

    /* renamed from: p */
    public static final Pattern f234199p = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: q */
    public static final AtomicReference<byte[]> f234200q = new AtomicReference<>();

    /* renamed from: a */
    public final boolean f234201a;

    /* renamed from: b */
    public final int f234202b;

    /* renamed from: c */
    public final int f234203c;

    /* renamed from: d */
    public final String f234204d;

    /* renamed from: e */
    public final C79958t.C79963e f234205e;

    /* renamed from: f */
    public final C79958t.C79963e f234206f;

    /* renamed from: g */
    public final C79967x<? super C79953p> f234207g;

    /* renamed from: h */
    public C79950j f234208h;

    /* renamed from: i */
    public HttpURLConnection f234209i;

    /* renamed from: j */
    public InputStream f234210j;

    /* renamed from: k */
    public boolean f234211k;

    /* renamed from: l */
    public long f234212l;

    /* renamed from: m */
    public long f234213m;

    /* renamed from: n */
    public long f234214n;

    /* renamed from: o */
    public long f234215o;

    public C79953p(String str, C86463o<String> oVar, C79967x<? super C79953p> xVar, int i, int i2, boolean z, C79958t.C79963e eVar) {
        if (!TextUtils.isEmpty(str)) {
            this.f234204d = str;
            this.f234207g = xVar;
            this.f234206f = new C79958t.C79963e();
            this.f234202b = i;
            this.f234203c = i2;
            this.f234201a = z;
            this.f234205e = eVar;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: f */
    public static void m97172f(HttpURLConnection httpURLConnection, long j) {
        int i = C20551y.f57835a;
        if (i == 19 || i == 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if (name.equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream") || name.equals("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream")) {
                    Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo110139a() {
        HttpURLConnection httpURLConnection = this.f234209i;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                C87901b.m109400a("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.f234209i = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
        if (r7 != 0) goto L_0x0043;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo110126b(p300c8.C79950j r18) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            java.lang.String r0 = "DefaultHttpDataSource"
            java.lang.String r3 = "Unable to connect to "
            r1.f234208h = r2
            r4 = 0
            r1.f234215o = r4
            r1.f234214n = r4
            r6 = 1
            java.net.HttpURLConnection r7 = r17.mo110140d(r18)     // Catch:{ IOException -> 0x016c }
            r1.f234209i = r7     // Catch:{ IOException -> 0x016c }
            int r7 = r7.getResponseCode()     // Catch:{ IOException -> 0x014d }
            java.lang.String r8 = "open, responseCode:%d"
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ IOException -> 0x014d }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x014d }
            r11 = 0
            r9[r11] = r10     // Catch:{ IOException -> 0x014d }
            p984j7.C87901b.m109401b(r0, r8, r9)     // Catch:{ IOException -> 0x014d }
            r3 = 200(0xc8, float:2.8E-43)
            if (r7 < r3) goto L_0x0132
            r8 = 299(0x12b, float:4.19E-43)
            if (r7 <= r8) goto L_0x0034
            goto L_0x0132
        L_0x0034:
            java.net.HttpURLConnection r8 = r1.f234209i
            r8.getContentType()
            if (r7 != r3) goto L_0x0042
            long r7 = r2.f234184d
            int r3 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x0042
            goto L_0x0043
        L_0x0042:
            r7 = r4
        L_0x0043:
            r1.f234212l = r7
            int r3 = r2.f234187g
            r3 = r3 & r6
            if (r3 != r6) goto L_0x004c
            r3 = 1
            goto L_0x004d
        L_0x004c:
            r3 = 0
        L_0x004d:
            if (r3 != 0) goto L_0x0110
            long r7 = r2.f234185e
            r9 = -1
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 == 0) goto L_0x005b
            r1.f234213m = r7
            goto L_0x0114
        L_0x005b:
            java.net.HttpURLConnection r3 = r1.f234209i
            java.lang.String r7 = "Content-Length"
            java.lang.String r7 = r3.getHeaderField(r7)
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            java.lang.String r12 = "]"
            if (r8 != 0) goto L_0x0089
            long r9 = java.lang.Long.parseLong(r7)     // Catch:{ NumberFormatException -> 0x0070 }
            goto L_0x0089
        L_0x0070:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r13 = "Unexpected Content-Length ["
            r8.append(r13)
            r8.append(r7)
            r8.append(r12)
            java.lang.String r8 = r8.toString()
            java.lang.Object[] r13 = new java.lang.Object[r11]
            p984j7.C87901b.m109400a(r0, r8, r13)
        L_0x0089:
            java.lang.String r8 = "Content-Range"
            java.lang.String r3 = r3.getHeaderField(r8)
            boolean r8 = android.text.TextUtils.isEmpty(r3)
            if (r8 != 0) goto L_0x0103
            java.util.regex.Pattern r8 = f234199p
            java.util.regex.Matcher r8 = r8.matcher(r3)
            boolean r13 = r8.find()
            if (r13 == 0) goto L_0x0103
            r13 = 2
            java.lang.String r13 = r8.group(r13)     // Catch:{ NumberFormatException -> 0x00ea }
            long r13 = java.lang.Long.parseLong(r13)     // Catch:{ NumberFormatException -> 0x00ea }
            java.lang.String r8 = r8.group(r6)     // Catch:{ NumberFormatException -> 0x00ea }
            long r15 = java.lang.Long.parseLong(r8)     // Catch:{ NumberFormatException -> 0x00ea }
            long r13 = r13 - r15
            r15 = 1
            long r13 = r13 + r15
            int r8 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r8 >= 0) goto L_0x00bc
            r9 = r13
            goto L_0x0103
        L_0x00bc:
            int r4 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x0103
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x00ea }
            r4.<init>()     // Catch:{ NumberFormatException -> 0x00ea }
            java.lang.String r5 = "Inconsistent headers ["
            r4.append(r5)     // Catch:{ NumberFormatException -> 0x00ea }
            r4.append(r7)     // Catch:{ NumberFormatException -> 0x00ea }
            java.lang.String r5 = "] ["
            r4.append(r5)     // Catch:{ NumberFormatException -> 0x00ea }
            r4.append(r3)     // Catch:{ NumberFormatException -> 0x00ea }
            r4.append(r12)     // Catch:{ NumberFormatException -> 0x00ea }
            java.lang.String r4 = r4.toString()     // Catch:{ NumberFormatException -> 0x00ea }
            java.lang.Object[] r5 = new java.lang.Object[r11]     // Catch:{ NumberFormatException -> 0x00ea }
            j7.a r7 = p984j7.C87901b.f254430a     // Catch:{ NumberFormatException -> 0x00ea }
            if (r7 == 0) goto L_0x00e5
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r4, r5)     // Catch:{ NumberFormatException -> 0x00ea }
        L_0x00e5:
            long r9 = java.lang.Math.max(r9, r13)     // Catch:{ NumberFormatException -> 0x00ea }
            goto L_0x0103
        L_0x00ea:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Unexpected Content-Range ["
            r4.append(r5)
            r4.append(r3)
            r4.append(r12)
            java.lang.String r3 = r4.toString()
            java.lang.Object[] r4 = new java.lang.Object[r11]
            p984j7.C87901b.m109400a(r0, r3, r4)
        L_0x0103:
            r3 = -1
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x010d
            long r3 = r1.f234212l
            long r3 = r9 - r3
        L_0x010d:
            r1.f234213m = r3
            goto L_0x0114
        L_0x0110:
            long r3 = r2.f234185e
            r1.f234213m = r3
        L_0x0114:
            java.net.HttpURLConnection r0 = r1.f234209i     // Catch:{ IOException -> 0x0128 }
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ IOException -> 0x0128 }
            r1.f234210j = r0     // Catch:{ IOException -> 0x0128 }
            r1.f234211k = r6
            c8.x<? super c8.p> r0 = r1.f234207g
            if (r0 == 0) goto L_0x0125
            r0.mo17932c(r1, r2)
        L_0x0125:
            long r2 = r1.f234213m
            return r2
        L_0x0128:
            r0 = move-exception
            r17.mo110139a()
            c8.t$b r3 = new c8.t$b
            r3.<init>((java.io.IOException) r0, (p300c8.C79950j) r2, (int) r6)
            throw r3
        L_0x0132:
            java.net.HttpURLConnection r0 = r1.f234209i
            java.util.Map r0 = r0.getHeaderFields()
            r17.mo110139a()
            c8.t$d r3 = new c8.t$d
            r3.<init>(r7, r0, r2)
            r0 = 416(0x1a0, float:5.83E-43)
            if (r7 != r0) goto L_0x014c
            c8.h r0 = new c8.h
            r0.<init>(r11)
            r3.initCause(r0)
        L_0x014c:
            throw r3
        L_0x014d:
            r0 = move-exception
            r17.mo110139a()
            c8.t$b r4 = new c8.t$b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            android.net.Uri r3 = r2.f234181a
            java.lang.String r3 = r3.toString()
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3, r0, r2, r6)
            throw r4
        L_0x016c:
            r0 = move-exception
            c8.t$b r4 = new c8.t$b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            android.net.Uri r3 = r2.f234181a
            java.lang.String r3 = r3.toString()
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3, r0, r2, r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p300c8.C79953p.mo110126b(c8.j):long");
    }

    /* renamed from: c */
    public int mo110127c(byte[] bArr, int i, int i2) {
        try {
            mo110142g();
            if (i2 == 0) {
                return 0;
            }
            long j = this.f234213m;
            if (j != -1) {
                long j2 = j - this.f234215o;
                if (j2 != 0) {
                    i2 = (int) Math.min((long) i2, j2);
                }
                return -1;
            }
            int read = this.f234210j.read(bArr, i, i2);
            if (read != -1) {
                this.f234215o += (long) read;
                C79967x<? super C79953p> xVar = this.f234207g;
                if (xVar == null) {
                    return read;
                }
                xVar.mo17931a(this, read);
                return read;
            } else if (this.f234213m == -1) {
                return -1;
            } else {
                throw new EOFException();
            }
        } catch (IOException e) {
            throw new C79958t.C79960b(e, this.f234208h, 2);
        }
    }

    public void close() {
        try {
            if (this.f234210j != null) {
                HttpURLConnection httpURLConnection = this.f234209i;
                long j = this.f234213m;
                if (j != -1) {
                    j -= this.f234215o;
                }
                m97172f(httpURLConnection, j);
                this.f234210j.close();
            }
            this.f234210j = null;
            mo110139a();
            if (this.f234211k) {
                this.f234211k = false;
                C79967x<? super C79953p> xVar = this.f234207g;
                if (xVar != null) {
                    xVar.mo17933d(this);
                }
            }
        } catch (IOException e) {
            throw new C79958t.C79960b(e, this.f234208h, 3);
        } catch (Throwable th) {
            this.f234210j = null;
            mo110139a();
            if (this.f234211k) {
                this.f234211k = false;
                C79967x<? super C79953p> xVar2 = this.f234207g;
                if (xVar2 != null) {
                    xVar2.mo17933d(this);
                }
            }
            throw th;
        }
    }

    /* renamed from: d */
    public final HttpURLConnection mo110140d(C79950j jVar) {
        HttpURLConnection e;
        C79950j jVar2 = jVar;
        URL url = new URL(jVar2.f234181a.toString());
        byte[] bArr = jVar2.f234182b;
        long j = jVar2.f234184d;
        long j2 = jVar2.f234185e;
        int i = 0;
        boolean z = (jVar2.f234187g & 1) == 1;
        if (!this.f234201a) {
            return mo110141e(url, bArr, j, j2, z, true);
        }
        while (true) {
            int i2 = i + 1;
            if (i <= 20) {
                e = mo110141e(url, bArr, j, j2, z, false);
                int responseCode = e.getResponseCode();
                if (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || (bArr == null && (responseCode == 307 || responseCode == 308))) {
                    bArr = null;
                    String headerField = e.getHeaderField("Location");
                    e.disconnect();
                    if (headerField != null) {
                        URL url2 = new URL(url, headerField);
                        String protocol = url2.getProtocol();
                        if (C113600ck.f339986i.equals(protocol) || "http".equals(protocol)) {
                            i = i2;
                            url = url2;
                        } else {
                            throw new ProtocolException("Unsupported protocol redirect: " + protocol);
                        }
                    } else {
                        throw new ProtocolException("Null location redirect");
                    }
                }
            } else {
                throw new NoRouteToHostException("Too many redirects: " + i2);
            }
        }
        return e;
    }

    /* renamed from: e */
    public final HttpURLConnection mo110141e(URL url, byte[] bArr, long j, long j2, boolean z, boolean z2) {
        Map<String, String> map;
        Map<String, String> map2;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f234202b);
        httpURLConnection.setReadTimeout(this.f234203c);
        C79958t.C79963e eVar = this.f234205e;
        if (eVar != null) {
            synchronized (eVar) {
                if (eVar.f234230b == null) {
                    eVar.f234230b = Collections.unmodifiableMap(new HashMap(eVar.f234229a));
                }
                map2 = eVar.f234230b;
            }
            for (Map.Entry next : map2.entrySet()) {
                httpURLConnection.setRequestProperty((String) next.getKey(), (String) next.getValue());
            }
        }
        C79958t.C79963e eVar2 = this.f234206f;
        synchronized (eVar2) {
            if (eVar2.f234230b == null) {
                eVar2.f234230b = Collections.unmodifiableMap(new HashMap(eVar2.f234229a));
            }
            map = eVar2.f234230b;
        }
        for (Map.Entry next2 : map.entrySet()) {
            httpURLConnection.setRequestProperty((String) next2.getKey(), (String) next2.getValue());
        }
        if (!(j == 0 && j2 == -1)) {
            String str = "bytes=" + j + "-";
            if (j2 != -1) {
                str = str + ((j + j2) - 1);
            }
            httpURLConnection.setRequestProperty("Range", str);
        }
        httpURLConnection.setRequestProperty("User-Agent", this.f234204d);
        if (!z) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        }
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        if (bArr != null) {
            httpURLConnection.setRequestMethod("POST");
            if (bArr.length == 0) {
                httpURLConnection.connect();
            } else {
                httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                httpURLConnection.connect();
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(bArr);
                outputStream.close();
            }
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    /* renamed from: g */
    public final void mo110142g() {
        if (this.f234214n != this.f234212l) {
            byte[] andSet = f234200q.getAndSet((Object) null);
            if (andSet == null) {
                andSet = new byte[4096];
            }
            while (true) {
                long j = this.f234214n;
                long j2 = this.f234212l;
                if (j != j2) {
                    int read = this.f234210j.read(andSet, 0, (int) Math.min(j2 - j, (long) andSet.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.f234214n += (long) read;
                        C79967x<? super C79953p> xVar = this.f234207g;
                        if (xVar != null) {
                            xVar.mo17931a(this, read);
                        }
                    } else {
                        throw new EOFException();
                    }
                } else {
                    f234200q.set(andSet);
                    return;
                }
            }
        }
    }

    public Uri getUri() {
        HttpURLConnection httpURLConnection = this.f234209i;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }
}
