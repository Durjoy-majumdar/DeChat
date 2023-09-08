package v82;

import android.graphics.Color;
import android.view.View;
import c92.C104328f;
import c92.C104331h;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.multitalk.model.C105851w0;
import com.tencent.p014mm.plugin.multitalk.model.C105853x;
import com.tencent.p014mm.plugin.newtips.model.C115627l;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import p626nv.C109759g;
import qo3.C101218e0;

/* renamed from: v82.k0 */
public final class C111469k0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C111456j0 f333729d;

    public C111469k0(C111456j0 j0Var) {
        this.f333729d = j0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic$checkScreenProjector$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C111456j0 j0Var = this.f333729d;
        j0Var.getClass();
        Log.m105924i("MicroMsg.MT.MultiTalkNewTalkingUILogic", "onScreenCastClicked: ");
        C104328f fVar = C104328f.f308805a;
        C104328f.f308808d = System.currentTimeMillis();
        fVar.mo146025b(1, 1);
        if (!C104331h.m139310a()) {
            if (j0Var.mo163156g().getVisibility() != 0) {
                C101218e0 e0Var = new C101218e0(j0Var.f333691a, 2, 3, false);
                e0Var.mo140677w(j0Var.f333691a.getResources().getString(C0966R.string.f8028zq));
                e0Var.mo140676v(1);
                e0Var.mo140678x(Color.parseColor("#07C160"));
                e0Var.mo140662i(C0966R.C0971layout.bur);
                e0Var.f296375F = new C111481o0(e0Var, j0Var);
                e0Var.mo140655A();
            } else {
                View g = j0Var.mo163156g();
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = g;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "onScreenCastClicked", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                g.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "onScreenCastClicked", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C101218e0 e0Var2 = new C101218e0(j0Var.f333691a, 1, 3, false);
                e0Var2.mo140667n(j0Var.f333691a.getResources().getString(C0966R.string.f7926wf), j0Var.f333691a.getResources().getString(C0966R.string.ifi));
                e0Var2.mo140675u(Color.parseColor("#07C160"));
                e0Var2.mo140668o(0);
                e0Var2.mo140662i(C0966R.C0971layout.bur);
                C111483p0 p0Var = new C111483p0(e0Var2);
                C111485q0 q0Var = new C111485q0(e0Var2, j0Var);
                e0Var2.f296373D = p0Var;
                e0Var2.f296374E = q0Var;
                e0Var2.mo140655A();
            }
            ((C115627l) ((C109759g) C86312j.m106911c(C109759g.class)).V40()).mo175762a(35);
            MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("mmkv_screen_project_info");
            C87412m.m108593f(mmkv, "getMMKV(KV_NAME)");
            mmkv.putBoolean("screen_project_has_been_educated", true);
        } else {
            C105853x.f314828f++;
            if (C105851w0.zx0().f314506t != null) {
                String str = C105851w0.zx0().f314506t.f320042d;
            }
            Log.m105924i("MicroMsg.ScreenProjectReportHelper", "markClickFileScreenProject");
            C115669n.INSTANCE.mo175913w(1538, 0, 1);
            j0Var.f333691a.mo150870I7();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic$checkScreenProjector$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
