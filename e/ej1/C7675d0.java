package ej1;

import cj1.C0571m3;
import cj1.C0581o5;
import com.tencent.p014mm.plugin.finder.live.model.commentitem.CommentItemRedPacket;
import fj1.C45795b;
import gy3.C87412m;
import te3.C52013xs0;

/* renamed from: ej1.d0 */
public final class C7675d0 extends CommentItemRedPacket {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7675d0(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x01ac  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8798b(android.content.Context r22, qk1.C12806i0.C12807a r23, cj1.C0581o5 r24, int r25) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            java.lang.String r4 = "context"
            gy3.C87412m.m108594g(r1, r4)
            java.lang.String r4 = "holder"
            gy3.C87412m.m108594g(r2, r4)
            java.lang.String r4 = "msg"
            gy3.C87412m.m108594g(r3, r4)
            java.lang.Class<l31.e> r4 = l31.C61212e.class
            java.lang.String r5 = r24.mo571e()
            java.lang.String r6 = eb0.C75592q0.m90789s()
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r5, (java.lang.String) r6)
            r6 = 0
            r7 = 1
            if (r5 != 0) goto L_0x003c
            java.lang.String r5 = r24.mo571e()
            zc1.b r8 = zc1.C66785b.f191882e
            java.lang.String r8 = r8.mo90662O5()
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r5, (java.lang.String) r8)
            if (r5 == 0) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r5 = 0
            goto L_0x003d
        L_0x003c:
            r5 = 1
        L_0x003d:
            android.content.res.Resources r8 = r22.getResources()
            r9 = 2131232563(0x7f080733, float:1.8081239E38)
            android.graphics.drawable.Drawable r8 = r8.getDrawable(r9)
            rx3.g r9 = r0.f43050c
            rx3.n r9 = (rx3.C36570n) r9
            java.lang.Object r9 = r9.getValue()
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            rx3.g r10 = r0.f43051d
            rx3.n r10 = (rx3.C36570n) r10
            java.lang.Object r10 = r10.getValue()
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            r8.setBounds(r6, r6, r9, r10)
            go3.c r9 = new go3.c
            r9.<init>(r8, r7)
            android.text.SpannableStringBuilder r8 = new android.text.SpannableStringBuilder
            java.lang.String r10 = "  "
            r8.<init>(r10)
            r10 = 33
            r8.setSpan(r9, r6, r7, r10)
            r9 = 2131827937(0x7f111ce1, float:1.92888E38)
            if (r5 == 0) goto L_0x00c3
            java.lang.String r11 = r24.mo571e()
            java.lang.String r12 = r24.mo580j()
            boolean r11 = gy3.C87412m.m108589b(r11, r12)
            if (r11 == 0) goto L_0x0091
            java.lang.String r11 = r1.getString(r9)
            r12 = 0
            goto L_0x00d7
        L_0x0091:
            fj1.b r11 = r0.f15089i
            java.lang.Class<cl1.o> r12 = cl1.C54991o.class
            androidx.lifecycle.i0 r11 = r11.mo71262a(r12)
            cl1.o r11 = (cl1.C54991o) r11
            java.lang.String r11 = r11.f154345o
            java.lang.String r12 = r24.mo580j()
            boolean r11 = gy3.C87412m.m108589b(r11, r12)
            if (r11 == 0) goto L_0x00af
            r11 = 2131827924(0x7f111cd4, float:1.9288774E38)
            java.lang.String r11 = r1.getString(r11)
            goto L_0x00d6
        L_0x00af:
            ok1.e r12 = ok1.C62042e.f176370a
            java.lang.String r13 = r24.mo580j()
            java.lang.String r14 = r24.mo585o()
            r15 = 0
            r16 = 4
            r17 = 0
            java.lang.String r11 = ok1.C62042e.m72808l0(r12, r13, r14, r15, r16, r17)
            goto L_0x00d6
        L_0x00c3:
            ok1.e r12 = ok1.C62042e.f176370a
            java.lang.String r13 = r24.mo571e()
            java.lang.String r14 = r24.mo573g()
            r15 = 0
            r16 = 4
            r17 = 0
            java.lang.String r11 = ok1.C62042e.m72808l0(r12, r13, r14, r15, r16, r17)
        L_0x00d6:
            r12 = 1
        L_0x00d7:
            java.lang.String r13 = "if (isFromSelf) {\n      …UserNickName())\n        }"
            gy3.C87412m.m108593f(r11, r13)
            android.content.res.Resources r13 = r22.getResources()
            r14 = 2131827923(0x7f111cd3, float:1.9288772E38)
            java.lang.String r15 = r13.getString(r14)
            java.lang.String r13 = "context.resources.getStr….finder_live_lucky_money)"
            gy3.C87412m.m108593f(r15, r13)
            r13 = 2
            if (r5 == 0) goto L_0x011b
            java.lang.String r5 = r1.getString(r9)
            boolean r5 = gy3.C87412m.m108589b(r11, r5)
            if (r5 == 0) goto L_0x0109
            android.content.res.Resources r5 = r22.getResources()
            r9 = 2131827933(0x7f111cdd, float:1.9288793E38)
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r6] = r15
            java.lang.String r5 = r5.getString(r9, r7)
            goto L_0x012c
        L_0x0109:
            android.content.res.Resources r5 = r22.getResources()
            r9 = 2131827932(0x7f111cdc, float:1.928879E38)
            java.lang.Object[] r13 = new java.lang.Object[r13]
            r13[r6] = r11
            r13[r7] = r15
            java.lang.String r5 = r5.getString(r9, r13)
            goto L_0x012c
        L_0x011b:
            android.content.res.Resources r5 = r22.getResources()
            r9 = 2131827931(0x7f111cdb, float:1.9288789E38)
            java.lang.Object[] r13 = new java.lang.Object[r13]
            r13[r6] = r11
            r13[r7] = r15
            java.lang.String r5 = r5.getString(r9, r13)
        L_0x012c:
            java.lang.String r6 = "if (isFromSelf) {\n      …e,luckMoneyStr)\n        }"
            gy3.C87412m.m108593f(r5, r6)
            android.text.SpannableString r6 = new android.text.SpannableString
            r6.<init>(r5)
            com.tencent.mm.ui.widget.MMNeat7extView r7 = r2.f36658A
            r9 = 2131302534(0x7f091886, float:1.8223157E38)
            r7.setTag(r9, r6)
            com.tencent.mm.ui.widget.MMNeat7extView r7 = r2.f36658A
            r9 = 2131302537(0x7f091889, float:1.8223163E38)
            r7.setTag(r9, r15)
            di3.d r7 = di3.C86312j.m106911c(r4)
            l31.e r7 = (l31.C61212e) r7
            com.tencent.mm.ui.widget.MMNeat7extView r9 = r2.f36658A
            java.lang.String r13 = "finder_live_comment_red_packet"
            r7.o30(r9, r13)
            boolean r7 = r3 instanceof cj1.C0571m3
            if (r7 == 0) goto L_0x0176
            di3.d r7 = di3.C86312j.m106911c(r4)
            l31.e r7 = (l31.C61212e) r7
            com.tencent.mm.ui.widget.MMNeat7extView r9 = r2.f36658A
            r13 = 8
            r14 = 25561(0x63d9, float:3.5819E-41)
            r7.mo86175pO(r9, r13, r14)
            di3.d r4 = di3.C86312j.m106911c(r4)
            l31.e r4 = (l31.C61212e) r4
            com.tencent.mm.ui.widget.MMNeat7extView r7 = r2.f36658A
            ej1.b0 r9 = new ej1.b0
            r9.<init>(r0, r3)
            r4.E60(r7, r9)
        L_0x0176:
            if (r12 == 0) goto L_0x01ac
            r14 = 0
            r4 = 0
            r16 = 6
            r17 = 0
            r12 = r5
            r13 = r11
            r7 = r15
            r15 = r4
            int r4 = z04.C112550d0.m153769E(r12, r13, r14, r15, r16, r17)
            if (r4 < 0) goto L_0x01ad
            int r9 = r11.length()
            int r9 = r9 + r4
            int r12 = r5.length()
            if (r9 > r12) goto L_0x01ad
            android.text.style.ForegroundColorSpan r9 = new android.text.style.ForegroundColorSpan
            android.content.res.Resources r12 = r22.getResources()
            r13 = 2131100898(0x7f0604e2, float:1.781419E38)
            int r12 = r12.getColor(r13)
            r9.<init>(r12)
            int r11 = r11.length()
            int r11 = r11 + r4
            r6.setSpan(r9, r4, r11, r10)
            goto L_0x01ad
        L_0x01ac:
            r7 = r15
        L_0x01ad:
            r17 = 0
            r18 = 0
            r19 = 6
            r20 = 0
            r15 = r5
            r16 = r7
            int r4 = z04.C112550d0.m153769E(r15, r16, r17, r18, r19, r20)
            if (r4 < 0) goto L_0x01d6
            int r9 = r7.length()
            int r9 = r9 + r4
            int r5 = r5.length()
            if (r9 > r5) goto L_0x01d6
            ej1.c0 r5 = new ej1.c0
            r5.<init>(r3, r0, r1)
            int r3 = r7.length()
            int r3 = r3 + r4
            r6.setSpan(r5, r4, r3, r10)
        L_0x01d6:
            r8.append(r6)
            com.tencent.mm.ui.widget.MMNeat7extView r3 = r2.f36658A
            r3.mo104279b(r8)
            com.tencent.mm.ui.widget.MMNeat7extView r3 = r2.f36658A
            int r4 = r0.f43055h
            float r4 = (float) r4
            r3.setTextSize(r4)
            android.view.View r2 = r2.f36659B
            android.content.res.Resources r1 = r22.getResources()
            r3 = 2131232561(0x7f080731, float:1.8081235E38)
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r3)
            r2.setBackground(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ej1.C7675d0.mo8798b(android.content.Context, qk1.i0$a, cj1.o5, int):void");
    }

    /* renamed from: c */
    public C0581o5 mo8804c(C52013xs0 xs02) {
        C87412m.m108594g(xs02, "msg");
        return new C0571m3(xs02);
    }

    /* renamed from: j */
    public int mo8797j() {
        return 20020;
    }
}
