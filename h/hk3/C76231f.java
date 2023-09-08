package hk3;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import ck3.C67391b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import hk3.C76227e;
import java.util.concurrent.atomic.AtomicBoolean;
import wk3.C78606a;

/* renamed from: hk3.f */
public class C76231f implements C76227e {

    /* renamed from: a */
    public final MMHandler f223319a;

    /* renamed from: b */
    public AtomicBoolean f223320b = new AtomicBoolean(false);

    /* renamed from: c */
    public final Handler f223321c = new C76232a(Looper.getMainLooper());

    /* renamed from: d */
    public C76235g f223322d;

    /* renamed from: e */
    public C76226d f223323e;

    /* renamed from: hk3.f$a */
    public class C76232a extends Handler {
        public C76232a(Looper looper) {
            super(looper);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:55:0x014d, code lost:
            if ((r6 != null && com.tencent.p014mm.pluginsdk.p133ui.tools.C72924q1.m85520a(r6) == 0) == false) goto L_0x016b;
         */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0071  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void handleMessage(android.os.Message r14) {
            /*
                r13 = this;
                java.lang.ThreadLocal<java.lang.Boolean> r0 = ck3.C67394d.f193312a
                java.lang.ThreadLocal<java.lang.Boolean> r0 = ck3.C67394d.f193312a
                java.lang.Boolean r1 = java.lang.Boolean.TRUE
                r0.set(r1)
                java.lang.Object r2 = r14.obj
                hk3.e$d r2 = (hk3.C76227e.C76230d) r2
                java.util.concurrent.atomic.AtomicBoolean r3 = r2.f223315i
                boolean r3 = r3.get()
                java.lang.String r4 = "MicroMsg.ChattingLoader.ListDataLoader"
                if (r3 == 0) goto L_0x0022
                java.lang.String r14 = "[handleMessage] cancel update!!!"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r14)
                java.lang.Boolean r14 = java.lang.Boolean.FALSE
                r0.set(r14)
                return
            L_0x0022:
                int r14 = r14.what
                r3 = 1
                if (r14 == r3) goto L_0x0029
                goto L_0x017e
            L_0x0029:
                hk3.f r14 = hk3.C76231f.this
                hk3.g r14 = r14.f223322d
                hk3.e$a r5 = r2.f223308b
                hk3.c r14 = (hk3.C76224c) r14
                ck3.b r6 = r14.f223299b
                boolean r7 = r6.f193283g
                java.lang.String r8 = "MicroMsg.ChattingLoader.ChattingViewCallback"
                r9 = 2
                r10 = 0
                if (r7 != 0) goto L_0x0041
                java.lang.String r14 = "[onViewUpdate] this ChattingUI has been in background!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r14)
                goto L_0x006c
            L_0x0041:
                boolean r6 = r6.f193295s
                if (r6 != 0) goto L_0x006e
                java.lang.Object[] r6 = new java.lang.Object[r3]
                r6[r10] = r5
                java.lang.String r7 = "current ChattingUI lose focus! action=%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r8, r7, r6)
                ck3.b r14 = r14.f223299b
                r14.getClass()
                java.lang.Object[] r6 = new java.lang.Object[r9]
                r6[r10] = r1
                com.tencent.mm.sdk.platformtools.MMStack r1 = com.tencent.p014mm.sdk.platformtools.Util.getStack()
                r6[r3] = r1
                java.lang.String r1 = "MicroMsg.ChattingContext"
                java.lang.String r7 = "trace setNeedUpdateUI, needUpdateUI %s, trace %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r7, r6)
                r14.f193296t = r3
                java.util.concurrent.ConcurrentLinkedQueue<hk3.e$a> r14 = r14.f193299w
                r14.add(r5)
            L_0x006c:
                r14 = 0
                goto L_0x006f
            L_0x006e:
                r14 = 1
            L_0x006f:
                if (r14 == 0) goto L_0x016b
                hk3.f r1 = hk3.C76231f.this
                hk3.d r1 = r1.f223323e
                android.util.SparseArray r1 = r1.mo106476b(r2)
                r2.f223311e = r1
                hk3.f r1 = hk3.C76231f.this
                hk3.g r1 = r1.f223322d
                hk3.c r1 = (hk3.C76224c) r1
                ck3.b r5 = r1.f223299b
                r5.f193296t = r10
                hk3.e$a r6 = r2.f223308b
                hk3.e$a r7 = hk3.C76227e.C76228a.ACTION_POSITION
                if (r6 != r7) goto L_0x008d
                r6 = 1
                goto L_0x008e
            L_0x008d:
                r6 = 0
            L_0x008e:
                if (r6 == 0) goto L_0x00a1
                int r6 = com.tencent.p014mm.pluginsdk.p133ui.tools.ScrollControlListView.f212502i
                com.tencent.mm.ui.chatting.v3 r5 = r5.f193287k
                com.tencent.mm.ui.chatting.ChattingUIFragment r5 = (com.tencent.p014mm.p136ui.chatting.ChattingUIFragment) r5
                com.tencent.mm.pluginsdk.ui.tools.n0 r5 = r5.f215304v
                boolean r6 = r5 instanceof com.tencent.p014mm.pluginsdk.p133ui.tools.C72923q0
                if (r6 == 0) goto L_0x00a1
                com.tencent.mm.pluginsdk.ui.tools.q0 r5 = (com.tencent.p014mm.pluginsdk.p133ui.tools.C72923q0) r5
                r5.setHasControlMoveDown(r3)
            L_0x00a1:
                ck3.b r5 = r1.f223299b
                boolean r5 = r5.mo91581v()
                if (r5 == 0) goto L_0x00b5
                hk3.e$a r6 = r2.f223308b
                hk3.e$a r7 = hk3.C76227e.C76228a.ACTION_TOP
                if (r6 == r7) goto L_0x00b5
                hk3.e$a r7 = hk3.C76227e.C76228a.ACTION_BOTTOM
                if (r6 == r7) goto L_0x00b5
                r6 = 1
                goto L_0x00b6
            L_0x00b5:
                r6 = 0
            L_0x00b6:
                r7 = 4
                java.lang.Object[] r11 = new java.lang.Object[r7]
                java.lang.String r12 = r2.toString()
                r11[r10] = r12
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                r11[r3] = r5
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)
                r11[r9] = r5
                hk3.c$a r5 = r1.f223300c
                r12 = 3
                r11[r12] = r5
                java.lang.String r5 = "[onViewUpdate] result:%s, lastGap:%s, isAtBottom:%s, %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r5, r11)
                hk3.e$a r5 = r2.f223308b
                hk3.e$a r11 = hk3.C76227e.C76228a.ACTION_UPDATE
                if (r5 == r11) goto L_0x00eb
                com.tencent.mm.ui.chatting.view.MMChattingListView r5 = r1.f223298a
                android.view.View r11 = r5.f214888z
                android.view.ViewGroup r11 = (android.view.ViewGroup) r11
                r5.mo101738b(r11, r7)
                android.view.View r11 = r5.f214852A
                android.view.ViewGroup r11 = (android.view.ViewGroup) r11
                r5.mo101738b(r11, r7)
            L_0x00eb:
                ck3.b r5 = r1.f223299b
                java.lang.Class<zj3.y> r7 = zj3.C79391y.class
                com.tencent.mm.ui.chatting.manager.a r5 = r5.f193278b
                xi.d r5 = r5.mo102812a(r7)
                zj3.y r5 = (zj3.C79391y) r5
                r5.mo109370p1()
                hk3.c$a r5 = r1.f223300c
                if (r5 == 0) goto L_0x0103
                com.tencent.mm.ui.chatting.view.MMChattingListView r7 = r1.f223298a
                r5.mo106480a(r7, r2)
            L_0x0103:
                ck3.b r5 = r1.f223299b
                java.lang.Class<zj3.w> r7 = zj3.C79387w.class
                com.tencent.mm.ui.chatting.manager.a r5 = r5.f193278b
                xi.d r5 = r5.mo102812a(r7)
                zj3.w r5 = (zj3.C79387w) r5
                if (r5 == 0) goto L_0x011f
                com.tencent.mm.pluginsdk.ui.chat.ChatFooter r7 = r5.mo102193k1()
                if (r7 == 0) goto L_0x011f
                com.tencent.mm.pluginsdk.ui.chat.ChatFooter r5 = r5.mo102193k1()
                boolean r5 = r5.f211917p1
                if (r5 != 0) goto L_0x0121
            L_0x011f:
                if (r6 == 0) goto L_0x016b
            L_0x0121:
                java.lang.String r5 = "keyboard is shown! scroll to last"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r5)
                android.os.Bundle r5 = r2.f223307a
                if (r5 == 0) goto L_0x0131
                java.lang.String r6 = "SCENE"
                int r5 = r5.getInt(r6, r10)
                goto L_0x0132
            L_0x0131:
                r5 = 0
            L_0x0132:
                if (r5 != r12) goto L_0x0150
                ck3.b r6 = r1.f223299b
                r6.getClass()
                int r7 = com.tencent.p014mm.pluginsdk.p133ui.tools.ScrollControlListView.f212502i
                com.tencent.mm.ui.chatting.v3 r6 = r6.f193287k
                com.tencent.mm.ui.chatting.ChattingUIFragment r6 = (com.tencent.p014mm.p136ui.chatting.ChattingUIFragment) r6
                com.tencent.mm.pluginsdk.ui.tools.n0 r6 = r6.f215304v
                if (r6 != 0) goto L_0x0144
                goto L_0x014c
            L_0x0144:
                int r6 = com.tencent.p014mm.pluginsdk.p133ui.tools.C72924q1.m85520a(r6)
                if (r6 != 0) goto L_0x014c
                r6 = 1
                goto L_0x014d
            L_0x014c:
                r6 = 0
            L_0x014d:
                if (r6 != 0) goto L_0x0150
                goto L_0x016b
            L_0x0150:
                hk3.e$a r6 = r2.f223308b
                hk3.e$a r7 = hk3.C76227e.C76228a.ACTION_ENTER
                if (r6 == r7) goto L_0x015a
                if (r5 == r12) goto L_0x015a
                r5 = 1
                goto L_0x015b
            L_0x015a:
                r5 = 0
            L_0x015b:
                ck3.b r6 = r1.f223299b
                com.tencent.mm.ui.chatting.v3 r6 = r6.f193287k
                com.tencent.mm.ui.chatting.ChattingUIFragment r6 = (com.tencent.p014mm.p136ui.chatting.ChattingUIFragment) r6
                com.tencent.mm.pluginsdk.ui.tools.n0 r6 = r6.f215304v
                r6.setTranscriptMode(r10)
                ck3.b r1 = r1.f223299b
                r1.mo91542C(r3, r3, r5)
            L_0x016b:
                java.lang.Object[] r1 = new java.lang.Object[r9]
                java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
                r1[r10] = r14
                java.lang.String r14 = r2.toString()
                r1[r3] = r14
                java.lang.String r14 = "[handleMessage] UPDATE!!! isAvailableUpdate=%s result:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r14, r1)
            L_0x017e:
                java.lang.Boolean r14 = java.lang.Boolean.FALSE
                r0.set(r14)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: hk3.C76231f.C76232a.handleMessage(android.os.Message):void");
        }
    }

    /* renamed from: hk3.f$b */
    public class C76233b implements Runnable {

        /* renamed from: d */
        public C76227e.C76228a f223325d;

        /* renamed from: e */
        public boolean f223326e;

        /* renamed from: f */
        public C76227e.C76229c f223327f;

        /* renamed from: g */
        public AtomicBoolean f223328g;

        /* renamed from: hk3.f$b$a */
        public class C76234a implements C76227e.C32942b {

            /* renamed from: a */
            public final /* synthetic */ C76227e.C76230d f223330a;

            public C76234a(C76227e.C76230d dVar) {
                this.f223330a = dVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
                return;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void next() {
                /*
                    r7 = this;
                    hk3.f$b r0 = hk3.C76231f.C76233b.this
                    hk3.e$c r0 = r0.f223327f
                    hk3.e$d r1 = r7.f223330a
                    wk3.a$a r0 = (wk3.C78606a.C78607a) r0
                    wk3.a r2 = wk3.C78606a.this
                    int r3 = r1.f223312f
                    r2.getClass()
                    wk3.a r2 = wk3.C78606a.this
                    int r3 = r1.f223310d
                    r2.f230241d = r3
                    java.util.List<T> r2 = r1.f223309c
                    java.util.LinkedList r2 = (java.util.LinkedList) r2
                    int r2 = r2.size()
                    r3 = 0
                    if (r2 <= 0) goto L_0x005b
                    java.util.List<T> r2 = r1.f223309c
                    java.util.LinkedList r2 = (java.util.LinkedList) r2
                    java.lang.Object r2 = r2.get(r3)
                    com.tencent.mm.storage.f4 r2 = (com.tencent.p014mm.storage.C72963f4) r2
                    if (r2 == 0) goto L_0x0039
                    wk3.a r4 = wk3.C78606a.this
                    long r5 = r2.getCreateTime()
                    r4.f230242e = r5
                    wk3.a r2 = wk3.C78606a.this
                    r2.getClass()
                L_0x0039:
                    java.util.List<T> r1 = r1.f223309c
                    java.util.LinkedList r1 = (java.util.LinkedList) r1
                    int r2 = r1.size()
                    int r2 = r2 + -1
                    java.lang.Object r1 = r1.get(r2)
                    com.tencent.mm.storage.f4 r1 = (com.tencent.p014mm.storage.C72963f4) r1
                    if (r1 == 0) goto L_0x005b
                    wk3.a r2 = wk3.C78606a.this
                    long r4 = r1.getCreateTime()
                    r2.f230243f = r4
                    wk3.a r0 = wk3.C78606a.this
                    long r1 = r1.mo108772w2()
                    r0.f230244g = r1
                L_0x005b:
                    java.lang.String r0 = "MicroMsg.ChattingLoader.ListDataLoader"
                    java.lang.String r1 = "sendFinishMessage action:%s"
                    r2 = 1
                    java.lang.Object[] r4 = new java.lang.Object[r2]
                    hk3.f$b r5 = hk3.C76231f.C76233b.this
                    hk3.e$a r5 = r5.f223325d
                    r4[r3] = r5
                    com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r1, r4)
                    hk3.f$b r0 = hk3.C76231f.C76233b.this
                    hk3.e$d r1 = r7.f223330a
                    hk3.f r3 = hk3.C76231f.this
                    monitor-enter(r3)
                    java.util.concurrent.atomic.AtomicBoolean r4 = r0.f223328g     // Catch:{ all -> 0x00ab }
                    boolean r4 = r4.get()     // Catch:{ all -> 0x00ab }
                    if (r4 == 0) goto L_0x0083
                    java.lang.String r0 = "MicroMsg.ChattingLoader.ListDataLoader"
                    java.lang.String r1 = "has cancel!"
                    com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)     // Catch:{ all -> 0x00ab }
                    monitor-exit(r3)     // Catch:{ all -> 0x00ab }
                    goto L_0x00aa
                L_0x0083:
                    android.os.Message r4 = new android.os.Message     // Catch:{ all -> 0x00ab }
                    r4.<init>()     // Catch:{ all -> 0x00ab }
                    r4.what = r2     // Catch:{ all -> 0x00ab }
                    r4.obj = r1     // Catch:{ all -> 0x00ab }
                    boolean r1 = r0.f223326e     // Catch:{ all -> 0x00ab }
                    if (r1 == 0) goto L_0x00a2
                    android.os.Looper r1 = android.os.Looper.myLooper()     // Catch:{ all -> 0x00ab }
                    android.os.Looper r2 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x00ab }
                    if (r1 != r2) goto L_0x00a2
                    hk3.f r0 = hk3.C76231f.this     // Catch:{ all -> 0x00ab }
                    android.os.Handler r0 = r0.f223321c     // Catch:{ all -> 0x00ab }
                    r0.handleMessage(r4)     // Catch:{ all -> 0x00ab }
                    goto L_0x00a9
                L_0x00a2:
                    hk3.f r0 = hk3.C76231f.this     // Catch:{ all -> 0x00ab }
                    android.os.Handler r0 = r0.f223321c     // Catch:{ all -> 0x00ab }
                    r0.sendMessage(r4)     // Catch:{ all -> 0x00ab }
                L_0x00a9:
                    monitor-exit(r3)     // Catch:{ all -> 0x00ab }
                L_0x00aa:
                    return
                L_0x00ab:
                    r0 = move-exception
                    monitor-exit(r3)     // Catch:{ all -> 0x00ab }
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: hk3.C76231f.C76233b.C76234a.next():void");
            }
        }

        public C76233b(C76227e.C76228a aVar, boolean z, C76227e.C76229c cVar, AtomicBoolean atomicBoolean) {
            this.f223325d = aVar;
            this.f223326e = z;
            this.f223327f = cVar;
            this.f223328g = atomicBoolean;
        }

        /* renamed from: a */
        public void mo106483a() {
            C76227e.C76230d dVar = new C76227e.C76230d(this.f223325d, this.f223328g, C76231f.this);
            C78606a.C78607a aVar = (C78606a.C78607a) this.f223327f;
            Bundle bundle = aVar.f230247a;
            dVar.f223307a = bundle;
            C76231f.this.f223323e.mo106475a(this.f223325d, C78606a.this.mo108592b(aVar.f230248b, bundle, dVar), dVar, new C76234a(dVar));
        }

        public void run() {
            Log.m105918d("MicroMsg.ChattingLoader.ListDataLoader", "[LoadTask.run] start");
            long currentTimeMillis = System.currentTimeMillis();
            try {
                mo106483a();
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.ChattingLoader.ListDataLoader", th, "", new Object[0]);
            }
            Log.m105919d("MicroMsg.ChattingLoader.ListDataLoader", "[LoadTask.run] cost:%dms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        }
    }

    public C76231f(C76235g gVar, C76226d dVar, C67391b bVar) {
        this.f223322d = gVar;
        this.f223323e = dVar;
        this.f223319a = new MMHandler("ListDataLoader$");
    }
}
