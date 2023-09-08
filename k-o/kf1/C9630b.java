package kf1;

import android.view.View;
import android.view.ViewGroup;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.feed.FinderLoaderFeedUIContract$Presenter;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import gy3.C87412m;
import java.util.ArrayList;

/* renamed from: kf1.b */
public final class C9630b extends C9854m5 {

    /* renamed from: q */
    public final boolean f29951q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9630b(MMActivity mMActivity, C9616a aVar, int i, int i2, boolean z) {
        super(mMActivity, aVar, i, i2);
        C87412m.m108594g(mMActivity, "context");
        C87412m.m108594g(aVar, "presenter");
        this.f29951q = z;
    }

    /* renamed from: F0 */
    public void mo5181F0() {
        C9640c cVar = this.f30123e;
        C87412m.m108592e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderLoaderFeedUIContract.Presenter");
        ((FinderLoaderFeedUIContract$Presenter) cVar).mo2565s1();
        if (this.f29951q) {
            C9640c cVar2 = this.f30123e;
            C87412m.m108592e(cVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderLoaderFeedUIContract.Presenter");
            ((FinderLoaderFeedUIContract$Presenter) cVar2).requestRefresh();
        }
    }

    /* renamed from: k0 */
    public void mo9301k0(ArrayList<C0740i2> arrayList) {
        C87412m.m108594g(arrayList, "data");
        super.mo9301k0(arrayList);
        RefreshLoadMoreLayout D = mo10308D();
        View inflate = C85868k2.m106137b(this.f30122d).inflate(C0966R.C0971layout.b7u, (ViewGroup) null);
        C87412m.m108593f(inflate, "getInflater(context).inf…d_more_footer_dark, null)");
        D.setLoadMoreFooter(inflate);
    }

    /* renamed from: x */
    public View mo5184x() {
        return null;
    }
}
