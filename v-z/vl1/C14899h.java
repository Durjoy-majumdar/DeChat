package vl1;

import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.lottery.history.FinderLotteryListContract$Presenter;
import com.tencent.p014mm.plugin.finder.presenter.contract.BaseFinderLotteryContract;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;

/* renamed from: vl1.h */
public final class C14899h extends BaseFinderLotteryContract.ViewCallback {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14899h(MMActivity mMActivity, FinderLotteryListContract$Presenter finderLotteryListContract$Presenter, boolean z) {
        super(mMActivity, finderLotteryListContract$Presenter, z);
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(finderLotteryListContract$Presenter, "presenter");
    }
}
