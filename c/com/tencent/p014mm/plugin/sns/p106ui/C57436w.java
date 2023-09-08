package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94877g0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import nj3.C11184p0;
import nj3.C76879j;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.ui.w */
public class C57436w implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ SnsInfo f164519d;

    /* renamed from: e */
    public final /* synthetic */ C57394a0 f164520e;

    public C57436w(C57394a0 a0Var, SnsInfo snsInfo) {
        this.f164520e = a0Var;
        this.f164519d = snsInfo;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        SnsMethodCalculate.markStartTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.CommentDetailMenuManager$2");
        int itemId = menuItem.getItemId();
        Log.m105918d("MiscroMsg.CommentDetailMenuManager", "showAlert " + itemId);
        if (itemId == 0) {
            C57394a0 a0Var = this.f164520e;
            SnsInfo snsInfo = this.f164519d;
            a0Var.getClass();
            SnsMethodCalculate.markStartTimeMs("dealWithSetPrivated", "com.tencent.mm.plugin.sns.ui.CommentDetailMenuManager");
            if (snsInfo.isWaitPost() || snsInfo.isDieItem()) {
                C94866e1.Yx0().mo139814bD(snsInfo.localid);
                SnsMethodCalculate.markEndTimeMs("dealWithSetPrivated", "com.tencent.mm.plugin.sns.ui.CommentDetailMenuManager");
            } else {
                C94877g0 g0Var = new C94877g0(snsInfo.field_snsId, 2);
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123460f(g0Var);
                Context context = a0Var.f164404c;
                a0Var.f164402a = C76879j.m92723Q(context, context.getString(C0966R.string.a3h), a0Var.f164404c.getString(C0966R.string.jgy), true, true, new C57438y(a0Var, g0Var));
                SnsMethodCalculate.markEndTimeMs("dealWithSetPrivated", "com.tencent.mm.plugin.sns.ui.CommentDetailMenuManager");
            }
        } else if (itemId == 1) {
            C57394a0 a0Var2 = this.f164520e;
            SnsInfo snsInfo2 = this.f164519d;
            a0Var2.getClass();
            SnsMethodCalculate.markStartTimeMs("dealWithSetOpen", "com.tencent.mm.plugin.sns.ui.CommentDetailMenuManager");
            C94877g0 g0Var2 = new C94877g0(snsInfo2.field_snsId, 3);
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123460f(g0Var2);
            Context context2 = a0Var2.f164404c;
            a0Var2.f164402a = C76879j.m92723Q(context2, context2.getString(C0966R.string.a3h), a0Var2.f164404c.getString(C0966R.string.jgy), true, true, new C57439z(a0Var2, g0Var2));
            SnsMethodCalculate.markEndTimeMs("dealWithSetOpen", "com.tencent.mm.plugin.sns.ui.CommentDetailMenuManager");
        } else if (itemId == 2) {
            C57394a0 a0Var3 = this.f164520e;
            SnsInfo snsInfo3 = this.f164519d;
            a0Var3.getClass();
            SnsMethodCalculate.markStartTimeMs("dealWithEditGroup", "com.tencent.mm.plugin.sns.ui.CommentDetailMenuManager");
            NewSnsLabelUI.m121602Z7(a0Var3.f164404c, snsInfo3.localid, 3);
            SnsMethodCalculate.markEndTimeMs("dealWithEditGroup", "com.tencent.mm.plugin.sns.ui.CommentDetailMenuManager");
            SnsReportHelper.f275506m0.mo131351L(2, true, C102236a0.m134728W(this.f164519d));
        }
        SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.CommentDetailMenuManager$2");
    }
}
