package t91;

import android.util.Pair;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;
import i20.C21043a;
import j20.C21153d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jq3.C60898l;
import z04.C112551y;

/* renamed from: t91.a */
public final class C22451a {

    /* renamed from: k */
    public static final List<C22461e> f63586k = new ArrayList();

    /* renamed from: a */
    public final HashMap<String, Pair<String, List<Pair<String, String>>>> f63587a;

    /* renamed from: b */
    public final HashMap<String, Map<String, List<Pair<String, String>>>> f63588b;

    /* renamed from: c */
    public final HashMap<String, List<Pair<String, String>>> f63589c;

    /* renamed from: d */
    public final HashMap<String, Pair<String, List<Pair<String, String>>>> f63590d;

    /* renamed from: e */
    public final HashMap<String, Map<String, List<Pair<String, String>>>> f63591e;

    /* renamed from: f */
    public final C22452a f63592f = new C22452a(this);

    /* renamed from: g */
    public final C22453b f63593g = new C22453b(this);

    /* renamed from: h */
    public final C22455d f63594h = new C22455d(this);

    /* renamed from: i */
    public final C22456e f63595i = new C22456e(this);

    /* renamed from: j */
    public final C22454c f63596j = new C22454c(this);

    /* renamed from: t91.a$a */
    public static final class C22452a implements C21153d {

        /* renamed from: a */
        public final /* synthetic */ C22451a f63597a;

        public C22452a(C22451a aVar) {
            this.f63597a = aVar;
        }

        /* renamed from: a */
        public void mo32409a(String str, String str2, String str3, Object obj, Object obj2) {
        }

        /* renamed from: b */
        public void mo32410b(String str, String str2, String str3, Object obj, Object[] objArr) {
            if (str != null) {
                C22451a aVar = this.f63597a;
                if (C112551y.m153819s(str, "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", false) && C87412m.m108589b(str2, "onGridItemClick") && C87412m.m108589b(str3, "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroid/view/View;I)V") && objArr != null && objArr.length >= 3) {
                    RecyclerView.C16613e eVar = objArr[0];
                    if (eVar instanceof RecyclerView.C16613e) {
                        C87412m.m108592e(eVar, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.Adapter<*>");
                        RecyclerView.C16613e eVar2 = eVar;
                    }
                    View view = null;
                    View view2 = objArr[1];
                    if (view2 instanceof View) {
                        C87412m.m108592e(view2, "null cannot be cast to non-null type android.view.View");
                        view = view2;
                    }
                    int i = -1;
                    Integer num = objArr[2];
                    if (num instanceof Integer) {
                        C87412m.m108592e(num, "null cannot be cast to non-null type kotlin.Int");
                        i = num.intValue();
                    }
                    aVar.mo35597b(view, i);
                }
            }
        }
    }

    /* renamed from: t91.a$b */
    public static final class C22453b implements C21153d {

        /* renamed from: a */
        public final /* synthetic */ C22451a f63598a;

        public C22453b(C22451a aVar) {
            this.f63598a = aVar;
        }

        /* renamed from: a */
        public void mo32409a(String str, String str2, String str3, Object obj, Object obj2) {
        }

        /* renamed from: b */
        public void mo32410b(String str, String str2, String str3, Object obj, Object[] objArr) {
            if (str != null) {
                C22451a aVar = this.f63598a;
                if (C112551y.m153819s(str, "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsViewCallback$initView$", false) && C87412m.m108589b(str2, "onItemClick")) {
                    if ((C87412m.m108589b(str3, "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroid/view/View;ILandroidx/recyclerview/widget/RecyclerView$ViewHolder;)V") || C87412m.m108589b(str3, "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroid/view/View;ILcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V")) && objArr != null && objArr.length >= 3) {
                        RecyclerView.C16613e eVar = objArr[0];
                        if (eVar instanceof RecyclerView.C16613e) {
                            C87412m.m108592e(eVar, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.Adapter<*>");
                            RecyclerView.C16613e eVar2 = eVar;
                        }
                        View view = null;
                        View view2 = objArr[1];
                        if (view2 instanceof View) {
                            C87412m.m108592e(view2, "null cannot be cast to non-null type android.view.View");
                            view = view2;
                        }
                        int i = -1;
                        Integer num = objArr[2];
                        if (num instanceof Integer) {
                            C87412m.m108592e(num, "null cannot be cast to non-null type kotlin.Int");
                            i = num.intValue();
                        }
                        aVar.mo35597b(view, i);
                    }
                }
            }
        }
    }

    /* renamed from: t91.a$c */
    public static final class C22454c implements C21153d {

        /* renamed from: a */
        public final /* synthetic */ C22451a f63599a;

        public C22454c(C22451a aVar) {
            this.f63599a = aVar;
        }

        /* renamed from: a */
        public void mo32409a(String str, String str2, String str3, Object obj, Object obj2) {
        }

        /* renamed from: b */
        public void mo32410b(String str, String str2, String str3, Object obj, Object[] objArr) {
            if (str != null) {
                C22451a aVar = this.f63599a;
                if (C112551y.m153819s(str, "com/tencent/mm/plugin/finder/search/FinderMixSearchPresenter", false) && C87412m.m108589b(str2, "onFeedItemClick") && C87412m.m108589b(str3, "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V") && objArr != null) {
                    aVar.mo35597b(objArr[0], -1);
                }
            }
        }
    }

    /* renamed from: t91.a$d */
    public static final class C22455d implements C21153d {

        /* renamed from: a */
        public final /* synthetic */ C22451a f63600a;

        public C22455d(C22451a aVar) {
            this.f63600a = aVar;
        }

        /* renamed from: a */
        public void mo32409a(String str, String str2, String str3, Object obj, Object obj2) {
        }

        /* renamed from: b */
        public void mo32410b(String str, String str2, String str3, Object obj, Object[] objArr) {
            if (C87412m.m108589b(str, "com/tencent/mm/plugin/finder/feed/FinderProfileUIContract$ProfileViewCallback$FinderProfileAdapter") && C87412m.m108589b(str2, "jumpProfileTimeline") && C87412m.m108589b(str3, "(ILcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V") && objArr != null) {
                C22451a aVar = this.f63600a;
                if (objArr.length >= 2) {
                    int i = -1;
                    Integer num = objArr[0];
                    if (num instanceof Integer) {
                        C87412m.m108592e(num, "null cannot be cast to non-null type kotlin.Int");
                        i = num.intValue();
                    }
                    aVar.mo35597b(objArr[1], i);
                }
            }
        }
    }

    /* renamed from: t91.a$e */
    public static final class C22456e implements C21153d {

        /* renamed from: a */
        public final /* synthetic */ C22451a f63601a;

        public C22456e(C22451a aVar) {
            this.f63601a = aVar;
        }

        /* renamed from: a */
        public void mo32409a(String str, String str2, String str3, Object obj, Object obj2) {
        }

        /* renamed from: b */
        public void mo32410b(String str, String str2, String str3, Object obj, Object[] objArr) {
            RecyclerView.C16613e eVar;
            if (str != null) {
                C22451a aVar = this.f63601a;
                if (C112551y.m153819s(str, "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback", false) && C87412m.m108589b(str2, "onGridItemClick") && C87412m.m108589b(str3, "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroid/view/View;I)V") && objArr != null && objArr.length >= 3) {
                    RecyclerView.C16613e eVar2 = objArr[0];
                    View view = null;
                    if (eVar2 instanceof RecyclerView.C16613e) {
                        C87412m.m108592e(eVar2, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.Adapter<*>");
                        eVar = eVar2;
                    } else {
                        eVar = null;
                    }
                    View view2 = objArr[1];
                    if (view2 instanceof View) {
                        C87412m.m108592e(view2, "null cannot be cast to non-null type android.view.View");
                        view = view2;
                    }
                    int i = -1;
                    Integer num = objArr[2];
                    if (num instanceof Integer) {
                        C87412m.m108592e(num, "null cannot be cast to non-null type kotlin.Int");
                        i = num.intValue();
                        if (eVar instanceof C60898l) {
                            i -= ((C60898l) eVar).mo85796c6();
                        }
                    }
                    aVar.mo35597b(view, i);
                }
            }
        }
    }

    public C22451a() {
        HashMap<String, Pair<String, List<Pair<String, String>>>> hashMap = new HashMap<>();
        this.f63587a = hashMap;
        HashMap<String, Map<String, List<Pair<String, String>>>> hashMap2 = new HashMap<>();
        this.f63588b = hashMap2;
        HashMap<String, List<Pair<String, String>>> hashMap3 = new HashMap<>();
        this.f63589c = hashMap3;
        HashMap<String, Pair<String, List<Pair<String, String>>>> hashMap4 = new HashMap<>();
        this.f63590d = hashMap4;
        HashMap<String, Map<String, List<Pair<String, String>>>> hashMap5 = new HashMap<>();
        this.f63591e = hashMap5;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("onGridItemClick", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroid/view/View;I)V"));
        hashMap.put("com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", new Pair("com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback", arrayList));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new Pair("onItemClick", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroid/view/View;ILandroidx/recyclerview/widget/RecyclerView$ViewHolder;)V"));
        arrayList2.add(new Pair("onItemClick", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroid/view/View;ILcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V"));
        HashMap hashMap6 = new HashMap();
        hashMap6.put("com/tencent/mm/view/recyclerview/RecyclerViewAdapterEx$OnItemClickListener", arrayList2);
        hashMap2.put("com/tencent/mm/plugin/finder/feed/FinderTimelineLbsViewCallback$initView$", hashMap6);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new Pair("jumpProfileTimeline", "(ILcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"));
        hashMap3.put("com/tencent/mm/plugin/finder/feed/FinderProfileUIContract$ProfileViewCallback$FinderProfileAdapter", arrayList3);
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(new Pair("onGridItemClick", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroid/view/View;I)V"));
        hashMap4.put("com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback", new Pair("com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback", arrayList4));
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(new Pair("onFeedItemClick", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"));
        HashMap hashMap7 = new HashMap();
        hashMap7.put("com/tencent/mm/plugin/finder/search/FinderMixSearchUIContract$Presenter", arrayList5);
        hashMap5.put("com/tencent/mm/plugin/finder/search/FinderMixSearchPresenter", hashMap7);
    }

    /* renamed from: a */
    public final void mo35596a() {
        C21043a.m23197h().mo32759m(this.f63587a, this.f63592f);
        C21043a.m23197h().mo32760n(this.f63588b, this.f63593g);
        C21043a.m23197h().mo32758l(this.f63589c, this.f63594h);
        C21043a.m23197h().mo32759m(this.f63590d, this.f63595i);
        C21043a.m23197h().mo32760n(this.f63591e, this.f63596j);
    }

    /* renamed from: b */
    public final synchronized void mo35597b(Object obj, int i) {
        for (C22461e a : f63586k) {
            a.mo35604a(obj, i);
        }
    }

    /* renamed from: c */
    public final void mo35598c() {
        C21043a.m23197h().mo32763q(this.f63587a, this.f63592f);
        C21043a.m23197h().mo32764r(this.f63588b, this.f63593g);
        C21043a.m23197h().mo32762p(this.f63589c, this.f63594h);
        C21043a.m23197h().mo32763q(this.f63590d, this.f63595i);
        C21043a.m23197h().mo32764r(this.f63591e, this.f63596j);
    }
}
