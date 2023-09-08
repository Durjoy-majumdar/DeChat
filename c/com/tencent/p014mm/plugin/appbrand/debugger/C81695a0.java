package com.tencent.p014mm.plugin.appbrand.debugger;

import android.webkit.ValueCallback;
import com.eclipsesource.mmv8.V8Inspector;
import com.tencent.p014mm.plugin.appbrand.utils.C84751i1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.LruCache;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.Future;
import te3.ax4;
import te3.ix4;
import te3.jw4;
import te3.jx4;
import te3.kx4;
import te3.lw4;
import te3.mw4;
import us0.C90729a;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.a0 */
public class C81695a0 {

    /* renamed from: k */
    public static final Map<String, String[]> f239776k;

    /* renamed from: a */
    public C81735g0 f239777a;

    /* renamed from: b */
    public C81743t f239778b;

    /* renamed from: c */
    public C68600m0 f239779c;

    /* renamed from: d */
    public LruCache<Integer, Long> f239780d = new LruCache<>(100);

    /* renamed from: e */
    public boolean f239781e = false;

    /* renamed from: f */
    public long f239782f;

    /* renamed from: g */
    public LinkedList<C81750x> f239783g = new LinkedList<>();

    /* renamed from: h */
    public int f239784h = 0;

    /* renamed from: i */
    public long f239785i = 0;

    /* renamed from: j */
    public Future<?> f239786j;

    /* renamed from: com.tencent.mm.plugin.appbrand.debugger.a0$a */
    public class C81696a implements V8Inspector.JsInspectorChannelServer {
        public C81696a() {
        }

        public int notify(long j, long j2, String str) {
            return 0;
        }

        public int sendData(long j, String str) {
            C81695a0 a0Var = C81695a0.this;
            a0Var.getClass();
            Log.m105919d("MicroMsg.RemoteDebugMsgMrg", "onDevToolsResult op_id:%d, payload:%s", Long.valueOf(j), str);
            jw4 jw4 = new jw4();
            jw4.f136362d = j;
            jw4.f136363e = str;
            a0Var.mo114052h(C81738h0.m100298d(jw4, a0Var.f239778b, "chromeDevtoolsResult"));
            return 0;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.debugger.a0$b */
    public class C81697b implements Runnable {
        public C81697b() {
        }

        public void run() {
            C81695a0 a0Var;
            LinkedList linkedList = new LinkedList();
            synchronized (C81695a0.this.f239778b.f239899u) {
                linkedList.addAll(C81695a0.this.f239783g);
                C81695a0.this.f239783g.clear();
                a0Var = C81695a0.this;
                a0Var.f239781e = false;
            }
            synchronized (a0Var) {
                a0Var.mo114053i(linkedList, true, false);
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f239776k = hashMap;
        hashMap.put("publishHandler", new String[]{"String", "String", "String"});
        hashMap.put("invokeHandler", new String[]{"String", "String", "Number"});
    }

    public C81695a0() {
        V8Inspector.setServer(new C81696a());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        r1 = (int) (16 - (java.lang.System.currentTimeMillis() - r8.f239778b.f239887i));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        if (r1 <= 0) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
        r1 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
        r0 = com.tencent.p014mm.plugin.appbrand.utils.C84737f0.f247137a;
        js0.C88024r.m109571a().mo122468a(new com.tencent.p014mm.plugin.appbrand.debugger.C81695a0.C81697b(r8), (long) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004a, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo114045a() {
        /*
            r8 = this;
            long r0 = java.lang.System.currentTimeMillis()
            com.tencent.mm.plugin.appbrand.debugger.t r2 = r8.f239778b
            java.lang.Object r2 = r2.f239899u
            monitor-enter(r2)
            boolean r3 = r8.f239781e     // Catch:{ all -> 0x004b }
            if (r3 == 0) goto L_0x0019
            long r3 = r8.f239782f     // Catch:{ all -> 0x004b }
            long r3 = r0 - r3
            r5 = 32
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x0019
            monitor-exit(r2)     // Catch:{ all -> 0x004b }
            return
        L_0x0019:
            r8.f239782f = r0     // Catch:{ all -> 0x004b }
            java.util.LinkedList<com.tencent.mm.plugin.appbrand.debugger.x> r0 = r8.f239783g     // Catch:{ all -> 0x004b }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r0)     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x0025
            monitor-exit(r2)     // Catch:{ all -> 0x004b }
            return
        L_0x0025:
            r0 = 1
            r8.f239781e = r0     // Catch:{ all -> 0x004b }
            monitor-exit(r2)     // Catch:{ all -> 0x004b }
            r0 = 16
            long r2 = java.lang.System.currentTimeMillis()
            com.tencent.mm.plugin.appbrand.debugger.t r4 = r8.f239778b
            long r4 = r4.f239887i
            long r2 = r2 - r4
            long r0 = r0 - r2
            int r1 = (int) r0
            if (r1 <= 0) goto L_0x0039
            goto L_0x003b
        L_0x0039:
            r1 = 16
        L_0x003b:
            java.util.Set<java.lang.Object> r0 = com.tencent.p014mm.plugin.appbrand.utils.C84737f0.f247137a
            js0.r$a r0 = js0.C88024r.m109571a()
            com.tencent.mm.plugin.appbrand.debugger.a0$b r2 = new com.tencent.mm.plugin.appbrand.debugger.a0$b
            r2.<init>()
            long r3 = (long) r1
            r0.mo122468a(r2, r3)
            return
        L_0x004b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x004b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.debugger.C81695a0.mo114045a():void");
    }

    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r4v1, types: [android.webkit.ValueCallback, int[]] */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r6v1, types: [boolean, int] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0489  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0490  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0500  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo114046b(java.util.LinkedList<te3.mw4> r20) {
        /*
            r19 = this;
            r1 = r19
            r2 = r20
            java.lang.Class<hr0.b> r3 = hr0.C87584b.class
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r20)
            if (r0 == 0) goto L_0x0014
            java.lang.String r0 = "MicroMsg.RemoteDebugMsgMrg"
            java.lang.String r2 = "handleMsg list is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r2)
            return
        L_0x0014:
            monitor-enter(r19)
            r4 = 0
            r5 = 0
            r6 = 1
            if (r2 != 0) goto L_0x001e
            monitor-exit(r19)
            r0 = r4
            goto L_0x0091
        L_0x001e:
            java.util.LinkedList r0 = new java.util.LinkedList     // Catch:{ all -> 0x059f }
            r0.<init>()     // Catch:{ all -> 0x059f }
            java.util.LinkedList r7 = new java.util.LinkedList     // Catch:{ all -> 0x059f }
            r7.<init>()     // Catch:{ all -> 0x059f }
            com.tencent.mm.plugin.appbrand.debugger.t r8 = r1.f239778b     // Catch:{ all -> 0x059f }
            java.util.LinkedList<te3.mw4> r8 = r8.f239897s     // Catch:{ all -> 0x059f }
            r8.addAll(r2)     // Catch:{ all -> 0x059f }
            com.tencent.mm.plugin.appbrand.debugger.t r8 = r1.f239778b     // Catch:{ all -> 0x059f }
            java.util.LinkedList<te3.mw4> r8 = r8.f239897s     // Catch:{ all -> 0x059f }
            com.tencent.mm.plugin.appbrand.debugger.b0 r9 = new com.tencent.mm.plugin.appbrand.debugger.b0     // Catch:{ all -> 0x059f }
            r9.<init>(r1)     // Catch:{ all -> 0x059f }
            java.util.Collections.sort(r8, r9)     // Catch:{ all -> 0x059f }
            com.tencent.mm.plugin.appbrand.debugger.t r8 = r1.f239778b     // Catch:{ all -> 0x059f }
            int r8 = r8.mo114109a()     // Catch:{ all -> 0x059f }
            com.tencent.mm.plugin.appbrand.debugger.t r9 = r1.f239778b     // Catch:{ all -> 0x059f }
            java.util.LinkedList<te3.mw4> r9 = r9.f239897s     // Catch:{ all -> 0x059f }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x059f }
        L_0x0049:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x059f }
            if (r10 == 0) goto L_0x0069
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x059f }
            te3.mw4 r10 = (te3.mw4) r10     // Catch:{ all -> 0x059f }
            if (r10 != 0) goto L_0x0058
            goto L_0x0049
        L_0x0058:
            int r11 = r10.f138252d     // Catch:{ all -> 0x059f }
            if (r11 > r8) goto L_0x0060
            r7.add(r10)     // Catch:{ all -> 0x059f }
            goto L_0x0049
        L_0x0060:
            int r11 = r11 - r8
            if (r11 != r6) goto L_0x0069
            r0.add(r10)     // Catch:{ all -> 0x059f }
            int r8 = r10.f138252d     // Catch:{ all -> 0x059f }
            goto L_0x0049
        L_0x0069:
            com.tencent.mm.plugin.appbrand.debugger.t r9 = r1.f239778b     // Catch:{ all -> 0x059f }
            monitor-enter(r9)     // Catch:{ all -> 0x059f }
            r9.f239882d = r8     // Catch:{ all -> 0x059b }
            monitor-exit(r9)     // Catch:{ all -> 0x059f }
            com.tencent.mm.plugin.appbrand.debugger.t r8 = r1.f239778b     // Catch:{ all -> 0x059f }
            java.util.LinkedList<te3.mw4> r8 = r8.f239897s     // Catch:{ all -> 0x059f }
            r8.removeAll(r0)     // Catch:{ all -> 0x059f }
            com.tencent.mm.plugin.appbrand.debugger.t r8 = r1.f239778b     // Catch:{ all -> 0x059f }
            java.util.LinkedList<te3.mw4> r8 = r8.f239897s     // Catch:{ all -> 0x059f }
            r8.removeAll(r7)     // Catch:{ all -> 0x059f }
            java.lang.String r7 = "MicroMsg.RemoteDebugMsgMrg"
            java.lang.String r8 = "getHandleMsgList size: %d"
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ all -> 0x059f }
            int r10 = r0.size()     // Catch:{ all -> 0x059f }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x059f }
            r9[r5] = r10     // Catch:{ all -> 0x059f }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r8, r9)     // Catch:{ all -> 0x059f }
            monitor-exit(r19)
        L_0x0091:
            java.util.Iterator r7 = r0.iterator()
        L_0x0095:
            boolean r0 = r7.hasNext()
            r8 = 2
            if (r0 == 0) goto L_0x052a
            java.lang.Object r0 = r7.next()
            te3.mw4 r0 = (te3.mw4) r0
            int r9 = r0.f138256h
            r9 = r9 & r6
            if (r9 == 0) goto L_0x00a9
            r9 = 1
            goto L_0x00aa
        L_0x00a9:
            r9 = 0
        L_0x00aa:
            if (r9 == 0) goto L_0x00b5
            pe3.b r9 = r0.f138255g
            byte[] r9 = r9.f257327a
            byte[] r9 = p823sg.C90197s.m112891c(r9)
            goto L_0x00b9
        L_0x00b5:
            pe3.b r9 = r0.f138255g
            byte[] r9 = r9.f257327a
        L_0x00b9:
            java.lang.String r0 = r0.f138254f
            r0.getClass()
            int r10 = r0.hashCode()
            r13 = 3
            switch(r10) {
                case -1680221061: goto L_0x010a;
                case -217209181: goto L_0x00ff;
                case 3441010: goto L_0x00f3;
                case 52537216: goto L_0x00e8;
                case 95766211: goto L_0x00dd;
                case 1319027697: goto L_0x00d2;
                case 1972337494: goto L_0x00c7;
                default: goto L_0x00c6;
            }
        L_0x00c6:
            goto L_0x0115
        L_0x00c7:
            java.lang.String r10 = "customMessage"
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x00d0
            goto L_0x0115
        L_0x00d0:
            r0 = 6
            goto L_0x0116
        L_0x00d2:
            java.lang.String r10 = "breakpoint"
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x00db
            goto L_0x0115
        L_0x00db:
            r0 = 5
            goto L_0x0116
        L_0x00dd:
            java.lang.String r10 = "domOp"
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x00e6
            goto L_0x0115
        L_0x00e6:
            r0 = 4
            goto L_0x0116
        L_0x00e8:
            java.lang.String r10 = "chromeDevtools"
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x00f1
            goto L_0x0115
        L_0x00f1:
            r0 = 3
            goto L_0x0116
        L_0x00f3:
            java.lang.String r10 = "ping"
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x00fd
            goto L_0x0115
        L_0x00fd:
            r0 = 2
            goto L_0x0116
        L_0x00ff:
            java.lang.String r10 = "evaluateJavascriptResult"
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x0108
            goto L_0x0115
        L_0x0108:
            r0 = 1
            goto L_0x0116
        L_0x010a:
            java.lang.String r10 = "callInterface"
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x0113
            goto L_0x0115
        L_0x0113:
            r0 = 0
            goto L_0x0116
        L_0x0115:
            r0 = -1
        L_0x0116:
            r10 = 8
            switch(r0) {
                case 0: goto L_0x0334;
                case 1: goto L_0x027a;
                case 2: goto L_0x0243;
                case 3: goto L_0x021a;
                case 4: goto L_0x01bb;
                case 5: goto L_0x016e;
                case 6: goto L_0x011f;
                default: goto L_0x011b;
            }
        L_0x011b:
            r18 = r7
            goto L_0x0521
        L_0x011f:
            te3.kw4 r0 = new te3.kw4
            r0.<init>()
            pe3.a r0 = r0.parseFrom(r9)
            te3.kw4 r0 = (te3.kw4) r0
            java.lang.Object[] r8 = new java.lang.Object[r8]
            java.lang.String r9 = r0.f183992d
            r8[r5] = r9
            java.lang.String r9 = r0.f183993e
            r8[r6] = r9
            java.lang.String r9 = "MicroMsg.RemoteDebugMsgMrg"
            java.lang.String r10 = "onCustomMsg method:%s, payload:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r10, r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "typeof DebuggerConnection.onCustomMessage === 'function' && DebuggerConnection.onCustomMessage('"
            r8.append(r9)
            java.lang.String r9 = r0.f183992d
            r8.append(r9)
            java.lang.String r9 = "', '"
            r8.append(r9)
            java.lang.String r0 = r0.f183993e
            java.lang.String r0 = com.tencent.p014mm.plugin.appbrand.utils.C84751i1.m104412a(r0)
            r8.append(r0)
            java.lang.String r0 = "')"
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            com.tencent.mm.plugin.appbrand.debugger.t r8 = r1.f239778b
            zb.f r8 = r8.f239879a
            com.tencent.mm.plugin.appbrand.jsruntime.i r8 = r8.getJsRuntime()
            r8.evaluateJavascript(r0, r4)
            goto L_0x011b
        L_0x016e:
            te3.fw4 r0 = new te3.fw4
            r0.<init>()
            pe3.a r0 = r0.parseFrom(r9)
            te3.fw4 r0 = (te3.fw4) r0
            com.tencent.mm.plugin.appbrand.debugger.t r8 = r1.f239778b
            monitor-enter(r8)
            boolean r9 = r8.f239893o     // Catch:{ all -> 0x01b7 }
            monitor-exit(r8)
            boolean r0 = r0.f133719d
            if (r9 != r0) goto L_0x0184
            goto L_0x011b
        L_0x0184:
            if (r0 == 0) goto L_0x0191
            com.tencent.mm.plugin.appbrand.debugger.t r8 = r1.f239778b
            monitor-enter(r8)
            r8.f239893o = r6     // Catch:{ all -> 0x018d }
            monitor-exit(r8)
            goto L_0x0197
        L_0x018d:
            r0 = move-exception
            r2 = r0
            monitor-exit(r8)
            throw r2
        L_0x0191:
            com.tencent.mm.plugin.appbrand.debugger.t r8 = r1.f239778b
            monitor-enter(r8)
            r8.f239893o = r5     // Catch:{ all -> 0x01b3 }
            monitor-exit(r8)
        L_0x0197:
            com.tencent.mm.plugin.appbrand.debugger.m0 r0 = r1.f239779c
            r0.getClass()
            com.tencent.mm.plugin.appbrand.debugger.l0 r8 = new com.tencent.mm.plugin.appbrand.debugger.l0
            r8.<init>(r0)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r8)
            com.tencent.mm.plugin.appbrand.debugger.m0 r0 = r1.f239779c
            r0.getClass()
            com.tencent.mm.plugin.appbrand.debugger.n0 r8 = new com.tencent.mm.plugin.appbrand.debugger.n0
            r8.<init>(r0)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r8)
            goto L_0x011b
        L_0x01b3:
            r0 = move-exception
            r2 = r0
            monitor-exit(r8)
            throw r2
        L_0x01b7:
            r0 = move-exception
            r2 = r0
            monitor-exit(r8)
            throw r2
        L_0x01bb:
            te3.pw4 r0 = new te3.pw4
            r0.<init>()
            pe3.a r0 = r0.parseFrom(r9)
            te3.pw4 r0 = (te3.pw4) r0
            java.lang.Object[] r9 = new java.lang.Object[r6]
            java.lang.String r10 = r0.f140035d
            r9[r5] = r10
            java.lang.String r10 = "MicroMsg.RemoteDebugMsgMrg"
            java.lang.String r11 = "onDomOp, param:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r11, r9)
            com.tencent.mm.plugin.appbrand.debugger.t r9 = r1.f239778b
            zb.f r9 = r9.f239879a
            fc.g r9 = r9.getRuntime()
            cc.a r9 = r9.mo113042Z()
            com.tencent.mm.plugin.appbrand.page.i0 r9 = r9.getCurrentPage()
            com.tencent.mm.plugin.appbrand.page.d1 r9 = r9.getCurrentPageView()
            int r9 = r9.getComponentId()
            int r11 = r0.f140036e
            if (r11 == r9) goto L_0x020c
            com.tencent.mm.plugin.appbrand.debugger.t r12 = r1.f239778b
            com.tencent.mm.plugin.appbrand.debugger.u r12 = r12.f239885g
            int r12 = r12.f239909g
            if (r12 == r6) goto L_0x020c
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r11)
            r0[r5] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
            r0[r6] = r8
            java.lang.String r8 = "onDomOp id not current webViewId %d/%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r10, r8, r0)
            goto L_0x011b
        L_0x020c:
            com.tencent.mm.plugin.appbrand.debugger.t r8 = r1.f239778b
            zb.f r8 = r8.f239879a
            java.lang.String r0 = r0.f140035d
            java.lang.String r9 = "remoteDebugCommand"
            r8.mo109651e(r9, r0, r4)
            goto L_0x011b
        L_0x021a:
            te3.iw4 r0 = new te3.iw4
            r0.<init>()
            pe3.a r0 = r0.parseFrom(r9)
            te3.iw4 r0 = (te3.iw4) r0
            java.lang.Object[] r8 = new java.lang.Object[r8]
            long r9 = r0.f135729d
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r8[r5] = r9
            java.lang.String r9 = r0.f135730e
            r8[r6] = r9
            java.lang.String r9 = "MicroMsg.RemoteDebugMsgMrg"
            java.lang.String r10 = "onDevTools op_id:%d, payload:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r10, r8)
            long r8 = r0.f135729d
            java.lang.String r0 = r0.f135730e
            com.eclipsesource.mmv8.V8Inspector.onReceiveData(r8, r0)
            goto L_0x011b
        L_0x0243:
            te3.vw4 r0 = new te3.vw4
            r0.<init>()
            pe3.a r0 = r0.parseFrom(r9)
            te3.vw4 r0 = (te3.vw4) r0
            te3.ww4 r8 = new te3.ww4
            r8.<init>()
            long r9 = r0.f143754d
            r8.f144328d = r9
            int r0 = com.tencent.p014mm.plugin.appbrand.debugger.C81730d0.m100271a()
            r8.f144329e = r0
            java.lang.Object[] r9 = new java.lang.Object[r6]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9[r5] = r0
            java.lang.String r0 = "MicroMsg.RemoteDebugMsgMrg"
            java.lang.String r10 = "onPing netType %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r10, r9)
            com.tencent.mm.plugin.appbrand.debugger.t r0 = r1.f239778b
            java.lang.String r9 = "pong"
            com.tencent.mm.plugin.appbrand.debugger.x r0 = com.tencent.p014mm.plugin.appbrand.debugger.C81738h0.m100298d(r8, r0, r9)
            r1.mo114052h(r0)
            goto L_0x011b
        L_0x027a:
            te3.rw4 r0 = new te3.rw4
            r0.<init>()
            pe3.a r0 = r0.parseFrom(r9)
            te3.rw4 r0 = (te3.rw4) r0
            java.lang.Object[] r9 = new java.lang.Object[r6]
            int r4 = r0.f141192e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r9[r5] = r4
            java.lang.String r4 = "MicroMsg.RemoteDebugMsgMrg"
            java.lang.String r15 = "onEvaluateCallback %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r15, r9)
            int r9 = r0.f141192e
            java.lang.String r15 = r0.f141191d
            com.tencent.mm.plugin.appbrand.debugger.t r11 = r1.f239778b
            java.util.HashMap<java.lang.Integer, com.tencent.mm.plugin.appbrand.debugger.b> r11 = r11.f239898t
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            java.lang.Object r11 = r11.remove(r12)
            com.tencent.mm.plugin.appbrand.debugger.b r11 = (com.tencent.p014mm.plugin.appbrand.debugger.C81698b) r11
            if (r11 != 0) goto L_0x02ac
            goto L_0x011b
        L_0x02ac:
            android.webkit.ValueCallback<java.lang.String> r12 = r11.f239789a
            if (r12 == 0) goto L_0x02b3
            r12.onReceiveValue(r15)
        L_0x02b3:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r14 = "onEvaluateCallback, callback id: "
            r12.append(r14)
            r12.append(r9)
            java.lang.String r9 = " ret: "
            r12.append(r9)
            r12.append(r15)
            java.lang.String r9 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r9)
            int r0 = r0.computeSize()
            long r14 = java.lang.System.currentTimeMillis()
            long r8 = r11.f239790b
            long r14 = r14 - r8
            int r8 = (int) r14
            ra.d r9 = p224ra.C89909e.m112439d(r3, r6)
            hr0.b r9 = (hr0.C87584b) r9
            java.lang.Object[] r10 = new java.lang.Object[r10]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r10[r5] = r8
            int r8 = r11.f239792d
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r10[r6] = r8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4 = 2
            r10[r4] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r10[r13] = r0
            java.lang.String r0 = ""
            r4 = 4
            r10[r4] = r0
            java.lang.String r0 = r11.f239791c
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            r4 = 5
            r10[r4] = r0
            int r0 = com.tencent.p014mm.plugin.appbrand.debugger.C81730d0.f239851a
            if (r0 < 0) goto L_0x0311
            goto L_0x031b
        L_0x0311:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r0 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.getISPCode(r0)
            com.tencent.p014mm.plugin.appbrand.debugger.C81730d0.f239851a = r0
        L_0x031b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4 = 6
            r10[r4] = r0
            int r0 = com.tencent.p014mm.plugin.appbrand.debugger.C81730d0.m100271a()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4 = 7
            r10[r4] = r0
            r4 = 15190(0x3b56, float:2.1286E-41)
            r9.mo121691h(r4, r10)
            goto L_0x011b
        L_0x0334:
            te3.gw4 r0 = new te3.gw4
            r0.<init>()
            pe3.a r0 = r0.parseFrom(r9)
            r8 = r0
            te3.gw4 r8 = (te3.gw4) r8
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r4 = 2
            java.lang.Object[] r9 = new java.lang.Object[r4]
            java.lang.String r11 = r8.f134334e
            r9[r5] = r11
            int r11 = r8.f134336g
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r9[r6] = r11
            java.lang.String r11 = "MicroMsg.RemoteDebugMsgMrg"
            java.lang.String r12 = "onCallInterface, method: %s, call_id %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r12, r9)
            java.lang.String r9 = r8.f134334e
            java.util.LinkedList<java.lang.String> r12 = r8.f134335f
            java.util.Map<java.lang.String, java.lang.String[]> r14 = f239776k
            java.util.HashMap r14 = (java.util.HashMap) r14
            boolean r15 = r14.containsKey(r9)
            if (r15 != 0) goto L_0x036d
            java.lang.String r0 = "onCallInterface, methodWithArgs is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r0)
            goto L_0x011b
        L_0x036d:
            java.lang.Object r14 = r14.get(r9)
            java.lang.String[] r14 = (java.lang.String[]) r14
            int r15 = r12.size()
            int r4 = r14.length
            if (r15 >= r4) goto L_0x0381
            java.lang.String r0 = "onCallInterface, methodArgValueList.size() < methodArgList.size()"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r0)
            goto L_0x011b
        L_0x0381:
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            r4 = 0
        L_0x0387:
            int r10 = r14.length
            if (r4 >= r10) goto L_0x03c9
            r10 = r14[r4]
            java.lang.String r6 = "Number"
            boolean r6 = r6.equals(r10)
            if (r6 == 0) goto L_0x03a6
            java.lang.Object r6 = r12.get(r4)
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r6, (int) r5)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r15.add(r6)
            goto L_0x03c5
        L_0x03a6:
            r6 = r14[r4]
            java.lang.String r10 = "Boolean"
            boolean r6 = r10.equals(r6)
            if (r6 == 0) goto L_0x03be
            java.lang.Object r6 = r12.get(r4)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r15.add(r6)
            goto L_0x03c5
        L_0x03be:
            java.lang.Object r6 = r12.get(r4)
            r15.add(r6)
        L_0x03c5:
            int r4 = r4 + 1
            r6 = 1
            goto L_0x0387
        L_0x03c9:
            long r16 = java.lang.System.currentTimeMillis()
            r9.getClass()
            java.lang.String r6 = "publishHandler"
            boolean r4 = r9.equals(r6)
            java.lang.String r10 = "invokeHandler"
            java.lang.String r14 = ""
            if (r4 != 0) goto L_0x0430
            boolean r4 = r9.equals(r10)
            if (r4 != 0) goto L_0x03ea
            java.lang.String r0 = "onCallInterface callMethod is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r0)
            goto L_0x011b
        L_0x03ea:
            int r4 = r15.size()
            r11 = 4
            if (r4 < r11) goto L_0x03fd
            java.lang.Object r4 = r15.get(r13)
            java.lang.Object r4 = r0.cast(r4)
            java.lang.String r4 = (java.lang.String) r4
            r11 = r4
            goto L_0x03fe
        L_0x03fd:
            r11 = r14
        L_0x03fe:
            com.tencent.mm.plugin.appbrand.debugger.t r4 = r1.f239778b
            zb.f r4 = r4.f239879a
            java.lang.Object r13 = r15.get(r5)
            java.lang.Object r13 = r0.cast(r13)
            java.lang.String r13 = (java.lang.String) r13
            r5 = 1
            java.lang.Object r2 = r15.get(r5)
            java.lang.Object r0 = r0.cast(r2)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            r5 = 2
            java.lang.Object r15 = r15.get(r5)
            r5 = r4
            java.lang.Object r2 = r2.cast(r15)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.String r0 = r5.mo114844O(r13, r0, r11, r2)
            r18 = r7
            goto L_0x0486
        L_0x0430:
            com.tencent.mm.plugin.appbrand.debugger.t r2 = r1.f239778b
            zb.f r2 = r2.f239879a
            r5 = 0
            java.lang.Object r13 = r15.get(r5)
            java.lang.Object r13 = r0.cast(r13)
            java.lang.String r13 = (java.lang.String) r13
            r4 = 1
            java.lang.Object r5 = r15.get(r4)
            java.lang.Object r4 = r0.cast(r5)
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            r4 = 2
            java.lang.Object r15 = r15.get(r4)
            java.lang.Object r0 = r0.cast(r15)
            java.lang.String r0 = (java.lang.String) r0
            r15 = 0
            int[] r4 = new int[r15]
            org.json.JSONArray r15 = new org.json.JSONArray     // Catch:{ Exception -> 0x0478 }
            r15.<init>(r0)     // Catch:{ Exception -> 0x0478 }
            int r0 = r15.length()     // Catch:{ Exception -> 0x0478 }
            int[] r4 = new int[r0]     // Catch:{ Exception -> 0x0478 }
            r18 = r7
            r0 = 0
        L_0x0467:
            int r7 = r15.length()     // Catch:{ Exception -> 0x0476 }
            if (r0 >= r7) goto L_0x0482
            int r7 = r15.getInt(r0)     // Catch:{ Exception -> 0x0476 }
            r4[r0] = r7     // Catch:{ Exception -> 0x0476 }
            int r0 = r0 + 1
            goto L_0x0467
        L_0x0476:
            r0 = move-exception
            goto L_0x047b
        L_0x0478:
            r0 = move-exception
            r18 = r7
        L_0x047b:
            java.lang.String r0 = r0.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
        L_0x0482:
            r2.mo109651e(r13, r5, r4)
            r0 = 0
        L_0x0486:
            if (r0 == 0) goto L_0x0489
            goto L_0x048a
        L_0x0489:
            r0 = r14
        L_0x048a:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 != 0) goto L_0x04a6
            int r2 = r8.f134336g
            te3.hw4 r4 = new te3.hw4
            r4.<init>()
            r4.f183563e = r2
            r4.f183562d = r0
            com.tencent.mm.plugin.appbrand.debugger.t r2 = r1.f239778b
            java.lang.String r5 = "callInterfaceResult"
            com.tencent.mm.plugin.appbrand.debugger.x r2 = com.tencent.p014mm.plugin.appbrand.debugger.C81738h0.m100298d(r4, r2, r5)
            r1.mo114052h(r2)
        L_0x04a6:
            int r2 = r8.computeSize()
            int r0 = r0.length()
            boolean r4 = r9.equals(r10)
            if (r4 != 0) goto L_0x04ba
            boolean r4 = r9.equals(r6)
            if (r4 == 0) goto L_0x04c8
        L_0x04ba:
            int r4 = r12.size()
            if (r4 <= 0) goto L_0x04c8
            r4 = 0
            java.lang.Object r5 = r12.get(r4)
            r14 = r5
            java.lang.String r14 = (java.lang.String) r14
        L_0x04c8:
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r16
            int r5 = (int) r4
            r4 = 1
            ra.d r6 = p224ra.C89909e.m112439d(r3, r4)
            hr0.b r6 = (hr0.C87584b) r6
            r7 = 8
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r8 = 0
            r7[r8] = r5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r7[r4] = r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 2
            r7[r2] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r2 = 3
            r7[r2] = r0
            r2 = 4
            r7[r2] = r9
            r2 = 5
            r7[r2] = r14
            int r0 = com.tencent.p014mm.plugin.appbrand.debugger.C81730d0.f239851a
            if (r0 < 0) goto L_0x0500
            goto L_0x050a
        L_0x0500:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r0 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.getISPCode(r0)
            com.tencent.p014mm.plugin.appbrand.debugger.C81730d0.f239851a = r0
        L_0x050a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 6
            r7[r2] = r0
            int r0 = com.tencent.p014mm.plugin.appbrand.debugger.C81730d0.m100271a()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 7
            r7[r2] = r0
            r2 = 15190(0x3b56, float:2.1286E-41)
            r6.mo121691h(r2, r7)
        L_0x0521:
            r2 = r20
            r7 = r18
            r4 = 0
            r5 = 0
            r6 = 1
            goto L_0x0095
        L_0x052a:
            java.lang.String r0 = "MicroMsg.RemoteDebugMsgMrg"
            java.lang.String r2 = "handleMsg size %d, ack %d"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = r20.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 0
            r3[r5] = r4
            com.tencent.mm.plugin.appbrand.debugger.t r4 = r1.f239778b
            int r4 = r4.mo114109a()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6 = 1
            r3[r6] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r2, r3)
            com.tencent.mm.plugin.appbrand.debugger.t r0 = r1.f239778b
            int r2 = r20.size()
            long r3 = r0.f239901w
            long r6 = (long) r2
            long r3 = r3 + r6
            r0.f239901w = r3
            monitor-enter(r19)
        L_0x0559:
            com.tencent.mm.plugin.appbrand.debugger.t r0 = r1.f239778b     // Catch:{ all -> 0x0598 }
            java.util.LinkedList<te3.mw4> r0 = r0.f239897s     // Catch:{ all -> 0x0598 }
            int r0 = r0.size()     // Catch:{ all -> 0x0598 }
            if (r5 >= r0) goto L_0x0596
            if (r5 != 0) goto L_0x056c
            com.tencent.mm.plugin.appbrand.debugger.t r0 = r1.f239778b     // Catch:{ all -> 0x0598 }
            int r0 = r0.mo114109a()     // Catch:{ all -> 0x0598 }
            goto L_0x057a
        L_0x056c:
            com.tencent.mm.plugin.appbrand.debugger.t r0 = r1.f239778b     // Catch:{ all -> 0x0598 }
            java.util.LinkedList<te3.mw4> r0 = r0.f239897s     // Catch:{ all -> 0x0598 }
            int r2 = r5 + -1
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x0598 }
            te3.mw4 r0 = (te3.mw4) r0     // Catch:{ all -> 0x0598 }
            int r0 = r0.f138252d     // Catch:{ all -> 0x0598 }
        L_0x057a:
            com.tencent.mm.plugin.appbrand.debugger.t r2 = r1.f239778b     // Catch:{ all -> 0x0598 }
            java.util.LinkedList<te3.mw4> r2 = r2.f239897s     // Catch:{ all -> 0x0598 }
            java.lang.Object r2 = r2.get(r5)     // Catch:{ all -> 0x0598 }
            te3.mw4 r2 = (te3.mw4) r2     // Catch:{ all -> 0x0598 }
            int r2 = r2.f138252d     // Catch:{ all -> 0x0598 }
            int r3 = r0 - r2
            r4 = 1
            if (r3 != r4) goto L_0x058c
            goto L_0x0593
        L_0x058c:
            int r0 = r0 + 1
            int r2 = r2 + -1
            r1.mo114054j(r0, r2)     // Catch:{ all -> 0x0598 }
        L_0x0593:
            int r5 = r5 + 1
            goto L_0x0559
        L_0x0596:
            monitor-exit(r19)
            return
        L_0x0598:
            r0 = move-exception
            monitor-exit(r19)
            throw r0
        L_0x059b:
            r0 = move-exception
            r2 = r0
            monitor-exit(r9)     // Catch:{ all -> 0x059f }
            throw r2     // Catch:{ all -> 0x059f }
        L_0x059f:
            r0 = move-exception
            monitor-exit(r19)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.debugger.C81695a0.mo114046b(java.util.LinkedList):void");
    }

    /* renamed from: c */
    public void mo114047c(String str) {
        Log.m105919d("MicroMsg.RemoteDebugMsgMrg", "onReceiveNetworkHeader data:%s", str);
        this.f239778b.f239879a.getJsRuntime().evaluateJavascript("typeof DebuggerConnection.onReceiveNetworkHeader === 'function' && DebuggerConnection.onReceiveNetworkHeader('" + C84751i1.m104412a(str) + "')", (ValueCallback<String>) null);
    }

    /* renamed from: d */
    public void mo114048d(ax4 ax4, lw4 lw4) {
        if (C81738h0.m100296b(this.f239778b, lw4, ax4.f130837d, this.f239779c, this)) {
            Log.m105919d("MicroMsg.RemoteDebugMsgMrg", "onSendMsgResult %d/%d", Integer.valueOf(ax4.f130838e), Integer.valueOf(ax4.f130839f));
            C81743t tVar = this.f239778b;
            int i = ax4.f130838e;
            int i2 = ax4.f130839f;
            synchronized (tVar) {
                int i3 = tVar.f239883e;
                if (i3 >= i && i3 <= i2) {
                    tVar.f239883e = i2;
                }
            }
            int i4 = ax4.f130838e;
            int i5 = ax4.f130839f;
            synchronized (this) {
                Log.m105918d("MicroMsg.RemoteDebugMsgMrg", "removeSendingMsg with min max");
                LinkedList linkedList = new LinkedList();
                Iterator<C81750x> it = this.f239778b.f239895q.iterator();
                while (it.hasNext()) {
                    C81750x next = it.next();
                    mw4 mw4 = next.f239924b;
                    if (mw4 == null) {
                        linkedList.add(next);
                    } else {
                        int i6 = mw4.f138252d;
                        if (i6 >= i4 && i6 <= i5) {
                            linkedList.add(next);
                        }
                    }
                }
                this.f239778b.f239895q.removeAll(linkedList);
            }
        }
    }

    /* renamed from: e */
    public void mo114049e(kx4 kx4, lw4 lw4) {
        int i;
        Log.m105918d("MicroMsg.RemoteDebugMsgMrg", "onSync");
        if (C81738h0.m100296b(this.f239778b, lw4, kx4.f137085d, this.f239779c, this)) {
            mo114046b(kx4.f137086e);
            C81743t tVar = this.f239778b;
            int i2 = kx4.f137087f;
            synchronized (tVar) {
                if (tVar.f239883e < i2) {
                    tVar.f239883e = i2;
                }
            }
            synchronized (this) {
                Log.m105918d("MicroMsg.RemoteDebugMsgMrg", "removeSendingMsg");
                LinkedList linkedList = new LinkedList();
                Iterator<C81750x> it = this.f239778b.f239895q.iterator();
                while (it.hasNext()) {
                    C81750x next = it.next();
                    mw4 mw4 = next.f239924b;
                    if (mw4 == null) {
                        linkedList.add(next);
                    } else {
                        int i3 = mw4.f138252d;
                        C81743t tVar2 = this.f239778b;
                        synchronized (tVar2) {
                            i = tVar2.f239883e;
                        }
                        if (i3 <= i) {
                            linkedList.add(next);
                        }
                    }
                }
                this.f239778b.f239895q.removeAll(linkedList);
            }
        }
    }

    /* renamed from: f */
    public void mo114050f() {
        Log.m105924i("MicroMsg.RemoteDebugMsgMrg", "quit");
        ix4 ix4 = new ix4();
        ix4.f135738d = this.f239778b.f239880b;
        this.f239777a.mo114101b(C81738h0.m100295a(1004, ix4));
    }

    /* renamed from: g */
    public final void mo114051g() {
        this.f239778b.mo114113e(4);
        C90729a aVar = this.f239777a.f239865a;
        if (aVar == null) {
            Log.m105928w("MicroMsg.RemoteDebugSocket", "client is null");
            return;
        }
        aVar.f260591f.mo124713a(1000, "quit", false);
        Log.m105919d("MicroMsg.RemoteDebugSocket", "closeSocket code %d, reason %s", 1000, "quit");
    }

    /* renamed from: h */
    public void mo114052h(C81750x xVar) {
        C81743t tVar = this.f239778b;
        if (!(tVar.f239885g.f239905c == 3)) {
            synchronized (tVar.f239899u) {
                if (System.currentTimeMillis() - this.f239778b.f239887i > 16) {
                    if (this.f239781e) {
                    }
                }
                this.f239783g.add(xVar);
                mo114045a();
                return;
            }
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(xVar);
        synchronized (this) {
            mo114053i(linkedList, true, false);
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: i */
    public final synchronized void mo114053i(java.util.LinkedList<com.tencent.p014mm.plugin.appbrand.debugger.C81750x> r6, boolean r7, boolean r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r6)     // Catch:{ all -> 0x00c0 }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r5)
            return
        L_0x0009:
            te3.zw4 r0 = new te3.zw4     // Catch:{ all -> 0x00c0 }
            r0.<init>()     // Catch:{ all -> 0x00c0 }
            com.tencent.mm.plugin.appbrand.debugger.t r1 = r5.f239778b     // Catch:{ all -> 0x00c0 }
            te3.dw4 r2 = r1.f239880b     // Catch:{ all -> 0x00c0 }
            r0.f146262d = r2     // Catch:{ all -> 0x00c0 }
            int r1 = r1.mo114109a()     // Catch:{ all -> 0x00c0 }
            r0.f146264f = r1     // Catch:{ all -> 0x00c0 }
            java.util.Iterator r1 = r6.iterator()     // Catch:{ all -> 0x00c0 }
        L_0x001e:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00c0 }
            if (r2 == 0) goto L_0x0032
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00c0 }
            com.tencent.mm.plugin.appbrand.debugger.x r2 = (com.tencent.p014mm.plugin.appbrand.debugger.C81750x) r2     // Catch:{ all -> 0x00c0 }
            java.util.LinkedList<te3.mw4> r3 = r0.f146263e     // Catch:{ all -> 0x00c0 }
            te3.mw4 r2 = r2.f239924b     // Catch:{ all -> 0x00c0 }
            r3.add(r2)     // Catch:{ all -> 0x00c0 }
            goto L_0x001e
        L_0x0032:
            r1 = 1006(0x3ee, float:1.41E-42)
            te3.lw4 r0 = com.tencent.p014mm.plugin.appbrand.debugger.C81738h0.m100295a(r1, r0)     // Catch:{ all -> 0x00c0 }
            com.tencent.mm.plugin.appbrand.debugger.t r1 = r5.f239778b     // Catch:{ all -> 0x00c0 }
            boolean r1 = r1.mo114111c()     // Catch:{ all -> 0x00c0 }
            r2 = 0
            if (r1 == 0) goto L_0x004d
            if (r8 == 0) goto L_0x0044
            goto L_0x004d
        L_0x0044:
            java.lang.String r8 = "MicroMsg.RemoteDebugMsgMrg"
            java.lang.String r1 = "sendMsg busy"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r1)     // Catch:{ all -> 0x00c0 }
            goto L_0x0067
        L_0x004d:
            java.lang.String r8 = "MicroMsg.RemoteDebugMsgMrg"
            java.lang.String r1 = "sendMsg size %d"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x00c0 }
            int r4 = r6.size()     // Catch:{ all -> 0x00c0 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x00c0 }
            r3[r2] = r4     // Catch:{ all -> 0x00c0 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r1, r3)     // Catch:{ all -> 0x00c0 }
            com.tencent.mm.plugin.appbrand.debugger.g0 r8 = r5.f239777a     // Catch:{ all -> 0x00c0 }
            r8.mo114101b(r0)     // Catch:{ all -> 0x00c0 }
        L_0x0067:
            if (r7 == 0) goto L_0x0085
            monitor-enter(r5)     // Catch:{ all -> 0x00c0 }
            java.lang.String r7 = "MicroMsg.RemoteDebugMsgMrg"
            java.lang.String r8 = "addToSendingMsg"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r8)     // Catch:{ all -> 0x0082 }
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r6)     // Catch:{ all -> 0x0082 }
            if (r7 == 0) goto L_0x0079
            monitor-exit(r5)     // Catch:{ all -> 0x00c0 }
            goto L_0x0085
        L_0x0079:
            com.tencent.mm.plugin.appbrand.debugger.t r7 = r5.f239778b     // Catch:{ all -> 0x0082 }
            java.util.LinkedList<com.tencent.mm.plugin.appbrand.debugger.x> r7 = r7.f239895q     // Catch:{ all -> 0x0082 }
            r7.addAll(r6)     // Catch:{ all -> 0x0082 }
            monitor-exit(r5)     // Catch:{ all -> 0x00c0 }
            goto L_0x0085
        L_0x0082:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00c0 }
            throw r6     // Catch:{ all -> 0x00c0 }
        L_0x0085:
            com.tencent.mm.plugin.appbrand.debugger.m0 r6 = r5.f239779c     // Catch:{ all -> 0x00c0 }
            r6.getClass()     // Catch:{ all -> 0x00c0 }
            com.tencent.mm.plugin.appbrand.debugger.t r6 = r5.f239778b     // Catch:{ all -> 0x00c0 }
            r6.getClass()     // Catch:{ all -> 0x00c0 }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00c0 }
            r6.f239887i = r7     // Catch:{ all -> 0x00c0 }
            r6.mo114114f()     // Catch:{ all -> 0x00c0 }
            com.tencent.mm.plugin.appbrand.debugger.t r6 = r5.f239778b     // Catch:{ all -> 0x00c0 }
            boolean r6 = r6.mo114111c()     // Catch:{ all -> 0x00c0 }
            if (r6 != 0) goto L_0x00a2
            r5.f239784h = r2     // Catch:{ all -> 0x00c0 }
        L_0x00a2:
            com.tencent.mm.plugin.appbrand.debugger.s r6 = new com.tencent.mm.plugin.appbrand.debugger.s     // Catch:{ all -> 0x00c0 }
            r6.<init>()     // Catch:{ all -> 0x00c0 }
            int r7 = r0.computeSize()     // Catch:{ all -> 0x00c0 }
            r6.f239877a = r7     // Catch:{ all -> 0x00c0 }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00c0 }
            r6.f239878b = r7     // Catch:{ all -> 0x00c0 }
            com.tencent.mm.plugin.appbrand.debugger.t r7 = r5.f239778b     // Catch:{ all -> 0x00c0 }
            java.util.Map<java.lang.String, com.tencent.mm.plugin.appbrand.debugger.s> r7 = r7.f239896r     // Catch:{ all -> 0x00c0 }
            java.lang.String r8 = r0.f184164e     // Catch:{ all -> 0x00c0 }
            java.util.HashMap r7 = (java.util.HashMap) r7     // Catch:{ all -> 0x00c0 }
            r7.put(r8, r6)     // Catch:{ all -> 0x00c0 }
            monitor-exit(r5)
            return
        L_0x00c0:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.debugger.C81695a0.mo114053i(java.util.LinkedList, boolean, boolean):void");
    }

    /* renamed from: j */
    public void mo114054j(int i, int i2) {
        Log.m105925i("MicroMsg.RemoteDebugMsgMrg", "sync minSeq %d, maxSeq %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i <= i2) {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f239780d.get(Integer.valueOf(i)) == null || currentTimeMillis - this.f239780d.get(Integer.valueOf(i)).longValue() >= 3000) {
                this.f239780d.put(Integer.valueOf(i), Long.valueOf(currentTimeMillis));
                jx4 jx4 = new jx4();
                jx4.f136372d = this.f239778b.f239880b;
                jx4.f136373e = i;
                jx4.f136374f = i2;
                this.f239777a.mo114101b(C81738h0.m100295a(1005, jx4));
                C81743t tVar = this.f239778b;
                tVar.getClass();
                tVar.f239890l = System.currentTimeMillis();
                return;
            }
            Log.m105924i("MicroMsg.RemoteDebugMsgMrg", "sync too fast!");
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: k */
    public synchronized void mo114055k() {
        /*
            r13 = this;
            monitor-enter(r13)
            com.tencent.mm.plugin.appbrand.debugger.t r0 = r13.f239778b     // Catch:{ all -> 0x0096 }
            boolean r0 = r0.mo114111c()     // Catch:{ all -> 0x0096 }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r13)
            return
        L_0x000b:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0096 }
            java.util.LinkedList r2 = new java.util.LinkedList     // Catch:{ all -> 0x0096 }
            r2.<init>()     // Catch:{ all -> 0x0096 }
            com.tencent.mm.plugin.appbrand.debugger.t r3 = r13.f239778b     // Catch:{ all -> 0x0096 }
            java.util.LinkedList<com.tencent.mm.plugin.appbrand.debugger.x> r3 = r3.f239895q     // Catch:{ all -> 0x0096 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0096 }
            r4 = 0
            r5 = 0
        L_0x001e:
            boolean r6 = r3.hasNext()     // Catch:{ all -> 0x0096 }
            r7 = 1
            if (r6 == 0) goto L_0x0071
            java.lang.Object r6 = r3.next()     // Catch:{ all -> 0x0096 }
            com.tencent.mm.plugin.appbrand.debugger.x r6 = (com.tencent.p014mm.plugin.appbrand.debugger.C81750x) r6     // Catch:{ all -> 0x0096 }
            long r8 = r6.f239923a     // Catch:{ all -> 0x0096 }
            long r8 = r0 - r8
            r10 = 5000(0x1388, double:2.4703E-320)
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 <= 0) goto L_0x001e
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0096 }
            r6.f239923a = r8     // Catch:{ all -> 0x0096 }
            r2.add(r6)     // Catch:{ all -> 0x0096 }
            int r6 = r6.f239925c     // Catch:{ all -> 0x0096 }
            int r5 = r5 + r6
            long r8 = (long) r5     // Catch:{ all -> 0x0096 }
            r10 = 65536(0x10000, double:3.2379E-319)
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 >= 0) goto L_0x0051
            int r6 = r2.size()     // Catch:{ all -> 0x0096 }
            r8 = 800(0x320, float:1.121E-42)
            if (r6 <= r8) goto L_0x001e
        L_0x0051:
            java.lang.String r0 = "MicroMsg.RemoteDebugMsgMrg"
            java.lang.String r1 = "try2ReSendMsg size %d"
            java.lang.Object[] r3 = new java.lang.Object[r7]     // Catch:{ all -> 0x0096 }
            int r5 = r2.size()     // Catch:{ all -> 0x0096 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0096 }
            r3[r4] = r5     // Catch:{ all -> 0x0096 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r3)     // Catch:{ all -> 0x0096 }
            monitor-enter(r13)     // Catch:{ all -> 0x0096 }
            r13.mo114053i(r2, r4, r4)     // Catch:{ all -> 0x006e }
            monitor-exit(r13)     // Catch:{ all -> 0x0096 }
            r2.clear()     // Catch:{ all -> 0x0096 }
            goto L_0x0071
        L_0x006e:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0096 }
            throw r0     // Catch:{ all -> 0x0096 }
        L_0x0071:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r2)     // Catch:{ all -> 0x0096 }
            if (r0 != 0) goto L_0x0094
            java.lang.String r0 = "MicroMsg.RemoteDebugMsgMrg"
            java.lang.String r1 = "try2ReSendMsg size %d"
            java.lang.Object[] r3 = new java.lang.Object[r7]     // Catch:{ all -> 0x0096 }
            int r5 = r2.size()     // Catch:{ all -> 0x0096 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0096 }
            r3[r4] = r5     // Catch:{ all -> 0x0096 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r3)     // Catch:{ all -> 0x0096 }
            monitor-enter(r13)     // Catch:{ all -> 0x0096 }
            r13.mo114053i(r2, r4, r4)     // Catch:{ all -> 0x0091 }
            monitor-exit(r13)     // Catch:{ all -> 0x0096 }
            goto L_0x0094
        L_0x0091:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0096 }
            throw r0     // Catch:{ all -> 0x0096 }
        L_0x0094:
            monitor-exit(r13)
            return
        L_0x0096:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.debugger.C81695a0.mo114055k():void");
    }
}
