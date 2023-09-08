package kf1;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.finder.storage.FinderLbsStaggeredConfig;
import com.tencent.p014mm.plugin.finder.storage.FinderLbsStaggeredConfig$getItemConvertFactory$1;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C7335d;
import di3.C86312j;
import dp1.C20480e0;
import dp1.C58417y0;
import ef1.C58556f;
import er1.C58784w3;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import jq3.C60896i;
import jq3.C60898l;
import jq3.C60905o;
import jq3.C9500j;
import rs1.C13442s8;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49712hj1;
import up1.C14367u0;
import up1.C37521f;
import ve1.C14443a1;
import ve1.C14590p;

/* renamed from: kf1.qa */
public final class C9941qa implements C9940q9<C0740i2> {

    /* renamed from: d */
    public final MMActivity f30578d;

    /* renamed from: e */
    public final C9930p9<C0740i2> f30579e;

    /* renamed from: f */
    public final View f30580f;

    /* renamed from: g */
    public final String f30581g = "FinderTimelineLbsContract";

    /* renamed from: h */
    public C14367u0 f30582h;

    /* renamed from: i */
    public final C13601g f30583i;

    /* renamed from: kf1.qa$a */
    public static final class C9942a implements C60898l.C9502b<C60905o> {

        /* renamed from: d */
        public final /* synthetic */ ArrayList<C0740i2> f30584d;

        /* renamed from: e */
        public final /* synthetic */ C9941qa f30585e;

        public C9942a(ArrayList<C0740i2> arrayList, C9941qa qaVar) {
            this.f30584d = arrayList;
            this.f30585e = qaVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:37:0x01d4  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x01e4  */
        /* renamed from: q */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo734q(androidx.recyclerview.widget.RecyclerView.C16613e r48, android.view.View r49, int r50, androidx.recyclerview.widget.RecyclerView.C16631z r51) {
            /*
                r47 = this;
                r6 = r47
                r7 = r48
                r8 = r49
                r9 = r50
                r10 = r51
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r7)
                r0.add(r8)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r50)
                r0.add(r1)
                r0.add(r10)
                java.lang.Object[] r5 = r0.toArray()
                r0.clear()
                java.lang.String r0 = "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsViewCallback$initView$1"
                java.lang.String r1 = "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsViewCallback$initView$com/tencent/mm/view/recyclerview/RecyclerViewAdapterEx$OnItemClickListener"
                java.lang.String r2 = "onItemClick"
                java.lang.String r3 = "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroid/view/View;ILandroidx/recyclerview/widget/RecyclerView$ViewHolder;)V"
                r4 = r47
                j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
                jq3.o r10 = (jq3.C60905o) r10
                java.lang.Class<er1.b> r11 = er1.C58684b.class
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r7)
                r0.add(r8)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r50)
                r0.add(r1)
                r0.add(r10)
                java.lang.Object[] r5 = r0.toArray()
                r0.clear()
                java.lang.String r0 = "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsViewCallback$initView$1"
                java.lang.String r1 = "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsViewCallback$initView$com/tencent/mm/view/recyclerview/RecyclerViewAdapterEx$OnItemClickListener"
                java.lang.String r2 = "onItemClick"
                java.lang.String r3 = "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroid/view/View;ILcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V"
                r4 = r47
                j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
                java.lang.String r0 = "adapter"
                gy3.C87412m.m108594g(r7, r0)
                java.lang.String r0 = "view"
                gy3.C87412m.m108594g(r8, r0)
                java.lang.String r0 = "holder"
                gy3.C87412m.m108594g(r10, r0)
                r0 = r7
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter r0 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r0
                int r0 = r0.mo85796c6()
                java.lang.String r1 = "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroid/view/View;ILcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V"
                java.lang.String r2 = "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsViewCallback$initView$1"
                java.lang.String r3 = "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsViewCallback$initView$com/tencent/mm/view/recyclerview/RecyclerViewAdapterEx$OnItemClickListener"
                java.lang.String r4 = "onItemClick"
                if (r9 >= r0) goto L_0x0086
                j20.C117292a.m165361g(r6, r2, r3, r4, r1)
                goto L_0x0339
            L_0x0086:
                java.util.ArrayList<cm1.i2> r5 = r6.f30584d
                int r0 = r9 - r0
                java.lang.Object r5 = r5.get(r0)
                java.lang.String r7 = "data[position - headCount]"
                gy3.C87412m.m108593f(r5, r7)
                cm1.i2 r5 = (cm1.C0740i2) r5
                kf1.qa r7 = r6.f30585e
                java.util.ArrayList<cm1.i2> r12 = r6.f30584d
                r7.getClass()
                java.lang.Class<ls3.f> r13 = ls3.C10649f.class
                boolean r14 = r5 instanceof cm1.C0707a0
                java.lang.String r15 = ""
                if (r14 == 0) goto L_0x00b1
                java.lang.String r7 = r7.f30581g
                java.lang.String r9 = "itemClick is FinderFeedLiveList!"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r9)
                r28 = r0
                r29 = r1
                goto L_0x01ca
            L_0x00b1:
                boolean r14 = r5 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
                r16 = 0
                if (r14 == 0) goto L_0x00bc
                r17 = r5
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r17 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r17
                goto L_0x00be
            L_0x00bc:
                r17 = r16
            L_0x00be:
                if (r17 == 0) goto L_0x01cc
                er1.j4 r8 = er1.C58739j4.f168176a
                r28 = r0
                r0 = r5
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r0
                boolean r8 = r8.mo83686O(r0)
                if (r8 == 0) goto L_0x01ce
                com.tencent.mm.plugin.finder.storage.FinderItem r8 = r0.mo3513o()
                java.lang.String r8 = r8.getUserName()
                zc1.b r19 = zc1.C66785b.f191882e
                r29 = r1
                java.lang.String r1 = r19.mo90662O5()
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r8, (java.lang.String) r1)
                if (r1 == 0) goto L_0x0132
                di3.d r1 = di3.C86312j.m106911c(r11)
                java.lang.String r8 = "getService(ActivityRouter::class.java)"
                gy3.C87412m.m108593f(r1, r8)
                r30 = r1
                tf0.o1 r30 = (tf0.C13883o1) r30
                com.tencent.mm.ui.MMActivity r1 = r7.f30578d
                com.tencent.mm.plugin.finder.storage.FinderItem r7 = r0.mo3513o()
                long r32 = r7.getId()
                com.tencent.mm.plugin.finder.storage.FinderItem r7 = r0.mo3513o()
                java.lang.String r34 = r7.getObjectNonceId()
                com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.mo3513o()
                te3.c21 r0 = r0.getLiveInfo()
                if (r0 != 0) goto L_0x0111
                te3.c21 r0 = new te3.c21
                r0.<init>()
            L_0x0111:
                r35 = r0
                r36 = 0
                r37 = 0
                r38 = 0
                r39 = 0
                r40 = 0
                r41 = 0
                java.lang.String r42 = r17.mo3526z()
                r43 = 0
                r44 = 0
                r45 = 7152(0x1bf0, float:1.0022E-41)
                r46 = 0
                r31 = r1
                tf0.C13883o1.C13884a.m13249a(r30, r31, r32, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
                goto L_0x01ca
            L_0x0132:
                java.lang.Class<ht1.j5> r1 = ht1.C8777j5.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                java.lang.String r8 = "getService(IHellLiveReport::class.java)"
                gy3.C87412m.m108593f(r1, r8)
                r19 = r1
                ht1.j5 r19 = (ht1.C8777j5) r19
                long r8 = (long) r9
                ak1.f0$q r23 = ak1.C54067f0.C54078q.LIVE_AUDIENCE_ENTER_LIVE_ROOM
                r25 = 0
                r26 = 16
                r27 = 0
                java.lang.String r24 = "15"
                r20 = r0
                r21 = r8
                ht1.C8777j5.C8778a.m8604e(r19, r20, r21, r23, r24, r25, r26, r27)
                rs1.s8$a r1 = rs1.C13442s8.f38060Q0
                android.content.Context r8 = r10.f173499A
                java.lang.String r9 = "holder.context"
                gy3.C87412m.m108593f(r8, r9)
                rs1.s8 r1 = r1.mo12873f(r8)
                if (r1 == 0) goto L_0x0169
                te3.hj1 r1 = r1.mo12861q3()
                int r1 = r1.f134675i
                goto L_0x016a
            L_0x0169:
                r1 = 0
            L_0x016a:
                di3.d r8 = di3.C86312j.m106911c(r13)
                ls3.f r8 = (ls3.C10649f) r8
                rx3.l r8 = r8.mo10915sr(r12, r5)
                A r9 = r8.f38555d
                r22 = r9
                java.util.List r22 = (java.util.List) r22
                B r8 = r8.f38556e
                java.lang.Number r8 = (java.lang.Number) r8
                int r23 = r8.intValue()
                te3.c90 r8 = new te3.c90
                r8.<init>()
                r8.f182444d = r15
                r8.f182445e = r15
                r9 = 0
                r8.f182446f = r9
                r9 = 2
                r8.f182447g = r9
                r9 = -1
                r8.f182448h = r9
                r9 = 1
                r8.f182449i = r9
                te3.ro2 r9 = new te3.ro2
                r9.<init>()
                r9.f185214e = r1
                if (r14 == 0) goto L_0x01a2
                r16 = r0
            L_0x01a2:
                if (r16 == 0) goto L_0x01b0
                com.tencent.mm.plugin.finder.storage.FinderItem r0 = r16.mo3513o()
                if (r0 == 0) goto L_0x01b0
                java.lang.String r0 = r0.getNickName()
                if (r0 != 0) goto L_0x01b1
            L_0x01b0:
                r0 = r15
            L_0x01b1:
                r9.f185215f = r0
                r8.f182450j = r9
                di3.d r0 = di3.C86312j.m106911c(r13)
                r19 = r0
                ls3.f r19 = (ls3.C10649f) r19
                com.tencent.mm.ui.MMActivity r0 = r7.f30578d
                r21 = 0
                r25 = 0
                r20 = r0
                r24 = r8
                r19.mo10913cP(r20, r21, r22, r23, r24, r25)
            L_0x01ca:
                r8 = 1
                goto L_0x01d2
            L_0x01cc:
                r28 = r0
            L_0x01ce:
                r29 = r1
                r9 = 0
                r8 = 0
            L_0x01d2:
                if (r8 == 0) goto L_0x01e4
                kf1.qa r0 = r6.f30585e
                java.lang.String r0 = r0.f30581g
                java.lang.String r1 = "item click is Live!"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                r0 = r29
                j20.C117292a.m165361g(r6, r2, r3, r4, r0)
                goto L_0x0339
            L_0x01e4:
                r0 = r29
                android.content.Intent r1 = new android.content.Intent
                r1.<init>()
                f40.o r7 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r7 = r7.mo121142i()
                er1.w3 r8 = er1.C58784w3.f168295a
                r9 = 2
                com.tencent.mm.storage.y1$a r9 = r8.mo83914a0(r9)
                java.lang.Object r7 = r7.mo119685f(r9, r15)
                java.lang.String r9 = "null cannot be cast to non-null type kotlin.String"
                gy3.C87412m.m108592e(r7, r9)
                java.lang.String r7 = (java.lang.String) r7
                byte[] r7 = com.tencent.p014mm.sdk.platformtools.Util.decodeHexString(r7)
                com.tencent.mm.plugin.finder.feed.model.x0 r9 = new com.tencent.mm.plugin.finder.feed.model.x0
                java.util.ArrayList<cm1.i2> r10 = r6.f30584d
                r12 = r28
                r9.<init>(r12, r10)
                kf1.pa r10 = kf1.C9931pa.f30568d
                java.lang.String r12 = "filterLogic"
                gy3.C87412m.m108594g(r10, r12)
                java.lang.String r12 = r9.f14088c
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = "before filterFeed "
                r13.append(r14)
                r13.append(r9)
                java.lang.String r13 = r13.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r13)
                int r12 = r9.f14086a
                java.util.List<cm1.i2> r13 = r9.f14087b
                cm1.i2 r8 = r8.mo83901T(r12, r13)
                java.util.ArrayList r12 = new java.util.ArrayList
                r12.<init>()
                java.util.List<cm1.i2> r13 = r9.f14087b
                java.util.Iterator r13 = r13.iterator()
            L_0x0242:
                boolean r14 = r13.hasNext()
                if (r14 == 0) goto L_0x025e
                java.lang.Object r14 = r13.next()
                cm1.i2 r14 = (cm1.C0740i2) r14
                java.lang.Object r16 = r10.invoke(r14)
                java.lang.Boolean r16 = (java.lang.Boolean) r16
                boolean r16 = r16.booleanValue()
                if (r16 != 0) goto L_0x0242
                r12.add(r14)
                goto L_0x0242
            L_0x025e:
                er1.w3 r10 = er1.C58784w3.f168295a
                int r8 = r10.mo83948m0(r8, r12)
                com.tencent.mm.plugin.finder.feed.model.x0 r13 = new com.tencent.mm.plugin.finder.feed.model.x0
                r13.<init>(r8, r12)
                java.lang.String r8 = r9.f14088c
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r12 = "after filterFeed "
                r9.append(r12)
                r9.append(r13)
                java.lang.String r9 = r9.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)
                int r8 = r13.f14086a
                java.util.List<cm1.i2> r9 = r13.f14087b
                pe3.b r22 = pe3.C89349b.m111674a(r7)
                r24 = 0
                r25 = 16
                r26 = 0
                r19 = r10
                r20 = r8
                r21 = r9
                r23 = r1
                er1.C58784w3.m68427B1(r19, r20, r21, r22, r23, r24, r25, r26)
                java.lang.String r7 = "KEY_UI_TITLE"
                r1.putExtra(r7, r15)
                java.lang.String r7 = "KEY_SAVE_RESULT"
                r8 = 1
                r1.putExtra(r7, r8)
                rs1.s8$a r7 = rs1.C13442s8.f38060Q0
                android.content.Context r13 = r49.getContext()
                java.lang.String r8 = "view.context"
                gy3.C87412m.m108593f(r13, r8)
                r15 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 252(0xfc, float:3.53E-43)
                r23 = 0
                r12 = r7
                r14 = r1
                rs1.C13442s8.C13443a.m12791e(r12, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23)
                di3.d r9 = di3.C86312j.m106911c(r11)
                er1.b r9 = (er1.C58684b) r9
                kf1.qa r10 = r6.f30585e
                com.tencent.mm.ui.MMActivity r11 = r10.f30578d
                r10 = 501(0x1f5, float:7.02E-43)
                r9.getClass()
                java.lang.String r9 = "context"
                gy3.C87412m.m108594g(r11, r9)
                java.lang.Class<com.tencent.mm.plugin.finder.feed.ui.FinderLbsStreamListUI> r9 = com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLbsStreamListUI.class
                r1.setClass(r11, r9)
                k20.a r9 = new k20.a
                r9.<init>()
                java.lang.ThreadLocal<k20.a> r12 = k20.C60958c.f173611a
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                r9.mo10233c(r10)
                r9.mo10233c(r1)
                java.lang.Object[] r12 = r9.mo10232b()
                java.lang.String r13 = "com/tencent/mm/plugin/finder/utils/ActivityRouter"
                java.lang.String r14 = "enterLbsStreamListUI"
                java.lang.String r15 = "(Landroid/app/Activity;Landroid/content/Intent;I)V"
                java.lang.String r16 = "android/app/Activity"
                java.lang.String r17 = "startActivityForResult"
                java.lang.String r18 = "(Landroid/content/Intent;I)V"
                j20.C117292a.m165364j(r11, r12, r13, r14, r15, r16, r17, r18)
                android.content.Context r1 = r49.getContext()
                gy3.C87412m.m108593f(r1, r8)
                rs1.s8 r1 = r7.mo12873f(r1)
                if (r1 == 0) goto L_0x0336
                te3.hj1 r8 = r1.mo12861q3()
                kf1.qa r1 = r6.f30585e
                java.lang.Class<dp1.y0> r7 = dp1.C58417y0.class
                di3.d r7 = di3.C86312j.m106911c(r7)
                java.lang.String r9 = "getService(FinderReportLogic::class.java)"
                gy3.C87412m.m108593f(r7, r9)
                dp1.y0 r7 = (dp1.C58417y0) r7
                long r9 = r5.getItemId()
                com.tencent.mm.view.RefreshLoadMoreLayout r1 = r1.mo10455p()
                androidx.recyclerview.widget.RecyclerView r11 = r1.getRecyclerView()
                r12 = 0
                r13 = 0
                r14 = 24
                r15 = 0
                dp1.C58417y0.Qx0(r7, r8, r9, r11, r12, r13, r14, r15)
            L_0x0336:
                j20.C117292a.m165361g(r6, r2, r3, r4, r0)
            L_0x0339:
                java.lang.String r0 = "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroid/view/View;ILandroidx/recyclerview/widget/RecyclerView$ViewHolder;)V"
                j20.C117292a.m165361g(r6, r2, r3, r4, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kf1.C9941qa.C9942a.mo734q(androidx.recyclerview.widget.RecyclerView$e, android.view.View, int, androidx.recyclerview.widget.RecyclerView$z):void");
        }
    }

    /* renamed from: kf1.qa$b */
    public static final class C9943b extends RefreshLoadMoreLayout.C57879a {

        /* renamed from: a */
        public final /* synthetic */ C9941qa f30586a;

        public C9943b(C9941qa qaVar) {
            this.f30586a = qaVar;
        }

        /* renamed from: b */
        public void mo2561b(int i) {
            this.f30586a.f30579e.onLoadMore();
        }

        /* renamed from: c */
        public void mo2562c(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            C20480e0.m22094n(C20480e0.f57583a, 2, false, (C49712hj1) null, false, 0, false, 60, (Object) null);
        }

        /* renamed from: d */
        public void mo3680d(int i) {
            C13442s8 f;
            this.f30586a.f30579e.onRefresh();
            if (i == 1) {
                C37521f.f99374d.getClass();
                if (C37521f.f99420i1.mo60266n().intValue() == 1 && (f = C13442s8.f38060Q0.mo12873f(this.f30586a.f30578d)) != null) {
                    C7335d c = C86312j.m106911c(C58417y0.class);
                    C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
                    ((C58417y0) c).zx0(f.mo12861q3(), 3, 0);
                }
            }
        }

        /* renamed from: e */
        public void mo3681e(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            this.f30586a.f30579e.onRefreshEnd(cVar);
            C20480e0.m22094n(C20480e0.f57583a, 2, false, ((C13442s8) C39818r.f106831a.mo62444c(this.f30586a.f30578d).mo75002a(C13442s8.class)).mo12861q3(), false, 0, false, 56, (Object) null);
        }
    }

    /* renamed from: kf1.qa$c */
    public static final class C9944c extends WxRecyclerAdapter<C0740i2> {
        public C9944c(ArrayList<C0740i2> arrayList, C9500j jVar) {
            super(jVar, arrayList, false);
        }

        /* renamed from: z6 */
        public void onViewAttachedToWindow(C60905o oVar) {
            C87412m.m108594g(oVar, "holder");
            super.onViewAttachedToWindow(oVar);
            ViewGroup.LayoutParams layoutParams = oVar.f44854d.getLayoutParams();
            if (layoutParams != null && (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams)) {
                StaggeredGridLayoutManager.LayoutParams layoutParams2 = (StaggeredGridLayoutManager.LayoutParams) layoutParams;
                int i = oVar.f44859i;
                layoutParams2.f44911i = i == -1 || i == 2003;
            }
        }
    }

    /* renamed from: kf1.qa$d */
    public static final class C9945d extends C87413o implements C32226l<Integer, C60896i<?>> {

        /* renamed from: d */
        public final /* synthetic */ C9941qa f30587d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9945d(C9941qa qaVar) {
            super(1);
            this.f30587d = qaVar;
        }

        public Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            if (intValue == -1) {
                return new C14443a1(new C9964ra(this.f30587d), new C9977sa(this.f30587d), false, 4, (C8480h) null);
            }
            C58784w3.f168295a.mo83916b("RecyclerViewAdapterEx", intValue);
            return new C14590p();
        }
    }

    /* renamed from: kf1.qa$e */
    public static final class C9946e extends C87413o implements C32224a<RefreshLoadMoreLayout> {

        /* renamed from: d */
        public final /* synthetic */ C9941qa f30588d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9946e(C9941qa qaVar) {
            super(0);
            this.f30588d = qaVar;
        }

        public Object invoke() {
            return (RefreshLoadMoreLayout) this.f30588d.f30580f.findViewById(C0966R.C0970id.ivb);
        }
    }

    public C9941qa(MMActivity mMActivity, C9930p9<C0740i2> p9Var, View view) {
        C87412m.m108594g(mMActivity, "baseContext");
        C87412m.m108594g(p9Var, "presenter");
        C87412m.m108594g(view, "parent");
        this.f30578d = mMActivity;
        this.f30579e = p9Var;
        this.f30580f = view;
        this.f30582h = new FinderLbsStaggeredConfig(mMActivity);
        this.f30583i = C36568h.m40985a(new C9946e(this));
    }

    /* renamed from: c */
    public RefreshLoadMoreLayout mo10293c() {
        return mo10455p();
    }

    /* renamed from: d */
    public void mo10294d(ArrayList<C0740i2> arrayList) {
        C87412m.m108594g(arrayList, "data");
        Resources resources = MMApplicationContext.getContext().getResources();
        mo10455p().setLimitTopRequest(((int) resources.getDimension(C0966R.dimen.a8a)) - ((int) resources.getDimension(C0966R.dimen.f3709c2)));
        mo10455p().setRefreshTargetY(((int) resources.getDimension(C0966R.dimen.f3758d_)) - ((int) resources.getDimension(C0966R.dimen.a8a)));
        mo10455p().setDamping(1.85f);
        RecyclerView recyclerView = mo10455p().getRecyclerView();
        C14367u0 u0Var = this.f30582h;
        Context context = this.f30580f.getContext();
        C87412m.m108593f(context, "parent.context");
        recyclerView.setLayoutManager(u0Var.mo3666d(context));
        ((FinderLbsStaggeredConfig) this.f30582h).getClass();
        recyclerView.mo17085h0(new FinderLbsStaggeredConfig.C3627a());
        recyclerView.setRecycledViewPool(this.f30582h.mo3667e(this.f30578d));
        RecyclerView.C16616j itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f44810f = 0;
        }
        C14367u0 u0Var2 = this.f30582h;
        C9945d dVar = new C9945d(this);
        FinderLbsStaggeredConfig finderLbsStaggeredConfig = (FinderLbsStaggeredConfig) u0Var2;
        finderLbsStaggeredConfig.getClass();
        C9944c cVar = new C9944c(arrayList, new FinderLbsStaggeredConfig$getItemConvertFactory$1(finderLbsStaggeredConfig, dVar));
        cVar.f173488o = new C9942a(arrayList, this);
        recyclerView.setAdapter(cVar);
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemViewCacheSize(4);
        C37521f.f99374d.getClass();
        ((WxRecyclerView) recyclerView).setFlingSpeedFactor(C37521f.f99262Q1.mo60266n().intValue());
        mo10455p().setActionCallback(new C9943b(this));
        C39622i0 a = C39818r.f106831a.mo62444c(this.f30578d).mo75002a(C13442s8.class);
        C87412m.m108593f(a, "UICProvider.of(getActivi…rReporterUIC::class.java)");
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        C58556f j3 = ((C13442s8) a).mo12854j3(-1);
        if (j3 != null) {
            j3.mo83455c(recyclerView);
        }
    }

    public MMFragmentActivity getActivity() {
        return this.f30578d;
    }

    public RecyclerView getRecyclerView() {
        return mo10455p().getRecyclerView();
    }

    /* renamed from: p */
    public final RefreshLoadMoreLayout mo10455p() {
        Object value = ((C36570n) this.f30583i).getValue();
        C87412m.m108593f(value, "<get-rlLayout>(...)");
        return (RefreshLoadMoreLayout) value;
    }
}
