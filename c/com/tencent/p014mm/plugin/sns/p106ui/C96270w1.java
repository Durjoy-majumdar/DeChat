package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import dv2.C58442c;

/* renamed from: com.tencent.mm.plugin.sns.ui.w1 */
public class C96270w1 extends C96313x4 {
    public C96270w1(Context context, C58442c cVar) {
        super(context, cVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: com.tencent.mm.plugin.sns.ui.x4$$i} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo133513b(int r17, int r18, boolean r19, android.view.View r20, android.view.ViewGroup r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            java.lang.String r3 = "getRealChildView"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.NewSnsLabelUIAdapter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            java.lang.Class<ny.h> r5 = p629ny.C76979h.class
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r6)
            dv2.c r7 = r0.f281645d
            int r7 = r7.mo83404j(r1)
            r8 = 3
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r17)
            r11 = 0
            r9[r11] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r18)
            r12 = 1
            r9[r12] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            r13 = 2
            r9[r13] = r10
            java.lang.String r10 = "MicroMsg.Sns.AnimatedExpandableListAdapter"
            java.lang.String r14 = "getRealChildView: groupPosition:%d, childPosition:%d, visibleState:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r14, r9)
            if (r20 != 0) goto L_0x00a6
            int r9 = r0.f281649h
            r14 = 0
            if (r9 != r12) goto L_0x004a
            android.view.LayoutInflater r9 = r0.f281648g
            r15 = 2131497678(0x7f0c12ce, float:1.8618956E38)
            android.view.View r9 = r9.inflate(r15, r14)
            goto L_0x0053
        L_0x004a:
            android.view.LayoutInflater r9 = r0.f281648g
            r15 = 2131497677(0x7f0c12cd, float:1.8618954E38)
            android.view.View r9 = r9.inflate(r15, r14)
        L_0x0053:
            com.tencent.mm.plugin.sns.ui.x4$$i r14 = new com.tencent.mm.plugin.sns.ui.x4$$i
            r14.<init>(r0)
            r15 = 2131314025(0x7f094569, float:1.8246463E38)
            android.view.View r15 = r9.findViewById(r15)
            android.widget.TextView r15 = (android.widget.TextView) r15
            r14.f281681a = r15
            r15 = 2131314024(0x7f094568, float:1.8246461E38)
            android.view.View r15 = r9.findViewById(r15)
            android.widget.TextView r15 = (android.widget.TextView) r15
            r14.f281682b = r15
            r15 = 2131314023(0x7f094567, float:1.824646E38)
            android.view.View r15 = r9.findViewById(r15)
            android.widget.TextView r15 = (android.widget.TextView) r15
            r14.f281683c = r15
            r15 = 2131314022(0x7f094566, float:1.8246457E38)
            android.view.View r15 = r9.findViewById(r15)
            android.widget.TextView r15 = (android.widget.TextView) r15
            r14.f281684d = r15
            r15 = 2131314016(0x7f094560, float:1.8246445E38)
            android.view.View r15 = r9.findViewById(r15)
            android.widget.ImageView r15 = (android.widget.ImageView) r15
            r14.f281685e = r15
            r15 = 2131314021(0x7f094565, float:1.8246455E38)
            android.view.View r15 = r9.findViewById(r15)
            android.widget.ImageView r15 = (android.widget.ImageView) r15
            r14.f281686f = r15
            com.tencent.mm.plugin.sns.ui.x4$$a r12 = new com.tencent.mm.plugin.sns.ui.x4$$a
            r12.<init>(r0)
            r15.setOnClickListener(r12)
            r9.setTag(r14)
            goto L_0x00af
        L_0x00a6:
            java.lang.Object r9 = r20.getTag()
            r14 = r9
            com.tencent.mm.plugin.sns.ui.x4$$i r14 = (com.tencent.p014mm.plugin.sns.p106ui.x4$$i) r14
            r9 = r20
        L_0x00af:
            dv2.c r12 = r0.f281645d
            int r15 = com.tencent.p014mm.plugin.sns.p106ui.C96313x4.f281640v
            boolean r12 = r12.mo83395a(r7, r2, r15)
            r8 = 8
            java.lang.String r13 = "isEnableUseNewGroup"
            r15 = 2131099806(0x7f06009e, float:1.7811976E38)
            if (r12 == 0) goto L_0x0273
            android.widget.TextView r1 = r14.f281681a
            r1.setVisibility(r8)
            android.widget.TextView r1 = r14.f281682b
            r1.setVisibility(r8)
            android.widget.ImageView r1 = r14.f281685e
            r1.setVisibility(r8)
            android.widget.ImageView r1 = r14.f281686f
            r1.setVisibility(r8)
            android.widget.TextView r1 = r14.f281683c
            r1.setVisibility(r11)
            android.widget.TextView r1 = r14.f281684d
            r1.setVisibility(r11)
            int r1 = com.tencent.p014mm.plugin.sns.p106ui.C96313x4.f281640v
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r4)
            android.widget.TextView r2 = r14.f281683c
            android.content.Context r5 = r0.f281647f
            dv2.c r8 = r0.f281645d
            int r8 = r8.mo83399e(r7, r1)
            java.lang.String r5 = kg3.C76577a.m92166q(r5, r8)
            r2.setText(r5)
            android.widget.TextView r2 = r14.f281684d
            android.content.Context r5 = r0.f281647f
            r8 = 2131099804(0x7f06009c, float:1.7811972E38)
            int r5 = kg3.C76577a.m92153d(r5, r8)
            r2.setTextColor(r5)
            android.widget.TextView r2 = r14.f281684d
            r2.setSingleLine(r11)
            dv2.c r2 = r0.f281645d
            r5 = 2
            boolean r2 = r2.mo83405k(r7, r5)
            r5 = 2131821739(0x7f1104ab, float:1.927623E38)
            r8 = 500(0x1f4, float:7.0E-43)
            java.lang.String r10 = "packageContactName"
            if (r2 == 0) goto L_0x01bc
            java.util.ArrayList<java.lang.String> r2 = r0.f281655n
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0137
            android.widget.TextView r2 = r14.f281684d
            android.content.Context r5 = r0.f281647f
            dv2.c r8 = r0.f281645d
            int r1 = r8.mo83398d(r7, r1)
            java.lang.String r1 = kg3.C76577a.m92166q(r5, r1)
            r2.setText(r1)
            goto L_0x04ee
        L_0x0137:
            android.widget.TextView r1 = r14.f281684d
            android.content.Context r2 = r0.f281647f
            android.content.res.Resources r2 = r2.getResources()
            int r2 = r2.getColor(r15)
            r1.setTextColor(r2)
            java.lang.CharSequence r1 = r0.f281660s
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x015c
            android.widget.TextView r1 = r14.f281684d
            java.lang.CharSequence r2 = r0.f281660s
            r1.setText(r2)
            android.widget.TextView r1 = r14.f281684d
            r1.setVisibility(r11)
            goto L_0x04ee
        L_0x015c:
            java.util.ArrayList<java.lang.String> r1 = r0.f281655n
            int r1 = r1.size()
            if (r1 >= r8) goto L_0x0185
            java.util.ArrayList<java.lang.String> r1 = r0.f281655n
            android.content.Context r2 = r0.f281647f
            android.content.res.Resources r2 = r2.getResources()
            r5 = 2131101535(0x7f06075f, float:1.7815482E38)
            int r2 = r2.getColor(r5)
            java.lang.CharSequence r1 = r0.mo134146j(r1, r2)
            r0.f281660s = r1
            android.widget.TextView r2 = r14.f281684d
            r2.setText(r1)
            android.widget.TextView r1 = r14.f281684d
            r1.setVisibility(r11)
            goto L_0x04ee
        L_0x0185:
            wh2.b r1 = new wh2.b
            r1.<init>()
            android.content.Context r2 = r0.f281647f
            com.tencent.mm.plugin.sns.ui.x4$$b r7 = new com.tencent.mm.plugin.sns.ui.x4$$b
            r7.<init>()
            r1.mo142015b(r2, r11, r5, r7)
            java.util.ArrayList<java.lang.String> r2 = r0.f281655n
            android.content.Context r5 = r0.f281647f
            android.content.res.Resources r5 = r5.getResources()
            r7 = 2131101535(0x7f06075f, float:1.7815482E38)
            int r5 = r5.getColor(r7)
            com.tencent.mm.plugin.sns.ui.x4$$c r7 = new com.tencent.mm.plugin.sns.ui.x4$$c
            r7.<init>(r0, r14, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r6)
            zt3.t r1 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.sns.ui.x4$$f r8 = new com.tencent.mm.plugin.sns.ui.x4$$f
            r8.<init>(r0, r2, r5, r7)
            zt3.j r1 = (zt3.C119157j) r1
            r1.mo183870a(r8)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r6)
            goto L_0x04ee
        L_0x01bc:
            dv2.c r2 = r0.f281645d
            r12 = 3
            boolean r2 = r2.mo83405k(r7, r12)
            if (r2 == 0) goto L_0x04ee
            java.util.ArrayList<java.lang.String> r2 = r0.f281656o
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x01ee
            android.widget.TextView r2 = r14.f281684d
            android.content.Context r5 = r0.f281647f
            r8 = 2131099710(0x7f06003e, float:1.781178E38)
            int r5 = kg3.C76577a.m92153d(r5, r8)
            r2.setTextColor(r5)
            android.widget.TextView r2 = r14.f281684d
            android.content.Context r5 = r0.f281647f
            dv2.c r8 = r0.f281645d
            int r1 = r8.mo83398d(r7, r1)
            java.lang.String r1 = kg3.C76577a.m92166q(r5, r1)
            r2.setText(r1)
            goto L_0x04ee
        L_0x01ee:
            android.widget.TextView r1 = r14.f281684d
            android.content.Context r2 = r0.f281647f
            android.content.res.Resources r2 = r2.getResources()
            int r2 = r2.getColor(r15)
            r1.setTextColor(r2)
            java.lang.CharSequence r1 = r0.f281661t
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0213
            android.widget.TextView r1 = r14.f281684d
            java.lang.CharSequence r2 = r0.f281661t
            r1.setText(r2)
            android.widget.TextView r1 = r14.f281684d
            r1.setVisibility(r11)
            goto L_0x04ee
        L_0x0213:
            java.util.ArrayList<java.lang.String> r1 = r0.f281656o
            int r1 = r1.size()
            if (r1 >= r8) goto L_0x023c
            java.util.ArrayList<java.lang.String> r1 = r0.f281656o
            android.content.Context r2 = r0.f281647f
            android.content.res.Resources r2 = r2.getResources()
            r5 = 2131101536(0x7f060760, float:1.7815484E38)
            int r2 = r2.getColor(r5)
            java.lang.CharSequence r1 = r0.mo134146j(r1, r2)
            r0.f281661t = r1
            android.widget.TextView r2 = r14.f281684d
            r2.setText(r1)
            android.widget.TextView r1 = r14.f281684d
            r1.setVisibility(r11)
            goto L_0x04ee
        L_0x023c:
            wh2.b r1 = new wh2.b
            r1.<init>()
            android.content.Context r2 = r0.f281647f
            com.tencent.mm.plugin.sns.ui.x4$$d r7 = new com.tencent.mm.plugin.sns.ui.x4$$d
            r7.<init>()
            r1.mo142015b(r2, r11, r5, r7)
            java.util.ArrayList<java.lang.String> r2 = r0.f281656o
            android.content.Context r5 = r0.f281647f
            android.content.res.Resources r5 = r5.getResources()
            r7 = 2131101536(0x7f060760, float:1.7815484E38)
            int r5 = r5.getColor(r7)
            com.tencent.mm.plugin.sns.ui.x4$$e r7 = new com.tencent.mm.plugin.sns.ui.x4$$e
            r7.<init>(r0, r14, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r6)
            zt3.t r1 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.sns.ui.x4$$f r8 = new com.tencent.mm.plugin.sns.ui.x4$$f
            r8.<init>(r0, r2, r5, r7)
            zt3.j r1 = (zt3.C119157j) r1
            r1.mo183870a(r8)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r6)
            goto L_0x04ee
        L_0x0273:
            dv2.c r12 = r0.f281645d
            int r15 = com.tencent.p014mm.plugin.sns.p106ui.C96313x4.f281639u
            boolean r12 = r12.mo83395a(r7, r2, r15)
            if (r12 == 0) goto L_0x0356
            android.widget.TextView r1 = r14.f281681a
            r1.setVisibility(r8)
            android.widget.ImageView r1 = r14.f281685e
            r1.setVisibility(r8)
            android.widget.ImageView r1 = r14.f281686f
            r1.setVisibility(r8)
            android.widget.TextView r1 = r14.f281683c
            r1.setVisibility(r11)
            android.widget.TextView r1 = r14.f281682b
            r1.setVisibility(r8)
            android.widget.TextView r1 = r14.f281684d
            r1.setVisibility(r11)
            int r1 = com.tencent.p014mm.plugin.sns.p106ui.C96313x4.f281639u
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r4)
            android.widget.TextView r2 = r14.f281683c
            android.content.Context r5 = r0.f281647f
            dv2.c r8 = r0.f281645d
            int r8 = r8.mo83399e(r7, r1)
            java.lang.String r5 = kg3.C76577a.m92166q(r5, r8)
            r2.setText(r5)
            android.widget.TextView r2 = r14.f281684d
            android.content.Context r5 = r0.f281647f
            r8 = 2131099804(0x7f06009c, float:1.7811972E38)
            int r5 = kg3.C76577a.m92153d(r5, r8)
            r2.setTextColor(r5)
            android.widget.TextView r2 = r14.f281684d
            r2.setSingleLine(r11)
            java.util.ArrayList<java.lang.String> r2 = r0.f281654m
            com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.m123418P7(r2)
            dv2.c r2 = r0.f281645d
            r5 = 3
            boolean r2 = r2.mo83405k(r7, r5)
            if (r2 == 0) goto L_0x0313
            java.util.ArrayList<java.lang.String> r2 = r0.f281654m
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x02f0
            android.widget.TextView r2 = r14.f281684d
            android.content.Context r5 = r0.f281647f
            dv2.c r8 = r0.f281645d
            int r1 = r8.mo83398d(r7, r1)
            java.lang.String r1 = kg3.C76577a.m92166q(r5, r1)
            r2.setText(r1)
            goto L_0x04ee
        L_0x02f0:
            android.widget.TextView r1 = r14.f281684d
            android.content.Context r2 = r0.f281647f
            android.content.res.Resources r2 = r2.getResources()
            r5 = 2131099806(0x7f06009e, float:1.7811976E38)
            int r2 = r2.getColor(r5)
            r1.setTextColor(r2)
            android.widget.TextView r1 = r14.f281684d
            java.util.ArrayList<java.lang.String> r2 = r0.f281654m
            r5 = 2131101536(0x7f060760, float:1.7815484E38)
            r7 = 1
            java.lang.CharSequence r2 = com.tencent.p014mm.plugin.sns.p106ui.C96313x4.m123522k(r2, r7, r5)
            r1.setText(r2)
            goto L_0x04ee
        L_0x0313:
            java.util.ArrayList<java.lang.String> r2 = r0.f281653l
            com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.m123418P7(r2)
            java.util.ArrayList<java.lang.String> r2 = r0.f281653l
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0333
            android.widget.TextView r2 = r14.f281684d
            android.content.Context r5 = r0.f281647f
            dv2.c r8 = r0.f281645d
            int r1 = r8.mo83398d(r7, r1)
            java.lang.String r1 = kg3.C76577a.m92166q(r5, r1)
            r2.setText(r1)
            goto L_0x04ee
        L_0x0333:
            android.widget.TextView r1 = r14.f281684d
            android.content.Context r2 = r0.f281647f
            android.content.res.Resources r2 = r2.getResources()
            r5 = 2131099806(0x7f06009e, float:1.7811976E38)
            int r2 = r2.getColor(r5)
            r1.setTextColor(r2)
            android.widget.TextView r1 = r14.f281684d
            java.util.ArrayList<java.lang.String> r2 = r0.f281653l
            r5 = 2131101535(0x7f06075f, float:1.7815482E38)
            r12 = 1
            java.lang.CharSequence r2 = com.tencent.p014mm.plugin.sns.p106ui.C96313x4.m123522k(r2, r12, r5)
            r1.setText(r2)
            goto L_0x04ee
        L_0x0356:
            r12 = 1
            int r13 = com.tencent.p014mm.plugin.sns.p106ui.C96313x4.f281641w
            int r2 = r2 - r13
            r13 = 2
            java.lang.Object[] r15 = new java.lang.Object[r13]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r17)
            r15[r11] = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r2)
            r15[r12] = r13
            java.lang.String r12 = "getRealChildView: groupPosition:%d, realPosition:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r12, r15)
            android.widget.ImageView r10 = r14.f281686f
            java.lang.String r12 = "initMoreBtnIndicator"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r6)
            java.lang.Object r13 = r10.getTag()
            if (r13 == 0) goto L_0x038b
            boolean r13 = r13 instanceof com.tencent.p014mm.plugin.sns.p106ui.x4$$k
            if (r13 != 0) goto L_0x0380
            goto L_0x038b
        L_0x0380:
            java.lang.Object r10 = r10.getTag()
            com.tencent.mm.plugin.sns.ui.x4$$k r10 = (com.tencent.p014mm.plugin.sns.p106ui.x4$$k) r10
            r10.f281687a = r1
            r10.f281688b = r2
            goto L_0x0397
        L_0x038b:
            com.tencent.mm.plugin.sns.ui.x4$$k r13 = new com.tencent.mm.plugin.sns.ui.x4$$k
            r13.<init>(r0)
            r13.f281687a = r1
            r13.f281688b = r2
            r10.setTag(r13)
        L_0x0397:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r6)
            android.widget.TextView r10 = r14.f281681a
            r10.setVisibility(r11)
            android.widget.TextView r10 = r14.f281682b
            r10.setVisibility(r11)
            android.widget.ImageView r10 = r14.f281685e
            r10.setVisibility(r11)
            android.widget.ImageView r10 = r14.f281686f
            r10.setVisibility(r11)
            android.widget.TextView r10 = r14.f281683c
            r10.setVisibility(r8)
            android.widget.TextView r10 = r14.f281684d
            r10.setVisibility(r8)
            java.util.ArrayList<java.lang.String> r8 = r0.f281646e
            java.lang.Object r2 = r8.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            android.widget.TextView r8 = r14.f281681a
            di3.d r10 = di3.C86312j.m106911c(r5)
            ny.h r10 = (p629ny.C76979h) r10
            android.content.Context r11 = r0.f281647f
            android.text.SpannableString r10 = r10.mo107057T1(r11, r2)
            r8.setText(r10)
            android.widget.TextView r8 = r14.f281682b
            java.lang.String r10 = "getDisplayNamesByLabel"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r6)
            b22.b r11 = b22.C28250a.m38138a()
            a22.a r11 = (a22.C67001a) r11
            java.lang.String r11 = r11.mo90968f(r2)
            b22.b r12 = b22.C28250a.m38138a()
            a22.a r12 = (a22.C67001a) r12
            java.util.List r11 = r12.mo90973k(r11)
            if (r11 == 0) goto L_0x0434
            int r12 = r11.size()
            if (r12 != 0) goto L_0x03f5
            goto L_0x0434
        L_0x03f5:
            java.util.ArrayList r12 = new java.util.ArrayList
            int r13 = r11.size()
            r12.<init>(r13)
            java.util.Iterator r11 = r11.iterator()
        L_0x0402:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x041e
            java.lang.Class<d62.i> r13 = d62.C75339i.class
            di3.d r13 = di3.C86312j.m106911c(r13)
            d62.i r13 = (d62.C75339i) r13
            java.lang.Object r15 = r11.next()
            java.lang.String r15 = (java.lang.String) r15
            java.lang.String r13 = r13.getDisplayName(r15)
            r12.add(r13)
            goto L_0x0402
        L_0x041e:
            java.lang.String r11 = ","
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.listToString(r12, r11)
            di3.d r5 = di3.C86312j.m106911c(r5)
            ny.h r5 = (p629ny.C76979h) r5
            android.content.Context r12 = r0.f281647f
            android.text.SpannableString r5 = r5.mo107057T1(r12, r11)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r6)
            goto L_0x0439
        L_0x0434:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r6)
            java.lang.String r5 = ""
        L_0x0439:
            r8.setText(r5)
            android.widget.ImageView r5 = r14.f281686f
            android.content.Context r8 = r0.f281647f
            r10 = 2131756986(0x7f1007ba, float:1.9144895E38)
            android.content.res.Resources r11 = r8.getResources()
            r12 = 2131099710(0x7f06003e, float:1.781178E38)
            int r11 = r11.getColor(r12)
            android.graphics.drawable.Drawable r8 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r8, r10, r11)
            r5.setImageDrawable(r8)
            int r5 = r0.f281649h
            r8 = 1
            if (r5 != r8) goto L_0x04ae
            dv2.c r5 = r0.f281645d
            r10 = 2
            boolean r5 = r5.mo83405k(r7, r10)
            if (r5 == 0) goto L_0x047d
            boolean r1 = r0.mo134142h(r8, r2)
            if (r1 == 0) goto L_0x0473
            android.widget.ImageView r1 = r14.f281685e
            r2 = 2131756968(0x7f1007a8, float:1.9144858E38)
            r1.setImageResource(r2)
            goto L_0x04ee
        L_0x0473:
            android.widget.ImageView r1 = r14.f281685e
            r2 = 2131756970(0x7f1007aa, float:1.9144863E38)
            r1.setImageResource(r2)
            goto L_0x04ee
        L_0x047d:
            dv2.c r5 = r0.f281645d
            r8 = 3
            boolean r5 = r5.mo83405k(r7, r8)
            if (r5 == 0) goto L_0x04ee
            int r5 = r0.f281650i
            r7 = 2131756971(0x7f1007ab, float:1.9144865E38)
            r8 = 2131756969(0x7f1007a9, float:1.914486E38)
            if (r5 == r1) goto L_0x0496
            android.widget.ImageView r1 = r14.f281685e
            r1.setImageResource(r7)
            goto L_0x049b
        L_0x0496:
            android.widget.ImageView r1 = r14.f281685e
            r1.setImageResource(r8)
        L_0x049b:
            r1 = 2
            boolean r1 = r0.mo134142h(r1, r2)
            if (r1 == 0) goto L_0x04a8
            android.widget.ImageView r1 = r14.f281685e
            r1.setImageResource(r8)
            goto L_0x04ee
        L_0x04a8:
            android.widget.ImageView r1 = r14.f281685e
            r1.setImageResource(r7)
            goto L_0x04ee
        L_0x04ae:
            r1 = 2
            dv2.c r5 = r0.f281645d
            boolean r5 = r5.mo83405k(r7, r1)
            r1 = 2131231750(0x7f080406, float:1.807959E38)
            if (r5 == 0) goto L_0x04d0
            r5 = 1
            boolean r2 = r0.mo134142h(r5, r2)
            if (r2 == 0) goto L_0x04ca
            android.widget.ImageView r1 = r14.f281685e
            r2 = 2131755390(0x7f10017e, float:1.9141658E38)
            r1.setImageResource(r2)
            goto L_0x04ee
        L_0x04ca:
            android.widget.ImageView r2 = r14.f281685e
            r2.setImageResource(r1)
            goto L_0x04ee
        L_0x04d0:
            dv2.c r5 = r0.f281645d
            r8 = 3
            boolean r5 = r5.mo83405k(r7, r8)
            if (r5 == 0) goto L_0x04ee
            r5 = 2
            boolean r2 = r0.mo134142h(r5, r2)
            if (r2 == 0) goto L_0x04e9
            android.widget.ImageView r1 = r14.f281685e
            r2 = 2131755404(0x7f10018c, float:1.9141686E38)
            r1.setImageResource(r2)
            goto L_0x04ee
        L_0x04e9:
            android.widget.ImageView r2 = r14.f281685e
            r2.setImageResource(r1)
        L_0x04ee:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r6)
            android.content.Context r1 = r0.f281647f
            r2 = 2131165359(0x7f0700af, float:1.7944933E38)
            int r1 = kg3.C76577a.m92157h(r1, r2)
            int r2 = r9.getPaddingTop()
            int r5 = r9.getPaddingRight()
            int r6 = r9.getPaddingBottom()
            r9.setPadding(r1, r2, r5, r6)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.C96270w1.mo133513b(int, int, boolean, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
