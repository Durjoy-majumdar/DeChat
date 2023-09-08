package vf1;

import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveAnchorCommentManagerUI;
import com.tencent.p014mm.plugin.finder.live.widget.FinderLiveMemebrProfileWidget;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: vf1.j1 */
public final class C65707j1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveAnchorCommentManagerUI f189053d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65707j1(FinderLiveAnchorCommentManagerUI finderLiveAnchorCommentManagerUI) {
        super(0);
        this.f189053d = finderLiveAnchorCommentManagerUI;
    }

    public Object invoke() {
        FinderLiveMemebrProfileWidget finderLiveMemebrProfileWidget = this.f189053d.f158938u;
        if (finderLiveMemebrProfileWidget != null) {
            finderLiveMemebrProfileWidget.mo9763a();
        }
        return C13598b0.f38549a;
    }
}
