package mo1;

import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileEmojiFragment;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileTabUIC;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTabUIC;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: mo1.y1 */
public final class C61548y1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderProfileTabUIC f174947d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61548y1(FinderProfileTabUIC finderProfileTabUIC) {
        super(0);
        this.f174947d = finderProfileTabUIC;
    }

    public Object invoke() {
        if (!this.f174947d.mo80059k3(112)) {
            FinderProfileTabUIC finderProfileTabUIC = this.f174947d;
            FinderProfileTabUIC.C3524c cVar = new FinderProfileTabUIC.C3524c(C0966R.string.ek5);
            cVar.f174601b = 70;
            FinderTabUIC.m65395f3(finderProfileTabUIC, cVar, new FinderProfileEmojiFragment(), false, 4, (Object) null);
            C39622i0 a = C39818r.f106831a.mo62444c(this.f174947d.getActivity()).mo75002a(C11025q.class);
            C87412m.m108593f(a, "UICProvider.of(activity)…rofileEduUIC::class.java)");
            C11025q.m10965k3((C11025q) a, "tab_profile_emoji", 0, (String) null, 0, (String) null, 30, (Object) null);
        }
        return C13598b0.f38549a;
    }
}
