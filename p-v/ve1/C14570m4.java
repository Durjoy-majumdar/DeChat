package ve1;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import er1.C58784w3;
import gy3.C87412m;
import jq3.C60896i;
import jq3.C60905o;
import z04.C112550d0;

/* renamed from: ve1.m4 */
public final class C14570m4 extends C60896i<BaseFinderFeed> {

    /* renamed from: e */
    public final String f40366e = "Finder.FinderLikeConvert";

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.f6253s;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x02ce, code lost:
        r4 = r0.username;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r28, jq3.C9493c r29, int r30, int r31, boolean r32, java.util.List r33) {
        /*
            r27 = this;
            r6 = r28
            r7 = r29
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r7 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r7
            pl1.e0$a r0 = pl1.C11978e0.C11979a.TIMELINE
            up1.y r10 = up1.C27696y.THUMB_IMAGE
            java.lang.Class<pl1.s0> r1 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r2 = ht1.C60200t1.class
            java.lang.String r3 = "holder"
            gy3.C87412m.m108594g(r6, r3)
            java.lang.String r3 = "item"
            gy3.C87412m.m108594g(r7, r3)
            r3 = 2131307284(0x7f092b14, float:1.823279E38)
            android.view.View r3 = r6.mo85812D(r3)
            r15 = r3
            android.widget.ImageView r15 = (android.widget.ImageView) r15
            r3 = 2131099724(0x7f06004c, float:1.781181E38)
            r15.setImageResource(r3)
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r7.mo3513o()
            java.util.LinkedList r3 = r3.getMediaList()
            java.lang.Object r3 = sx3.C110818d0.m150916N(r3)
            r9 = r3
            te3.rq2 r9 = (te3.C64689rq2) r9
            if (r9 == 0) goto L_0x0097
            int r3 = r9.f185268f
            r4 = 4
            if (r3 != r4) goto L_0x006b
            pl1.b0 r3 = new pl1.b0
            r11 = 0
            r12 = 0
            r13 = 12
            r14 = 0
            r8 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14)
            bl3.r r4 = bl3.C39818r.f106831a
            bl3.r$a r5 = r4.mo62446e(r2)
            bl3.c r5 = r5.mo62447c(r1)
            pl1.s0 r5 = (pl1.C11990s0) r5
            k60.d r5 = r5.mo11871f2()
            bl3.r$a r4 = r4.mo62446e(r2)
            bl3.c r4 = r4.mo62447c(r1)
            pl1.s0 r4 = (pl1.C11990s0) r4
            n60.f r0 = r4.mo11867O2(r0)
            r5.mo85957c(r3, r15, r0)
            goto L_0x0097
        L_0x006b:
            bl3.r r3 = bl3.C39818r.f106831a
            bl3.r$a r4 = r3.mo62446e(r2)
            bl3.c r4 = r4.mo62447c(r1)
            pl1.s0 r4 = (pl1.C11990s0) r4
            k60.d r4 = r4.mo11871f2()
            pl1.b0 r5 = new pl1.b0
            r11 = 0
            r12 = 0
            r13 = 12
            r14 = 0
            r8 = r5
            r8.<init>(r9, r10, r11, r12, r13, r14)
            bl3.r$a r3 = r3.mo62446e(r2)
            bl3.c r3 = r3.mo62447c(r1)
            pl1.s0 r3 = (pl1.C11990s0) r3
            n60.f r0 = r3.mo11867O2(r0)
            r4.mo85957c(r5, r15, r0)
        L_0x0097:
            android.view.View r0 = r6.f44854d
            r3 = 0
            r0.setOnClickListener(r3)
            java.util.List r0 = r7.mo3523w()
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r7.mo3513o()
            long r8 = r4.getId()
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r7.mo3513o()
            java.lang.String r10 = r4.getObjectNonceId()
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r7.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r4 = r4.getFeedObject()
            pe3.b r11 = r4.likeBuffer
            r12 = r27
            java.lang.String r4 = r12.f40366e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r13 = "onBindViewHolder name:"
            r5.append(r13)
            com.tencent.mm.plugin.finder.storage.FinderItem r13 = r7.mo3513o()
            java.lang.String r13 = r13.getNickName()
            r5.append(r13)
            java.lang.String r13 = ", likeList size:"
            r5.append(r13)
            int r13 = r0.size()
            r5.append(r13)
            java.lang.String r13 = ", jumpFeedId:"
            r5.append(r13)
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            r4 = 2131311819(0x7f093ccb, float:1.824199E38)
            android.view.View r4 = r6.mo85812D(r4)
            if (r4 == 0) goto L_0x03ba
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r13 = k20.C60958c.f173611a
            r13 = 0
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            r5.mo10233c(r14)
            java.lang.Object[] r17 = r5.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/convert/FinderLikeConvert"
            java.lang.String r19 = "onBindViewHolder"
            java.lang.String r20 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r4
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r5 = r5.mo10231a(r13)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r4.setVisibility(r5)
            java.lang.String r17 = "com/tencent/mm/plugin/finder/convert/FinderLikeConvert"
            java.lang.String r18 = "onBindViewHolder"
            java.lang.String r19 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5 = 2131305189(0x7f0922e5, float:1.8228542E38)
            android.view.View r5 = r6.mo85812D(r5)
            r4.add(r5)
            r5 = 2131305191(0x7f0922e7, float:1.8228546E38)
            android.view.View r5 = r6.mo85812D(r5)
            r4.add(r5)
            r5 = 2131305193(0x7f0922e9, float:1.822855E38)
            android.view.View r5 = r6.mo85812D(r5)
            r4.add(r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r14 = 2131305190(0x7f0922e6, float:1.8228544E38)
            android.view.View r14 = r6.mo85812D(r14)
            r5.add(r14)
            r14 = 2131305192(0x7f0922e8, float:1.8228548E38)
            android.view.View r14 = r6.mo85812D(r14)
            r5.add(r14)
            r14 = 2131305194(0x7f0922ea, float:1.8228552E38)
            android.view.View r14 = r6.mo85812D(r14)
            r5.add(r14)
            java.util.Iterator r4 = r4.iterator()
            r14 = 0
        L_0x0185:
            boolean r16 = r4.hasNext()
            java.lang.String r17 = ""
            if (r16 == 0) goto L_0x02ad
            java.lang.Object r16 = r4.next()
            int r18 = r14 + 1
            if (r14 < 0) goto L_0x02a8
            r3 = r16
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            if (r3 == 0) goto L_0x0295
            int r13 = r0.size()
            if (r14 < r13) goto L_0x01ef
            java.lang.Object r3 = r5.get(r14)
            android.view.View r3 = (android.view.View) r3
            if (r3 != 0) goto L_0x01ab
            goto L_0x0295
        L_0x01ab:
            r13 = 8
            k20.a r14 = new k20.a
            r14.<init>()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r14.mo10233c(r13)
            java.lang.Object[] r20 = r14.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/finder/convert/FinderLikeConvert"
            java.lang.String r22 = "onBindViewHolder"
            java.lang.String r23 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r3
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            r13 = 0
            java.lang.Object r14 = r14.mo10231a(r13)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r13 = r14.intValue()
            r3.setVisibility(r13)
            java.lang.String r20 = "com/tencent/mm/plugin/finder/convert/FinderLikeConvert"
            java.lang.String r21 = "onBindViewHolder"
            java.lang.String r22 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
            goto L_0x0295
        L_0x01ef:
            java.lang.Object r13 = r5.get(r14)
            android.view.View r13 = (android.view.View) r13
            r31 = r4
            if (r13 != 0) goto L_0x01fc
            r32 = r5
            goto L_0x0240
        L_0x01fc:
            k20.a r4 = new k20.a
            r4.<init>()
            r32 = r5
            r16 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r16)
            r4.mo10233c(r5)
            java.lang.Object[] r20 = r4.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/finder/convert/FinderLikeConvert"
            java.lang.String r22 = "onBindViewHolder"
            java.lang.String r23 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r13
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            r5 = 0
            java.lang.Object r4 = r4.mo10231a(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r13.setVisibility(r4)
            java.lang.String r20 = "com/tencent/mm/plugin/finder/convert/FinderLikeConvert"
            java.lang.String r21 = "onBindViewHolder"
            java.lang.String r22 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
        L_0x0240:
            java.lang.Object r4 = r0.get(r14)
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r4 = (com.tencent.p014mm.protocal.protobuf.FinderCommentInfo) r4
            java.lang.String r4 = r4.headUrl
            if (r4 != 0) goto L_0x024c
            r4 = r17
        L_0x024c:
            java.lang.Object r5 = r0.get(r14)
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r5 = (com.tencent.p014mm.protocal.protobuf.FinderCommentInfo) r5
            java.lang.String r5 = r5.username
            java.lang.String r13 = eb0.C75592q0.m90789s()
            boolean r5 = gy3.C87412m.m108589b(r5, r13)
            if (r5 == 0) goto L_0x0268
            java.lang.String r4 = eb0.C75592q0.m90789s()
            tl3.C78039a.m94189a(r3, r4)
        L_0x0265:
            r33 = r15
            goto L_0x029a
        L_0x0268:
            bl3.r r5 = bl3.C39818r.f106831a
            bl3.r$a r13 = r5.mo62446e(r2)
            bl3.c r13 = r13.mo62447c(r1)
            pl1.s0 r13 = (pl1.C11990s0) r13
            k60.d r13 = r13.mo11872i2()
            pl1.f r14 = new pl1.f
            r12 = 2
            r33 = r15
            r15 = 0
            r14.<init>(r4, r15, r12, r15)
            pl1.e0$a r4 = pl1.C11978e0.C11979a.AVATAR
            bl3.r$a r5 = r5.mo62446e(r2)
            bl3.c r5 = r5.mo62447c(r1)
            pl1.s0 r5 = (pl1.C11990s0) r5
            n60.f r4 = r5.mo11867O2(r4)
            r13.mo85957c(r14, r3, r4)
            goto L_0x029a
        L_0x0295:
            r31 = r4
            r32 = r5
            goto L_0x0265
        L_0x029a:
            r12 = r27
            r4 = r31
            r5 = r32
            r15 = r33
            r14 = r18
            r3 = 0
            r13 = 0
            goto L_0x0185
        L_0x02a8:
            sx3.C64197v.m75542k()
            r0 = 0
            throw r0
        L_0x02ad:
            r33 = r15
            r1 = 2131311820(0x7f093ccc, float:1.8241991E38)
            android.view.View r1 = r6.mo85812D(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L_0x02f5
            java.lang.Object r0 = sx3.C110818d0.m150916N(r0)
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r0 = (com.tencent.p014mm.protocal.protobuf.FinderCommentInfo) r0
            java.lang.Class<ny.h> r2 = p629ny.C76979h.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ny.h r2 = (p629ny.C76979h) r2
            android.content.Context r3 = r6.f173499A
            er1.w3 r18 = er1.C58784w3.f168295a
            if (r0 == 0) goto L_0x02d6
            java.lang.String r4 = r0.username
            if (r4 != 0) goto L_0x02d3
            goto L_0x02d6
        L_0x02d3:
            r19 = r4
            goto L_0x02d8
        L_0x02d6:
            r19 = r17
        L_0x02d8:
            if (r0 == 0) goto L_0x02e2
            java.lang.String r0 = r0.nickname
            if (r0 != 0) goto L_0x02df
            goto L_0x02e2
        L_0x02df:
            r20 = r0
            goto L_0x02e4
        L_0x02e2:
            r20 = r17
        L_0x02e4:
            r21 = 0
            r22 = 4
            r23 = 0
            java.lang.String r0 = er1.C58784w3.m68433S(r18, r19, r20, r21, r22, r23)
            android.text.SpannableString r0 = r2.mo107057T1(r3, r0)
            r1.setText(r0)
        L_0x02f5:
            r0 = 2131311817(0x7f093cc9, float:1.8241985E38)
            android.view.View r0 = r6.mo85812D(r0)
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            int r0 = r7.mo3521u()
            int r2 = r7.mo3522v()
            int r1 = r0 - r2
            r3 = 1
            if (r0 != r3) goto L_0x0355
            android.content.Context r0 = r6.f173499A
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131165324(0x7f07008c, float:1.7944862E38)
            float r0 = r0.getDimension(r1)
            int r0 = (int) r0
            er1.w3 r12 = er1.C58784w3.f168295a
            java.lang.Integer r1 = r12.mo83917b0(r3, r3)
            if (r1 == 0) goto L_0x0329
            int r1 = r1.intValue()
            r16 = r1
            goto L_0x032f
        L_0x0329:
            r1 = 2131755982(0x7f1003ce, float:1.9142859E38)
            r16 = 2131755982(0x7f1003ce, float:1.9142859E38)
        L_0x032f:
            android.content.Context r13 = r6.f173499A
            java.lang.String r1 = "holder.context"
            gy3.C87412m.m108593f(r13, r1)
            android.content.Context r1 = r6.f173499A
            r2 = 2131829708(0x7f1123cc, float:1.9292393E38)
            java.lang.String r14 = r1.getString(r2)
            java.lang.String r1 = "holder.context.getString…name_recommend_desc2_new)"
            gy3.C87412m.m108593f(r14, r1)
            r15 = 35
            r17 = 2131099800(0x7f060098, float:1.7811963E38)
            r18 = r0
            r19 = r0
            java.lang.CharSequence r0 = r12.mo83957q1(r13, r14, r15, r16, r17, r18, r19)
            r5.setText(r0)
            goto L_0x03af
        L_0x0355:
            r4 = 3
            java.lang.String r12 = "descTv"
            if (r0 > r4) goto L_0x0386
            if (r2 > 0) goto L_0x0386
            if (r2 <= 0) goto L_0x036c
            r4 = 2131829712(0x7f1123d0, float:1.92924E38)
            gy3.C87412m.m108593f(r5, r12)
            r0 = r27
            r3 = r28
            r0.mo13816j(r1, r2, r3, r4, r5)
            goto L_0x03af
        L_0x036c:
            android.content.Context r1 = r6.f173499A
            r2 = 2131829712(0x7f1123d0, float:1.92924E38)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r0.toString()
            r4 = 0
            r3[r4] = r0
            java.lang.String r0 = r1.getString(r2, r3)
            r5.setText(r0)
            goto L_0x03af
        L_0x0386:
            if (r2 <= 0) goto L_0x0396
            r4 = 2131829705(0x7f1123c9, float:1.9292387E38)
            gy3.C87412m.m108593f(r5, r12)
            r0 = r27
            r3 = r28
            r0.mo13816j(r1, r2, r3, r4, r5)
            goto L_0x03af
        L_0x0396:
            android.content.Context r1 = r6.f173499A
            r2 = 2131829705(0x7f1123c9, float:1.9292387E38)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r0.toString()
            r4 = 0
            r3[r4] = r0
            java.lang.String r0 = r1.getString(r2, r3)
            r5.setText(r0)
        L_0x03af:
            android.view.View r0 = r6.f44854d
            ve1.k4 r1 = new ve1.k4
            r1.<init>(r6, r7, r11)
            r0.setOnClickListener(r1)
            goto L_0x03bc
        L_0x03ba:
            r33 = r15
        L_0x03bc:
            ve1.l4 r7 = new ve1.l4
            r0 = r7
            r1 = r8
            r3 = r10
            r4 = r11
            r5 = r28
            r6 = r27
            r0.<init>(r1, r3, r4, r5, r6)
            r3 = r33
            r3.setOnClickListener(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ve1.C14570m4.mo44e(jq3.o, jq3.c, int, int, boolean, java.util.List):void");
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        C85875k4.m106189j0(((TextView) oVar.mo85812D(C0966R.C0970id.iej)).getPaint(), 0.8f);
        C85875k4.m106189j0(((TextView) oVar.mo85812D(C0966R.C0970id.ieg)).getPaint(), 0.8f);
    }

    /* renamed from: j */
    public final void mo13816j(int i, int i2, C60905o oVar, int i3, TextView textView) {
        int i4;
        int i5 = i;
        int i6 = i2;
        C60905o oVar2 = oVar;
        TextView textView2 = textView;
        String str = i5 + " + " + i6;
        int length = str.length() - C112550d0.m153768D(str, '+', 0, false, 6, (Object) null);
        int dimension = (int) oVar2.f173499A.getResources().getDimension(C0966R.dimen.f3736cp);
        C58784w3 w3Var = C58784w3.f168295a;
        Integer b0 = w3Var.mo83917b0(1, true);
        int intValue = b0 != null ? b0.intValue() : C0966R.raw.icons_filled_channels_like_bold;
        Context context = oVar2.f173499A;
        C87412m.m108593f(context, "holder.context");
        String string = oVar2.f173499A.getString(i3, new Object[]{i5 + " + " + i6});
        C87412m.m108593f(string, "holder.context.getString… \"$preCount + $incCount\")");
        CharSequence q1 = w3Var.mo83957q1(context, string, '#', intValue, C0966R.color.FG_0, dimension, dimension);
        int D = C112550d0.m153768D(q1, '+', 0, false, 6, (Object) null);
        if (D <= 0 || (i4 = length + D) >= ((SpannableString) q1).length()) {
            textView2.setText(q1);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(q1);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(oVar2.f173499A.getResources().getColor(C0966R.color.f2966ao)), D, i4, 17);
        textView2.setText(spannableStringBuilder);
    }
}
