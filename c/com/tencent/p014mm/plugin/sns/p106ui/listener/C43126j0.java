package com.tencent.p014mm.plugin.sns.p106ui.listener;

import android.view.View;

/* renamed from: com.tencent.mm.plugin.sns.ui.listener.j0 */
public class C43126j0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TimelineClickListener f116694d;

    public C43126j0(TimelineClickListener timelineClickListener) {
        this.f116694d = timelineClickListener;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0032, code lost:
        r9 = (com.tencent.p014mm.plugin.sns.p106ui.C96230u) r9.getTag();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r9) {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r9)
            java.lang.Object[] r6 = r0.toArray()
            r0.clear()
            java.lang.String r1 = "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$41"
            java.lang.String r2 = "android/view/View$OnClickListener"
            java.lang.String r3 = "onClick"
            java.lang.String r4 = "(Landroid/view/View;)V"
            r5 = r8
            j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
            java.lang.String r0 = "onClick"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$41"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.Object r2 = r9.getTag()
            if (r2 == 0) goto L_0x00cd
            java.lang.Object r2 = r9.getTag()
            boolean r2 = r2 instanceof com.tencent.p014mm.plugin.sns.p106ui.C96230u
            if (r2 == 0) goto L_0x00cd
            java.lang.Object r9 = r9.getTag()
            com.tencent.mm.plugin.sns.ui.u r9 = (com.tencent.p014mm.plugin.sns.p106ui.C96230u) r9
            te3.w64 r2 = r9.f281195e
            if (r2 == 0) goto L_0x00cd
            java.util.LinkedList<te3.c74> r3 = r2.f299717u
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r3)
            if (r3 != 0) goto L_0x00cd
            java.util.LinkedList<te3.c74> r3 = r2.f299717u
            r4 = 0
            java.lang.Object r3 = r3.get(r4)
            if (r3 == 0) goto L_0x00cd
            java.util.LinkedList<te3.c74> r3 = r2.f299717u
            java.lang.Object r3 = r3.get(r4)
            te3.c74 r3 = (te3.c74) r3
            java.lang.String r3 = r3.f131560d
            com.tencent.mm.storage.w2 r4 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.g r4 = r4.mo57717d()
            com.tencent.mm.storage.emotion.EmojiInfo r4 = r4.mo142044TO(r3)
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            java.lang.String r6 = "custom_smiley_preview_md5"
            r5.putExtra(r6, r3)
            int r3 = r4.field_catalog
            r6 = 81
            if (r3 == r6) goto L_0x0082
            r6 = 18
            if (r3 == r6) goto L_0x0082
            r6 = 17
            if (r3 == r6) goto L_0x0082
            java.lang.String r3 = r4.field_groupId
            java.lang.String r4 = "custom_smiley_preview_productid"
            r5.putExtra(r4, r3)
        L_0x0082:
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r3 = r8.f116694d
            android.app.Activity r3 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122988j(r3)
            r4 = 1111(0x457, float:1.557E-42)
            java.lang.String r6 = "emoji"
            java.lang.String r7 = ".ui.CustomSmileyPreviewUI"
            ke3.C88144b.m109795m(r3, r6, r7, r5, r4)
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r3 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            java.lang.String r9 = r9.f281192b
            long r4 = os2.C100417r0.m131425n(r9)
            int r9 = r2.f299709j
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r3.getClass()
            java.lang.String r2 = "exposeSnsEmojiClick"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.statistics.SnsReportHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r6)
            java.lang.String r4 = vr2.C102236a0.m134765q0(r4)
            java.util.Map<java.lang.String, com.tencent.mm.plugin.sns.statistics.SnsReportHelper$b> r3 = r3.f275561r
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.lang.Object r3 = r3.get(r4)
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper$b r3 = (com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.C94986b) r3
            if (r3 == 0) goto L_0x00ca
            java.util.List<java.lang.String> r4 = r3.f275577d
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            boolean r4 = r4.contains(r9)
            if (r4 != 0) goto L_0x00ca
            java.util.List<java.lang.String> r3 = r3.f275577d
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.add(r9)
        L_0x00ca:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r6)
        L_0x00cd:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            java.lang.String r9 = "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$41"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "(Landroid/view/View;)V"
            j20.C117292a.m165361g(r8, r9, r1, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.listener.C43126j0.onClick(android.view.View):void");
    }
}
