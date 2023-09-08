package ok1;

import ak1.C54067f0;
import ak1.C54108o;
import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.xweb.WCWebUpdater;
import di3.C7335d;
import di3.C86312j;
import fe1.C58969q;
import gy3.C87412m;
import ht1.C8777j5;
import java.util.Map;
import nj3.C11182m0;
import nj3.C76874e0;
import rx3.C13604l;
import sx3.C90364q0;
import te3.C49083d21;
import te3.C49712hj1;
import te3.C50124kf1;
import te3.C64273c21;
import z04.C112551y;
import zc1.C66785b;

/* renamed from: ok1.k */
public final class C11462k implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ BaseFinderFeed f33707d;

    /* renamed from: e */
    public final /* synthetic */ int f33708e;

    /* renamed from: f */
    public final /* synthetic */ Context f33709f;

    /* renamed from: g */
    public final /* synthetic */ C49712hj1 f33710g;

    public C11462k(BaseFinderFeed baseFinderFeed, int i, Context context, C49712hj1 hj12) {
        this.f33707d = baseFinderFeed;
        this.f33708e = i;
        this.f33709f = context;
        this.f33710g = hj12;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        C49083d21 d212;
        C76874e0 e0Var2 = e0Var;
        C62042e eVar = C62042e.f176370a;
        BaseFinderFeed baseFinderFeed = this.f33707d;
        eVar.getClass();
        C58969q l = baseFinderFeed.mo3507l();
        String str = null;
        boolean z = false;
        if (!C112551y.m153810j(l != null ? l.field_username : null, C66785b.f191882e.mo90662O5(), false, 2, (Object) null)) {
            int i = this.f33708e;
            if (!(i == 3 || i == 1)) {
                e0Var2.mo107144g(99, this.f33709f.getString(C0966R.string.gvx), C0966R.raw.finder_live_dislike);
                C7335d c = C86312j.m106911c(C54108o.class);
                C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                C8777j5 j5Var = (C8777j5) c;
                C54067f0.C0066n nVar = C54067f0.C0066n.PANEL_UNLIKE_BUTTON;
                C13604l[] lVarArr = new C13604l[4];
                C64273c21 liveInfo = this.f33707d.mo3513o().getLiveInfo();
                lVarArr[0] = new C13604l("liveId", String.valueOf(liveInfo != null ? Long.valueOf(liveInfo.f182392d) : null));
                lVarArr[1] = new C13604l("feedId", String.valueOf(this.f33707d.mo3513o().getFeedObject().f164794id));
                lVarArr[2] = new C13604l("panel_sence", this.f33708e == 1005 ? "2" : WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL);
                lVarArr[3] = new C13604l("sessionBuffer", this.f33707d.mo3526z());
                Map g = C90364q0.m113148g(lVarArr);
                C49712hj1 hj12 = this.f33710g;
                C8777j5.C8778a.m8609j(j5Var, nVar, g, hj12 != null ? hj12.f134671e : null, String.valueOf(hj12 != null ? Integer.valueOf(hj12.f134675i) : null), (String) null, 16, (Object) null);
            }
            e0Var2.mo107144g(101, this.f33709f.getString(C0966R.string.gvt), C0966R.raw.icons_outlined_report_problem);
        }
        C50124kf1 kf12 = this.f33707d.mo3513o().getFeedObject().object_extend;
        if (!(kf12 == null || (d212 = kf12.f136759u) == null)) {
            str = d212.f132074d;
        }
        if (str == null || str.length() == 0) {
            z = true;
        }
        if (!z) {
            e0Var2.mo107144g(211, "统计(内部)", C0966R.raw.icons_outlined_more2);
        }
    }
}
