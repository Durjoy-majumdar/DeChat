package vf1;

import com.tencent.p014mm.plugin.finder.feed.p052ui.OccupyFinderUI25;
import com.tencent.p014mm.plugin.finder.p056ui.fav.p057ui.FinderLocalFeedLoader;
import tf1.C13913l;

/* renamed from: vf1.u5 */
public final class C14836u5 implements C13913l {

    /* renamed from: a */
    public final /* synthetic */ OccupyFinderUI25 f40834a;

    /* renamed from: b */
    public final /* synthetic */ FinderLocalFeedLoader f40835b;

    public C14836u5(OccupyFinderUI25 occupyFinderUI25, FinderLocalFeedLoader finderLocalFeedLoader) {
        this.f40834a = occupyFinderUI25;
        this.f40835b = finderLocalFeedLoader;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0150  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void call(int r26) {
        /*
            r25 = this;
            r0 = r25
            com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI25 r1 = r0.f40834a
            vf1.b4 r1 = r1.f14936x
            if (r1 == 0) goto L_0x01e1
            com.tencent.mm.plugin.finder.ui.fav.ui.FinderLocalFeedLoader r3 = r0.f40835b
            boolean r4 = r3.f17289i
            boolean r3 = r3.f17290j
            kf1.c r5 = r1.f30123e
            boolean r6 = r5 instanceof vf1.C14719a4
            if (r6 == 0) goto L_0x0017
            vf1.a4 r5 = (vf1.C14719a4) r5
            goto L_0x0018
        L_0x0017:
            r5 = 0
        L_0x0018:
            if (r5 != 0) goto L_0x001c
            goto L_0x01e0
        L_0x001c:
            com.tencent.mm.ui.MMActivity r6 = r1.f30122d
            r7 = 2131308050(0x7f092e12, float:1.8234345E38)
            android.view.View r6 = r6.findViewById(r7)
            r7 = 8
            r15 = 0
            if (r6 != 0) goto L_0x002c
            r7 = 0
            goto L_0x0072
        L_0x002c:
            k20.a r14 = new k20.a
            r14.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r14.mo10233c(r8)
            java.lang.Object[] r9 = r14.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/finder/feed/ui/FinderLocalTimelineContract$ViewCallback"
            java.lang.String r11 = "onInitEnd"
            java.lang.String r12 = "(ZZ)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r8 = r6
            r2 = r14
            r14 = r16
            r7 = 0
            r15 = r17
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r2 = r2.mo10231a(r7)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r6.setVisibility(r2)
            java.lang.String r9 = "com/tencent/mm/plugin/finder/feed/ui/FinderLocalTimelineContract$ViewCallback"
            java.lang.String r10 = "onInitEnd"
            java.lang.String r11 = "(ZZ)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
        L_0x0072:
            com.tencent.mm.view.RefreshLoadMoreLayout r2 = r1.mo10308D()
            r2.setEnableRefresh(r4)
            com.tencent.mm.view.RefreshLoadMoreLayout r2 = r1.mo10308D()
            r2.setEnableLoadMore(r3)
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader<cm1.i2> r2 = r5.f13124s
            if (r2 == 0) goto L_0x0089
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r2 = r2.getDataListJustForAdapter()
            goto L_0x008a
        L_0x0089:
            r2 = 0
        L_0x008a:
            r3 = -1
            r15 = 1
            if (r2 == 0) goto L_0x00b2
            java.util.Iterator r2 = r2.iterator()
            r6 = 0
        L_0x0093:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x00b2
            java.lang.Object r8 = r2.next()
            cm1.i2 r8 = (cm1.C0740i2) r8
            long r8 = r8.getItemId()
            long r10 = r5.f40680v
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x00ab
            r8 = 1
            goto L_0x00ac
        L_0x00ab:
            r8 = 0
        L_0x00ac:
            if (r8 == 0) goto L_0x00af
            goto L_0x00b3
        L_0x00af:
            int r6 = r6 + 1
            goto L_0x0093
        L_0x00b2:
            r6 = -1
        L_0x00b3:
            if (r6 >= 0) goto L_0x0150
            com.tencent.mm.ui.MMActivity r2 = r1.f30122d
            android.content.res.Resources r2 = r2.getResources()
            r4 = 2131826797(0x7f11186d, float:1.9286489E38)
            java.lang.String r2 = r2.getString(r4)
            java.lang.String r4 = "context.resources.getStr…r_global_fav_deleted_tip)"
            gy3.C87412m.m108593f(r2, r4)
            androidx.recyclerview.widget.RecyclerView r4 = r1.getRecyclerView()
            if (r4 != 0) goto L_0x00ce
            goto L_0x00d3
        L_0x00ce:
            r5 = 8
            r4.setVisibility(r5)
        L_0x00d3:
            rx3.g r4 = r1.f40697s
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            android.view.View r4 = (android.view.View) r4
            r5 = 2131300809(0x7f0911c9, float:1.8219658E38)
            android.view.View r4 = r4.findViewById(r5)
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 == 0) goto L_0x00eb
            r4.setTextColor(r3)
        L_0x00eb:
            rx3.g r1 = r1.f40697s
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            r8 = r1
            android.view.View r8 = (android.view.View) r8
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            r1.mo10233c(r3)
            java.lang.Object[] r17 = r1.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/feed/ui/FinderLocalTimelineContract$ViewCallback"
            java.lang.String r19 = "showErrorUi"
            java.lang.String r20 = "(ILjava/lang/String;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r8
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r1 = r1.mo10231a(r7)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r8.setVisibility(r1)
            java.lang.String r9 = "com/tencent/mm/plugin/finder/feed/ui/FinderLocalTimelineContract$ViewCallback"
            java.lang.String r10 = "showErrorUi"
            java.lang.String r11 = "(ILjava/lang/String;)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            int r1 = r2.length()
            if (r1 != 0) goto L_0x0140
            goto L_0x0141
        L_0x0140:
            r15 = 0
        L_0x0141:
            if (r15 == 0) goto L_0x014b
            r1 = 2131826557(0x7f11177d, float:1.9286002E38)
            r4.setText(r1)
            goto L_0x01e0
        L_0x014b:
            r4.setText(r2)
            goto L_0x01e0
        L_0x0150:
            androidx.recyclerview.widget.RecyclerView r2 = r1.getRecyclerView()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r2 = r2.getLayoutManager()
            if (r2 == 0) goto L_0x01af
            r8 = r2
            com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager r8 = (com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager) r8
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            r2.mo10233c(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            r2.mo10233c(r3)
            java.lang.Object[] r18 = r2.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/finder/feed/ui/FinderLocalTimelineContract$ViewCallback"
            java.lang.String r20 = "onInitEnd"
            java.lang.String r21 = "(ZZ)V"
            java.lang.String r22 = "Undefined"
            java.lang.String r23 = "scrollToPositionWithOffset"
            java.lang.String r24 = "(II)V"
            r17 = r8
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r3 = r2.mo10231a(r7)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Object r2 = r2.mo10231a(r15)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r8.mo16973V(r3, r2)
            java.lang.String r9 = "com/tencent/mm/plugin/finder/feed/ui/FinderLocalTimelineContract$ViewCallback"
            java.lang.String r10 = "onInitEnd"
            java.lang.String r11 = "(ZZ)V"
            java.lang.String r12 = "Undefined"
            java.lang.String r13 = "scrollToPositionWithOffset"
            java.lang.String r14 = "(II)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
        L_0x01af:
            if (r4 != 0) goto L_0x01c9
            com.tencent.mm.view.RefreshLoadMoreLayout r2 = r1.mo10308D()
            com.tencent.mm.view.RefreshLoadMoreLayout$StickTopLoadingLayout r2 = r2.getStickTopLoadingLayout()
            if (r2 != 0) goto L_0x01bc
            goto L_0x01c1
        L_0x01bc:
            r3 = 8
            r2.setVisibility(r3)
        L_0x01c1:
            com.tencent.mm.view.RefreshLoadMoreLayout r2 = r1.mo10308D()
            r3 = 0
            r2.setStickTopLoadingLayout(r3)
        L_0x01c9:
            bl3.r r2 = bl3.C39818r.f106831a
            com.tencent.mm.ui.MMActivity r3 = r1.f30122d
            bl3.r$a r2 = r2.mo62444c(r3)
            java.lang.Class<rs1.n3> r3 = rs1.C63575n3.class
            androidx.lifecycle.i0 r2 = r2.mo75002a(r3)
            rs1.n3 r2 = (rs1.C63575n3) r2
            androidx.recyclerview.widget.RecyclerView r1 = r1.getRecyclerView()
            r2.mo88422e3(r1)
        L_0x01e0:
            return
        L_0x01e1:
            java.lang.String r1 = "viewCallback"
            gy3.C87412m.m108603p(r1)
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: vf1.C14836u5.call(int):void");
    }
}
