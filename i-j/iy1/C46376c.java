package iy1;

import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.MRecyclerView;
import com.tencent.p014mm.plugin.game.luggage.p801ui.circle.PostCommentDialogUI;

/* renamed from: iy1.c */
public final class C46376c implements MRecyclerView.C40583d {

    /* renamed from: a */
    public final /* synthetic */ PostCommentDialogUI f124971a;

    public C46376c(PostCommentDialogUI postCommentDialogUI) {
        this.f124971a = postCommentDialogUI;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0303  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo23073a(androidx.recyclerview.widget.RecyclerView r18, android.view.View r19, int r20, long r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            r2 = r20
            r3 = 0
            if (r1 == 0) goto L_0x0013
            r4 = 2131297360(0x7f090450, float:1.8212663E38)
            android.view.View r1 = r1.findViewById(r4)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            goto L_0x0014
        L_0x0013:
            r1 = r3
        L_0x0014:
            com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI r4 = r0.f124971a
            com.tencent.mm.plugin.game.luggage.ui.circle.AtSomeoneView r4 = r4.mo65905K7()
            com.tencent.mm.plugin.game.luggage.ui.circle.AtSomeoneView$e r4 = r4.getmAdapter()
            java.util.List<uw1.f> r4 = r4.f113125e
            java.util.LinkedList r4 = (java.util.LinkedList) r4
            java.lang.Object r4 = r4.get(r2)
            uw1.f r4 = (uw1.C52628f) r4
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.lang.String r6 = r4.f146943d
            java.lang.String r7 = "userData.username"
            gy3.C87412m.m108593f(r6, r7)
            java.lang.String r8 = "openid"
            r5.put(r8, r6)
            com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI r6 = r0.f124971a
            com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI$a r6 = r6.f113138D
            java.lang.String r6 = r6.f113162b
            java.lang.String r8 = ""
            boolean r6 = gy3.C87412m.m108589b(r6, r8)
            r10 = 1
            if (r6 == 0) goto L_0x0052
            com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI r6 = r0.f124971a
            com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI$a r6 = r6.f113138D
            boolean r6 = r6.f113161a
            if (r6 == 0) goto L_0x0052
            r6 = 0
            goto L_0x0053
        L_0x0052:
            r6 = 1
        L_0x0053:
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r11 = "is_search"
            r5.put(r11, r6)
            com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI r6 = r0.f124971a
            com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI$a r6 = r6.f113138D
            java.util.HashMap<java.lang.String, java.lang.Integer> r6 = r6.f113164d
            java.lang.String r11 = r4.f146943d
            gy3.C87412m.m108593f(r11, r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r20)
            r6.put(r11, r7)
            com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI r6 = r0.f124971a
            r6.getClass()
            com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI$a r7 = r6.f113138D
            java.util.List<java.lang.String> r7 = r7.f113163c
            java.lang.String r11 = r4.f146943d
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            boolean r7 = r7.contains(r11)
            java.lang.String r11 = "atSomeone.username"
            if (r7 != 0) goto L_0x02df
            java.lang.String r7 = r4.f146943d
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 != 0) goto L_0x02df
            java.lang.String r7 = r4.f146944e
            com.tencent.mm.ui.tools.p0$a r12 = com.tencent.p014mm.p136ui.tools.C45078p0.C45079a.MODE_CHINESE_AS_2
            int r7 = com.tencent.p014mm.p136ui.tools.C45078p0.m49926e(r7, r12)
            int r7 = r7 + 2
            com.tencent.mm.ui.widget.MMEditText r13 = r6.f113142e
            java.lang.String r14 = "gameCommentInputTxt"
            if (r13 == 0) goto L_0x02db
            android.text.Editable r13 = r13.getText()
            java.lang.String r13 = r13.toString()
            int r12 = com.tencent.p014mm.p136ui.tools.C45078p0.m49926e(r13, r12)
            int r7 = r7 + r12
            int r12 = r6.f113140F
            if (r7 <= r12) goto L_0x00bd
            androidx.appcompat.app.AppCompatActivity r3 = r6.getContext()
            r4 = 2131830966(0x7f1128b6, float:1.9294944E38)
            java.lang.String r4 = r6.getString(r4)
            nj3.C76912y0.m92767f(r3, r4)
            r9 = 0
            goto L_0x0301
        L_0x00bd:
            com.tencent.mm.ui.widget.MMEditText r7 = r6.f113142e
            if (r7 == 0) goto L_0x02d7
            int r7 = r7.getSelectionStart()
            com.tencent.mm.ui.widget.MMEditText r12 = r6.f113142e
            if (r12 == 0) goto L_0x02d3
            android.text.Editable r12 = r12.getText()
            int r12 = r12.length()
            if (r7 <= r12) goto L_0x00e4
            com.tencent.mm.ui.widget.MMEditText r7 = r6.f113142e
            if (r7 == 0) goto L_0x00e0
            android.text.Editable r7 = r7.getText()
            int r7 = r7.length()
            goto L_0x00e4
        L_0x00e0:
            gy3.C87412m.m108603p(r14)
            throw r3
        L_0x00e4:
            com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI$a r12 = r6.f113138D
            java.util.HashMap<java.lang.String, rx3.l<java.lang.Integer, java.lang.Integer>> r12 = r12.f113165e
            java.util.Set r12 = r12.entrySet()
            java.util.Iterator r12 = r12.iterator()
        L_0x00f0:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0155
            java.lang.Object r13 = r12.next()
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            java.lang.Object r15 = r13.getValue()
            rx3.l r15 = (rx3.C13604l) r15
            A r15 = r15.f38555d
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            if (r7 > r15) goto L_0x00f0
            boolean r15 = r6.f113139E
            if (r15 == 0) goto L_0x0118
            java.lang.String r15 = r4.f146944e
            int r15 = r15.length()
            int r15 = r15 + r10
            goto L_0x0120
        L_0x0118:
            java.lang.String r15 = r4.f146944e
            int r15 = r15.length()
            int r15 = r15 + 2
        L_0x0120:
            rx3.l r3 = new rx3.l
            java.lang.Object r16 = r13.getValue()
            r10 = r16
            rx3.l r10 = (rx3.C13604l) r10
            A r10 = r10.f38555d
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            int r10 = r10 + r15
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Object r16 = r13.getValue()
            r9 = r16
            rx3.l r9 = (rx3.C13604l) r9
            B r9 = r9.f38556e
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            int r9 = r9 + r15
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r3.<init>(r10, r9)
            r13.setValue(r3)
            r3 = 0
            r10 = 1
            goto L_0x00f0
        L_0x0155:
            com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI$a r3 = r6.f113138D
            boolean r9 = r3.f113161a
            if (r9 == 0) goto L_0x0175
            java.lang.String r3 = r3.f113162b
            int r3 = r3.length()
            int r3 = r7 - r3
            com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI$a r9 = r6.f113138D
            java.lang.String r9 = r9.f113162b
            int r9 = r9.length()
            int r9 = r7 - r9
            com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI$a r10 = r6.f113138D
            r10.getClass()
            r10.f113162b = r8
            goto L_0x0177
        L_0x0175:
            r3 = r7
            r9 = r3
        L_0x0177:
            com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI$a r8 = r6.f113138D
            r10 = 0
            r8.f113161a = r10
            com.tencent.mm.ui.widget.MMEditText r8 = r6.f113142e
            if (r8 == 0) goto L_0x02ce
            android.text.Editable r8 = r8.getText()
            java.lang.String r12 = "gameCommentInputTxt.text"
            gy3.C87412m.m108593f(r8, r12)
            java.lang.CharSequence r8 = r8.subSequence(r10, r3)
            java.lang.String r8 = r8.toString()
            boolean r10 = r6.f113139E
            r13 = 8197(0x2005, float:1.1486E-41)
            if (r10 != 0) goto L_0x01d5
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r8)
            r8 = 64
            r10.append(r8)
            java.lang.String r8 = r4.f146944e
            r10.append(r8)
            r10.append(r13)
            java.lang.String r8 = r10.toString()
            java.lang.String r10 = r4.f146944e
            int r10 = r10.length()
            int r10 = r10 + 2
            int r9 = r9 + r10
            com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI$a r10 = r6.f113138D
            java.util.HashMap<java.lang.String, rx3.l<java.lang.Integer, java.lang.Integer>> r10 = r10.f113165e
            java.lang.String r13 = r4.f146943d
            gy3.C87412m.m108593f(r13, r11)
            rx3.l r15 = new rx3.l
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r22 = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
            r15.<init>(r3, r8)
            r10.put(r13, r15)
            goto L_0x020e
        L_0x01d5:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r8)
            java.lang.String r8 = r4.f146944e
            r10.append(r8)
            r10.append(r13)
            java.lang.String r8 = r10.toString()
            java.lang.String r10 = r4.f146944e
            int r10 = r10.length()
            r13 = 1
            int r10 = r10 + r13
            int r9 = r9 + r10
            com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI$a r10 = r6.f113138D
            java.util.HashMap<java.lang.String, rx3.l<java.lang.Integer, java.lang.Integer>> r10 = r10.f113165e
            java.lang.String r15 = r4.f146943d
            gy3.C87412m.m108593f(r15, r11)
            r22 = r8
            rx3.l r8 = new rx3.l
            int r3 = r3 - r13
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r9)
            r8.<init>(r3, r13)
            r10.put(r15, r8)
        L_0x020e:
            r8 = r22
            com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI$a r3 = r6.f113138D
            java.util.List<java.lang.String> r3 = r3.f113163c
            java.lang.String r4 = r4.f146943d
            gy3.C87412m.m108593f(r4, r11)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.add(r4)
            r3 = 0
            r6.f113139E = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            com.tencent.mm.ui.widget.MMEditText r4 = r6.f113142e
            if (r4 == 0) goto L_0x02c9
            android.text.Editable r4 = r4.getText()
            gy3.C87412m.m108593f(r4, r12)
            com.tencent.mm.ui.widget.MMEditText r8 = r6.f113142e
            if (r8 == 0) goto L_0x02c4
            android.text.Editable r8 = r8.getText()
            int r8 = r8.length()
            java.lang.CharSequence r4 = r4.subSequence(r7, r8)
            java.lang.String r4 = r4.toString()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.text.SpannableString r4 = new android.text.SpannableString
            r4.<init>(r3)
            com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI$a r3 = r6.f113138D     // Catch:{ IndexOutOfBoundsException -> 0x02a2 }
            java.util.HashMap<java.lang.String, rx3.l<java.lang.Integer, java.lang.Integer>> r3 = r3.f113165e     // Catch:{ IndexOutOfBoundsException -> 0x02a2 }
            java.util.Set r3 = r3.entrySet()     // Catch:{ IndexOutOfBoundsException -> 0x02a2 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ IndexOutOfBoundsException -> 0x02a2 }
        L_0x0260:
            boolean r7 = r3.hasNext()     // Catch:{ IndexOutOfBoundsException -> 0x02a2 }
            if (r7 == 0) goto L_0x02a3
            java.lang.Object r7 = r3.next()     // Catch:{ IndexOutOfBoundsException -> 0x02a2 }
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch:{ IndexOutOfBoundsException -> 0x02a2 }
            android.text.style.ForegroundColorSpan r8 = new android.text.style.ForegroundColorSpan     // Catch:{ IndexOutOfBoundsException -> 0x02a2 }
            androidx.appcompat.app.AppCompatActivity r10 = r6.getContext()     // Catch:{ IndexOutOfBoundsException -> 0x02a2 }
            android.content.res.Resources r10 = r10.getResources()     // Catch:{ IndexOutOfBoundsException -> 0x02a2 }
            r11 = 2131100838(0x7f0604a6, float:1.7814069E38)
            int r10 = r10.getColor(r11)     // Catch:{ IndexOutOfBoundsException -> 0x02a2 }
            r8.<init>(r10)     // Catch:{ IndexOutOfBoundsException -> 0x02a2 }
            java.lang.Object r10 = r7.getValue()     // Catch:{ IndexOutOfBoundsException -> 0x02a2 }
            rx3.l r10 = (rx3.C13604l) r10     // Catch:{ IndexOutOfBoundsException -> 0x02a2 }
            A r10 = r10.f38555d     // Catch:{ IndexOutOfBoundsException -> 0x02a2 }
            java.lang.Number r10 = (java.lang.Number) r10     // Catch:{ IndexOutOfBoundsException -> 0x02a2 }
            int r10 = r10.intValue()     // Catch:{ IndexOutOfBoundsException -> 0x02a2 }
            java.lang.Object r7 = r7.getValue()     // Catch:{ IndexOutOfBoundsException -> 0x02a2 }
            rx3.l r7 = (rx3.C13604l) r7     // Catch:{ IndexOutOfBoundsException -> 0x02a2 }
            B r7 = r7.f38556e     // Catch:{ IndexOutOfBoundsException -> 0x02a2 }
            java.lang.Number r7 = (java.lang.Number) r7     // Catch:{ IndexOutOfBoundsException -> 0x02a2 }
            int r7 = r7.intValue()     // Catch:{ IndexOutOfBoundsException -> 0x02a2 }
            r11 = 33
            r4.setSpan(r8, r10, r7, r11)     // Catch:{ IndexOutOfBoundsException -> 0x02a2 }
            goto L_0x0260
        L_0x02a2:
        L_0x02a3:
            androidx.appcompat.app.AppCompatActivity r3 = r6.getContext()
            java.lang.CharSequence r3 = vl3.C102226d.m134696a(r3, r4)
            com.tencent.mm.ui.widget.MMEditText r4 = r6.f113142e
            if (r4 == 0) goto L_0x02bf
            r4.setText(r3)
            com.tencent.mm.ui.widget.MMEditText r3 = r6.f113142e
            if (r3 == 0) goto L_0x02ba
            r3.setSelection(r9)
            goto L_0x0300
        L_0x02ba:
            gy3.C87412m.m108603p(r14)
            r3 = 0
            throw r3
        L_0x02bf:
            r3 = 0
            gy3.C87412m.m108603p(r14)
            throw r3
        L_0x02c4:
            r3 = 0
            gy3.C87412m.m108603p(r14)
            throw r3
        L_0x02c9:
            r3 = 0
            gy3.C87412m.m108603p(r14)
            throw r3
        L_0x02ce:
            r3 = 0
            gy3.C87412m.m108603p(r14)
            throw r3
        L_0x02d3:
            gy3.C87412m.m108603p(r14)
            throw r3
        L_0x02d7:
            gy3.C87412m.m108603p(r14)
            throw r3
        L_0x02db:
            gy3.C87412m.m108603p(r14)
            throw r3
        L_0x02df:
            com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI$a r7 = r6.f113138D
            java.util.HashMap<java.lang.String, rx3.l<java.lang.Integer, java.lang.Integer>> r7 = r7.f113165e
            java.lang.String r8 = r4.f146943d
            java.lang.Object r7 = r7.get(r8)
            rx3.l r7 = (rx3.C13604l) r7
            if (r7 == 0) goto L_0x02f1
            B r3 = r7.f38556e
            java.lang.Integer r3 = (java.lang.Integer) r3
        L_0x02f1:
            if (r3 == 0) goto L_0x0300
            int r3 = r3.intValue()
            java.lang.String r4 = r4.f146943d
            gy3.C87412m.m108593f(r4, r11)
            r7 = 1
            r6.mo65904J7(r3, r7, r4)
        L_0x0300:
            r9 = 1
        L_0x0301:
            if (r9 == 0) goto L_0x034f
            if (r1 == 0) goto L_0x0307
            r3 = 1
            goto L_0x0308
        L_0x0307:
            r3 = 0
        L_0x0308:
            if (r3 == 0) goto L_0x034f
            int r3 = r1.getVisibility()
            r4 = 8
            if (r3 != r4) goto L_0x0331
            r3 = 0
            r1.setVisibility(r3)
            com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI r1 = r0.f124971a
            androidx.appcompat.app.AppCompatActivity r6 = r1.getContext()
            r7 = 101(0x65, float:1.42E-43)
            r8 = 1
            r1 = 1
            int r9 = r2 + 1
            r10 = 2
            com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI r1 = r0.f124971a
            r1.getClass()
            r11 = 0
            java.lang.String r12 = com.tencent.p014mm.game.report.C40314g.m43483b(r5)
            com.tencent.p014mm.game.report.C40314g.m43484c(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x034f
        L_0x0331:
            r1.setVisibility(r4)
            com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI r1 = r0.f124971a
            androidx.appcompat.app.AppCompatActivity r6 = r1.getContext()
            r7 = 101(0x65, float:1.42E-43)
            r8 = 1
            r1 = 1
            int r9 = r2 + 1
            r10 = 21
            com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI r1 = r0.f124971a
            r1.getClass()
            r11 = 0
            java.lang.String r12 = com.tencent.p014mm.game.report.C40314g.m43483b(r5)
            com.tencent.p014mm.game.report.C40314g.m43484c(r6, r7, r8, r9, r10, r11, r12)
        L_0x034f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: iy1.C46376c.mo23073a(androidx.recyclerview.widget.RecyclerView, android.view.View, int, long):void");
    }
}
