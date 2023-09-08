package el1;

import android.view.View;

/* renamed from: el1.h */
public final class C7747h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C7741d f26243d;

    public C7747h(C7741d dVar) {
        this.f26243d = dVar;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r12) {
        /*
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r12)
            java.lang.Object[] r6 = r0.toArray()
            r0.clear()
            java.lang.String r1 = "com/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveChargeWhiteListUIC$initLayout$3"
            java.lang.String r2 = "android/view/View$OnClickListener"
            java.lang.String r3 = "onClick"
            java.lang.String r4 = "(Landroid/view/View;)V"
            r5 = r11
            j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
            el1.d r12 = r11.f26243d
            rx3.g r12 = r12.f26218d
            rx3.n r12 = (rx3.C36570n) r12
            java.lang.Object r12 = r12.getValue()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L_0x011a
            el1.d r12 = r11.f26243d
            qo3.e0 r0 = new qo3.e0
            androidx.appcompat.app.AppCompatActivity r1 = r12.getActivity()
            r2 = 2
            r3 = 0
            r0.<init>(r1, r3, r2)
            r12.f26235x = r0
            androidx.appcompat.app.AppCompatActivity r0 = r12.getActivity()
            r1 = 2131495034(0x7f0c087a, float:1.8613593E38)
            r4 = 0
            android.view.View r0 = android.view.View.inflate(r0, r1, r4)
            r1 = 2131308209(0x7f092eb1, float:1.8234667E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r5 = 2131827177(0x7f1119e9, float:1.928726E38)
            java.lang.String r5 = r12.getString(r5)
            r1.setText(r5)
            android.text.TextPaint r1 = r1.getPaint()
            r5 = 1061997773(0x3f4ccccd, float:0.8)
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r1, r5)
            r1 = 2131308206(0x7f092eae, float:1.8234661E38)
            android.view.View r1 = r0.findViewById(r1)
            if (r1 == 0) goto L_0x0076
            el1.m r5 = new el1.m
            r5.<init>(r12)
            r1.setOnClickListener(r5)
        L_0x0076:
            qo3.e0 r1 = r12.f26235x
            if (r1 == 0) goto L_0x007d
            r1.mo140672r(r0)
        L_0x007d:
            androidx.recyclerview.widget.RecyclerView r0 = new androidx.recyclerview.widget.RecyclerView
            androidx.appcompat.app.AppCompatActivity r1 = r12.getActivity()
            r0.<init>(r1, r4)
            r1 = 1
            r0.setHasFixedSize(r1)
            androidx.recyclerview.widget.LinearLayoutManager r5 = new androidx.recyclerview.widget.LinearLayoutManager
            androidx.appcompat.app.AppCompatActivity r6 = r12.getActivity()
            r5.<init>(r6, r1, r3)
            r0.setLayoutManager(r5)
            el1.b r5 = new el1.b
            r5.<init>()
            java.util.LinkedList r6 = new java.util.LinkedList
            r6.<init>()
            el1.b$a r7 = new el1.b$a
            r8 = 2131827142(0x7f1119c6, float:1.9287188E38)
            java.lang.String r8 = r12.getString(r8)
            r9 = 2131827143(0x7f1119c7, float:1.928719E38)
            java.lang.String r9 = r12.getString(r9)
            r7.<init>(r8, r9, r1, r3)
            el1.b$a r8 = new el1.b$a
            r9 = 2131827144(0x7f1119c8, float:1.9287192E38)
            java.lang.String r9 = r12.getString(r9)
            r10 = 2131827147(0x7f1119cb, float:1.9287198E38)
            java.lang.String r10 = r12.getString(r10)
            r8.<init>(r9, r10, r2, r3)
            te3.qw0 r9 = r12.f26214A
            te3.nj3 r9 = r9.f140583g
            if (r9 == 0) goto L_0x00d2
            int r10 = r9.f138632d
            if (r10 != r1) goto L_0x00d2
            r10 = 1
            goto L_0x00d3
        L_0x00d2:
            r10 = 0
        L_0x00d3:
            if (r10 == 0) goto L_0x00d7
            r7.f26207d = r1
        L_0x00d7:
            if (r9 == 0) goto L_0x00de
            int r9 = r9.f138632d
            if (r9 != r2) goto L_0x00de
            r3 = 1
        L_0x00de:
            if (r3 == 0) goto L_0x00e2
            r8.f26207d = r1
        L_0x00e2:
            r6.add(r7)
            r6.add(r8)
            r5.f26202d = r6
            el1.n r1 = new el1.n
            r1.<init>(r12)
            r5.f26203e = r1
            r0.setAdapter(r5)
            qo3.e0 r1 = r12.f26235x
            if (r1 == 0) goto L_0x00fb
            r1.mo140663j(r0)
        L_0x00fb:
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r1 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r1 == 0) goto L_0x0106
            r4 = r0
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
        L_0x0106:
            if (r4 != 0) goto L_0x0109
            goto L_0x0113
        L_0x0109:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r0 = com.tencent.p014mm.p136ui.C75044y4.m89991c(r0)
            r4.bottomMargin = r0
        L_0x0113:
            qo3.e0 r12 = r12.f26235x
            if (r12 == 0) goto L_0x011a
            r12.mo140655A()
        L_0x011a:
            java.lang.String r12 = "com/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveChargeWhiteListUIC$initLayout$3"
            java.lang.String r0 = "android/view/View$OnClickListener"
            java.lang.String r1 = "onClick"
            java.lang.String r2 = "(Landroid/view/View;)V"
            j20.C117292a.m165361g(r11, r12, r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: el1.C7747h.onClick(android.view.View):void");
    }
}
