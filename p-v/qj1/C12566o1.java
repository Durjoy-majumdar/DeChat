package qj1;

import ak1.C0073g0;
import ak1.C54108o;
import android.content.Context;
import android.view.View;
import di3.C86312j;
import eb0.C75592q0;
import fy3.C32229r;
import gy3.C87412m;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import o40.C61926c;
import ok1.C62042e;
import org.json.JSONObject;
import pe3.C89349b;
import qg1.C47824c0;
import rx3.C13598b0;
import te3.C49712hj1;
import te3.C50131kh1;
import te3.C50728ot0;
import te3.C52013xs0;

/* renamed from: qj1.o1 */
public final class C12566o1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C12690u1 f36064d;

    public C12566o1(C12690u1 u1Var) {
        this.f36064d = u1Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLikePlugin$likeIconChangeToApplaud$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C54108o oVar = (C54108o) C86312j.m106911c(C54108o.class);
        oVar.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sub_action", 2);
        C8777j5.C8778a.m8605f(oVar, C0073g0.ANCHOR_APPLAUD, jSONObject.toString(), (String) null, 4, (Object) null);
        C12690u1 u1Var = this.f36064d;
        u1Var.f36360E = false;
        View view2 = u1Var.f36367v;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLikePlugin$likeIconChangeToApplaud$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLikePlugin$likeIconChangeToApplaud$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view3 = this.f36064d.f36369x;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLikePlugin$likeIconChangeToApplaud$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLikePlugin$likeIconChangeToApplaud$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C12690u1 u1Var2 = this.f36064d;
        u1Var2.getClass();
        C61926c.m72668M(new C12540n1(u1Var2, true));
        C62042e eVar = C62042e.f176370a;
        Context context = this.f36064d.f166287d.getContext();
        C87412m.m108593f(context, "root.context");
        eVar.mo86990A1(context);
        this.f36064d.f36367v.setOnClickListener((View.OnClickListener) null);
        C52013xs0 xs02 = new C52013xs0();
        C50728ot0 ot02 = new C50728ot0();
        ot02.f139357d = 1;
        xs02.f144906h = C89349b.m111674a(ot02.toByteArray());
        xs02.f144903e = 20041;
        xs02.f144904f = C75592q0.m90789s() + System.currentTimeMillis();
        new C47824c0(xs02, this.f36064d.mo87684A0(), (C49712hj1) null, (C32229r<? super Integer, ? super Integer, ? super String, ? super C50131kh1, C13598b0>) null).mo9225i();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLikePlugin$likeIconChangeToApplaud$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
