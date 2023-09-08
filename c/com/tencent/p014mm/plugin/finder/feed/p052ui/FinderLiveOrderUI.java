package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.order.OrderTabFragment;
import com.tencent.p014mm.plugin.finder.order.p054ui.OrderTabView;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.plugin.finder.view.FinderViewPager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import ks3.C10410m;
import o40.C61926c;
import ob0.C89132b;
import rx3.C13598b0;
import sn1.C13735a;
import sx3.C110818d0;
import sx3.C22415w0;
import sx3.C64197v;
import te3.C49520g60;
import te3.C50221l60;
import tn1.C14051a;
import tn1.C14056f;
import tn1.C14057l;
import un1.C65411a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveOrderUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveOrderUI */
public final class FinderLiveOrderUI extends MMFinderUI {

    /* renamed from: y */
    public static final /* synthetic */ int f14528y = 0;

    /* renamed from: o */
    public FinderViewPager f14529o;

    /* renamed from: p */
    public OrderTabView f14530p;

    /* renamed from: q */
    public ViewGroup f14531q;

    /* renamed from: r */
    public TextView f14532r;

    /* renamed from: s */
    public View f14533s;

    /* renamed from: t */
    public View f14534t;

    /* renamed from: u */
    public String f14535u = "";

    /* renamed from: v */
    public final ArrayList<C14057l> f14536v = new ArrayList<>();

    /* renamed from: w */
    public final ArrayList<OrderTabFragment> f14537w = new ArrayList<>();

    /* renamed from: x */
    public int f14538x;

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveOrderUI$a */
    public static final class C2966a extends C87413o implements C32226l<C89132b.C89134c<C49520g60>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveOrderUI f14539d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2966a(FinderLiveOrderUI finderLiveOrderUI) {
            super(1);
            this.f14539d = finderLiveOrderUI;
        }

        public Object invoke(Object obj) {
            RecyclerView.C16613e adapter;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            C13735a.C13736a aVar = C13735a.f38834t;
            int i = C10410m.f31638a;
            int i2 = 0;
            List<Integer> a = aVar.mo13109a(C64197v.m75537f(0, 1, 2, 4, 3));
            FinderLiveOrderUI finderLiveOrderUI = this.f14539d;
            Iterator it = ((ArrayList) a).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    int intValue = ((Number) next).intValue();
                    C14057l lVar = (C14057l) C110818d0.m150917O(finderLiveOrderUI.f14536v, i2);
                    if (lVar != null) {
                        int i4 = lVar.f39432d;
                        int i5 = C10410m.f31638a;
                        if (i4 != 0) {
                            lVar.f39434f = intValue;
                        }
                    }
                    i2 = i3;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            OrderTabView orderTabView = this.f14539d.f14530p;
            if (orderTabView != null) {
                Log.m105924i(orderTabView.f15853d, "refresh");
                WxRecyclerView wxRecyclerView = orderTabView.f15855f;
                if (!(wxRecyclerView == null || (adapter = wxRecyclerView.getAdapter()) == null)) {
                    adapter.notifyDataSetChanged();
                }
                return C13598b0.f38549a;
            }
            C87412m.m108603p("tabView");
            throw null;
        }
    }

    /* renamed from: N7 */
    public static final void m2860N7(FinderLiveOrderUI finderLiveOrderUI, String str) {
        if (!C87412m.m108589b(finderLiveOrderUI.f14535u, str)) {
            finderLiveOrderUI.f14535u = str;
            Iterator<OrderTabFragment> it = finderLiveOrderUI.f14537w.iterator();
            while (it.hasNext()) {
                OrderTabFragment next = it.next();
                next.getClass();
                C87412m.m108594g(str, "appId");
                C14056f fVar = next.f15835s;
                if (fVar != null) {
                    fVar.f39431i = str;
                    next.mo3685S();
                } else {
                    C87412m.m108603p("feedLoader");
                    throw null;
                }
            }
            finderLiveOrderUI.mo3025P7();
        }
    }

    /* renamed from: O7 */
    public final void mo3024O7(String str) {
        C14051a aVar;
        C50221l60 l602;
        C87412m.m108594g(str, "orderId");
        for (OrderTabFragment orderTabFragment : this.f14537w) {
            orderTabFragment.getClass();
            C14056f fVar = orderTabFragment.f15835s;
            String str2 = null;
            if (fVar != null) {
                Iterator<C14051a> it = fVar.f39430h.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        aVar = null;
                        break;
                    }
                    aVar = it.next();
                    if (C87412m.m108589b(aVar.f39399d.f137197d, str)) {
                        break;
                    }
                }
                C14051a aVar2 = aVar;
                if (!(aVar2 == null || (l602 = aVar2.f39399d) == null)) {
                    str2 = l602.f137208r;
                }
                orderTabFragment.f15838v = str2;
            } else {
                C87412m.m108603p("feedLoader");
                throw null;
            }
        }
    }

    /* renamed from: P7 */
    public final void mo3025P7() {
        C61926c.m72665J(new C13735a(this.f14535u).mo9225i(), new C2966a(this)).mo11397F(this);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.aiz;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C22415w0.m26092a(C65411a.class);
    }

    public boolean isHideStatusBar() {
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x031c  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x031f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            super.onCreate(r10)
            sn1.a$a r10 = sn1.C13735a.f38834t
            r0 = 5
            java.lang.Integer[] r0 = new java.lang.Integer[r0]
            int r1 = ks3.C10410m.f31638a
            r1 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r0[r1] = r2
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0[r2] = r3
            r3 = 2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r0[r3] = r4
            r4 = 4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r6 = 3
            r0[r6] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r0[r4] = r5
            java.util.List r0 = sx3.C64197v.m75537f(r0)
            java.util.List r10 = r10.mo13109a(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "tab count:"
            r0.append(r5)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "Finder.FinderLiveOrderUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            java.util.ArrayList<tn1.l> r0 = r9.f14536v
            tn1.l r5 = new tn1.l
            android.content.res.Resources r7 = r9.getResources()
            r8 = 2131828392(0x7f111ea8, float:1.9289724E38)
            java.lang.String r7 = r7.getString(r8)
            java.lang.String r8 = "resources.getString(R.st…ng.finder_live_order_all)"
            gy3.C87412m.m108593f(r7, r8)
            r5.<init>(r1, r7, r1)
            r0.add(r5)
            tn1.l r5 = new tn1.l
            android.content.res.Resources r7 = r9.getResources()
            r8 = 2131828431(0x7f111ecf, float:1.9289803E38)
            java.lang.String r7 = r7.getString(r8)
            java.lang.String r8 = "resources.getString(R.st…nder_live_order_wait_pay)"
            gy3.C87412m.m108593f(r7, r8)
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            java.lang.Object r8 = r10.get(r2)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r5.<init>(r2, r7, r8)
            r0.add(r5)
            tn1.l r5 = new tn1.l
            android.content.res.Resources r7 = r9.getResources()
            r8 = 2131828432(0x7f111ed0, float:1.9289805E38)
            java.lang.String r7 = r7.getString(r8)
            java.lang.String r8 = "resources.getString(R.st…der_live_order_wait_recv)"
            gy3.C87412m.m108593f(r7, r8)
            java.lang.Object r8 = r10.get(r3)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r5.<init>(r3, r7, r8)
            r0.add(r5)
            tn1.l r3 = new tn1.l
            android.content.res.Resources r5 = r9.getResources()
            r7 = 2131828430(0x7f111ece, float:1.92898E38)
            java.lang.String r5 = r5.getString(r7)
            java.lang.String r7 = "resources.getString(R.st…live_order_wait_evaluate)"
            gy3.C87412m.m108593f(r5, r7)
            java.lang.Object r7 = r10.get(r6)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r3.<init>(r4, r5, r7)
            r0.add(r3)
            tn1.l r3 = new tn1.l
            android.content.res.Resources r5 = r9.getResources()
            r7 = 2131828391(0x7f111ea7, float:1.9289722E38)
            java.lang.String r5 = r5.getString(r7)
            java.lang.String r7 = "resources.getString(R.st…er_live_order_after_sale)"
            gy3.C87412m.m108593f(r5, r7)
            java.lang.Object r10 = r10.get(r4)
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            r3.<init>(r6, r5, r10)
            r0.add(r3)
            java.util.ArrayList<tn1.l> r10 = r9.f14536v
            java.util.Iterator r10 = r10.iterator()
        L_0x00f6:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x010f
            java.lang.Object r0 = r10.next()
            tn1.l r0 = (tn1.C14057l) r0
            java.util.ArrayList<com.tencent.mm.plugin.finder.order.OrderTabFragment> r3 = r9.f14537w
            com.tencent.mm.plugin.finder.order.OrderTabFragment r4 = new com.tencent.mm.plugin.finder.order.OrderTabFragment
            int r0 = r0.f39432d
            r4.<init>(r0)
            r3.add(r4)
            goto L_0x00f6
        L_0x010f:
            r10 = 2131316254(0x7f094e1e, float:1.8250984E38)
            android.view.View r10 = r9.findViewById(r10)
            java.lang.String r0 = "findViewById(R.id.viewPager)"
            gy3.C87412m.m108593f(r10, r0)
            com.tencent.mm.plugin.finder.view.FinderViewPager r10 = (com.tencent.p014mm.plugin.finder.view.FinderViewPager) r10
            r9.f14529o = r10
            r10 = 2131310633(0x7f093829, float:1.8239584E38)
            android.view.View r10 = r9.findViewById(r10)
            java.lang.String r0 = "findViewById(R.id.order_tabview)"
            gy3.C87412m.m108593f(r10, r0)
            com.tencent.mm.plugin.finder.order.ui.OrderTabView r10 = (com.tencent.p014mm.plugin.finder.order.p054ui.OrderTabView) r10
            r9.f14530p = r10
            r10 = 2131300635(0x7f09111b, float:1.8219305E38)
            android.view.View r10 = r9.findViewById(r10)
            java.lang.String r0 = "findViewById(R.id.custom_action_bar)"
            gy3.C87412m.m108593f(r10, r0)
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            r9.f14531q = r10
            r10 = 2131300637(0x7f09111d, float:1.821931E38)
            android.view.View r10 = r9.findViewById(r10)
            java.lang.String r0 = "findViewById(R.id.custom_back_btn)"
            gy3.C87412m.m108593f(r10, r0)
            r9.f14533s = r10
            r10 = 2131302494(0x7f09185e, float:1.8223076E38)
            android.view.View r10 = r9.findViewById(r10)
            java.lang.String r0 = "findViewById(R.id.filter_title)"
            gy3.C87412m.m108593f(r10, r0)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r9.f14532r = r10
            r10 = 2131302485(0x7f091855, float:1.8223057E38)
            android.view.View r10 = r9.findViewById(r10)
            java.lang.String r0 = "findViewById(R.id.filter_option_area)"
            gy3.C87412m.m108593f(r10, r0)
            r9.f14534t = r10
            com.tencent.mm.plugin.finder.order.ui.OrderTabView r10 = r9.f14530p
            r0 = 0
            if (r10 == 0) goto L_0x033f
            vf1.b3 r3 = new vf1.b3
            r3.<init>(r9)
            r10.f15854e = r3
            java.util.ArrayList r4 = r3.mo13887a()
            android.content.Context r5 = r10.getContext()
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r5)
            r6 = 2131495124(0x7f0c08d4, float:1.8613776E38)
            r5.inflate(r6, r10, r2)
            r5 = 2131310627(0x7f093823, float:1.8239571E38)
            android.view.View r5 = r10.findViewById(r5)
            wn1.i r6 = new wn1.i
            r6.<init>(r10, r9)
            r5.setOnClickListener(r6)
            r5 = 2131310630(0x7f093826, float:1.8239577E38)
            android.view.View r5 = r10.findViewById(r5)
            com.tencent.mm.view.recyclerview.WxRecyclerView r5 = (com.tencent.p014mm.view.recyclerview.WxRecyclerView) r5
            r10.f15855f = r5
            androidx.recyclerview.widget.LinearLayoutManager r5 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r6 = r10.getContext()
            r5.<init>(r6, r1, r1)
            com.tencent.mm.view.recyclerview.WxRecyclerView r6 = r10.f15855f
            if (r6 != 0) goto L_0x01b1
            goto L_0x01b4
        L_0x01b1:
            r6.setLayoutManager(r5)
        L_0x01b4:
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r5 = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter
            com.tencent.mm.plugin.finder.order.ui.OrderTabView$buildItemCoverts$1 r6 = new com.tencent.mm.plugin.finder.order.ui.OrderTabView$buildItemCoverts$1
            r6.<init>()
            r5.<init>(r6, r4, r1)
            wn1.j r6 = new wn1.j
            r6.<init>(r5, r10, r4, r3)
            r5.f173488o = r6
            com.tencent.mm.view.recyclerview.WxRecyclerView r10 = r10.f15855f
            if (r10 != 0) goto L_0x01ca
            goto L_0x01cd
        L_0x01ca:
            r10.setAdapter(r5)
        L_0x01cd:
            com.tencent.mm.plugin.finder.view.FinderViewPager r10 = r9.f14529o
            java.lang.String r3 = "viewPager"
            if (r10 == 0) goto L_0x033b
            r10.setEnableViewPagerScroll(r2)
            com.tencent.mm.plugin.finder.view.FinderViewPager r10 = r9.f14529o
            if (r10 == 0) goto L_0x0337
            androidx.fragment.app.FragmentManager r3 = r9.getSupportFragmentManager()
            vf1.e3 r4 = new vf1.e3
            r4.<init>(r9, r3)
            vf1.d3 r3 = new vf1.d3
            r3.<init>(r9)
            r10.setAdapter(r4)
            java.util.ArrayList<tn1.l> r4 = r9.f14536v
            int r4 = r4.size()
            int r4 = r4 + r2
            r10.setOffscreenPageLimit(r4)
            r10.addOnPageChangeListener(r3)
            r10.setCurrentItem(r1, r1)
            vf1.c3 r4 = new vf1.c3
            r4.<init>(r3)
            r10.post(r4)
            android.content.Intent r10 = r9.getIntent()
            java.lang.String r3 = "FROM_APP_ID"
            java.lang.String r10 = r10.getStringExtra(r3)
            java.lang.String r3 = ""
            if (r10 != 0) goto L_0x0213
            r10 = r3
        L_0x0213:
            android.content.Intent r4 = r9.getIntent()
            java.lang.String r5 = "FROM_SHOP_NAME"
            java.lang.String r4 = r4.getStringExtra(r5)
            if (r4 != 0) goto L_0x0220
            goto L_0x0221
        L_0x0220:
            r3 = r4
        L_0x0221:
            int r4 = r10.length()
            if (r4 != 0) goto L_0x0229
            r4 = 1
            goto L_0x022a
        L_0x0229:
            r4 = 0
        L_0x022a:
            java.lang.String r5 = "customActionbar"
            if (r4 != 0) goto L_0x02e5
            int r4 = r3.length()
            if (r4 != 0) goto L_0x0236
            r4 = 1
            goto L_0x0237
        L_0x0236:
            r4 = 0
        L_0x0237:
            if (r4 == 0) goto L_0x023b
            goto L_0x02e5
        L_0x023b:
            android.view.Window r4 = r9.getWindow()
            android.view.View r4 = r4.getDecorView()
            java.lang.String r6 = "this.window.decorView"
            gy3.C87412m.m108593f(r4, r6)
            r6 = 1280(0x500, float:1.794E-42)
            r4.setSystemUiVisibility(r6)
            android.view.Window r4 = r9.getWindow()
            r4.setStatusBarColor(r1)
            com.tencent.p014mm.p136ui.C74779i.m89536a(r9, r1)
            androidx.appcompat.app.ActionBar r4 = r9.getSupportActionBar()
            if (r4 == 0) goto L_0x0269
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>(r1)
            r4.mo91112w(r6)
            r4.mo91104o()
        L_0x0269:
            com.tencent.mm.ui.MMActivityController r4 = r9.getController()
            boolean r6 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            r4.mo177049H0(r6)
            com.tencent.mm.ui.MMActivityController r4 = r9.getController()
            android.content.res.Resources r6 = r9.getResources()
            r7 = 2131101688(0x7f0607f8, float:1.7815793E38)
            int r6 = r6.getColor(r7)
            r4.mo177059O0(r9, r6)
            int r4 = com.tencent.p014mm.p136ui.C75044y4.m89994f(r9)
            android.view.ViewGroup r6 = r9.f14531q
            if (r6 == 0) goto L_0x02e1
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            int r7 = r6.height
            int r7 = r7 + r4
            r6.height = r7
            android.view.ViewGroup r7 = r9.f14531q
            if (r7 == 0) goto L_0x02dd
            r7.setLayoutParams(r6)
            android.view.ViewGroup r6 = r9.f14531q
            if (r6 == 0) goto L_0x02d9
            r6.setPadding(r1, r4, r1, r1)
            r9.f14535u = r10
            android.widget.TextView r1 = r9.f14532r
            if (r1 == 0) goto L_0x02d3
            r1.setText(r3)
            android.view.View r1 = r9.f14534t
            if (r1 == 0) goto L_0x02cd
            vf1.z2 r4 = new vf1.z2
            r4.<init>(r9, r10, r3)
            r1.setOnClickListener(r4)
            android.view.View r10 = r9.f14533s
            if (r10 == 0) goto L_0x02c7
            vf1.a3 r0 = new vf1.a3
            r0.<init>(r9)
            r10.setOnClickListener(r0)
            goto L_0x02fc
        L_0x02c7:
            java.lang.String r10 = "customBackBtn"
            gy3.C87412m.m108603p(r10)
            throw r0
        L_0x02cd:
            java.lang.String r10 = "filterOptionArea"
            gy3.C87412m.m108603p(r10)
            throw r0
        L_0x02d3:
            java.lang.String r10 = "filterTitle"
            gy3.C87412m.m108603p(r10)
            throw r0
        L_0x02d9:
            gy3.C87412m.m108603p(r5)
            throw r0
        L_0x02dd:
            gy3.C87412m.m108603p(r5)
            throw r0
        L_0x02e1:
            gy3.C87412m.m108603p(r5)
            throw r0
        L_0x02e5:
            android.view.ViewGroup r10 = r9.f14531q
            if (r10 == 0) goto L_0x0333
            r0 = 8
            r10.setVisibility(r0)
            r10 = 2131828395(0x7f111eab, float:1.928973E38)
            r9.setMMTitle((int) r10)
            vf1.f3 r10 = new vf1.f3
            r10.<init>(r9)
            r9.setBackBtn(r10)
        L_0x02fc:
            android.content.Intent r10 = r9.getIntent()
            java.lang.String r0 = "ORDER_FROM_SCENE"
            int r10 = r10.getIntExtra(r0, r2)
            r9.f14538x = r10
            bl3.r r10 = bl3.C39818r.f106831a
            bl3.r$a r10 = r10.mo62444c(r9)
            java.lang.Class<un1.a> r0 = un1.C65411a.class
            androidx.lifecycle.i0 r10 = r10.mo75002a(r0)
            un1.a r10 = (un1.C65411a) r10
            rx3.l r0 = new rx3.l
            int r1 = r9.f14538x
            if (r1 != r2) goto L_0x031f
            java.lang.String r1 = "my_finder_profile"
            goto L_0x0321
        L_0x031f:
            java.lang.String r1 = "live_room"
        L_0x0321:
            java.lang.String r2 = "current_page"
            r0.<init>(r2, r1)
            java.util.Map r0 = sx3.C90363p0.m113143b(r0)
            java.lang.String r1 = "enter_order_list"
            r10.mo89492c3(r1, r0)
            r9.mo3025P7()
            return
        L_0x0333:
            gy3.C87412m.m108603p(r5)
            throw r0
        L_0x0337:
            gy3.C87412m.m108603p(r3)
            throw r0
        L_0x033b:
            gy3.C87412m.m108603p(r3)
            throw r0
        L_0x033f:
            java.lang.String r10 = "tabView"
            gy3.C87412m.m108603p(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveOrderUI.onCreate(android.os.Bundle):void");
    }
}
