package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import nj3.C11184p0;
import nj3.C76912y0;
import tc0.C77885p;
import te3.C101816mt2;

/* renamed from: com.tencent.mm.plugin.sns.ui.j8 */
public class C95974j8 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ SnsWsFoldDetailUI f280244d;

    public C95974j8(SnsWsFoldDetailUI snsWsFoldDetailUI) {
        this.f280244d = snsWsFoldDetailUI;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        SnsMethodCalculate.markStartTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI$7");
        if (menuItem.getItemId() == 1) {
            Log.m105925i("MicroMsg.SnsWsFoldDetailUI", "set unfold, username:%s", this.f280244d.f279041o);
            C101816mt2 mt22 = new C101816mt2();
            mt22.f298873d = this.f280244d.f279041o;
            mt22.f298874e = 1;
            ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(230, mt22));
            C95790g2 Kx0 = C94866e1.Kx0();
            String str = this.f280244d.f279041o;
            Kx0.getClass();
            SnsMethodCalculate.markStartTimeMs("setUnfold", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
            Kx0.f279541m.add(str);
            SnsMethodCalculate.markEndTimeMs("setUnfold", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
            SnsWsFoldDetailUI snsWsFoldDetailUI = this.f280244d;
            SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
            snsWsFoldDetailUI.mo133121H7();
            SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
            C76912y0.m92768g(this.f280244d.getContext(), this.f280244d.getString(C0966R.string.m_j));
            SnsReportHelper snsReportHelper = SnsReportHelper.f275506m0;
            snsReportHelper.getClass();
            SnsMethodCalculate.markStartTimeMs("comfirmUnfoldButton", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            snsReportHelper.f275536b0.f266177m = 1;
            SnsMethodCalculate.markEndTimeMs("comfirmUnfoldButton", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        }
        SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI$7");
    }
}
