package md1;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import nj3.C11184p0;
import nj3.C76912y0;

/* renamed from: md1.b */
public final class C10778b implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C10779c f32249d;

    public C10778b(C10779c cVar) {
        this.f32249d = cVar;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        if (itemId != 10002) {
            if (itemId == 10003) {
                if (this.f32249d.mo11013d()) {
                    C76912y0.makeText((Context) this.f32249d.f32250d, (int) C0966R.string.eo7, 0).show();
                } else {
                    this.f32249d.mo11017h();
                }
            }
        } else if (this.f32249d.mo11013d()) {
            C76912y0.makeText((Context) this.f32249d.f32250d, (int) C0966R.string.eo6, 0).show();
        } else {
            this.f32249d.mo11016g();
        }
    }
}
