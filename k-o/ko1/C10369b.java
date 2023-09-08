package ko1;

import android.widget.TextView;
import com.tencent.p014mm.plugin.finder.feed.flow.FlowLayoutManager;
import com.tencent.p014mm.plugin.finder.profile.filter.FinderCollectionFilterView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: ko1.b */
public final class C10369b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderCollectionFilterView f31570d;

    public C10369b(FinderCollectionFilterView finderCollectionFilterView) {
        this.f31570d = finderCollectionFilterView;
    }

    public final void run() {
        FinderCollectionFilterView finderCollectionFilterView = this.f31570d;
        FlowLayoutManager flowLayoutManager = finderCollectionFilterView.f16124f;
        if (flowLayoutManager != null) {
            int i = flowLayoutManager.f52468p;
            C10368a aVar = finderCollectionFilterView.f16122d;
            if (aVar != null) {
                int i2 = aVar.f31566b.f141510e;
                Log.m105924i("Finder.FinderCollectionFilterView", "refreshArrow: " + i + ", " + i2);
                TextView textView = finderCollectionFilterView.f16125g;
                if (textView != null) {
                    textView.setVisibility(i >= i2 ? 8 : 0);
                } else {
                    C87412m.m108603p("moreArrow");
                    throw null;
                }
            } else {
                C87412m.m108603p("presenter");
                throw null;
            }
        } else {
            C87412m.m108603p("layoutManager");
            throw null;
        }
    }
}
