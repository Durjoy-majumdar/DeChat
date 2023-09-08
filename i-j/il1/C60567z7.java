package il1;

import ak1.C54116w;
import android.view.View;
import cl1.C54991o;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import te3.C64247az0;

/* renamed from: il1.z7 */
public final class C60567z7 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C60362c7 f172642d;

    /* renamed from: e */
    public final /* synthetic */ C64247az0 f172643e;

    public C60567z7(C60362c7 c7Var, C64247az0 az02) {
        this.f172642d = c7Var;
        this.f172643e = az02;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$showNewGuide$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_GAME_TEAM_JOIN_GUIDE_SHOW_BOOLEAN_SYNC, Boolean.TRUE);
        ((C54991o) this.f172642d.f172118c.mo87696x0(C54991o.class)).f154195E1 = true;
        this.f172642d.mo85336k();
        C54116w wVar = (C54116w) C86312j.m106911c(C54116w.class);
        C60362c7 c7Var = this.f172642d;
        C64247az0 az02 = this.f172643e;
        wVar.fy0(c7Var.mo85334i(az02 != null ? az02.f182185o : 0, 18));
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$showNewGuide$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
