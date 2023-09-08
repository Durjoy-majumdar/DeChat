package com.tencent.p014mm.plugin.game.model;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.NotifyGameWebviewOperationEvent;
import com.tencent.p014mm.game.report.api.GameWebPerformanceInfo;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C40319a0;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wepkg.model.C44501k;
import com.tencent.p014mm.plugin.wepkg.utils.C44532a;
import com.tencent.p014mm.plugin.wepkg.utils.C44536d;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashSet;
import java.util.Set;
import k00.C46633d;
import kb3.C46676l;
import ke3.C88144b;
import q20.C89449a;

/* renamed from: com.tencent.mm.plugin.game.model.NotifyGameWebviewOperationListener */
public class NotifyGameWebviewOperationListener extends IListener<NotifyGameWebviewOperationEvent> {

    /* renamed from: f */
    public static volatile long f113218f;

    /* renamed from: g */
    public static volatile long f113219g;

    /* renamed from: h */
    public static volatile String f113220h;

    /* renamed from: i */
    public static Set<String> f113221i = new HashSet();

    /* renamed from: j */
    public static Set<String> f113222j = new HashSet();

    /* renamed from: d */
    public long f113223d;

    /* renamed from: e */
    public C42033g f113224e;

    /* renamed from: com.tencent.mm.plugin.game.model.NotifyGameWebviewOperationListener$a */
    public class C42027a implements C1256g<Bundle> {

        /* renamed from: d */
        public final /* synthetic */ NotifyGameWebviewOperationEvent f113225d;

        public C42027a(NotifyGameWebviewOperationEvent notifyGameWebviewOperationEvent) {
            this.f113225d = notifyGameWebviewOperationEvent;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            Bundle bundle = (Bundle) obj;
            Log.m105925i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "preload complete. total time:%d", Long.valueOf(System.currentTimeMillis() - NotifyGameWebviewOperationListener.f113219g));
            if (bundle != null) {
                NotifyGameWebviewOperationListener.this.mo65958h(this.f113225d, bundle);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.model.NotifyGameWebviewOperationListener$b */
    public class C42028b implements C1256g<Bundle> {

        /* renamed from: d */
        public final /* synthetic */ String f113227d;

        public C42028b(NotifyGameWebviewOperationListener notifyGameWebviewOperationListener, String str) {
            this.f113227d = str;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            Bundle bundle = (Bundle) obj;
            ((HashSet) NotifyGameWebviewOperationListener.f113222j).remove(this.f113227d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.model.NotifyGameWebviewOperationListener$c */
    public class C42029c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f113228d;

        public C42029c(NotifyGameWebviewOperationListener notifyGameWebviewOperationListener, String str) {
            this.f113228d = str;
        }

        public void run() {
            if (((HashSet) NotifyGameWebviewOperationListener.f113222j).contains(this.f113228d)) {
                Log.m105924i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "preload webcore, time out");
                ((HashSet) NotifyGameWebviewOperationListener.f113222j).remove(this.f113228d);
                C115669n.INSTANCE.mo175913w(939, 3, 1);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.model.NotifyGameWebviewOperationListener$d */
    public class C42030d implements Runnable {
        public C42030d(NotifyGameWebviewOperationListener notifyGameWebviewOperationListener) {
        }

        public void run() {
            Log.m105925i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "interval:%sms, allow enter url:%s", 1000, NotifyGameWebviewOperationListener.f113220h);
            NotifyGameWebviewOperationListener.f113220h = "";
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.model.NotifyGameWebviewOperationListener$e */
    public class C42031e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Context f113229d;

        /* renamed from: e */
        public final /* synthetic */ NotifyGameWebviewOperationEvent f113230e;

        public C42031e(NotifyGameWebviewOperationListener notifyGameWebviewOperationListener, Context context, NotifyGameWebviewOperationEvent notifyGameWebviewOperationEvent) {
            this.f113229d = context;
            this.f113230e = notifyGameWebviewOperationEvent;
        }

        public void run() {
            C88144b.m109791i(this.f113229d, "webview", ".ui.tools.WebViewUI", this.f113230e.f9355d.f9358c, (Bundle) null);
        }
    }

    @C89449a
    /* renamed from: com.tencent.mm.plugin.game.model.NotifyGameWebviewOperationListener$f */
    public static class C42032f implements C80883e<Bundle, Bundle> {
        private C42032f() {
        }

        public void invoke(Object obj, C1256g gVar) {
            Bundle bundle = (Bundle) obj;
            if (bundle != null) {
                String string = bundle.getString("call_raw_url");
                boolean z = bundle.getBoolean("preload_webcore", false);
                if (z) {
                    Log.m105924i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "preload webcore");
                }
                Log.m105925i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "preload entrance url:%s, isToolsProcess:%b", string, Boolean.valueOf(MMApplicationContext.isToolsProcess()));
                if (C80907o.m98784g(MMApplicationContext.getMainProcessName())) {
                    Log.m105924i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "preload wepkg");
                    C44536d.m48918d().postToWorker(new C42045c1(this, bundle, z, gVar));
                    return;
                }
                Log.m105924i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "prestart WepkgMainProcessService and preload wepkg");
                C44536d.m48915a(string, new C42048d1(this, bundle, z, gVar));
            } else if (gVar != null) {
                gVar.mo894a(bundle);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.model.NotifyGameWebviewOperationListener$g */
    public class C42033g implements Runnable {

        /* renamed from: d */
        public final NotifyGameWebviewOperationEvent f113231d;

        public C42033g(NotifyGameWebviewOperationEvent notifyGameWebviewOperationEvent) {
            this.f113231d = notifyGameWebviewOperationEvent;
        }

        public void run() {
            Log.m105924i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "time out, turn page");
            NotifyGameWebviewOperationListener notifyGameWebviewOperationListener = NotifyGameWebviewOperationListener.this;
            NotifyGameWebviewOperationEvent notifyGameWebviewOperationEvent = this.f113231d;
            String str = NotifyGameWebviewOperationListener.f113220h;
            notifyGameWebviewOperationListener.mo65958h(notifyGameWebviewOperationEvent, (Bundle) null);
            C115669n.INSTANCE.mo175913w(939, 2, 1);
        }
    }

    public NotifyGameWebviewOperationListener() {
        super(C40008f.f107254d);
        this.__eventId = 1423904129;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m45682e(android.os.Bundle r13, boolean r14, com.tencent.p014mm.ipcinvoker.C1256g r15) {
        /*
            java.lang.Class<com.tencent.mm.plugin.game.model.NotifyGameWebviewOperationListener> r0 = com.tencent.p014mm.plugin.game.model.NotifyGameWebviewOperationListener.class
            monitor-enter(r0)
            java.lang.String r1 = "MicroMsg.Wepkg.NotifyGameWebviewOperationListener"
            java.lang.String r2 = "preLoadWePkgAndWebCore, preload: %b"
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x00ba }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r14)     // Catch:{ all -> 0x00ba }
            r6 = 0
            r4[r6] = r5     // Catch:{ all -> 0x00ba }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r2, r4)     // Catch:{ all -> 0x00ba }
            java.lang.String r1 = "is_luggage"
            boolean r1 = r13.getBoolean(r1, r6)     // Catch:{ all -> 0x00ba }
            java.lang.String r2 = "call_raw_url"
            java.lang.String r2 = r13.getString(r2)     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = "float_layer_url"
            java.lang.String r4 = r13.getString(r4)     // Catch:{ all -> 0x00ba }
            com.tencent.mm.game.report.api.GameWebPerformanceInfo r5 = com.tencent.p014mm.game.report.api.GameWebPerformanceInfo.m43446b(r2)     // Catch:{ all -> 0x00ba }
            if (r1 == 0) goto L_0x00ad
            wa.t r1 = com.tencent.p014mm.plugin.game.luggage.C41985r.m45635c(r2)     // Catch:{ all -> 0x00ba }
            if (r1 == 0) goto L_0x0052
            if (r14 == 0) goto L_0x003c
            java.lang.String r14 = "MicroMsg.Wepkg.NotifyGameWebviewOperationListener"
            java.lang.String r1 = "has preloaded webcore, return"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r1)     // Catch:{ all -> 0x00ba }
            goto L_0x0047
        L_0x003c:
            com.tencent.mm.plugin.game.model.a1 r14 = new com.tencent.mm.plugin.game.model.a1     // Catch:{ all -> 0x00ba }
            r14.<init>(r1)     // Catch:{ all -> 0x00ba }
            com.tencent.p014mm.ipcinvoker.C40319a0.m43495c(r3, r14)     // Catch:{ all -> 0x00ba }
            com.tencent.p014mm.plugin.game.luggage.C41927m.m45504a(r1, r2, r3)     // Catch:{ all -> 0x00ba }
        L_0x0047:
            java.lang.String r14 = "has_preload_webcore"
            r13.putBoolean(r14, r3)     // Catch:{ all -> 0x00ba }
            if (r15 == 0) goto L_0x00b8
            r15.mo894a(r13)     // Catch:{ all -> 0x00ba }
            goto L_0x00b8
        L_0x0052:
            if (r14 == 0) goto L_0x00a1
            long r6 = r5.f108367t     // Catch:{ all -> 0x00ba }
            r8 = 0
            int r14 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r14 == 0) goto L_0x0061
            r15.mo894a(r13)     // Catch:{ all -> 0x00ba }
            monitor-exit(r0)
            goto L_0x00b9
        L_0x0061:
            boolean r14 = m45683g(r2)     // Catch:{ all -> 0x00ba }
            if (r14 != 0) goto L_0x0080
            java.lang.String r14 = "MicroMsg.Wepkg.NotifyGameWebviewOperationListener"
            java.lang.String r1 = "wepkg is not exists, return"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r14, r1)     // Catch:{ all -> 0x00ba }
            java.util.Map<java.lang.String, com.tencent.mm.game.report.api.GameWebPerformanceInfo> r14 = com.tencent.p014mm.game.report.api.GameWebPerformanceInfo.f108338Q     // Catch:{ all -> 0x00ba }
            java.util.HashMap r14 = (java.util.HashMap) r14     // Catch:{ all -> 0x00ba }
            java.lang.Object r14 = r14.remove(r2)     // Catch:{ all -> 0x00ba }
            com.tencent.mm.game.report.api.GameWebPerformanceInfo r14 = (com.tencent.p014mm.game.report.api.GameWebPerformanceInfo) r14     // Catch:{ all -> 0x00ba }
            if (r15 == 0) goto L_0x007e
            r15.mo894a(r13)     // Catch:{ all -> 0x00ba }
        L_0x007e:
            monitor-exit(r0)
            goto L_0x00b9
        L_0x0080:
            m45683g(r4)     // Catch:{ all -> 0x00ba }
            r5.f108358h = r3     // Catch:{ all -> 0x00ba }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00ba }
            r5.f108370w = r3     // Catch:{ all -> 0x00ba }
            com.tencent.mm.plugin.report.service.n r6 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x00ba }
            r7 = 939(0x3ab, double:4.64E-321)
            r9 = 0
            r11 = 1
            r6.mo175913w(r7, r9, r11)     // Catch:{ all -> 0x00ba }
            java.lang.Class<com.tencent.mm.plugin.game.luggage.t> r14 = com.tencent.p014mm.plugin.game.luggage.C41993t.class
            com.tencent.mm.plugin.game.model.b1 r1 = new com.tencent.mm.plugin.game.model.b1     // Catch:{ all -> 0x00ba }
            r1.<init>(r2, r5, r15, r13)     // Catch:{ all -> 0x00ba }
            com.tencent.p014mm.plugin.game.luggage.C41985r.m45637e(r14, r2, r1)     // Catch:{ all -> 0x00ba }
            goto L_0x00b8
        L_0x00a1:
            m45683g(r4)     // Catch:{ all -> 0x00ba }
            m45683g(r2)     // Catch:{ all -> 0x00ba }
            if (r15 == 0) goto L_0x00b8
            r15.mo894a(r13)     // Catch:{ all -> 0x00ba }
            goto L_0x00b8
        L_0x00ad:
            m45683g(r4)     // Catch:{ all -> 0x00ba }
            m45683g(r2)     // Catch:{ all -> 0x00ba }
            if (r15 == 0) goto L_0x00b8
            r15.mo894a(r13)     // Catch:{ all -> 0x00ba }
        L_0x00b8:
            monitor-exit(r0)
        L_0x00b9:
            return
        L_0x00ba:
            r13 = move-exception
            monitor-exit(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.model.NotifyGameWebviewOperationListener.m45682e(android.os.Bundle, boolean, com.tencent.mm.ipcinvoker.g):void");
    }

    /* renamed from: g */
    public static boolean m45683g(String str) {
        if (Util.isNullOrNil(str) || !C44536d.m48920f(str)) {
            return false;
        }
        Log.m105925i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "preloadWePkg, url: %s", str);
        GameWebPerformanceInfo b = GameWebPerformanceInfo.m43446b(str);
        b.f108368u = System.currentTimeMillis();
        C44501k c = C46676l.m51983c(str);
        b.f108369v = System.currentTimeMillis();
        return c.f120672a == 0;
    }

    public /* bridge */ /* synthetic */ boolean callback(IEvent iEvent) {
        mo65957f((NotifyGameWebviewOperationEvent) iEvent);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x012f, code lost:
        f113218f = java.lang.System.currentTimeMillis();
        f113219g = java.lang.System.currentTimeMillis();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x013f, code lost:
        if (com.tencent.p014mm.plugin.wepkg.utils.C44536d.m48920f(r1) == false) goto L_0x01ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0141, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "exist pkgid:%s, to reload", k00.C46633d.m51936a(r1));
        r14.f9355d.f9359d = p823sg.C90193h.m112878f(com.tencent.p014mm.sdk.platformtools.Util.nullAsNil(r1).getBytes()) + "_" + java.lang.System.currentTimeMillis();
        r8 = new com.tencent.p014mm.plugin.game.model.NotifyGameWebviewOperationListener.C42033g(r13, r14);
        r13.f113224e = r8;
        com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r8, 500);
        r4 = new android.os.Bundle();
        r4.putString("call_raw_url", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0190, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r2) != false) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0192, code lost:
        r4.putString("float_layer_url", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x019b, code lost:
        if (r14.f9355d.f9356a != 2) goto L_0x01a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x019d, code lost:
        r4.putBoolean("is_luggage", true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01a2, code lost:
        com.tencent.p014mm.plugin.game.luggage.C41901e.m45448a(r4, r0, new com.tencent.p014mm.plugin.game.model.NotifyGameWebviewOperationListener.C42027a(r13, r14));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01ab, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "dont have pkgid or disable wepkg, normal turn page.");
        mo65958h(r14, (android.os.Bundle) null);
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo65957f(com.tencent.p014mm.autogen.events.NotifyGameWebviewOperationEvent r14) {
        /*
            r13 = this;
            java.lang.Class<com.tencent.mm.plugin.game.model.NotifyGameWebviewOperationListener$f> r0 = com.tencent.p014mm.plugin.game.model.NotifyGameWebviewOperationListener.C42032f.class
            java.lang.String r1 = "MicroMsg.Wepkg.NotifyGameWebviewOperationListener"
            java.lang.String r2 = "callback, type = %d"
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            com.tencent.mm.autogen.events.NotifyGameWebviewOperationEvent$a r5 = r14.f9355d
            int r5 = r5.f9356a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 0
            r4[r6] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r4)
            com.tencent.mm.autogen.events.NotifyGameWebviewOperationEvent$a r1 = r14.f9355d
            android.content.Intent r2 = r1.f9358c
            if (r2 != 0) goto L_0x001e
            return r6
        L_0x001e:
            int r1 = r1.f9356a
            r4 = 500(0x1f4, double:2.47E-321)
            r2 = 3
            r7 = 2
            if (r1 != r2) goto L_0x0057
            long r8 = java.lang.System.currentTimeMillis()
            long r10 = r13.f113223d
            long r8 = r8 - r10
            java.lang.String r1 = "MicroMsg.Wepkg.NotifyGameWebviewOperationListener"
            java.lang.String r10 = "interval: %d, lastActionTime: %d"
            java.lang.Object[] r11 = new java.lang.Object[r7]
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r11[r6] = r8
            long r8 = r13.f113223d
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r11[r3] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r10, r11)
            long r8 = java.lang.System.currentTimeMillis()
            long r10 = r13.f113223d
            long r8 = r8 - r10
            int r1 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x0057
            java.lang.String r14 = "MicroMsg.Wepkg.NotifyGameWebviewOperationListener"
            java.lang.String r0 = "interval smaller than 500 ms, return"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)
            return r6
        L_0x0057:
            long r8 = java.lang.System.currentTimeMillis()
            r13.f113223d = r8
            com.tencent.mm.autogen.events.NotifyGameWebviewOperationEvent$a r1 = r14.f9355d
            int r8 = r1.f9356a
            if (r8 == 0) goto L_0x00b4
            if (r8 == r3) goto L_0x00b4
            if (r8 == r7) goto L_0x00b4
            if (r8 == r2) goto L_0x006b
            goto L_0x01b6
        L_0x006b:
            android.content.Intent r14 = r1.f9358c
            java.lang.String r1 = "rawUrl"
            java.lang.String r14 = r14.getStringExtra(r1)
            java.util.Set<java.lang.String> r1 = f113222j
            java.util.HashSet r1 = (java.util.HashSet) r1
            boolean r1 = r1.contains(r14)
            if (r1 == 0) goto L_0x007f
            goto L_0x01b6
        L_0x007f:
            boolean r1 = com.tencent.p014mm.plugin.wepkg.utils.C44536d.m48920f(r14)
            if (r1 == 0) goto L_0x01b6
            java.util.Set<java.lang.String> r1 = f113222j
            java.util.HashSet r1 = (java.util.HashSet) r1
            r1.add(r14)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "call_raw_url"
            r1.putString(r2, r14)
            java.lang.String r2 = "preload_webcore"
            r1.putBoolean(r2, r3)
            java.lang.String r2 = "is_luggage"
            r1.putBoolean(r2, r3)
            com.tencent.mm.plugin.game.model.NotifyGameWebviewOperationListener$b r2 = new com.tencent.mm.plugin.game.model.NotifyGameWebviewOperationListener$b
            r2.<init>(r13, r14)
            com.tencent.p014mm.plugin.game.luggage.C41901e.m45448a(r1, r0, r2)
            com.tencent.mm.plugin.game.model.NotifyGameWebviewOperationListener$c r0 = new com.tencent.mm.plugin.game.model.NotifyGameWebviewOperationListener$c
            r0.<init>(r13, r14)
            r1 = 10000(0x2710, double:4.9407E-320)
            com.tencent.p014mm.ipcinvoker.C40319a0.m43496d(r0, r1)
            goto L_0x01b6
        L_0x00b4:
            java.lang.String r1 = "MicroMsg.Wepkg.NotifyGameWebviewOperationListener"
            java.lang.String r9 = "on NotifyGameWebviewOperationListener operation listener, type:%d, hashcode:%s, event hashcode:%s, threadId:%s, isUIThead:%s"
            r10 = 5
            java.lang.Object[] r10 = new java.lang.Object[r10]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r10[r6] = r8
            int r8 = r13.hashCode()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r10[r3] = r8
            int r8 = r14.hashCode()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r10[r7] = r8
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            long r11 = r8.getId()
            java.lang.Long r8 = java.lang.Long.valueOf(r11)
            r10[r2] = r8
            r2 = 4
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            android.os.Looper r11 = android.os.Looper.getMainLooper()
            java.lang.Thread r11 = r11.getThread()
            if (r8 != r11) goto L_0x00f4
            r8 = 1
            goto L_0x00f5
        L_0x00f4:
            r8 = 0
        L_0x00f5:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r10[r2] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r9, r10)
            java.lang.String r1 = ""
            com.tencent.mm.autogen.events.NotifyGameWebviewOperationEvent$a r2 = r14.f9355d     // Catch:{ Exception -> 0x010a }
            android.content.Intent r2 = r2.f9358c     // Catch:{ Exception -> 0x010a }
            java.lang.String r8 = "rawUrl"
            java.lang.String r1 = r2.getStringExtra(r8)     // Catch:{ Exception -> 0x010a }
        L_0x010a:
            com.tencent.mm.autogen.events.NotifyGameWebviewOperationEvent$a r2 = r14.f9355d
            android.content.Intent r2 = r2.f9358c
            java.lang.String r8 = "game_float_layer_url"
            java.lang.String r2 = r2.getStringExtra(r8)
            java.lang.Class<com.tencent.mm.plugin.game.model.NotifyGameWebviewOperationListener> r8 = com.tencent.p014mm.plugin.game.model.NotifyGameWebviewOperationListener.class
            monitor-enter(r8)
            java.lang.String r9 = f113220h     // Catch:{ all -> 0x01b7 }
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r9)     // Catch:{ all -> 0x01b7 }
            boolean r9 = r9.equalsIgnoreCase(r1)     // Catch:{ all -> 0x01b7 }
            if (r9 == 0) goto L_0x012c
            java.lang.String r14 = "MicroMsg.Wepkg.NotifyGameWebviewOperationListener"
            java.lang.String r0 = "forbid to open same page two times"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)     // Catch:{ all -> 0x01b7 }
            monitor-exit(r8)     // Catch:{ all -> 0x01b7 }
            return r6
        L_0x012c:
            f113220h = r1     // Catch:{ all -> 0x01b7 }
            monitor-exit(r8)     // Catch:{ all -> 0x01b7 }
            long r8 = java.lang.System.currentTimeMillis()
            f113218f = r8
            long r8 = java.lang.System.currentTimeMillis()
            f113219g = r8
            boolean r8 = com.tencent.p014mm.plugin.wepkg.utils.C44536d.m48920f(r1)
            if (r8 == 0) goto L_0x01ab
            java.lang.String r8 = "MicroMsg.Wepkg.NotifyGameWebviewOperationListener"
            java.lang.String r9 = "exist pkgid:%s, to reload"
            java.lang.Object[] r10 = new java.lang.Object[r3]
            java.lang.String r11 = k00.C46633d.m51936a(r1)
            r10[r6] = r11
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r9, r10)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
            byte[] r9 = r9.getBytes()
            java.lang.String r9 = p823sg.C90193h.m112878f(r9)
            r8.append(r9)
            java.lang.String r9 = "_"
            r8.append(r9)
            long r9 = java.lang.System.currentTimeMillis()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.tencent.mm.autogen.events.NotifyGameWebviewOperationEvent$a r9 = r14.f9355d
            r9.f9359d = r8
            com.tencent.mm.plugin.game.model.NotifyGameWebviewOperationListener$g r8 = new com.tencent.mm.plugin.game.model.NotifyGameWebviewOperationListener$g
            r8.<init>(r14)
            r13.f113224e = r8
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r8, r4)
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r5 = "call_raw_url"
            r4.putString(r5, r1)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r1 != 0) goto L_0x0197
            java.lang.String r1 = "float_layer_url"
            r4.putString(r1, r2)
        L_0x0197:
            com.tencent.mm.autogen.events.NotifyGameWebviewOperationEvent$a r1 = r14.f9355d
            int r1 = r1.f9356a
            if (r1 != r7) goto L_0x01a2
            java.lang.String r1 = "is_luggage"
            r4.putBoolean(r1, r3)
        L_0x01a2:
            com.tencent.mm.plugin.game.model.NotifyGameWebviewOperationListener$a r1 = new com.tencent.mm.plugin.game.model.NotifyGameWebviewOperationListener$a
            r1.<init>(r14)
            com.tencent.p014mm.plugin.game.luggage.C41901e.m45448a(r4, r0, r1)
            goto L_0x01b6
        L_0x01ab:
            java.lang.String r0 = "MicroMsg.Wepkg.NotifyGameWebviewOperationListener"
            java.lang.String r1 = "dont have pkgid or disable wepkg, normal turn page."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            r0 = 0
            r13.mo65958h(r14, r0)
        L_0x01b6:
            return r6
        L_0x01b7:
            r14 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x01b7 }
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.model.NotifyGameWebviewOperationListener.mo65957f(com.tencent.mm.autogen.events.NotifyGameWebviewOperationEvent):boolean");
    }

    /* renamed from: h */
    public final synchronized void mo65958h(NotifyGameWebviewOperationEvent notifyGameWebviewOperationEvent, Bundle bundle) {
        Log.m105924i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "turnPage");
        MMHandlerThread.removeRunnable(this.f113224e);
        MMHandlerThread.postToMainThreadDelayed(new C42030d(this), 1000);
        if (notifyGameWebviewOperationEvent != null) {
            if (!Util.isNullOrNil(notifyGameWebviewOperationEvent.f9355d.f9359d)) {
                if (((HashSet) f113221i).contains(notifyGameWebviewOperationEvent.f9355d.f9359d)) {
                    ((HashSet) f113221i).remove(notifyGameWebviewOperationEvent.f9355d.f9359d);
                    return;
                }
                ((HashSet) f113221i).add(notifyGameWebviewOperationEvent.f9355d.f9359d);
            }
            Context context = notifyGameWebviewOperationEvent.f9355d.f9357b;
            if (context == null) {
                context = MMApplicationContext.getContext();
            }
            NotifyGameWebviewOperationEvent.C1100a aVar = notifyGameWebviewOperationEvent.f9355d;
            if (aVar.f9358c == null) {
                aVar.f9358c = new Intent();
            }
            String stringExtra = notifyGameWebviewOperationEvent.f9355d.f9358c.getStringExtra("rawUrl");
            Log.m105924i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "turn page, start web ui, time: " + System.currentTimeMillis());
            notifyGameWebviewOperationEvent.f9355d.f9358c.putExtra("start_activity_time", System.currentTimeMillis());
            NotifyGameWebviewOperationEvent.C1100a aVar2 = notifyGameWebviewOperationEvent.f9355d;
            int i = aVar2.f9356a;
            if (i == 0) {
                C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", aVar2.f9358c, (Bundle) null);
            } else if (i == 1) {
                C88144b.m109791i(context, "webview", ".ui.tools.TransparentWebViewUI", aVar2.f9358c, (Bundle) null);
            } else if (i == 2) {
                C40319a0.m43496d(new C42031e(this, context, notifyGameWebviewOperationEvent), bundle != null ? bundle.getBoolean("has_preload_webcore", false) : false ? 100 : 0);
            }
            long currentTimeMillis = System.currentTimeMillis() - f113218f;
            Log.m105925i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "turn to GameWebViewUI time:%d", Long.valueOf(currentTimeMillis));
            try {
                notifyGameWebviewOperationEvent.f9355d.f9357b = null;
            } catch (Exception unused) {
            }
            Object obj = C44536d.f120770a;
            C44532a.m48912c("preloadWebTime", stringExtra, C46633d.m51936a(stringExtra), (String) null, -1, currentTimeMillis, (String) null);
        }
    }
}
