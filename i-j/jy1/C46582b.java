package jy1;

import com.tencent.p014mm.plugin.game.luggage.model.H5CgiPreloadModel;
import fy3.C32224a;
import gy3.C24560g0;
import gy3.C24561h0;
import gy3.C24568q;
import gy3.C8480h;
import gy3.C87413o;
import ny3.C89104m;
import p225rc.C89918i;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;

/* renamed from: jy1.b */
public final class C46582b {

    /* renamed from: a */
    public static final C46582b f125486a = new C46582b();

    /* renamed from: b */
    public static final /* synthetic */ C89104m<Object>[] f125487b;

    /* renamed from: c */
    public static final C89918i f125488c;

    /* renamed from: d */
    public static final C89918i f125489d;

    /* renamed from: e */
    public static final C13601g f125490e = C36568h.m40986b(C13602i.NONE, C46584b.f125492d);

    /* renamed from: f */
    public static C46583a f125491f;

    /* renamed from: jy1.b$a */
    public interface C46583a {
        /* renamed from: a */
        void mo71884a(H5CgiPreloadModel h5CgiPreloadModel);
    }

    /* renamed from: jy1.b$b */
    public static final class C46584b extends C87413o implements C32224a<H5CgiPreloadModel> {

        /* renamed from: d */
        public static final C46584b f125492d = new C46584b();

        public C46584b() {
            super(0);
        }

        public Object invoke() {
            return new H5CgiPreloadModel(0, 0, false, (String) null, 15, (C8480h) null);
        }
    }

    static {
        C46582b bVar = f125486a;
        C24568q qVar = new C24568q(bVar, C46582b.class, "needPreload", "getNeedPreload()Z", 0);
        C24561h0 h0Var = C24560g0.f70158a;
        f125487b = new C89104m[]{h0Var.mo51270d(qVar), h0Var.mo51270d(new C24568q(bVar, C46582b.class, "isCgiDone", "isCgiDone()Z", 0))};
        Boolean bool = Boolean.FALSE;
        f125488c = new C89918i(bool, "isGameH5CgiNeedPreload");
        f125489d = new C89918i(bool, "isGameH5CgiDone");
    }

    /* renamed from: b */
    public static final void m51904b(boolean z) {
        f125489d.mo124239c(f125486a, f125487b[1], Boolean.valueOf(z));
    }

    /* renamed from: a */
    public final H5CgiPreloadModel mo71883a() {
        return (H5CgiPreloadModel) f125490e.getValue();
    }
}
