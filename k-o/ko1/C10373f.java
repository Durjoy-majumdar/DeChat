package ko1;

import com.tencent.p014mm.plugin.finder.profile.FlowLayoutManager;
import com.tencent.p014mm.plugin.finder.profile.filter.FinderTopicFilterView;
import kg3.C76577a;

/* renamed from: ko1.f */
public final class C10373f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderTopicFilterView f31582d;

    /* renamed from: e */
    public final /* synthetic */ FlowLayoutManager f31583e;

    /* renamed from: f */
    public final /* synthetic */ boolean f31584f;

    public C10373f(FinderTopicFilterView finderTopicFilterView, FlowLayoutManager flowLayoutManager, boolean z) {
        this.f31582d = finderTopicFilterView;
        this.f31583e = flowLayoutManager;
        this.f31584f = z;
    }

    public final void run() {
        FinderTopicFilterView finderTopicFilterView = this.f31582d;
        finderTopicFilterView.setFoldHeight(this.f31583e.f52487j + C76577a.m92151b(finderTopicFilterView.getContext(), 8));
        FinderTopicFilterView finderTopicFilterView2 = this.f31582d;
        if (this.f31584f) {
            finderTopicFilterView2.mo3778e(0, finderTopicFilterView2.f16135j, 0.0f, 1.0f);
        } else {
            finderTopicFilterView2.mo3778e(finderTopicFilterView2.f16135j, 0, 1.0f, 0.0f);
        }
    }
}
