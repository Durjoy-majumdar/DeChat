package pf2;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import nf2.C47240a;
import te3.C50117ke;

/* renamed from: pf2.x */
public final class C47500x extends C47466a {

    /* renamed from: B */
    public final Context f127444B;

    /* renamed from: C */
    public final ImageView f127445C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47500x(View view, C47240a aVar, C50117ke keVar) {
        super(view, aVar, keVar);
        C87412m.m108594g(view, "itemView");
        C87412m.m108594g(aVar, "outAdapter");
        C87412m.m108594g(keVar, "baseInfo");
        this.f127444B = view.getContext();
        this.f127445C = (ImageView) view.findViewById(C0966R.C0970id.irt);
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo72488y(pf2.C47472c r19, int r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            java.lang.String r2 = "dataModel"
            gy3.C87412m.m108594g(r1, r2)
            te3.hg r7 = r1.f127337c
            te3.le r1 = r1.f127336b
            android.content.Context r5 = r0.f127444B
            java.lang.String r2 = "mContext"
            gy3.C87412m.m108593f(r5, r2)
            nf2.a r6 = r0.f127316z
            android.view.View r10 = r0.f44854d
            java.lang.String r3 = "itemView"
            gy3.C87412m.m108593f(r10, r3)
            te3.ke r8 = r0.f127315A
            java.lang.String r3 = "adapter"
            gy3.C87412m.m108594g(r6, r3)
            java.lang.String r3 = "detail"
            gy3.C87412m.m108594g(r1, r3)
            java.lang.String r3 = "base"
            gy3.C87412m.m108594g(r8, r3)
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.l r3 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40726l.f109414a
            java.lang.String r4 = r1.f137340h
            int r9 = r1.f137345p
            r3.mo63636e(r4, r9)
            pf2.f$b r11 = new pf2.f$b
            r3 = r11
            r4 = r1
            r9 = r20
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r10.setOnClickListener(r11)
            android.view.View r3 = r0.f44854d
            r4 = 2131302269(0x7f09177d, float:1.822262E38)
            android.view.View r3 = r3.findViewById(r4)
            android.view.View r4 = r0.f44854d
            r5 = 2131302268(0x7f09177c, float:1.8222617E38)
            android.view.View r4 = r4.findViewById(r5)
            java.lang.String r5 = r1.f137317A
            boolean r5 = sf0.C77702q0.m93719b(r5)
            java.lang.String r14 = "findViewById(R.id.contac…nfo_biz_featured_pic_cnt)"
            r13 = 8
            r12 = 0
            if (r5 == 0) goto L_0x0108
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r12)
            r5.mo10233c(r6)
            java.lang.Object[] r7 = r5.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/profile/ui/tab/msg/holder/LargePicViewHolder"
            java.lang.String r9 = "filling"
            java.lang.String r10 = "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;I)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r6 = r4
            r15 = 0
            r12 = r16
            r20 = 8
            r13 = r17
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r5 = r5.mo10231a(r15)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r4.setVisibility(r5)
            java.lang.String r7 = "com/tencent/mm/plugin/profile/ui/tab/msg/holder/LargePicViewHolder"
            java.lang.String r8 = "filling"
            java.lang.String r9 = "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;I)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
            k20.a r13 = new k20.a
            r13.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r20)
            r13.mo10233c(r5)
            java.lang.Object[] r6 = r13.mo10232b()
            java.lang.String r7 = "com/tencent/mm/plugin/profile/ui/tab/msg/holder/LargePicViewHolder"
            java.lang.String r8 = "filling"
            java.lang.String r9 = "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;I)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r5 = r3
            j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r5 = r13.mo10231a(r15)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.setVisibility(r5)
            java.lang.String r6 = "com/tencent/mm/plugin/profile/ui/tab/msg/holder/LargePicViewHolder"
            java.lang.String r7 = "filling"
            java.lang.String r8 = "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;I)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r5 = r3
            j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
            r3 = 2131300187(0x7f090f5b, float:1.8218397E38)
            android.view.View r3 = r4.findViewById(r3)
            gy3.C87412m.m108593f(r3, r14)
            r5 = 2131302270(0x7f09177e, float:1.8222621E38)
            android.view.View r4 = r4.findViewById(r5)
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.String r5 = r1.f137336d
            r4.setText(r5)
            fy0.i r5 = fy0.C8219i.f27144a
            r5.mo9271b(r4)
            goto L_0x01b5
        L_0x0108:
            r20 = 8
            r15 = 0
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r20)
            r5.mo10233c(r6)
            java.lang.Object[] r7 = r5.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/profile/ui/tab/msg/holder/LargePicViewHolder"
            java.lang.String r9 = "filling"
            java.lang.String r10 = "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;I)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r6 = r4
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r5 = r5.mo10231a(r15)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r4.setVisibility(r5)
            java.lang.String r7 = "com/tencent/mm/plugin/profile/ui/tab/msg/holder/LargePicViewHolder"
            java.lang.String r8 = "filling"
            java.lang.String r9 = "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;I)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r15)
            r4.mo10233c(r5)
            java.lang.Object[] r6 = r4.mo10232b()
            java.lang.String r7 = "com/tencent/mm/plugin/profile/ui/tab/msg/holder/LargePicViewHolder"
            java.lang.String r8 = "filling"
            java.lang.String r9 = "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;I)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r5 = r3
            j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r4 = r4.mo10231a(r15)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.setVisibility(r4)
            java.lang.String r6 = "com/tencent/mm/plugin/profile/ui/tab/msg/holder/LargePicViewHolder"
            java.lang.String r7 = "filling"
            java.lang.String r8 = "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;I)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
            r4 = 2131300187(0x7f090f5b, float:1.8218397E38)
            android.view.View r4 = r3.findViewById(r4)
            gy3.C87412m.m108593f(r4, r14)
            r5 = 2131302271(0x7f09177f, float:1.8222623E38)
            android.view.View r5 = r3.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            java.lang.String r6 = r1.f137336d
            r5.setText(r6)
            fy0.i r6 = fy0.C8219i.f27144a
            r6.mo9271b(r5)
            r5 = 2131302267(0x7f09177b, float:1.8222615E38)
            android.view.View r3 = r3.findViewById(r5)
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.String r5 = r1.f137317A
            r3.setText(r5)
            r3 = r4
        L_0x01b5:
            int r4 = r1.f137324H
            r5 = 1
            if (r4 <= r5) goto L_0x01cc
            r4 = r3
            android.widget.TextView r4 = (android.widget.TextView) r4
            r4.setVisibility(r15)
            android.widget.TextView r3 = (android.widget.TextView) r3
            int r4 = r1.f137324H
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r3.setText(r4)
            goto L_0x01db
        L_0x01cc:
            r4 = r3
            android.widget.TextView r4 = (android.widget.TextView) r4
            r6 = 8
            r4.setVisibility(r6)
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.String r4 = ""
            r3.setText(r4)
        L_0x01db:
            java.lang.String r3 = r1.f137328L
            boolean r3 = sf0.C77702q0.m93719b(r3)
            if (r3 == 0) goto L_0x01e6
            java.lang.String r1 = r1.f137342j
            goto L_0x01e8
        L_0x01e6:
            java.lang.String r1 = r1.f137328L
        L_0x01e8:
            hc0.c$b r3 = new hc0.c$b
            r3.<init>()
            r4 = 2131231295(0x7f08023f, float:1.8078667E38)
            r3.f59361q = r4
            r3.f59347c = r5
            gc0.a r4 = gc0.C20828a.m22825b()
            android.widget.ImageView r5 = r0.f127445C
            hc0.c r3 = r3.mo32666a()
            r4.mo32519h(r1, r5, r3)
            android.widget.ImageView r1 = r0.f127445C
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            kw0.a r3 = kw0.C46746a.f125826a
            android.content.Context r4 = r0.f127444B
            gy3.C87412m.m108593f(r4, r2)
            int r2 = r3.mo71973f(r4)
            android.content.Context r3 = r0.f127444B
            r4 = 16
            int r3 = kg3.C76577a.m92151b(r3, r4)
            int r2 = r2 - r3
            double r2 = (double) r2
            r4 = 4603241769126068224(0x3fe2000000000000, double:0.5625)
            double r2 = r2 * r4
            int r2 = (int) r2
            r1.height = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pf2.C47500x.mo72488y(pf2.c, int):void");
    }
}
