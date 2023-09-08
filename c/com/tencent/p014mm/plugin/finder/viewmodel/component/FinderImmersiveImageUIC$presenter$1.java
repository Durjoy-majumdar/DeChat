package com.tencent.p014mm.plugin.finder.viewmodel.component;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.feed.FinderFeedDetailUIContract$Presenter;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.thumbplayer.tplayer.plugins.ITPEventID;
import er1.C58739j4;
import er1.C58784w3;
import gy3.C8480h;
import gy3.C87412m;
import jq3.C60905o;
import jq3.C9500j;
import nj3.C76874e0;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderImmersiveImageUIC$presenter$1 */
public final class FinderImmersiveImageUIC$presenter$1 extends FinderFeedDetailUIContract$Presenter {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderImmersiveImageUIC$presenter$1(AppCompatActivity appCompatActivity) {
        super(2, (MMActivity) appCompatActivity, false, false, false, 28, (C8480h) null);
        C87412m.m108592e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
    }

    /* renamed from: U */
    public C9500j mo2488U() {
        return new FinderImmersiveImageUIC$presenter$1$buildItemCoverts$1();
    }

    /* renamed from: o */
    public void mo2494o() {
    }

    public void requestRefresh() {
    }

    /* renamed from: t */
    public void mo2496t(BaseFinderFeed baseFinderFeed, C76874e0 e0Var, C77407n nVar, C60905o oVar) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(e0Var, "menu");
        C87412m.m108594g(nVar, "sheet");
        C87412m.m108594g(oVar, "holder");
        if (mo10275L0(baseFinderFeed) && !C58739j4.f168176a.mo83686O(baseFinderFeed)) {
            e0Var.mo107135b(108, C0966R.string.f7944x1, C0966R.raw.icons_outlined_delete);
            MMActivity mMActivity = this.f29961d;
            C87412m.m108594g(mMActivity, "context");
            if (baseFinderFeed.mo3513o().isCommentClose() || !C58784w3.f168295a.mo83889N0()) {
                e0Var.mo107144g(107, mMActivity.getString(C0966R.string.d9v), C0966R.raw.icons_outlined_comment);
            } else {
                e0Var.mo107144g(106, mMActivity.getString(C0966R.string.d8r), C0966R.raw.icons_outlined_comment_close);
            }
        }
        super.mo2496t(baseFinderFeed, e0Var, nVar, oVar);
        e0Var.removeItem(ITPEventID.RICH_MEDIA_SYNCHRONIZER_DESELECT_DONE);
    }
}
