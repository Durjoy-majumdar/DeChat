package zk1;

import bl3.C39818r;
import com.tencent.p014mm.autogen.events.FinderSquareLiveViewLayoutEvent;
import com.tencent.p014mm.plugin.finder.live.fragment.FinderLiveVisitorFragment;
import com.tencent.p014mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import jj1.C60874a;
import ph1.C62291f;
import ph1.C62297m;
import rx3.C13598b0;

/* renamed from: zk1.d */
public final class C66873d extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C62297m f192105d;

    /* renamed from: e */
    public final /* synthetic */ FinderLiveExitAnimateOpUIC f192106e;

    /* renamed from: f */
    public final /* synthetic */ FinderLiveVisitorFragment f192107f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66873d(C62297m mVar, FinderLiveExitAnimateOpUIC finderLiveExitAnimateOpUIC, FinderLiveVisitorFragment finderLiveVisitorFragment) {
        super(0);
        this.f192105d = mVar;
        this.f192106e = finderLiveExitAnimateOpUIC;
        this.f192107f = finderLiveVisitorFragment;
    }

    public Object invoke() {
        if (this.f192105d instanceof C62291f) {
            FinderSquareLiveViewLayoutEvent finderSquareLiveViewLayoutEvent = new FinderSquareLiveViewLayoutEvent();
            finderSquareLiveViewLayoutEvent.f154812d.f154813a = this.f192106e.f160018j;
            finderSquareLiveViewLayoutEvent.publish();
        }
        Log.m105924i(this.f192106e.f160012d, "onDirectorExit start finish");
        C60874a d3 = ((C66881u0) C39818r.f106831a.mo62445d(this.f192107f).mo75002a(C66881u0.class)).mo90880d3();
        if (d3 != null) {
            d3.mo84886a(true);
        }
        this.f192106e.mo78201d3("onDirectorExit");
        return C13598b0.f38549a;
    }
}
