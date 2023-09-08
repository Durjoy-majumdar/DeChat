package ds0;

import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: ds0.e */
public final class C45446e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ LoadMoreRecyclerView f123013d;

    public C45446e(LoadMoreRecyclerView loadMoreRecyclerView) {
        this.f123013d = loadMoreRecyclerView;
    }

    public final void run() {
        LoadMoreRecyclerView loadMoreRecyclerView = this.f123013d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(loadMoreRecyclerView, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/privacy/use_record/AppBrandPrivacyUseRecordPage$initContentArea$onFirstTimesFetched$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        loadMoreRecyclerView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(loadMoreRecyclerView, "com/tencent/mm/plugin/appbrand/ui/privacy/use_record/AppBrandPrivacyUseRecordPage$initContentArea$onFirstTimesFetched$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        this.f123013d.mo63430I(true);
    }
}
