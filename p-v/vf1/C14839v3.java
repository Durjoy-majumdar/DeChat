package vf1;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveVisitorWhiteListUI;
import nj3.C11184p0;

/* renamed from: vf1.v3 */
public final class C14839v3 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveVisitorWhiteListUI f40838d;

    public C14839v3(FinderLiveVisitorWhiteListUI finderLiveVisitorWhiteListUI) {
        this.f40838d = finderLiveVisitorWhiteListUI;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            this.f40838d.mo3045T7(FinderLiveVisitorWhiteListUI.C2981a.C2982a.PUBLIC);
        } else if (itemId == 2) {
            this.f40838d.mo3045T7(FinderLiveVisitorWhiteListUI.C2981a.C2982a.PARTIAL);
        } else if (itemId == 3) {
            this.f40838d.mo3045T7(FinderLiveVisitorWhiteListUI.C2981a.C2982a.CHARGE);
        } else if (itemId == 4) {
            this.f40838d.mo3045T7(FinderLiveVisitorWhiteListUI.C2981a.C2982a.PREHEARSAL);
        }
        this.f40838d.mo3044S7(0);
        FinderLiveVisitorWhiteListUI finderLiveVisitorWhiteListUI = this.f40838d;
        finderLiveVisitorWhiteListUI.mo3042Q7(finderLiveVisitorWhiteListUI.f14589t);
    }
}
