package com.tencent.p014mm.plugin.sns.p106ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.a6 */
public class C95714a6 implements Runnable {

    /* renamed from: d */
    public int f279147d = -1;

    /* renamed from: e */
    public int f279148e = 10;

    /* renamed from: f */
    public final /* synthetic */ SnsStrangerCommentDetailUI f279149f;

    public C95714a6(SnsStrangerCommentDetailUI snsStrangerCommentDetailUI) {
        this.f279149f = snsStrangerCommentDetailUI;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0090, code lost:
        if (r3 == r6) goto L_0x0092;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r8 = this;
            java.lang.String r0 = "run"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$10"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI r2 = r8.f279149f
            int r3 = com.tencent.p014mm.plugin.sns.p106ui.SnsStrangerCommentDetailUI.f278516y
            java.lang.String r3 = "access$700"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            boolean r2 = r2.f278529s
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            if (r2 != 0) goto L_0x001e
            r2 = 10
            r8.f279148e = r2
        L_0x001e:
            com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI r2 = r8.f279149f
            java.lang.String r3 = "access$702"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            r5 = 1
            r2.f278529s = r5
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "list.bottom:"
            r2.append(r3)
            com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI r3 = r8.f279149f
            android.widget.ListView r3 = com.tencent.p014mm.plugin.sns.p106ui.SnsStrangerCommentDetailUI.m122241H7(r3)
            int r3 = r3.getBottom()
            r2.append(r3)
            java.lang.String r3 = " footer.top"
            r2.append(r3)
            com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI r3 = r8.f279149f
            android.widget.ListView r3 = com.tencent.p014mm.plugin.sns.p106ui.SnsStrangerCommentDetailUI.m122241H7(r3)
            int r3 = r3.getTop()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "MicroMsg.SnsStrangerCommentDetailUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r2)
            com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI r2 = r8.f279149f
            java.lang.String r3 = "access$800"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            com.tencent.mm.plugin.sns.ui.SnsCommentFooter r2 = r2.f278518e
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            int r2 = r2.getTop()
            int r3 = r8.f279148e
            int r6 = r3 + -1
            r8.f279148e = r6
            if (r3 <= 0) goto L_0x009c
            int r3 = r8.f279147d
            if (r3 != r2) goto L_0x0092
            com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI r3 = r8.f279149f
            android.widget.ListView r3 = com.tencent.p014mm.plugin.sns.p106ui.SnsStrangerCommentDetailUI.m122241H7(r3)
            int r3 = r3.getBottom()
            com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI r6 = r8.f279149f
            java.lang.String r7 = "access$600"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r4)
            int r6 = r6.f278530t
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r4)
            if (r3 != r6) goto L_0x009c
        L_0x0092:
            com.tencent.mm.sdk.platformtools.MMHandler r3 = new com.tencent.mm.sdk.platformtools.MMHandler
            r3.<init>()
            r6 = 30
            r3.postDelayed(r8, r6)
        L_0x009c:
            r8.f279147d = r2
            com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI r2 = r8.f279149f
            android.widget.ListView r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsStrangerCommentDetailUI.m122241H7(r2)
            com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI r3 = r8.f279149f
            android.widget.ListView r3 = com.tencent.p014mm.plugin.sns.p106ui.SnsStrangerCommentDetailUI.m122241H7(r3)
            int r3 = r3.getCount()
            int r3 = r3 - r5
            com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil.SmoothScrollFactory.scrollTo(r2, r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.C95714a6.run():void");
    }
}
