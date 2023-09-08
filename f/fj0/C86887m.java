package fj0;

import fj0.C86883l;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: fj0.m */
public class C86887m {

    /* renamed from: a */
    public boolean f252191a = false;

    /* renamed from: b */
    public String f252192b;

    /* renamed from: c */
    public int f252193c = -1;

    /* renamed from: d */
    public ServerSocket f252194d;

    /* renamed from: e */
    public C86883l.C86885b f252195e;

    /* renamed from: fj0.m$b */
    public class C86889b implements Callable<Void> {

        /* renamed from: d */
        public Socket f252196d;

        public C86889b(Socket socket) {
            this.f252196d = socket;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x005d, code lost:
            r6 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bb, code lost:
            if (r4.equals("/upnp/cb/AVTransport") != false) goto L_0x00bf;
         */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00c5  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x00e7 A[Catch:{ IOException -> 0x011b, all -> 0x0112 }] */
        /* JADX WARNING: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object call() {
            /*
                r9 = this;
                java.net.Socket r0 = r9.f252196d     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                java.io.InputStream r0 = r0.getInputStream()     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                fj0.u r1 = new fj0.u     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                r1.<init>()     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                hj0.d r2 = new hj0.d     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                r3 = 0
                r2.<init>(r3)     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                r5.<init>(r0)     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                r4.<init>(r5)     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                r5.<init>()     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
            L_0x0020:
                java.lang.String r6 = r4.readLine()     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                java.lang.String r7 = ""
                if (r6 == 0) goto L_0x005c
                int r8 = r6.length()     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                if (r8 != 0) goto L_0x0053
                java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                int r6 = r5.length()     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                if (r6 <= 0) goto L_0x005d
                hj0.b r6 = r1.mo121359d(r5)     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                r2.f253593a = r6     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                java.lang.String r8 = "CONTENT-LENGTH"
                java.lang.String r6 = r6.mo122001a(r8)     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                boolean r8 = android.text.TextUtils.isEmpty(r6)     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                if (r8 != 0) goto L_0x005d
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                int r6 = r6.intValue()     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                goto L_0x005e
            L_0x0053:
                r5.append(r6)     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                java.lang.String r6 = "\r\n"
                r5.append(r6)     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                goto L_0x0020
            L_0x005c:
                r5 = r7
            L_0x005d:
                r6 = 0
            L_0x005e:
                if (r6 <= 0) goto L_0x006b
                char[] r6 = new char[r6]     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                int r4 = r4.read(r6)     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                java.lang.String r7 = new java.lang.String     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                r7.<init>(r6, r3, r4)     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
            L_0x006b:
                int r4 = r5.length()     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                if (r4 <= 0) goto L_0x0077
                hj0.b r4 = r1.mo121359d(r5)     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                r2.f253593a = r4     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
            L_0x0077:
                int r4 = r7.length()     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                if (r4 <= 0) goto L_0x0083
                java.util.HashMap r1 = r1.mo121357b(r7)     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                r2.f253594b = r1     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
            L_0x0083:
                java.io.BufferedWriter r1 = new java.io.BufferedWriter     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                java.io.OutputStreamWriter r4 = new java.io.OutputStreamWriter     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                java.net.Socket r5 = r9.f252196d     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                java.io.OutputStream r5 = r5.getOutputStream()     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                r4.<init>(r5)     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                r1.<init>(r4)     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                hj0.b r4 = r2.f253593a     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                java.lang.String r5 = "PATH"
                java.lang.String r4 = r4.mo122001a(r5)     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                int r5 = r4.hashCode()     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                r6 = 50084583(0x2fc3ae7, float:3.706188E-37)
                r7 = 1
                if (r5 == r6) goto L_0x00b5
                r3 = 1171555962(0x45d4867a, float:6800.8096)
                if (r5 == r3) goto L_0x00ab
                goto L_0x00be
            L_0x00ab:
                java.lang.String r3 = "/upnp/cb/RenderControl"
                boolean r3 = r4.equals(r3)     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                if (r3 == 0) goto L_0x00be
                r3 = 1
                goto L_0x00bf
            L_0x00b5:
                java.lang.String r5 = "/upnp/cb/AVTransport"
                boolean r4 = r4.equals(r5)     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                if (r4 == 0) goto L_0x00be
                goto L_0x00bf
            L_0x00be:
                r3 = -1
            L_0x00bf:
                java.lang.String r4 = "HTTP/1.1 500 Internal Server Error\r\nContent-Length: 0\r\n\r\n"
                java.lang.String r5 = "HTTP/1.1 200 OK\r\nContent-Length: 0\r\n\r\n"
                if (r3 == 0) goto L_0x00e7
                if (r3 == r7) goto L_0x00cd
                java.lang.String r2 = "HTTP/1.1 404 Not Found\r\nContent-Length: 0\r\n\r\n"
                r1.write(r2)     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                goto L_0x00ff
            L_0x00cd:
                java.lang.String r3 = "rdcEvent"
                r2.f253591c = r3     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                fj0.m r3 = fj0.C86887m.this     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                fj0.l$b r3 = r3.f252195e     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                if (r3 == 0) goto L_0x00e3
                boolean r2 = r3.mo121339a(r2)     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                if (r2 == 0) goto L_0x00df
                goto L_0x00e3
            L_0x00df:
                r1.write(r4)     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                goto L_0x00ff
            L_0x00e3:
                r1.write(r5)     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                goto L_0x00ff
            L_0x00e7:
                java.lang.String r3 = "avtEvent"
                r2.f253591c = r3     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                fj0.m r3 = fj0.C86887m.this     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                fj0.l$b r3 = r3.f252195e     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                if (r3 == 0) goto L_0x00fc
                boolean r2 = r3.mo121339a(r2)     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                if (r2 == 0) goto L_0x00f8
                goto L_0x00fc
            L_0x00f8:
                r1.write(r4)     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                goto L_0x00ff
            L_0x00fc:
                r1.write(r5)     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
            L_0x00ff:
                r1.flush()     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                r1.close()     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                r0.close()     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                java.net.Socket r0 = r9.f252196d     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                r0.close()     // Catch:{ IOException -> 0x011b, all -> 0x0112 }
                java.net.Socket r0 = r9.f252196d
                if (r0 == 0) goto L_0x0123
                goto L_0x0120
            L_0x0112:
                r0 = move-exception
                java.net.Socket r1 = r9.f252196d
                if (r1 == 0) goto L_0x011a
                r1.close()     // Catch:{ IOException -> 0x011a }
            L_0x011a:
                throw r0
            L_0x011b:
                java.net.Socket r0 = r9.f252196d
                if (r0 == 0) goto L_0x0123
            L_0x0120:
                r0.close()     // Catch:{ IOException -> 0x0123 }
            L_0x0123:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: fj0.C86887m.C86889b.call():java.lang.Object");
        }
    }

    /* renamed from: fj0.m$c */
    public class C86890c implements Runnable {
        public C86890c() {
        }

        public void run() {
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(4);
            while (true) {
                C86887m mVar = C86887m.this;
                if (mVar.f252191a) {
                    try {
                        newScheduledThreadPool.submit(new C86889b(mVar.f252194d.accept()));
                    } catch (IOException unused) {
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: fj0.m$d */
    public static class C86891d {

        /* renamed from: a */
        public static C86887m f252199a = new C86887m((C86888a) null);
    }

    public C86887m(C86888a aVar) {
    }
}
