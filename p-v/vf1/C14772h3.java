package vf1;

import android.view.MenuItem;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveOrderUI;
import gy3.C87412m;
import nj3.C11184p0;

/* renamed from: vf1.h3 */
public final class C14772h3 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveOrderUI f40751d;

    /* renamed from: e */
    public final /* synthetic */ String f40752e;

    /* renamed from: f */
    public final /* synthetic */ String f40753f;

    public C14772h3(FinderLiveOrderUI finderLiveOrderUI, String str, String str2) {
        this.f40751d = finderLiveOrderUI;
        this.f40752e = str;
        this.f40753f = str2;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem.getItemId() == 0) {
            FinderLiveOrderUI finderLiveOrderUI = this.f40751d;
            TextView textView = finderLiveOrderUI.f14532r;
            if (textView != null) {
                textView.setText(finderLiveOrderUI.getContext().getResources().getString(C0966R.string.n_c));
                FinderLiveOrderUI.m2860N7(this.f40751d, "");
                return;
            }
            C87412m.m108603p("filterTitle");
            throw null;
        } else if (menuItem.getItemId() == 1) {
            TextView textView2 = this.f40751d.f14532r;
            if (textView2 != null) {
                textView2.setText(this.f40752e);
                FinderLiveOrderUI.m2860N7(this.f40751d, this.f40753f);
                return;
            }
            C87412m.m108603p("filterTitle");
            throw null;
        }
    }
}
