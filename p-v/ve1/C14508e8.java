package ve1;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0712b0;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import jq3.C60896i;
import jq3.C60905o;
import kg3.C76577a;

/* renamed from: ve1.e8 */
public final class C14508e8 extends C60896i<C0712b0> {

    /* renamed from: e */
    public final String f40225e = "FinderFeedLiveListItemConvert";

    /* renamed from: f */
    public final int f40226f = 5;

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.apx;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0056, code lost:
        r14 = r14.f136177g;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r27, jq3.C9493c r28, int r29, int r30, boolean r31, java.util.List r32) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r28
            cm1.b0 r2 = (cm1.C0712b0) r2
            pl1.e0$a r3 = pl1.C11978e0.C11979a.RECT_AVATAR
            java.lang.Class<ht1.t1> r4 = ht1.C60200t1.class
            java.lang.Class<pl1.s0> r5 = pl1.C11990s0.class
            java.lang.String r6 = "holder"
            gy3.C87412m.m108594g(r1, r6)
            java.lang.String r6 = "item"
            gy3.C87412m.m108594g(r2, r6)
            r6 = 8
            r7 = 0
            r8 = 2
            r9 = 1
            r10 = 0
            if (r31 != 0) goto L_0x00d9
            r11 = 2131297459(0x7f0904b3, float:1.8212864E38)
            android.view.View r11 = r1.mo85812D(r11)
            com.tencent.mm.plugin.finder.feed.RoundLinearLayout r11 = (com.tencent.p014mm.plugin.finder.feed.RoundLinearLayout) r11
            r12 = 2131297461(0x7f0904b5, float:1.8212868E38)
            android.view.View r12 = r1.mo85812D(r12)
            com.tencent.mm.plugin.finder.feed.RoundLinearLayout r12 = (com.tencent.p014mm.plugin.finder.feed.RoundLinearLayout) r12
            r13 = 1045220557(0x3e4ccccd, float:0.2)
            r11.setRadius(r13)
            r12.setRadius(r13)
            r11 = 2131307621(0x7f092c65, float:1.8233475E38)
            android.view.View r11 = r1.mo85812D(r11)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            r13 = 2131307622(0x7f092c66, float:1.8233477E38)
            android.view.View r13 = r1.mo85812D(r13)
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            r12.setVisibility(r10)
            com.tencent.mm.protocal.protobuf.FinderObject r14 = r2.f1709d
            te3.jl1 r14 = r14.snsShareInfo
            if (r14 == 0) goto L_0x005f
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderContact> r14 = r14.f136177g
            if (r14 == 0) goto L_0x005f
            int r14 = r14.size()
            goto L_0x0060
        L_0x005f:
            r14 = 0
        L_0x0060:
            if (r14 > r9) goto L_0x0065
            r12.setVisibility(r6)
        L_0x0065:
            com.tencent.mm.protocal.protobuf.FinderObject r12 = r2.f1709d
            te3.jl1 r12 = r12.snsShareInfo
            if (r12 == 0) goto L_0x00d9
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderContact> r12 = r12.f136177g
            if (r12 == 0) goto L_0x00d9
            java.lang.Object r14 = sx3.C110818d0.m150916N(r12)
            com.tencent.mm.protocal.protobuf.FinderContact r14 = (com.tencent.p014mm.protocal.protobuf.FinderContact) r14
            if (r14 == 0) goto L_0x00a4
            bl3.r r15 = bl3.C39818r.f106831a
            bl3.r$a r10 = r15.mo62446e(r4)
            bl3.c r10 = r10.mo62447c(r5)
            pl1.s0 r10 = (pl1.C11990s0) r10
            k60.d r10 = r10.mo11868R0()
            pl1.f r6 = new pl1.f
            java.lang.String r14 = r14.headUrl
            r6.<init>(r14, r7, r8, r7)
            java.lang.String r14 = "avatar1"
            gy3.C87412m.m108593f(r11, r14)
            bl3.r$a r14 = r15.mo62446e(r4)
            bl3.c r14 = r14.mo62447c(r5)
            pl1.s0 r14 = (pl1.C11990s0) r14
            n60.f r14 = r14.mo11867O2(r3)
            r10.mo85957c(r6, r11, r14)
        L_0x00a4:
            java.lang.Object r6 = sx3.C110818d0.m150917O(r12, r9)
            com.tencent.mm.protocal.protobuf.FinderContact r6 = (com.tencent.p014mm.protocal.protobuf.FinderContact) r6
            if (r6 == 0) goto L_0x00d9
            bl3.r r10 = bl3.C39818r.f106831a
            bl3.r$a r11 = r10.mo62446e(r4)
            bl3.c r11 = r11.mo62447c(r5)
            pl1.s0 r11 = (pl1.C11990s0) r11
            k60.d r11 = r11.mo11868R0()
            pl1.f r12 = new pl1.f
            java.lang.String r6 = r6.headUrl
            r12.<init>(r6, r7, r8, r7)
            java.lang.String r6 = "avatar2"
            gy3.C87412m.m108593f(r13, r6)
            bl3.r$a r6 = r10.mo62446e(r4)
            bl3.c r6 = r6.mo62447c(r5)
            pl1.s0 r6 = (pl1.C11990s0) r6
            n60.f r3 = r6.mo11867O2(r3)
            r11.mo85957c(r12, r13, r3)
        L_0x00d9:
            r3 = 2131307623(0x7f092c67, float:1.8233479E38)
            android.view.View r3 = r1.mo85812D(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.String r6 = ""
            gy3.C87412m.m108593f(r3, r6)
            er1.C7919x.m8091a(r3)
            ve1.i r10 = ve1.C65604i.f188772a
            com.tencent.mm.protocal.protobuf.FinderObject r11 = r2.f1709d
            com.tencent.mm.protocal.protobuf.FinderContact r11 = r11.contact
            if (r11 == 0) goto L_0x00f6
            java.lang.String r11 = r11.nickname
            if (r11 != 0) goto L_0x00f7
        L_0x00f6:
            r11 = r6
        L_0x00f7:
            int r12 = r0.f40226f
            java.lang.CharSequence r10 = r10.mo89679e(r3, r11, r12)
            r3.setText(r10)
            r3 = 2131297406(0x7f09047e, float:1.8212756E38)
            android.view.View r10 = r1.mo85812D(r3)
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            r11 = 8
            r10.setVisibility(r11)
            com.tencent.mm.protocal.protobuf.FinderObject r11 = r2.f1709d
            com.tencent.mm.protocal.protobuf.FinderContact r11 = r11.contact
            if (r11 == 0) goto L_0x0133
            r12 = 0
            r10.setVisibility(r12)
            er1.w3 r13 = er1.C58784w3.f168295a
            android.view.View r3 = r1.mo85812D(r3)
            java.lang.String r10 = "holder.getView(R.id.auth_icon)"
            gy3.C87412m.m108593f(r3, r10)
            r14 = r3
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            com.tencent.mm.protocal.protobuf.FinderAuthInfo r15 = r11.authInfo
            r16 = 0
            r17 = 0
            r18 = 12
            r19 = 0
            er1.C58784w3.m68429F1(r13, r14, r15, r16, r17, r18, r19)
        L_0x0133:
            er1.w3 r3 = er1.C58784w3.f168295a
            r3 = 2131314014(0x7f09455e, float:1.8246441E38)
            android.view.View r10 = r1.mo85812D(r3)
            com.tencent.mm.protocal.protobuf.FinderObject r11 = r2.f1709d
            te3.jl1 r11 = r11.snsShareInfo
            er1.j4 r12 = er1.C58739j4.f168176a
            if (r10 == 0) goto L_0x01b8
            if (r11 == 0) goto L_0x01b8
            android.widget.TextView r10 = (android.widget.TextView) r10
            r12 = 0
            r10.setVisibility(r12)
            android.content.Context r13 = r1.f173499A
            r14 = 2131165652(0x7f0701d4, float:1.7945527E38)
            int r13 = kg3.C76577a.m92157h(r13, r14)
            float r13 = (float) r13
            r10.setTextSize(r12, r13)
            int r12 = r11.f136174d
            if (r12 == r9) goto L_0x0188
            if (r12 == r8) goto L_0x0165
            r12 = 8
            r10.setVisibility(r12)
            goto L_0x01b8
        L_0x0165:
            android.content.Context r12 = r1.f173499A
            r13 = 2131829919(0x7f11249f, float:1.929282E38)
            java.lang.Object[] r14 = new java.lang.Object[r9]
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r6)
            int r6 = r11.f136176f
            r15.append(r6)
            java.lang.String r6 = r15.toString()
            r11 = 0
            r14[r11] = r6
            java.lang.String r6 = r12.getString(r13, r14)
            r10.setText(r6)
            goto L_0x01b8
        L_0x0188:
            int r12 = r11.f136175e
            if (r12 <= r8) goto L_0x01ac
            android.content.Context r12 = r1.f173499A
            r13 = 2131829920(0x7f1124a0, float:1.9292823E38)
            java.lang.Object[] r14 = new java.lang.Object[r9]
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r6)
            int r6 = r11.f136175e
            r15.append(r6)
            java.lang.String r6 = r15.toString()
            r11 = 0
            r14[r11] = r6
            java.lang.String r6 = r12.getString(r13, r14)
            goto L_0x01b5
        L_0x01ac:
            android.content.Context r6 = r1.f173499A
            r11 = 2131821687(0x7f110477, float:1.9276124E38)
            java.lang.String r6 = r6.getString(r11)
        L_0x01b5:
            r10.setText(r6)
        L_0x01b8:
            com.tencent.mm.protocal.protobuf.FinderObject r6 = r2.f1709d
            te3.c21 r6 = r6.liveInfo
            if (r6 == 0) goto L_0x01c0
            int r8 = r6.f182394f
        L_0x01c0:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            com.tencent.mm.protocal.protobuf.FinderObject r10 = r2.f1709d
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r10 = r10.objectDesc
            if (r10 == 0) goto L_0x01da
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r10 = r10.media
            if (r10 == 0) goto L_0x01da
            java.lang.Object r10 = r10.getFirst()
            com.tencent.mm.protocal.protobuf.FinderMedia r10 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r10
            if (r10 == 0) goto L_0x01da
            java.lang.String r10 = r10.coverUrl
            goto L_0x01db
        L_0x01da:
            r10 = r7
        L_0x01db:
            java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r10)
            r6.append(r10)
            com.tencent.mm.protocal.protobuf.FinderObject r10 = r2.f1709d
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r10 = r10.objectDesc
            if (r10 == 0) goto L_0x01f7
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r10 = r10.media
            if (r10 == 0) goto L_0x01f7
            java.lang.Object r10 = r10.getFirst()
            com.tencent.mm.protocal.protobuf.FinderMedia r10 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r10
            if (r10 == 0) goto L_0x01f7
            java.lang.String r10 = r10.cover_url_token
            goto L_0x01f8
        L_0x01f7:
            r10 = r7
        L_0x01f8:
            java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r10)
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            com.tencent.mm.protocal.protobuf.FinderObject r11 = r2.f1709d
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r11 = r11.objectDesc
            if (r11 == 0) goto L_0x021d
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r11 = r11.media
            if (r11 == 0) goto L_0x021d
            java.lang.Object r11 = r11.getFirst()
            com.tencent.mm.protocal.protobuf.FinderMedia r11 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r11
            if (r11 == 0) goto L_0x021d
            java.lang.String r11 = r11.thumbUrl
            goto L_0x021e
        L_0x021d:
            r11 = r7
        L_0x021e:
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r11)
            r10.append(r11)
            com.tencent.mm.protocal.protobuf.FinderObject r11 = r2.f1709d
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r11 = r11.objectDesc
            if (r11 == 0) goto L_0x023a
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r11 = r11.media
            if (r11 == 0) goto L_0x023a
            java.lang.Object r11 = r11.getFirst()
            com.tencent.mm.protocal.protobuf.FinderMedia r11 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r11
            if (r11 == 0) goto L_0x023a
            java.lang.String r11 = r11.thumb_url_token
            goto L_0x023b
        L_0x023a:
            r11 = r7
        L_0x023b:
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r11)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r11 != 0) goto L_0x024e
            r14 = r6
            goto L_0x024f
        L_0x024e:
            r14 = r10
        L_0x024f:
            java.lang.String r6 = r0.f40225e
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "refreshMask liveId:"
            r10.append(r11)
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.f1709d
            te3.c21 r2 = r2.liveInfo
            if (r2 == 0) goto L_0x0268
            long r11 = r2.f182392d
            java.lang.Long r2 = java.lang.Long.valueOf(r11)
            goto L_0x0269
        L_0x0268:
            r2 = r7
        L_0x0269:
            r10.append(r2)
            java.lang.String r2 = ", liveStatus:"
            r10.append(r2)
            r10.append(r8)
            java.lang.String r2 = ", showImageUrl:"
            r10.append(r2)
            r10.append(r14)
            java.lang.String r2 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
            r2 = 2131315200(0x7f094a00, float:1.8248847E38)
            android.view.View r6 = r1.mo85812D(r2)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r6.setImageBitmap(r7)
            r6 = 2131303479(0x7f091c37, float:1.8225074E38)
            java.lang.String r10 = "holder.getView<ImageView>(R.id.thumb_img)"
            if (r8 != r9) goto L_0x0324
            if (r31 != 0) goto L_0x02dc
            bl3.r r3 = bl3.C39818r.f106831a
            bl3.r$a r8 = r3.mo62446e(r4)
            bl3.c r8 = r8.mo62447c(r5)
            pl1.s0 r8 = (pl1.C11990s0) r8
            k60.d r8 = r8.mo11871f2()
            pl1.n0 r9 = new pl1.n0
            up1.y r11 = up1.C27696y.RAW_IMAGE
            r9.<init>(r14, r11)
            l60.b r8 = r8.mo85955a(r9)
            p60.e r9 = new p60.e
            r11 = 3
            r9.<init>(r7, r7, r11, r7)
            r8.f291321e = r9
            pl1.e0$a r7 = pl1.C11978e0.C11979a.TIMELINE
            bl3.r$a r3 = r3.mo62446e(r4)
            bl3.c r3 = r3.mo62447c(r5)
            pl1.s0 r3 = (pl1.C11990s0) r3
            n60.f r3 = r3.mo11867O2(r7)
            r8.mo138758f(r3)
            android.view.View r2 = r1.mo85812D(r2)
            gy3.C87412m.m108593f(r2, r10)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            l60.a r8 = (l60.C99342a) r8
            r8.mo85954d(r2)
        L_0x02dc:
            android.view.View r1 = r1.mo85812D(r6)
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            r3 = 8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.mo10233c(r3)
            java.lang.Object[] r10 = r2.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/finder/convert/FinderSnsLiveListItemConvert"
            java.lang.String r12 = "refreshMask"
            java.lang.String r13 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLiveListItem;Z)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r1
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            r3 = 0
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r10 = "com/tencent/mm/plugin/finder/convert/FinderSnsLiveListItemConvert"
            java.lang.String r11 = "refreshMask"
            java.lang.String r12 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLiveListItem;Z)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x0399
        L_0x0324:
            java.lang.Class<tf0.q1> r4 = tf0.C13887q1.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            java.lang.String r5 = "getService(IFinderCommonLiveService::class.java)"
            gy3.C87412m.m108593f(r4, r5)
            r12 = r4
            tf0.q1 r12 = (tf0.C13887q1) r12
            android.view.View r2 = r1.mo85812D(r2)
            gy3.C87412m.m108593f(r2, r10)
            r13 = r2
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            r15 = 0
            r16 = 4
            r17 = 0
            tf0.C13887q1.C13888a.m13309e(r12, r13, r14, r15, r16, r17)
            android.view.View r2 = r1.mo85812D(r6)
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            r5 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r4.mo10233c(r6)
            java.lang.Object[] r19 = r4.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/finder/convert/FinderSnsLiveListItemConvert"
            java.lang.String r21 = "refreshMask"
            java.lang.String r22 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLiveListItem;Z)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r2
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            r5 = 0
            java.lang.Object r4 = r4.mo10231a(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r19 = "com/tencent/mm/plugin/finder/convert/FinderSnsLiveListItemConvert"
            java.lang.String r20 = "refreshMask"
            java.lang.String r21 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLiveListItem;Z)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            android.view.View r1 = r1.mo85812D(r3)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 != 0) goto L_0x0394
            goto L_0x0399
        L_0x0394:
            r2 = 8
            r1.setVisibility(r2)
        L_0x0399:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ve1.C14508e8.mo44e(jq3.o, jq3.c, int, int, boolean, java.util.List):void");
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        float min = ((float) (Math.min(oVar.f173499A.getResources().getDisplayMetrics().heightPixels, oVar.f173499A.getResources().getDisplayMetrics().widthPixels) - C76577a.m92151b(oVar.f173499A, 16))) / 3.5f;
        if (min <= 0.0f) {
            min = oVar.f173499A.getResources().getDimension(C0966R.dimen.f3713c6);
        }
        ViewGroup.LayoutParams layoutParams = oVar.f44854d.getLayoutParams();
        layoutParams.width = (int) min;
        layoutParams.height = (int) ((((float) 4) * min) / ((float) 3));
        oVar.f44854d.setLayoutParams(layoutParams);
    }
}
