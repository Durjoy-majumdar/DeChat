package com.tencent.p014mm.plugin.voip.p475ui;

import android.view.View;
import qo3.C101218e0;
import wj2.C66132f;

/* renamed from: com.tencent.mm.plugin.voip.ui.f0 */
public final class C57472f0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C106444e0 f164668d;

    /* renamed from: e */
    public final /* synthetic */ C66132f f164669e;

    /* renamed from: com.tencent.mm.plugin.voip.ui.f0$a */
    public static final class C57473a implements C101218e0.C12907m {

        /* renamed from: a */
        public final /* synthetic */ C101218e0 f164670a;

        public C57473a(C101218e0 e0Var) {
            this.f164670a = e0Var;
        }

        /* renamed from: a */
        public final void mo2001a() {
            this.f164670a.mo140680z();
        }
    }

    public C57472f0(C106444e0 e0Var, C66132f fVar) {
        this.f164668d = e0Var;
        this.f164669e = fVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0114, code lost:
        r9 = r9.f189021e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r25) {
        /*
            r24 = this;
            r6 = r24
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7 = r25
            r0.add(r7)
            java.lang.Object[] r5 = r0.toArray()
            r0.clear()
            java.lang.String r0 = "com/tencent/mm/plugin/voip/ui/VoIPTopControlUI$responseRingtoneIconAction$1"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            r4 = r24
            j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
            com.tencent.mm.plugin.voip.ui.e0 r0 = r6.f164668d
            android.view.View r0 = r0.f317976b
            if (r0 == 0) goto L_0x024a
            wj2.f r1 = r6.f164669e
            qo3.e0 r2 = new qo3.e0
            android.content.Context r3 = r0.getContext()
            r4 = 2
            r5 = 0
            r8 = 1
            r2.<init>(r3, r4, r5, r8)
            r2.mo140676v(r8)
            android.content.Context r0 = r0.getContext()
            r3 = 2131834876(0x7f1137fc, float:1.9302875E38)
            java.lang.CharSequence r0 = r0.getText(r3)
            r2.mo140677w(r0)
            java.lang.String r0 = "#07C160"
            int r0 = android.graphics.Color.parseColor(r0)
            r2.mo140678x(r0)
            android.view.View r0 = r2.f296384g
            android.content.Context r0 = r0.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r3 = 2131497252(0x7f0c1124, float:1.8618092E38)
            r4 = 0
            android.view.View r0 = r0.inflate(r3, r4)
            java.lang.String r3 = "from(dialog.rootView.con…gtone_calling_info, null)"
            gy3.C87412m.m108593f(r0, r3)
            r3 = 2131312534(0x7f093f96, float:1.824344E38)
            android.view.View r3 = r0.findViewById(r3)
            r11 = r3
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            if (r11 == 0) goto L_0x0081
            android.view.View r3 = r2.f296384g
            android.content.Context r3 = r3.getContext()
            r9 = 2131232083(0x7f080553, float:1.8080265E38)
            android.graphics.drawable.Drawable r3 = r3.getDrawable(r9)
            r11.setImageDrawable(r3)
        L_0x0081:
            if (r11 == 0) goto L_0x0099
            java.lang.Class<ht1.t1> r3 = ht1.C60200t1.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            java.lang.String r9 = "getService(IFinderCommon…atureService::class.java)"
            gy3.C87412m.m108593f(r3, r9)
            r9 = r3
            ht1.t1 r9 = (ht1.C60200t1) r9
            java.lang.String r10 = r1.f190088k
            r12 = 0
            r13 = 4
            r14 = 0
            ht1.C60200t1.C60201a.m70370h(r9, r10, r11, r12, r13, r14)
        L_0x0099:
            r3 = 2131311575(0x7f093bd7, float:1.8241494E38)
            android.view.View r3 = r0.findViewById(r3)
            r9 = 2131312579(0x7f093fc3, float:1.824353E38)
            android.view.View r9 = r0.findViewById(r9)
            r15 = r9
            android.widget.TextView r15 = (android.widget.TextView) r15
            r9 = 2131312543(0x7f093f9f, float:1.8243458E38)
            android.view.View r9 = r0.findViewById(r9)
            r14 = r9
            android.widget.TextView r14 = (android.widget.TextView) r14
            com.tencent.mm.protocal.protobuf.FinderObject r9 = r1.f190081d
            r17 = 8
            if (r9 != 0) goto L_0x01eb
            k20.a r13 = new k20.a
            r13.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r13.mo10233c(r9)
            java.lang.Object[] r10 = r13.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/voip/ui/VoIPTopControlUI$responseRingtoneIconAction$1"
            java.lang.String r12 = "onClick"
            java.lang.String r16 = "(Landroid/view/View;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r9 = r3
            r4 = r13
            r13 = r16
            r22 = r14
            r14 = r18
            r23 = r15
            r15 = r19
            r16 = r20
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r4 = r4.mo10231a(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.setVisibility(r4)
            java.lang.String r10 = "com/tencent/mm/plugin/voip/ui/VoIPTopControlUI$responseRingtoneIconAction$1"
            java.lang.String r11 = "onClick"
            java.lang.String r12 = "(Landroid/view/View;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            r4 = 2131311576(0x7f093bd8, float:1.8241496E38)
            android.view.View r4 = r0.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            ve3.n0 r9 = r1.f190083f
            if (r9 == 0) goto L_0x0121
            ve3.f0 r9 = r9.f189021e
            if (r9 == 0) goto L_0x0121
            int r9 = r9.f188992n
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r21 = r9
            goto L_0x0123
        L_0x0121:
            r21 = 0
        L_0x0123:
            if (r21 != 0) goto L_0x0126
            goto L_0x013f
        L_0x0126:
            int r9 = r21.intValue()
            if (r9 != 0) goto L_0x013f
            android.content.Context r3 = r0.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r5 = 2131834246(0x7f113586, float:1.9301597E38)
            java.lang.CharSequence r3 = r3.getText(r5)
            r4.setText(r3)
            goto L_0x0199
        L_0x013f:
            if (r21 != 0) goto L_0x0142
            goto L_0x015b
        L_0x0142:
            int r9 = r21.intValue()
            if (r9 != r8) goto L_0x015b
            android.content.Context r3 = r0.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r5 = 2131834247(0x7f113587, float:1.9301599E38)
            java.lang.CharSequence r3 = r3.getText(r5)
            r4.setText(r3)
            goto L_0x0199
        L_0x015b:
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r17)
            r4.mo10233c(r8)
            java.lang.Object[] r10 = r4.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/voip/ui/VoIPTopControlUI$responseRingtoneIconAction$1"
            java.lang.String r12 = "onClick"
            java.lang.String r13 = "(Landroid/view/View;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r3
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r4 = r4.mo10231a(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.setVisibility(r4)
            java.lang.String r10 = "com/tencent/mm/plugin/voip/ui/VoIPTopControlUI$responseRingtoneIconAction$1"
            java.lang.String r11 = "onClick"
            java.lang.String r12 = "(Landroid/view/View;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
        L_0x0199:
            r3 = 2131311574(0x7f093bd6, float:1.8241492E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            android.content.Context r4 = r25.getContext()
            java.lang.String r5 = "it.context"
            gy3.C87412m.m108593f(r4, r5)
            r5 = 2131755888(0x7f100370, float:1.9142668E38)
            r7 = 2131099704(0x7f060038, float:1.7811769E38)
            int r7 = kg3.C76577a.m92153d(r4, r7)
            android.graphics.drawable.Drawable r4 = kg3.C76577a.m92158i(r4, r5)
            android.graphics.drawable.Drawable r4 = r4.mutate()
            java.lang.String r5 = "getDrawable(context, drawableRes).mutate()"
            gy3.C87412m.m108593f(r4, r5)
            android.graphics.PorterDuffColorFilter r5 = new android.graphics.PorterDuffColorFilter
            int r8 = android.graphics.Color.alpha(r7)
            int r9 = android.graphics.Color.red(r7)
            int r10 = android.graphics.Color.green(r7)
            int r11 = android.graphics.Color.blue(r7)
            int r8 = android.graphics.Color.argb(r8, r9, r10, r11)
            android.graphics.PorterDuff$Mode r9 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r5.<init>(r8, r9)
            r4.setColorFilter(r5)
            int r5 = android.graphics.Color.alpha(r7)
            r4.setAlpha(r5)
            r3.setImageDrawable(r4)
            goto L_0x022f
        L_0x01eb:
            r22 = r14
            r23 = r15
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r17)
            r4.mo10233c(r7)
            java.lang.Object[] r10 = r4.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/voip/ui/VoIPTopControlUI$responseRingtoneIconAction$1"
            java.lang.String r12 = "onClick"
            java.lang.String r13 = "(Landroid/view/View;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r3
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r4 = r4.mo10231a(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.setVisibility(r4)
            java.lang.String r10 = "com/tencent/mm/plugin/voip/ui/VoIPTopControlUI$responseRingtoneIconAction$1"
            java.lang.String r11 = "onClick"
            java.lang.String r12 = "(Landroid/view/View;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
        L_0x022f:
            java.lang.String r3 = r1.f190085h
            r9 = r23
            r9.setText(r3)
            java.lang.String r1 = r1.f190087j
            r9 = r22
            r9.setText(r1)
            r2.mo140663j(r0)
            com.tencent.mm.plugin.voip.ui.f0$a r0 = new com.tencent.mm.plugin.voip.ui.f0$a
            r0.<init>(r2)
            r2.f296375F = r0
            r2.mo140655A()
        L_0x024a:
            java.lang.String r0 = "com/tencent/mm/plugin/voip/ui/VoIPTopControlUI$responseRingtoneIconAction$1"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            j20.C117292a.m165361g(r6, r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.voip.p475ui.C57472f0.onClick(android.view.View):void");
    }
}
