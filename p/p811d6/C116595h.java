package p811d6;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import p1080f6.C97828b;
import p1193g6.C116922b;

/* renamed from: d6.h */
public class C116595h implements C116601n {

    /* renamed from: a */
    public final C116922b f349640a;

    /* renamed from: b */
    public final C97828b f349641b;

    /* renamed from: c */
    public C116602o f349642c;

    /* renamed from: d */
    public HttpURLConnection f349643d;

    /* renamed from: e */
    public InputStream f349644e;

    public C116595h(String str, C116922b bVar, C97828b bVar2) {
        bVar.getClass();
        this.f349640a = bVar;
        bVar2.getClass();
        this.f349641b = bVar2;
        C116602o oVar = bVar.get(str);
        if (oVar == null) {
            MimeTypeMap singleton = MimeTypeMap.getSingleton();
            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
            oVar = new C116602o(str, -2147483648L, TextUtils.isEmpty(fileExtensionFromUrl) ? null : singleton.getMimeTypeFromExtension(fileExtensionFromUrl));
        }
        this.f349642c = oVar;
    }

    /* renamed from: a */
    public void mo180577a(long j) {
        try {
            HttpURLConnection c = mo180579c(j, -1);
            this.f349643d = c;
            String contentType = c.getContentType();
            this.f349644e = new BufferedInputStream(this.f349643d.getInputStream(), 8192);
            HttpURLConnection httpURLConnection = this.f349643d;
            int responseCode = httpURLConnection.getResponseCode();
            String headerField = httpURLConnection.getHeaderField("Content-Length");
            long parseLong = headerField == null ? -1 : Long.parseLong(headerField);
            if (responseCode != 200) {
                parseLong = responseCode == 206 ? parseLong + j : this.f349642c.f349659b;
            }
            String str = this.f349642c.f349658a;
            C116602o oVar = new C116602o(str, parseLong, contentType);
            this.f349642c = oVar;
            this.f349640a.mo180895a(str, oVar);
        } catch (IOException e) {
            throw new C86197l("Error opening connection for " + this.f349642c.f349658a + " with offset " + j, e);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.net.HttpURLConnection} */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r0v4, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        r7 = r3;
        r3 = r0;
        r0 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r1 = r8.f349642c.f349658a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
        if (r3 != null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0051, code lost:
        if (r0 == 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0057, code lost:
        r7 = r3;
        r3 = r0;
        r0 = r1;
        r1 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0048 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005d A[SYNTHETIC, Splitter:B:30:0x005d] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo180578b() {
        /*
            r8 = this;
            d6.o r0 = r8.f349642c
            java.lang.String r0 = r0.f349658a
            r0 = 0
            r2 = 10000(0x2710, float:1.4013E-41)
            r3 = 0
            java.net.HttpURLConnection r0 = r8.mo180579c(r0, r2)     // Catch:{ IOException -> 0x0047, all -> 0x0044 }
            java.lang.String r1 = "Content-Length"
            java.lang.String r1 = r0.getHeaderField(r1)     // Catch:{ IOException -> 0x0048 }
            if (r1 != 0) goto L_0x0018
            r1 = -1
            goto L_0x001c
        L_0x0018:
            long r1 = java.lang.Long.parseLong(r1)     // Catch:{ IOException -> 0x0048 }
        L_0x001c:
            java.lang.String r4 = r0.getContentType()     // Catch:{ IOException -> 0x0048 }
            java.io.InputStream r3 = r0.getInputStream()     // Catch:{ IOException -> 0x0048 }
            d6.o r5 = new d6.o     // Catch:{ IOException -> 0x0048 }
            d6.o r6 = r8.f349642c     // Catch:{ IOException -> 0x0048 }
            java.lang.String r6 = r6.f349658a     // Catch:{ IOException -> 0x0048 }
            r5.<init>(r6, r1, r4)     // Catch:{ IOException -> 0x0048 }
            r8.f349642c = r5     // Catch:{ IOException -> 0x0048 }
            g6.b r1 = r8.f349640a     // Catch:{ IOException -> 0x0048 }
            r1.mo180895a(r6, r5)     // Catch:{ IOException -> 0x0048 }
            d6.o r1 = r8.f349642c     // Catch:{ IOException -> 0x0048 }
            java.util.Objects.toString(r1)     // Catch:{ IOException -> 0x0048 }
            if (r3 == 0) goto L_0x0053
            r3.close()     // Catch:{ IOException -> 0x0053 }
            goto L_0x0053
        L_0x003f:
            r1 = move-exception
            r7 = r3
            r3 = r0
            r0 = r7
            goto L_0x0057
        L_0x0044:
            r0 = move-exception
            r1 = r3
            goto L_0x005b
        L_0x0047:
            r0 = r3
        L_0x0048:
            d6.o r1 = r8.f349642c     // Catch:{ all -> 0x003f }
            java.lang.String r1 = r1.f349658a     // Catch:{ all -> 0x003f }
            if (r3 == 0) goto L_0x0051
            r3.close()     // Catch:{ IOException -> 0x0051 }
        L_0x0051:
            if (r0 == 0) goto L_0x0056
        L_0x0053:
            r0.disconnect()
        L_0x0056:
            return
        L_0x0057:
            r7 = r3
            r3 = r0
            r0 = r1
            r1 = r7
        L_0x005b:
            if (r3 == 0) goto L_0x0060
            r3.close()     // Catch:{ IOException -> 0x0060 }
        L_0x0060:
            if (r1 == 0) goto L_0x0065
            r1.disconnect()
        L_0x0065:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p811d6.C116595h.mo180578b():void");
    }

    /* renamed from: c */
    public final HttpURLConnection mo180579c(long j, int i) {
        HttpURLConnection httpURLConnection;
        boolean z;
        String str = this.f349642c.f349658a;
        int i2 = 0;
        do {
            int i3 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            for (Map.Entry next : this.f349641b.mo137164a(str).entrySet()) {
                httpURLConnection.setRequestProperty((String) next.getKey(), (String) next.getValue());
            }
            if (i3 > 0) {
                httpURLConnection.setRequestProperty("Range", "bytes=" + j + "-");
            }
            if (i > 0) {
                httpURLConnection.setConnectTimeout(i);
                httpURLConnection.setReadTimeout(i);
            }
            int responseCode = httpURLConnection.getResponseCode();
            z = responseCode == 301 || responseCode == 302 || responseCode == 303;
            if (z) {
                str = httpURLConnection.getHeaderField("Location");
                i2++;
                httpURLConnection.disconnect();
            }
            if (i2 > 5) {
                throw new C86197l("Too many redirects: " + i2);
            }
        } while (z);
        return httpURLConnection;
    }

    public void close() {
        HttpURLConnection httpURLConnection = this.f349643d;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (IllegalArgumentException | NullPointerException e) {
                throw new RuntimeException("Wait... but why? WTF!? Really shouldn't happen any more after fixing https://github.com/danikula/AndroidVideoCache/issues/43. If you read it on your device log, please, notify me danikula@gmail.com or create issue here https://github.com/danikula/AndroidVideoCache/issues.", e);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
    }

    public synchronized long length() {
        if (this.f349642c.f349659b == -2147483648L) {
            mo180578b();
        }
        return this.f349642c.f349659b;
    }

    public int read(byte[] bArr) {
        InputStream inputStream = this.f349644e;
        if (inputStream != null) {
            try {
                return inputStream.read(bArr, 0, bArr.length);
            } catch (InterruptedIOException e) {
                throw new C116597j("Reading source " + this.f349642c.f349658a + " is interrupted", e);
            } catch (IOException e2) {
                throw new C86197l("Error reading data from " + this.f349642c.f349658a, e2);
            }
        } else {
            throw new C86197l("Error reading data from " + this.f349642c.f349658a + ": connection is absent!");
        }
    }

    public String toString() {
        return "HttpUrlSource{sourceInfo='" + this.f349642c + "}";
    }

    public C116595h(C116595h hVar) {
        this.f349642c = hVar.f349642c;
        this.f349640a = hVar.f349640a;
        this.f349641b = hVar.f349641b;
    }
}
