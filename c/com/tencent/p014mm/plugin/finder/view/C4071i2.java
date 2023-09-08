package com.tencent.p014mm.plugin.finder.view;

import android.view.MenuItem;
import fy3.C32224a;
import nj3.C11184p0;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.view.i2 */
public final class C4071i2 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C32224a<C13598b0> f18199d;

    public C4071i2(C32224a<C13598b0> aVar) {
        this.f18199d = aVar;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem.getItemId() == 4) {
            this.f18199d.invoke();
        }
    }
}
