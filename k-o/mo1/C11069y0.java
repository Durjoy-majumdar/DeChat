package mo1;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC;
import nj3.C11184p0;

/* renamed from: mo1.y0 */
public final class C11069y0 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ FinderProfileHeaderUIC f32835d;

    /* renamed from: e */
    public final /* synthetic */ boolean f32836e;

    public C11069y0(FinderProfileHeaderUIC finderProfileHeaderUIC, boolean z) {
        this.f32835d = finderProfileHeaderUIC;
        this.f32836e = z;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem.getItemId() == 10011) {
            this.f32835d.mo3823e3(!this.f32836e, true);
        }
    }
}
