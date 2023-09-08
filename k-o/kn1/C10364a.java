package kn1;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import mm1.C10934a;
import te3.C51942x91;
import up1.C37521f;

/* renamed from: kn1.a */
public final class C10364a {

    /* renamed from: a */
    public final BaseFinderFeedLoader f31553a;

    /* renamed from: b */
    public final C51942x91 f31554b;

    /* renamed from: c */
    public final int f31555c;

    /* renamed from: d */
    public final String f31556d = "FeedStreamPreload";

    /* renamed from: e */
    public final boolean f31557e;

    /* renamed from: f */
    public final int f31558f;

    /* renamed from: g */
    public boolean f31559g;

    /* renamed from: h */
    public boolean f31560h;

    /* renamed from: i */
    public boolean f31561i;

    /* renamed from: j */
    public boolean f31562j;

    /* renamed from: k */
    public long f31563k;

    /* renamed from: kn1.a$a */
    public static final class C10365a extends RecyclerView.C0130p {

        /* renamed from: d */
        public final /* synthetic */ C10364a f31564d;

        public C10365a(C10364a aVar) {
            this.f31564d = aVar;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/nearby/preload/nextpage/NearbyNextPagePreload$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            super.onScrollStateChanged(recyclerView, i);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/nearby/preload/nextpage/NearbyNextPagePreload$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/nearby/preload/nextpage/NearbyNextPagePreload$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            C10364a aVar = this.f31564d;
            aVar.getClass();
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            C87412m.m108592e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager");
            FinderStaggeredGridLayoutManager finderStaggeredGridLayoutManager = (FinderStaggeredGridLayoutManager) layoutManager;
            RecyclerView.C16613e adapter = recyclerView.getAdapter();
            int itemCount = adapter != null ? adapter.getItemCount() : 0;
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            finderStaggeredGridLayoutManager.mo17394A(iArr);
            finderStaggeredGridLayoutManager.mo17395B(iArr2);
            int i3 = iArr2[1];
            if (i3 != -1 && itemCount - i3 <= aVar.f31558f && i2 > 0) {
                String str = aVar.f31556d;
                StringBuilder sb = new StringBuilder();
                sb.append("startPreload tabId:");
                C51942x91 x912 = aVar.f31554b;
                String str2 = null;
                sb.append(x912 != null ? Integer.valueOf(x912.f144531d) : null);
                sb.append('-');
                C51942x91 x913 = aVar.f31554b;
                if (x913 != null) {
                    str2 = x913.f144532e;
                }
                sb.append(str2);
                Log.m105924i(str, sb.toString());
                if (!aVar.f31557e) {
                    String str3 = aVar.f31556d;
                    Log.m105924i(str3, "startPreload return for open:" + aVar.f31557e);
                } else if (!aVar.f31559g) {
                    String str4 = aVar.f31556d;
                    Log.m105924i(str4, "startPreload return for hasInitDone:" + aVar.f31559g);
                } else if (aVar.f31560h) {
                    String str5 = aVar.f31556d;
                    Log.m105924i(str5, "startPreload return for isPreloading:" + aVar.f31560h);
                } else if (!aVar.f31561i) {
                    String str6 = aVar.f31556d;
                    Log.m105924i(str6, "startPreload return for hasMore:" + aVar.f31561i);
                } else if (aVar.f31562j) {
                    String str7 = aVar.f31556d;
                    Log.m105924i(str7, "startPreload return for isRefreshing:" + aVar.f31562j);
                } else if (!C10934a.f32583a.mo11132a("startPreload next page", aVar.f31554b, aVar.f31555c)) {
                    Log.m105924i(aVar.f31556d, "startPreload return for canStartPreload");
                } else {
                    aVar.f31553a.requestLoadMore(aVar.f31554b);
                    aVar.f31560h = true;
                    aVar.f31563k = System.currentTimeMillis();
                }
            }
            String str8 = aVar.f31556d;
            Log.m105918d(str8, "checkFocusItemChange newState:" + 0 + " dy:" + i2 + " visible[" + iArr[0] + ", " + iArr2[1] + "] itemCount:" + itemCount);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/nearby/preload/nextpage/NearbyNextPagePreload$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    public C10364a(RecyclerView recyclerView, BaseFinderFeedLoader baseFinderFeedLoader, C51942x91 x912, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(baseFinderFeedLoader, "feedLoader");
        this.f31553a = baseFinderFeedLoader;
        this.f31554b = x912;
        this.f31555c = i;
        C37521f.f99374d.getClass();
        this.f31557e = C37521f.f99241N4.mo60266n().intValue() == 1;
        this.f31558f = C37521f.f99248O4.mo60266n().intValue();
        this.f31561i = true;
        recyclerView.mo17043c(new C10365a(this));
    }

    /* renamed from: a */
    public final void mo10671a(boolean z) {
        String str = this.f31556d;
        Log.m105924i(str, "finishPreload hasMore:" + z + " preloadTime:" + (System.currentTimeMillis() - this.f31563k));
        this.f31560h = false;
        this.f31561i = z;
    }
}
