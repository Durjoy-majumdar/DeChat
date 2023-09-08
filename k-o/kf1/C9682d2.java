package kf1;

import com.tencent.p014mm.autogen.events.FeedUpdateEvent;
import com.tencent.p014mm.plugin.finder.feed.FinderFeedDetailUIContract$Presenter;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;
import rx3.C13604l;

/* renamed from: kf1.d2 */
public final class C9682d2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderFeedDetailUIContract$Presenter f30070d;

    /* renamed from: e */
    public final /* synthetic */ FeedUpdateEvent f30071e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9682d2(FinderFeedDetailUIContract$Presenter finderFeedDetailUIContract$Presenter, FeedUpdateEvent feedUpdateEvent) {
        super(0);
        this.f30070d = finderFeedDetailUIContract$Presenter;
        this.f30071e = feedUpdateEvent;
    }

    public Object invoke() {
        C9707f fVar;
        C9707f fVar2;
        C9707f fVar3;
        String N = this.f30070d.mo2546N();
        Log.m105924i(N, "feedChangeListener " + this.f30071e.f9173d.f9174a);
        if (this.f30070d.f13027t.size() > 0) {
            long itemId = this.f30070d.f13027t.get(0).getItemId();
            FeedUpdateEvent.C1041a aVar = this.f30071e.f9173d;
            long j = aVar.f9174a;
            if (itemId == j && j != 0) {
                int i = aVar.f9175b;
                if (i == 0) {
                    C9707f fVar4 = this.f30070d.f29964g;
                    if (fVar4 != null) {
                        fVar4.mo10312p().notifyItemRangeChanged(0, 1, 1);
                    }
                } else if (i == 4) {
                    C9707f fVar5 = this.f30070d.f29964g;
                    if (fVar5 != null) {
                        fVar5.mo10312p().notifyItemRangeChanged(0, 1, new C13604l(3, 1));
                    }
                    if (this.f30071e.f9173d.f9185l > 0 && (fVar = this.f30070d.f29964g) != null) {
                        fVar.mo10312p().notifyItemRangeChanged(0, 1, new C13604l(35, this.f30071e));
                    }
                } else if (i == 5) {
                    C9707f fVar6 = this.f30070d.f29964g;
                    if (fVar6 != null) {
                        fVar6.mo10312p().notifyItemRangeChanged(0, 1, new C13604l(4, 1));
                    }
                    if (this.f30071e.f9173d.f9185l > 0 && (fVar2 = this.f30070d.f29964g) != null) {
                        fVar2.mo10312p().notifyItemRangeChanged(0, 1, new C13604l(35, this.f30071e));
                    }
                } else if (i == 25) {
                    C9707f fVar7 = this.f30070d.f29964g;
                    if (fVar7 != null) {
                        fVar7.mo10312p().notifyItemRangeChanged(0, 1, new C13604l(31, this.f30071e));
                    }
                } else if (i == 26 && (fVar3 = this.f30070d.f29964g) != null) {
                    fVar3.mo10312p().notifyItemRangeChanged(0, 1, new C13604l(32, this.f30071e));
                }
            }
        }
        return C13598b0.f38549a;
    }
}
