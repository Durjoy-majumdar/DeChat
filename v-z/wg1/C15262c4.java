package wg1;

import android.view.MenuItem;
import fy3.C32224a;
import nj3.C11184p0;
import rx3.C13598b0;
import te3.C49098d51;

/* renamed from: wg1.c4 */
public final class C15262c4 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C49098d51 f41505d;

    /* renamed from: e */
    public final /* synthetic */ C32224a<C13598b0> f41506e;

    public C15262c4(C49098d51 d512, C32224a<C13598b0> aVar) {
        this.f41505d = d512;
        this.f41506e = aVar;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem.getItemId() == 4) {
            this.f41505d.f132119e = 1;
            this.f41506e.invoke();
        }
    }
}
