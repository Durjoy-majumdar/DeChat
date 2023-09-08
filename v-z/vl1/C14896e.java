package vl1;

import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.lottery.history.FinderLotteryHistoryContract$Presenter;
import com.tencent.p014mm.plugin.finder.presenter.contract.BaseFinderLotteryContract;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;

/* renamed from: vl1.e */
public final class C14896e extends BaseFinderLotteryContract.ViewCallback {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14896e(MMActivity mMActivity, FinderLotteryHistoryContract$Presenter finderLotteryHistoryContract$Presenter, boolean z) {
        super(mMActivity, finderLotteryHistoryContract$Presenter, z);
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(finderLotteryHistoryContract$Presenter, "presenter");
    }
}
