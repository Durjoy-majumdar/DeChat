package com.tencent.p014mm.plugin.finder.convert;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0740i2;
import cm1.C0745k0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.finder.feed.model.FinderTimelineFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.p052ui.OccupyFinderUI5;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.view.FinderFoldedScrollLayout;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import dp1.C7435f2;
import gy3.C87412m;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import kf1.C9860m9;
import kg3.C76577a;
import o40.C61926c;
import org.json.JSONObject;
import rs1.C13442s8;
import te3.C49712hj1;
import zp3.C23555k;
import zp3.C23564m;

/* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullFoldedConvert */
public final class FinderFeedFullFoldedConvert extends C60896i<C0745k0> {

    /* renamed from: e */
    public final C9860m9 f12771e;

    /* renamed from: f */
    public final C2402a f12772f = new C2402a(this);

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullFoldedConvert$a */
    public static final class C2402a implements FinderFoldedScrollLayout.C3953a {

        /* renamed from: a */
        public final /* synthetic */ FinderFeedFullFoldedConvert f12773a;

        /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullFoldedConvert$a$a */
        public static final class C2403a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ FinderFeedFullFoldedConvert f12774d;

            public C2403a(FinderFeedFullFoldedConvert finderFeedFullFoldedConvert) {
                this.f12774d = finderFeedFullFoldedConvert;
            }

            public final void run() {
                FinderTimelineFeedLoader O1 = this.f12774d.f12771e.mo2605O1();
                int i = OccupyFinderUI5.f14943w;
                O1.remove(OccupyFinderUI5.f14942v, true);
            }
        }

        public C2402a(FinderFeedFullFoldedConvert finderFeedFullFoldedConvert) {
            this.f12773a = finderFeedFullFoldedConvert;
        }

        /* renamed from: a */
        public ConstraintLayout.LayoutParams mo2386a() {
            return null;
        }

        /* renamed from: c */
        public boolean mo2387c() {
            return false;
        }

        /* renamed from: e */
        public int mo2388e() {
            return 0;
        }

        /* renamed from: f */
        public void mo2389f(C60905o oVar) {
            C87412m.m108594g(oVar, "holder");
            Object tag = oVar.mo85811C().getTag();
            C87412m.m108592e(tag, "null cannot be cast to non-null type java.util.ArrayList<com.tencent.mm.plugin.finder.model.BaseFinderFeed>{ kotlin.collections.TypeAliasesKt.ArrayList<com.tencent.mm.plugin.finder.model.BaseFinderFeed> }");
            ArrayList arrayList = (ArrayList) tag;
            WeakReference<RecyclerView> weakReference = this.f12773a.f12771e.mo2605O1().f13847j;
            RecyclerView recyclerView = weakReference != null ? weakReference.get() : null;
            BaseFinderFeed baseFinderFeed = (BaseFinderFeed) oVar.f173503E;
            this.f12773a.f12771e.mo2605O1().insertAll(arrayList, 1);
            Iterator it = this.f12773a.f12771e.mo2605O1().getDataListJustForAdapter().iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (baseFinderFeed.getItemId() == ((C0740i2) it.next()).getItemId()) {
                    break;
                }
                i++;
            }
            if (recyclerView != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i));
                RecyclerView recyclerView2 = recyclerView;
                C117292a.m165358d(recyclerView2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullFoldedConvert$foldedController$1", "onItemClick", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "Undefined", "smoothScrollToPosition", "(I)V");
                recyclerView.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(recyclerView2, "com/tencent/mm/plugin/finder/convert/FinderFeedFullFoldedConvert$foldedController$1", "onItemClick", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "Undefined", "smoothScrollToPosition", "(I)V");
            }
            if (recyclerView != null) {
                recyclerView.postDelayed(new C2403a(this.f12773a), 1000);
            }
            C39818r rVar = C39818r.f106831a;
            Context context = oVar.f173499A;
            C87412m.m108593f(context, "holder.context");
            C49712hj1 q3 = ((C13442s8) rVar.mo62443b(context).mo75002a(C13442s8.class)).mo12861q3();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("feedid", C61926c.m72691p(baseFinderFeed.getItemId()));
            jSONObject.put(FirebaseAnalytics.C113379b.INDEX, oVar.mo17363j() + 1);
            C7435f2.f25626a.mo8577a(q3, "video_card_rec", 1, jSONObject);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullFoldedConvert$b */
    public static final class C2404b extends RecyclerView.C0129l {

        /* renamed from: d */
        public final int f12775d = C76577a.m92150a(MMApplicationContext.getContext(), 5.0f);

        /* renamed from: e */
        public final int f12776e = C76577a.m92150a(MMApplicationContext.getContext(), 12.0f);

        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            C87412m.m108594g(rect, "outRect");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(recyclerView, "parent");
            C87412m.m108594g(wVar, "state");
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager.LayoutParams");
            GridLayoutManager.LayoutParams layoutParams2 = (GridLayoutManager.LayoutParams) layoutParams;
            int N0 = recyclerView.mo17029N0(view);
            C87412m.m108591d(gridLayoutManager);
            int i = gridLayoutManager.f44669w;
            if (gridLayoutManager.f44666B.mo116a(N0, i) == 0) {
                rect.bottom = this.f12776e;
                rect.top = this.f12775d;
            }
            if (layoutParams2.f44674i == i) {
                int i2 = this.f12775d;
                rect.left = i2;
                rect.right = i2;
                return;
            }
            int i3 = this.f12775d;
            rect.left = i3;
            rect.right = i3;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullFoldedConvert$c */
    public static final class C2405c extends C23555k.C23562d {

        /* renamed from: a */
        public final /* synthetic */ ArrayList<BaseFinderFeed> f12777a;

        public C2405c(ArrayList<BaseFinderFeed> arrayList) {
            this.f12777a = arrayList;
        }

        /* renamed from: b */
        public void mo53b(View view, long j, long j2, boolean z) {
            C87412m.m108594g(view, "view");
            if (z) {
                C39818r rVar = C39818r.f106831a;
                Context context = view.getContext();
                C87412m.m108593f(context, "view.context");
                C49712hj1 q3 = ((C13442s8) rVar.mo62443b(context).mo75002a(C13442s8.class)).mo12861q3();
                for (BaseFinderFeed itemId : this.f12777a) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("feedid", C61926c.m72691p(itemId.getItemId()));
                    C7435f2.f25626a.mo8577a(q3, "video_card_rec", 0, jSONObject);
                }
            }
        }
    }

    public FinderFeedFullFoldedConvert(C9860m9 m9Var) {
        C87412m.m108594g(m9Var, "presenter");
        this.f12771e = m9Var;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.ac6;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g((C0745k0) cVar, "item");
        Object tag = ((WxRecyclerView) oVar.mo85812D(C0966R.C0970id.egn)).getTag();
        C87412m.m108592e(tag, "null cannot be cast to non-null type java.util.ArrayList<com.tencent.mm.plugin.finder.model.BaseFinderFeed>{ kotlin.collections.TypeAliasesKt.ArrayList<com.tencent.mm.plugin.finder.model.BaseFinderFeed> }");
        ((ArrayList) tag).clear();
        throw null;
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        GridLayoutManager gridLayoutManager = new GridLayoutManager(recyclerView.getContext(), 2);
        WxRecyclerView wxRecyclerView = (WxRecyclerView) oVar.mo85812D(C0966R.C0970id.egn);
        wxRecyclerView.setLayoutManager(gridLayoutManager);
        wxRecyclerView.mo17085h0(new C2404b());
        ArrayList arrayList = new ArrayList();
        wxRecyclerView.setTag(arrayList);
        wxRecyclerView.setAdapter(new WxRecyclerAdapter(new FinderFeedFullFoldedConvert$onCreateViewHolder$2(this), arrayList, true));
        int f = C75044y4.m89994f(oVar.f173499A);
        int a = C75044y4.m89989a(oVar.f173499A);
        float dimension = oVar.f173499A.getResources().getDimension(C0966R.dimen.f3736cp);
        ViewGroup.LayoutParams layoutParams = oVar.mo85812D(C0966R.C0970id.koz).getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((LinearLayout.LayoutParams) layoutParams).topMargin = f + a + ((int) dimension);
        C23564m.m28138h(wxRecyclerView, new C2405c(arrayList));
    }
}
