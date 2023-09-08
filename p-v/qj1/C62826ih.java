package qj1;

import ak1.C54116w;
import android.os.Bundle;
import android.view.MenuItem;
import d60.C58124b;
import di3.C86312j;
import nj3.C11184p0;
import qo3.C77407n;

/* renamed from: qj1.ih */
public final class C62826ih implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C62795gh f178314d;

    public C62826ih(C62795gh ghVar) {
        this.f178314d = ghVar;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        this.f178314d.getClass();
        if (itemId == 0) {
            C77407n nVar = this.f178314d.f178242A;
            if (nVar != null) {
                nVar.mo107572p();
            }
            this.f178314d.mo87788a1();
            ((C54116w) C86312j.m106911c(C54116w.class)).f151919T0 = true;
            C58124b.C7172a.m7372a(this.f178314d.f178243p, C58124b.C58125b.FINDER_LIVE_LINK_MIC_HANGUP_LINK, (Bundle) null, 2, (Object) null);
        }
    }
}
