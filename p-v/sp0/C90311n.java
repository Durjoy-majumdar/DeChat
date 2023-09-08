package sp0;

import com.tencent.p014mm.plugin.appbrand.jsapi.websocket.C83100d;
import com.tencent.p014mm.plugin.appbrand.jsapi.websocket.C83101e;
import com.tencent.p014mm.plugin.appbrand.jsapi.websocket.C83103f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import sl0.C90220f;
import ts0.C90577a;
import vs0.C90866a;
import xs0.C91340d;
import ys0.C91578a;
import ys0.C91584g;
import zs0.C91934b;

/* renamed from: sp0.n */
public class C90311n implements C83101e {

    /* renamed from: a */
    public final ArrayList<C83103f> f259261a = new ArrayList<>();

    /* renamed from: c */
    public SSLSocketFactory f259262c;

    /* renamed from: d */
    public int f259263d;

    /* renamed from: e */
    public final String f259264e;

    /* renamed from: sp0.n$a */
    public class C90312a extends C83100d {

        /* renamed from: v */
        public C91340d f259265v = null;

        /* renamed from: w */
        public final /* synthetic */ String f259266w;

        /* renamed from: x */
        public final /* synthetic */ String f259267x;

        /* renamed from: y */
        public final /* synthetic */ C83101e.C83102a f259268y;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C90312a(URI uri, C90866a aVar, Map map, int i, String str, String str2, C83101e.C83102a aVar2) {
            super(uri, aVar, map, i);
            this.f259266w = str;
            this.f259267x = str2;
            this.f259268y = aVar2;
        }

        /* renamed from: e */
        public void mo124548e(C90577a aVar, C91578a aVar2) {
            ((C90220f.C90221a) this.f259268y).mo124460g(aVar2);
        }

        /* renamed from: k */
        public void mo114102k(int i, String str, boolean z) {
            Log.m105925i("MicroMsg.AppBrandNetworkWebSocket", "url is %s ,state: closed ,reason: %s, errCode = %d, taskId=%s", this.f259266w, str, Integer.valueOf(i), this.f259267x);
            C90311n.this.mo124547j(this);
            C90311n.this.mo124546i(this);
            if (i == -1 || i == -2 || i == -3) {
                if (!NetStatusUtil.isConnected(MMApplicationContext.getContext())) {
                    ((C90220f.C90221a) this.f259268y).mo124456c("network is down");
                } else {
                    ((C90220f.C90221a) this.f259268y).mo124456c(Util.isNullOrNil(str) ? "abnormal closure" : str);
                }
                ((C90220f.C90221a) this.f259268y).mo124454a(1006, str);
                return;
            }
            ((C90220f.C90221a) this.f259268y).mo124454a(i, str);
        }

        /* renamed from: l */
        public void mo114103l(Exception exc) {
            Log.printErrStackTrace("MicroMsg.AppBrandNetworkWebSocket", exc, "onError Exception: url %s, taskId=%s", this.f259266w, this.f259267x);
            C90311n.this.mo124547j(this);
            C90311n.this.mo124546i(this);
            C83101e.C83102a aVar = this.f259268y;
            ((C90220f.C90221a) aVar).mo124456c("exception " + exc.getMessage());
        }

        /* renamed from: m */
        public void mo114104m(C91340d dVar) {
            C91340d dVar2;
            C91340d.C91341a d = dVar.mo125327d();
            C91340d.C91341a aVar = C91340d.C91341a.CONTINUOUS;
            if (d != aVar && !dVar.mo125328e()) {
                this.f259265v = dVar;
            } else if (dVar.mo125327d() == aVar && (dVar2 = this.f259265v) != null) {
                if (dVar2.mo125322f().position() > 10485760) {
                    Log.m105920e("MicroMsg.AppBrandNetworkWebSocket", "Pending Frame exploded");
                    this.f259265v = null;
                    return;
                }
                try {
                    this.f259265v.mo125326c(dVar);
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.AppBrandNetworkWebSocket", e, "Exception: Framedata append fail", new Object[0]);
                }
                if (dVar.mo125328e()) {
                    if (this.f259265v.mo125327d() == C91340d.C91341a.BINARY) {
                        mo114106o(this.f259265v.mo125322f());
                    } else if (this.f259265v.mo125327d() == C91340d.C91341a.TEXT) {
                        try {
                            mo114105n(Util.nullAsNil(C91934b.m115449a(this.f259265v.mo125322f())));
                        } catch (Exception e2) {
                            Log.printErrStackTrace("MicroMsg.AppBrandNetworkWebSocket", e2, "Exception: stringUtf8 error", new Object[0]);
                        }
                    }
                    this.f259265v = null;
                }
            }
        }

        /* renamed from: n */
        public void mo114105n(String str) {
            Object[] objArr = new Object[3];
            objArr[0] = this.f259266w;
            objArr[1] = Integer.valueOf(str != null ? str.length() : -1);
            objArr[2] = this.f259267x;
            Log.m105925i("MicroMsg.AppBrandNetworkWebSocket", "url is %s ,socket onmessage length :%d, taskId=%s", objArr);
            ((C90220f.C90221a) this.f259268y).mo124457d(str);
        }

        /* renamed from: o */
        public void mo114106o(ByteBuffer byteBuffer) {
            Object[] objArr = new Object[3];
            objArr[0] = this.f259266w;
            objArr[1] = Integer.valueOf(byteBuffer != null ? byteBuffer.capacity() : -1);
            objArr[2] = this.f259267x;
            Log.m105925i("MicroMsg.AppBrandNetworkWebSocket", "url is %s , socket onMessage buffer length : %d, taskId=%s", objArr);
            ((C90220f.C90221a) this.f259268y).mo124458e(byteBuffer);
        }

        /* renamed from: p */
        public void mo114107p(C91584g gVar) {
            Log.m105925i("MicroMsg.AppBrandNetworkWebSocket", "url is %s ,state: opened, taskId=%s", this.f259266w, this.f259267x);
            C90311n.this.mo124547j(this);
            ((C90220f.C90221a) this.f259268y).mo124459f(gVar, (Map<String, String>) null);
        }
    }

    /* renamed from: sp0.n$b */
    public class C90313b extends TimerTask {

        /* renamed from: d */
        public final /* synthetic */ C83103f f259270d;

        /* renamed from: e */
        public final /* synthetic */ C83101e.C83102a f259271e;

        /* renamed from: f */
        public final /* synthetic */ Timer f259272f;

        public C90313b(C83103f fVar, C83101e.C83102a aVar, Timer timer) {
            this.f259270d = fVar;
            this.f259271e = aVar;
            this.f259272f = timer;
        }

        public void run() {
            Log.m105920e("MicroMsg.AppBrandNetworkWebSocket", "connect response time out");
            this.f259270d.close();
            C90311n.this.mo124546i(this.f259270d);
            ((C90220f.C90221a) this.f259271e).mo124456c("connect response time out");
            cancel();
            this.f259272f.cancel();
        }
    }

    /* renamed from: sp0.n$c */
    public class C90314c extends TimerTask {

        /* renamed from: d */
        public final /* synthetic */ C83103f f259274d;

        /* renamed from: e */
        public final /* synthetic */ C83101e.C83102a f259275e;

        /* renamed from: f */
        public final /* synthetic */ Timer f259276f;

        public C90314c(C83103f fVar, C83101e.C83102a aVar, Timer timer) {
            this.f259274d = fVar;
            this.f259275e = aVar;
            this.f259276f = timer;
        }

        public void run() {
            Log.m105920e("MicroMsg.AppBrandNetworkWebSocket", "connect response time out");
            this.f259274d.close();
            C90311n.this.mo124546i(this.f259274d);
            ((C90220f.C90221a) this.f259275e).mo124456c("connect response time out");
            cancel();
            this.f259276f.cancel();
        }
    }

    /* renamed from: sp0.n$d */
    public interface C90315d {
    }

    /* renamed from: sp0.n$e */
    public interface C90316e {
    }

    /* renamed from: sp0.n$f */
    public interface C90317f {
        /* renamed from: a */
        boolean mo116757a(String str);

        /* renamed from: x */
        boolean mo116758x(String str);
    }

    public C90311n(C90272a aVar) {
        SSLContext p = C90309m.m113081p(aVar);
        if (p != null) {
            this.f259262c = p.getSocketFactory();
        }
        this.f259264e = aVar.f259120B;
        this.f259263d = aVar.f259134n;
        Log.m105925i("MicroMsg.AppBrandNetworkWebSocket", "mTLSSkipHostnameCheck is %b", Boolean.valueOf(aVar.f259125G));
    }

    /* renamed from: a */
    public C83103f mo115339a(String str) {
        if (str == null) {
            return null;
        }
        synchronized (this.f259261a) {
            Iterator<C83103f> it = this.f259261a.iterator();
            while (it.hasNext()) {
                C83103f next = it.next();
                if (str.equals(next.getTaskId())) {
                    return next;
                }
            }
            return null;
        }
    }

    /* renamed from: b */
    public void mo115340b(C83103f fVar, int i, String str) {
        if (fVar != null) {
            try {
                Log.m105924i("MicroMsg.AppBrandNetworkWebSocket", "try to close socket");
                fVar.mo115355d(str, i);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.AppBrandNetworkWebSocket", e, "Exception: send error", new Object[0]);
            }
            mo124546i(fVar);
        }
    }

    /* renamed from: c */
    public void mo115341c(C83103f fVar, ByteBuffer byteBuffer) {
        fVar.mo115353c(byteBuffer);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r3 = new java.net.URI(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0052, code lost:
        r8 = r1.optBoolean("tcpNoDelay", false);
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.AppBrandNetworkWebSocket", "connectSocket, url= %s, timeout = %d, tcpNoDelay = %b, taskId=%s", r9, java.lang.Integer.valueOf(r21), java.lang.Boolean.valueOf(r8), r11);
        r5.put("User-Agent", r10.f259264e);
        r1 = sp0.C90309m.m113090y(r22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0083, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r1) != false) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0085, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.AppBrandNetworkWebSocket", "protocols %s", r1);
        r5.put("Sec-WebSocket-Protocol", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0096, code lost:
        r1 = sp0.C90309m.m113075j(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x009e, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r1) != false) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a0, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.AppBrandNetworkWebSocket", "Origin %s", r1);
        r5.put("Origin", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00b7, code lost:
        r1 = r1;
        r15 = r1;
        r14 = r8;
        r12 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r1 = new sp0.C90311n.C90312a(r17, r3, new vs0.C90872d(), r23, r21, r9, r19, r24);
        r15.f260601s = r11;
        r15.f260243d = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00d4, code lost:
        if (p225rc.C89925n.m112490c(r12, "ws://") == false) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00d6, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.AppBrandNetworkWebSocket", "url is %s ,user ws connect", r12);
        r15.mo124864s(new java.net.Socket(java.net.Proxy.NO_PROXY));
        r15.mo124859i();
        mo124545h(r15);
        r0 = new java.util.Timer("AppNetSocket");
        r1 = new sp0.C90311n.C90313b(r10, r15, r13, r0);
        r15.f260602t = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0102, code lost:
        r3 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r0.schedule(r1, (long) r21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x010b, code lost:
        r2 = r21;
        r3 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0115, code lost:
        if (p225rc.C89925n.m112490c(r3, "wss://") == false) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0117, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.AppBrandNetworkWebSocket", "url is %s ,user wss connect", r3);
        r1 = r10.f259262c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0127, code lost:
        if (r1 == null) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x012a, code lost:
        r1 = (javax.net.ssl.SSLSocketFactory) javax.net.ssl.SSLSocketFactory.getDefault();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0130, code lost:
        r15.mo124864s(r1.createSocket());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x013e, code lost:
        if (r0.equals("wx577c74fb940daaea") != false) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0147, code lost:
        if (r0.equals("wx850d691fd02de8a1") == false) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0149, code lost:
        r0 = (javax.net.ssl.SSLSocket) r15.f260592g;
        r1 = r0.getSupportedCipherSuites();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0151, code lost:
        if (r1 == null) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0153, code lost:
        r0.setEnabledCipherSuites(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0156, code lost:
        r15.mo124859i();
        mo124545h(r15);
        r0 = new java.util.Timer("AppTestSocket");
        r1 = new sp0.C90311n.C90314c(r10, r15, r13, r0);
        r15.f260602t = r0;
        r0.schedule(r1, (long) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x016f, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.AppBrandNetworkWebSocket", "url error: %s not ws:// or wss://", r3);
        ((sl0.C90220f.C90221a) r13).mo124455b("url not ws or wss");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0187, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0189, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x018a, code lost:
        r3 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x018c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x018d, code lost:
        r3 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x018e, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace("MicroMsg.AppBrandNetworkWebSocket", r0, "Exception: url %s", r3);
        ((sl0.C90220f.C90221a) r13).mo124456c(r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01a6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01a7, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace("MicroMsg.AppBrandNetworkWebSocket", r0, "Exception: connect fail", new java.lang.Object[0]);
        ((sl0.C90220f.C90221a) r13).mo124455b("url not well format");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01ba, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0046, code lost:
        r9 = r1.optString("url");
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo115342d(java.lang.String r18, java.lang.String r19, int r20, int r21, org.json.JSONObject r22, java.util.Map<java.lang.String, java.lang.String> r23, com.tencent.p014mm.plugin.appbrand.jsapi.websocket.C83101e.C83102a r24) {
        /*
            r17 = this;
            r10 = r17
            r0 = r18
            r11 = r19
            r12 = r21
            r1 = r22
            r5 = r23
            r13 = r24
            java.util.ArrayList<com.tencent.mm.plugin.appbrand.jsapi.websocket.f> r2 = r10.f259261a
            monitor-enter(r2)
            java.util.ArrayList<com.tencent.mm.plugin.appbrand.jsapi.websocket.f> r3 = r10.f259261a     // Catch:{ all -> 0x01bb }
            int r3 = r3.size()     // Catch:{ all -> 0x01bb }
            int r4 = r10.f259263d     // Catch:{ all -> 0x01bb }
            r6 = 2
            r14 = 1
            r15 = 0
            if (r3 < r4) goto L_0x0045
            java.lang.String r0 = "max connected"
            r1 = r13
            sl0.f$a r1 = (sl0.C90220f.C90221a) r1     // Catch:{ all -> 0x01bb }
            r1.mo124455b(r0)     // Catch:{ all -> 0x01bb }
            java.lang.String r0 = "MicroMsg.AppBrandNetworkWebSocket"
            java.lang.String r1 = "max connected mTaskList.size():%d,mMaxWebsocketConnect:%d"
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ all -> 0x01bb }
            java.util.ArrayList<com.tencent.mm.plugin.appbrand.jsapi.websocket.f> r4 = r10.f259261a     // Catch:{ all -> 0x01bb }
            int r4 = r4.size()     // Catch:{ all -> 0x01bb }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x01bb }
            r3[r15] = r4     // Catch:{ all -> 0x01bb }
            int r4 = r10.f259263d     // Catch:{ all -> 0x01bb }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x01bb }
            r3[r14] = r4     // Catch:{ all -> 0x01bb }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r3)     // Catch:{ all -> 0x01bb }
            monitor-exit(r2)     // Catch:{ all -> 0x01bb }
            return
        L_0x0045:
            monitor-exit(r2)     // Catch:{ all -> 0x01bb }
            java.lang.String r2 = "url"
            java.lang.String r9 = r1.optString(r2)
            java.net.URI r3 = new java.net.URI     // Catch:{ Exception -> 0x01a6 }
            r3.<init>(r9)     // Catch:{ Exception -> 0x01a6 }
            java.lang.String r2 = "tcpNoDelay"
            boolean r8 = r1.optBoolean(r2, r15)
            java.lang.String r2 = "MicroMsg.AppBrandNetworkWebSocket"
            java.lang.String r4 = "connectSocket, url= %s, timeout = %d, tcpNoDelay = %b, taskId=%s"
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r15] = r9
            java.lang.Integer r16 = java.lang.Integer.valueOf(r21)
            r7[r14] = r16
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r8)
            r7[r6] = r16
            r6 = 3
            r7[r6] = r11
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r7)
            java.lang.String r2 = "User-Agent"
            java.lang.String r4 = r10.f259264e
            r5.put(r2, r4)
            java.lang.String r1 = sp0.C90309m.m113090y(r22)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r2 != 0) goto L_0x0096
            java.lang.String r2 = "MicroMsg.AppBrandNetworkWebSocket"
            java.lang.String r4 = "protocols %s"
            java.lang.Object[] r6 = new java.lang.Object[r14]
            r6[r15] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r6)
            java.lang.String r2 = "Sec-WebSocket-Protocol"
            r5.put(r2, r1)
        L_0x0096:
            java.lang.String r1 = sp0.C90309m.m113075j(r3)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r2 != 0) goto L_0x00b0
            java.lang.String r2 = "MicroMsg.AppBrandNetworkWebSocket"
            java.lang.String r4 = "Origin %s"
            java.lang.Object[] r6 = new java.lang.Object[r14]
            r6[r15] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r6)
            java.lang.String r2 = "Origin"
            r5.put(r2, r1)
        L_0x00b0:
            sp0.n$a r7 = new sp0.n$a     // Catch:{ Exception -> 0x018c }
            vs0.d r4 = new vs0.d     // Catch:{ Exception -> 0x018c }
            r4.<init>()     // Catch:{ Exception -> 0x018c }
            r1 = r7
            r2 = r17
            r5 = r23
            r6 = r21
            r15 = r7
            r7 = r9
            r14 = r8
            r8 = r19
            r12 = r9
            r9 = r24
            r1.<init>(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0189 }
            r15.f260601s = r11     // Catch:{ Exception -> 0x0189 }
            r15.f260243d = r14     // Catch:{ Exception -> 0x0189 }
            java.lang.String r1 = "ws://"
            boolean r1 = p225rc.C89925n.m112490c(r12, r1)     // Catch:{ Exception -> 0x0189 }
            if (r1 == 0) goto L_0x010b
            java.lang.String r0 = "MicroMsg.AppBrandNetworkWebSocket"
            java.lang.String r1 = "url is %s ,user ws connect"
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0189 }
            r2 = 0
            r3[r2] = r12     // Catch:{ Exception -> 0x0189 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r3)     // Catch:{ Exception -> 0x0189 }
            java.net.Socket r0 = new java.net.Socket     // Catch:{ Exception -> 0x0189 }
            java.net.Proxy r1 = java.net.Proxy.NO_PROXY     // Catch:{ Exception -> 0x0189 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0189 }
            r15.mo124864s(r0)     // Catch:{ Exception -> 0x0189 }
            r15.mo124859i()     // Catch:{ Exception -> 0x0189 }
            r10.mo124545h(r15)     // Catch:{ Exception -> 0x0189 }
            java.util.Timer r0 = new java.util.Timer     // Catch:{ Exception -> 0x0189 }
            java.lang.String r1 = "AppNetSocket"
            r0.<init>(r1)     // Catch:{ Exception -> 0x0189 }
            sp0.n$b r1 = new sp0.n$b     // Catch:{ Exception -> 0x0189 }
            r1.<init>(r15, r13, r0)     // Catch:{ Exception -> 0x0189 }
            r15.f260602t = r0     // Catch:{ Exception -> 0x0189 }
            r2 = r21
            r3 = r12
            long r4 = (long) r2
            r0.schedule(r1, r4)     // Catch:{ Exception -> 0x0187 }
            goto L_0x01a5
        L_0x010b:
            r2 = r21
            r3 = r12
            java.lang.String r1 = "wss://"
            boolean r1 = p225rc.C89925n.m112490c(r3, r1)     // Catch:{ Exception -> 0x0187 }
            if (r1 == 0) goto L_0x016f
            java.lang.String r1 = "MicroMsg.AppBrandNetworkWebSocket"
            java.lang.String r4 = "url is %s ,user wss connect"
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0187 }
            r5 = 0
            r6[r5] = r3     // Catch:{ Exception -> 0x0187 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r4, r6)     // Catch:{ Exception -> 0x0187 }
            javax.net.ssl.SSLSocketFactory r1 = r10.f259262c     // Catch:{ Exception -> 0x0187 }
            if (r1 == 0) goto L_0x012a
            goto L_0x0130
        L_0x012a:
            javax.net.SocketFactory r1 = javax.net.ssl.SSLSocketFactory.getDefault()     // Catch:{ Exception -> 0x0187 }
            javax.net.ssl.SSLSocketFactory r1 = (javax.net.ssl.SSLSocketFactory) r1     // Catch:{ Exception -> 0x0187 }
        L_0x0130:
            java.net.Socket r1 = r1.createSocket()     // Catch:{ Exception -> 0x0187 }
            r15.mo124864s(r1)     // Catch:{ Exception -> 0x0187 }
            java.lang.String r1 = "wx577c74fb940daaea"
            boolean r1 = r0.equals(r1)     // Catch:{ Exception -> 0x0187 }
            if (r1 != 0) goto L_0x0149
            java.lang.String r1 = "wx850d691fd02de8a1"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0187 }
            if (r0 == 0) goto L_0x0156
        L_0x0149:
            java.net.Socket r0 = r15.f260592g     // Catch:{ Exception -> 0x0187 }
            javax.net.ssl.SSLSocket r0 = (javax.net.ssl.SSLSocket) r0     // Catch:{ Exception -> 0x0187 }
            java.lang.String[] r1 = r0.getSupportedCipherSuites()     // Catch:{ Exception -> 0x0187 }
            if (r1 == 0) goto L_0x0156
            r0.setEnabledCipherSuites(r1)     // Catch:{ Exception -> 0x0187 }
        L_0x0156:
            r15.mo124859i()     // Catch:{ Exception -> 0x0187 }
            r10.mo124545h(r15)     // Catch:{ Exception -> 0x0187 }
            java.util.Timer r0 = new java.util.Timer     // Catch:{ Exception -> 0x0187 }
            java.lang.String r1 = "AppTestSocket"
            r0.<init>(r1)     // Catch:{ Exception -> 0x0187 }
            sp0.n$c r1 = new sp0.n$c     // Catch:{ Exception -> 0x0187 }
            r1.<init>(r15, r13, r0)     // Catch:{ Exception -> 0x0187 }
            r15.f260602t = r0     // Catch:{ Exception -> 0x0187 }
            long r4 = (long) r2     // Catch:{ Exception -> 0x0187 }
            r0.schedule(r1, r4)     // Catch:{ Exception -> 0x0187 }
            goto L_0x01a5
        L_0x016f:
            java.lang.String r0 = "MicroMsg.AppBrandNetworkWebSocket"
            java.lang.String r1 = "url error: %s not ws:// or wss://"
            r2 = 1
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0187 }
            r2 = 0
            r4[r2] = r3     // Catch:{ Exception -> 0x0187 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r4)     // Catch:{ Exception -> 0x0187 }
            java.lang.String r0 = "url not ws or wss"
            r1 = r13
            sl0.f$a r1 = (sl0.C90220f.C90221a) r1     // Catch:{ Exception -> 0x0187 }
            r1.mo124455b(r0)     // Catch:{ Exception -> 0x0187 }
            goto L_0x01a5
        L_0x0187:
            r0 = move-exception
            goto L_0x018e
        L_0x0189:
            r0 = move-exception
            r3 = r12
            goto L_0x018e
        L_0x018c:
            r0 = move-exception
            r3 = r9
        L_0x018e:
            java.lang.String r1 = "MicroMsg.AppBrandNetworkWebSocket"
            java.lang.String r2 = "Exception: url %s"
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r3
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r2, r4)
            java.lang.String r0 = r0.getMessage()
            r1 = r13
            sl0.f$a r1 = (sl0.C90220f.C90221a) r1
            r1.mo124456c(r0)
        L_0x01a5:
            return
        L_0x01a6:
            r0 = move-exception
            java.lang.String r1 = "MicroMsg.AppBrandNetworkWebSocket"
            java.lang.String r2 = "Exception: connect fail"
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r2, r3)
            java.lang.String r0 = "url not well format"
            r1 = r13
            sl0.f$a r1 = (sl0.C90220f.C90221a) r1
            r1.mo124455b(r0)
            return
        L_0x01bb:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01bb }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sp0.C90311n.mo115342d(java.lang.String, java.lang.String, int, int, org.json.JSONObject, java.util.Map, com.tencent.mm.plugin.appbrand.jsapi.websocket.e$a):void");
    }

    /* renamed from: e */
    public boolean mo115343e(C83103f fVar) {
        if (fVar != null) {
            return fVar.isOpen();
        }
        return false;
    }

    /* renamed from: f */
    public void mo115344f(C83103f fVar, String str) {
        if (fVar != null) {
            fVar.mo115352b(str);
        }
    }

    /* renamed from: g */
    public void mo115345g(C83103f fVar) {
        if (fVar != null) {
            try {
                Log.m105924i("MicroMsg.AppBrandNetworkWebSocket", "try to close socket");
                fVar.close();
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.AppBrandNetworkWebSocket", e, "Exception: send error", new Object[0]);
                mo124547j(fVar);
            }
            mo124546i(fVar);
        }
    }

    /* renamed from: h */
    public final void mo124545h(C83103f fVar) {
        if (fVar != null) {
            synchronized (this.f259261a) {
                if ("0".equals(fVar.getTaskId())) {
                    this.f259261a.clear();
                }
                this.f259261a.add(fVar);
            }
        }
    }

    /* renamed from: i */
    public final synchronized void mo124546i(C83103f fVar) {
        if (fVar != null) {
            synchronized (this.f259261a) {
                this.f259261a.remove(fVar);
            }
        }
    }

    /* renamed from: j */
    public final void mo124547j(C83103f fVar) {
        if (fVar != null) {
            Timer f = fVar.mo115356f();
            Log.m105924i("MicroMsg.AppBrandNetworkWebSocket", "try to stop connectTimer");
            if (f != null) {
                f.cancel();
                fVar.mo115351a((Timer) null);
            }
        }
    }

    public void release() {
        mo115345g(mo115339a("0"));
    }
}
