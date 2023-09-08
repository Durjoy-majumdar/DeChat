package es0;

import com.tencent.p014mm.plugin.appbrand.p026ui.recommend.AppBrandRecommendUILogic;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import js0.C88024r;
import oi0.C35169j;
import oi0.C89217f;
import oi0.C89224h;
import oi0.C89225i;
import rx3.C13598b0;

/* renamed from: es0.m */
public final class C86669m extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRecommendUILogic f251660d;

    /* renamed from: e */
    public final /* synthetic */ boolean f251661e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86669m(AppBrandRecommendUILogic appBrandRecommendUILogic, boolean z) {
        super(0);
        this.f251660d = appBrandRecommendUILogic;
        this.f251661e = z;
    }

    public Object invoke() {
        AppBrandRecommendUILogic appBrandRecommendUILogic = this.f251660d;
        synchronized (appBrandRecommendUILogic.f247001j) {
            appBrandRecommendUILogic.f247001j.f247014b = true;
            C13598b0 b0Var = C13598b0.f38549a;
        }
        if (this.f251661e) {
            Log.m105925i("MicroMsg.Recommend.AppBrandRecommendUILogic", "fetching page from memory, pageNum:%d, ", Integer.valueOf(this.f251660d.f247001j.f247013a));
            C89217f b = this.f251660d.mo117375b();
            b.getClass();
            C88024r.m109571a().postToWorker(new C35169j(new C89225i(b)));
        } else {
            Log.m105925i("MicroMsg.Recommend.AppBrandRecommendUILogic", "fetching page, pageNum:%d, ", Integer.valueOf(this.f251660d.f247001j.f247013a));
            C89217f b2 = this.f251660d.mo117375b();
            int i = this.f251660d.f247001j.f247013a;
            b2.getClass();
            C88024r.m109571a().postToWorker(new C35169j(new C89224h(b2, i)));
        }
        return C13598b0.f38549a;
    }
}
