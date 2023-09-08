package com.tencent.p014mm.plugin.appbrand.jsapi.websocket;

import com.tencent.p014mm.plugin.appbrand.jsapi.websocket.C83101e;
import com.tencent.p014mm.plugin.appbrand.jsapi.websocket.C83103f;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import sl0.C90220f;
import sp0.C90272a;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.websocket.a */
public class C83094a implements C83101e {

    /* renamed from: b */
    public final String f242876b;

    /* renamed from: c */
    public int f242877c;

    /* renamed from: d */
    public C90272a f242878d;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.websocket.a$a */
    public class C83095a implements C83103f.C83104a {

        /* renamed from: a */
        public final /* synthetic */ String f242879a;

        /* renamed from: b */
        public final /* synthetic */ C83103f f242880b;

        /* renamed from: c */
        public final /* synthetic */ C83101e.C83102a f242881c;

        /* renamed from: d */
        public final /* synthetic */ String f242882d;

        public C83095a(String str, C83103f fVar, C83101e.C83102a aVar, String str2) {
            this.f242879a = str;
            this.f242880b = fVar;
            this.f242881c = aVar;
            this.f242882d = str2;
        }

        /* renamed from: a */
        public void mo115349a(String str) {
            Log.m105921e("MicroMsg.AppBrandNetworkWcWssSocket", "onSocketError url is %s ,error is %s,taskId=%s", this.f242882d, str, this.f242879a);
            C83094a.this.mo115347i(this.f242880b);
            C83094a.this.mo115346h(this.f242880b);
            C83101e.C83102a aVar = this.f242881c;
            ((C90220f.C90221a) aVar).mo124456c("exception " + str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.websocket.a$b */
    public class C83096b extends TimerTask {

        /* renamed from: d */
        public final /* synthetic */ C83103f f242884d;

        /* renamed from: e */
        public final /* synthetic */ C83101e.C83102a f242885e;

        /* renamed from: f */
        public final /* synthetic */ Timer f242886f;

        public C83096b(C83103f fVar, C83101e.C83102a aVar, Timer timer) {
            this.f242884d = fVar;
            this.f242885e = aVar;
            this.f242886f = timer;
        }

        public void run() {
            Log.m105921e("MicroMsg.AppBrandNetworkWcWssSocket", "connect response time out taskid:%s", this.f242884d.getTaskId());
            ((C90220f.C90221a) this.f242885e).mo124456c("connect response time out");
            this.f242884d.close();
            C83094a.this.mo115346h(this.f242884d);
            cancel();
            this.f242886f.cancel();
        }
    }

    public C83094a(C90272a aVar) {
        this.f242876b = aVar.f259120B;
        this.f242877c = aVar.f259134n;
        this.f242878d = aVar;
    }

    /* renamed from: a */
    public C83103f mo115339a(String str) {
        if (str == null) {
            return null;
        }
        ArrayList<C83103f> arrayList = C83101e.f242909a;
        synchronized (arrayList) {
            Iterator<C83103f> it = arrayList.iterator();
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
                Log.m105925i("MicroMsg.AppBrandNetworkWcWssSocket", "try to close socket code:%d,reason:%s", Integer.valueOf(i), str);
                fVar.mo115355d(str, i);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.AppBrandNetworkWcWssSocket", e, "send error Exception", new Object[0]);
            }
            mo115346h(fVar);
        }
    }

    /* renamed from: c */
    public void mo115341c(C83103f fVar, ByteBuffer byteBuffer) {
        if (fVar != null) {
            fVar.mo115353c(byteBuffer);
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r11 = new java.net.URI(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004a, code lost:
        r19 = r1.optBoolean("tcpNoDelay", false);
        r22 = r1.optBoolean("perMessageDeflate", false);
        r2.put("User-Agent", r7.f242876b);
        r1 = sp0.C90309m.m113090y(r28);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0067, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r1) != false) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0069, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.AppBrandNetworkWcWssSocket", "protocols %s", r1);
        r2.put("Sec-WebSocket-Protocol", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007a, code lost:
        r1 = sp0.C90309m.m113075j(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0082, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r1) != false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0084, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.AppBrandNetworkWcWssSocket", "Origin %s", r1);
        r2.put("Origin", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0094, code lost:
        r20 = p225rc.C89925n.m112490c(r4, "ws://");
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.AppBrandNetworkWcWssSocket", "connectSocket, taskId=%s, url= %s, appType = %d, timeout = %d, tcpNoDelay = %b, skipDimain = %b, perMessageDeflate = %b", r0, r4, java.lang.Integer.valueOf(r26), java.lang.Integer.valueOf(r27), java.lang.Boolean.valueOf(r19), java.lang.Boolean.valueOf(r20), java.lang.Boolean.valueOf(r22));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00f3, code lost:
        r9 = 1;
        r1 = r1;
        r10 = 0;
        r11 = new com.tencent.p014mm.plugin.appbrand.jsapi.websocket.C83098c(r24, r4, r11, r29, new com.tencent.p014mm.plugin.appbrand.jsapi.websocket.WssConfig(r27, r27, r19, r20, r26, r22), new java.util.ArrayList(), r7.f242878d);
        r12 = r4;
        r13 = r5;
        r14 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r1 = new com.tencent.p014mm.plugin.appbrand.jsapi.websocket.C83094a.C83095a(r23, r25, r11, r30, r12);
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.AppBrandWcWssSocket", "setCallBack");
        r11.f242900r = r1;
        r11.f242901s = new com.tencent.p014mm.plugin.appbrand.jsapi.websocket.C83097b(r11);
        r11.f242896n = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x011f, code lost:
        if (p225rc.C89925n.m112490c(r12, "ws://") != false) goto L_0x0142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0128, code lost:
        if (p225rc.C89925n.m112490c(r12, "wss://") == false) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x012b, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105929w("MicroMsg.AppBrandNetworkWcWssSocket", "url error: %s not ws:// or wss://", r12);
        ((sl0.C90220f.C90221a) r14).mo124455b("url not ws or wss");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0142, code lost:
        r0 = new java.util.Timer("AppWcSocket");
        r1 = new com.tencent.p014mm.plugin.appbrand.jsapi.websocket.C83094a.C83096b(r7, r11, r14, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x014e, code lost:
        monitor-enter(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0157, code lost:
        if ("0".equals(r11.f242896n) == false) goto L_0x015c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0159, code lost:
        r13.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x015c, code lost:
        r13.add(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x015f, code lost:
        monitor-exit(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r11.f242898p = r0;
        r0.schedule(r1, (long) r27);
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.AppBrandWcWssSocket", "connect");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0171, code lost:
        if (r11.f242892g != null) goto L_0x017e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0173, code lost:
        ((com.tencent.p014mm.plugin.appbrand.jsapi.websocket.C83094a.C83095a) r11.f242900r).mo115349a("header is null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x017e, code lost:
        r15 = r11.f242901s;
        r1 = r11.f242889d;
        r2 = r11.f242890e;
        r16 = r1;
        r17 = r2;
        r1 = com.tencent.p014mm.plugin.appbrand.jsapi.websocket.WcWss.m101898a(r15, r16, r17, r11.f242893h.toArray(), r11.f242894i.toArray(), (java.lang.Object[]) null, r11.f242895j, r11.f242899q.toArray());
        r11.f242897o = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x01a6, code lost:
        if (r1 >= 0) goto L_0x01c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01a8, code lost:
        r1 = r11.f242900r;
        ((com.tencent.p014mm.plugin.appbrand.jsapi.websocket.C83094a.C83095a) r1).mo115349a("call connect fail code:" + r11.f242897o);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01c3, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01c5, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.AppBrandWcWssSocket", "connect mWcWssId:%s", java.lang.Integer.valueOf(r11.f242897o));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01d8, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01d9, code lost:
        r12 = r4;
        r14 = r6;
        r9 = 1;
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01dd, code lost:
        r3 = new java.lang.Object[r9];
        r3[r10] = r12;
        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace("MicroMsg.AppBrandNetworkWcWssSocket", r0, "Exception: url %s", r3);
        ((sl0.C90220f.C90221a) r14).mo124456c(r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01f3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01f4, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace("MicroMsg.AppBrandNetworkWcWssSocket", r0, "connect fail Exception", new java.lang.Object[0]);
        ((sl0.C90220f.C90221a) r6).mo124455b("url not well format");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0208, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x020d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003e, code lost:
        r4 = r1.optString("url");
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo115342d(java.lang.String r24, java.lang.String r25, int r26, int r27, org.json.JSONObject r28, java.util.Map<java.lang.String, java.lang.String> r29, com.tencent.p014mm.plugin.appbrand.jsapi.websocket.C83101e.C83102a r30) {
        /*
            r23 = this;
            r7 = r23
            r0 = r25
            r1 = r28
            r2 = r29
            r6 = r30
            java.util.ArrayList<com.tencent.mm.plugin.appbrand.jsapi.websocket.f> r5 = com.tencent.p014mm.plugin.appbrand.jsapi.websocket.C83101e.f242909a
            monitor-enter(r5)
            int r3 = r5.size()     // Catch:{ all -> 0x0209 }
            int r4 = r7.f242877c     // Catch:{ all -> 0x0209 }
            r8 = 2
            r15 = 1
            r14 = 0
            if (r3 < r4) goto L_0x003d
            java.lang.String r0 = "max connected"
            r1 = r6
            sl0.f$a r1 = (sl0.C90220f.C90221a) r1     // Catch:{ all -> 0x0209 }
            r1.mo124455b(r0)     // Catch:{ all -> 0x0209 }
            java.lang.String r0 = "MicroMsg.AppBrandNetworkWcWssSocket"
            java.lang.String r1 = "max connected mTaskList.size():%d,mMaxWebsocketConnect:%d"
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{ all -> 0x0209 }
            int r3 = r5.size()     // Catch:{ all -> 0x0209 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0209 }
            r2[r14] = r3     // Catch:{ all -> 0x0209 }
            int r3 = r7.f242877c     // Catch:{ all -> 0x0209 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0209 }
            r2[r15] = r3     // Catch:{ all -> 0x0209 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r2)     // Catch:{ all -> 0x0209 }
            monitor-exit(r5)     // Catch:{ all -> 0x0209 }
            return
        L_0x003d:
            monitor-exit(r5)     // Catch:{ all -> 0x0209 }
            java.lang.String r3 = "url"
            java.lang.String r4 = r1.optString(r3)
            java.net.URI r11 = new java.net.URI     // Catch:{ Exception -> 0x01f3 }
            r11.<init>(r4)     // Catch:{ Exception -> 0x01f3 }
            java.lang.String r3 = "tcpNoDelay"
            boolean r19 = r1.optBoolean(r3, r14)
            java.lang.String r3 = "perMessageDeflate"
            boolean r22 = r1.optBoolean(r3, r14)
            java.lang.String r3 = "User-Agent"
            java.lang.String r9 = r7.f242876b
            r2.put(r3, r9)
            java.lang.String r1 = sp0.C90309m.m113090y(r28)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r3 != 0) goto L_0x007a
            java.lang.String r3 = "MicroMsg.AppBrandNetworkWcWssSocket"
            java.lang.String r9 = "protocols %s"
            java.lang.Object[] r10 = new java.lang.Object[r15]
            r10[r14] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r9, r10)
            java.lang.String r3 = "Sec-WebSocket-Protocol"
            r2.put(r3, r1)
        L_0x007a:
            java.lang.String r1 = sp0.C90309m.m113075j(r11)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r3 != 0) goto L_0x0094
            java.lang.String r3 = "MicroMsg.AppBrandNetworkWcWssSocket"
            java.lang.String r9 = "Origin %s"
            java.lang.Object[] r10 = new java.lang.Object[r15]
            r10[r14] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r9, r10)
            java.lang.String r3 = "Origin"
            r2.put(r3, r1)
        L_0x0094:
            java.lang.String r1 = "ws://"
            boolean r20 = p225rc.C89925n.m112490c(r4, r1)
            java.lang.String r1 = "MicroMsg.AppBrandNetworkWcWssSocket"
            java.lang.String r3 = "connectSocket, taskId=%s, url= %s, appType = %d, timeout = %d, tcpNoDelay = %b, skipDimain = %b, perMessageDeflate = %b"
            r9 = 7
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r9[r14] = r0
            r9[r15] = r4
            java.lang.Integer r10 = java.lang.Integer.valueOf(r26)
            r9[r8] = r10
            r8 = 3
            java.lang.Integer r10 = java.lang.Integer.valueOf(r27)
            r9[r8] = r10
            r8 = 4
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r19)
            r9[r8] = r10
            r8 = 5
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r20)
            r9[r8] = r10
            r8 = 6
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r22)
            r9[r8] = r10
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r9)
            com.tencent.mm.plugin.appbrand.jsapi.websocket.WssConfig r13 = new com.tencent.mm.plugin.appbrand.jsapi.websocket.WssConfig     // Catch:{ Exception -> 0x01d8 }
            r16 = r13
            r17 = r27
            r18 = r27
            r21 = r26
            r16.<init>(r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x01d8 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x01d8 }
            r1.<init>()     // Catch:{ Exception -> 0x01d8 }
            com.tencent.mm.plugin.appbrand.jsapi.websocket.c r3 = new com.tencent.mm.plugin.appbrand.jsapi.websocket.c     // Catch:{ Exception -> 0x01d8 }
            sp0.a r12 = r7.f242878d     // Catch:{ Exception -> 0x01d8 }
            r8 = r3
            r9 = r24
            r10 = r4
            r16 = r12
            r12 = r29
            r2 = 0
            r14 = r1
            r1 = 1
            r15 = r16
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x01d8 }
            com.tencent.mm.plugin.appbrand.jsapi.websocket.a$a r8 = new com.tencent.mm.plugin.appbrand.jsapi.websocket.a$a     // Catch:{ Exception -> 0x01d8 }
            r9 = 1
            r1 = r8
            r10 = 0
            r2 = r23
            r11 = r3
            r3 = r25
            r12 = r4
            r4 = r11
            r13 = r5
            r5 = r30
            r14 = r6
            r6 = r12
            r1.<init>(r3, r4, r5, r6)     // Catch:{ Exception -> 0x01c3 }
            java.lang.String r1 = "MicroMsg.AppBrandWcWssSocket"
            java.lang.String r2 = "setCallBack"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ Exception -> 0x01c3 }
            r11.f242900r = r8     // Catch:{ Exception -> 0x01c3 }
            com.tencent.mm.plugin.appbrand.jsapi.websocket.b r1 = new com.tencent.mm.plugin.appbrand.jsapi.websocket.b     // Catch:{ Exception -> 0x01c3 }
            r1.<init>(r11)     // Catch:{ Exception -> 0x01c3 }
            r11.f242901s = r1     // Catch:{ Exception -> 0x01c3 }
            r11.f242896n = r0     // Catch:{ Exception -> 0x01c3 }
            java.lang.String r0 = "ws://"
            boolean r0 = p225rc.C89925n.m112490c(r12, r0)     // Catch:{ Exception -> 0x01c3 }
            if (r0 != 0) goto L_0x0142
            java.lang.String r0 = "wss://"
            boolean r0 = p225rc.C89925n.m112490c(r12, r0)     // Catch:{ Exception -> 0x01c3 }
            if (r0 == 0) goto L_0x012b
            goto L_0x0142
        L_0x012b:
            java.lang.String r0 = "MicroMsg.AppBrandNetworkWcWssSocket"
            java.lang.String r1 = "url error: %s not ws:// or wss://"
            java.lang.Object[] r2 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x01c3 }
            r2[r10] = r12     // Catch:{ Exception -> 0x01c3 }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r1, r2)     // Catch:{ Exception -> 0x01c3 }
            java.lang.String r0 = "url not ws or wss"
            r1 = r14
            sl0.f$a r1 = (sl0.C90220f.C90221a) r1     // Catch:{ Exception -> 0x01c3 }
            r1.mo124455b(r0)     // Catch:{ Exception -> 0x01c3 }
            goto L_0x01f2
        L_0x0142:
            java.util.Timer r0 = new java.util.Timer     // Catch:{ Exception -> 0x01c3 }
            java.lang.String r1 = "AppWcSocket"
            r0.<init>(r1)     // Catch:{ Exception -> 0x01c3 }
            com.tencent.mm.plugin.appbrand.jsapi.websocket.a$b r1 = new com.tencent.mm.plugin.appbrand.jsapi.websocket.a$b     // Catch:{ Exception -> 0x01c3 }
            r1.<init>(r11, r14, r0)     // Catch:{ Exception -> 0x01c3 }
            monitor-enter(r13)     // Catch:{ Exception -> 0x01c3 }
            java.lang.String r2 = "0"
            java.lang.String r3 = r11.f242896n     // Catch:{ all -> 0x01d5 }
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x01d5 }
            if (r2 == 0) goto L_0x015c
            r13.clear()     // Catch:{ all -> 0x01d5 }
        L_0x015c:
            r13.add(r11)     // Catch:{ all -> 0x01d5 }
            monitor-exit(r13)     // Catch:{ all -> 0x01d5 }
            r11.f242898p = r0     // Catch:{ Exception -> 0x01c3 }
            r2 = r27
            long r2 = (long) r2     // Catch:{ Exception -> 0x01c3 }
            r0.schedule(r1, r2)     // Catch:{ Exception -> 0x01c3 }
            java.lang.String r0 = "MicroMsg.AppBrandWcWssSocket"
            java.lang.String r1 = "connect"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ Exception -> 0x01c3 }
            java.util.Map<java.lang.String, java.lang.String> r1 = r11.f242892g     // Catch:{ Exception -> 0x01c3 }
            if (r1 != 0) goto L_0x017e
            com.tencent.mm.plugin.appbrand.jsapi.websocket.f$a r0 = r11.f242900r     // Catch:{ Exception -> 0x01c3 }
            com.tencent.mm.plugin.appbrand.jsapi.websocket.a$a r0 = (com.tencent.p014mm.plugin.appbrand.jsapi.websocket.C83094a.C83095a) r0     // Catch:{ Exception -> 0x01c3 }
            java.lang.String r1 = "header is null"
            r0.mo115349a(r1)     // Catch:{ Exception -> 0x01c3 }
            goto L_0x01f2
        L_0x017e:
            com.tencent.mm.plugin.appbrand.jsapi.websocket.WcWss$a r15 = r11.f242901s     // Catch:{ Exception -> 0x01c3 }
            java.lang.String r1 = r11.f242889d     // Catch:{ Exception -> 0x01c3 }
            java.lang.String r2 = r11.f242890e     // Catch:{ Exception -> 0x01c3 }
            java.util.ArrayList r3 = r11.f242893h     // Catch:{ Exception -> 0x01c3 }
            java.lang.Object[] r18 = r3.toArray()     // Catch:{ Exception -> 0x01c3 }
            java.util.ArrayList r3 = r11.f242894i     // Catch:{ Exception -> 0x01c3 }
            java.lang.Object[] r19 = r3.toArray()     // Catch:{ Exception -> 0x01c3 }
            r20 = 0
            com.tencent.mm.plugin.appbrand.jsapi.websocket.WssConfig r3 = r11.f242895j     // Catch:{ Exception -> 0x01c3 }
            java.util.ArrayList<java.lang.String> r4 = r11.f242899q     // Catch:{ Exception -> 0x01c3 }
            java.lang.Object[] r22 = r4.toArray()     // Catch:{ Exception -> 0x01c3 }
            r16 = r1
            r17 = r2
            r21 = r3
            int r1 = com.tencent.p014mm.plugin.appbrand.jsapi.websocket.WcWss.m101898a(r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x01c3 }
            r11.f242897o = r1     // Catch:{ Exception -> 0x01c3 }
            if (r1 >= 0) goto L_0x01c5
            com.tencent.mm.plugin.appbrand.jsapi.websocket.f$a r1 = r11.f242900r     // Catch:{ Exception -> 0x01c3 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01c3 }
            r2.<init>()     // Catch:{ Exception -> 0x01c3 }
            java.lang.String r3 = "call connect fail code:"
            r2.append(r3)     // Catch:{ Exception -> 0x01c3 }
            int r3 = r11.f242897o     // Catch:{ Exception -> 0x01c3 }
            r2.append(r3)     // Catch:{ Exception -> 0x01c3 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x01c3 }
            com.tencent.mm.plugin.appbrand.jsapi.websocket.a$a r1 = (com.tencent.p014mm.plugin.appbrand.jsapi.websocket.C83094a.C83095a) r1     // Catch:{ Exception -> 0x01c3 }
            r1.mo115349a(r2)     // Catch:{ Exception -> 0x01c3 }
            goto L_0x01c5
        L_0x01c3:
            r0 = move-exception
            goto L_0x01dd
        L_0x01c5:
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x01c3 }
            int r2 = r11.f242897o     // Catch:{ Exception -> 0x01c3 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x01c3 }
            r1[r10] = r2     // Catch:{ Exception -> 0x01c3 }
            java.lang.String r2 = "connect mWcWssId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r2, r1)     // Catch:{ Exception -> 0x01c3 }
            goto L_0x01f2
        L_0x01d5:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x01d5 }
            throw r0     // Catch:{ Exception -> 0x01c3 }
        L_0x01d8:
            r0 = move-exception
            r12 = r4
            r14 = r6
            r9 = 1
            r10 = 0
        L_0x01dd:
            java.lang.String r1 = "MicroMsg.AppBrandNetworkWcWssSocket"
            java.lang.String r2 = "Exception: url %s"
            java.lang.Object[] r3 = new java.lang.Object[r9]
            r3[r10] = r12
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r2, r3)
            java.lang.String r0 = r0.getMessage()
            r1 = r14
            sl0.f$a r1 = (sl0.C90220f.C90221a) r1
            r1.mo124456c(r0)
        L_0x01f2:
            return
        L_0x01f3:
            r0 = move-exception
            r14 = r6
            r10 = 0
            java.lang.String r1 = "MicroMsg.AppBrandNetworkWcWssSocket"
            java.lang.String r2 = "connect fail Exception"
            java.lang.Object[] r3 = new java.lang.Object[r10]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r2, r3)
            java.lang.String r0 = "url not well format"
            r1 = r14
            sl0.f$a r1 = (sl0.C90220f.C90221a) r1
            r1.mo124455b(r0)
            return
        L_0x0209:
            r0 = move-exception
            r13 = r5
        L_0x020b:
            monitor-exit(r13)     // Catch:{ all -> 0x020d }
            throw r0
        L_0x020d:
            r0 = move-exception
            goto L_0x020b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.websocket.C83094a.mo115342d(java.lang.String, java.lang.String, int, int, org.json.JSONObject, java.util.Map, com.tencent.mm.plugin.appbrand.jsapi.websocket.e$a):void");
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
                Log.m105924i("MicroMsg.AppBrandNetworkWcWssSocket", "try to close socket");
                fVar.close();
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.AppBrandNetworkWcWssSocket", e, "send error Exception", new Object[0]);
                mo115347i(fVar);
            }
            mo115346h(fVar);
        }
    }

    /* renamed from: h */
    public final synchronized void mo115346h(C83103f fVar) {
        if (fVar != null) {
            ArrayList<C83103f> arrayList = C83101e.f242909a;
            synchronized (arrayList) {
                arrayList.remove(fVar);
            }
        }
    }

    /* renamed from: i */
    public final void mo115347i(C83103f fVar) {
        if (fVar != null) {
            Timer f = fVar.mo115356f();
            Log.m105924i("MicroMsg.AppBrandNetworkWcWssSocket", "try to stop connectTimer");
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
