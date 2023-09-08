package com.tencent.p014mm.plugin.finder.live.micintercom.widget;

import al1.C39611s;
import android.view.MenuItem;
import fy3.C32226l;
import nj3.C11184p0;
import rx3.C13598b0;
import wi1.C53175a;
import wi1.C53176b;
import wi1.C53177i;

/* renamed from: com.tencent.mm.plugin.finder.live.micintercom.widget.b */
public final class C41453b implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ LiveMicIntercomWidget f111627d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<C53177i, C13598b0> f111628e;

    public C41453b(LiveMicIntercomWidget liveMicIntercomWidget, C32226l<? super C53177i, C13598b0> lVar) {
        this.f111627d = liveMicIntercomWidget;
        this.f111628e = lVar;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        C39611s sVar;
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            C39611s sVar2 = this.f111627d.f111614h;
            if (sVar2 != null) {
                this.f111628e.invoke(new C53176b(sVar2));
            }
        } else if (itemId == 2 && (sVar = this.f111627d.f111614h) != null) {
            this.f111628e.invoke(new C53175a(sVar));
        }
    }
}
