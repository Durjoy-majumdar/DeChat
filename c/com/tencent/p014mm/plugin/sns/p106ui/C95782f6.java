package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.sns.ui.f6 */
public class C95782f6 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsStrangerCommentDetailUI f279442d;

    public C95782f6(SnsStrangerCommentDetailUI snsStrangerCommentDetailUI) {
        this.f279442d = snsStrangerCommentDetailUI;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$8");
        SnsStrangerCommentDetailUI snsStrangerCommentDetailUI = this.f279442d;
        int bottom = SnsStrangerCommentDetailUI.m122241H7(snsStrangerCommentDetailUI).getBottom();
        SnsMethodCalculate.markStartTimeMs("access$602", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        snsStrangerCommentDetailUI.f278530t = bottom;
        SnsMethodCalculate.markEndTimeMs("access$602", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        StringBuilder sb = new StringBuilder();
        sb.append("listOriginalBottom: ");
        SnsStrangerCommentDetailUI snsStrangerCommentDetailUI2 = this.f279442d;
        SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        int i = snsStrangerCommentDetailUI2.f278530t;
        SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        sb.append(i);
        Log.m105918d("MicroMsg.SnsStrangerCommentDetailUI", sb.toString());
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$8");
    }
}
