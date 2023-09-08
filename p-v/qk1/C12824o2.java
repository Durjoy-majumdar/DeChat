package qk1;

import android.view.MenuItem;
import fy3.C32226l;
import nj3.C11184p0;
import qk1.C12816m2;
import rx3.C13598b0;

/* renamed from: qk1.o2 */
public final class C12824o2 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C12816m2 f36708d;

    /* renamed from: e */
    public final /* synthetic */ C12816m2.C12817a f36709e;

    public C12824o2(C12816m2 m2Var, C12816m2.C12817a aVar) {
        this.f36708d = m2Var;
        this.f36709e = aVar;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        C32226l<? super String, C13598b0> lVar;
        if (i == 0 && (lVar = this.f36708d.f36695g) != null) {
            lVar.invoke(this.f36709e.f36697B);
        }
    }
}
