package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import android.content.Context;
import android.view.MenuItem;
import nj3.C11184p0;
import nj3.C76912y0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.j */
public final class C2120j implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ BizTestUI f12086d;

    public C2120j(BizTestUI bizTestUI) {
        this.f12086d = bizTestUI;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem.getItemId() == 100) {
            C76912y0.makeText((Context) this.f12086d.getContext(), (CharSequence) "custom menu item click", 0).show();
        }
    }
}
