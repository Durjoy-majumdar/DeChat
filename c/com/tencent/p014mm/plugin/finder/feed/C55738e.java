package com.tencent.p014mm.plugin.finder.feed;

import com.tencent.p014mm.autogen.events.FinderCommentChangeEvent;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.feed.e */
public final class C55738e extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderCommentChangeEvent f158660d;

    /* renamed from: e */
    public final /* synthetic */ FinderCommentDrawerPresenter f158661e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55738e(FinderCommentChangeEvent finderCommentChangeEvent, FinderCommentDrawerPresenter finderCommentDrawerPresenter) {
        super(0);
        this.f158660d = finderCommentChangeEvent;
        this.f158661e = finderCommentDrawerPresenter;
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x018f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r18 = this;
            r0 = r18
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            com.tencent.mm.autogen.events.FinderCommentChangeEvent r2 = r0.f158660d
            com.tencent.mm.autogen.events.FinderCommentChangeEvent$a r2 = r2.f154754d
            int r3 = r2.f154758d
            java.lang.String[] r4 = up1.C65412c.f188250f
            r4 = 3
            r5 = 0
            java.lang.String r7 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.storage.LocalFinderCommentObject"
            r8 = 0
            r9 = 0
            if (r3 != r4) goto L_0x00f5
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r1 = r0.f158661e
            com.tencent.mm.plugin.finder.feed.model.k r1 = r1.f158618g
            int r1 = r1.mo77387g()
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r2 = r0.f158661e
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter$a r2 = r2.f158623o
            if (r2 == 0) goto L_0x00c3
            com.tencent.mm.autogen.events.FinderCommentChangeEvent r3 = r0.f158660d
            com.tencent.mm.autogen.events.FinderCommentChangeEvent$a r3 = r3.f154754d
            xh.z2 r3 = r3.f154759e
            gy3.C87412m.m108592e(r3, r7)
            up1.w0 r3 = (up1.C65426w0) r3
            cm1.u r4 = new cm1.u
            r4.<init>(r3)
            java.lang.Class<ny.h> r7 = p629ny.C76979h.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            ny.h r7 = (p629ny.C76979h) r7
            android.content.Context r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            up1.w0 r11 = r4.f154492d
            java.lang.String r11 = r11.getContent()
            r7.mo107057T1(r10, r11)
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r7 = r2.f158636b
            com.tencent.mm.plugin.finder.feed.model.k r7 = r7.f158618g
            int r4 = r7.mo77381a(r4)
            androidx.recyclerview.widget.RecyclerView r7 = r2.f158635a
            androidx.recyclerview.widget.RecyclerView$e r7 = r7.getAdapter()
            if (r7 == 0) goto L_0x005b
            r7.notifyDataSetChanged()
        L_0x005b:
            te3.ye0 r3 = r3.field_actionInfo
            long r10 = r3.f186500h
            int r3 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x00c0
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r3 = r2.f158636b
            ur1.g r3 = r3.f158622n
            if (r3 == 0) goto L_0x0072
            com.tencent.mm.view.RefreshLoadMoreLayout r3 = r3.mo89591p()
            com.tencent.mm.plugin.finder.feed.c r5 = com.tencent.p014mm.plugin.finder.feed.C2635c.f13475d
            r3.mo55513p(r5)
        L_0x0072:
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r2 = r2.f158636b
            ur1.g r2 = r2.f158622n
            if (r2 == 0) goto L_0x00c0
            com.tencent.mm.view.RefreshLoadMoreLayout r2 = r2.mo89591p()
            androidx.recyclerview.widget.RecyclerView r2 = r2.getRecyclerView()
            if (r2 == 0) goto L_0x00c0
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.mo10233c(r4)
            java.lang.Object[] r11 = r3.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$DiffDataChangeHelper"
            java.lang.String r13 = "onInsertChange"
            java.lang.String r14 = "(Lcom/tencent/mm/plugin/finder/storage/LocalFinderCommentObject;)Z"
            java.lang.String r15 = "Undefined"
            java.lang.String r16 = "scrollToPosition"
            java.lang.String r17 = "(I)V"
            r10 = r2
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r3 = r3.mo10231a(r9)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.mo17115r1(r3)
            java.lang.String r11 = "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$DiffDataChangeHelper"
            java.lang.String r12 = "onInsertChange"
            java.lang.String r13 = "(Lcom/tencent/mm/plugin/finder/storage/LocalFinderCommentObject;)Z"
            java.lang.String r14 = "Undefined"
            java.lang.String r15 = "scrollToPosition"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
        L_0x00c0:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            goto L_0x00c4
        L_0x00c3:
            r2 = r8
        L_0x00c4:
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r3 = r0.f158661e
            com.tencent.mm.plugin.finder.feed.model.k r3 = r3.f158618g
            int r3 = r3.mo77387g()
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r4 = r0.f158661e
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r4.f158620i
            java.lang.String r5 = "feedObj"
            if (r4 == 0) goto L_0x00f1
            int r6 = r4.getCommentCount()
            int r3 = r3 - r1
            int r6 = r6 + r3
            r4.setCommentCount(r6)
            vp1.e r1 = vp1.C65834e.f189316a
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r3 = r0.f158661e
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.f158620i
            if (r3 == 0) goto L_0x00ed
            vp1.e$b r4 = vp1.C65834e.C65836b.f189325e
            r1.mo89878l(r3, r4)
            r1 = r2
            goto L_0x01b5
        L_0x00ed:
            gy3.C87412m.m108603p(r5)
            throw r8
        L_0x00f1:
            gy3.C87412m.m108603p(r5)
            throw r8
        L_0x00f5:
            r4 = 2
            if (r3 != r4) goto L_0x01b5
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r1 = r0.f158661e
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter$a r1 = r1.f158623o
            if (r1 == 0) goto L_0x01b4
            xh.z2 r2 = r2.f154759e
            gy3.C87412m.m108592e(r2, r7)
            up1.w0 r2 = (up1.C65426w0) r2
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r3 = r1.f158636b
            com.tencent.mm.plugin.finder.feed.model.k r3 = r3.f158618g
            r3.getClass()
            long r7 = r2.mo89531n2()
            r4 = -1
            r10 = 1
            int r11 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r11 != 0) goto L_0x013c
            java.util.ArrayList<cm1.u> r5 = r3.f158793d
            java.util.Iterator r5 = r5.iterator()
            r6 = 0
        L_0x011d:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0167
            java.lang.Object r7 = r5.next()
            cm1.u r7 = (cm1.C55033u) r7
            up1.w0 r7 = r7.f154492d
            long r7 = r7.field_localCommentId
            long r11 = r2.field_localCommentId
            int r13 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r13 != 0) goto L_0x0135
            r7 = 1
            goto L_0x0136
        L_0x0135:
            r7 = 0
        L_0x0136:
            if (r7 == 0) goto L_0x0139
            goto L_0x0162
        L_0x0139:
            int r6 = r6 + 1
            goto L_0x011d
        L_0x013c:
            java.util.ArrayList<cm1.u> r5 = r3.f158793d
            java.util.Iterator r5 = r5.iterator()
            r6 = 0
        L_0x0143:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0167
            java.lang.Object r7 = r5.next()
            cm1.u r7 = (cm1.C55033u) r7
            up1.w0 r7 = r7.f154492d
            long r7 = r7.mo89531n2()
            long r11 = r2.mo89531n2()
            int r13 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r13 != 0) goto L_0x015f
            r7 = 1
            goto L_0x0160
        L_0x015f:
            r7 = 0
        L_0x0160:
            if (r7 == 0) goto L_0x0164
        L_0x0162:
            r4 = r6
            goto L_0x0167
        L_0x0164:
            int r6 = r6 + 1
            goto L_0x0143
        L_0x0167:
            if (r4 < 0) goto L_0x017e
            java.util.ArrayList<cm1.u> r5 = r3.f158793d
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x017e
            java.util.ArrayList<cm1.u> r3 = r3.f158793d
            java.lang.Object r3 = r3.get(r4)
            cm1.u r3 = (cm1.C55033u) r3
            r3.getClass()
            r3.f154492d = r2
        L_0x017e:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            int r2 = r2.intValue()
            r3.intValue()
            if (r2 < 0) goto L_0x01af
            androidx.recyclerview.widget.RecyclerView r3 = r1.f158635a
            androidx.recyclerview.widget.RecyclerView$e r3 = r3.getAdapter()
            if (r3 == 0) goto L_0x019c
            int r3 = r3.getItemCount()
            goto L_0x019d
        L_0x019c:
            r3 = 0
        L_0x019d:
            if (r2 >= r3) goto L_0x01af
            androidx.recyclerview.widget.RecyclerView r1 = r1.f158635a
            androidx.recyclerview.widget.RecyclerView$e r1 = r1.getAdapter()
            if (r1 == 0) goto L_0x01ae
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            r1.notifyItemChanged(r2, r3)
        L_0x01ae:
            r9 = 1
        L_0x01af:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)
            goto L_0x01b5
        L_0x01b4:
            r1 = r8
        L_0x01b5:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "[onNotifyChange] "
            r2.append(r3)
            com.tencent.mm.autogen.events.FinderCommentChangeEvent r3 = r0.f158660d
            r2.append(r3)
            java.lang.String r3 = " result="
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "Finder.DrawerPresenter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.C55738e.invoke():java.lang.Object");
    }
}
