package kf1;

import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import gy3.C87412m;
import jq3.C9500j;
import up1.C14367u0;

/* renamed from: kf1.i9 */
public final class C9801i9 extends C9732g {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9801i9(MMActivity mMActivity, int i, int i2, BaseFinderFeedLoader baseFinderFeedLoader) {
        super(mMActivity, i, i2, baseFinderFeedLoader);
        C87412m.m108594g(mMActivity, "context");
        C87412m.m108594g(baseFinderFeedLoader, "loader");
    }

    /* renamed from: U */
    public C9500j mo2516U() {
        C9753h hVar = this.f30176f;
        C14367u0 Z = hVar != null ? hVar.mo9296Z() : null;
        C87412m.m108591d(Z);
        return Z.mo3664a();
    }

    /* renamed from: n */
    public void mo2519n() {
        RefreshLoadMoreLayout refreshLoadMoreLayout;
        TextView textView;
        C9753h hVar = this.f30176f;
        if (hVar != null) {
            hVar.mo9297d(this.f30175e.getDataListJustForAdapter());
        }
        C9753h hVar2 = this.f30176f;
        if (hVar2 != null && (refreshLoadMoreLayout = hVar2.f30220j) != null && (textView = (TextView) refreshLoadMoreLayout.findViewById(C0966R.C0970id.g2t)) != null) {
            textView.setTextColor(this.f30174d.getResources().getColor(C0966R.color.BW_100_Alpha_0_3));
        }
    }

    /* renamed from: o */
    public void mo2521o() {
        BaseFeedLoader.requestLoadMore$default(this.f30175e, false, 1, (Object) null);
    }

    /* renamed from: q */
    public void mo2523q() {
        BaseFeedLoader.requestInit$default(this.f30175e, false, 1, (Object) null);
    }

    public void requestRefresh() {
        this.f30175e.requestRefresh();
    }
}
