package il1;

import ak1.C54116w;
import android.view.View;
import cl1.C54991o;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import qj1.C63084w6;
import te3.C64247az0;

/* renamed from: il1.y7 */
public final class C60555y7 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C60362c7 f172599d;

    /* renamed from: e */
    public final /* synthetic */ C64247az0 f172600e;

    public C60555y7(C60362c7 c7Var, C64247az0 az02) {
        this.f172599d = c7Var;
        this.f172600e = az02;
    }

    public final void onClick(View view) {
        C60491p4 p4Var;
        Class cls = C54991o.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$showNewGuide$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C63084w6 w6Var = (C63084w6) this.f172599d.f172118c.mo87687E0(C63084w6.class);
        if (!(w6Var == null || (p4Var = w6Var.f179023q) == null)) {
            p4Var.mo85445a();
        }
        this.f172599d.mo85336k();
        ((C54991o) this.f172599d.f172118c.mo87696x0(cls)).f154195E1 = true;
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_GAME_TEAM_JOIN_GUIDE_SHOW_BOOLEAN_SYNC, Boolean.TRUE);
        if (((C54991o) this.f172599d.f172118c.mo87696x0(cls)).f154363s1 != null) {
            this.f172599d.mo85330e();
        }
        C54116w wVar = (C54116w) C86312j.m106911c(C54116w.class);
        C60362c7 c7Var = this.f172599d;
        C64247az0 az02 = this.f172600e;
        wVar.fy0(c7Var.mo85334i(az02 != null ? az02.f182185o : 0, 18));
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$showNewGuide$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
