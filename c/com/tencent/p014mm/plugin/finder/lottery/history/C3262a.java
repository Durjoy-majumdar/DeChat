package com.tencent.p014mm.plugin.finder.lottery.history;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.presenter.contract.BaseFinderLotteryContract;
import fy3.C32224a;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.lottery.history.a */
public final class C3262a extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ BaseFinderLotteryContract.ViewCallback f15486d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3262a(BaseFinderLotteryContract.ViewCallback viewCallback) {
        super(0);
        this.f15486d = viewCallback;
    }

    public Object invoke() {
        View findViewById = this.f15486d.f15885d.findViewById(C0966R.C0970id.cjg);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view = findViewById;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/presenter/contract/BaseFinderLotteryContract$ViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/presenter/contract/BaseFinderLotteryContract$ViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return C13598b0.f38549a;
    }
}
