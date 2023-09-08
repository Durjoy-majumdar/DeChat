package com.tencent.p014mm.plugin.finder.uniComments;

import com.tencent.p014mm.autogen.events.UniCommentChangeEvent;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.uniComments.c */
public final class C56467c extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ UniCommentChangeEvent f161452d;

    /* renamed from: e */
    public final /* synthetic */ UniCommentDrawerPresenter f161453e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56467c(UniCommentChangeEvent uniCommentChangeEvent, UniCommentDrawerPresenter uniCommentDrawerPresenter) {
        super(0);
        this.f161452d = uniCommentChangeEvent;
        this.f161453e = uniCommentDrawerPresenter;
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x017b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r19 = this;
            r0 = r19
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            com.tencent.mm.autogen.events.UniCommentChangeEvent r2 = r0.f161452d
            com.tencent.mm.autogen.events.UniCommentChangeEvent$a r2 = r2.f154888d
            int r3 = r2.f154892d
            sq1.d$a r4 = sq1.C64149d.f181862f
            r4 = 3
            r5 = 0
            java.lang.String r7 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.uniComments.storge.LocalUniCommentObject"
            r8 = 0
            r9 = 1
            r10 = 0
            if (r3 != r4) goto L_0x00e2
            com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter r1 = r0.f161453e
            lq1.b0 r1 = r1.f161378f
            int r1 = r1.mo86301f()
            com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter r2 = r0.f161453e
            com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter$a r2 = r2.f161383n
            if (r2 == 0) goto L_0x00c4
            com.tencent.mm.autogen.events.UniCommentChangeEvent r3 = r0.f161452d
            com.tencent.mm.autogen.events.UniCommentChangeEvent$a r3 = r3.f154888d
            xh.d9 r3 = r3.f154893e
            gy3.C87412m.m108592e(r3, r7)
            sq1.b r3 = (sq1.C64147b) r3
            sq1.e r4 = new sq1.e
            r4.<init>(r3)
            java.lang.Class<ny.h> r7 = p629ny.C76979h.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            ny.h r7 = (p629ny.C76979h) r7
            android.content.Context r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            sq1.b r12 = r4.f181868d
            java.lang.String r12 = r12.getContent()
            r7.mo107057T1(r11, r12)
            com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter r7 = r2.f161397b
            lq1.b0 r7 = r7.f161378f
            int r4 = r7.mo86296a(r4, r9)
            androidx.recyclerview.widget.RecyclerView r7 = r2.f161396a
            androidx.recyclerview.widget.RecyclerView$e r7 = r7.getAdapter()
            if (r7 == 0) goto L_0x005c
            r7.notifyDataSetChanged()
        L_0x005c:
            te3.ye0 r3 = r3.field_actionInfo
            long r11 = r3.f186500h
            int r3 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x00c1
            com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter r3 = r2.f161397b
            lq1.g0 r3 = r3.f161382j
            if (r3 == 0) goto L_0x0073
            com.tencent.mm.view.RefreshLoadMoreLayout r3 = r3.mo86320q()
            com.tencent.mm.plugin.finder.uniComments.a r5 = com.tencent.p014mm.plugin.finder.uniComments.C3896a.f17477d
            r3.mo55513p(r5)
        L_0x0073:
            com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter r2 = r2.f161397b
            lq1.g0 r2 = r2.f161382j
            if (r2 == 0) goto L_0x00c1
            com.tencent.mm.view.RefreshLoadMoreLayout r2 = r2.mo86320q()
            androidx.recyclerview.widget.RecyclerView r2 = r2.getRecyclerView()
            if (r2 == 0) goto L_0x00c1
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.mo10233c(r4)
            java.lang.Object[] r12 = r3.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/finder/uniComments/UniCommentDrawerPresenter$DiffDataChangeHelper"
            java.lang.String r14 = "onInsertChange"
            java.lang.String r15 = "(Lcom/tencent/mm/plugin/finder/uniComments/storge/LocalUniCommentObject;)Z"
            java.lang.String r16 = "Undefined"
            java.lang.String r17 = "scrollToPosition"
            java.lang.String r18 = "(I)V"
            r11 = r2
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r3 = r3.mo10231a(r10)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.mo17115r1(r3)
            java.lang.String r12 = "com/tencent/mm/plugin/finder/uniComments/UniCommentDrawerPresenter$DiffDataChangeHelper"
            java.lang.String r13 = "onInsertChange"
            java.lang.String r14 = "(Lcom/tencent/mm/plugin/finder/uniComments/storge/LocalUniCommentObject;)Z"
            java.lang.String r15 = "Undefined"
            java.lang.String r16 = "scrollToPosition"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
        L_0x00c1:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            goto L_0x00c5
        L_0x00c4:
            r2 = r8
        L_0x00c5:
            com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter r3 = r0.f161453e
            lq1.b0 r3 = r3.f161378f
            int r3 = r3.mo86301f()
            com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter r4 = r0.f161453e
            qq1.a r4 = r4.f161380h
            if (r4 == 0) goto L_0x00dc
            int r5 = r4.f179671c
            int r3 = r3 - r1
            int r5 = r5 + r3
            r4.f179671c = r5
            r1 = r2
            goto L_0x01a2
        L_0x00dc:
            java.lang.String r1 = "feedObj"
            gy3.C87412m.m108603p(r1)
            throw r8
        L_0x00e2:
            r4 = 2
            if (r3 != r4) goto L_0x01a2
            com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter r1 = r0.f161453e
            com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter$a r1 = r1.f161383n
            if (r1 == 0) goto L_0x01a1
            xh.d9 r2 = r2.f154893e
            gy3.C87412m.m108592e(r2, r7)
            sq1.b r2 = (sq1.C64147b) r2
            com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter r3 = r1.f161397b
            lq1.b0 r3 = r3.f161378f
            r3.getClass()
            long r7 = r2.mo88875m2()
            r4 = -1
            int r11 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r11 != 0) goto L_0x0128
            java.util.ArrayList<sq1.e> r5 = r3.f174500a
            java.util.Iterator r5 = r5.iterator()
            r6 = 0
        L_0x0109:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0153
            java.lang.Object r7 = r5.next()
            sq1.e r7 = (sq1.C64151e) r7
            sq1.b r7 = r7.f181868d
            long r7 = r7.field_localCommentId
            long r11 = r2.field_localCommentId
            int r13 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r13 != 0) goto L_0x0121
            r7 = 1
            goto L_0x0122
        L_0x0121:
            r7 = 0
        L_0x0122:
            if (r7 == 0) goto L_0x0125
            goto L_0x014e
        L_0x0125:
            int r6 = r6 + 1
            goto L_0x0109
        L_0x0128:
            java.util.ArrayList<sq1.e> r5 = r3.f174500a
            java.util.Iterator r5 = r5.iterator()
            r6 = 0
        L_0x012f:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0153
            java.lang.Object r7 = r5.next()
            sq1.e r7 = (sq1.C64151e) r7
            sq1.b r7 = r7.f181868d
            long r7 = r7.mo88875m2()
            long r11 = r2.mo88875m2()
            int r13 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r13 != 0) goto L_0x014b
            r7 = 1
            goto L_0x014c
        L_0x014b:
            r7 = 0
        L_0x014c:
            if (r7 == 0) goto L_0x0150
        L_0x014e:
            r4 = r6
            goto L_0x0153
        L_0x0150:
            int r6 = r6 + 1
            goto L_0x012f
        L_0x0153:
            if (r4 < 0) goto L_0x016a
            java.util.ArrayList<sq1.e> r5 = r3.f174500a
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x016a
            java.util.ArrayList<sq1.e> r3 = r3.f174500a
            java.lang.Object r3 = r3.get(r4)
            sq1.e r3 = (sq1.C64151e) r3
            r3.getClass()
            r3.f181868d = r2
        L_0x016a:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            int r2 = r2.intValue()
            r3.intValue()
            if (r2 < 0) goto L_0x019b
            androidx.recyclerview.widget.RecyclerView r3 = r1.f161396a
            androidx.recyclerview.widget.RecyclerView$e r3 = r3.getAdapter()
            if (r3 == 0) goto L_0x0188
            int r3 = r3.getItemCount()
            goto L_0x0189
        L_0x0188:
            r3 = 0
        L_0x0189:
            if (r2 >= r3) goto L_0x019b
            androidx.recyclerview.widget.RecyclerView r1 = r1.f161396a
            androidx.recyclerview.widget.RecyclerView$e r1 = r1.getAdapter()
            if (r1 == 0) goto L_0x019c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            r1.notifyItemChanged(r2, r3)
            goto L_0x019c
        L_0x019b:
            r9 = 0
        L_0x019c:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)
            goto L_0x01a2
        L_0x01a1:
            r1 = r8
        L_0x01a2:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "[onNotifyChange] "
            r2.append(r3)
            com.tencent.mm.autogen.events.UniCommentChangeEvent r3 = r0.f161452d
            r2.append(r3)
            java.lang.String r3 = " result="
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "MicroMsg.MusicUni.DrawerPresenter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.uniComments.C56467c.invoke():java.lang.Object");
    }
}
