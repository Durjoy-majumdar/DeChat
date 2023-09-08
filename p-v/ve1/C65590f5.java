package ve1;

import cm1.C55016h1;
import com.tencent.p014mm.C0966R;

/* renamed from: ve1.f5 */
public final class C65590f5 extends C65600h5<C55016h1> {

    /* renamed from: g */
    public final int f188739g;

    /* renamed from: h */
    public final String f188740h = "Finder.FinderMsgCommentConvert";

    public C65590f5(int i) {
        super(C0966R.C0971layout.am5, i);
        this.f188739g = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x034e  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x03ab  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x03ad  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x03b0  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo89664j(jq3.C60905o r26, cm1.C55011a r27, int r28) {
        /*
            r25 = this;
            r8 = r25
            r3 = r26
            r0 = r27
            cm1.h1 r0 = (cm1.C55016h1) r0
            java.lang.Class<ny.h> r1 = p629ny.C76979h.class
            java.lang.Class<pl1.s0> r2 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r4 = ht1.C60200t1.class
            java.lang.String r5 = "holder"
            gy3.C87412m.m108594g(r3, r5)
            java.lang.String r5 = "item"
            gy3.C87412m.m108594g(r0, r5)
            pl1.f r5 = new pl1.f
            xh.va r6 = r0.f154465d
            java.lang.String r6 = r6.field_headUrl
            r7 = 0
            r9 = 2
            r5.<init>(r6, r7, r9, r7)
            r6 = 2131309960(0x7f093588, float:1.8238219E38)
            android.view.View r10 = r3.mo85812D(r6)
            r6 = 2131310284(0x7f0936cc, float:1.8238876E38)
            android.view.View r6 = r3.mo85812D(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r11 = 2131302680(0x7f091918, float:1.8223453E38)
            android.view.View r11 = r3.mo85812D(r11)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            r12 = 2131297420(0x7f09048c, float:1.8212784E38)
            android.view.View r13 = r3.mo85812D(r12)
            android.widget.TextView r13 = (android.widget.TextView) r13
            r14 = 2131302908(0x7f0919fc, float:1.8223915E38)
            android.view.View r14 = r3.mo85812D(r14)
            android.widget.TextView r14 = (android.widget.TextView) r14
            java.lang.String r15 = r8.f188740h
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r12 = "username "
            r7.append(r12)
            xh.va r12 = r0.f154465d
            java.lang.String r12 = r12.field_username
            java.lang.String r9 = ""
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r12, (java.lang.String) r9)
            r7.append(r12)
            java.lang.String r12 = " nickname "
            r7.append(r12)
            xh.va r12 = r0.f154465d
            java.lang.String r12 = r12.field_nickname
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r12, (java.lang.String) r9)
            r7.append(r12)
            java.lang.String r12 = " url "
            r7.append(r12)
            xh.va r12 = r0.f154465d
            java.lang.String r12 = r12.field_headUrl
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r12, (java.lang.String) r9)
            r7.append(r12)
            java.lang.String r12 = " flag "
            r7.append(r12)
            xh.va r12 = r0.f154465d
            int r12 = r12.field_extFlag
            r7.append(r12)
            java.lang.String r12 = " content "
            r7.append(r12)
            xh.va r12 = r0.f154465d
            java.lang.String r12 = r12.field_content
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r12)
            r7.append(r12)
            java.lang.String r12 = " id "
            r7.append(r12)
            xh.va r12 = r0.f154465d
            r16 = r11
            long r11 = r12.field_id
            r7.append(r11)
            java.lang.String r11 = " time "
            r7.append(r11)
            xh.va r11 = r0.f154465d
            int r11 = r11.field_createTime
            r7.append(r11)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r7)
            xh.va r7 = r0.f154465d
            int r7 = r7.field_extFlag
            r11 = r7 & 2
            r15 = 1
            java.lang.String r12 = "holder.getView(R.id.avatar_iv)"
            if (r11 != 0) goto L_0x0104
            r7 = r7 & r15
            if (r7 == 0) goto L_0x00d4
            goto L_0x0104
        L_0x00d4:
            bl3.r r7 = bl3.C39818r.f106831a
            bl3.r$a r11 = r7.mo62446e(r4)
            bl3.c r11 = r11.mo62447c(r2)
            pl1.s0 r11 = (pl1.C11990s0) r11
            k60.d r11 = r11.mo11865K1()
            r15 = 2131297474(0x7f0904c2, float:1.8212894E38)
            android.view.View r15 = r3.mo85812D(r15)
            gy3.C87412m.m108593f(r15, r12)
            android.widget.ImageView r15 = (android.widget.ImageView) r15
            pl1.e0$a r12 = pl1.C11978e0.C11979a.WX_AVATAR
            bl3.r$a r4 = r7.mo62446e(r4)
            bl3.c r2 = r4.mo62447c(r2)
            pl1.s0 r2 = (pl1.C11990s0) r2
            n60.f r2 = r2.mo11867O2(r12)
            r11.mo85957c(r5, r15, r2)
            goto L_0x0133
        L_0x0104:
            bl3.r r7 = bl3.C39818r.f106831a
            bl3.r$a r11 = r7.mo62446e(r4)
            bl3.c r11 = r11.mo62447c(r2)
            pl1.s0 r11 = (pl1.C11990s0) r11
            k60.d r11 = r11.mo11872i2()
            r15 = 2131297474(0x7f0904c2, float:1.8212894E38)
            android.view.View r15 = r3.mo85812D(r15)
            gy3.C87412m.m108593f(r15, r12)
            android.widget.ImageView r15 = (android.widget.ImageView) r15
            pl1.e0$a r12 = pl1.C11978e0.C11979a.AVATAR
            bl3.r$a r4 = r7.mo62446e(r4)
            bl3.c r2 = r4.mo62447c(r2)
            pl1.s0 r2 = (pl1.C11990s0) r2
            n60.f r2 = r2.mo11867O2(r12)
            r11.mo85957c(r5, r15, r2)
        L_0x0133:
            xh.va r2 = r0.f154465d
            int r2 = r2.field_extFlag
            r4 = 1
            r2 = r2 & r4
            r5 = 0
            r7 = 8
            if (r2 != r4) goto L_0x0142
            r13.setVisibility(r5)
            goto L_0x0145
        L_0x0142:
            r13.setVisibility(r7)
        L_0x0145:
            di3.d r2 = di3.C86312j.m106911c(r1)
            ny.h r2 = (p629ny.C76979h) r2
            android.content.Context r4 = r3.f173499A
            er1.w3 r11 = er1.C58784w3.f168295a
            java.lang.String r11 = r11.mo83928f0(r0)
            android.text.SpannableString r2 = r2.mo107057T1(r4, r11)
            r6.setText(r2)
            r2 = 2131309576(0x7f093408, float:1.823744E38)
            android.view.View r2 = r3.mo85812D(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            di3.d r4 = di3.C86312j.m106911c(r1)
            ny.h r4 = (p629ny.C76979h) r4
            android.content.Context r11 = r3.f173499A
            xh.va r12 = r0.f154465d
            java.lang.String r12 = r12.field_content
            android.text.SpannableString r4 = r4.mo107057T1(r11, r12)
            r2.setText(r4)
            xh.va r2 = r0.f154465d
            java.lang.String r2 = r2.field_refContent
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            r4 = 2131312040(0x7f093da8, float:1.8242437E38)
            if (r2 != 0) goto L_0x021d
            android.view.View r2 = r3.mo85812D(r4)
            if (r2 != 0) goto L_0x018a
            goto L_0x01cb
        L_0x018a:
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r5)
            r4.mo10233c(r11)
            java.lang.Object[] r18 = r4.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/finder/convert/FinderMsgCommentConvert"
            java.lang.String r20 = "convertMsg"
            java.lang.String r21 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgComment;I)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r2
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r4 = r4.mo10231a(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r18 = "com/tencent/mm/plugin/finder/convert/FinderMsgCommentConvert"
            java.lang.String r19 = "convertMsg"
            java.lang.String r20 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgComment;I)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
        L_0x01cb:
            xh.va r2 = r0.f154465d
            java.lang.String r2 = r2.field_replayNickname
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            r4 = 2131309610(0x7f09342a, float:1.8237509E38)
            if (r2 != 0) goto L_0x0203
            android.view.View r2 = r3.mo85812D(r4)
            android.widget.TextView r2 = (android.widget.TextView) r2
            di3.d r1 = di3.C86312j.m106911c(r1)
            ny.h r1 = (p629ny.C76979h) r1
            android.content.Context r4 = r3.f173499A
            r11 = 2131829237(0x7f1121f5, float:1.9291437E38)
            r12 = 2
            java.lang.Object[] r15 = new java.lang.Object[r12]
            xh.va r12 = r0.f154465d
            java.lang.String r7 = r12.field_replayNickname
            r15[r5] = r7
            java.lang.String r7 = r12.field_refContent
            r12 = 1
            r15[r12] = r7
            java.lang.String r7 = r4.getString(r11, r15)
            android.text.SpannableString r1 = r1.mo107057T1(r4, r7)
            r2.setText(r1)
            goto L_0x0267
        L_0x0203:
            android.view.View r2 = r3.mo85812D(r4)
            android.widget.TextView r2 = (android.widget.TextView) r2
            di3.d r1 = di3.C86312j.m106911c(r1)
            ny.h r1 = (p629ny.C76979h) r1
            android.content.Context r4 = r3.f173499A
            xh.va r7 = r0.f154465d
            java.lang.String r7 = r7.field_refContent
            android.text.SpannableString r1 = r1.mo107057T1(r4, r7)
            r2.setText(r1)
            goto L_0x0267
        L_0x021d:
            android.view.View r1 = r3.mo85812D(r4)
            if (r1 != 0) goto L_0x0224
            goto L_0x0267
        L_0x0224:
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            r4 = 8
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            r2.mo10233c(r7)
            java.lang.Object[] r18 = r2.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/finder/convert/FinderMsgCommentConvert"
            java.lang.String r20 = "convertMsg"
            java.lang.String r21 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgComment;I)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r1
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r2 = r2.mo10231a(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r18 = "com/tencent/mm/plugin/finder/convert/FinderMsgCommentConvert"
            java.lang.String r19 = "convertMsg"
            java.lang.String r20 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgComment;I)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
        L_0x0267:
            xh.va r1 = r0.f154465d
            r2 = 2131315205(0x7f094a05, float:1.8248857E38)
            android.view.View r2 = r3.mo85812D(r2)
            java.lang.String r4 = "holder.getView(R.id.thumb_view)"
            gy3.C87412m.m108593f(r2, r4)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r4 = 2131315112(0x7f0949a8, float:1.8248668E38)
            android.view.View r4 = r3.mo85812D(r4)
            java.lang.String r7 = "holder.getView(R.id.text_content_view)"
            gy3.C87412m.m108593f(r4, r7)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r8.mo89673k(r1, r2, r4)
            int r1 = r8.f188739g
            r2 = 2131309577(0x7f093409, float:1.8237442E38)
            r4 = 1
            if (r1 != r4) goto L_0x02fb
            xh.va r1 = r0.f154465d
            long r11 = r1.field_objectType
            int r4 = (int) r11
            r7 = 2
            if (r4 != r7) goto L_0x02fb
            java.lang.String r1 = r1.field_refContent
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x02fb
            android.view.View r1 = r3.mo85812D(r2)
            if (r1 != 0) goto L_0x02a7
            goto L_0x02e8
        L_0x02a7:
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r4.mo10233c(r7)
            java.lang.Object[] r18 = r4.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/finder/convert/FinderMsgCommentConvert"
            java.lang.String r20 = "convertMsg"
            java.lang.String r21 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgComment;I)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r1
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r4 = r4.mo10231a(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r1.setVisibility(r4)
            java.lang.String r18 = "com/tencent/mm/plugin/finder/convert/FinderMsgCommentConvert"
            java.lang.String r19 = "convertMsg"
            java.lang.String r20 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgComment;I)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
        L_0x02e8:
            android.view.View r1 = r3.mo85812D(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.content.Context r2 = r3.f173499A
            r4 = 2131829226(0x7f1121ea, float:1.9291415E38)
            java.lang.String r2 = r2.getString(r4)
            r1.setText(r2)
            goto L_0x0345
        L_0x02fb:
            android.view.View r1 = r3.mo85812D(r2)
            if (r1 != 0) goto L_0x0302
            goto L_0x0345
        L_0x0302:
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            r4 = 8
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            r2.mo10233c(r7)
            java.lang.Object[] r18 = r2.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/finder/convert/FinderMsgCommentConvert"
            java.lang.String r20 = "convertMsg"
            java.lang.String r21 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgComment;I)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r1
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r2 = r2.mo10231a(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r18 = "com/tencent/mm/plugin/finder/convert/FinderMsgCommentConvert"
            java.lang.String r19 = "convertMsg"
            java.lang.String r20 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgComment;I)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
        L_0x0345:
            r1 = 2131309590(0x7f093416, float:1.8237468E38)
            android.view.View r1 = r3.mo85812D(r1)
            if (r1 == 0) goto L_0x039f
            r2 = 2131302575(0x7f0918af, float:1.822324E38)
            java.lang.CharSequence r4 = r6.getText()
            r1.setTag(r2, r4)
            r2 = 2131302513(0x7f091871, float:1.8223114E38)
            xh.va r4 = r0.f154465d
            if (r4 == 0) goto L_0x0367
            com.tencent.mm.protocal.protobuf.FinderContact r4 = r4.field_authorContact
            if (r4 == 0) goto L_0x0367
            java.lang.String r4 = r4.nickname
            if (r4 != 0) goto L_0x0368
        L_0x0367:
            r4 = r9
        L_0x0368:
            r1.setTag(r2, r4)
            r2 = 2131302571(0x7f0918ab, float:1.8223232E38)
            xh.va r4 = r0.f154465d
            if (r4 == 0) goto L_0x0375
            java.lang.String r4 = r4.field_content
            goto L_0x0376
        L_0x0375:
            r4 = 0
        L_0x0376:
            if (r4 != 0) goto L_0x0379
            r4 = r9
        L_0x0379:
            r1.setTag(r2, r4)
            r2 = 2131302573(0x7f0918ad, float:1.8223236E38)
            xh.va r4 = r0.f154465d
            if (r4 == 0) goto L_0x0386
            java.lang.String r4 = r4.field_refContent
            goto L_0x0387
        L_0x0386:
            r4 = 0
        L_0x0387:
            if (r4 != 0) goto L_0x038a
            r4 = r9
        L_0x038a:
            r1.setTag(r2, r4)
            r2 = 2131302582(0x7f0918b6, float:1.8223254E38)
            xh.va r4 = r0.f154465d
            if (r4 == 0) goto L_0x0397
            java.lang.String r7 = r4.field_replayNickname
            goto L_0x0398
        L_0x0397:
            r7 = 0
        L_0x0398:
            if (r7 != 0) goto L_0x039b
            goto L_0x039c
        L_0x039b:
            r9 = r7
        L_0x039c:
            r1.setTag(r2, r9)
        L_0x039f:
            r1 = 8
            r14.setVisibility(r1)
            xh.va r0 = r0.f154465d
            int r0 = r0.field_followFlag
            r4 = 1
            if (r0 != r4) goto L_0x03ad
            r0 = 1
            goto L_0x03ae
        L_0x03ad:
            r0 = 0
        L_0x03ae:
            if (r0 == 0) goto L_0x03c9
            r0 = 2131297420(0x7f09048c, float:1.8212784E38)
            android.view.View r0 = r3.mo85812D(r0)
            if (r0 == 0) goto L_0x03c3
            int r0 = r0.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x03c3
            r15 = 1
            goto L_0x03c4
        L_0x03c3:
            r15 = 0
        L_0x03c4:
            if (r15 == 0) goto L_0x03c9
            r14.setVisibility(r5)
        L_0x03c9:
            ve1.e5 r9 = new ve1.e5
            r0 = r9
            r1 = r10
            r2 = r16
            r3 = r26
            r4 = r13
            r5 = r14
            r7 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r10.post(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ve1.C65590f5.mo89664j(jq3.o, cm1.a, int):void");
    }
}
