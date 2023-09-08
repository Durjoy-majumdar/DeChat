package qj1;

import ak1.C54067f0;
import ak1.C54108o;
import android.content.Context;
import android.os.Bundle;
import bl3.C39818r;
import cj1.C54795n5;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.service.C3601l1;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import er1.C58739j4;
import fe1.C58969q;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60172g4;
import ht1.C8777j5;
import java.util.Map;
import nj3.C76912y0;
import rx3.C13598b0;
import te3.C49712hj1;
import te3.C64414h71;
import tf0.C64916p1;

/* renamed from: qj1.r6 */
public final class C12641r6 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C58969q f36223d;

    /* renamed from: e */
    public final /* synthetic */ C12543n6 f36224e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12641r6(C58969q qVar, C12543n6 n6Var) {
        super(0);
        this.f36223d = qVar;
        this.f36224e = n6Var;
    }

    public Object invoke() {
        Class cls = C55001u.class;
        C58969q qVar = this.f36223d;
        if (qVar != null) {
            C58739j4 j4Var = C58739j4.f168176a;
            boolean Q = j4Var.mo83688Q(qVar);
            boolean I = j4Var.mo83680I(this.f36223d);
            Log.m105924i("Finder.FinderLiveFollowGuidePlugin", "liveFollowGuideQuitBtnTv click, nickName:" + this.f36223d.getNickname() + ", isPrivate:" + Q + " , isBlock" + I);
            C7335d c = C86312j.m106911c(C64916p1.class);
            C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
            C64916p1 p1Var = (C64916p1) c;
            C39818r rVar = C39818r.f106831a;
            Context context = this.f36224e.f166287d.getContext();
            C87412m.m108593f(context, "root.context");
            C49712hj1 q3 = ((C60172g4) rVar.mo62443b(context).mo62447c(C60172g4.class)).mo12861q3();
            String username = this.f36223d.getUsername();
            long j = ((C55001u) this.f36224e.mo87696x0(cls)).f154416j;
            C54795n5 D0 = this.f36224e.mo14476D0();
            C64414h71 e0 = D0 != null ? D0.mo75732e0(((C55001u) this.f36224e.mo87696x0(cls)).f154420q.f182392d) : null;
            String str = "Finder.FinderLiveFollowGuidePlugin";
            C64916p1.C64917a.m76440g(p1Var, q3, username, 1, j, Q, (String) null, e0, 3, (Integer) null, 288, (Object) null);
            C76912y0.m92768g(this.f36224e.f166287d.getContext(), this.f36224e.f166287d.getContext().getString(C0966R.string.fje));
            if (I) {
                C12543n6 n6Var = this.f36224e;
                String username2 = this.f36223d.getUsername();
                n6Var.getClass();
                Log.m105924i(str, "[doBlockOpLog] ");
                n6Var.f36033q = new C12568o6();
                ((C3601l1) C86312j.m106911c(C3601l1.class)).Hu0(username2, false, n6Var.f36033q);
            }
        }
        C12543n6 n6Var2 = this.f36224e;
        n6Var2.mo10792g(8);
        n6Var2.f36032p.statusChange(C58124b.C58125b.FINDER_LIVE_CLOSE_LIVE_FROM_FOLLOW_GUIDE, (Bundle) null);
        C7335d c2 = C86312j.m106911c(C54108o.class);
        C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8606g((C8777j5) c2, C54067f0.C0064m.FOLLOW_GUIDE_LEAVE_FOLLOW, (Map) null, (String) null, 6, (Object) null);
        return C13598b0.f38549a;
    }
}
