package x82;

import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.plugin.multitalk.model.C105851w0;
import com.tencent.p014mm.plugin.multitalk.p078ui.widget.projector.MultiTalkSmallControlIconLayout;
import nj3.C11184p0;
import x82.C112075a;

/* renamed from: x82.t */
public final class C112123t implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C112114r f335693d;

    public C112123t(C112114r rVar) {
        this.f335693d = rVar;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        if (itemId == 5) {
            C112075a.C112076a.m152803a(this.f335693d.f335673b, C112075a.C112077b.SEND_TO_FRIEND, (Bundle) null, 2, (Object) null);
        } else if (itemId == 6) {
            C112075a.C112076a.m152803a(this.f335693d.f335673b, C112075a.C112077b.SAVE_TO_FAV, (Bundle) null, 2, (Object) null);
        } else if (itemId == 7) {
            C112075a.C112076a.m152803a(this.f335693d.f335673b, C112075a.C112077b.SAVE_TO_PICTURE, (Bundle) null, 2, (Object) null);
        } else if (itemId == 8) {
            String str = C105851w0.zx0().f314506t.f320042d;
            MultiTalkSmallControlIconLayout multiTalkSmallControlIconLayout = this.f335693d.f335676e;
            boolean z = true;
            if (multiTalkSmallControlIconLayout == null || !multiTalkSmallControlIconLayout.f201579j) {
                z = false;
            }
            if (z && multiTalkSmallControlIconLayout != null) {
                multiTalkSmallControlIconLayout.callOnClick();
            }
            C112075a.C112076a.m152803a(this.f335693d.f335673b, C112075a.C112077b.CLEAR_SCREEN, (Bundle) null, 2, (Object) null);
        }
    }
}
