package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.SnsUserUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import eb0.C31543z5;
import nj3.C11184p0;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.ui.z7 */
public class C96331z7 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ SnsUserUI.C95700q f281733d;

    public C96331z7(SnsUserUI.C95700q qVar) {
        this.f281733d = qVar;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        SnsMethodCalculate.markStartTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsUserUI$SnsEventListener$2");
        long c = C31543z5.m39453c();
        String l = C102236a0.m134754l();
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            C115669n.INSTANCE.mo160131h(13822, 1, 2, l, Long.valueOf(c));
            SnsUserUI snsUserUI = SnsUserUI.this;
            int i2 = SnsUserUI.f278981R;
            SnsMethodCalculate.markStartTimeMs("access$2500", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            snsUserUI.mo133105S7();
            SnsMethodCalculate.markEndTimeMs("access$2500", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        } else if (itemId == 1) {
            C115669n.INSTANCE.mo160131h(13822, 2, 2, l, Long.valueOf(c));
            SnsUserUI.m122467Q7(SnsUserUI.this).mo133026B(1, 3);
        }
        SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsUserUI$SnsEventListener$2");
    }
}
