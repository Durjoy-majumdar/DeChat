package qj1;

import ak1.C54108o;
import android.os.Bundle;
import android.view.MenuItem;
import d60.C58124b;
import di3.C86312j;
import nj3.C11184p0;
import qo3.C77407n;

/* renamed from: qj1.j2 */
public final class C62828j2 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C62799h2 f178317d;

    public C62828j2(C62799h2 h2Var) {
        this.f178317d = h2Var;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        this.f178317d.getClass();
        if (itemId == 0) {
            C77407n nVar = this.f178317d.f178267y;
            if (nVar != null) {
                nVar.mo107572p();
            }
            C58124b.C7172a.m7372a(this.f178317d.f178258p, C58124b.C58125b.FINDER_LIVE_LINK_MIC_HANGUP_LINK, (Bundle) null, 2, (Object) null);
            ((C54108o) C86312j.m106911c(C54108o.class)).getClass();
            C54108o.f151869h.f151476t = true;
        }
    }
}
