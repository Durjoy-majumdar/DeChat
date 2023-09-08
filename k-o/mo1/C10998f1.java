package mo1;

import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.feed.model.FinderProfileFeedLoader;
import com.tencent.p014mm.plugin.finder.profile.FinderProfileFeedFragment;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileFeedUIC;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileTabUIC;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import di3.C86312j;
import dp1.C58417y0;
import eb0.C31543z5;
import er1.C58739j4;
import fe1.C58969q;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import io1.C9228a;
import je1.C60811w;
import p629ny.C76979h;
import rx3.C13598b0;
import te3.C49712hj1;
import te3.C64414h71;

/* renamed from: mo1.f1 */
public final class C10998f1 extends C87413o implements C32226l<View, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderProfileHeaderUIC f32708d;

    /* renamed from: e */
    public final /* synthetic */ C58969q f32709e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10998f1(FinderProfileHeaderUIC finderProfileHeaderUIC, C58969q qVar) {
        super(1);
        this.f32708d = finderProfileHeaderUIC;
        this.f32709e = qVar;
    }

    public Object invoke(Object obj) {
        C87412m.m108594g((View) obj, LocaleUtil.ITALIAN);
        C39818r rVar = C39818r.f106831a;
        ((C58417y0) C86312j.m106911c(C58417y0.class)).ty0(this.f32708d.f16213S0, 2, C31543z5.m39455e(), C58739j4.f168176a.mo83688Q(this.f32709e) ? 1 : 0, ((FinderProfileFeedUIC) rVar.mo62445d(((FinderProfileTabUIC) rVar.mo62444c(this.f32708d.getActivity()).mo75002a(FinderProfileTabUIC.class)).mo78520h4(FinderProfileFeedFragment.class)).mo75002a(FinderProfileFeedUIC.class)).getState() == FinderProfileFeedLoader.State.PRIVATE_LOCK ? 1 : 0);
        FinderProfileHeaderUIC finderProfileHeaderUIC = this.f32708d;
        C49712hj1 contextObj = finderProfileHeaderUIC.getContextObj();
        String str = this.f32708d.f16213S0;
        int i = C60811w.f173196u;
        FinderProfileHeaderUIC.m3566f3(finderProfileHeaderUIC, contextObj, str, 3, 0, false, (String) null, (C64414h71) null, 120, (Object) null);
        this.f32708d.mo3813P3();
        this.f32708d.mo3812N3("setWaiting");
        C9228a aVar = this.f32708d.f16223X0;
        C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
        Context context = this.f32708d.f16238h.getContext();
        C58969q profileContact = this.f32708d.getProfileContact();
        SpannableString T1 = hVar.mo107057T1(context, profileContact != null ? profileContact.mo84196w1() : null);
        String K3 = this.f32708d.mo3809K3();
        aVar.getClass();
        aVar.mo10019b(T1, K3, true);
        return C13598b0.f38549a;
    }
}
