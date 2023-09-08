package cp0;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.appbrand.task.C84310k;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C36568h;

/* renamed from: cp0.a */
public final class C86078a {

    /* renamed from: h */
    public static ServiceConnection f250549h;

    /* renamed from: a */
    public final Context f250550a;

    /* renamed from: b */
    public final Intent f250551b;

    /* renamed from: c */
    public final AppBrandInitConfigWC f250552c;

    /* renamed from: d */
    public final C84310k f250553d;

    /* renamed from: e */
    public final AppBrandStatObject f250554e;

    /* renamed from: f */
    public int f250555f = -1;

    /* renamed from: g */
    public final C13601g f250556g = C36568h.m40985a(new C86079a(this));

    /* renamed from: cp0.a$a */
    public static final class C86079a extends C87413o implements C32224a<C86082d> {

        /* renamed from: d */
        public final /* synthetic */ C86078a f250557d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C86079a(C86078a aVar) {
            super(0);
            this.f250557d = aVar;
        }

        public Object invoke() {
            int i = this.f250557d.f250555f;
            return new C86082d(i, "MicroMsg.AppBrand.AppBrandPreLoadingLogic", new C86081c(i));
        }
    }

    public C86078a(Context context, Intent intent, AppBrandInitConfigWC appBrandInitConfigWC, C84310k kVar, AppBrandStatObject appBrandStatObject) {
        C87412m.m108594g(context, "ctx");
        C87412m.m108594g(intent, "startAppBrandIntent");
        C87412m.m108594g(appBrandInitConfigWC, "cfg");
        C87412m.m108594g(kVar, "task");
        C87412m.m108594g(appBrandStatObject, "stat");
        this.f250550a = context;
        this.f250551b = intent;
        this.f250552c = appBrandInitConfigWC;
        this.f250553d = kVar;
        this.f250554e = appBrandStatObject;
    }
}
