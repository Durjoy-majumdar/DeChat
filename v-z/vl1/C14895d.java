package vl1;

import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.lottery.history.FinderLotteryAnchorAllHistoryContract$Presenter;
import com.tencent.p014mm.plugin.finder.presenter.contract.BaseFinderLotteryContract;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;

/* renamed from: vl1.d */
public final class C14895d extends BaseFinderLotteryContract.ViewCallback {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14895d(MMActivity mMActivity, FinderLotteryAnchorAllHistoryContract$Presenter finderLotteryAnchorAllHistoryContract$Presenter, boolean z) {
        super(mMActivity, finderLotteryAnchorAllHistoryContract$Presenter, z);
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(finderLotteryAnchorAllHistoryContract$Presenter, "presenter");
    }
}
