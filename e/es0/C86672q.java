package es0;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.appbrand.p026ui.recommend.AppBrandRecommendUILogic;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: es0.q */
public final class C86672q implements LoadMoreRecyclerView.C40579c {

    /* renamed from: a */
    public final /* synthetic */ AppBrandRecommendUILogic f251668a;

    public C86672q(AppBrandRecommendUILogic appBrandRecommendUILogic) {
        this.f251668a = appBrandRecommendUILogic;
    }

    /* renamed from: a */
    public final void mo23454a(LoadMoreRecyclerView loadMoreRecyclerView, RecyclerView.C16613e eVar) {
        AppBrandRecommendUILogic.C84664a aVar = this.f251668a.f247001j;
        if (aVar.f247015c && !aVar.f247014b) {
            Log.m105918d("MicroMsg.Recommend.AppBrandRecommendUILogic", "can load more: let's do fetch");
            AppBrandRecommendUILogic appBrandRecommendUILogic = this.f251668a;
            appBrandRecommendUILogic.getClass();
            C86678x.m107497b(appBrandRecommendUILogic, true);
            C86678x.m107498c(appBrandRecommendUILogic, true);
            appBrandRecommendUILogic.f246999h.post(new C31692r(new C86669m(appBrandRecommendUILogic, false)));
        }
    }
}
