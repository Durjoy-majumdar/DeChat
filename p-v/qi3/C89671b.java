package qi3;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.PowerManager;
import android.os.WorkSource;
import j20.C117292a;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import p385u2.C111105a;
import ri3.C89965a;

/* renamed from: qi3.b */
public class C89671b {

    /* renamed from: a */
    public Context f257903a;

    /* renamed from: b */
    public final C89670a f257904b;

    /* renamed from: qi3.b$a */
    public static class C89672a {

        /* renamed from: a */
        public PowerManager.WakeLock f257905a;

        /* renamed from: b */
        public WifiManager.WifiLock f257906b;

        /* renamed from: a */
        public void mo124003a() {
            try {
                PowerManager.WakeLock wakeLock = this.f257905a;
                if (wakeLock != null && wakeLock.isHeld()) {
                    PowerManager.WakeLock wakeLock2 = this.f257905a;
                    C117292a.m165357c(wakeLock2, "com/tencent/mm/toolkit/downloader/DownloadPerformerImpl$Locker", "release", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                    wakeLock2.release();
                    C117292a.m165359e(wakeLock2, "com/tencent/mm/toolkit/downloader/DownloadPerformerImpl$Locker", "release", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                }
                WifiManager.WifiLock wifiLock = this.f257906b;
                if (wifiLock != null && wifiLock.isHeld()) {
                    this.f257906b.release();
                }
            } catch (Throwable unused) {
            }
        }
    }

    public C89671b(C89670a aVar) {
        this.f257904b = aVar;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:62:0x012f */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0152 A[Catch:{ all -> 0x012d }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0155 A[Catch:{ all -> 0x012d }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x015d A[SYNTHETIC, Splitter:B:73:0x015d] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x016a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo123998a(qi3.C89673c r10) {
        /*
            r9 = this;
            android.net.Uri r0 = r10.f257908e
            java.lang.String r0 = r0.getScheme()
            r1 = 1105(0x451, float:1.548E-42)
            if (r0 == 0) goto L_0x0176
            java.lang.String r2 = "http"
            boolean r2 = r0.equalsIgnoreCase(r2)
            if (r2 != 0) goto L_0x001a
            java.lang.String r2 = "https"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0176
        L_0x001a:
            java.net.URL r0 = new java.net.URL     // Catch:{ MalformedURLException -> 0x016e }
            android.net.Uri r2 = r10.f257908e     // Catch:{ MalformedURLException -> 0x016e }
            java.lang.String r2 = r2.toString()     // Catch:{ MalformedURLException -> 0x016e }
            r0.<init>(r2)     // Catch:{ MalformedURLException -> 0x016e }
            r1 = 0
            r2 = 2030(0x7ee, float:2.845E-42)
            r3 = 0
            r4 = 1
            java.net.URLConnection r0 = r0.openConnection()     // Catch:{ SocketTimeoutException -> 0x0139, IOException -> 0x012f }
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ SocketTimeoutException -> 0x0139, IOException -> 0x012f }
            java.lang.String r1 = "GET"
            r0.setRequestMethod(r1)     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            r0.setInstanceFollowRedirects(r3)     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            ri3.c r1 = r10.mo124004a()     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            ri3.c$a r1 = (ri3.C89967c.C89968a) r1     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            int r1 = r1.f258531a     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            r0.setConnectTimeout(r1)     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            ri3.c r1 = r10.mo124004a()     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            ri3.c$a r1 = (ri3.C89967c.C89968a) r1     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            int r1 = r1.f258531a     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            r0.setReadTimeout(r1)     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r10.f257915o     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            if (r1 == 0) goto L_0x0070
            java.util.Set r5 = r1.keySet()     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
        L_0x005a:
            boolean r6 = r5.hasNext()     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            if (r6 == 0) goto L_0x0070
            java.lang.Object r6 = r5.next()     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            java.lang.Object r7 = r1.get(r6)     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            r0.addRequestProperty(r6, r7)     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            goto L_0x005a
        L_0x0070:
            java.io.File r1 = r10.f257909f     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            boolean r1 = r1.exists()     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            if (r1 == 0) goto L_0x0087
            r5 = 0
            r10.f257913j = r5     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            java.io.File r1 = r10.f257909f     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            if (r1 == 0) goto L_0x0087
            r1.delete()     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            goto L_0x0087
        L_0x0084:
            r10 = move-exception
            goto L_0x0168
        L_0x0087:
            r1 = 2011(0x7db, float:2.818E-42)
            r10.f257907d = r1     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            int r1 = r0.getResponseCode()     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            r5 = 200(0xc8, float:2.8E-43)
            if (r1 == r5) goto L_0x0112
            r5 = 206(0xce, float:2.89E-43)
            if (r1 == r5) goto L_0x0112
            r5 = 307(0x133, float:4.3E-43)
            if (r1 == r5) goto L_0x00dd
            r5 = 404(0x194, float:5.66E-43)
            if (r1 == r5) goto L_0x00d3
            r5 = 416(0x1a0, float:5.83E-43)
            if (r1 == r5) goto L_0x00d3
            r5 = 500(0x1f4, float:7.0E-43)
            if (r1 == r5) goto L_0x00d3
            r5 = 503(0x1f7, float:7.05E-43)
            if (r1 == r5) goto L_0x00d3
            switch(r1) {
                case 301: goto L_0x00dd;
                case 302: goto L_0x00dd;
                case 303: goto L_0x00dd;
                default: goto L_0x00ae;
            }     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
        L_0x00ae:
            ri3.a r5 = new ri3.a     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            r6 = 1101(0x44d, float:1.543E-42)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            r7.<init>()     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            java.lang.String r8 = "Unhandled HTTP response:"
            r7.append(r8)     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            r7.append(r1)     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            java.lang.String r1 = " message:"
            r7.append(r1)     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            java.lang.String r1 = r0.getResponseMessage()     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            r7.append(r1)     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            java.lang.String r1 = r7.toString()     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            r5.<init>(r6, r1)     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            throw r5     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
        L_0x00d3:
            ri3.a r5 = new ri3.a     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            java.lang.String r6 = r0.getResponseMessage()     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            r5.<init>(r1, r6)     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            throw r5     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
        L_0x00dd:
            int r1 = r10.f257912i     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            r5 = 5
            if (r1 >= r5) goto L_0x00f6
            java.lang.String r1 = "Location"
            java.lang.String r1 = r0.getHeaderField(r1)     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            r10.f257908e = r1     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            int r1 = r10.f257912i     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            int r1 = r1 + r4
            r10.f257912i = r1     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            r10.f257907d = r2     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            goto L_0x011b
        L_0x00f6:
            ri3.a r1 = new ri3.a     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            r5 = 1103(0x44f, float:1.546E-42)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            r6.<init>()     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            java.lang.String r7 = "too many redirects, redirect count = "
            r6.append(r7)     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            int r7 = r10.f257912i     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            r6.append(r7)     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            java.lang.String r6 = r6.toString()     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            r1.<init>(r5, r6)     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            throw r1     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
        L_0x0112:
            boolean r1 = r9.mo124000c(r10, r0)     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            if (r1 == 0) goto L_0x011f
            r9.mo124002e(r10, r0)     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
        L_0x011b:
            r0.disconnect()
            goto L_0x015c
        L_0x011f:
            ri3.a r1 = new ri3.a     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            r5 = 1104(0x450, float:1.547E-42)
            java.lang.String r6 = "Transfer-Encoding not found as well as can't know size of download, giving up"
            r1.<init>(r5, r6)     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
            throw r1     // Catch:{ SocketTimeoutException -> 0x012b, IOException -> 0x0129, all -> 0x0084 }
        L_0x0129:
            r1 = r0
            goto L_0x012f
        L_0x012b:
            r1 = r0
            goto L_0x0139
        L_0x012d:
            r10 = move-exception
            goto L_0x0167
        L_0x012f:
            ri3.a r10 = new ri3.a     // Catch:{ all -> 0x012d }
            r0 = 1102(0x44e, float:1.544E-42)
            java.lang.String r2 = "Trouble with low-level socket errors"
            r10.<init>(r0, r2)     // Catch:{ all -> 0x012d }
            throw r10     // Catch:{ all -> 0x012d }
        L_0x0139:
            ri3.c r0 = r10.mo124004a()     // Catch:{ all -> 0x012d }
            ri3.c$a r0 = (ri3.C89967c.C89968a) r0     // Catch:{ all -> 0x012d }
            int r5 = r0.f258532b     // Catch:{ all -> 0x012d }
            int r5 = r5 + r4
            r0.f258532b = r5     // Catch:{ all -> 0x012d }
            int r6 = r0.f258531a     // Catch:{ all -> 0x012d }
            float r6 = (float) r6     // Catch:{ all -> 0x012d }
            r7 = 1065353216(0x3f800000, float:1.0)
            float r7 = r7 * r6
            float r6 = r6 + r7
            int r6 = (int) r6     // Catch:{ all -> 0x012d }
            r0.f258531a = r6     // Catch:{ all -> 0x012d }
            r0 = 3
            if (r5 >= r0) goto L_0x0153
            r3 = 1
        L_0x0153:
            if (r3 == 0) goto L_0x015d
            r10.f257907d = r2     // Catch:{ all -> 0x012d }
            if (r1 == 0) goto L_0x015c
            r1.disconnect()
        L_0x015c:
            return
        L_0x015d:
            ri3.a r10 = new ri3.a     // Catch:{ all -> 0x012d }
            r0 = 1106(0x452, float:1.55E-42)
            java.lang.String r2 = "Connection time out after maximum retires attempted"
            r10.<init>(r0, r2)     // Catch:{ all -> 0x012d }
            throw r10     // Catch:{ all -> 0x012d }
        L_0x0167:
            r0 = r1
        L_0x0168:
            if (r0 == 0) goto L_0x016d
            r0.disconnect()
        L_0x016d:
            throw r10
        L_0x016e:
            ri3.a r10 = new ri3.a
            java.lang.String r0 = "URI is malformed."
            r10.<init>(r1, r0)
            throw r10
        L_0x0176:
            ri3.a r0 = new ri3.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Can only download HTTP/HTTPS, uri = "
            r2.append(r3)
            android.net.Uri r10 = r10.f257908e
            r2.append(r10)
            java.lang.String r10 = r2.toString()
            r0.<init>(r1, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qi3.C89671b.mo123998a(qi3.c):void");
    }

    /* renamed from: b */
    public void mo123999b(C89673c cVar) {
        Context context = this.f257903a;
        C89672a aVar = new C89672a();
        if (context != null && C111105a.m151499a(context, "android.permission.WAKE_LOCK") == 0) {
            PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "downloader");
            aVar.f257905a = newWakeLock;
            if (!newWakeLock.isHeld()) {
                aVar.f257905a.setWorkSource(new WorkSource());
                PowerManager.WakeLock wakeLock = aVar.f257905a;
                PowerManager.WakeLock wakeLock2 = wakeLock;
                C117292a.m165357c(wakeLock2, "com/tencent/mm/toolkit/downloader/DownloadPerformerImpl$Locker", "lock", "(Landroid/content/Context;)Lcom/tencent/mm/toolkit/downloader/DownloadPerformerImpl$Locker;", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
                wakeLock.acquire();
                C117292a.m165359e(wakeLock2, "com/tencent/mm/toolkit/downloader/DownloadPerformerImpl$Locker", "lock", "(Landroid/content/Context;)Lcom/tencent/mm/toolkit/downloader/DownloadPerformerImpl$Locker;", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
            }
            WifiManager.WifiLock createWifiLock = ((WifiManager) context.getSystemService("wifi")).createWifiLock("WIFI LOCK : downloader");
            aVar.f257906b = createWifiLock;
            if (!createWifiLock.isHeld()) {
                aVar.f257906b.acquire();
            }
        }
        do {
            try {
                cVar.f257907d = 2010;
                mo123998a(cVar);
            } catch (C89965a e) {
                int i = e.f258530d;
                String localizedMessage = e.getLocalizedMessage();
                cVar.f257907d = 2040;
                File file = cVar.f257910g;
                if (file != null) {
                    file.delete();
                }
                File file2 = cVar.f257909f;
                if (file2 != null) {
                    file2.delete();
                }
                this.f257904b.mo123997b(cVar, i, localizedMessage);
            } catch (Throwable th) {
                aVar.mo124003a();
                throw th;
            }
        } while (cVar.f257907d == 2060);
        aVar.mo124003a();
    }

    /* renamed from: c */
    public final boolean mo124000c(C89673c cVar, HttpURLConnection httpURLConnection) {
        long j;
        if (cVar.f257914n != -1) {
            return true;
        }
        String headerField = httpURLConnection.getHeaderField("Transfer-Encoding");
        if (headerField != null && headerField.equalsIgnoreCase("chunked")) {
            return true;
        }
        try {
            j = Long.parseLong(httpURLConnection.getHeaderField("Content-Length"));
            try {
                cVar.f257914n = cVar.f257913j + j;
            } catch (NumberFormatException unused) {
            }
        } catch (NumberFormatException unused2) {
            j = -1;
        }
        return j != -1;
    }

    /* renamed from: d */
    public final void mo124001d(C89673c cVar, InputStream inputStream, OutputStream outputStream, FileDescriptor fileDescriptor) {
        int i;
        C89673c cVar2 = cVar;
        cVar2.f257907d = 2012;
        byte[] bArr = new byte[4096];
        long j = cVar2.f257914n;
        long j2 = 1000;
        long j3 = 0;
        long j4 = 0;
        while (!cVar2.f257911h) {
            try {
                i = inputStream.read(bArr);
            } catch (IOException e) {
                i = "unexpected end of stream".equals(e.getMessage()) ? -1 : Integer.MIN_VALUE;
            }
            long j5 = cVar2.f257913j;
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - j4 > j2) {
                if (j != -1 && j > j3) {
                    long j6 = (100 * j5) / j;
                    this.f257904b.getClass();
                }
                j4 = currentTimeMillis;
            }
            if (i == -1) {
                cVar2.f257907d = 2020;
                try {
                    if (cVar2.f257909f.renameTo(cVar2.f257910g)) {
                        cVar.mo124005b();
                        this.f257904b.mo123996a(cVar2);
                        return;
                    }
                    throw new C89965a(1001, "Cannot rename intermediate file to dest file!");
                } catch (C89965a e2) {
                    throw new C89965a(e2.f258530d, e2.getLocalizedMessage());
                }
            } else if (i != Integer.MIN_VALUE) {
                boolean z = false;
                if (fileDescriptor.valid()) {
                    try {
                        outputStream.write(bArr, 0, i);
                        outputStream.flush();
                        fileDescriptor.sync();
                        z = true;
                    } catch (IOException unused) {
                    }
                } else {
                    OutputStream outputStream2 = outputStream;
                }
                if (z) {
                    cVar2.f257913j = j5 + ((long) i);
                    j2 = 1000;
                    j3 = 0;
                } else {
                    throw new C89965a(1001, "Failed writing file");
                }
            } else {
                throw new C89965a(1102, "Failed reading http response");
            }
        }
        throw new C89965a(1201, "Download cancelled");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: java.io.BufferedOutputStream} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0053 A[SYNTHETIC, Splitter:B:34:0x0053] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x005d A[Catch:{ all -> 0x0065 }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo124002e(qi3.C89673c r6, java.net.HttpURLConnection r7) {
        /*
            r5 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = r6.f257909f
            java.lang.String r1 = r1.getPath()
            r0.<init>(r1)
            java.io.File r1 = r0.getParentFile()     // Catch:{ IOException -> 0x0021 }
            boolean r1 = r1.exists()     // Catch:{ IOException -> 0x0021 }
            if (r1 != 0) goto L_0x001c
            java.io.File r1 = r0.getParentFile()     // Catch:{ IOException -> 0x0021 }
            r1.mkdirs()     // Catch:{ IOException -> 0x0021 }
        L_0x001c:
            boolean r1 = r0.createNewFile()     // Catch:{ IOException -> 0x0021 }
            goto L_0x0022
        L_0x0021:
            r1 = 0
        L_0x0022:
            r2 = 1001(0x3e9, float:1.403E-42)
            if (r1 == 0) goto L_0x006d
            r1 = 0
            java.io.InputStream r7 = r7.getInputStream()     // Catch:{ IOException -> 0x0050, all -> 0x004d }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x004a, all -> 0x0046 }
            r4 = 1
            r3.<init>(r0, r4)     // Catch:{ IOException -> 0x004a, all -> 0x0046 }
            java.io.FileDescriptor r0 = r3.getFD()     // Catch:{ IOException -> 0x004b, all -> 0x0044 }
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x004b, all -> 0x0044 }
            r1.<init>(r3)     // Catch:{ IOException -> 0x004b, all -> 0x0044 }
            r5.mo124001d(r6, r7, r1, r0)     // Catch:{ IOException -> 0x004a, all -> 0x0046 }
            qi3.C89675e.m112124a(r7)
            qi3.C89675e.m112124a(r1)
            return
        L_0x0044:
            r6 = move-exception
            goto L_0x0048
        L_0x0046:
            r6 = move-exception
            r3 = r1
        L_0x0048:
            r1 = r7
            goto L_0x0066
        L_0x004a:
            r3 = r1
        L_0x004b:
            r1 = r7
            goto L_0x0051
        L_0x004d:
            r6 = move-exception
            r3 = r1
            goto L_0x0066
        L_0x0050:
            r3 = r1
        L_0x0051:
            if (r1 != 0) goto L_0x005d
            ri3.a r6 = new ri3.a     // Catch:{ all -> 0x0065 }
            r7 = 1102(0x44e, float:1.544E-42)
            java.lang.String r0 = "Error in creating input stream"
            r6.<init>(r7, r0)     // Catch:{ all -> 0x0065 }
            throw r6     // Catch:{ all -> 0x0065 }
        L_0x005d:
            ri3.a r6 = new ri3.a     // Catch:{ all -> 0x0065 }
            java.lang.String r7 = "Error in writing download contents to the destination file"
            r6.<init>(r2, r7)     // Catch:{ all -> 0x0065 }
            throw r6     // Catch:{ all -> 0x0065 }
        L_0x0065:
            r6 = move-exception
        L_0x0066:
            qi3.C89675e.m112124a(r1)
            qi3.C89675e.m112124a(r3)
            throw r6
        L_0x006d:
            ri3.a r6 = new ri3.a
            java.lang.String r7 = "Error in creating prepare file"
            r6.<init>(r2, r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: qi3.C89671b.mo124002e(qi3.c, java.net.HttpURLConnection):void");
    }
}
