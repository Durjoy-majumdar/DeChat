package he1;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.service.C3604o1;
import di3.C86312j;
import ht1.C8794p5;
import nj3.C11184p0;
import te3.C51954xc1;

/* renamed from: he1.l */
public final class C8512l implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ BaseFinderFeed f27546d;

    /* renamed from: e */
    public final /* synthetic */ boolean f27547e;

    /* renamed from: f */
    public final /* synthetic */ C8794p5<C51954xc1> f27548f;

    public C8512l(BaseFinderFeed baseFinderFeed, boolean z, C8794p5<C51954xc1> p5Var) {
        this.f27546d = baseFinderFeed;
        this.f27547e = z;
        this.f27548f = p5Var;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem.getItemId() == 1) {
            ((C3604o1) C86312j.m106911c(C3604o1.class)).mo3974NA(this.f27546d.getItemId(), this.f27546d.mo3513o().getObjectNonceId(), this.f27547e, this.f27548f);
        }
    }
}
