package com.tencent.p014mm.plugin.finder.p056ui;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.finder.service.C3603n1;
import di3.C86312j;
import nj3.C11184p0;
import te3.C50275lk0;

/* renamed from: com.tencent.mm.plugin.finder.ui.y */
public final class C41543y implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C50275lk0 f111855d;

    /* renamed from: e */
    public final /* synthetic */ FinderBlackListUI f111856e;

    public C41543y(C50275lk0 lk02, FinderBlackListUI finderBlackListUI) {
        this.f111855d = lk02;
        this.f111856e = finderBlackListUI;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem.getItemId() == 1001) {
            C3603n1 n1Var = (C3603n1) C86312j.m106911c(C3603n1.class);
            String str = this.f111855d.f137478f;
            if (str == null) {
                str = "";
            }
            n1Var.mo3969Xt(str, false, this.f111856e);
        }
    }
}
