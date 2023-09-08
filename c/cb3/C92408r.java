package cb3;

import android.view.View;

/* renamed from: cb3.r */
public class C92408r implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C92400k f264459d;

    public C92408r(C92400k kVar) {
        this.f264459d = kVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b3, code lost:
        if (r0 != null) goto L_0x00ba;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r14) {
        /*
            r13 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r14)
            java.lang.Object[] r6 = r0.toArray()
            r0.clear()
            java.lang.String r1 = "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$8"
            java.lang.String r2 = "android/view/View$OnClickListener"
            java.lang.String r3 = "onClick"
            java.lang.String r4 = "(Landroid/view/View;)V"
            r5 = r13
            j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
            r14 = 1
            java.lang.Object[] r0 = new java.lang.Object[r14]
            cb3.k r1 = r13.f264459d
            cb3.d r1 = r1.f264446w
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "NoteSelectManager"
            java.lang.String r3 = "select info:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r0)
            cb3.k r0 = r13.f264459d
            r0.mo126389p()
            boolean r0 = cb3.C92400k.f264411N
            java.lang.String r3 = "(Landroid/view/View;)V"
            java.lang.String r4 = "onClick"
            java.lang.String r5 = "android/view/View$OnClickListener"
            java.lang.String r6 = "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$8"
            if (r0 != 0) goto L_0x004a
            java.lang.String r14 = "select: not init"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r14)
            j20.C117292a.m165361g(r13, r6, r5, r4, r3)
            return
        L_0x004a:
            cb3.k r0 = r13.f264459d
            int r0 = r0.mo126386m()
            if (r0 == r14) goto L_0x0061
            java.lang.String r14 = "select: not insert"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r14)
            cb3.k r14 = r13.f264459d
            r14.mo126392s()
            j20.C117292a.m165361g(r13, r6, r5, r4, r3)
            return
        L_0x0061:
            cb3.k r0 = r13.f264459d
            ab3.a r7 = r0.f264445v
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r7 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r7
            bb3.d r7 = r7.f283238X0
            cb3.d r0 = r0.f264446w
            int r0 = r0.f264399a
            xa3.c r0 = r7.mo126201k(r0)
            if (r0 != 0) goto L_0x0082
            java.lang.String r14 = "select: item is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r14)
            cb3.k r14 = r13.f264459d
            r14.mo126392s()
            j20.C117292a.m165361g(r13, r6, r5, r4, r3)
            return
        L_0x0082:
            cb3.k r0 = r13.f264459d
            androidx.recyclerview.widget.RecyclerView r0 = r0.mo126382i()
            if (r0 != 0) goto L_0x0099
            java.lang.String r14 = "select: recyclerView is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r14)
            cb3.k r14 = r13.f264459d
            r14.mo126392s()
            j20.C117292a.m165361g(r13, r6, r5, r4, r3)
            return
        L_0x0099:
            cb3.k r7 = r13.f264459d
            cb3.d r7 = r7.f264446w
            int r7 = r7.f264399a
            android.view.View r7 = cb3.C92410t.m116228b(r0, r7)
            if (r7 == 0) goto L_0x00b6
            androidx.recyclerview.widget.RecyclerView$z r0 = r0.mo17021F0(r7)
            boolean r8 = r0 instanceof ib3.C98640j
            if (r8 == 0) goto L_0x00b6
            ib3.j r0 = (ib3.C98640j) r0
            cb3.c r0 = r0.mo138068H()
            if (r0 == 0) goto L_0x00b6
            goto L_0x00ba
        L_0x00b6:
            cb3.c r0 = cb3.C92410t.m116227a(r7)
        L_0x00ba:
            if (r0 != 0) goto L_0x00cb
            java.lang.String r14 = "select: rteInfo is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r14)
            cb3.k r14 = r13.f264459d
            r14.mo126392s()
            j20.C117292a.m165361g(r13, r6, r5, r4, r3)
            return
        L_0x00cb:
            com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText r7 = r0.f264393a
            r8 = 50
            if (r7 == 0) goto L_0x01ac
            android.text.Editable r7 = r7.getText()
            if (r7 != 0) goto L_0x00e6
            java.lang.String r14 = "select: text is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r14)
            cb3.k r14 = r13.f264459d
            r14.mo126392s()
            j20.C117292a.m165361g(r13, r6, r5, r4, r3)
            return
        L_0x00e6:
            int r7 = r7.length()
            if (r7 <= 0) goto L_0x00f9
            com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText r0 = r0.f264393a
            cb3.k r1 = r13.f264459d
            cb3.d r1 = r1.f264446w
            int r1 = r1.f264400b
            r0.mo134894y(r1, r14)
            goto L_0x01dd
        L_0x00f9:
            cb3.k r0 = r13.f264459d
            ab3.a r7 = r0.f264445v
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r7 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r7
            bb3.d r7 = r7.f283238X0
            cb3.d r0 = r0.f264446w
            int r0 = r0.f264399a
            int r0 = r0 - r14
            xa3.c r0 = r7.mo126201k(r0)
            r7 = 0
            if (r0 == 0) goto L_0x0115
            int r10 = r0.mo142212c()
            r11 = -3
            if (r10 != r11) goto L_0x0115
            r0 = r7
        L_0x0115:
            cb3.k r10 = r13.f264459d
            ab3.a r11 = r10.f264445v
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r11 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r11
            bb3.d r11 = r11.f283238X0
            cb3.d r10 = r10.f264446w
            int r10 = r10.f264399a
            int r10 = r10 + r14
            xa3.c r10 = r11.mo126201k(r10)
            if (r10 == 0) goto L_0x0130
            int r11 = r10.mo142212c()
            r12 = -2
            if (r11 != r12) goto L_0x0130
            goto L_0x0131
        L_0x0130:
            r7 = r10
        L_0x0131:
            if (r0 == 0) goto L_0x0173
            int r7 = r0.mo142212c()
            if (r7 != r14) goto L_0x0167
            xa3.i r0 = (xa3.C102593i) r0
            java.lang.String r0 = r0.f302126s
            android.text.Spanned r0 = za3.C102988a.m136184a(r0)
            if (r0 != 0) goto L_0x0152
            java.lang.String r14 = "select: spanned is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r14)
            cb3.k r14 = r13.f264459d
            r14.mo126392s()
            j20.C117292a.m165361g(r13, r6, r5, r4, r3)
            return
        L_0x0152:
            cb3.k r1 = r13.f264459d
            cb3.d r7 = r1.f264446w
            int r7 = r7.f264399a
            int r7 = r7 - r14
            int r0 = r0.length()
            cb3.k r10 = r13.f264459d
            cb3.d r10 = r10.f264446w
            int r10 = r10.f264399a
            r1.mo126398y(r7, r0, r10, r2)
            goto L_0x0192
        L_0x0167:
            cb3.k r0 = r13.f264459d
            cb3.d r1 = r0.f264446w
            int r1 = r1.f264399a
            int r7 = r1 + -1
            r0.mo126398y(r7, r2, r1, r2)
            goto L_0x0192
        L_0x0173:
            if (r7 == 0) goto L_0x019d
            int r0 = r7.mo142212c()
            if (r0 != r14) goto L_0x0187
            cb3.k r0 = r13.f264459d
            cb3.d r1 = r0.f264446w
            int r1 = r1.f264399a
            int r7 = r1 + 1
            r0.mo126398y(r1, r2, r7, r2)
            goto L_0x0192
        L_0x0187:
            cb3.k r0 = r13.f264459d
            cb3.d r1 = r0.f264446w
            int r1 = r1.f264399a
            int r7 = r1 + 1
            r0.mo126398y(r1, r2, r7, r14)
        L_0x0192:
            cb3.k r0 = r13.f264459d
            r0.mo126376b()
            cb3.k r0 = r13.f264459d
            r0.mo126368D(r14, r14, r8)
            goto L_0x01dd
        L_0x019d:
            java.lang.String r14 = "select: no neighbor"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r14)
            cb3.k r14 = r13.f264459d
            r14.mo126392s()
            j20.C117292a.m165361g(r13, r6, r5, r4, r3)
            return
        L_0x01ac:
            com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText r7 = r0.f264396d
            if (r7 == 0) goto L_0x01b6
            cb3.k r14 = r13.f264459d
            r14.mo126396w()
            goto L_0x01dd
        L_0x01b6:
            com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText r7 = r0.f264394b
            if (r7 == 0) goto L_0x01d2
            com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText r0 = r0.f264395c
            if (r0 == 0) goto L_0x01d2
            cb3.k r0 = r13.f264459d
            r0.mo126376b()
            cb3.k r0 = r13.f264459d
            cb3.d r1 = r0.f264446w
            int r1 = r1.f264399a
            r0.mo126398y(r1, r2, r1, r14)
            cb3.k r0 = r13.f264459d
            r0.mo126368D(r14, r14, r8)
            goto L_0x01dd
        L_0x01d2:
            java.lang.String r14 = "select: rteInfo invalid"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r14)
            cb3.k r14 = r13.f264459d
            r14.mo126392s()
        L_0x01dd:
            j20.C117292a.m165361g(r13, r6, r5, r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cb3.C92408r.onClick(android.view.View):void");
    }
}
