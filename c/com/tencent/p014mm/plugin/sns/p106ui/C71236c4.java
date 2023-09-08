package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import c00.C0405n;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import di3.C86312j;
import eb0.C31543z5;
import java.util.List;
import ro3.C110588j;
import u73.C101980n;

/* renamed from: com.tencent.mm.plugin.sns.ui.c4 */
public class C71236c4 implements C110588j.C110590c {

    /* renamed from: a */
    public final /* synthetic */ SnsCommentFooter f206178a;

    public C71236c4(SnsCommentFooter snsCommentFooter) {
        this.f206178a = snsCommentFooter;
    }

    /* renamed from: a */
    public void mo14785a(List<C110588j.C110589b> list, int i) {
        SnsMethodCalculate.markStartTimeMs("onMenuInit", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$11");
        long e = (long) C31543z5.m39455e();
        if (((C101980n) C86312j.m106911c(C101980n.class)).mo134684EO() && i != 8 && i != 1 && !((C0405n) C86312j.m106911c(C0405n.class)).mo279e()) {
            list.add(new C110588j.C110589b(SnsCommentFooter.m122042c(this.f206178a).getString(C0966R.string.f361426jt2), 2));
            SnsCommentFooter.m122051y(this.f206178a.getContext(), this.f206178a.getTag(), SnsCommentFooter.m122045f(this.f206178a), "", 1, "", e);
        }
        SnsMethodCalculate.markEndTimeMs("onMenuInit", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$11");
    }

    /* renamed from: b */
    public void mo14786b(View view, C110588j.C110589b bVar, String str) {
        SnsMethodCalculate.markStartTimeMs("onMenuItemClicked", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$11");
        long e = (long) C31543z5.m39455e();
        if (bVar.f330853b == 2) {
            SnsCommentFooter.m122046g(this.f206178a).getText().insert(SnsCommentFooter.m122046g(this.f206178a).getSelectionStart(), SnsCommentFooter.m122042c(this.f206178a).getString(C0966R.string.f361426jt2));
            SnsCommentFooter.m122051y(this.f206178a.getContext(), this.f206178a.getTag(), SnsCommentFooter.m122045f(this.f206178a), "", 2, "", e);
        }
        SnsMethodCalculate.markEndTimeMs("onMenuItemClicked", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$11");
    }
}
