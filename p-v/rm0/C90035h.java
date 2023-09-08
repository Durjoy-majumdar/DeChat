package rm0;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.utils.C84800z1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import zt3.C119157j;

/* renamed from: rm0.h */
public class C90035h {

    /* renamed from: g */
    public static final Map<String, C90035h> f258634g = new HashMap();

    /* renamed from: a */
    public boolean f258635a = false;

    /* renamed from: b */
    public String f258636b = "";

    /* renamed from: c */
    public C82381f f258637c;

    /* renamed from: d */
    public C90034g f258638d = new C90034g();

    /* renamed from: e */
    public C84800z1.C84801a f258639e;

    /* renamed from: f */
    public C84800z1.C84801a f258640f;

    /* renamed from: rm0.h$a */
    public class C90036a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: d */
        public int f258641d = 0;

        /* renamed from: e */
        public final /* synthetic */ ViewTreeObserver f258642e;

        /* renamed from: f */
        public final /* synthetic */ C90037b f258643f;

        public C90036a(C90035h hVar, ViewTreeObserver viewTreeObserver, C90037b bVar) {
            this.f258642e = viewTreeObserver;
            this.f258643f = bVar;
        }

        public void onGlobalLayout() {
            int i = this.f258641d + 1;
            this.f258641d = i;
            if (i >= 2) {
                if (this.f258642e.isAlive()) {
                    this.f258642e.removeOnGlobalLayoutListener(this);
                }
                this.f258643f.mo124346a("onGlobalLayout");
            }
        }
    }

    /* renamed from: rm0.h$b */
    public class C90037b implements Runnable {

        /* renamed from: d */
        public final AtomicBoolean f258644d = new AtomicBoolean(false);

        /* renamed from: e */
        public final /* synthetic */ C84800z1.C84801a f258645e;

        public C90037b(C84800z1.C84801a aVar) {
            this.f258645e = aVar;
        }

        /* renamed from: a */
        public void mo124346a(String str) {
            if (!this.f258644d.getAndSet(true)) {
                Log.m105927v("MicroMsg.OrientationConfigListenerHelper", "dispatch (%s), appId:%s, orientation:%s", str, C90035h.this.f258636b, this.f258645e);
                C90035h.this.f258638d.mo124342p(this.f258645e);
            }
        }

        public void run() {
            mo124346a("timeout");
        }
    }

    public C90035h() {
        C84800z1.C84801a aVar = C84800z1.C84801a.NONE;
        this.f258639e = aVar;
        this.f258640f = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        return r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static rm0.C90035h m112630a(java.lang.String r2, boolean r3) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            junit.framework.Assert.assertFalse(r0)
            java.util.Map<java.lang.String, rm0.h> r0 = f258634g
            monitor-enter(r0)
            r1 = r0
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ all -> 0x002b }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x002b }
            rm0.h r1 = (rm0.C90035h) r1     // Catch:{ all -> 0x002b }
            if (r1 != 0) goto L_0x0027
            if (r3 != 0) goto L_0x001a
            r2 = 0
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return r2
        L_0x001a:
            rm0.h r1 = new rm0.h     // Catch:{ all -> 0x002b }
            r1.<init>()     // Catch:{ all -> 0x002b }
            r1.f258636b = r2     // Catch:{ all -> 0x002b }
            r3 = r0
            java.util.HashMap r3 = (java.util.HashMap) r3     // Catch:{ all -> 0x002b }
            r3.put(r2, r1)     // Catch:{ all -> 0x002b }
        L_0x0027:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return r1
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            throw r2
        L_0x002b:
            r2 = move-exception
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: rm0.C90035h.m112630a(java.lang.String, boolean):rm0.h");
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 115 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m112631b(java.lang.String r2) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            junit.framework.Assert.assertFalse(r0)
            java.util.Map<java.lang.String, rm0.h> r0 = f258634g
            monitor-enter(r0)
            r1 = r0
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ all -> 0x001c }
            java.lang.Object r2 = r1.remove(r2)     // Catch:{ all -> 0x001c }
            rm0.h r2 = (rm0.C90035h) r2     // Catch:{ all -> 0x001c }
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            if (r2 == 0) goto L_0x0019
            r2.mo124344d()
        L_0x0019:
            return
        L_0x001a:
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            throw r2
        L_0x001c:
            r2 = move-exception
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: rm0.C90035h.m112631b(java.lang.String):void");
    }

    /* renamed from: c */
    public final void mo124343c(C84800z1.C84801a aVar) {
        Window window;
        View decorView;
        ViewTreeObserver viewTreeObserver;
        C82381f fVar = this.f258637c;
        if (fVar != null) {
            Activity castActivityOrNull = AndroidContextUtil.castActivityOrNull(fVar.getContext());
            if (castActivityOrNull == null || (window = castActivityOrNull.getWindow()) == null || (decorView = window.getDecorView()) == null || (viewTreeObserver = decorView.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
                this.f258638d.mo124342p(aVar);
                return;
            }
            C90037b bVar = new C90037b(aVar);
            viewTreeObserver.addOnGlobalLayoutListener(new C90036a(this, viewTreeObserver, bVar));
            C119157j jVar = (C119157j) C119157j.f356862d;
            jVar.getClass();
            jVar.mo183892w(bVar, 100, false);
        }
    }

    /* renamed from: d */
    public final void mo124344d() {
        Log.m105925i("MicroMsg.OrientationConfigListenerHelper", "stopListen appId:%s", this.f258636b);
        this.f258636b = "";
        this.f258637c = null;
        this.f258635a = false;
        this.f258640f = C84800z1.C84801a.NONE;
    }
}
