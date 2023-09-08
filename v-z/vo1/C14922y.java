package vo1;

import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.replay.FinderLiveReplayPresenter;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: vo1.y */
public final class C14922y extends C87413o implements C32226l<IResponse<C0740i2>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveReplayPresenter f40949d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14922y(FinderLiveReplayPresenter finderLiveReplayPresenter) {
        super(1);
        this.f40949d = finderLiveReplayPresenter;
    }

    public Object invoke(Object obj) {
        IResponse iResponse = (IResponse) obj;
        C87412m.m108594g(iResponse, LocaleUtil.ITALIAN);
        FinderLiveReplayPresenter finderLiveReplayPresenter = this.f40949d;
        finderLiveReplayPresenter.getClass();
        C61926c.m72668M(new C14923z(iResponse, "FinderProfileLiveUserPageLoader", finderLiveReplayPresenter));
        return C13598b0.f38549a;
    }
}
