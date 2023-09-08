package mo1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileQQMusicFragment;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileTabUIC;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: mo1.a2 */
public final class C61509a2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderProfileTabUIC f174862d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61509a2(FinderProfileTabUIC finderProfileTabUIC) {
        super(0);
        this.f174862d = finderProfileTabUIC;
    }

    public Object invoke() {
        int i;
        if (!this.f174862d.mo80059k3(111)) {
            int n3 = this.f174862d.mo80060n3();
            int i2 = 3;
            if (this.f174862d.mo80041M3().size() <= 3) {
                i2 = this.f174862d.mo80041M3().size();
            } else if (this.f174862d.isSelf()) {
                i2 = 4;
            }
            boolean z = false;
            if (5 == this.f174862d.getActivity().getIntent().getIntExtra("key_enter_profile_tab", 0)) {
                z = true;
            }
            FinderProfileTabUIC finderProfileTabUIC = this.f174862d;
            FinderProfileTabUIC.C3524c cVar = new FinderProfileTabUIC.C3524c(C0966R.string.eky);
            cVar.f174601b = 60;
            C13598b0 b0Var = C13598b0.f38549a;
            finderProfileTabUIC.mo80054d3(i2, cVar, new FinderProfileQQMusicFragment(), z);
            if (n3 >= 1 && (i = n3 + 1) < this.f174862d.mo80041M3().size()) {
                this.f174862d.mo80050Z3(i, true);
            }
        }
        return C13598b0.f38549a;
    }
}
