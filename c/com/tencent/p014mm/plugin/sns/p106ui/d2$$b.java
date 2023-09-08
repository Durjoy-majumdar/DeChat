package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import nj3.C11184p0;

/* renamed from: com.tencent.mm.plugin.sns.ui.d2$$b */
public final /* synthetic */ class d2$$b implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C95754d2 f279335d;

    public /* synthetic */ d2$$b(C95754d2 d2Var) {
        this.f279335d = d2Var;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        C95754d2 d2Var = this.f279335d;
        d2Var.getClass();
        SnsMethodCalculate.markStartTimeMs("lambda$showAddPicDialog$1", "com.tencent.mm.plugin.sns.ui.PicWidget");
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            d2Var.mo133199m();
        } else if (itemId == 1) {
            d2Var.mo133201q();
        }
        SnsMethodCalculate.markEndTimeMs("lambda$showAddPicDialog$1", "com.tencent.mm.plugin.sns.ui.PicWidget");
    }
}
