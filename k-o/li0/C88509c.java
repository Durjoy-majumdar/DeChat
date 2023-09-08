package li0;

import android.os.Handler;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import java.util.concurrent.TimeUnit;
import li0.C88514d;
import p1042u.C111055b;
import p1042u.C118556h;
import p210o.C11323a;

/* renamed from: li0.c */
public final class C88509c {

    /* renamed from: d */
    public static boolean f255665d;

    /* renamed from: e */
    public static long f255666e = TimeUnit.MINUTES.toMillis(10);

    /* renamed from: a */
    public final C88514d f255667a;

    /* renamed from: b */
    public final AppBrandRuntime f255668b;

    /* renamed from: c */
    public final C111055b<C88512b, C88509c> f255669c = new C111055b<>();

    /* renamed from: li0.c$a */
    public class C88510a extends C88514d {

        /* renamed from: li0.c$a$a */
        public class C88511a implements C11323a<C88513c, Void> {
            public C88511a(C88510a aVar) {
            }

            public Object apply(Object obj) {
                ((C88513c) obj).mo113168d();
                return null;
            }
        }

        public C88510a(AppBrandRuntime appBrandRuntime) {
            super(appBrandRuntime);
        }

        /* renamed from: A */
        public void mo122984A() {
            C88512b[] bVarArr;
            boolean W0 = C88509c.this.f255668b.mo113037W0();
            Log.m105925i("Luggage.AppRunningStateController", "onSuspendTimeout, %s, shouldHandle?:%b", C88509c.this.f255668b, Boolean.valueOf(W0));
            if (W0) {
                C88509c.this.f255668b.mo113006E();
                C88509c cVar = C88509c.this;
                C88511a aVar = new C88511a(this);
                synchronized (cVar.f255669c) {
                    C111055b<C88512b, C88509c> bVar = cVar.f255669c;
                    bVarArr = (C88512b[]) ((C118556h.C118559c) bVar.keySet()).toArray(new C88512b[bVar.f332583f]);
                }
                for (C88512b bVar2 : bVarArr) {
                    if (bVar2 instanceof C88513c) {
                        aVar.apply((C88513c) bVar2);
                    }
                }
            }
        }

        /* renamed from: y */
        public void mo122985y(C88508b bVar) {
            C88512b[] bVarArr;
            Log.m105925i("Luggage.AppRunningStateController", "onStateChanged(%s) %s", bVar, C88509c.this.f255668b);
            C88509c cVar = C88509c.this;
            synchronized (cVar.f255669c) {
                C111055b<C88512b, C88509c> bVar2 = cVar.f255669c;
                bVarArr = (C88512b[]) ((C118556h.C118559c) bVar2.keySet()).toArray(new C88512b[bVar2.f332583f]);
            }
            for (C88512b b : bVarArr) {
                b.mo113102b(cVar.f255668b.f238147j, bVar);
            }
        }
    }

    /* renamed from: li0.c$b */
    public interface C88512b {
        /* renamed from: b */
        void mo113102b(String str, C88508b bVar);
    }

    /* renamed from: li0.c$c */
    public interface C88513c extends C88512b {
        /* renamed from: d */
        void mo113168d();
    }

    public C88509c(AppBrandRuntime appBrandRuntime) {
        this.f255668b = appBrandRuntime;
        this.f255667a = new C88510a(appBrandRuntime);
    }

    /* renamed from: a */
    public void mo122978a(C88512b bVar) {
        if (bVar != null && !this.f255667a.f255687u.get()) {
            synchronized (this.f255669c) {
                this.f255669c.put(bVar, this);
            }
        }
    }

    /* renamed from: b */
    public boolean mo122979b() {
        C88514d dVar = this.f255667a;
        int ordinal = dVar.mo122988u().ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal != 1) {
            return false;
        }
        return ((Boolean) new C88532e(dVar, 1000, Boolean.FALSE).mo123008a(new MMHandler(dVar.getHandler().getLooper()))).booleanValue();
    }

    /* renamed from: c */
    public C88508b mo122980c() {
        return this.f255667a.mo122988u();
    }

    /* renamed from: d */
    public void mo122981d() {
        this.f255667a.mo122987s(C88514d.C88522g.ON_RESET_TO_TOP_OF_STACK, (Object) null);
    }

    /* renamed from: e */
    public void mo122982e(C88512b bVar) {
        if (bVar != null && C88508b.DESTROYED != mo122980c()) {
            synchronized (this.f255669c) {
                this.f255669c.remove(bVar);
            }
        }
    }

    /* renamed from: f */
    public boolean mo122983f() {
        C88514d dVar = this.f255667a;
        Handler handler = dVar.getHandler();
        if (handler == null) {
            return false;
        }
        return ((Boolean) new C88533f(dVar, 1000, Boolean.FALSE).mo123008a(new MMHandler(handler.getLooper()))).booleanValue();
    }
}
