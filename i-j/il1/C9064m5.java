package il1;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.finder.live.widget.FinderLiveMemebrProfileWidget;
import nj3.C11184p0;
import qo3.C77407n;

/* renamed from: il1.m5 */
public final class C9064m5 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveMemebrProfileWidget f28604d;

    public C9064m5(FinderLiveMemebrProfileWidget finderLiveMemebrProfileWidget) {
        this.f28604d = finderLiveMemebrProfileWidget;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem.getItemId() == 0) {
            C77407n nVar = this.f28604d.f15404X;
            if (nVar != null) {
                nVar.mo107572p();
            }
            this.f28604d.mo3434s(2);
        }
    }
}
