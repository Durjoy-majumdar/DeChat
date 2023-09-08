package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import c00.C0405n;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import di3.C86312j;
import eb0.C31543z5;
import java.util.List;
import os2.C100400e0;
import ro3.C110588j;
import u73.C101980n;

/* renamed from: com.tencent.mm.plugin.sns.ui.k4 */
public class C71251k4 implements C110588j.C110590c {

    /* renamed from: a */
    public final /* synthetic */ SnsCommentUI f206194a;

    public C71251k4(SnsCommentUI snsCommentUI) {
        this.f206194a = snsCommentUI;
    }

    /* renamed from: a */
    public void mo14785a(List<C110588j.C110589b> list, int i) {
        SnsMethodCalculate.markStartTimeMs("onMenuInit", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$5");
        long e = (long) C31543z5.m39455e();
        if (((C101980n) C86312j.m106911c(C101980n.class)).mo134684EO() && i != 8 && i != 1 && !((C0405n) C86312j.m106911c(C0405n.class)).mo279e()) {
            list.add(new C110588j.C110589b(this.f206194a.getContext().getString(C0966R.string.f361426jt2), 2));
            SnsCommentUI snsCommentUI = this.f206194a;
            if (snsCommentUI.f206126n == null) {
                C100400e0 Yx0 = C94866e1.Yx0();
                SnsCommentUI snsCommentUI2 = this.f206194a;
                SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
                int i2 = snsCommentUI2.f206121f;
                SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
                snsCommentUI.f206126n = Yx0.mo139800LL(i2);
            }
            SnsCommentFooter.m122051y(this.f206194a.getContext(), this.f206194a.f206126n, false, "", 1, "", e);
        }
        SnsMethodCalculate.markEndTimeMs("onMenuInit", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$5");
    }

    /* renamed from: b */
    public void mo14786b(View view, C110588j.C110589b bVar, String str) {
        SnsMethodCalculate.markStartTimeMs("onMenuItemClicked", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$5");
        long e = (long) C31543z5.m39455e();
        if (bVar.f330853b == 2) {
            SnsCommentUI.m83635H7(this.f206194a).getText().insert(SnsCommentUI.m83635H7(this.f206194a).getSelectionStart(), this.f206194a.getContext().getString(C0966R.string.f361426jt2));
            SnsCommentFooter.m122051y(this.f206194a.getContext(), this.f206194a.f206126n, false, "", 2, "", e);
        }
        SnsMethodCalculate.markEndTimeMs("onMenuItemClicked", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$5");
    }
}
