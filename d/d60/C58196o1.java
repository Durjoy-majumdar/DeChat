package d60;

import android.view.MenuItem;
import fy3.C32224a;
import gy3.C87412m;
import nj3.C11184p0;
import qo3.C77407n;
import rx3.C13598b0;

/* renamed from: d60.o1 */
public final class C58196o1 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C32224a<C13598b0> f166662d;

    /* renamed from: e */
    public final /* synthetic */ C58169j1 f166663e;

    /* renamed from: f */
    public final /* synthetic */ C32224a<C13598b0> f166664f;

    public C58196o1(C32224a<C13598b0> aVar, C58169j1 j1Var, C32224a<C13598b0> aVar2) {
        this.f166662d = aVar;
        this.f166663e = j1Var;
        this.f166664f = aVar2;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        C87412m.m108594g(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            this.f166664f.invoke();
            C77407n nVar = this.f166663e.f166619v;
            if (nVar != null) {
                nVar.mo107572p();
            }
        } else if (itemId != 2) {
            C77407n nVar2 = this.f166663e.f166619v;
            if (nVar2 != null) {
                nVar2.mo107572p();
            }
        } else {
            this.f166662d.invoke();
            C77407n nVar3 = this.f166663e.f166619v;
            if (nVar3 != null) {
                nVar3.mo107572p();
            }
        }
    }
}
