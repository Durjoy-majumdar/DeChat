package cn1;

import an1.C0103p;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager;
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

/* renamed from: cn1.g1 */
public final class C0837g1 extends RecyclerView.C0130p {

    /* renamed from: d */
    public boolean f1975d;

    /* renamed from: e */
    public final /* synthetic */ C0103p f1976e;

    /* renamed from: f */
    public final /* synthetic */ C0827e1 f1977f;

    /* renamed from: cn1.g1$a */
    public static final class C0838a extends C87413o implements C32226l<C89132b.C89134c<C49548ge1>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C0837g1 f1978d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0838a(C0837g1 g1Var) {
            super(1);
            this.f1978d = g1Var;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C89132b.C89134c) obj, LocaleUtil.ITALIAN);
            Log.m105924i("Finder.SpecialColumnListConvert", "#rvScrollListener-onScrollStateChanged load end");
            this.f1978d.f1975d = false;
            return C13598b0.f38549a;
        }
    }

    public C0837g1(C0103p pVar, C0827e1 e1Var) {
        this.f1976e = pVar;
        this.f1977f = e1Var;
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/SpecialColumnListConvert$onBindViewHolder$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        super.onScrollStateChanged(recyclerView, i);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/SpecialColumnListConvert$onBindViewHolder$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/SpecialColumnListConvert$onBindViewHolder$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        C87412m.m108594g(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            C0103p pVar = this.f1976e;
            C0827e1 e1Var = this.f1977f;
            if (!(layoutManager instanceof FinderStaggeredGridLayoutManager)) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/SpecialColumnListConvert$onBindViewHolder$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
                return;
            }
            int[] iArr = new int[1];
            ((FinderStaggeredGridLayoutManager) layoutManager).mo17395B(iArr);
            boolean z = false;
            if (!(iArr[0] == pVar.f546e.size() - 1)) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/SpecialColumnListConvert$onBindViewHolder$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
                return;
            }
            if (pVar.f545d.f130382i > 0) {
                z = true;
            }
            if (z && !this.f1975d) {
                Log.m105924i("Finder.SpecialColumnListConvert", "#rvScrollListener-onScrollStateChanged ready to load");
                this.f1975d = true;
                C15828e eVar = e1Var.f1945f;
                C48682a91 a912 = pVar.f545d;
                eVar.mo3567c(a912.f130377d, a912.f130384n, new C0838a(this));
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/SpecialColumnListConvert$onBindViewHolder$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
