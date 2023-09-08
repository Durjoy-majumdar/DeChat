package mo1;

import android.content.Context;
import android.text.SpannableString;
import android.view.MotionEvent;
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
import fe1.C58961d;
import fe1.C58969q;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import io1.C9228a;
import je1.C60811w;
import p629ny.C76979h;
import rx3.C13598b0;
import tc2.C118418g;
import te3.C49712hj1;
import te3.C64414h71;

/* renamed from: mo1.d1 */
public final class C10989d1 extends C87413o implements C32226l<View, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ boolean[] f32694d;

    /* renamed from: e */
    public final /* synthetic */ FinderProfileHeaderUIC f32695e;

    /* renamed from: f */
    public final /* synthetic */ boolean f32696f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10989d1(boolean[] zArr, FinderProfileHeaderUIC finderProfileHeaderUIC, boolean z) {
        super(1);
        this.f32694d = zArr;
        this.f32695e = finderProfileHeaderUIC;
        this.f32696f = z;
    }

    public Object invoke(Object obj) {
        C87412m.m108594g((View) obj, LocaleUtil.ITALIAN);
        boolean[] zArr = this.f32694d;
        if (zArr[0]) {
            zArr[0] = false;
        } else {
            C118418g gVar = C118418g.INSTANCE;
            gVar.w40("ce_feed_follow", "<FeedFollow>");
            gVar.mo175827n9("ce_feed_follow", MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 65535));
            gVar.ec0("ce_feed_follow");
        }
        C39818r rVar = C39818r.f106831a;
        ((C58417y0) C86312j.m106911c(C58417y0.class)).ty0(this.f32695e.f16213S0, 1, C31543z5.m39455e(), this.f32696f ? 1 : 0, ((FinderProfileFeedUIC) rVar.mo62445d(((FinderProfileTabUIC) rVar.mo62444c(this.f32695e.getActivity()).mo75002a(FinderProfileTabUIC.class)).mo78520h4(FinderProfileFeedFragment.class)).mo75002a(FinderProfileFeedUIC.class)).getState() == FinderProfileFeedLoader.State.PRIVATE_LOCK ? 1 : 0);
        String stringExtra = this.f32695e.getIntent().getStringExtra("follow_participant_finder_username");
        if (stringExtra == null) {
            stringExtra = "";
        }
        String str = stringExtra;
        FinderProfileHeaderUIC finderProfileHeaderUIC = this.f32695e;
        C49712hj1 contextObj = finderProfileHeaderUIC.getContextObj();
        FinderProfileHeaderUIC finderProfileHeaderUIC2 = this.f32695e;
        String str2 = finderProfileHeaderUIC2.f16213S0;
        int i = C60811w.f173196u;
        FinderProfileHeaderUIC.m3566f3(finderProfileHeaderUIC, contextObj, str2, 1, finderProfileHeaderUIC2.f16215T0, this.f32696f, str, (C64414h71) null, 64, (Object) null);
        this.f32695e.mo3813P3();
        this.f32695e.mo3812N3("setUnFollow");
        if (C58739j4.f168176a.mo83680I(C58961d.f168673a.mo84155b(this.f32695e.f16213S0))) {
            this.f32695e.mo3823e3(false, false);
        }
        C9228a aVar = this.f32695e.f16223X0;
        C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
        Context context = this.f32695e.f16238h.getContext();
        C58969q profileContact = this.f32695e.getProfileContact();
        SpannableString T1 = hVar.mo107057T1(context, profileContact != null ? profileContact.mo84196w1() : null);
        String K3 = this.f32695e.mo3809K3();
        aVar.getClass();
        aVar.mo10019b(T1, K3, true);
        return C13598b0.f38549a;
    }
}
