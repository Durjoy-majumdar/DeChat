package xk1;

import com.tencent.p014mm.view.RefreshLoadMoreLayout;

/* renamed from: xk1.y0 */
public final class C66365y0 extends RefreshLoadMoreLayout.C57879a {

    /* renamed from: a */
    public final /* synthetic */ C66352v0 f191065a;

    public C66365y0(C66352v0 v0Var) {
        this.f191065a = v0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0069, code lost:
        r0 = r0.getLoadMoreFooter();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2561b(int r14) {
        /*
            r13 = this;
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "loadMoreSearchData query:"
            r14.append(r0)
            xk1.v0 r0 = r13.f191065a
            java.lang.String r0 = r0.f191002q
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            java.lang.String r0 = "Finder.FinderGameLiveSearchUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r14)
            xk1.v0 r14 = r13.f191065a
            java.lang.String r1 = r14.f191002q
            boolean r0 = r14.f191004s
            r7 = 2131308008(0x7f092de8, float:1.823426E38)
            r8 = 8
            r9 = 0
            r10 = 0
            r11 = 2131308010(0x7f092dea, float:1.8234263E38)
            if (r0 == 0) goto L_0x00d1
            je1.c3 r12 = new je1.c3
            java.lang.String r2 = r14.f191003r
            r3 = 0
            r4 = 0
            r5 = 12
            r6 = 0
            r0 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r14.f191001p = r12
            ob0.b0 r0 = f40.C86709a0.m107524d()
            je1.c3 r1 = r14.f191001p
            r0.mo123460f(r1)
            ob0.b0 r0 = f40.C86709a0.m107524d()
            r1 = 4140(0x102c, float:5.801E-42)
            r0.mo123455a(r1, r14)
            com.tencent.mm.view.RefreshLoadMoreLayout r0 = r14.f190994f
            if (r0 == 0) goto L_0x0065
            android.view.View r0 = r0.getLoadMoreFooter()
            if (r0 == 0) goto L_0x0065
            android.view.View r0 = r0.findViewById(r11)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x0065
            r1 = 2131829090(0x7f112162, float:1.929114E38)
            r0.setText(r1)
        L_0x0065:
            com.tencent.mm.view.RefreshLoadMoreLayout r0 = r14.f190994f
            if (r0 == 0) goto L_0x0076
            android.view.View r0 = r0.getLoadMoreFooter()
            if (r0 == 0) goto L_0x0076
            android.view.View r0 = r0.findViewById(r11)
            android.widget.TextView r0 = (android.widget.TextView) r0
            goto L_0x0077
        L_0x0076:
            r0 = r10
        L_0x0077:
            if (r0 != 0) goto L_0x007a
            goto L_0x007d
        L_0x007a:
            r0.setVisibility(r9)
        L_0x007d:
            com.tencent.mm.view.RefreshLoadMoreLayout r14 = r14.f190994f
            if (r14 == 0) goto L_0x008b
            android.view.View r14 = r14.getLoadMoreFooter()
            if (r14 == 0) goto L_0x008b
            android.view.View r10 = r14.findViewById(r7)
        L_0x008b:
            if (r10 != 0) goto L_0x008f
            goto L_0x0152
        L_0x008f:
            k20.a r14 = new k20.a
            r14.<init>()
            java.lang.ThreadLocal<k20.a> r0 = k20.C60958c.f173611a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r14.mo10233c(r0)
            java.lang.Object[] r1 = r14.mo10232b()
            java.lang.String r2 = "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveSearchUIC$initView$4"
            java.lang.String r3 = "onLoadMoreBegin"
            java.lang.String r4 = "(I)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            r0 = r10
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r14 = r14.mo10231a(r9)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            r10.setVisibility(r14)
            java.lang.String r1 = "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveSearchUIC$initView$4"
            java.lang.String r2 = "onLoadMoreBegin"
            java.lang.String r3 = "(I)V"
            java.lang.String r4 = "android/view/View_EXEC_"
            java.lang.String r5 = "setVisibility"
            java.lang.String r6 = "(I)V"
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0152
        L_0x00d1:
            com.tencent.mm.view.RefreshLoadMoreLayout r0 = r14.f190994f
            if (r0 == 0) goto L_0x00e9
            android.view.View r0 = r0.getLoadMoreFooter()
            if (r0 == 0) goto L_0x00e9
            android.view.View r0 = r0.findViewById(r11)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x00e9
            r1 = 2131829092(0x7f112164, float:1.9291143E38)
            r0.setText(r1)
        L_0x00e9:
            com.tencent.mm.view.RefreshLoadMoreLayout r0 = r14.f190994f
            if (r0 == 0) goto L_0x00fa
            android.view.View r0 = r0.getLoadMoreFooter()
            if (r0 == 0) goto L_0x00fa
            android.view.View r0 = r0.findViewById(r11)
            android.widget.TextView r0 = (android.widget.TextView) r0
            goto L_0x00fb
        L_0x00fa:
            r0 = r10
        L_0x00fb:
            if (r0 != 0) goto L_0x00fe
            goto L_0x0101
        L_0x00fe:
            r0.setVisibility(r8)
        L_0x0101:
            com.tencent.mm.view.RefreshLoadMoreLayout r14 = r14.f190994f
            if (r14 == 0) goto L_0x010f
            android.view.View r14 = r14.getLoadMoreFooter()
            if (r14 == 0) goto L_0x010f
            android.view.View r10 = r14.findViewById(r7)
        L_0x010f:
            if (r10 != 0) goto L_0x0112
            goto L_0x0152
        L_0x0112:
            k20.a r14 = new k20.a
            r14.<init>()
            java.lang.ThreadLocal<k20.a> r0 = k20.C60958c.f173611a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r14.mo10233c(r0)
            java.lang.Object[] r1 = r14.mo10232b()
            java.lang.String r2 = "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveSearchUIC$initView$4"
            java.lang.String r3 = "onLoadMoreBegin"
            java.lang.String r4 = "(I)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            r0 = r10
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r14 = r14.mo10231a(r9)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            r10.setVisibility(r14)
            java.lang.String r1 = "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveSearchUIC$initView$4"
            java.lang.String r2 = "onLoadMoreBegin"
            java.lang.String r3 = "(I)V"
            java.lang.String r4 = "android/view/View_EXEC_"
            java.lang.String r5 = "setVisibility"
            java.lang.String r6 = "(I)V"
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
        L_0x0152:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xk1.C66365y0.mo2561b(int):void");
    }
}
