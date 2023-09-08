package p760ya;

import a70.C112760b;
import android.content.Context;
import com.tencent.magicbrush.C80301a;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83174m;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83181q;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83187w;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import js0.C88020k;
import p1017od.C89166m;
import p1017od.C89167n;
import p748xd.C91174f;
import p927ab.C79480e;
import rx3.C13598b0;

/* renamed from: ya.d */
public class C91385d {

    /* renamed from: a */
    public final Context f262083a;

    /* renamed from: b */
    public final C83165i f262084b;

    /* renamed from: c */
    public volatile C80301a f262085c;

    /* renamed from: d */
    public final C89166m f262086d = new C89166m();

    /* renamed from: e */
    public final C91386a f262087e = new C91386a(new C91387b(this));

    /* renamed from: ya.d$a */
    public static final class C91386a extends C91174f implements C83174m.C83175a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C91386a(C32224a<C13598b0> aVar) {
            super((Runnable) new C38982f(aVar));
            C87412m.m108594g(aVar, "fn");
        }

        public void onDestroy() {
            run();
        }
    }

    /* renamed from: ya.d$b */
    public static final class C91387b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C91385d f262088d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C91387b(C91385d dVar) {
            super(0);
            this.f262088d = dVar;
        }

        public Object invoke() {
            C91385d dVar = this.f262088d;
            synchronized (dVar) {
                if (dVar.f262085c != null) {
                    C80301a aVar = dVar.f262085c;
                    C87412m.m108591d(aVar);
                    aVar.mo111578p();
                    dVar.f262085c = null;
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ya.d$c */
    public static final class C91388c extends C87413o implements C32226l<C89167n.C89171b, C13598b0> {

        /* renamed from: d */
        public static final C91388c f262089d = new C91388c();

        public C91388c() {
            super(1);
        }

        public Object invoke(Object obj) {
            C89167n.C89171b bVar = (C89167n.C89171b) obj;
            C87412m.m108594g(bVar, "$this$imageHandler");
            bVar.f256996a = true;
            bVar.f256998c = new C79480e.C79483c(14883);
            bVar.f256999d = null;
            return C13598b0.f38549a;
        }
    }

    public C91385d(Context context, C83165i iVar) {
        C87412m.m108594g(context, "androidContext");
        C87412m.m108594g(iVar, "jsRuntime");
        this.f262083a = context;
        this.f262084b = iVar;
    }

    /* renamed from: a */
    public final C80301a mo125350a() {
        long currentTicks = Util.currentTicks();
        mo120929c(this.f262086d);
        C80301a k = this.f262086d.mo123512k();
        C87412m.m108591d(k);
        synchronized (this) {
            if (this.f262085c == null) {
                this.f262085c = k;
                C13598b0 b0Var = C13598b0.f38549a;
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        mo122637d(k, Util.ticksToNow(currentTicks));
        return k;
    }

    /* renamed from: b */
    public void mo123173b(AppBrandRuntime appBrandRuntime) {
        C87412m.m108594g(appBrandRuntime, "runtime");
        C79480e.f233041a.mo109476a(this.f262085c, appBrandRuntime, true);
    }

    /* renamed from: c */
    public void mo120929c(C89166m mVar) {
        C87412m.m108594g(mVar, "builder");
        mVar.f256968a = this.f262083a;
        mVar.mo123519g(C88020k.m109556g());
        mVar.f256970c = new C91389e((C83187w) this.f262084b.mo63321n0(C83187w.class));
        C83181q qVar = (C83181q) this.f262084b.mo63321n0(C83181q.class);
        if (qVar != null) {
            mVar.f256969b = new C91382a(qVar);
            C91388c cVar = C91388c.f262089d;
            C87412m.m108594g(cVar, "dls");
            cVar.invoke(mVar.f256976i);
            String C = C112760b.m154195C();
            C87412m.m108593f(C, "DATAROOT_SDCARD_PATH()");
            mVar.mo123521i(C);
            return;
        }
        throw new IllegalStateException("JsRuntime don't support JsThread addon".toString());
    }

    /* renamed from: d */
    public void mo122637d(C80301a aVar, long j) {
        C87412m.m108594g(aVar, "magicbrush");
    }
}
