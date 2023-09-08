package es0;

import com.tencent.p014mm.plugin.appbrand.p026ui.recommend.AppBrandRecommendUILogic;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C8478d0;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;
import te3.C90419io3;

/* renamed from: es0.n */
public final class C86670n extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRecommendUILogic f251662d;

    /* renamed from: e */
    public final /* synthetic */ LinkedList<C90419io3> f251663e;

    /* renamed from: f */
    public final /* synthetic */ int f251664f;

    /* renamed from: g */
    public final /* synthetic */ C8478d0 f251665g;

    /* renamed from: h */
    public final /* synthetic */ int f251666h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86670n(AppBrandRecommendUILogic appBrandRecommendUILogic, LinkedList<C90419io3> linkedList, int i, C8478d0 d0Var, int i2) {
        super(0);
        this.f251662d = appBrandRecommendUILogic;
        this.f251663e = linkedList;
        this.f251664f = i;
        this.f251665g = d0Var;
        this.f251666h = i2;
    }

    public Object invoke() {
        int i;
        int i2;
        AppBrandRecommendUILogic appBrandRecommendUILogic = this.f251662d;
        C7930y.m8095a(appBrandRecommendUILogic.f246996e, appBrandRecommendUILogic.f247003o.f246981g);
        LinkedList<C90419io3> linkedList = this.f251663e;
        if (linkedList == null || !((i = this.f251664f) == 0 || i == 2 || i == 3)) {
            Log.m105924i("MicroMsg.Recommend.AppBrandRecommendUILogic", "onFetchFinish fail");
            AppBrandRecommendUILogic appBrandRecommendUILogic2 = this.f251662d;
            appBrandRecommendUILogic2.getClass();
            Log.m105924i("MicroMsg.Recommend.AppBrandRecommendUILogic", "onFetchPageFail");
            C86678x.m107498c(appBrandRecommendUILogic2, false);
            C86678x.m107497b(appBrandRecommendUILogic2, true);
            C86678x.m107496a(appBrandRecommendUILogic2);
            synchronized (appBrandRecommendUILogic2.f247001j) {
                appBrandRecommendUILogic2.f247001j.f247014b = false;
                C13598b0 b0Var = C13598b0.f38549a;
            }
        } else {
            Log.m105925i("MicroMsg.Recommend.AppBrandRecommendUILogic", "onFetchFinish success and data size = %d, page num:%d", Integer.valueOf(linkedList.size()), Integer.valueOf(this.f251662d.f247001j.f247013a));
            if ((this.f251664f == 0 && (this.f251662d.f247001j.f247013a == 0 || (this.f251665g.f27483d == 0 && this.f251662d.f247001j.f247013a == 1))) || (i2 = this.f251664f) == 2 || i2 == 3) {
                C86647a aVar = this.f251662d.f247000i;
                LinkedList<C90419io3> linkedList2 = this.f251663e;
                aVar.getClass();
                C87412m.m108594g(linkedList2, "data");
                aVar.mo121055G4().clear();
                aVar.mo121055G4().addAll(linkedList2);
            } else {
                C86647a aVar2 = this.f251662d.f247000i;
                LinkedList<C90419io3> linkedList3 = this.f251663e;
                aVar2.getClass();
                C87412m.m108594g(linkedList3, "data");
                aVar2.mo121055G4().addAll(linkedList3);
            }
            if (this.f251664f == 3) {
                Log.m105925i("MicroMsg.Recommend.AppBrandRecommendUILogic", "scrollToPosition %d", Integer.valueOf(this.f251662d.mo117375b().f257082j));
                LoadMoreRecyclerView g = this.f251662d.mo117377g();
                int i3 = this.f251662d.mo117375b().f257082j;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar3.mo10233c(Integer.valueOf(i3));
                C117292a.m165358d(g, aVar3.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendUILogic$initData$1$2", "invoke", "()V", "Undefined", "scrollToPosition", "(I)V");
                g.mo17115r1(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(g, "com/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendUILogic$initData$1$2", "invoke", "()V", "Undefined", "scrollToPosition", "(I)V");
            }
            this.f251662d.f247000i.notifyDataSetChanged();
            AppBrandRecommendUILogic appBrandRecommendUILogic3 = this.f251662d;
            int i4 = this.f251666h;
            appBrandRecommendUILogic3.getClass();
            Log.m105924i("MicroMsg.Recommend.AppBrandRecommendUILogic", "onFetchPageSuccess");
            synchronized (appBrandRecommendUILogic3.f247001j) {
                appBrandRecommendUILogic3.f247001j.f247015c = i4 > 0;
                appBrandRecommendUILogic3.f247001j.f247014b = false;
                C13598b0 b0Var2 = C13598b0.f38549a;
            }
            C86678x.m107497b(appBrandRecommendUILogic3, true);
            AppBrandRecommendUILogic.C84664a aVar4 = appBrandRecommendUILogic3.f247001j;
            if (aVar4.f247015c && !aVar4.f247014b) {
                C86678x.m107498c(appBrandRecommendUILogic3, true);
            } else {
                C86678x.m107498c(appBrandRecommendUILogic3, false);
                C86678x.m107496a(appBrandRecommendUILogic3);
            }
        }
        return C13598b0.f38549a;
    }
}
