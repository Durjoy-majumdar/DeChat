package p811d6;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: d6.f */
public class C116590f {

    /* renamed from: a */
    public final Object f349622a = new Object();

    /* renamed from: b */
    public final ExecutorService f349623b = Executors.newFixedThreadPool(8);

    /* renamed from: c */
    public final Map<String, C116593g> f349624c = new ConcurrentHashMap();

    /* renamed from: d */
    public final ServerSocket f349625d;

    /* renamed from: e */
    public final int f349626e;

    /* renamed from: f */
    public final C97423c f349627f;

    /* renamed from: d6.f$b */
    public final class C116591b implements Runnable {

        /* renamed from: d */
        public final Socket f349628d;

        public C116591b(Socket socket) {
            this.f349628d = socket;
        }

        public void run() {
            C116590f fVar = C116590f.this;
            Socket socket = this.f349628d;
            fVar.getClass();
            try {
                C45267d a = C45267d.m50111a(socket.getInputStream());
                a.toString();
                fVar.mo180568a(C107003m.m144805a(a.f122621a)).mo180575c(a, socket);
            } catch (SocketException unused) {
            } catch (C86197l | IOException e) {
                new C86197l("Error processing request", e);
            } catch (Throwable th) {
                fVar.mo180570c(socket);
                fVar.mo180569b();
                throw th;
            }
            fVar.mo180570c(socket);
            fVar.mo180569b();
        }
    }

    /* renamed from: d6.f$c */
    public final class C116592c implements Runnable {

        /* renamed from: d */
        public final CountDownLatch f349630d;

        public C116592c(CountDownLatch countDownLatch) {
            this.f349630d = countDownLatch;
        }

        public void run() {
            this.f349630d.countDown();
            C116590f fVar = C116590f.this;
            fVar.getClass();
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    Socket accept = fVar.f349625d.accept();
                    Objects.toString(accept);
                    fVar.f349623b.submit(new C116591b(accept));
                } catch (IOException e) {
                    new C86197l("Error during waiting connection", e);
                    return;
                }
            }
        }
    }

    public C116590f(C97423c cVar, C97424a aVar) {
        cVar.getClass();
        this.f349627f = cVar;
        try {
            ServerSocket serverSocket = new ServerSocket(0, 8, InetAddress.getByName("127.0.0.1"));
            this.f349625d = serverSocket;
            int localPort = serverSocket.getLocalPort();
            this.f349626e = localPort;
            List<Proxy> list = C116596i.f349645d;
            ProxySelector.setDefault(new C116596i(ProxySelector.getDefault(), "127.0.0.1", localPort));
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new C116592c(countDownLatch)).start();
            countDownLatch.await();
        } catch (IOException | InterruptedException e) {
            this.f349623b.shutdown();
            throw new IllegalStateException("Error starting local proxy server", e);
        }
    }

    /* renamed from: a */
    public final C116593g mo180568a(String str) {
        C116593g gVar;
        synchronized (this.f349622a) {
            gVar = (C116593g) ((ConcurrentHashMap) this.f349624c).get(str);
            if (gVar == null) {
                gVar = new C116593g(str, this.f349627f);
                ((ConcurrentHashMap) this.f349624c).put(str, gVar);
            }
        }
        return gVar;
    }

    /* renamed from: b */
    public final int mo180569b() {
        int i;
        synchronized (this.f349622a) {
            i = 0;
            for (C116593g gVar : ((ConcurrentHashMap) this.f349624c).values()) {
                i += gVar.f349632a.get();
            }
        }
        return i;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0012 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0021 A[Catch:{ IOException -> 0x0025 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo180570c(java.net.Socket r4) {
        /*
            r3 = this;
            boolean r0 = r4.isInputShutdown()     // Catch:{ SocketException -> 0x0012, IOException -> 0x000a }
            if (r0 != 0) goto L_0x0012
            r4.shutdownInput()     // Catch:{ SocketException -> 0x0012, IOException -> 0x000a }
            goto L_0x0012
        L_0x000a:
            r0 = move-exception
            d6.l r1 = new d6.l
            java.lang.String r2 = "Error closing socket input stream"
            r1.<init>(r2, r0)
        L_0x0012:
            boolean r0 = r4.isOutputShutdown()     // Catch:{ IOException -> 0x001b }
            if (r0 != 0) goto L_0x001b
            r4.shutdownOutput()     // Catch:{ IOException -> 0x001b }
        L_0x001b:
            boolean r0 = r4.isClosed()     // Catch:{ IOException -> 0x0025 }
            if (r0 != 0) goto L_0x002d
            r4.close()     // Catch:{ IOException -> 0x0025 }
            goto L_0x002d
        L_0x0025:
            r4 = move-exception
            d6.l r0 = new d6.l
            java.lang.String r1 = "Error closing socket"
            r0.<init>(r1, r4)
        L_0x002d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p811d6.C116590f.mo180570c(java.net.Socket):void");
    }
}
