package kf1;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.feed.FinderFeedDetailUIContract$Presenter;
import gy3.C87412m;

/* renamed from: kf1.f2 */
public class C9713f2 extends C9707f {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9713f2(MMActivity mMActivity, FinderFeedDetailUIContract$Presenter finderFeedDetailUIContract$Presenter, int i, int i2, boolean z) {
        super(mMActivity, finderFeedDetailUIContract$Presenter, i, i2, z);
        C87412m.m108594g(mMActivity, "context");
        C87412m.m108594g(finderFeedDetailUIContract$Presenter, "presenter");
    }

    /* renamed from: F0 */
    public void mo5181F0() {
        mo10308D().setEnableLoadMore(false);
        RecyclerView.C16613e adapter = getRecyclerView().getAdapter();
        if (adapter != null) {
            adapter.getItemCount();
        }
    }

    /* renamed from: x */
    public View mo5184x() {
        return null;
    }
}
