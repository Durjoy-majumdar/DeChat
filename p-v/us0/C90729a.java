package us0;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiPauseDownloadTask;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.charset.CodingErrorAction;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import lu3.C117478d;
import lu3.C88655f;
import lu3.C88656g;
import ts0.C90577a;
import ts0.C90580b;
import ts0.C90581c;
import vs0.C90866a;
import ws0.C91102b;
import ws0.C91104d;
import xs0.C91340d;
import ys0.C91578a;
import ys0.C91579b;
import ys0.C91580c;
import ys0.C91583f;
import ys0.C91584g;
import zs0.C91934b;
import zt3.C119157j;

/* renamed from: us0.a */
public abstract class C90729a extends C90580b implements Runnable, C117478d, C88655f, C90577a {

    /* renamed from: e */
    public URI f260590e = null;

    /* renamed from: f */
    public C90581c f260591f = null;

    /* renamed from: g */
    public Socket f260592g = null;

    /* renamed from: h */
    public InputStream f260593h;

    /* renamed from: i */
    public OutputStream f260594i;

    /* renamed from: j */
    public Proxy f260595j = Proxy.NO_PROXY;

    /* renamed from: n */
    public Runnable f260596n;

    /* renamed from: o */
    public Map<String, String> f260597o;

    /* renamed from: p */
    public CountDownLatch f260598p = new CountDownLatch(1);

    /* renamed from: q */
    public CountDownLatch f260599q = new CountDownLatch(1);

    /* renamed from: r */
    public int f260600r = 0;

    /* renamed from: s */
    public String f260601s;

    /* renamed from: t */
    public Timer f260602t = null;

    /* renamed from: u */
    public Future f260603u;

    /* renamed from: us0.a$b */
    public class C90731b implements C88656g {

        /* renamed from: d */
        public volatile boolean f260604d = false;

        public C90731b(C90730a aVar) {
        }

        public String getKey() {
            return "WebsocketWriteThread";
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(4:14|15|(2:18|16)|53) */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0048, code lost:
            r3 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x004a, code lost:
            r3 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            r3 = ((java.util.concurrent.LinkedBlockingQueue) r7.f260605e.f260591f.f260245d).iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x005c, code lost:
            if (r3.hasNext() != false) goto L_0x005e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x005e, code lost:
            r4 = (java.nio.ByteBuffer) r3.next();
            r7.f260605e.f260594i.write(r4.array(), 0, r4.limit());
            r7.f260605e.f260594i.flush();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            r4 = r7.f260605e;
            r4.getClass();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x008a, code lost:
            if ((r3 instanceof javax.net.ssl.SSLException) != false) goto L_0x008c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x008c, code lost:
            r4.mo114103l(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0090, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0092, code lost:
            r4.f260591f.mo124717e();
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace("MicroMsg.AppBrandNetWork.WebSocketClient", r3, "[WebsocketWriteThread] run Exception", new java.lang.Object[0]);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x009e, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105928w("MicroMsg.AppBrandNetWork.WebSocketClient", "[WebsocketWriteThread] closeSocket");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            r4 = r7.f260605e;
            r4.getClass();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a9, code lost:
            if ((r3 instanceof javax.net.ssl.SSLException) != false) goto L_0x00ab;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ab, code lost:
            r4.mo114103l(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ae, code lost:
            r4.f260591f.mo124717e();
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace("MicroMsg.AppBrandNetWork.WebSocketClient", r3, "[WebsocketWriteThread] run IOException", new java.lang.Object[0]);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ba, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105928w("MicroMsg.AppBrandNetWork.WebSocketClient", "[WebsocketWriteThread] closeSocket");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c7, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105928w("MicroMsg.AppBrandNetWork.WebSocketClient", "[WebsocketWriteThread] closeSocket");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
            r7.f260605e.f260594i.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d1, code lost:
            us0.C90729a.m113762h(r7.f260605e);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d6, code lost:
            throw r2;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x004c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r7 = this;
                java.lang.String r0 = "[WebsocketWriteThread] closeSocket"
                java.lang.String r1 = "MicroMsg.AppBrandNetWork.WebSocketClient"
            L_0x0004:
                r2 = 0
                boolean r3 = r7.f260604d     // Catch:{ InterruptedException -> 0x004c }
                if (r3 != 0) goto L_0x007b
                boolean r3 = java.lang.Thread.interrupted()     // Catch:{ InterruptedException -> 0x004c }
                if (r3 != 0) goto L_0x007b
                us0.a r3 = us0.C90729a.this     // Catch:{ InterruptedException -> 0x004c }
                ts0.c r3 = r3.f260591f     // Catch:{ InterruptedException -> 0x004c }
                java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r3 = r3.f260245d     // Catch:{ InterruptedException -> 0x004c }
                boolean r3 = r3.isEmpty()     // Catch:{ InterruptedException -> 0x004c }
                r3 = r3 ^ 1
                if (r3 == 0) goto L_0x0004
                us0.a r3 = us0.C90729a.this     // Catch:{ InterruptedException -> 0x004c }
                ts0.c r3 = r3.f260591f     // Catch:{ InterruptedException -> 0x004c }
                java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r3 = r3.f260245d     // Catch:{ InterruptedException -> 0x004c }
                r4 = 1000(0x3e8, double:4.94E-321)
                java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x004c }
                java.util.concurrent.LinkedBlockingQueue r3 = (java.util.concurrent.LinkedBlockingQueue) r3     // Catch:{ InterruptedException -> 0x004c }
                java.lang.Object r3 = r3.poll(r4, r6)     // Catch:{ InterruptedException -> 0x004c }
                java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3     // Catch:{ InterruptedException -> 0x004c }
                if (r3 == 0) goto L_0x0004
                us0.a r4 = us0.C90729a.this     // Catch:{ InterruptedException -> 0x004c }
                java.io.OutputStream r4 = r4.f260594i     // Catch:{ InterruptedException -> 0x004c }
                byte[] r5 = r3.array()     // Catch:{ InterruptedException -> 0x004c }
                int r3 = r3.limit()     // Catch:{ InterruptedException -> 0x004c }
                r4.write(r5, r2, r3)     // Catch:{ InterruptedException -> 0x004c }
                us0.a r3 = us0.C90729a.this     // Catch:{ InterruptedException -> 0x004c }
                java.io.OutputStream r3 = r3.f260594i     // Catch:{ InterruptedException -> 0x004c }
                r3.flush()     // Catch:{ InterruptedException -> 0x004c }
                goto L_0x0004
            L_0x0048:
                r3 = move-exception
                goto L_0x0083
            L_0x004a:
                r3 = move-exception
                goto L_0x00a2
            L_0x004c:
                us0.a r3 = us0.C90729a.this     // Catch:{ IOException -> 0x004a, Exception -> 0x0048 }
                ts0.c r3 = r3.f260591f     // Catch:{ IOException -> 0x004a, Exception -> 0x0048 }
                java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r3 = r3.f260245d     // Catch:{ IOException -> 0x004a, Exception -> 0x0048 }
                java.util.concurrent.LinkedBlockingQueue r3 = (java.util.concurrent.LinkedBlockingQueue) r3     // Catch:{ IOException -> 0x004a, Exception -> 0x0048 }
                java.util.Iterator r3 = r3.iterator()     // Catch:{ IOException -> 0x004a, Exception -> 0x0048 }
            L_0x0058:
                boolean r4 = r3.hasNext()     // Catch:{ IOException -> 0x004a, Exception -> 0x0048 }
                if (r4 == 0) goto L_0x007b
                java.lang.Object r4 = r3.next()     // Catch:{ IOException -> 0x004a, Exception -> 0x0048 }
                java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4     // Catch:{ IOException -> 0x004a, Exception -> 0x0048 }
                us0.a r5 = us0.C90729a.this     // Catch:{ IOException -> 0x004a, Exception -> 0x0048 }
                java.io.OutputStream r5 = r5.f260594i     // Catch:{ IOException -> 0x004a, Exception -> 0x0048 }
                byte[] r6 = r4.array()     // Catch:{ IOException -> 0x004a, Exception -> 0x0048 }
                int r4 = r4.limit()     // Catch:{ IOException -> 0x004a, Exception -> 0x0048 }
                r5.write(r6, r2, r4)     // Catch:{ IOException -> 0x004a, Exception -> 0x0048 }
                us0.a r4 = us0.C90729a.this     // Catch:{ IOException -> 0x004a, Exception -> 0x0048 }
                java.io.OutputStream r4 = r4.f260594i     // Catch:{ IOException -> 0x004a, Exception -> 0x0048 }
                r4.flush()     // Catch:{ IOException -> 0x004a, Exception -> 0x0048 }
                goto L_0x0058
            L_0x007b:
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r0)
            L_0x007e:
                us0.a r0 = us0.C90729a.this     // Catch:{ IOException -> 0x00c1 }
                java.io.OutputStream r0 = r0.f260594i     // Catch:{ IOException -> 0x00c1 }
                goto L_0x00be
            L_0x0083:
                us0.a r4 = us0.C90729a.this     // Catch:{ all -> 0x0090 }
                r4.getClass()     // Catch:{ all -> 0x0090 }
                boolean r5 = r3 instanceof javax.net.ssl.SSLException     // Catch:{ all -> 0x0090 }
                if (r5 == 0) goto L_0x0092
                r4.mo114103l(r3)     // Catch:{ all -> 0x0090 }
                goto L_0x0092
            L_0x0090:
                r2 = move-exception
                goto L_0x00c7
            L_0x0092:
                ts0.c r4 = r4.f260591f     // Catch:{ all -> 0x0090 }
                r4.mo124717e()     // Catch:{ all -> 0x0090 }
                java.lang.String r4 = "[WebsocketWriteThread] run Exception"
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0090 }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r3, r4, r2)     // Catch:{ all -> 0x0090 }
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r0)
                goto L_0x007e
            L_0x00a2:
                us0.a r4 = us0.C90729a.this     // Catch:{ all -> 0x0090 }
                r4.getClass()     // Catch:{ all -> 0x0090 }
                boolean r5 = r3 instanceof javax.net.ssl.SSLException     // Catch:{ all -> 0x0090 }
                if (r5 == 0) goto L_0x00ae
                r4.mo114103l(r3)     // Catch:{ all -> 0x0090 }
            L_0x00ae:
                ts0.c r4 = r4.f260591f     // Catch:{ all -> 0x0090 }
                r4.mo124717e()     // Catch:{ all -> 0x0090 }
                java.lang.String r4 = "[WebsocketWriteThread] run IOException"
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0090 }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r3, r4, r2)     // Catch:{ all -> 0x0090 }
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r0)
                goto L_0x007e
            L_0x00be:
                r0.close()     // Catch:{ IOException -> 0x00c1 }
            L_0x00c1:
                us0.a r0 = us0.C90729a.this
                us0.C90729a.m113762h(r0)
                return
            L_0x00c7:
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r0)
                us0.a r0 = us0.C90729a.this     // Catch:{ IOException -> 0x00d1 }
                java.io.OutputStream r0 = r0.f260594i     // Catch:{ IOException -> 0x00d1 }
                r0.close()     // Catch:{ IOException -> 0x00d1 }
            L_0x00d1:
                us0.a r0 = us0.C90729a.this
                us0.C90729a.m113762h(r0)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: us0.C90729a.C90731b.run():void");
        }
    }

    public C90729a(URI uri, C90866a aVar, Map<String, String> map, int i) {
        if (uri == null) {
            throw new IllegalArgumentException();
        } else if (aVar != null) {
            this.f260590e = uri;
            this.f260597o = map;
            this.f260600r = i;
            this.f260591f = new C90581c(this, aVar);
            this.f260243d = false;
        } else {
            throw new IllegalArgumentException("null as draft is permitted for `WebSocketServer` only!");
        }
    }

    /* renamed from: h */
    public static void m113762h(C90729a aVar) {
        aVar.getClass();
        try {
            Socket socket = aVar.f260592g;
            if (socket != null) {
                socket.close();
            }
        } catch (IOException e) {
            aVar.mo114103l(e);
        }
    }

    /* renamed from: j */
    private int m113763j() {
        int port = this.f260590e.getPort();
        if (port != -1) {
            return port;
        }
        String scheme = this.f260590e.getScheme();
        if (scheme.equals("wss")) {
            return JsApiPauseDownloadTask.CTRL_INDEX;
        }
        if (scheme.equals("ws")) {
            return 80;
        }
        throw new RuntimeException("unkonow scheme" + scheme);
    }

    /* renamed from: a */
    public void mo124852a(Timer timer) {
        this.f260602t = timer;
    }

    /* renamed from: b */
    public void mo124853b(String str) {
        C90581c cVar = this.f260591f;
        if (str == null) {
            cVar.getClass();
            Log.m105924i("MicroMsg.AppBrandNetWork.WebSocketImpl", "Cannot send 'null' data to a WebSocketImpl.");
            return;
        }
        cVar.mo124719g(cVar.f260249h.mo124968e(str, cVar.f260250i == C90577a.C90579b.CLIENT));
    }

    /* renamed from: c */
    public void mo124854c(ByteBuffer byteBuffer) {
        C90581c cVar = this.f260591f;
        if (byteBuffer == null) {
            cVar.getClass();
            Log.m105924i("MicroMsg.AppBrandNetWork.WebSocketImpl", "Cannot send 'null' data to a WebSocketImpl.");
            return;
        }
        cVar.mo124719g(cVar.f260249h.mo124969f(byteBuffer, cVar.f260250i == C90577a.C90579b.CLIENT));
    }

    public void close() {
        if (this.f260596n != null) {
            this.f260591f.mo124713a(1000, "", false);
        }
    }

    /* renamed from: d */
    public void mo124856d(String str, int i) {
        if (this.f260596n != null) {
            this.f260591f.mo124713a(i, str, false);
        }
    }

    /* renamed from: f */
    public Timer mo124857f() {
        return this.f260602t;
    }

    /* renamed from: g */
    public void mo121152g(Future future) {
        this.f260603u = future;
    }

    public String getKey() {
        return "WebsocketWriteThread";
    }

    public String getTaskId() {
        return this.f260601s;
    }

    /* renamed from: i */
    public void mo124859i() {
        if (this.f260596n != null) {
            Log.m105924i("MicroMsg.AppBrandNetWork.WebSocketClient", "WebSocketClient objects are not reuseable");
            return;
        }
        this.f260596n = this;
        ((C119157j) C119157j.f356862d).mo183875f(this);
    }

    public boolean isOpen() {
        return this.f260591f.f260247f == C90577a.C90578a.OPEN;
    }

    /* renamed from: k */
    public abstract void mo114102k(int i, String str, boolean z);

    /* renamed from: l */
    public abstract void mo114103l(Exception exc);

    /* renamed from: m */
    public abstract void mo114104m(C91340d dVar);

    /* renamed from: n */
    public abstract void mo114105n(String str);

    /* renamed from: o */
    public abstract void mo114106o(ByteBuffer byteBuffer);

    /* renamed from: p */
    public abstract void mo114107p(C91584g gVar);

    /* renamed from: q */
    public final void mo124861q(C90577a aVar, int i, String str, boolean z) {
        this.f260598p.countDown();
        this.f260599q.countDown();
        Future future = this.f260603u;
        if (future != null) {
            future.cancel(false);
        }
        Runnable runnable = this.f260596n;
        if (runnable != null && (runnable instanceof C90731b)) {
            ((C90731b) runnable).f260604d = true;
        }
        try {
            Socket socket = this.f260592g;
            if (socket != null) {
                socket.close();
            }
        } catch (IOException e) {
            mo114103l(e);
        }
        mo114102k(i, str, z);
    }

    /* renamed from: r */
    public final void mo124862r() {
        String str;
        byte[] bArr;
        String rawPath = this.f260590e.getRawPath();
        String rawQuery = this.f260590e.getRawQuery();
        if (rawPath == null || rawPath.length() == 0) {
            rawPath = "/";
        }
        if (rawQuery != null) {
            rawPath = rawPath + "?" + rawQuery;
        }
        int j = m113763j();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f260590e.getHost());
        if (j != 80) {
            str = XVFSFile.PATH_SEPARATOR + j;
        } else {
            str = "";
        }
        sb.append(str);
        String sb4 = sb.toString();
        C91580c cVar = new C91580c();
        if (rawPath == null) {
            Log.m105924i("MicroMsg.AppBrandNetWork.HandshakeImpl1Client", "http resource descriptor must not be null");
        } else {
            cVar.f262428b = rawPath;
        }
        cVar.mo125463g("Host", sb4);
        Map<String, String> map = this.f260597o;
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                cVar.mo125463g((String) next.getKey(), (String) next.getValue());
            }
        }
        C90581c cVar2 = this.f260591f;
        C91579b h = cVar2.f260249h.mo124971h(cVar);
        cVar2.f260253o = h;
        if (cVar.f262428b != null) {
            try {
                cVar2.f260248g.mo124548e(cVar2, h);
                C90866a aVar = cVar2.f260249h;
                C91578a aVar2 = cVar2.f260253o;
                aVar.getClass();
                StringBuilder sb5 = new StringBuilder(100);
                if (aVar2 instanceof C91578a) {
                    sb5.append("GET ");
                    sb5.append(aVar2.mo125457f());
                    sb5.append(" HTTP/1.1");
                } else if (aVar2 instanceof C91584g) {
                    sb5.append("HTTP/1.1 101 " + ((C91584g) aVar2).mo125458b());
                } else {
                    sb5.append("GET ");
                    sb5.append(aVar2.mo125457f());
                    sb5.append(" HTTP/1.1");
                    Log.m105920e("MicroMsg.AppBrandNetWork.Draft", "unknow role");
                }
                sb5.append(APLogFileUtil.SEPARATOR_LINE);
                Iterator<String> a = ((C91583f) aVar2).mo125460a();
                while (a.hasNext()) {
                    String next2 = a.next();
                    String c = ((C91583f) aVar2).mo125461c(next2);
                    sb5.append(next2);
                    sb5.append(": ");
                    sb5.append(c);
                    sb5.append(APLogFileUtil.SEPARATOR_LINE);
                }
                sb5.append(APLogFileUtil.SEPARATOR_LINE);
                String sb6 = sb5.toString();
                CodingErrorAction codingErrorAction = C91934b.f263208a;
                try {
                    bArr = sb6.getBytes("ASCII");
                } catch (UnsupportedEncodingException e) {
                    Log.m105920e("MicroMsg.AppBrandNetWork.Charsetfunctions", e.toString());
                    bArr = new byte[0];
                }
                ByteBuffer allocate = ByteBuffer.allocate(0 + bArr.length);
                allocate.put(bArr);
                allocate.flip();
                for (ByteBuffer add : Collections.singletonList(allocate)) {
                    cVar2.f260245d.add(add);
                    cVar2.f260248g.getClass();
                }
            } catch (C91102b unused) {
                throw new C91104d("Handshake data rejected by client.");
            } catch (RuntimeException e2) {
                ((C90729a) cVar2.f260248g).mo114103l(e2);
                throw new C91104d("rejected because of" + e2);
            }
        }
    }

    public void run() {
        int read;
        try {
            Socket socket = this.f260592g;
            if (socket == null) {
                this.f260592g = new Socket(this.f260595j);
            } else if (socket.isClosed()) {
                throw new IOException();
            }
            this.f260592g.setTcpNoDelay(this.f260243d);
            if (!this.f260592g.isBound()) {
                this.f260592g.connect(new InetSocketAddress(this.f260590e.getHost(), m113763j()), this.f260600r);
            }
            this.f260593h = this.f260592g.getInputStream();
            this.f260594i = this.f260592g.getOutputStream();
            mo124862r();
            C90731b bVar = new C90731b((C90730a) null);
            this.f260596n = bVar;
            ((C119157j) C119157j.f356862d).mo183875f(bVar);
            List<C90866a> list = C90581c.f260244s;
            byte[] bArr = new byte[16384];
            while (true) {
                try {
                    C90577a.C90578a aVar = this.f260591f.f260247f;
                    boolean z = true;
                    if (!(aVar == C90577a.C90578a.CLOSING)) {
                        if (aVar != C90577a.C90578a.CLOSED) {
                            z = false;
                        }
                        if (z || (read = this.f260593h.read(bArr)) == -1) {
                            break;
                        }
                        this.f260591f.mo124715c(ByteBuffer.wrap(bArr, 0, read));
                    } else {
                        break;
                    }
                } catch (IOException unused) {
                    this.f260591f.mo124717e();
                    return;
                } catch (RuntimeException e) {
                    mo114103l(e);
                    this.f260591f.mo124714b(1006, e.getMessage(), false);
                    return;
                }
            }
            this.f260591f.mo124717e();
        } catch (Exception e2) {
            this.f260591f.mo124714b(-1, e2.getMessage(), false);
        }
    }

    /* renamed from: s */
    public void mo124864s(Socket socket) {
        if (this.f260592g != null) {
            Log.m105924i("MicroMsg.AppBrandNetWork.WebSocketClient", "socket has already been set");
        } else {
            this.f260592g = socket;
        }
    }
}
