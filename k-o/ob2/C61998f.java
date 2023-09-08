package ob2;

import android.view.MenuItem;
import nj3.C11184p0;
import qo3.C77407n;

/* renamed from: ob2.f */
public final class C61998f implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C61999g f176248d;

    /* renamed from: e */
    public final /* synthetic */ C77407n f176249e;

    public C61998f(C61999g gVar, C77407n nVar) {
        this.f176248d = gVar;
        this.f176249e = nVar;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem.getItemId() == 1) {
            this.f176248d.getActivity().finish();
        } else {
            this.f176249e.mo107572p();
        }
    }
}
