package ve1;

import cm1.C55018j0;
import com.tencent.p014mm.C0966R;
import jq3.C60896i;

/* renamed from: ve1.p6 */
public final class C14603p6 extends C60896i<C55018j0> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.bgo;
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x02bd  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r24, jq3.C9493c r25, int r26, int r27, boolean r28, java.util.List r29) {
        /*
            r23 = this;
            r0 = r24
            r1 = r26
            r2 = r25
            cm1.j0 r2 = (cm1.C55018j0) r2
            pl1.e0$a r3 = pl1.C11978e0.C11979a.COMMON
            up1.y r10 = up1.C27696y.RAW_IMAGE
            java.lang.Class<pl1.s0> r11 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r12 = ht1.C60200t1.class
            java.lang.String r4 = "holder"
            gy3.C87412m.m108594g(r0, r4)
            java.lang.String r4 = "item"
            gy3.C87412m.m108594g(r2, r4)
            r4 = 2131308188(0x7f092e9c, float:1.8234625E38)
            android.view.View r4 = r0.mo85812D(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r2.mo3513o()
            android.text.SpannableString r5 = r5.getNickNameSpan()
            r4.setText(r5)
            r4 = 2131308185(0x7f092e99, float:1.8234618E38)
            android.view.View r4 = r0.mo85812D(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r2.mo3513o()
            int r5 = r5.getLikeCount()
            r13 = 2
            if (r5 <= 0) goto L_0x004f
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r2.mo3513o()
            int r5 = r5.getLikeCount()
            java.lang.String r5 = er1.C7878t0.m8034c(r13, r5)
            goto L_0x0051
        L_0x004f:
            java.lang.String r5 = "0"
        L_0x0051:
            r4.setText(r5)
            r4 = 2131308174(0x7f092e8e, float:1.8234596E38)
            android.view.View r4 = r0.mo85812D(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r2.mo3513o()
            android.text.SpannableString r5 = r5.getFlowCardDescSpan()
            r15 = 0
            if (r5 == 0) goto L_0x0071
            int r5 = r5.length()
            if (r5 != 0) goto L_0x006f
            goto L_0x0071
        L_0x006f:
            r5 = 0
            goto L_0x0072
        L_0x0071:
            r5 = 1
        L_0x0072:
            java.lang.String r9 = ""
            r8 = 8
            if (r5 != 0) goto L_0x0087
            r4.setVisibility(r15)
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r2.mo3513o()
            android.text.SpannableString r5 = r5.getFlowCardDescSpan()
            r4.setText(r5)
            goto L_0x00aa
        L_0x0087:
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r2.mo3513o()
            java.lang.String r5 = r5.getDescription()
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x00a4
            r4.setVisibility(r15)
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r2.mo3513o()
            android.text.SpannableString r5 = r5.getDescriptionSpan()
            r4.setText(r5)
            goto L_0x00aa
        L_0x00a4:
            r4.setVisibility(r8)
            r4.setText(r9)
        L_0x00aa:
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r2.mo3513o()
            java.util.LinkedList r4 = r4.getMediaList()
            java.lang.Object r4 = sx3.C110818d0.m150914L(r4)
            r5 = r4
            te3.rq2 r5 = (te3.C64689rq2) r5
            r4 = 2131308172(0x7f092e8c, float:1.8234592E38)
            android.view.View r4 = r0.mo85812D(r4)
            r7 = r4
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            if (r7 == 0) goto L_0x01d6
            java.lang.String r4 = r5.f185261W
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            java.lang.String r6 = ", feedId="
            java.lang.String r8 = "FinderNewFormRecommendConvert"
            if (r4 != 0) goto L_0x0127
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r14 = "onBindViewHolder: use full cover url, position="
            r4.append(r14)
            r4.append(r1)
            r4.append(r6)
            long r16 = r2.getItemId()
            java.lang.String r1 = o40.C61926c.m72691p(r16)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
            pl1.q0 r1 = new pl1.q0
            r8 = 0
            r14 = 4
            r16 = 0
            r4 = r1
            r6 = r10
            r13 = r7
            r7 = r8
            r8 = r14
            r14 = r9
            r9 = r16
            r4.<init>(r5, r6, r7, r8, r9)
            bl3.r r4 = bl3.C39818r.f106831a
            bl3.r$a r5 = r4.mo62446e(r12)
            bl3.c r5 = r5.mo62447c(r11)
            pl1.s0 r5 = (pl1.C11990s0) r5
            k60.d r5 = r5.mo11871f2()
            bl3.r$a r4 = r4.mo62446e(r12)
            bl3.c r4 = r4.mo62447c(r11)
            pl1.s0 r4 = (pl1.C11990s0) r4
            n60.f r3 = r4.mo11867O2(r3)
            r5.mo85957c(r1, r13, r3)
            goto L_0x01d7
        L_0x0127:
            r13 = r7
            r14 = r9
            java.lang.String r4 = r5.f185283w
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x017f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "onBindViewHolder: use cover url, position="
            r4.append(r7)
            r4.append(r1)
            r4.append(r6)
            long r6 = r2.getItemId()
            java.lang.String r1 = o40.C61926c.m72691p(r6)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
            pl1.o0 r1 = new pl1.o0
            r7 = 0
            r8 = 4
            r9 = 0
            r4 = r1
            r6 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            bl3.r r4 = bl3.C39818r.f106831a
            bl3.r$a r5 = r4.mo62446e(r12)
            bl3.c r5 = r5.mo62447c(r11)
            pl1.s0 r5 = (pl1.C11990s0) r5
            k60.d r5 = r5.mo11871f2()
            bl3.r$a r4 = r4.mo62446e(r12)
            bl3.c r4 = r4.mo62447c(r11)
            pl1.s0 r4 = (pl1.C11990s0) r4
            n60.f r3 = r4.mo11867O2(r3)
            r5.mo85957c(r1, r13, r3)
            goto L_0x01d7
        L_0x017f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "onBindViewHolder: use thumb url, position="
            r4.append(r7)
            r4.append(r1)
            r4.append(r6)
            long r6 = r2.getItemId()
            java.lang.String r1 = o40.C61926c.m72691p(r6)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
            pl1.b0 r1 = new pl1.b0
            up1.y r18 = up1.C27696y.THUMB_IMAGE
            r19 = 0
            r20 = 0
            r21 = 12
            r22 = 0
            r16 = r1
            r17 = r5
            r16.<init>(r17, r18, r19, r20, r21, r22)
            bl3.r r4 = bl3.C39818r.f106831a
            bl3.r$a r5 = r4.mo62446e(r12)
            bl3.c r5 = r5.mo62447c(r11)
            pl1.s0 r5 = (pl1.C11990s0) r5
            k60.d r5 = r5.mo11871f2()
            bl3.r$a r4 = r4.mo62446e(r12)
            bl3.c r4 = r4.mo62447c(r11)
            pl1.s0 r4 = (pl1.C11990s0) r4
            n60.f r3 = r4.mo11867O2(r3)
            r5.mo85957c(r1, r13, r3)
            goto L_0x01d7
        L_0x01d6:
            r14 = r9
        L_0x01d7:
            r1 = 2131308180(0x7f092e94, float:1.8234608E38)
            android.view.View r1 = r0.mo85812D(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r2.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.getFeedObject()
            te3.ek1 r3 = r3.flow_card_recommand_reason
            if (r3 == 0) goto L_0x01f0
            java.lang.String r9 = r3.f132981d
            if (r9 != 0) goto L_0x01f1
        L_0x01f0:
            r9 = r14
        L_0x01f1:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r3 != 0) goto L_0x01fe
            r1.setText(r9)
            r1.setVisibility(r15)
            goto L_0x0203
        L_0x01fe:
            r3 = 8
            r1.setVisibility(r3)
        L_0x0203:
            java.lang.String r1 = r2.mo3503i()
            pl1.e0 r3 = pl1.C11978e0.f34938a
            k60.d r4 = r3.mo11849a()
            pl1.f r5 = new pl1.f
            r6 = 0
            r7 = 2
            r5.<init>(r1, r6, r7, r6)
            r1 = 2131308168(0x7f092e88, float:1.8234584E38)
            android.view.View r1 = r0.mo85812D(r1)
            java.lang.String r6 = "holder.getView(R.id.long_video_avatar)"
            gy3.C87412m.m108593f(r1, r6)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            pl1.e0$a r6 = pl1.C11978e0.C11979a.AVATAR
            n60.f r6 = r3.mo11851c(r6)
            r4.mo85957c(r5, r1, r6)
            r1 = 2131308184(0x7f092e98, float:1.8234616E38)
            android.view.View r1 = r0.mo85812D(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1.setVisibility(r15)
            wp1.j r4 = wp1.C15587j.f42215a
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r2.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r5 = r5.getFeedObject()
            int r5 = r5.objectType
            te3.if1 r4 = r4.mo14351c(r5)
            r5 = 2131099940(0x7f060124, float:1.7812247E38)
            if (r4 == 0) goto L_0x027d
            java.lang.String r6 = r4.f135279y
            if (r6 == 0) goto L_0x0259
            int r6 = r6.length()
            if (r6 != 0) goto L_0x0257
            goto L_0x0259
        L_0x0257:
            r6 = 0
            goto L_0x025a
        L_0x0259:
            r6 = 1
        L_0x025a:
            if (r6 == 0) goto L_0x025d
            goto L_0x027d
        L_0x025d:
            k60.d r6 = r3.mo11850b()
            pl1.n0 r7 = new pl1.n0
            java.lang.String r4 = r4.f135279y
            r7.<init>(r4, r10)
            pl1.e0$a r4 = pl1.C11978e0.C11979a.TIMELINE
            n60.f r3 = r3.mo11851c(r4)
            r6.mo85957c(r7, r1, r3)
            android.content.Context r3 = r0.f173499A
            int r3 = kg3.C76577a.m92153d(r3, r5)
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r1.setColorFilter(r3, r4)
            goto L_0x02a2
        L_0x027d:
            er1.w3 r3 = er1.C58784w3.f168295a
            r4 = 1
            java.lang.Integer r3 = r3.mo83917b0(r4, r4)
            if (r3 == 0) goto L_0x028b
            int r3 = r3.intValue()
            goto L_0x028e
        L_0x028b:
            r3 = 2131756066(0x7f100422, float:1.914303E38)
        L_0x028e:
            android.content.Context r4 = r0.f173499A
            android.content.res.Resources r6 = r4.getResources()
            int r5 = r6.getColor(r5)
            android.graphics.drawable.Drawable r3 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r4, r3, r5)
            r1.setImageDrawable(r3)
            r1.setEnabled(r15)
        L_0x02a2:
            com.tencent.mm.plugin.finder.storage.FeedData$a r1 = com.tencent.p014mm.plugin.finder.storage.FeedData.Companion
            com.tencent.mm.plugin.finder.storage.FeedData r1 = r1.mo78883a(r2)
            r2 = 2131308175(0x7f092e8f, float:1.8234598E38)
            android.view.View r0 = r0.mo85812D(r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.util.LinkedList r1 = r1.getMediaList()
            java.lang.Object r1 = sx3.C110818d0.m150916N(r1)
            te3.rq2 r1 = (te3.C64689rq2) r1
            if (r1 == 0) goto L_0x02bf
            int r15 = r1.f185269g
        L_0x02bf:
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.formatSecToMin(r15)
            r0.setText(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ve1.C14603p6.mo44e(jq3.o, jq3.c, int, int, boolean, java.util.List):void");
    }
}
