package w82;

import com.tencent.p014mm.plugin.multitalk.p078ui.widget.avatar_view.MultiTalkAvatarLayout;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: w82.j */
public final class C111769j extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C111759e f334702d;

    /* renamed from: e */
    public final /* synthetic */ MultiTalkAvatarLayout f334703e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111769j(C111759e eVar, MultiTalkAvatarLayout multiTalkAvatarLayout) {
        super(0);
        this.f334702d = eVar;
        this.f334703e = multiTalkAvatarLayout;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0136, code lost:
        r4 = r4.get(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r13 = this;
            w82.e r0 = r13.f334702d
            com.tencent.mm.plugin.multitalk.ui.d r0 = r0.f334679e
            boolean r0 = r0.mo150900a()
            if (r0 == 0) goto L_0x015c
            com.tencent.mm.plugin.multitalk.ui.widget.avatar_view.MultiTalkAvatarLayout r0 = r13.f334703e
            w82.k r0 = r0.getLayoutAdapter()
            if (r0 == 0) goto L_0x0177
            w82.e r1 = r13.f334702d
            com.tencent.mm.plugin.multitalk.ui.d r1 = r1.f334679e
            java.lang.String r1 = r1.f314927b
            java.lang.String r2 = "username"
            gy3.C87412m.m108594g(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "openScreenCastBig: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "MicroMsg.MT.MultiTalkAvatarLayoutAdapter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            sx3.h0 r2 = sx3.C64187h0.f181908d
            r0.mo163504a(r2, r1)
            v82.j0 r0 = r0.f334704a
            r0.getClass()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "MicroMsg.MT.MultiTalkNewTalkingUILogic"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            android.view.View r2 = r0.mo163159j()
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            r12 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
            r3.mo10233c(r4)
            java.lang.Object[] r5 = r3.mo10232b()
            java.lang.String r6 = "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic"
            java.lang.String r7 = "openScreenCastBigVideo"
            java.lang.String r8 = "(Ljava/lang/String;)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r4 = r2
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r3 = r3.mo10231a(r12)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r5 = "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic"
            java.lang.String r6 = "openScreenCastBigVideo"
            java.lang.String r7 = "(Ljava/lang/String;)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
            com.tencent.mm.plugin.multitalk.ui.widget.ScreenCastBigView r2 = r0.mo163158i()
            r2.mo150943c(r1)
            com.tencent.mm.plugin.multitalk.ui.widget.ScreenCastBigView r2 = r0.mo163158i()
            r2.setVisibility(r12)
            com.tencent.mm.plugin.multitalk.ui.widget.ScreenCastBigView r2 = r0.mo163158i()
            v82.r0 r3 = new v82.r0
            r3.<init>(r0)
            r2.setOnClickListener(r3)
            com.tencent.mm.plugin.multitalk.ui.widget.avatar_view.MultiTalkAvatarLayout r2 = r0.mo163152c()
            r3 = 8
            r2.setVisibility(r3)
            r2 = 1
            r0.mo163167r(r2)
            v82.m r3 = r0.mo163154e()
            r3.mo163183h(r12, r2)
            com.tencent.mm.ui.widget.imageview.WeImageButton r2 = r0.mo163155f()
            v82.s0 r3 = new v82.s0
            r3.<init>(r0)
            r2.setOnClickListener(r3)
            z82.a r2 = r0.f333710t
            if (r2 == 0) goto L_0x00d9
            x82.q r2 = r2.f337244f
            if (r2 == 0) goto L_0x00d9
            r2.mo163847g()
        L_0x00d9:
            z82.a r2 = r0.f333710t
            java.lang.String r3 = "screenCasePluginLayout"
            if (r2 == 0) goto L_0x00ef
            rx3.g r4 = r0.f333705o
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            android.widget.RelativeLayout r4 = (android.widget.RelativeLayout) r4
            gy3.C87412m.m108593f(r4, r3)
            r2.mo164385f(r4)
        L_0x00ef:
            z82.a r2 = new z82.a
            com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI r4 = r0.f333691a
            r2.<init>(r4)
            rx3.g r4 = r0.f333705o
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            android.widget.RelativeLayout r4 = (android.widget.RelativeLayout) r4
            gy3.C87412m.m108593f(r4, r3)
            r4.removeAllViews()
            x82.q r3 = r2.f337244f
            if (r3 == 0) goto L_0x010d
            r3.mo163845e(r4)
        L_0x010d:
            r0.f333710t = r2
            com.tencent.mm.plugin.multitalk.ui.g r2 = r0.mo163161l()
            androidx.lifecycle.LiveData<java.util.List<com.tencent.mm.plugin.multitalk.ui.d>> r2 = r2.f314941n
            com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI r3 = r0.f333691a
            rx3.g r4 = r0.f333713w
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            androidx.lifecycle.a0 r4 = (androidx.lifecycle.C0120a0) r4
            r2.observe(r3, r4)
            c92.h r2 = c92.C104331h.f308841a
            com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI r3 = r0.f333691a
            java.lang.Class<f62.k0> r4 = f62.C75700k0.class
            k40.a r4 = f40.C86709a0.m107533q(r4)
            f62.k0 r4 = (f62.C75700k0) r4
            com.tencent.mm.storage.u3 r4 = r4.mo96097Ni()
            if (r4 == 0) goto L_0x0141
            com.tencent.mm.storage.z1 r4 = r4.get(r1)
            if (r4 == 0) goto L_0x0141
            java.lang.String r4 = r4.mo62909j3()
            goto L_0x0142
        L_0x0141:
            r4 = 0
        L_0x0142:
            if (r4 != 0) goto L_0x0145
            goto L_0x0146
        L_0x0145:
            r1 = r4
        L_0x0146:
            java.lang.String r1 = r2.mo146035f(r3, r1)
            r0.f333708r = r1
            rx3.g r1 = r0.f333706p
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r0 = r0.f333708r
            r1.setText(r0)
            goto L_0x0177
        L_0x015c:
            com.tencent.mm.plugin.multitalk.ui.widget.avatar_view.MultiTalkAvatarLayout r0 = r13.f334703e
            w82.e r1 = r13.f334702d
            int r2 = com.tencent.p014mm.plugin.multitalk.p078ui.widget.avatar_view.MultiTalkAvatarLayout.f315083q
            r0.mo150986b(r1)
            com.tencent.mm.plugin.multitalk.ui.widget.avatar_view.MultiTalkAvatarLayout r0 = r13.f334703e
            int r0 = r0.f315088h
            r1 = -1
            if (r0 != r1) goto L_0x0172
            r0 = 10
            com.tencent.p014mm.plugin.multitalk.model.C105853x.m142230a(r0)
            goto L_0x0177
        L_0x0172:
            r0 = 9
            com.tencent.p014mm.plugin.multitalk.model.C105853x.m142230a(r0)
        L_0x0177:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w82.C111769j.invoke():java.lang.Object");
    }
}
