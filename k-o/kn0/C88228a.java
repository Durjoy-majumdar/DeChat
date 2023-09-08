package kn0;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.EOFException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.util.concurrent.atomic.AtomicReference;
import p300c8.C79953p;
import p300c8.C79958t;
import p300c8.C79967x;
import p333e8.C86463o;

/* renamed from: kn0.a */
public final class C88228a extends C79953p {

    /* renamed from: u */
    public static final AtomicReference<byte[]> f255034u = new AtomicReference<>();

    /* renamed from: r */
    public final String f255035r = ("MicroMsg.AppBrand.ByteRangeFixHttpDataSource#" + hashCode());

    /* renamed from: s */
    public long f255036s;

    /* renamed from: t */
    public long f255037t;

    public C88228a(String str, C86463o<String> oVar, C79967x<? super C79953p> xVar, int i, int i2, boolean z, C79958t.C79963e eVar) {
        super(str, oVar, xVar, i, i2, z, eVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x008a, code lost:
        r6 = z04.C66731x.m78732f(r6);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo110126b(p300c8.C79950j r14) {
        /*
            r13 = this;
            long r0 = super.mo110126b(r14)
            long r2 = r14.f234184d
            java.lang.String r14 = r13.f255035r
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "calculateBytesToSkip, startReadPos: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r4)
            java.net.HttpURLConnection r14 = r13.f234209i
            if (r14 != 0) goto L_0x0029
            java.lang.String r14 = r13.f255035r
            java.lang.String r2 = "calculateBytesToSkip, connection is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r2)
            goto L_0x0106
        L_0x0029:
            int r4 = r14.getResponseCode()
            java.lang.String r5 = r13.f255035r
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "calculateBytesToSkip, responseCode: "
            r6.append(r7)
            r6.append(r4)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            r5 = 206(0xce, float:2.89E-43)
            if (r5 != r4) goto L_0x0106
            java.lang.String r4 = "Content-Range"
            java.lang.String r14 = r14.getHeaderField(r4)
            if (r14 != 0) goto L_0x0058
            java.lang.String r14 = r13.f255035r
            java.lang.String r2 = "calculateBytesToSkip, contentRange is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r2)
            goto L_0x0106
        L_0x0058:
            java.lang.String r4 = r13.f255035r
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "calculateBytesToSkip, contentRange: "
            r5.append(r6)
            r5.append(r14)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            java.util.regex.Pattern r4 = kn0.C88230c.f255043a
            java.util.regex.Matcher r14 = r4.matcher(r14)
            boolean r4 = r14.matches()
            if (r4 == 0) goto L_0x0106
            int r4 = r14.groupCount()
            r5 = 3
            if (r5 != r4) goto L_0x0106
            r4 = 1
            java.lang.String r6 = r14.group(r4)
            r7 = 0
            if (r6 == 0) goto L_0x0095
            java.lang.Long r6 = z04.C66731x.m78732f(r6)
            if (r6 == 0) goto L_0x0095
            long r9 = r6.longValue()
            goto L_0x0096
        L_0x0095:
            r9 = r7
        L_0x0096:
            r6 = 2
            java.lang.String r6 = r14.group(r6)
            if (r6 == 0) goto L_0x00a8
            java.lang.Long r6 = z04.C66731x.m78732f(r6)
            if (r6 == 0) goto L_0x00a8
            long r11 = r6.longValue()
            goto L_0x00a9
        L_0x00a8:
            r11 = r7
        L_0x00a9:
            java.lang.String r14 = r14.group(r5)
            if (r14 == 0) goto L_0x00b9
            java.lang.Long r14 = z04.C66731x.m78732f(r14)
            if (r14 == 0) goto L_0x00b9
            long r7 = r14.longValue()
        L_0x00b9:
            java.lang.String r14 = r13.f255035r
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "calculateBytesToSkip, startPos: "
            r5.append(r6)
            r5.append(r9)
            java.lang.String r6 = ", endPos: "
            r5.append(r6)
            r5.append(r11)
            java.lang.String r6 = ", totalCount: "
            r5.append(r6)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r5)
            int r14 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r14 > 0) goto L_0x00e8
            int r14 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r14 > 0) goto L_0x00e8
            goto L_0x00e9
        L_0x00e8:
            r4 = 0
        L_0x00e9:
            if (r4 == 0) goto L_0x0106
            long r2 = r2 - r9
            r13.f255036s = r2
            java.lang.String r14 = r13.f255035r
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "calculateBytesToSkip, bytesToSkip: "
            r2.append(r3)
            long r3 = r13.f255036s
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r2)
        L_0x0106:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kn0.C88228a.mo110126b(c8.j):long");
    }

    /* renamed from: c */
    public int mo110127c(byte[] bArr, int i, int i2) {
        Log.m105918d(this.f255035r, "skipInternal, bytesToSkip: " + this.f255036s + ", bytesSkipped: " + this.f255037t);
        HttpURLConnection httpURLConnection = this.f234209i;
        InputStream inputStream = httpURLConnection != null ? httpURLConnection.getInputStream() : null;
        if (inputStream == null) {
            Log.m105928w(this.f255035r, "skipInternal, inputStream is null");
        } else if (this.f255037t != this.f255036s) {
            byte[] andSet = f255034u.getAndSet((Object) null);
            if (andSet == null) {
                andSet = new byte[4096];
            }
            while (true) {
                long j = this.f255037t;
                long j2 = this.f255036s;
                if (j == j2) {
                    f255034u.set(andSet);
                    Log.m105924i(this.f255035r, "skipInternal, skip done");
                    break;
                }
                long j3 = j2 - j;
                long length = (long) andSet.length;
                if (j3 > length) {
                    j3 = length;
                }
                int read = inputStream.read(andSet, 0, (int) j3);
                if (Thread.interrupted()) {
                    throw new InterruptedIOException();
                } else if (-1 != read) {
                    this.f255037t += (long) read;
                } else {
                    throw new EOFException();
                }
            }
        }
        return super.mo110127c(bArr, i, i2);
    }
}
