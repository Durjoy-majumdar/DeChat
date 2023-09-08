package com.tencent.p014mm.plugin.sns.p106ui;

import ep3.C97683a;
import jv2.C99064d;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$q */
public class SnsTimeLineUI$$q implements C97683a.C75650e<C99064d> {

    /* renamed from: a */
    public final /* synthetic */ SnsTimeLineUI f278777a;

    public SnsTimeLineUI$$q(SnsTimeLineUI snsTimeLineUI) {
        this.f278777a = snsTimeLineUI;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0205  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo93771a(java.lang.Object r19) {
        /*
            r18 = this;
            r1 = r18
            java.lang.String r2 = "resolved"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$36"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            r4 = r19
            jv2.d r4 = (jv2.C99064d) r4
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            if (r4 != 0) goto L_0x0018
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            goto L_0x0237
        L_0x0018:
            int r0 = r4.f290387b
            r5 = 0
            r6 = 8
            if (r0 > 0) goto L_0x004e
            java.util.List<java.lang.Long> r0 = r4.f290388c
            if (r0 == 0) goto L_0x002b
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r0 > 0) goto L_0x004e
        L_0x002b:
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r0 = r1.f278777a
            com.tencent.mm.plugin.sns.ui.SnsUIAction r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122302d8(r0)
            com.tencent.mm.plugin.sns.ui.SnsHeader r0 = r0.f278860p
            if (r0 == 0) goto L_0x0044
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r0 = r1.f278777a
            com.tencent.mm.plugin.sns.ui.SnsUIAction r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122302d8(r0)
            com.tencent.mm.plugin.sns.ui.SnsHeader r0 = r0.f278860p
            boolean r0 = r0.mo132748l()
            if (r0 == 0) goto L_0x0044
            goto L_0x004e
        L_0x0044:
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r0 = r1.f278777a
            android.widget.LinearLayout r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122296X7(r0)
            r0.setVisibility(r6)
            goto L_0x0057
        L_0x004e:
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r0 = r1.f278777a
            android.widget.LinearLayout r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122296X7(r0)
            r0.setVisibility(r5)
        L_0x0057:
            int r0 = r4.f290387b
            java.lang.String r7 = "MicroMsg.SnsTimeLineUI"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI"
            r9 = 2131314057(0x7f094589, float:1.8246528E38)
            if (r0 <= 0) goto L_0x0143
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r0 = r1.f278777a
            int r10 = r0.f278646P1
            if (r10 != 0) goto L_0x0143
            java.lang.String r10 = "access$3900"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r8)
            java.lang.String r11 = "setNotify"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r8)
            r12 = 2131314064(0x7f094590, float:1.8246542E38)
            android.view.View r13 = r0.findViewById(r12)
            if (r13 != 0) goto L_0x0080
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r8)
            goto L_0x00f3
        L_0x0080:
            android.view.View r12 = r0.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            android.content.res.Resources r13 = r0.getResources()
            r14 = 2131689505(0x7f0f0021, float:1.9008027E38)
            int r15 = r4.f290387b
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Integer r16 = java.lang.Integer.valueOf(r15)
            r6[r5] = r16
            java.lang.String r6 = r13.getQuantityString(r14, r15, r6)
            r12.setText(r6)
            r6 = 2131314059(0x7f09458b, float:1.8246532E38)
            android.view.View r0 = r0.findViewById(r6)
            r6 = r0
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            long r12 = r4.f290389d     // Catch:{ Exception -> 0x00c6 }
            r14 = 0
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x00e0
            os2.j r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.zx0()     // Catch:{ Exception -> 0x00c6 }
            com.tencent.mm.plugin.sns.storage.AdSnsInfo r0 = r0.mo139864jo(r12)     // Catch:{ Exception -> 0x00c6 }
            if (r0 == 0) goto L_0x00e0
            com.tencent.mm.plugin.sns.storage.SnsInfo r0 = r0.convertToSnsInfo()     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r12 = r4.f290386a     // Catch:{ Exception -> 0x00c6 }
            boolean r0 = gv2.C98242p.m126945g(r6, r0, r12)     // Catch:{ Exception -> 0x00c6 }
            goto L_0x00e1
        L_0x00c6:
            r0 = move-exception
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "trySetAdBossCommentAvater exp="
            r12.append(r13)
            java.lang.String r0 = r0.toString()
            r12.append(r0)
            java.lang.String r0 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)
        L_0x00e0:
            r0 = 0
        L_0x00e1:
            if (r0 != 0) goto L_0x00f0
            java.lang.Class<ln.f> r0 = p196ln.C76705f.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ln.f r0 = (p196ln.C76705f) r0
            java.lang.String r12 = r4.f290386a
            r0.mo106849z(r6, r12)
        L_0x00f0:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r8)
        L_0x00f3:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r8)
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r0 = r1.f278777a
            android.widget.LinearLayout r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122296X7(r0)
            android.view.View r0 = r0.findViewById(r9)
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r6.mo10233c(r9)
            java.lang.Object[] r11 = r6.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/sns/ui/SnsTimeLineUI$36"
            java.lang.String r13 = "resolved"
            java.lang.String r14 = "(Lcom/tencent/mm/plugin/sns/vending/TimelineIndex$TimelineNotifyListStruct;)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r10 = r0
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r6 = r6.mo10231a(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.setVisibility(r6)
            java.lang.String r11 = "com/tencent/mm/plugin/sns/ui/SnsTimeLineUI$36"
            java.lang.String r12 = "resolved"
            java.lang.String r13 = "(Lcom/tencent/mm/plugin/sns/vending/TimelineIndex$TimelineNotifyListStruct;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0191
        L_0x0143:
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r0 = r1.f278777a
            android.widget.LinearLayout r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122296X7(r0)
            android.view.View r0 = r0.findViewById(r9)
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            r9 = 8
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r6.mo10233c(r10)
            java.lang.Object[] r11 = r6.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/sns/ui/SnsTimeLineUI$36"
            java.lang.String r13 = "resolved"
            java.lang.String r14 = "(Lcom/tencent/mm/plugin/sns/vending/TimelineIndex$TimelineNotifyListStruct;)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r10 = r0
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r6 = r6.mo10231a(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.setVisibility(r6)
            java.lang.String r11 = "com/tencent/mm/plugin/sns/ui/SnsTimeLineUI$36"
            java.lang.String r12 = "resolved"
            java.lang.String r13 = "(Lcom/tencent/mm/plugin/sns/vending/TimelineIndex$TimelineNotifyListStruct;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
        L_0x0191:
            java.util.List<java.lang.Long> r0 = r4.f290388c
            if (r0 == 0) goto L_0x0205
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0205
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r0 = r1.f278777a
            android.widget.LinearLayout r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122297Y7(r0)
            r0.setVisibility(r5)
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r0 = r1.f278777a
            android.widget.LinearLayout r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122297Y7(r0)
            r0.removeAllViews()
            java.util.List<java.lang.Long> r0 = r4.f290388c
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x01b7:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0210
            java.lang.Object r4 = r0.next()
            java.lang.Long r4 = (java.lang.Long) r4
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r5 = r1.f278777a
            long r14 = r4.longValue()
            java.lang.String r4 = "access$4100"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r8)
            r5.getClass()
            java.lang.String r6 = "notifyMediaContentCollapse"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r8)
            os2.e0 r9 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            com.tencent.mm.plugin.sns.storage.SnsInfo r13 = r9.mo139806SE(r14)
            if (r13 != 0) goto L_0x01e7
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r8)
            r19 = r0
            goto L_0x01ff
        L_0x01e7:
            com.tencent.mm.protocal.protobuf.TimeLineObject r12 = r13.getTimeLine()
            android.view.LayoutInflater r11 = android.view.LayoutInflater.from(r5)
            com.tencent.mm.plugin.sns.ui.v6 r10 = new com.tencent.mm.plugin.sns.ui.v6
            r9 = r10
            r19 = r0
            r0 = r10
            r10 = r5
            r9.<init>(r10, r11, r12, r13, r14)
            r5.runOnUiThread(r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r8)
        L_0x01ff:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r8)
            r0 = r19
            goto L_0x01b7
        L_0x0205:
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r0 = r1.f278777a
            android.widget.LinearLayout r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122297Y7(r0)
            r4 = 8
            r0.setVisibility(r4)
        L_0x0210:
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r0 = r1.f278777a
            ft2.c r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122282J7(r0)
            if (r0 == 0) goto L_0x0234
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r0 = r1.f278777a
            com.tencent.mm.plugin.sns.ui.TestTimeForSns r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122298Z7(r0)
            boolean r0 = r0.hasDrawed()
            if (r0 == 0) goto L_0x0234
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r0 = r1.f278777a
            ft2.c r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122282J7(r0)
            java.lang.String r4 = ""
            r0.mo133186F0(r4)
            java.lang.String r0 = "has not show view, pass"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
        L_0x0234:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
        L_0x0237:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI$$q.mo93771a(java.lang.Object):void");
    }
}
