package mo1;

import ak1.C54067f0;
import android.view.MenuItem;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import gy3.C87412m;
import ht1.C8761d3;
import ht1.C8777j5;
import nj3.C11184p0;
import rx3.C36570n;

/* renamed from: mo1.h */
public final class C11003h implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C10943a f32718d;

    public C11003h(C10943a aVar) {
        this.f32718d = aVar;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        Class cls = C8777j5.class;
        Class cls2 = C58417y0.class;
        int itemId = menuItem.getItemId();
        if (itemId == 10012) {
            ((C58417y0) C86312j.m106911c(cls2)).By0(this.f32718d.getActivity(), 2, 2);
            C10943a.m10948d3(this.f32718d);
        } else if (itemId == 10013) {
            ((C58417y0) C86312j.m106911c(cls2)).By0(this.f32718d.getActivity(), 2, 3);
            C54067f0 config = ((C8777j5) C86312j.m106911c(cls)).getConfig();
            C54067f0.C0063l0 l0Var = C54067f0.C0063l0.FINDER_PROFILE_RIGHT_CORNER;
            config.getClass();
            config.f151422D = l0Var;
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
            C8777j5.C8778a.m8600a((C8777j5) c, 2, "", (String) null, 4, (Object) null);
            ((C8761d3) ((C36570n) this.f32718d.f32622N).getValue()).mo9583A0();
        }
    }
}
