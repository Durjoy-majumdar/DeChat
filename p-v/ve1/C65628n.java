package ve1;

import androidx.recyclerview.widget.RecyclerView;
import cm1.C55027r;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import jq3.C60896i;
import jq3.C60905o;

/* renamed from: ve1.n */
public final class C65628n extends C60896i<C55027r> {

    /* renamed from: e */
    public final boolean f188841e;

    public C65628n(boolean z) {
        this.f188841e = z;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.f359778ao1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v39, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r16v15, types: [pl1.b0] */
    /* JADX WARNING: type inference failed for: r19v17, types: [pl1.o0] */
    /* JADX WARNING: type inference failed for: r16v16, types: [pl1.b0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0651  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0667  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0673  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r35, jq3.C9493c r36, int r37, int r38, boolean r39, java.util.List r40) {
        /*
            r34 = this;
            r0 = r34
            r1 = r35
            r2 = r37
            r3 = r39
            r4 = r36
            cm1.r r4 = (cm1.C55027r) r4
            java.lang.String r5 = "holder"
            gy3.C87412m.m108594g(r1, r5)
            java.lang.String r5 = "item"
            gy3.C87412m.m108594g(r4, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "onBindViewHolder isHotPatch:"
            r5.append(r6)
            r5.append(r3)
            java.lang.String r6 = " index:"
            r5.append(r6)
            r5.append(r2)
            java.lang.String r6 = ", desc:"
            r5.append(r6)
            java.lang.String r6 = r4.mo76079a()
            r5.append(r6)
            java.lang.String r6 = ", "
            r5.append(r6)
            up1.l r6 = r4.f154485d
            java.lang.String r6 = r6.mo89515m2()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "FinderDraftInfoConvert"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            r5 = 2131304667(0x7f0920db, float:1.8227483E38)
            android.view.View r5 = r1.mo85812D(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r7 = 2131304666(0x7f0920da, float:1.8227481E38)
            android.view.View r7 = r1.mo85812D(r7)
            com.tencent.mm.ui.widget.imageview.WeImageView r7 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r7
            r8 = 2131311394(0x7f093b22, float:1.8241127E38)
            android.view.View r9 = r1.mo85812D(r8)
            android.widget.TextView r9 = (android.widget.TextView) r9
            java.lang.String r10 = r4.mo76079a()
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            java.lang.String r11 = ""
            if (r10 == 0) goto L_0x0083
            android.content.Context r10 = r1.f173499A
            r12 = 2131826466(0x7f111722, float:1.9285817E38)
            java.lang.String r10 = r10.getString(r12)
            r9.setText(r10)
            r10 = r11
            goto L_0x00a1
        L_0x0083:
            java.lang.Class<ny.h> r10 = p629ny.C76979h.class
            di3.d r10 = di3.C86312j.m106911c(r10)
            ny.h r10 = (p629ny.C76979h) r10
            android.content.Context r12 = r1.f173499A
            java.lang.String r13 = r4.mo76079a()
            android.text.SpannableString r10 = r10.mo107057T1(r12, r13)
            r9.setText(r10)
            java.lang.CharSequence r10 = r9.getText()
            java.lang.String r12 = "musicText.text"
            gy3.C87412m.m108593f(r10, r12)
        L_0x00a1:
            r12 = 2131311392(0x7f093b20, float:1.8241123E38)
            android.view.View r12 = r1.mo85812D(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            boolean r13 = r4.mo76080b()
            if (r13 == 0) goto L_0x00c7
            android.content.Context r11 = r1.f173499A
            java.lang.String r13 = "holder.context"
            gy3.C87412m.m108593f(r11, r13)
            r13 = 2131829615(0x7f11236f, float:1.9292204E38)
            android.content.res.Resources r11 = r11.getResources()
            java.lang.String r11 = r11.getString(r13)
            java.lang.String r13 = "context.resources.getString(resId)"
            gy3.C87412m.m108593f(r11, r13)
        L_0x00c7:
            r12.setText(r11)
            r11 = 2131311393(0x7f093b21, float:1.8241125E38)
            android.view.View r11 = r1.mo85812D(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            android.content.Context r12 = r1.f173499A
            up1.l r13 = r4.f154485d
            com.tencent.mm.plugin.finder.storage.FinderItem r13 = r13.mo89514l2()
            int r13 = r13.getCreateTime()
            long r13 = (long) r13
            r15 = 0
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 > 0) goto L_0x00eb
            up1.l r13 = r4.f154485d
            int r13 = r13.field_createTime
            long r13 = (long) r13
        L_0x00eb:
            r15 = 1000(0x3e8, float:1.401E-42)
            r38 = r9
            long r8 = (long) r15
            long r13 = r13 * r8
            java.lang.String r8 = er1.C7878t0.m8038g(r12, r13)
            r11.setText(r8)
            java.lang.CharSequence r8 = r11.getText()
            r11 = 0
            if (r3 != 0) goto L_0x0203
            boolean r3 = r4.mo76080b()
            java.lang.String r13 = "imageView"
            if (r3 == 0) goto L_0x0111
            gy3.C87412m.m108593f(r5, r13)
            r3 = 2131232388(0x7f080684, float:1.8080884E38)
            r5.setImageResource(r3)
        L_0x0111:
            gy3.C87412m.m108593f(r5, r13)
            java.lang.String r3 = "defaultImageView"
            gy3.C87412m.m108593f(r7, r3)
            up1.l r3 = r4.f154485d
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.mo89514l2()
            boolean r13 = r4.mo76080b()
            java.lang.Class<pl1.s0> r14 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r15 = ht1.C60200t1.class
            up1.y r18 = up1.C27696y.THUMB_IMAGE
            java.util.LinkedList r3 = r3.getMediaList()
            java.lang.Object r3 = sx3.C110818d0.m150916N(r3)
            te3.rq2 r3 = (te3.C64689rq2) r3
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r12 = "setImage "
            r9.append(r12)
            if (r3 == 0) goto L_0x0143
            java.lang.String r12 = r3.f185267e
            goto L_0x0144
        L_0x0143:
            r12 = 0
        L_0x0144:
            r9.append(r12)
            java.lang.String r12 = " token:"
            r9.append(r12)
            if (r3 == 0) goto L_0x0151
            java.lang.String r12 = r3.f185288z
            goto L_0x0152
        L_0x0151:
            r12 = 0
        L_0x0152:
            r9.append(r12)
            java.lang.String r12 = " position:"
            r9.append(r12)
            r9.append(r2)
            java.lang.String r2 = "  imageView:"
            r9.append(r2)
            r9.append(r5)
            java.lang.String r2 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
            if (r3 == 0) goto L_0x01dc
            r5.setVisibility(r11)
            r2 = 8
            r7.setVisibility(r2)
            int r2 = r3.f185268f
            r6 = 4
            if (r2 != r6) goto L_0x01a7
            java.lang.String r2 = r3.f185283w
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x0195
            pl1.b0 r2 = new pl1.b0
            r19 = 0
            r20 = 0
            r21 = 12
            r22 = 0
            r16 = r2
            r17 = r3
            r16.<init>(r17, r18, r19, r20, r21, r22)
            goto L_0x01b8
        L_0x0195:
            pl1.o0 r2 = new pl1.o0
            up1.y r21 = up1.C27696y.RAW_IMAGE
            r22 = 0
            r23 = 4
            r24 = 0
            r19 = r2
            r20 = r3
            r19.<init>(r20, r21, r22, r23, r24)
            goto L_0x01b8
        L_0x01a7:
            pl1.b0 r2 = new pl1.b0
            r19 = 0
            r20 = 0
            r21 = 12
            r22 = 0
            r16 = r2
            r17 = r3
            r16.<init>(r17, r18, r19, r20, r21, r22)
        L_0x01b8:
            bl3.r r3 = bl3.C39818r.f106831a
            bl3.r$a r6 = r3.mo62446e(r15)
            bl3.c r6 = r6.mo62447c(r14)
            pl1.s0 r6 = (pl1.C11990s0) r6
            k60.d r6 = r6.mo11871f2()
            pl1.e0$a r7 = pl1.C11978e0.C11979a.TIMELINE
            bl3.r$a r3 = r3.mo62446e(r15)
            bl3.c r3 = r3.mo62447c(r14)
            pl1.s0 r3 = (pl1.C11990s0) r3
            n60.f r3 = r3.mo11867O2(r7)
            r6.mo85957c(r2, r5, r3)
            goto L_0x01ef
        L_0x01dc:
            if (r13 == 0) goto L_0x01e7
            r5.setVisibility(r11)
            r2 = 8
            r7.setVisibility(r2)
            goto L_0x01ef
        L_0x01e7:
            r2 = 8
            r5.setVisibility(r2)
            r7.setVisibility(r11)
        L_0x01ef:
            long r2 = r4.getItemId()
            java.lang.String r2 = o40.C61926c.m72691p(r2)
            zt3.t r3 = zt3.C119157j.f356862d
            ve1.j r6 = new ve1.j
            r6.<init>(r1, r2)
            zt3.j r3 = (zt3.C119157j) r3
            r3.mo183875f(r6)
        L_0x0203:
            r2 = 2131311405(0x7f093b2d, float:1.824115E38)
            android.view.View r2 = r1.mo85812D(r2)
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r2
            android.content.Context r3 = r1.f173499A
            android.content.res.Resources r3 = r3.getResources()
            er1.w3 r6 = er1.C58784w3.f168295a
            r7 = 2
            r9 = 0
            java.lang.Integer r6 = er1.C58784w3.m68436c0(r6, r7, r11, r7, r9)
            if (r6 == 0) goto L_0x0221
            int r6 = r6.intValue()
            goto L_0x0224
        L_0x0221:
            r6 = 2131755879(0x7f100367, float:1.914265E38)
        L_0x0224:
            r9 = 0
            android.graphics.drawable.Drawable r3 = hi3.C87515a.m108835e(r3, r6, r9)
            r2.setImageDrawable(r3)
            r2 = 2131311188(0x7f093a54, float:1.824071E38)
            android.view.View r3 = r1.mo85812D(r2)
            r6 = 2131311394(0x7f093b22, float:1.8241127E38)
            android.view.View r6 = r1.mo85812D(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r6.setMaxLines(r7)
            up1.l r9 = r4.f154485d
            int r9 = r9.field_dbversion
            java.lang.String[] r12 = wp1.C66165b.f190163n
            if (r9 != 0) goto L_0x0249
            r9 = 1
            goto L_0x024a
        L_0x0249:
            r9 = 0
        L_0x024a:
            if (r9 != 0) goto L_0x0604
            up1.f r9 = up1.C37521f.f99374d
            r9.getClass()
            pe1.c<java.lang.Integer> r9 = up1.C37521f.f99572z
            java.lang.Object r9 = r9.mo60266n()
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            if (r9 != 0) goto L_0x0261
            goto L_0x0604
        L_0x0261:
            up1.l r3 = r4.f154485d
            int r9 = r3.field_localFlag
            r9 = r9 & 3
            if (r9 != 0) goto L_0x026b
            r9 = 1
            goto L_0x026c
        L_0x026b:
            r9 = 0
        L_0x026c:
            r13 = 2131311473(0x7f093b71, float:1.8241287E38)
            r14 = 2131311386(0x7f093b1a, float:1.824111E38)
            if (r9 != 0) goto L_0x05a0
            te3.tq2 r9 = r3.getPostInfo()
            int r9 = r9.f185649h
            r15 = 100
            if (r9 < r15) goto L_0x0280
            goto L_0x05a0
        L_0x0280:
            int r9 = r3.field_localFlag
            r9 = r9 & r7
            if (r9 == 0) goto L_0x0287
            r9 = 1
            goto L_0x0288
        L_0x0287:
            r9 = 0
        L_0x0288:
            r15 = 2131311197(0x7f093a5d, float:1.8240727E38)
            r7 = 2131311196(0x7f093a5c, float:1.8240725E38)
            if (r9 == 0) goto L_0x03f2
            android.view.View r2 = r1.mo85812D(r2)
            k20.a r9 = new k20.a
            r9.<init>()
            java.lang.ThreadLocal<k20.a> r16 = k20.C60958c.f173611a
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            r9.mo10233c(r12)
            java.lang.Object[] r17 = r9.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/convert/FinderDraftInfoConvert"
            java.lang.String r19 = "updateProgress"
            java.lang.String r20 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderDraftInfoData;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r2
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r9 = r9.mo10231a(r11)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r2.setVisibility(r9)
            java.lang.String r17 = "com/tencent/mm/plugin/finder/convert/FinderDraftInfoConvert"
            java.lang.String r18 = "updateProgress"
            java.lang.String r19 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderDraftInfoData;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            android.view.View r2 = r1.mo85812D(r7)
            k20.a r7 = new k20.a
            r7.<init>()
            r9 = 8
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r7.mo10233c(r9)
            java.lang.Object[] r27 = r7.mo10232b()
            java.lang.String r28 = "com/tencent/mm/plugin/finder/convert/FinderDraftInfoConvert"
            java.lang.String r29 = "updateProgress"
            java.lang.String r30 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderDraftInfoData;)V"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            r26 = r2
            j20.C117292a.m165358d(r26, r27, r28, r29, r30, r31, r32, r33)
            java.lang.Object r7 = r7.mo10231a(r11)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r2.setVisibility(r7)
            java.lang.String r27 = "com/tencent/mm/plugin/finder/convert/FinderDraftInfoConvert"
            java.lang.String r28 = "updateProgress"
            java.lang.String r29 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderDraftInfoData;)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            j20.C117292a.m165359e(r26, r27, r28, r29, r30, r31, r32)
            android.view.View r2 = r1.mo85812D(r15)
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r11)
            r7.mo10233c(r9)
            java.lang.Object[] r17 = r7.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/convert/FinderDraftInfoConvert"
            java.lang.String r19 = "updateProgress"
            java.lang.String r20 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderDraftInfoData;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r2
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r7 = r7.mo10231a(r11)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r2.setVisibility(r7)
            java.lang.String r17 = "com/tencent/mm/plugin/finder/convert/FinderDraftInfoConvert"
            java.lang.String r18 = "updateProgress"
            java.lang.String r19 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderDraftInfoData;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            android.view.View r2 = r1.mo85812D(r14)
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r11)
            r7.mo10233c(r9)
            java.lang.Object[] r24 = r7.mo10232b()
            java.lang.String r25 = "com/tencent/mm/plugin/finder/convert/FinderDraftInfoConvert"
            java.lang.String r26 = "updateProgress"
            java.lang.String r27 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderDraftInfoData;)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            r23 = r2
            j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
            java.lang.Object r7 = r7.mo10231a(r11)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r2.setVisibility(r7)
            java.lang.String r24 = "com/tencent/mm/plugin/finder/convert/FinderDraftInfoConvert"
            java.lang.String r25 = "updateProgress"
            java.lang.String r26 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderDraftInfoData;)V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
            android.view.View r2 = r1.mo85812D(r13)
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r11)
            r7.mo10233c(r9)
            java.lang.Object[] r16 = r7.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/finder/convert/FinderDraftInfoConvert"
            java.lang.String r18 = "updateProgress"
            java.lang.String r19 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderDraftInfoData;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r15 = r2
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r7 = r7.mo10231a(r11)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r2.setVisibility(r7)
            java.lang.String r16 = "com/tencent/mm/plugin/finder/convert/FinderDraftInfoConvert"
            java.lang.String r17 = "updateProgress"
            java.lang.String r18 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderDraftInfoData;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
            r2 = 1
            r6.setMaxLines(r2)
            goto L_0x05e8
        L_0x03f2:
            android.view.View r2 = r1.mo85812D(r2)
            k20.a r9 = new k20.a
            r9.<init>()
            java.lang.ThreadLocal<k20.a> r12 = k20.C60958c.f173611a
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            r9.mo10233c(r12)
            java.lang.Object[] r17 = r9.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/convert/FinderDraftInfoConvert"
            java.lang.String r19 = "updateProgress"
            java.lang.String r20 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderDraftInfoData;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r2
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r9 = r9.mo10231a(r11)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r2.setVisibility(r9)
            java.lang.String r17 = "com/tencent/mm/plugin/finder/convert/FinderDraftInfoConvert"
            java.lang.String r18 = "updateProgress"
            java.lang.String r19 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderDraftInfoData;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            android.view.View r2 = r1.mo85812D(r7)
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r11)
            r7.mo10233c(r9)
            java.lang.Object[] r27 = r7.mo10232b()
            java.lang.String r28 = "com/tencent/mm/plugin/finder/convert/FinderDraftInfoConvert"
            java.lang.String r29 = "updateProgress"
            java.lang.String r30 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderDraftInfoData;)V"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            r26 = r2
            j20.C117292a.m165358d(r26, r27, r28, r29, r30, r31, r32, r33)
            java.lang.Object r7 = r7.mo10231a(r11)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r2.setVisibility(r7)
            java.lang.String r27 = "com/tencent/mm/plugin/finder/convert/FinderDraftInfoConvert"
            java.lang.String r28 = "updateProgress"
            java.lang.String r29 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderDraftInfoData;)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            j20.C117292a.m165359e(r26, r27, r28, r29, r30, r31, r32)
            android.view.View r2 = r1.mo85812D(r15)
            k20.a r7 = new k20.a
            r7.<init>()
            r9 = 8
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            r7.mo10233c(r12)
            java.lang.Object[] r17 = r7.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/convert/FinderDraftInfoConvert"
            java.lang.String r19 = "updateProgress"
            java.lang.String r20 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderDraftInfoData;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r2
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r7 = r7.mo10231a(r11)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r2.setVisibility(r7)
            java.lang.String r17 = "com/tencent/mm/plugin/finder/convert/FinderDraftInfoConvert"
            java.lang.String r18 = "updateProgress"
            java.lang.String r19 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderDraftInfoData;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            android.view.View r2 = r1.mo85812D(r14)
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r11)
            r7.mo10233c(r9)
            java.lang.Object[] r27 = r7.mo10232b()
            java.lang.String r28 = "com/tencent/mm/plugin/finder/convert/FinderDraftInfoConvert"
            java.lang.String r29 = "updateProgress"
            java.lang.String r30 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderDraftInfoData;)V"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            r26 = r2
            j20.C117292a.m165358d(r26, r27, r28, r29, r30, r31, r32, r33)
            java.lang.Object r7 = r7.mo10231a(r11)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r2.setVisibility(r7)
            java.lang.String r27 = "com/tencent/mm/plugin/finder/convert/FinderDraftInfoConvert"
            java.lang.String r28 = "updateProgress"
            java.lang.String r29 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderDraftInfoData;)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            j20.C117292a.m165359e(r26, r27, r28, r29, r30, r31, r32)
            android.view.View r2 = r1.mo85812D(r13)
            k20.a r7 = new k20.a
            r7.<init>()
            r9 = 8
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r7.mo10233c(r9)
            java.lang.Object[] r16 = r7.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/finder/convert/FinderDraftInfoConvert"
            java.lang.String r18 = "updateProgress"
            java.lang.String r19 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderDraftInfoData;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r15 = r2
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r7 = r7.mo10231a(r11)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r2.setVisibility(r7)
            java.lang.String r16 = "com/tencent/mm/plugin/finder/convert/FinderDraftInfoConvert"
            java.lang.String r17 = "updateProgress"
            java.lang.String r18 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderDraftInfoData;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
            r2 = 2131311488(0x7f093b80, float:1.8241318E38)
            android.view.View r2 = r1.mo85812D(r2)
            com.tencent.mm.plugin.finder.view.FinderPostProgressView r2 = (com.tencent.p014mm.plugin.finder.view.FinderPostProgressView) r2
            int r7 = r2.getProgress()
            te3.tq2 r9 = r3.getPostInfo()
            int r9 = r9.f185649h
            if (r7 <= r9) goto L_0x0573
            te3.tq2 r7 = r3.getPostInfo()
            int r7 = r7.f185649h
            r2.setProgress(r7)
            r2.invalidate()
            r11 = 1
            goto L_0x059c
        L_0x0573:
            r7 = 2
            int[] r7 = new int[r7]
            int r9 = r2.getProgress()
            r7[r11] = r9
            te3.tq2 r9 = r3.getPostInfo()
            int r9 = r9.f185649h
            r11 = 1
            r7[r11] = r9
            android.animation.ValueAnimator r7 = android.animation.ValueAnimator.ofInt(r7)
            ve1.k r9 = new ve1.k
            r9.<init>(r2)
            r7.addUpdateListener(r9)
            r14 = 400(0x190, double:1.976E-321)
            android.animation.ValueAnimator r2 = r7.setDuration(r14)
            if (r2 == 0) goto L_0x059c
            r2.start()
        L_0x059c:
            r6.setMaxLines(r11)
            goto L_0x05e8
        L_0x05a0:
            android.view.View r2 = r1.mo85812D(r2)
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            r7 = 8
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6.mo10233c(r7)
            java.lang.Object[] r15 = r6.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/finder/convert/FinderDraftInfoConvert"
            java.lang.String r17 = "updateProgress"
            java.lang.String r18 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderDraftInfoData;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r2
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r6 = r6.mo10231a(r11)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r2.setVisibility(r6)
            java.lang.String r15 = "com/tencent/mm/plugin/finder/convert/FinderDraftInfoConvert"
            java.lang.String r16 = "updateProgress"
            java.lang.String r17 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderDraftInfoData;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
        L_0x05e8:
            android.view.View r2 = r1.mo85812D(r13)
            ve1.l r6 = new ve1.l
            r6.<init>(r4)
            r2.setOnClickListener(r6)
            r2 = 2131311386(0x7f093b1a, float:1.824111E38)
            android.view.View r2 = r1.mo85812D(r2)
            ve1.m r6 = new ve1.m
            r6.<init>(r0, r1, r3)
            r2.setOnClickListener(r6)
            goto L_0x0648
        L_0x0604:
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            r6 = 8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r2.mo10233c(r6)
            java.lang.Object[] r13 = r2.mo10232b()
            java.lang.String r14 = "com/tencent/mm/plugin/finder/convert/FinderDraftInfoConvert"
            java.lang.String r15 = "updateProgress"
            java.lang.String r16 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderDraftInfoData;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r12 = r3
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r2 = r2.mo10231a(r11)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3.setVisibility(r2)
            java.lang.String r13 = "com/tencent/mm/plugin/finder/convert/FinderDraftInfoConvert"
            java.lang.String r14 = "updateProgress"
            java.lang.String r15 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderDraftInfoData;)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
        L_0x0648:
            r2 = 2131311391(0x7f093b1f, float:1.824112E38)
            android.view.View r1 = r1.mo85812D(r2)
            if (r1 == 0) goto L_0x065d
            r2 = 2131302587(0x7f0918bb, float:1.8223264E38)
            r1.setTag(r2, r10)
            r2 = 2131302520(0x7f091878, float:1.8223128E38)
            r1.setTag(r2, r8)
        L_0x065d:
            boolean r1 = r4.mo76080b()
            if (r1 == 0) goto L_0x0673
            boolean r1 = r0.f188841e
            if (r1 == 0) goto L_0x0673
            r1 = 1050253722(0x3e99999a, float:0.3)
            r9 = r38
            r9.setAlpha(r1)
            r5.setAlpha(r1)
            goto L_0x067d
        L_0x0673:
            r9 = r38
            r1 = 1065353216(0x3f800000, float:1.0)
            r9.setAlpha(r1)
            r5.setAlpha(r1)
        L_0x067d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ve1.C65628n.mo44e(jq3.o, jq3.c, int, int, boolean, java.util.List):void");
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
