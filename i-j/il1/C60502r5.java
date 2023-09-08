package il1;

import ak1.C0073g0;
import ak1.C54108o;
import android.view.View;
import cj1.C54795n5;
import cl1.C54963d0;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import di3.C7335d;
import di3.C86312j;
import gy3.C8478d0;
import gy3.C87412m;
import ht1.C8777j5;
import il1.C60516s5;
import j20.C117292a;
import java.util.ArrayList;
import o40.C61926c;
import qj1.C62695d2;
import qj1.C62755e2;
import qj1.C63068w1;

/* renamed from: il1.r5 */
public final class C60502r5 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C60516s5 f172452d;

    /* renamed from: e */
    public final /* synthetic */ C60516s5.C33358b f172453e;

    public C60502r5(C60516s5 s5Var, C60516s5.C33358b bVar) {
        this.f172452d = s5Var;
        this.f172453e = bVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveMicConditionWidget$MicConditionAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        for (C60516s5.C33358b bVar : this.f172452d.f172492j) {
            bVar.f90410b = false;
        }
        this.f172453e.f90410b = true;
        this.f172452d.mo85485a();
        C63068w1 w1Var = this.f172452d.f172488f;
        C60516s5.C33358b bVar2 = this.f172453e;
        w1Var.getClass();
        Class cls = C55001u.class;
        Class cls2 = C54963d0.class;
        C0073g0 g0Var = C0073g0.LINKMIC_SWITCH;
        Class cls3 = C54108o.class;
        C87412m.m108594g(bVar2, "micConditionInfo");
        C8478d0 d0Var = new C8478d0();
        d0Var.f27483d = (int) ((C54963d0) w1Var.mo87696x0(cls2)).f154048B.f144323d;
        String str = bVar2.f90409a;
        if (C87412m.m108589b(str, w1Var.f166287d.getContext().getResources().getString(C0966R.string.dwa))) {
            C7335d c = C86312j.m106911c(cls3);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8605f((C8777j5) c, g0Var, String.valueOf(4), (String) null, 4, (Object) null);
            d0Var.f27483d = 1 | (d0Var.f27483d & -5 & -3);
        } else if (C87412m.m108589b(str, w1Var.f166287d.getContext().getResources().getString(C0966R.string.dw8))) {
            C7335d c2 = C86312j.m106911c(cls3);
            C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8605f((C8777j5) c2, g0Var, String.valueOf(5), (String) null, 4, (Object) null);
            d0Var.f27483d = (d0Var.f27483d & -5 & -2) | 2;
        } else if (C87412m.m108589b(str, w1Var.f166287d.getContext().getResources().getString(C0966R.string.dw6))) {
            C7335d c3 = C86312j.m106911c(cls3);
            C87412m.m108593f(c3, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8605f((C8777j5) c3, g0Var, String.valueOf(7), (String) null, 4, (Object) null);
            d0Var.f27483d = (d0Var.f27483d & -2 & -3) | 4;
        } else {
            C7335d c4 = C86312j.m106911c(cls3);
            C87412m.m108593f(c4, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8605f((C8777j5) c4, g0Var, String.valueOf(3), (String) null, 4, (Object) null);
            d0Var.f27483d = d0Var.f27483d & -5 & -2 & -3;
        }
        w1Var.f178983G.mo88125F4((long) d0Var.f27483d);
        C61926c.m72668M(new C62695d2(w1Var, d0Var));
        C54795n5 D0 = w1Var.mo14476D0();
        if (D0 != null) {
            D0.mo75728c0(((C55001u) w1Var.mo87696x0(cls)).f154420q.f182392d, ((C55001u) w1Var.mo87696x0(cls)).f154416j, (long) d0Var.f27483d, ((C54963d0) w1Var.mo87696x0(cls2)).f154048B.f144325f, new C62755e2(w1Var));
        }
        w1Var.f178982F.mo3431p();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveMicConditionWidget$MicConditionAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
