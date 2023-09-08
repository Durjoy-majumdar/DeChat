package mo1;

import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileDraftFragment;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileTabUIC;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTabUIC;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: mo1.x1 */
public final class C61547x1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderProfileTabUIC f174945d;

    /* renamed from: e */
    public final /* synthetic */ boolean f174946e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61547x1(FinderProfileTabUIC finderProfileTabUIC, boolean z) {
        super(0);
        this.f174945d = finderProfileTabUIC;
        this.f174946e = z;
    }

    public Object invoke() {
        if (!this.f174945d.mo80059k3(109)) {
            FinderProfileTabUIC finderProfileTabUIC = this.f174945d;
            FinderProfileTabUIC.C3524c cVar = new FinderProfileTabUIC.C3524c(C0966R.string.f360762ek1);
            cVar.f174601b = 30;
            C13598b0 b0Var = C13598b0.f38549a;
            FinderTabUIC.m65394e3(finderProfileTabUIC, 1, cVar, new FinderProfileDraftFragment(this.f174946e), false, 8, (Object) null);
            C39622i0 a = C39818r.f106831a.mo62444c(this.f174945d.getActivity()).mo75002a(C11025q.class);
            C87412m.m108593f(a, "UICProvider.of(activity)…rofileEduUIC::class.java)");
            C11025q.m10965k3((C11025q) a, "drafttab", 0, (String) null, 0, (String) null, 30, (Object) null);
        }
        return C13598b0.f38549a;
    }
}
