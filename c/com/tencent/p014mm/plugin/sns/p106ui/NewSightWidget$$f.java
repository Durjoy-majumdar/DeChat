package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import nj3.C11184p0;

/* renamed from: com.tencent.mm.plugin.sns.ui.NewSightWidget$$f */
public final /* synthetic */ class NewSightWidget$$f implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ NewSightWidget f277080d;

    public /* synthetic */ NewSightWidget$$f(NewSightWidget newSightWidget) {
        this.f277080d = newSightWidget;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        NewSightWidget newSightWidget = this.f277080d;
        newSightWidget.getClass();
        SnsMethodCalculate.markStartTimeMs("lambda$showAddPicDialog$4", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            newSightWidget.mo132256p();
        } else if (itemId == 1) {
            newSightWidget.mo132257q();
        }
        SnsMethodCalculate.markEndTimeMs("lambda$showAddPicDialog$4", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
    }
}
