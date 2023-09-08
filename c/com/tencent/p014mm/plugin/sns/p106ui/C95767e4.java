package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.e4 */
public class C95767e4 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsCommentFooter f279391d;

    public C95767e4(SnsCommentFooter snsCommentFooter) {
        this.f279391d = snsCommentFooter;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$3");
        SnsCommentFooter snsCommentFooter = this.f279391d;
        String str = SnsCommentFooter.f278037M;
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        snsCommentFooter.mo132692n(false);
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$3");
    }
}
