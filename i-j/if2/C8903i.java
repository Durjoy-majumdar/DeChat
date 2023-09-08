package if2;

import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.profile.p088ui.newbizinfo.auth.NewBizInfoAuthMainUI;
import gy3.C87412m;
import if2.C8894g;
import nj3.C11184p0;
import nj3.C76879j;
import qo3.C89779i0;
import rx3.C36570n;
import t83.C13844c;
import te3.C51246sh3;

/* renamed from: if2.i */
public final class C8903i implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C8894g.C8895a f28184d;

    /* renamed from: e */
    public final /* synthetic */ int f28185e;

    public C8903i(C8894g.C8895a aVar, int i) {
        this.f28184d = aVar;
        this.f28185e = i;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        C8894g.C8895a aVar = this.f28184d;
        C8894g gVar = aVar.f28171e;
        C51246sh3 sh32 = aVar.f28170d.get(this.f28185e);
        C87412m.m108593f(sh32, "dataList[position]");
        C51246sh3 sh33 = sh32;
        gVar.getClass();
        C89779i0 i0Var = gVar.f28168g;
        if (i0Var != null) {
            i0Var.dismiss();
            gVar.f28168g = null;
        }
        gVar.f28168g = C76879j.m92723Q(gVar.getContext(), (String) null, gVar.getString(C0966R.string.a4d), true, true, C8907m.f28191d);
        String str = ((NewBizInfoAuthMainUI) ((C36570n) gVar.f28169h).getValue()).f20305e;
        if (str != null) {
            new C13844c.C13845a(3, str, "", sh33.f141521d, 7).mo9225i().mo123420E(new C8906l(gVar, sh33, 7));
        } else {
            C87412m.m108603p("appId");
            throw null;
        }
    }
}
