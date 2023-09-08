package cn1;

import an1.C0095h;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C48682a91;
import te3.C49548ge1;
import xm1.C15828e;

/* renamed from: cn1.t0 */
public final class C0875t0 extends RecyclerView.C0130p {

    /* renamed from: d */
    public boolean f2081d;

    /* renamed from: e */
    public final /* synthetic */ C0095h f2082e;

    /* renamed from: f */
    public final /* synthetic */ C0870s0 f2083f;

    /* renamed from: cn1.t0$a */
    public static final class C0876a extends C87413o implements C32226l<C89132b.C89134c<C49548ge1>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C0875t0 f2084d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0876a(C0875t0 t0Var) {
            super(1);
            this.f2084d = t0Var;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C89132b.C89134c) obj, LocaleUtil.ITALIAN);
            Log.m105924i("Finder.RecentWatchListConvert", "#rvScrollListener-onScrollStateChanged load end");
            this.f2084d.f2081d = false;
            return C13598b0.f38549a;
        }
    }

    public C0875t0(C0095h hVar, C0870s0 s0Var) {
        this.f2082e = hVar;
        this.f2083f = s0Var;
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/RecentWatchListConvert$onBindViewHolder$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        super.onScrollStateChanged(recyclerView, i);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/RecentWatchListConvert$onBindViewHolder$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/RecentWatchListConvert$onBindViewHolder$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        C87412m.m108594g(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            C0095h hVar = this.f2082e;
            C0870s0 s0Var = this.f2083f;
            if (!(layoutManager instanceof LinearLayoutManager)) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/RecentWatchListConvert$onBindViewHolder$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
                return;
            }
            boolean z = false;
            if (!(((LinearLayoutManager) layoutManager).mo16959E() == hVar.f533e.size() - 1)) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/RecentWatchListConvert$onBindViewHolder$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
                return;
            }
            if (hVar.f532d.f130382i > 0) {
                z = true;
            }
            if (z && !this.f2081d) {
                Log.m105924i("Finder.RecentWatchListConvert", "#rvScrollListener-onScrollStateChanged ready to load");
                this.f2081d = true;
                C15828e eVar = s0Var.f2066f;
                C48682a91 a912 = hVar.f532d;
                eVar.mo3567c(a912.f130377d, a912.f130384n, new C0876a(this));
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/RecentWatchListConvert$onBindViewHolder$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
