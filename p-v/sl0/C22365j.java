package sl0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import sl0.C22368l;

/* renamed from: sl0.j */
public class C22365j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C82381f f63390d;

    /* renamed from: e */
    public final /* synthetic */ String f63391e;

    /* renamed from: f */
    public final /* synthetic */ C22368l.C22369a f63392f;

    /* renamed from: g */
    public final /* synthetic */ C22368l f63393g;

    /* renamed from: sl0.j$a */
    public class C22366a implements Runnable {
        public C22366a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0044, code lost:
            r0 = r5.f63394d.f63393g.f63397h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x004a, code lost:
            if (r0 == null) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
            if (r0.isHeld() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0052, code lost:
            r0.release();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0056, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0057, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105928w("MicroMsg.JsApiOperateLocalServicesScan", r0.getMessage());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r5 = this;
                sl0.j r0 = sl0.C22365j.this
                sl0.l r0 = r0.f63393g
                java.util.Map<java.lang.String, sl0.l$a> r0 = r0.f63396g
                monitor-enter(r0)
                sl0.j r1 = sl0.C22365j.this     // Catch:{ all -> 0x0061 }
                sl0.l r2 = r1.f63393g     // Catch:{ all -> 0x0061 }
                java.util.Map<java.lang.String, sl0.l$a> r3 = r2.f63396g     // Catch:{ all -> 0x0061 }
                com.tencent.mm.plugin.appbrand.jsapi.f r4 = r1.f63390d     // Catch:{ all -> 0x0061 }
                java.lang.String r1 = r1.f63391e     // Catch:{ all -> 0x0061 }
                java.lang.String r1 = r2.mo35503w(r4, r1)     // Catch:{ all -> 0x0061 }
                java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3     // Catch:{ all -> 0x0061 }
                boolean r1 = r3.containsKey(r1)     // Catch:{ all -> 0x0061 }
                if (r1 != 0) goto L_0x0027
                java.lang.String r1 = "MicroMsg.JsApiOperateLocalServicesScan"
                java.lang.String r2 = "scan task not exist, cancel auto stop"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ all -> 0x0061 }
                monitor-exit(r0)     // Catch:{ all -> 0x0061 }
                return
            L_0x0027:
                sp0.b0 r1 = sp0.C22381b0.INSTANCE     // Catch:{ all -> 0x0061 }
                sl0.j r2 = sl0.C22365j.this     // Catch:{ all -> 0x0061 }
                sl0.l$a r2 = r2.f63392f     // Catch:{ all -> 0x0061 }
                r1.mo35522a(r2)     // Catch:{ all -> 0x0061 }
                sl0.j r1 = sl0.C22365j.this     // Catch:{ all -> 0x0061 }
                sl0.l r2 = r1.f63393g     // Catch:{ all -> 0x0061 }
                java.util.Map<java.lang.String, sl0.l$a> r3 = r2.f63396g     // Catch:{ all -> 0x0061 }
                com.tencent.mm.plugin.appbrand.jsapi.f r4 = r1.f63390d     // Catch:{ all -> 0x0061 }
                java.lang.String r1 = r1.f63391e     // Catch:{ all -> 0x0061 }
                java.lang.String r1 = r2.mo35503w(r4, r1)     // Catch:{ all -> 0x0061 }
                java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3     // Catch:{ all -> 0x0061 }
                r3.remove(r1)     // Catch:{ all -> 0x0061 }
                monitor-exit(r0)     // Catch:{ all -> 0x0061 }
                sl0.j r0 = sl0.C22365j.this
                sl0.l r0 = r0.f63393g
                android.net.wifi.WifiManager$MulticastLock r0 = r0.f63397h
                if (r0 == 0) goto L_0x0060
                boolean r1 = r0.isHeld()     // Catch:{ Exception -> 0x0056 }
                if (r1 == 0) goto L_0x0060
                r0.release()     // Catch:{ Exception -> 0x0056 }
                goto L_0x0060
            L_0x0056:
                r0 = move-exception
                java.lang.String r0 = r0.getMessage()
                java.lang.String r1 = "MicroMsg.JsApiOperateLocalServicesScan"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r0)
            L_0x0060:
                return
            L_0x0061:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0061 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: sl0.C22365j.C22366a.run():void");
        }
    }

    public C22365j(C22368l lVar, C82381f fVar, String str, C22368l.C22369a aVar) {
        this.f63393g = lVar;
        this.f63390d = fVar;
        this.f63391e = str;
        this.f63392f = aVar;
    }

    public void run() {
        ThreadPool.post(new C22366a(), "stopScanServices");
    }
}
