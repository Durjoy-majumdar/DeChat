package g60;

import android.view.MenuItem;
import com.tencent.p014mm.live.p016ui.dialog.LiveAnchorMicUserListView;
import gy3.C87412m;
import nj3.C11184p0;
import qo3.C77407n;

/* renamed from: g60.c */
public final class C59367c implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ LiveAnchorMicUserListView f169683d;

    public C59367c(LiveAnchorMicUserListView liveAnchorMicUserListView) {
        this.f169683d = liveAnchorMicUserListView;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        C87412m.m108594g(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            return;
        }
        if (itemId != 1) {
            C77407n nVar = this.f169683d.f157235d;
            if (nVar != null) {
                nVar.mo107572p();
                return;
            }
            return;
        }
        C77407n nVar2 = this.f169683d.f157235d;
        if (nVar2 != null) {
            nVar2.mo107572p();
        }
        LiveAnchorMicUserListView.m62843a(this.f169683d, false);
    }
}
