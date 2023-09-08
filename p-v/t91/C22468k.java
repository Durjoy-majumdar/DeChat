package t91;

import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;
import j20.C117292a;
import j20.C21153d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import z04.C112551y;

/* renamed from: t91.k */
public final class C22468k {

    /* renamed from: a */
    public WeakReference<RecyclerView> f63633a;

    /* renamed from: b */
    public final HashMap<String, Pair<String, List<Pair<String, String>>>> f63634b;

    /* renamed from: c */
    public final C22469a f63635c;

    /* renamed from: d */
    public final C22470b f63636d;

    /* renamed from: t91.k$a */
    public static final class C22469a implements C21153d {

        /* renamed from: a */
        public final /* synthetic */ C22468k f63637a;

        public C22469a(C22468k kVar) {
            this.f63637a = kVar;
        }

        /* renamed from: a */
        public void mo32409a(String str, String str2, String str3, Object obj, Object obj2) {
        }

        /* renamed from: b */
        public void mo32410b(String str, String str2, String str3, Object obj, Object[] objArr) {
            this.f63637a.getClass();
            boolean z = false;
            if (!C87412m.m108589b("com/tencent/mm/plugin/finder/feed/FinderTimelineMachineViewCallback$SpacesItemDecoration", str) && !C87412m.m108589b("com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback$SpacesItemDecoration", str) && str != null && !C112551y.m153819s(str, "com/tencent/mm/plugin/finder/storage/FinderStaggeredConfig$getItemDecoration$", false)) {
                z = true;
            }
            if (!z && C87412m.m108589b(str2, "getItemOffsets") && C87412m.m108589b(str3, "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V") && objArr != null && objArr.length >= 4) {
                WeakReference<RecyclerView> weakReference = this.f63637a.f63633a;
                if ((weakReference != null ? weakReference.get() : null) == null) {
                    RecyclerView recyclerView = objArr[2];
                    C87412m.m108592e(recyclerView, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                    RecyclerView recyclerView2 = recyclerView;
                    recyclerView2.mo17043c(this.f63637a.f63636d);
                    this.f63637a.f63633a = new WeakReference<>(recyclerView2);
                }
            }
        }
    }

    /* renamed from: t91.k$b */
    public static final class C22470b extends RecyclerView.C0130p {
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/expt/hellhound/ext/finder/monitor/RecyclerItemDecorationCallback$mRecyclerListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            C22466j.f63621a.mo35607e(recyclerView, i);
            C117292a.m165361g(this, "com/tencent/mm/plugin/expt/hellhound/ext/finder/monitor/RecyclerItemDecorationCallback$mRecyclerListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/expt/hellhound/ext/finder/monitor/RecyclerItemDecorationCallback$mRecyclerListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            C22466j.f63621a.mo35608f(recyclerView, i, i2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/expt/hellhound/ext/finder/monitor/RecyclerItemDecorationCallback$mRecyclerListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    public C22468k() {
        HashMap<String, Pair<String, List<Pair<String, String>>>> hashMap = new HashMap<>();
        this.f63634b = hashMap;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V"));
        arrayList.add(new Pair("onDrawOver", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V"));
        hashMap.put("com/tencent/mm/plugin/finder/feed/FinderTimelineMachineViewCallback$SpacesItemDecoration", new Pair("androidx/recyclerview/widget/RecyclerView$ItemDecoration", arrayList));
        hashMap.put("com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback$SpacesItemDecoration", new Pair("androidx/recyclerview/widget/RecyclerView$ItemDecoration", arrayList));
        hashMap.put("com/tencent/mm/plugin/finder/storage/FinderStaggeredConfig$getItemDecoration$", new Pair("androidx/recyclerview/widget/RecyclerView$ItemDecoration", arrayList));
        WeakReference<RecyclerView> weakReference = this.f63633a;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f63635c = new C22469a(this);
        this.f63636d = new C22470b();
    }
}
