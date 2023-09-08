package qj1;

import ak1.C54108o;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.plugin.finder.live.plugin.FinderLiveRandomMatchLinkMicStatePlugin;
import d60.C58124b;
import di3.C86312j;
import nj3.C11184p0;
import qo3.C77407n;

/* renamed from: qj1.nd */
public final class C12556nd implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveRandomMatchLinkMicStatePlugin f36048d;

    public C12556nd(FinderLiveRandomMatchLinkMicStatePlugin finderLiveRandomMatchLinkMicStatePlugin) {
        this.f36048d = finderLiveRandomMatchLinkMicStatePlugin;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem.getItemId() == 0) {
            C77407n nVar = this.f36048d.f15151u;
            if (nVar != null) {
                nVar.mo107572p();
            }
            C58124b.C7172a.m7372a(this.f36048d.f15146p, C58124b.C58125b.FINDER_LIVE_LINK_MIC_HANGUP_LINK, (Bundle) null, 2, (Object) null);
            ((C54108o) C86312j.m106911c(C54108o.class)).getClass();
            C54108o.f151869h.f151476t = true;
        }
    }
}
