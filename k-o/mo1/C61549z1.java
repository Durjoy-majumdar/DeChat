package mo1;

import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileMusicFragment;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileTabUIC;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTabUIC;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: mo1.z1 */
public final class C61549z1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderProfileTabUIC f174948d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61549z1(FinderProfileTabUIC finderProfileTabUIC) {
        super(0);
        this.f174948d = finderProfileTabUIC;
    }

    public Object invoke() {
        int i;
        if (!this.f174948d.mo80059k3(108)) {
            int n3 = this.f174948d.mo80060n3();
            int i2 = this.f174948d.isSelf() ? 2 : 1;
            FinderProfileTabUIC finderProfileTabUIC = this.f174948d;
            FinderProfileTabUIC.C3524c cVar = new FinderProfileTabUIC.C3524c(C0966R.string.ekn);
            cVar.f174601b = 40;
            C13598b0 b0Var = C13598b0.f38549a;
            FinderTabUIC.m65394e3(finderProfileTabUIC, i2, cVar, new FinderProfileMusicFragment(), false, 8, (Object) null);
            C39622i0 a = C39818r.f106831a.mo62444c(this.f174948d.getActivity()).mo75002a(C11025q.class);
            C87412m.m108593f(a, "UICProvider.of(activity)…rofileEduUIC::class.java)");
            C11025q.m10965k3((C11025q) a, "mvtab", 0, (String) null, 0, (String) null, 30, (Object) null);
            if (n3 >= 1 && (i = n3 + 1) < this.f174948d.mo80041M3().size()) {
                this.f174948d.mo80050Z3(i, true);
            }
        }
        return C13598b0.f38549a;
    }
}
