package com.tencent.p014mm.plugin.finder.presenter.contract;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import er1.C58784w3;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import nj3.C76874e0;
import qo3.C77407n;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo182094d2 = {"Ler1/w3$a;", "actionMenuInfo", "Lrx3/b0;", "invoke", "(Ler1/w3$a;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$getCreateMoreMenuListener$1$actionMenuInfo$2 */
public final class C3396x756748eb extends C87413o implements C32226l<C58784w3.C7912a, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C76874e0 f16006d;

    /* renamed from: e */
    public final /* synthetic */ MMActivity f16007e;

    /* renamed from: f */
    public final /* synthetic */ C77407n f16008f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3396x756748eb(C76874e0 e0Var, MMActivity mMActivity, C77407n nVar) {
        super(1);
        this.f16006d = e0Var;
        this.f16007e = mMActivity;
        this.f16008f = nVar;
    }

    public Object invoke(Object obj) {
        C58784w3.C7912a aVar = (C58784w3.C7912a) obj;
        C87412m.m108594g(aVar, "actionMenuInfo");
        if (!aVar.f26590l && this.f16006d.findItem(208) == null) {
            this.f16006d.mo107150j(208, aVar.f26586h, C0966R.raw.bottomsheet_icon_wework, 0, aVar.f26582d);
            C58784w3.f168295a.mo83895P1(this.f16007e, this.f16008f);
        }
        return C13598b0.f38549a;
    }
}
