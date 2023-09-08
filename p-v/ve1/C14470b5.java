package ve1;

import androidx.recyclerview.widget.RecyclerView;
import cm1.C0716c;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import jq3.C60896i;
import jq3.C60905o;
import kf1.C9930p9;

/* renamed from: ve1.b5 */
public final class C14470b5 extends C60896i<C0716c> {

    /* renamed from: e */
    public final C9930p9<C0716c> f40110e;

    /* renamed from: f */
    public final float f40111f = 1.1666666f;

    public C14470b5(C9930p9<C0716c> p9Var) {
        C87412m.m108594g(p9Var, "presenter");
        this.f40110e = p9Var;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.adc;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0183, code lost:
        r15 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0185, code lost:
        com.tencent.p014mm.p136ui.C85875k4.m106189j0(r1.getPaint(), 0.8f);
        r1.setText(((p629ny.C76979h) di3.C86312j.m106911c(p629ny.C76979h.class)).mo107057T1(r8.f173499A, r4.mo13669d()));
        r0 = r4.mo13668c().f136851i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x01aa, code lost:
        if (r0 != null) goto L_0x01ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x01ac, code lost:
        r0 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x01b2, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r0) == false) goto L_0x01b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x01b4, code lost:
        r2.setVisibility(r15);
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x01b9, code lost:
        r1 = 0;
        r2.setVisibility(0);
        r0 = r4.mo13668c().f136851i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x01c3, code lost:
        if (r0 != null) goto L_0x01c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x01c5, code lost:
        r0 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x01c7, code lost:
        r2.setText(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x01ca, code lost:
        r0 = r4.mo13668c().f136848f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x01d0, code lost:
        if (r0 != null) goto L_0x01d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x01d2, code lost:
        r0 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x01d8, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r0) == false) goto L_0x01de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x01da, code lost:
        r3.setVisibility(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01de, code lost:
        r3.setVisibility(r1);
        r0 = r4.mo13668c().f136848f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x01e7, code lost:
        if (r0 != null) goto L_0x01eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01e9, code lost:
        r0 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01eb, code lost:
        r3.setText(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01ee, code lost:
        if (r39 != false) goto L_0x0524;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01f0, code lost:
        r0 = new java.util.ArrayList();
        r0.clear();
        r2 = r8.mo85812D(com.tencent.p014mm.C0966R.C0970id.j7y);
        gy3.C87412m.m108593f(r2, "holder.getView(R.id.section_item_bottom_feed_1)");
        r0.add(r2);
        r2 = r8.mo85812D(com.tencent.p014mm.C0966R.C0970id.j7z);
        gy3.C87412m.m108593f(r2, "holder.getView(R.id.section_item_bottom_feed_2)");
        r0.add(r2);
        r2 = r8.mo85812D(com.tencent.p014mm.C0966R.C0970id.f359143j80);
        gy3.C87412m.m108593f(r2, "holder.getView(R.id.section_item_bottom_feed_3)");
        r0.add(r2);
        r2 = (r8.f173499A.getResources().getDisplayMetrics().widthPixels - kg3.C76577a.m92151b(r8.f173499A, 32)) / 3;
        r3 = (int) (((float) r2) * r7.f40111f);
        r10 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x024a, code lost:
        if (r10.hasNext() == false) goto L_0x029f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x024c, code lost:
        r11 = (android.view.View) r10.next();
        r12 = r11.getLayoutParams();
        r12.width = r2;
        r12.height = r3;
        r11.setLayoutParams(r12);
        r12 = new k20.C9556a();
        r13 = k20.C60958c.f173611a;
        r12.mo10233c(java.lang.Integer.valueOf(r15));
        r19 = r11;
        j20.C117292a.m165358d(r19, r12.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderMixLbsSectionFeedConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseMixFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r11.setVisibility(((java.lang.Integer) r12.mo10231a(r1)).intValue());
        j20.C117292a.m165359e(r19, "com/tencent/mm/plugin/finder/convert/FinderMixLbsSectionFeedConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseMixFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x029f, code lost:
        r19 = r0.iterator();
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x02a8, code lost:
        if (r19.hasNext() == false) goto L_0x0524;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x02aa, code lost:
        r0 = r19.next();
        r20 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x02b0, code lost:
        if (r2 < 0) goto L_0x051f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x02b2, code lost:
        r0 = (android.view.View) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x02ba, code lost:
        if (r2 < r4.f39920b.size()) goto L_0x0306;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x02bc, code lost:
        r2 = new k20.C9556a();
        r3 = k20.C60958c.f173611a;
        r2.mo10233c(java.lang.Integer.valueOf(r15));
        r21 = r0;
        j20.C117292a.m165358d(r21, r2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderMixLbsSectionFeedConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseMixFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r0.setVisibility(((java.lang.Integer) r2.mo10231a(r1)).intValue());
        j20.C117292a.m165359e(r21, "com/tencent/mm/plugin/finder/convert/FinderMixLbsSectionFeedConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseMixFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r14 = r4;
        r15 = r5;
        r16 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0306, code lost:
        r10 = new k20.C9556a();
        r11 = k20.C60958c.f173611a;
        r10.mo10233c(java.lang.Integer.valueOf(r1));
        r21 = r0;
        j20.C117292a.m165358d(r21, r10.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderMixLbsSectionFeedConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseMixFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r0.setVisibility(((java.lang.Integer) r10.mo10231a(r1)).intValue());
        j20.C117292a.m165359e(r21, "com/tencent/mm/plugin/finder/convert/FinderMixLbsSectionFeedConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseMixFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r14 = (android.widget.ImageView) r0.findViewById(com.tencent.p014mm.C0966R.C0970id.f359145j82);
        r13 = (android.widget.ImageView) r0.findViewById(com.tencent.p014mm.C0966R.C0970id.j7u);
        r12 = (android.widget.TextView) r0.findViewById(com.tencent.p014mm.C0966R.C0970id.f359144j81);
        r11 = (android.widget.ImageView) r0.findViewById(com.tencent.p014mm.C0966R.C0970id.j7t);
        r10 = r4.f39920b.get(r2);
        gy3.C87412m.m108593f(r10, "lbsItem.feedList[index]");
        r28 = r10;
        r15 = (te3.C64689rq2) sx3.C110818d0.m150916N(r28.mo3513o().getMediaList());
        r14.setImageResource(com.tencent.p014mm.C0966R.color.BW_97);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0393, code lost:
        if (r15 == null) goto L_0x046e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0398, code lost:
        if (r15.f185268f != 4) goto L_0x0423;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x03a0, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r15.f185283w) == false) goto L_0x03e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x03a2, code lost:
        r29 = r11;
        r11 = r15;
        r30 = r13;
        r31 = r12;
        r10 = new pl1.C62344b0(r11, r17, (java.lang.String) null, (java.lang.String) null, 12, (gy3.C8480h) null);
        r10 = bl3.C39818r.f106831a;
        ((pl1.C11990s0) r10.mo62446e(r5).mo62447c(r6)).mo11871f2().mo85957c(r10, r14, ((pl1.C11990s0) r10.mo62446e(r5).mo62447c(r6)).mo11867O2(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x03e9, code lost:
        r29 = r11;
        r31 = r12;
        r30 = r13;
        r21 = new pl1.C11986o0(r15, up1.C27696y.RAW_IMAGE, (java.lang.String) null, 4, (gy3.C8480h) null);
        r10 = bl3.C39818r.f106831a;
        ((pl1.C11990s0) r10.mo62446e(r5).mo62447c(r6)).mo11871f2().mo85957c(r21, r14, ((pl1.C11990s0) r10.mo62446e(r5).mo62447c(r6)).mo11867O2(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0423, code lost:
        r29 = r11;
        r31 = r12;
        r30 = r13;
        r1 = bl3.C39818r.f106831a;
        r10 = new pl1.C62344b0(r15, r17, (java.lang.String) null, (java.lang.String) null, 12, (gy3.C8480h) null);
        r10 = ((pl1.C11990s0) r1.mo62446e(r5).mo62447c(r6)).mo11871f2();
        r11 = r10;
        r10.mo85957c(r11, r14, ((pl1.C11990s0) r1.mo62446e(r5).mo62447c(r6)).mo11867O2(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x046e, code lost:
        r29 = r11;
        r31 = r12;
        r30 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0474, code lost:
        r1 = r28.mo3513o().getFeedObject().contact;
        r10 = r30;
        r10.setImageResource(com.tencent.p014mm.C0966R.color.BW_97);
        r3 = bl3.C39818r.f106831a;
        r11 = ((pl1.C11990s0) r3.mo62446e(r5).mo62447c(r6)).mo11872i2();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0498, code lost:
        if (r1 == null) goto L_0x049e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x049a, code lost:
        r13 = r1.headUrl;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x049c, code lost:
        if (r13 != null) goto L_0x04a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x049e, code lost:
        r13 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x04a0, code lost:
        r11.mo85957c(new pl1.C62345f(r13, (up1.C27696y) null, 2, (gy3.C8480h) null), r10, ((pl1.C11990s0) r3.mo62446e(r5).mo62447c(r6)).mo11867O2(pl1.C11978e0.C11979a.AVATAR));
        r3 = r28.mo3513o().getNickNameSpan();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x04c0, code lost:
        if (r3 == null) goto L_0x04c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x04c3, code lost:
        r3 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x04c5, code lost:
        r31.setText(r3);
        r10 = r29;
        gy3.C87412m.m108593f(r10, "authIcon");
        r10.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x04d6, code lost:
        if (r1 == null) goto L_0x04dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x04d8, code lost:
        r23 = r1.authInfo;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x04dd, code lost:
        r23 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x04df, code lost:
        if (r23 == null) goto L_0x04fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x04e1, code lost:
        r21 = er1.C58784w3.f168295a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x04e5, code lost:
        if (r1 == null) goto L_0x04ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x04e7, code lost:
        r25 = fe1.C58960c.m68829a(r1, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x04ef, code lost:
        r25 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x04f2, code lost:
        er1.C58784w3.m68429F1(r21, r10, r23, 0, r25, 4, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x04fd, code lost:
        r12 = r0;
        r14 = r4;
        r15 = r5;
        r16 = r6;
        r12.setOnClickListener(new ve1.C14709z4(r4, r2, r12, r28, r35, r34));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0514, code lost:
        r4 = r14;
        r5 = r15;
        r6 = r16;
        r2 = r20;
        r1 = 0;
        r15 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x051f, code lost:
        sx3.C64197v.m75542k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0523, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0524, code lost:
        r14 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x052c, code lost:
        if (r14.mo13666a() != 0) goto L_0x0573;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x052e, code lost:
        r0 = new k20.C9556a();
        r1 = k20.C60958c.f173611a;
        r0.mo10233c(8);
        j20.C117292a.m165358d(r36, r0.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderMixLbsSectionFeedConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseMixFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r1 = r36;
        r1.setVisibility(((java.lang.Integer) r0.mo10231a(0)).intValue());
        j20.C117292a.m165359e(r1, "com/tencent/mm/plugin/finder/convert/FinderMixLbsSectionFeedConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseMixFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0573, code lost:
        r8.mo85812D(com.tencent.p014mm.C0966R.C0970id.j7r).setOnClickListener(new ve1.C14458a5(r14, r8, r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x00c2, code lost:
        r36 = r15;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r35, jq3.C9493c r36, int r37, int r38, boolean r39, java.util.List r40) {
        /*
            r34 = this;
            r7 = r34
            r8 = r35
            r0 = r36
            cm1.c r0 = (cm1.C0716c) r0
            pl1.e0$a r9 = pl1.C11978e0.C11979a.TIMELINE
            up1.y r17 = up1.C27696y.THUMB_IMAGE
            java.lang.Class<pl1.s0> r6 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r5 = ht1.C60200t1.class
            java.lang.String r1 = "holder"
            gy3.C87412m.m108594g(r8, r1)
            java.lang.String r1 = "item"
            gy3.C87412m.m108594g(r0, r1)
            up1.a0 r0 = r0.f1724d
            up1.s r4 = r0.f39807b
            if (r4 != 0) goto L_0x0022
            goto L_0x0582
        L_0x0022:
            r0 = 2131313000(0x7f094168, float:1.8244384E38)
            android.view.View r0 = r8.mo85812D(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1 = 2131313013(0x7f094175, float:1.824441E38)
            android.view.View r1 = r8.mo85812D(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = 2131313012(0x7f094174, float:1.8244409E38)
            android.view.View r2 = r8.mo85812D(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3 = 2131312998(0x7f094166, float:1.824438E38)
            android.view.View r3 = r8.mo85812D(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r10 = 2131313011(0x7f094173, float:1.8244407E38)
            android.view.View r15 = r8.mo85812D(r10)
            java.lang.String r10 = "iconIv"
            gy3.C87412m.m108593f(r0, r10)
            r14 = 0
            r0.setVisibility(r14)
            te3.kk1 r10 = r4.mo13668c()
            int r10 = r10.f136854o
            r11 = 2131099712(0x7f060040, float:1.7811785E38)
            java.lang.String r18 = ""
            r13 = 8
            switch(r10) {
                case 1: goto L_0x016d;
                case 2: goto L_0x0156;
                case 3: goto L_0x013f;
                case 4: goto L_0x00c6;
                case 5: goto L_0x00ae;
                case 6: goto L_0x0099;
                case 7: goto L_0x0084;
                case 8: goto L_0x0066;
                case 9: goto L_0x006f;
                default: goto L_0x0066;
            }
        L_0x0066:
            r36 = r15
            r15 = 8
            r0.setVisibility(r15)
            goto L_0x0185
        L_0x006f:
            android.content.Context r10 = r8.f173499A
            r12 = 2131756105(0x7f100449, float:1.9143108E38)
            android.content.res.Resources r14 = r10.getResources()
            int r11 = r14.getColor(r11)
            android.graphics.drawable.Drawable r10 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r10, r12, r11)
            r0.setImageDrawable(r10)
            goto L_0x00c2
        L_0x0084:
            android.content.Context r10 = r8.f173499A
            r12 = 2131755648(0x7f100280, float:1.9142181E38)
            android.content.res.Resources r14 = r10.getResources()
            int r11 = r14.getColor(r11)
            android.graphics.drawable.Drawable r10 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r10, r12, r11)
            r0.setImageDrawable(r10)
            goto L_0x00c2
        L_0x0099:
            android.content.Context r10 = r8.f173499A
            r12 = 2131755656(0x7f100288, float:1.9142197E38)
            android.content.res.Resources r14 = r10.getResources()
            int r11 = r14.getColor(r11)
            android.graphics.drawable.Drawable r10 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r10, r12, r11)
            r0.setImageDrawable(r10)
            goto L_0x00c2
        L_0x00ae:
            android.content.Context r10 = r8.f173499A
            r12 = 2131755658(0x7f10028a, float:1.9142201E38)
            android.content.res.Resources r14 = r10.getResources()
            int r11 = r14.getColor(r11)
            android.graphics.drawable.Drawable r10 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r10, r12, r11)
            r0.setImageDrawable(r10)
        L_0x00c2:
            r36 = r15
            goto L_0x0183
        L_0x00c6:
            boolean r10 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            if (r10 == 0) goto L_0x00d5
            te3.kk1 r10 = r4.mo13668c()
            java.lang.String r10 = r10.f136853n
            if (r10 != 0) goto L_0x00df
            goto L_0x00dd
        L_0x00d5:
            te3.kk1 r10 = r4.mo13668c()
            java.lang.String r10 = r10.f136852j
            if (r10 != 0) goto L_0x00df
        L_0x00dd:
            r10 = r18
        L_0x00df:
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r11 == 0) goto L_0x00ea
            r0.setVisibility(r13)
            r14 = 0
            goto L_0x00ee
        L_0x00ea:
            r14 = 0
            r0.setVisibility(r14)
        L_0x00ee:
            te3.rq2 r11 = new te3.rq2
            r11.<init>()
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r10)
            r11.f185275p = r12
            r11.f185266d = r10
            r11.f185267e = r10
            er1.w3 r12 = er1.C58784w3.f168295a
            java.lang.String r10 = r12.mo83984z1(r10)
            r11.f185285x0 = r10
            r11.f185287y0 = r10
            pl1.b0 r12 = new pl1.b0
            r16 = 0
            r19 = 0
            r20 = 12
            r21 = 0
            r10 = r12
            r26 = r12
            r12 = r17
            r13 = r16
            r14 = r19
            r36 = r15
            r15 = r20
            r16 = r21
            r10.<init>(r11, r12, r13, r14, r15, r16)
            bl3.r r10 = bl3.C39818r.f106831a
            bl3.r$a r10 = r10.mo62446e(r5)
            bl3.c r10 = r10.mo62447c(r6)
            pl1.s0 r10 = (pl1.C11990s0) r10
            k60.d r10 = r10.mo11871f2()
            r11 = r26
            l60.b r10 = r10.mo85955a(r11)
            l60.a r10 = (l60.C99342a) r10
            r10.mo85954d(r0)
            goto L_0x0183
        L_0x013f:
            r36 = r15
            android.content.Context r10 = r8.f173499A
            r12 = 2131755628(0x7f10026c, float:1.914214E38)
            android.content.res.Resources r13 = r10.getResources()
            int r11 = r13.getColor(r11)
            android.graphics.drawable.Drawable r10 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r10, r12, r11)
            r0.setImageDrawable(r10)
            goto L_0x0183
        L_0x0156:
            r36 = r15
            android.content.Context r10 = r8.f173499A
            r12 = 2131756073(0x7f100429, float:1.9143043E38)
            android.content.res.Resources r13 = r10.getResources()
            int r11 = r13.getColor(r11)
            android.graphics.drawable.Drawable r10 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r10, r12, r11)
            r0.setImageDrawable(r10)
            goto L_0x0183
        L_0x016d:
            r36 = r15
            android.content.Context r10 = r8.f173499A
            r12 = 2131756079(0x7f10042f, float:1.9143055E38)
            android.content.res.Resources r13 = r10.getResources()
            int r11 = r13.getColor(r11)
            android.graphics.drawable.Drawable r10 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r10, r12, r11)
            r0.setImageDrawable(r10)
        L_0x0183:
            r15 = 8
        L_0x0185:
            android.text.TextPaint r0 = r1.getPaint()
            r10 = 1061997773(0x3f4ccccd, float:0.8)
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r0, r10)
            java.lang.Class<ny.h> r0 = p629ny.C76979h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ny.h r0 = (p629ny.C76979h) r0
            android.content.Context r10 = r8.f173499A
            java.lang.String r11 = r4.mo13669d()
            android.text.SpannableString r0 = r0.mo107057T1(r10, r11)
            r1.setText(r0)
            te3.kk1 r0 = r4.mo13668c()
            java.lang.String r0 = r0.f136851i
            if (r0 != 0) goto L_0x01ae
            r0 = r18
        L_0x01ae:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x01b9
            r2.setVisibility(r15)
            r1 = 0
            goto L_0x01ca
        L_0x01b9:
            r1 = 0
            r2.setVisibility(r1)
            te3.kk1 r0 = r4.mo13668c()
            java.lang.String r0 = r0.f136851i
            if (r0 != 0) goto L_0x01c7
            r0 = r18
        L_0x01c7:
            r2.setText(r0)
        L_0x01ca:
            te3.kk1 r0 = r4.mo13668c()
            java.lang.String r0 = r0.f136848f
            if (r0 != 0) goto L_0x01d4
            r0 = r18
        L_0x01d4:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x01de
            r3.setVisibility(r15)
            goto L_0x01ee
        L_0x01de:
            r3.setVisibility(r1)
            te3.kk1 r0 = r4.mo13668c()
            java.lang.String r0 = r0.f136848f
            if (r0 != 0) goto L_0x01eb
            r0 = r18
        L_0x01eb:
            r3.setText(r0)
        L_0x01ee:
            if (r39 != 0) goto L_0x0524
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.clear()
            r2 = 2131313006(0x7f09416e, float:1.8244397E38)
            android.view.View r2 = r8.mo85812D(r2)
            java.lang.String r3 = "holder.getView(R.id.section_item_bottom_feed_1)"
            gy3.C87412m.m108593f(r2, r3)
            r0.add(r2)
            r2 = 2131313007(0x7f09416f, float:1.8244399E38)
            android.view.View r2 = r8.mo85812D(r2)
            java.lang.String r3 = "holder.getView(R.id.section_item_bottom_feed_2)"
            gy3.C87412m.m108593f(r2, r3)
            r0.add(r2)
            r2 = 2131313008(0x7f094170, float:1.82444E38)
            android.view.View r2 = r8.mo85812D(r2)
            java.lang.String r3 = "holder.getView(R.id.section_item_bottom_feed_3)"
            gy3.C87412m.m108593f(r2, r3)
            r0.add(r2)
            android.content.Context r2 = r8.f173499A
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.content.Context r3 = r8.f173499A
            r10 = 32
            int r3 = kg3.C76577a.m92151b(r3, r10)
            int r2 = r2 - r3
            int r2 = r2 / 3
            float r3 = (float) r2
            float r10 = r7.f40111f
            float r3 = r3 * r10
            int r3 = (int) r3
            java.util.Iterator r10 = r0.iterator()
        L_0x0246:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x029f
            java.lang.Object r11 = r10.next()
            android.view.View r11 = (android.view.View) r11
            android.view.ViewGroup$LayoutParams r12 = r11.getLayoutParams()
            r12.width = r2
            r12.height = r3
            r11.setLayoutParams(r12)
            k20.a r12 = new k20.a
            r12.<init>()
            java.lang.ThreadLocal<k20.a> r13 = k20.C60958c.f173611a
            java.lang.Integer r13 = java.lang.Integer.valueOf(r15)
            r12.mo10233c(r13)
            java.lang.Object[] r20 = r12.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/finder/convert/FinderMixLbsSectionFeedConvert"
            java.lang.String r22 = "onBindViewHolder"
            java.lang.String r23 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseMixFeed;IIZLjava/util/List;)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r11
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.Object r12 = r12.mo10231a(r1)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r11.setVisibility(r12)
            java.lang.String r20 = "com/tencent/mm/plugin/finder/convert/FinderMixLbsSectionFeedConvert"
            java.lang.String r21 = "onBindViewHolder"
            java.lang.String r22 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseMixFeed;IIZLjava/util/List;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
            goto L_0x0246
        L_0x029f:
            java.util.Iterator r19 = r0.iterator()
            r2 = 0
        L_0x02a4:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x0524
            java.lang.Object r0 = r19.next()
            int r20 = r2 + 1
            if (r2 < 0) goto L_0x051f
            android.view.View r0 = (android.view.View) r0
            java.util.LinkedList<com.tencent.mm.plugin.finder.model.BaseFinderFeed> r10 = r4.f39920b
            int r10 = r10.size()
            if (r2 < r10) goto L_0x0306
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r15)
            r2.mo10233c(r3)
            java.lang.Object[] r22 = r2.mo10232b()
            java.lang.String r23 = "com/tencent/mm/plugin/finder/convert/FinderMixLbsSectionFeedConvert"
            java.lang.String r24 = "onBindViewHolder"
            java.lang.String r25 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseMixFeed;IIZLjava/util/List;)V"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            r21 = r0
            j20.C117292a.m165358d(r21, r22, r23, r24, r25, r26, r27, r28)
            java.lang.Object r2 = r2.mo10231a(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r22 = "com/tencent/mm/plugin/finder/convert/FinderMixLbsSectionFeedConvert"
            java.lang.String r23 = "onBindViewHolder"
            java.lang.String r24 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseMixFeed;IIZLjava/util/List;)V"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            j20.C117292a.m165359e(r21, r22, r23, r24, r25, r26, r27)
            r14 = r4
            r15 = r5
            r16 = r6
            r11 = 8
            r13 = 0
            goto L_0x0514
        L_0x0306:
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            r10.mo10233c(r11)
            java.lang.Object[] r22 = r10.mo10232b()
            java.lang.String r23 = "com/tencent/mm/plugin/finder/convert/FinderMixLbsSectionFeedConvert"
            java.lang.String r24 = "onBindViewHolder"
            java.lang.String r25 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseMixFeed;IIZLjava/util/List;)V"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            r21 = r0
            j20.C117292a.m165358d(r21, r22, r23, r24, r25, r26, r27, r28)
            java.lang.Object r10 = r10.mo10231a(r1)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r0.setVisibility(r10)
            java.lang.String r22 = "com/tencent/mm/plugin/finder/convert/FinderMixLbsSectionFeedConvert"
            java.lang.String r23 = "onBindViewHolder"
            java.lang.String r24 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseMixFeed;IIZLjava/util/List;)V"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            j20.C117292a.m165359e(r21, r22, r23, r24, r25, r26, r27)
            r10 = 2131313010(0x7f094172, float:1.8244405E38)
            android.view.View r10 = r0.findViewById(r10)
            r14 = r10
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            r10 = 2131313002(0x7f09416a, float:1.8244388E38)
            android.view.View r10 = r0.findViewById(r10)
            r13 = r10
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            r10 = 2131313009(0x7f094171, float:1.8244403E38)
            android.view.View r10 = r0.findViewById(r10)
            r12 = r10
            android.widget.TextView r12 = (android.widget.TextView) r12
            r10 = 2131313001(0x7f094169, float:1.8244386E38)
            android.view.View r10 = r0.findViewById(r10)
            r11 = r10
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            java.util.LinkedList<com.tencent.mm.plugin.finder.model.BaseFinderFeed> r10 = r4.f39920b
            java.lang.Object r10 = r10.get(r2)
            java.lang.String r15 = "lbsItem.feedList[index]"
            gy3.C87412m.m108593f(r10, r15)
            r28 = r10
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r28 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r28
            com.tencent.mm.plugin.finder.storage.FinderItem r10 = r28.mo3513o()
            java.util.LinkedList r10 = r10.getMediaList()
            java.lang.Object r10 = sx3.C110818d0.m150916N(r10)
            r15 = r10
            te3.rq2 r15 = (te3.C64689rq2) r15
            r10 = 2131099724(0x7f06004c, float:1.781181E38)
            r14.setImageResource(r10)
            if (r15 == 0) goto L_0x046e
            int r10 = r15.f185268f
            r1 = 4
            if (r10 != r1) goto L_0x0423
            java.lang.String r1 = r15.f185283w
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x03e9
            pl1.b0 r1 = new pl1.b0
            r16 = 0
            r21 = 0
            r22 = 12
            r23 = 0
            r3 = 2131099724(0x7f06004c, float:1.781181E38)
            r10 = r1
            r29 = r11
            r11 = r15
            r15 = r12
            r12 = r17
            r30 = r13
            r13 = r16
            r3 = r14
            r14 = r21
            r31 = r15
            r15 = r22
            r16 = r23
            r10.<init>(r11, r12, r13, r14, r15, r16)
            bl3.r r10 = bl3.C39818r.f106831a
            bl3.r$a r11 = r10.mo62446e(r5)
            bl3.c r11 = r11.mo62447c(r6)
            pl1.s0 r11 = (pl1.C11990s0) r11
            k60.d r11 = r11.mo11871f2()
            bl3.r$a r10 = r10.mo62446e(r5)
            bl3.c r10 = r10.mo62447c(r6)
            pl1.s0 r10 = (pl1.C11990s0) r10
            n60.f r10 = r10.mo11867O2(r9)
            r11.mo85957c(r1, r3, r10)
            goto L_0x0474
        L_0x03e9:
            r29 = r11
            r31 = r12
            r30 = r13
            r3 = r14
            pl1.o0 r1 = new pl1.o0
            up1.y r23 = up1.C27696y.RAW_IMAGE
            r24 = 0
            r25 = 4
            r26 = 0
            r21 = r1
            r22 = r15
            r21.<init>(r22, r23, r24, r25, r26)
            bl3.r r10 = bl3.C39818r.f106831a
            bl3.r$a r11 = r10.mo62446e(r5)
            bl3.c r11 = r11.mo62447c(r6)
            pl1.s0 r11 = (pl1.C11990s0) r11
            k60.d r11 = r11.mo11871f2()
            bl3.r$a r10 = r10.mo62446e(r5)
            bl3.c r10 = r10.mo62447c(r6)
            pl1.s0 r10 = (pl1.C11990s0) r10
            n60.f r10 = r10.mo11867O2(r9)
            r11.mo85957c(r1, r3, r10)
            goto L_0x0474
        L_0x0423:
            r29 = r11
            r31 = r12
            r30 = r13
            r3 = r14
            bl3.r r1 = bl3.C39818r.f106831a
            bl3.r$a r10 = r1.mo62446e(r5)
            bl3.c r10 = r10.mo62447c(r6)
            pl1.s0 r10 = (pl1.C11990s0) r10
            k60.d r14 = r10.mo11871f2()
            pl1.b0 r13 = new pl1.b0
            r16 = 0
            r21 = 0
            r22 = 12
            r23 = 0
            r10 = r13
            r11 = r15
            r12 = r17
            r15 = r13
            r13 = r16
            r32 = r14
            r14 = r21
            r33 = r15
            r15 = r22
            r16 = r23
            r10.<init>(r11, r12, r13, r14, r15, r16)
            bl3.r$a r1 = r1.mo62446e(r5)
            bl3.c r1 = r1.mo62447c(r6)
            pl1.s0 r1 = (pl1.C11990s0) r1
            n60.f r1 = r1.mo11867O2(r9)
            r10 = r32
            r11 = r33
            r10.mo85957c(r11, r3, r1)
            goto L_0x0474
        L_0x046e:
            r29 = r11
            r31 = r12
            r30 = r13
        L_0x0474:
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r28.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderContact r1 = r1.contact
            r10 = r30
            r3 = 2131099724(0x7f06004c, float:1.781181E38)
            r10.setImageResource(r3)
            bl3.r r3 = bl3.C39818r.f106831a
            bl3.r$a r11 = r3.mo62446e(r5)
            bl3.c r11 = r11.mo62447c(r6)
            pl1.s0 r11 = (pl1.C11990s0) r11
            k60.d r11 = r11.mo11872i2()
            pl1.f r12 = new pl1.f
            if (r1 == 0) goto L_0x049e
            java.lang.String r13 = r1.headUrl
            if (r13 != 0) goto L_0x04a0
        L_0x049e:
            r13 = r18
        L_0x04a0:
            r14 = 2
            r15 = 0
            r12.<init>(r13, r15, r14, r15)
            pl1.e0$a r13 = pl1.C11978e0.C11979a.AVATAR
            bl3.r$a r3 = r3.mo62446e(r5)
            bl3.c r3 = r3.mo62447c(r6)
            pl1.s0 r3 = (pl1.C11990s0) r3
            n60.f r3 = r3.mo11867O2(r13)
            r11.mo85957c(r12, r10, r3)
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r28.mo3513o()
            android.text.SpannableString r3 = r3.getNickNameSpan()
            if (r3 == 0) goto L_0x04c3
            goto L_0x04c5
        L_0x04c3:
            r3 = r18
        L_0x04c5:
            r10 = r31
            r10.setText(r3)
            java.lang.String r3 = "authIcon"
            r10 = r29
            gy3.C87412m.m108593f(r10, r3)
            r11 = 8
            r10.setVisibility(r11)
            if (r1 == 0) goto L_0x04dd
            com.tencent.mm.protocal.protobuf.FinderAuthInfo r3 = r1.authInfo
            r23 = r3
            goto L_0x04df
        L_0x04dd:
            r23 = 0
        L_0x04df:
            if (r23 == 0) goto L_0x04fc
            er1.w3 r21 = er1.C58784w3.f168295a
            r24 = 0
            if (r1 == 0) goto L_0x04ef
            r3 = 0
            te3.cg r1 = fe1.C58960c.m68829a(r1, r3)
            r25 = r1
            goto L_0x04f2
        L_0x04ef:
            r3 = 0
            r25 = 0
        L_0x04f2:
            r26 = 4
            r27 = 0
            r22 = r10
            er1.C58784w3.m68429F1(r21, r22, r23, r24, r25, r26, r27)
            goto L_0x04fd
        L_0x04fc:
            r3 = 0
        L_0x04fd:
            ve1.z4 r10 = new ve1.z4
            r12 = r0
            r0 = r10
            r13 = 0
            r1 = r4
            r3 = r12
            r14 = r4
            r4 = r28
            r15 = r5
            r5 = r35
            r16 = r6
            r6 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r12.setOnClickListener(r10)
        L_0x0514:
            r4 = r14
            r5 = r15
            r6 = r16
            r2 = r20
            r1 = 0
            r15 = 8
            goto L_0x02a4
        L_0x051f:
            sx3.C64197v.m75542k()
            r0 = 0
            throw r0
        L_0x0524:
            r14 = r4
            r11 = 8
            r13 = 0
            int r0 = r14.mo13666a()
            if (r0 != 0) goto L_0x0573
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r0.mo10233c(r1)
            java.lang.Object[] r19 = r0.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/finder/convert/FinderMixLbsSectionFeedConvert"
            java.lang.String r21 = "onBindViewHolder"
            java.lang.String r22 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseMixFeed;IIZLjava/util/List;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r36
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.Object r0 = r0.mo10231a(r13)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1 = r36
            r1.setVisibility(r0)
            java.lang.String r19 = "com/tencent/mm/plugin/finder/convert/FinderMixLbsSectionFeedConvert"
            java.lang.String r20 = "onBindViewHolder"
            java.lang.String r21 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseMixFeed;IIZLjava/util/List;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r18 = r1
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
        L_0x0573:
            r0 = 2131312999(0x7f094167, float:1.8244382E38)
            android.view.View r0 = r8.mo85812D(r0)
            ve1.a5 r1 = new ve1.a5
            r1.<init>(r14, r8, r7)
            r0.setOnClickListener(r1)
        L_0x0582:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ve1.C14470b5.mo44e(jq3.o, jq3.c, int, int, boolean, java.util.List):void");
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
