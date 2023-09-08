package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.sns.ui.e6 */
public class C95769e6 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsStrangerCommentDetailUI f279393d;

    public C95769e6(SnsStrangerCommentDetailUI snsStrangerCommentDetailUI) {
        this.f279393d = snsStrangerCommentDetailUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsStrangerCommentDetailUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$7");
        if (view.getTag() instanceof C96235u4) {
            SnsStrangerCommentDetailUI snsStrangerCommentDetailUI = this.f279393d;
            int i = SnsStrangerCommentDetailUI.f278516y;
            SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
            C96227t4 t4Var = snsStrangerCommentDetailUI.f278526p;
            SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
            t4Var.mo133892c(view, 2, 1);
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$7");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsStrangerCommentDetailUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
