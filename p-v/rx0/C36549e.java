package rx0;

import android.view.MenuItem;
import com.tencent.p014mm.storage.C19623o0;
import fy3.C32226l;
import nj3.C11184p0;
import rx3.C13598b0;

/* renamed from: rx0.e */
public final class C36549e implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C32226l<C19623o0, C13598b0> f97215d;

    /* renamed from: e */
    public final /* synthetic */ C19623o0 f97216e;

    public C36549e(C32226l<? super C19623o0, C13598b0> lVar, C19623o0 o0Var) {
        this.f97215d = lVar;
        this.f97216e = o0Var;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        Integer valueOf = menuItem != null ? Integer.valueOf(menuItem.getItemId()) : null;
        if (valueOf != null && valueOf.intValue() == 10) {
            this.f97215d.invoke(this.f97216e);
        }
    }
}
