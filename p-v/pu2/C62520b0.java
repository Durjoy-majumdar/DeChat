package pu2;

import android.view.View;

/* renamed from: pu2.b0 */
public final class C62520b0 implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ C100954s f177589d;

    public C62520b0(C100954s sVar) {
        this.f177589d = sVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0075, code lost:
        if (com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger() == false) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onLongClick(android.view.View r20) {
        /*
            r19 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r20
            r0.add(r1)
            java.lang.Object[] r6 = r0.toArray()
            r0.clear()
            java.lang.String r1 = "com/tencent/mm/plugin/sns/ui/item/improve/TimelineItemClick$updateClickListener$2"
            java.lang.String r2 = "android/view/View$OnLongClickListener"
            java.lang.String r3 = "onLongClick"
            java.lang.String r4 = "(Landroid/view/View;)Z"
            r5 = r19
            j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
            java.lang.String r0 = "onLongClick"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemClick$updateClickListener$2"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            r8 = r19
            pu2.s r2 = r8.f177589d
            java.lang.String r3 = "access$popPermissionMenuWindow"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemClick"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            r2.getClass()
            java.lang.String r5 = "popPermissionMenuWindow"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r4)
            com.tencent.mm.plugin.sns.ui.w6 r6 = r2.getStruct()
            java.lang.String r6 = r6.f281398y
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            r9 = 1
            if (r7 == 0) goto L_0x004d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r4)
            goto L_0x00ba
        L_0x004d:
            java.lang.String r7 = com.tencent.p014mm.plugin.sns.model.C94866e1.Mx0()
            boolean r7 = gy3.C87412m.m108589b(r6, r7)
            r10 = 0
            if (r7 == 0) goto L_0x0081
            boolean r6 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r6 != 0) goto L_0x0077
            boolean r6 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
            if (r6 != 0) goto L_0x006e
            boolean r6 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r6 != 0) goto L_0x006e
            int r6 = com.tencent.p014mm.sdk.platformtools.BuildInfo.CLIENT_VERSION_INT
            r7 = 788529167(0x2f00000f, float:1.1641553E-10)
            if (r6 != r7) goto L_0x006c
            goto L_0x006e
        L_0x006c:
            r6 = 0
            goto L_0x006f
        L_0x006e:
            r6 = 1
        L_0x006f:
            if (r6 != 0) goto L_0x0077
            boolean r6 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
            if (r6 == 0) goto L_0x0078
        L_0x0077:
            r10 = 1
        L_0x0078:
            if (r10 == 0) goto L_0x007d
            r2.mo140473F()
        L_0x007d:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r4)
            goto L_0x00ba
        L_0x0081:
            com.tencent.mm.plugin.sns.ui.w6 r7 = r2.getStruct()
            com.tencent.mm.plugin.sns.storage.SnsInfo r7 = r7.f281367a
            if (r7 != 0) goto L_0x008d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r4)
            goto L_0x00ba
        L_0x008d:
            r11 = 2
            int[] r11 = new int[r11]
            com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView r12 = r2.getAvatarImage()
            r12.getLocationOnScreen(r11)
            uo3.a r13 = new uo3.a
            android.content.Context r12 = r2.getContext()
            r13.<init>(r12)
            com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView r14 = r2.getAvatarImage()
            pu2.t r15 = new pu2.t
            r15.<init>(r7, r2)
            pu2.u r12 = new pu2.u
            r12.<init>(r2, r6, r7)
            r17 = r11[r10]
            r18 = r11[r9]
            r16 = r12
            r13.mo108273h(r14, r15, r16, r17, r18)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r4)
        L_0x00ba:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            r2 = 1
            java.lang.String r4 = "com/tencent/mm/plugin/sns/ui/item/improve/TimelineItemClick$updateClickListener$2"
            java.lang.String r5 = "android/view/View$OnLongClickListener"
            java.lang.String r6 = "onLongClick"
            java.lang.String r7 = "(Landroid/view/View;)Z"
            r3 = r19
            j20.C117292a.m165362h(r2, r3, r4, r5, r6, r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: pu2.C62520b0.onLongClick(android.view.View):boolean");
    }
}
