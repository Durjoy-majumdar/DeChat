package lm1;

import ak1.C54059a;
import an1.C0090c;
import android.graphics.Color;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import cm1.C0740i2;
import cm1.C0784u1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.nearby.base.AbsNearByFragment;
import com.tencent.p014mm.plugin.finder.nearby.live.NearbyLiveItemConvertFactory;
import com.tencent.p014mm.plugin.finder.nearby.live.NearbyLiveViewCallback$initRecyclerView$1;
import com.tencent.p014mm.plugin.finder.view.FinderRefreshLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.p014mm.view.refreshLayout.WxRefreshLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import fy3.C32224a;
import gg1.C32444a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import jq3.C60905o;
import jq3.C9493c;
import jq3.C9496f;
import kf1.C9833k9;
import l31.C61212e;
import mm1.C10934a;
import oq3.C21804c;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C90364q0;
import te3.C49712hj1;
import te3.C51124rl1;
import te3.C51942x91;
import up1.C37521f;
import zp3.C16389w;

/* renamed from: lm1.j */
public class C10554j implements C10545c<C0740i2> {

    /* renamed from: d */
    public final MMActivity f31843d;

    /* renamed from: e */
    public final AbsNearByFragment f31844e;

    /* renamed from: f */
    public final C10544b<C0740i2> f31845f;

    /* renamed from: g */
    public final View f31846g;

    /* renamed from: h */
    public final C49712hj1 f31847h;

    /* renamed from: i */
    public final boolean f31848i;

    /* renamed from: j */
    public final C51942x91 f31849j;

    /* renamed from: n */
    public final C13601g f31850n = C36568h.m40985a(new C10560f(this));

    /* renamed from: o */
    public final C13601g f31851o = C36568h.m40985a(new C10559e(this));

    /* renamed from: p */
    public final C13601g f31852p = C36568h.m40985a(new C10558d(this));

    /* renamed from: q */
    public final C13601g f31853q;

    /* renamed from: r */
    public final C13601g f31854r;

    /* renamed from: s */
    public final C13601g f31855s;

    /* renamed from: t */
    public C54059a f31856t;

    /* renamed from: u */
    public WxRecyclerAdapter<C0740i2> f31857u;

    /* renamed from: v */
    public final C10575t f31858v;

    /* renamed from: w */
    public final C10565k f31859w;

    /* renamed from: lm1.j$a */
    public static final class C10555a extends RecyclerView.C0129l {

        /* renamed from: d */
        public final int f31860d;

        public C10555a(int i) {
            this.f31860d = i;
        }

        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            C87412m.m108594g(rect, "outRect");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(recyclerView, "parent");
            C87412m.m108594g(wVar, "state");
            C10934a aVar = C10934a.f32583a;
            int b = (int) aVar.mo11133b(this.f31860d);
            int b2 = ((int) aVar.mo11133b(this.f31860d)) / 2;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams");
            if (((StaggeredGridLayoutManager.LayoutParams) layoutParams).f44911i) {
                RecyclerView.C16631z P0 = recyclerView.mo17031P0(view);
                C9493c cVar = null;
                C60905o oVar = P0 instanceof C60905o ? (C60905o) P0 : null;
                int j = oVar != null ? oVar.mo17363j() : -1;
                C9493c cVar2 = oVar != null ? (C9493c) oVar.f173503E : null;
                if (cVar2 instanceof C9493c) {
                    cVar = cVar2;
                }
                int dimensionPixelSize = MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.a6h);
                if (cVar instanceof C0784u1) {
                    C51124rl1 rl12 = ((C0784u1) cVar).f1834d;
                    Log.m105924i("NearbyLiveViewCallback", "getItemOffsets divider:" + rl12.f141000f + '-' + rl12.f141001g + '-' + rl12.f140999e);
                    if (rl12.f141000f != 6) {
                        return;
                    }
                    if (j == 0) {
                        rect.left = MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3736cp) + 1;
                        rect.right = MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3736cp);
                        rect.bottom = b2;
                        rect.top = MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3703bv);
                        return;
                    }
                    rect.left = MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3736cp) + 1;
                    rect.right = MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3736cp);
                    rect.bottom = b2;
                    rect.top = dimensionPixelSize;
                } else if ((cVar instanceof C9833k9) || (cVar instanceof C0090c)) {
                    rect.left = b;
                    rect.right = b;
                    rect.bottom = b2;
                    rect.top = b2;
                }
            } else {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams");
                if (((StaggeredGridLayoutManager.LayoutParams) layoutParams2).mo17429e() % 2 == 0) {
                    rect.left = b;
                    rect.right = b2;
                    rect.bottom = b2;
                    rect.top = b2;
                    return;
                }
                rect.left = b2;
                rect.right = b;
                rect.bottom = b2;
                rect.top = b2;
            }
        }
    }

    /* renamed from: lm1.j$b */
    public final class C10556b extends RecyclerView.C16613e<C10557c> {

        /* renamed from: d */
        public int f31861d;

        /* renamed from: e */
        public final LinkedList<C51942x91> f31862e;

        /* renamed from: f */
        public final /* synthetic */ C10554j f31863f;

        public C10556b(C10554j jVar, C51942x91 x912) {
            C87412m.m108594g(x912, "parentTab");
            this.f31863f = jVar;
            LinkedList<C51942x91> linkedList = new LinkedList<>();
            this.f31862e = linkedList;
            if (!x912.f144537j.isEmpty()) {
                linkedList.add(0, x912);
                LinkedList<C51942x91> linkedList2 = x912.f144537j;
                C87412m.m108593f(linkedList2, "parentTab.sub_tab_list");
                ArrayList arrayList = new ArrayList();
                for (T next : linkedList2) {
                    String str = ((C51942x91) next).f144532e;
                    if (!(str == null || str.length() == 0)) {
                        arrayList.add(next);
                    }
                }
                linkedList.addAll(arrayList);
            }
        }

        public int getItemCount() {
            return this.f31862e.size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C10557c cVar = (C10557c) zVar;
            Class cls = C61212e.class;
            C87412m.m108594g(cVar, "holder");
            C51942x91 x912 = this.f31862e.get(i);
            C87412m.m108593f(x912, "dataList[position]");
            C51942x91 x913 = x912;
            if (i == 0) {
                TextView textView = cVar.f31865z;
                textView.setText(textView.getContext().getResources().getString(C0966R.string.m1n));
            } else {
                cVar.f31865z.setText(x913.f144532e);
            }
            if (this.f31861d == i) {
                View view = cVar.f31864A;
                view.setBackground(view.getContext().getResources().getDrawable(C0966R.C0969drawable.b6w));
                cVar.f31865z.setTextColor(Color.parseColor("#E6000000"));
            } else {
                View view2 = cVar.f31864A;
                view2.setBackground(view2.getContext().getResources().getDrawable(C0966R.C0969drawable.b6v));
                TextView textView2 = cVar.f31865z;
                textView2.setTextColor(textView2.getContext().getResources().getColor(C0966R.color.f3553xj));
            }
            cVar.f44854d.setOnClickListener(new C10566k(this, i, this.f31863f, x913));
            ((C61212e) C86312j.m106911c(cls)).o30(cVar.f44854d, "live_tab_page_label");
            ((C61212e) C86312j.m106911c(cls)).mo86175pO(cVar.f44854d, 40, 25388);
            C61212e eVar = (C61212e) C86312j.m106911c(cls);
            View view3 = cVar.f44854d;
            C13604l[] lVarArr = new C13604l[2];
            C49712hj1 hj12 = this.f31863f.f31847h;
            lVarArr[0] = new C13604l("comment_scene", hj12 != null ? Integer.valueOf(hj12.f134675i) : null);
            lVarArr[1] = new C13604l("live_tab_id", Integer.valueOf(x913.f144531d));
            eVar.mo86149PM(view3, C90364q0.m113147f(lVarArr));
            ((C61212e) C86312j.m106911c(cls)).E60(cVar.f44854d, new C10567l(this.f31863f));
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            View inflate = View.inflate(viewGroup.getContext(), C0966R.C0971layout.cnm, (ViewGroup) null);
            C87412m.m108593f(inflate, "inflate(parent.context, …ut.sub_tab_item_ui, null)");
            return new C10557c(inflate);
        }
    }

    /* renamed from: lm1.j$c */
    public static final class C10557c extends RecyclerView.C16631z {

        /* renamed from: A */
        public final View f31864A;

        /* renamed from: z */
        public final TextView f31865z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10557c(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f31865z = (TextView) view.findViewById(C0966R.C0970id.m_v);
            this.f31864A = view.findViewById(C0966R.C0970id.m_u);
        }
    }

    /* renamed from: lm1.j$d */
    public static final class C10558d extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C10554j f31866d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10558d(C10554j jVar) {
            super(0);
            this.f31866d = jVar;
        }

        public Object invoke() {
            return this.f31866d.f31846g.findViewById(C0966R.C0970id.bd8);
        }
    }

    /* renamed from: lm1.j$e */
    public static final class C10559e extends C87413o implements C32224a<WxRecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ C10554j f31867d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10559e(C10554j jVar) {
            super(0);
            this.f31867d = jVar;
        }

        public Object invoke() {
            return (WxRecyclerView) this.f31867d.f31846g.findViewById(C0966R.C0970id.kl7);
        }
    }

    /* renamed from: lm1.j$f */
    public static final class C10560f extends C87413o implements C32224a<FinderRefreshLayout> {

        /* renamed from: d */
        public final /* synthetic */ C10554j f31868d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10560f(C10554j jVar) {
            super(0);
            this.f31868d = jVar;
        }

        public Object invoke() {
            return (FinderRefreshLayout) this.f31868d.f31846g.findViewById(C0966R.C0970id.ivb);
        }
    }

    /* renamed from: lm1.j$g */
    public static final class C10561g extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C10554j f31869d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10561g(C10554j jVar) {
            super(0);
            this.f31869d = jVar;
        }

        public Object invoke() {
            return this.f31869d.f31846g.findViewById(C0966R.C0970id.iwn);
        }
    }

    /* renamed from: lm1.j$h */
    public static final class C10562h extends C87413o implements C32224a<WeImageView> {

        /* renamed from: d */
        public final /* synthetic */ C10554j f31870d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10562h(C10554j jVar) {
            super(0);
            this.f31870d = jVar;
        }

        public Object invoke() {
            return (WeImageView) this.f31870d.f31846g.findViewById(C0966R.C0970id.f359128j40);
        }
    }

    /* renamed from: lm1.j$i */
    public static final class C10563i extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C10554j f31871d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10563i(C10554j jVar) {
            super(0);
            this.f31871d = jVar;
        }

        public Object invoke() {
            return (TextView) this.f31871d.f31846g.findViewById(C0966R.C0970id.f359129j41);
        }
    }

    /* renamed from: lm1.j$j */
    public static final class C10564j extends C87413o implements C32224a<RecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ C10554j f31872d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10564j(C10554j jVar) {
            super(0);
            this.f31872d = jVar;
        }

        public Object invoke() {
            return (RecyclerView) this.f31872d.f31846g.findViewById(C0966R.C0970id.m_w);
        }
    }

    /* renamed from: lm1.j$k */
    public static final class C10565k extends FinderRefreshLayout.C3972b {

        /* renamed from: e */
        public final /* synthetic */ C10554j f31873e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10565k(C10554j jVar, FinderRefreshLayout finderRefreshLayout) {
            super(finderRefreshLayout);
            this.f31873e = jVar;
            C87412m.m108593f(finderRefreshLayout, "rlLayout");
        }

        public void onPreFinishRefresh(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            super.onPreFinishRefresh(cVar);
            this.f31873e.f31845f.onRefreshEnd(cVar);
        }
    }

    public C10554j(MMActivity mMActivity, AbsNearByFragment absNearByFragment, C10544b<C0740i2> bVar, View view, C49712hj1 hj12, boolean z, C51942x91 x912) {
        C87412m.m108594g(mMActivity, "baseContext");
        C87412m.m108594g(bVar, "presenter");
        C87412m.m108594g(view, "parent");
        C87412m.m108594g(hj12, "contextObj");
        this.f31843d = mMActivity;
        this.f31844e = absNearByFragment;
        this.f31845f = bVar;
        this.f31846g = view;
        this.f31847h = hj12;
        this.f31848i = z;
        this.f31849j = x912;
        Log.m105924i("NearbyLiveViewCallback", "#init");
        C36568h.m40985a(new C10561g(this));
        this.f31853q = C36568h.m40985a(new C10562h(this));
        this.f31854r = C36568h.m40985a(new C10563i(this));
        this.f31855s = C36568h.m40985a(new C10564j(this));
        this.f31856t = new C54059a();
        this.f31858v = new C10575t(hj12, mMActivity, absNearByFragment, bVar.getCommentScene(), bVar);
        this.f31859w = new C10565k(this, mo10826v());
    }

    /* renamed from: A */
    public void mo10815A(List<? extends C0740i2> list) {
        List<C0740i2> data;
        C87412m.m108594g(list, "cacheData");
        WxRecyclerAdapter<C0740i2> wxRecyclerAdapter = this.f31857u;
        if (!(wxRecyclerAdapter == null || (data = wxRecyclerAdapter.getData()) == null)) {
            data.clear();
            data.addAll(list);
        }
        WxRecyclerAdapter<C0740i2> wxRecyclerAdapter2 = this.f31857u;
        if (wxRecyclerAdapter2 != null) {
            wxRecyclerAdapter2.notifyDataSetChanged();
        }
    }

    /* renamed from: E */
    public void mo10816E(int i) {
        RecyclerView.C16613e adapter = mo10827x().getAdapter();
        C10556b bVar = adapter instanceof C10556b ? (C10556b) adapter : null;
        if (bVar != null) {
            bVar.f31861d = i;
        }
        RecyclerView.C16613e adapter2 = mo10827x().getAdapter();
        if (adapter2 != null) {
            adapter2.notifyDataSetChanged();
        }
    }

    /* renamed from: c */
    public WxRefreshLayout mo10817c() {
        FinderRefreshLayout v = mo10826v();
        C87412m.m108593f(v, "rlLayout");
        return v;
    }

    /* renamed from: d */
    public void mo10818d(ArrayList<C0740i2> arrayList) {
        LinkedList<C51942x91> linkedList;
        View view;
        TextView textView;
        C87412m.m108594g(arrayList, "data");
        C10575t tVar = this.f31858v;
        tVar.getClass();
        tVar.f31896g = arrayList;
        if (this.f31848i) {
            mo10826v().setBackgroundColor(this.f31846g.getResources().getColor(C0966R.color.f2947a4));
            ((View) ((C36570n) this.f31852p).getValue()).setBackgroundColor(this.f31846g.getResources().getColor(C0966R.color.f2947a4));
            mo10825p().setBackgroundDrawable(this.f31846g.getResources().getDrawable(C0966R.C0969drawable.f357192a23));
            ((TextView) ((C36570n) this.f31854r).getValue()).setTextColor(this.f31846g.getResources().getColor(C0966R.color.BW_0_Alpha_0_5_Night_Mode));
            ((WeImageView) ((C36570n) this.f31853q).getValue()).setIconColor(this.f31846g.getResources().getColor(C0966R.color.BW_0_Alpha_0_5_Night_Mode));
            C21804c loadMoreFooter = mo10826v().getLoadMoreFooter();
            if (!(loadMoreFooter == null || (view = loadMoreFooter.getView()) == null || (textView = (TextView) view.findViewById(C0966R.C0970id.g2t)) == null)) {
                textView.setTextColor(this.f31846g.getResources().getColor(C0966R.color.BW_100_Alpha_0_3));
            }
        } else {
            if (this.f31847h.f134675i == 112) {
                mo10826v().setBackgroundColor(this.f31846g.getResources().getColor(C0966R.color.BW_93));
                ((View) ((C36570n) this.f31852p).getValue()).setBackgroundColor(this.f31846g.getResources().getColor(C0966R.color.BW_93));
            } else {
                mo10826v().setBackgroundColor(this.f31846g.getResources().getColor(C0966R.color.BW_100));
                ((View) ((C36570n) this.f31852p).getValue()).setBackgroundColor(this.f31846g.getResources().getColor(C0966R.color.BW_100));
                ((TextView) ((C36570n) this.f31854r).getValue()).setTextColor(this.f31846g.getResources().getColor(C0966R.color.BW_0_Alpha_0_5));
                ((WeImageView) ((C36570n) this.f31853q).getValue()).setIconColor(this.f31846g.getResources().getColor(C0966R.color.BW_0_Alpha_0_5));
            }
        }
        mo10826v().setOnSimpleAction(new C10574s(this));
        WxRecyclerView p = mo10825p();
        NearbyLiveViewCallback$initRecyclerView$1 nearbyLiveViewCallback$initRecyclerView$1 = new NearbyLiveViewCallback$initRecyclerView$1();
        nearbyLiveViewCallback$initRecyclerView$1.setItemPrefetchEnabled(true);
        p.setLayoutManager(nearbyLiveViewCallback$initRecyclerView$1);
        mo10825p().mo17085h0(new C10555a(this.f31847h.f134675i));
        RecyclerView.C16616j itemAnimator = mo10825p().getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f44810f = 0;
        }
        MMActivity mMActivity = this.f31843d;
        C10544b<C0740i2> bVar = this.f31845f;
        boolean z = this.f31848i;
        int i = this.f31847h.f134675i;
        C10568m mVar = new C10568m(arrayList, new NearbyLiveItemConvertFactory(mMActivity, bVar, z, i == 112, i));
        this.f31857u = mVar;
        mVar.f173488o = new C10569n(arrayList, this);
        mVar.f173487n = new C10571p(arrayList, this);
        mo10825p().setAdapter(this.f31857u);
        mo10825p().setHasFixedSize(true);
        mo10825p().setItemViewCacheSize(8);
        WxRecyclerView p2 = mo10825p();
        C87412m.m108592e(p2, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.WxRecyclerView");
        C37521f.f99374d.getClass();
        p2.setFlingSpeedFactor(C37521f.f99271R1.mo60266n().intValue());
        WxRecyclerView p3 = mo10825p();
        C87412m.m108593f(p3, "recyclerView");
        C9496f.m9181b(p3, new C10572q(this), C10573r.f31888d);
        StringBuilder sb = new StringBuilder();
        sb.append("initSubTabView tab:");
        C51942x91 x912 = this.f31849j;
        Integer num = null;
        sb.append(x912 != null ? x912.f144532e : null);
        sb.append(" subTabCount:");
        C51942x91 x913 = this.f31849j;
        if (!(x913 == null || (linkedList = x913.f144537j) == null)) {
            num = Integer.valueOf(linkedList.size());
        }
        sb.append(num);
        Log.m105924i("NearbyLiveViewCallback", sb.toString());
        C51942x91 x914 = this.f31849j;
        if (x914 != null) {
            mo10827x().setLayoutManager(new LinearLayoutManager(mo10827x().getContext(), 0, false));
            mo10827x().setAdapter(new C10556b(this, x914));
            if (this.f31848i) {
                mo10827x().setBackgroundColor(mo10827x().getContext().getResources().getColor(C0966R.color.f2947a4));
            }
            if (x914.f144537j.isEmpty() || C32444a.f86187q1.mo60266n().intValue() != 1) {
                mo10827x().setVisibility(8);
            } else {
                mo10827x().setVisibility(0);
            }
        }
    }

    public MMFragmentActivity getActivity() {
        return this.f31843d;
    }

    public RecyclerView getRecyclerView() {
        return mo10825p();
    }

    /* renamed from: p */
    public final WxRecyclerView mo10825p() {
        return (WxRecyclerView) ((C36570n) this.f31851o).getValue();
    }

    /* renamed from: u */
    public C16389w mo10820u() {
        return this.f31859w;
    }

    /* renamed from: v */
    public final FinderRefreshLayout mo10826v() {
        return (FinderRefreshLayout) this.f31850n.getValue();
    }

    /* renamed from: x */
    public final RecyclerView mo10827x() {
        return (RecyclerView) ((C36570n) this.f31855s).getValue();
    }

    /* renamed from: y0 */
    public RecyclerView mo10821y0() {
        return mo10827x();
    }
}
