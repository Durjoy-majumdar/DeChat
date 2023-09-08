package com.tencent.p014mm.plugin.sns.p106ui;

import android.widget.ListView;
import com.tencent.p014mm.plugin.sns.p106ui.SnsStrangerCommentDetailUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.d6 */
public class C95760d6 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsStrangerCommentDetailUI f279353d;

    public C95760d6(SnsStrangerCommentDetailUI snsStrangerCommentDetailUI) {
        this.f279353d = snsStrangerCommentDetailUI;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$6");
        ListView H7 = SnsStrangerCommentDetailUI.m122241H7(this.f279353d);
        SnsStrangerCommentDetailUI snsStrangerCommentDetailUI = this.f279353d;
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        SnsStrangerCommentDetailUI.C95618e eVar = snsStrangerCommentDetailUI.f278527q;
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        H7.setSelection(eVar.getCount() - 1);
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$6");
    }
}
