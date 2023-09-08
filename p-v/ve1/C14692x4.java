package ve1;

import cm1.C55018j0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.C2829n;
import gy3.C87412m;
import jq3.C60896i;

/* renamed from: ve1.x4 */
public final class C14692x4 extends C60896i<C55018j0> {

    /* renamed from: e */
    public final C2829n f40637e;

    public C14692x4(C2829n nVar) {
        C87412m.m108594g(nVar, "contract");
        this.f40637e = nVar;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.cyv;
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x02b8  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x02bb  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x02cc  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0320  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0335  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r25, jq3.C9493c r26, int r27, int r28, boolean r29, java.util.List r30) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r27
            r3 = r26
            cm1.j0 r3 = (cm1.C55018j0) r3
            pl1.e0$a r4 = pl1.C11978e0.C11979a.COMMON
            up1.y r11 = up1.C27696y.RAW_IMAGE
            java.lang.Class<pl1.s0> r12 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r13 = ht1.C60200t1.class
            java.lang.String r5 = "holder"
            gy3.C87412m.m108594g(r1, r5)
            java.lang.String r5 = "item"
            gy3.C87412m.m108594g(r3, r5)
            r5 = 2131308188(0x7f092e9c, float:1.8234625E38)
            android.view.View r5 = r1.mo85812D(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r3.mo3513o()
            android.text.SpannableString r6 = r6.getNickNameSpan()
            r5.setText(r6)
            r5 = 2131308185(0x7f092e99, float:1.8234618E38)
            android.view.View r5 = r1.mo85812D(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r3.mo3513o()
            int r6 = r6.getLikeCount()
            if (r6 <= 0) goto L_0x0051
            r6 = 2
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r3.mo3513o()
            int r7 = r7.getLikeCount()
            java.lang.String r6 = er1.C7878t0.m8034c(r6, r7)
            goto L_0x0053
        L_0x0051:
            java.lang.String r6 = "0"
        L_0x0053:
            r5.setText(r6)
            r5 = 2131308174(0x7f092e8e, float:1.8234596E38)
            android.view.View r5 = r1.mo85812D(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r3.mo3513o()
            android.text.SpannableString r6 = r6.getFlowCardDescSpan()
            r15 = 0
            if (r6 == 0) goto L_0x0073
            int r6 = r6.length()
            if (r6 != 0) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            r6 = 0
            goto L_0x0074
        L_0x0073:
            r6 = 1
        L_0x0074:
            java.lang.String r10 = ""
            r9 = 8
            if (r6 != 0) goto L_0x0089
            r5.setVisibility(r15)
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r3.mo3513o()
            android.text.SpannableString r6 = r6.getFlowCardDescSpan()
            r5.setText(r6)
            goto L_0x00ac
        L_0x0089:
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r3.mo3513o()
            java.lang.String r6 = r6.getDescription()
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x00a6
            r5.setVisibility(r15)
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r3.mo3513o()
            android.text.SpannableString r6 = r6.getDescriptionSpan()
            r5.setText(r6)
            goto L_0x00ac
        L_0x00a6:
            r5.setVisibility(r9)
            r5.setText(r10)
        L_0x00ac:
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r3.mo3513o()
            java.util.LinkedList r5 = r5.getMediaList()
            java.lang.Object r5 = sx3.C110818d0.m150914L(r5)
            r6 = r5
            te3.rq2 r6 = (te3.C64689rq2) r6
            r5 = 2131308172(0x7f092e8c, float:1.8234592E38)
            android.view.View r5 = r1.mo85812D(r5)
            r8 = r5
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            if (r8 == 0) goto L_0x01dc
            java.lang.String r5 = r6.f185261W
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            java.lang.String r7 = ", feedId="
            java.lang.String r9 = "FinderLongVideoRecommendConvert"
            if (r5 != 0) goto L_0x012c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r14 = "onBindViewHolder: use full cover url, position="
            r5.append(r14)
            r5.append(r2)
            r5.append(r7)
            long r16 = r3.getItemId()
            java.lang.String r7 = o40.C61926c.m72691p(r16)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r5)
            pl1.q0 r14 = new pl1.q0
            r9 = 0
            r16 = 4
            r17 = 0
            r5 = r14
            r7 = r11
            r15 = r8
            r8 = r9
            r9 = r16
            r23 = r10
            r10 = r17
            r5.<init>(r6, r7, r8, r9, r10)
            bl3.r r5 = bl3.C39818r.f106831a
            bl3.r$a r6 = r5.mo62446e(r13)
            bl3.c r6 = r6.mo62447c(r12)
            pl1.s0 r6 = (pl1.C11990s0) r6
            k60.d r6 = r6.mo11871f2()
            bl3.r$a r5 = r5.mo62446e(r13)
            bl3.c r5 = r5.mo62447c(r12)
            pl1.s0 r5 = (pl1.C11990s0) r5
            n60.f r4 = r5.mo11867O2(r4)
            r6.mo85957c(r14, r15, r4)
            goto L_0x01de
        L_0x012c:
            r15 = r8
            r23 = r10
            java.lang.String r5 = r6.f185283w
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x0185
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "onBindViewHolder: use cover url, position="
            r5.append(r8)
            r5.append(r2)
            r5.append(r7)
            long r7 = r3.getItemId()
            java.lang.String r7 = o40.C61926c.m72691p(r7)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r5)
            pl1.o0 r14 = new pl1.o0
            r8 = 0
            r9 = 4
            r10 = 0
            r5 = r14
            r7 = r11
            r5.<init>(r6, r7, r8, r9, r10)
            bl3.r r5 = bl3.C39818r.f106831a
            bl3.r$a r6 = r5.mo62446e(r13)
            bl3.c r6 = r6.mo62447c(r12)
            pl1.s0 r6 = (pl1.C11990s0) r6
            k60.d r6 = r6.mo11871f2()
            bl3.r$a r5 = r5.mo62446e(r13)
            bl3.c r5 = r5.mo62447c(r12)
            pl1.s0 r5 = (pl1.C11990s0) r5
            n60.f r4 = r5.mo11867O2(r4)
            r6.mo85957c(r14, r15, r4)
            goto L_0x01de
        L_0x0185:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "onBindViewHolder: use thumb url, position="
            r5.append(r8)
            r5.append(r2)
            r5.append(r7)
            long r7 = r3.getItemId()
            java.lang.String r7 = o40.C61926c.m72691p(r7)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r5)
            pl1.b0 r5 = new pl1.b0
            up1.y r18 = up1.C27696y.THUMB_IMAGE
            r19 = 0
            r20 = 0
            r21 = 12
            r22 = 0
            r16 = r5
            r17 = r6
            r16.<init>(r17, r18, r19, r20, r21, r22)
            bl3.r r6 = bl3.C39818r.f106831a
            bl3.r$a r7 = r6.mo62446e(r13)
            bl3.c r7 = r7.mo62447c(r12)
            pl1.s0 r7 = (pl1.C11990s0) r7
            k60.d r7 = r7.mo11871f2()
            bl3.r$a r6 = r6.mo62446e(r13)
            bl3.c r6 = r6.mo62447c(r12)
            pl1.s0 r6 = (pl1.C11990s0) r6
            n60.f r4 = r6.mo11867O2(r4)
            r7.mo85957c(r5, r15, r4)
            goto L_0x01de
        L_0x01dc:
            r23 = r10
        L_0x01de:
            r4 = 2131308180(0x7f092e94, float:1.8234608E38)
            android.view.View r4 = r1.mo85812D(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r3.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r5 = r5.getFeedObject()
            te3.ek1 r5 = r5.flow_card_recommand_reason
            if (r5 == 0) goto L_0x01f7
            java.lang.String r10 = r5.f132981d
            if (r10 != 0) goto L_0x01f9
        L_0x01f7:
            r10 = r23
        L_0x01f9:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r5 != 0) goto L_0x0209
            r4.setText(r10)
            r5 = 0
            r4.setVisibility(r5)
            r6 = 8
            goto L_0x020f
        L_0x0209:
            r5 = 0
            r6 = 8
            r4.setVisibility(r6)
        L_0x020f:
            r4 = 2131308184(0x7f092e98, float:1.8234616E38)
            android.view.View r4 = r1.mo85812D(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r4.setVisibility(r5)
            wp1.j r5 = wp1.C15587j.f42215a
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r3.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r7 = r7.getFeedObject()
            int r7 = r7.objectType
            te3.if1 r5 = r5.mo14351c(r7)
            r7 = 2131099940(0x7f060124, float:1.7812247E38)
            if (r5 == 0) goto L_0x0277
            java.lang.String r8 = r5.f135279y
            if (r8 == 0) goto L_0x023d
            int r8 = r8.length()
            if (r8 != 0) goto L_0x023b
            goto L_0x023d
        L_0x023b:
            r8 = 0
            goto L_0x023e
        L_0x023d:
            r8 = 1
        L_0x023e:
            if (r8 == 0) goto L_0x0241
            goto L_0x0277
        L_0x0241:
            bl3.r r8 = bl3.C39818r.f106831a
            bl3.r$a r9 = r8.mo62446e(r13)
            bl3.c r9 = r9.mo62447c(r12)
            pl1.s0 r9 = (pl1.C11990s0) r9
            k60.d r9 = r9.mo11871f2()
            pl1.n0 r10 = new pl1.n0
            java.lang.String r5 = r5.f135279y
            r10.<init>(r5, r11)
            pl1.e0$a r5 = pl1.C11978e0.C11979a.TIMELINE
            bl3.r$a r8 = r8.mo62446e(r13)
            bl3.c r8 = r8.mo62447c(r12)
            pl1.s0 r8 = (pl1.C11990s0) r8
            n60.f r5 = r8.mo11867O2(r5)
            r9.mo85957c(r10, r4, r5)
            android.content.Context r5 = r1.f173499A
            int r5 = kg3.C76577a.m92153d(r5, r7)
            android.graphics.PorterDuff$Mode r7 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r4.setColorFilter(r5, r7)
            goto L_0x029d
        L_0x0277:
            er1.w3 r5 = er1.C58784w3.f168295a
            r8 = 1
            java.lang.Integer r5 = r5.mo83917b0(r8, r8)
            if (r5 == 0) goto L_0x0285
            int r5 = r5.intValue()
            goto L_0x0288
        L_0x0285:
            r5 = 2131756066(0x7f100422, float:1.914303E38)
        L_0x0288:
            android.content.Context r8 = r1.f173499A
            android.content.res.Resources r9 = r8.getResources()
            int r7 = r9.getColor(r7)
            android.graphics.drawable.Drawable r5 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r8, r5, r7)
            r4.setImageDrawable(r5)
            r5 = 0
            r4.setEnabled(r5)
        L_0x029d:
            com.tencent.mm.plugin.finder.storage.FeedData$a r4 = com.tencent.p014mm.plugin.finder.storage.FeedData.Companion
            com.tencent.mm.plugin.finder.storage.FeedData r3 = r4.mo78883a(r3)
            r4 = 2131308175(0x7f092e8f, float:1.8234598E38)
            android.view.View r4 = r1.mo85812D(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.util.LinkedList r3 = r3.getMediaList()
            java.lang.Object r3 = sx3.C110818d0.m150916N(r3)
            te3.rq2 r3 = (te3.C64689rq2) r3
            if (r3 == 0) goto L_0x02bb
            int r5 = r3.f185269g
            goto L_0x02bc
        L_0x02bb:
            r5 = 0
        L_0x02bc:
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.formatSecToMin(r5)
            r4.setText(r3)
            r3 = 2131308182(0x7f092e96, float:1.8234612E38)
            android.view.View r3 = r1.mo85812D(r3)
            if (r3 == 0) goto L_0x0317
            com.tencent.mm.plugin.finder.feed.n r4 = r0.f40637e
            int r4 = r4.f14123s
            if (r2 != r4) goto L_0x02d4
            r9 = 0
            goto L_0x02d6
        L_0x02d4:
            r9 = 8
        L_0x02d6:
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            r4.mo10233c(r5)
            java.lang.Object[] r8 = r4.mo10232b()
            java.lang.String r9 = "com/tencent/mm/plugin/finder/convert/FinderLongVideoRecommendConvert"
            java.lang.String r10 = "onBindViewHolder"
            java.lang.String r11 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;IIZLjava/util/List;)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            r7 = r3
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            r5 = 0
            java.lang.Object r4 = r4.mo10231a(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.setVisibility(r4)
            java.lang.String r8 = "com/tencent/mm/plugin/finder/convert/FinderLongVideoRecommendConvert"
            java.lang.String r9 = "onBindViewHolder"
            java.lang.String r10 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;IIZLjava/util/List;)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
        L_0x0317:
            com.tencent.mm.plugin.finder.feed.n r3 = r0.f40637e
            int r3 = r3.f14123s
            r4 = 2131308193(0x7f092ea1, float:1.8234635E38)
            if (r2 != r3) goto L_0x0335
            android.view.View r2 = r1.mo85812D(r4)
            android.content.Context r1 = r1.f173499A
            android.content.res.Resources r1 = r1.getResources()
            r3 = 2131099651(0x7f060003, float:1.7811661E38)
            int r1 = r1.getColor(r3)
            r2.setBackgroundColor(r1)
            goto L_0x033d
        L_0x0335:
            android.view.View r1 = r1.mo85812D(r4)
            r2 = 0
            r1.setBackground(r2)
        L_0x033d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ve1.C14692x4.mo44e(jq3.o, jq3.c, int, int, boolean, java.util.List):void");
    }
}
