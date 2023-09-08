package il1;

import ak1.C54116w;
import ak1.C54117x;
import androidx.lifecycle.C0120a0;
import cl1.C54991o;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import qj1.C63144yg;
import te3.C64247az0;

/* renamed from: il1.s6 */
public final class C60520s6<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C60528t6 f172497d;

    public C60520s6(C60528t6 t6Var) {
        this.f172497d = t6Var;
    }

    public void onChanged(Object obj) {
        C60362c7 c7Var;
        C64247az0 az02 = ((C54991o) this.f172497d.f172523c.mo87696x0(C54991o.class)).f154379w1;
        if (C87412m.m108589b((Boolean) obj, Boolean.TRUE)) {
            if (this.f172497d.f172521a.getVisibility() != 0) {
                C7335d c = C86312j.m106911c(C54116w.class);
                C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
                C54116w.gy0((C54116w) c, 1, 0, (String) null, az02 != null ? C54117x.m60831b(az02) : null, 6, (Object) null);
            }
            this.f172497d.f172521a.setVisibility(0);
        } else {
            this.f172497d.f172521a.setVisibility(8);
            C63144yg ygVar = (C63144yg) this.f172497d.f172523c.mo87687E0(C63144yg.class);
            if (!(ygVar == null || (c7Var = ygVar.f179181s) == null)) {
                c7Var.mo85335j(false);
            }
        }
        C60528t6 t6Var = this.f172497d;
        t6Var.f172521a.setOnClickListener(new C60503r6(az02, t6Var));
    }
}
