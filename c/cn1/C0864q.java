package cn1;

import an1.C0093f;
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

/* renamed from: cn1.q */
public final class C0864q extends RecyclerView.C0130p {

    /* renamed from: d */
    public boolean f2053d;

    /* renamed from: e */
    public final /* synthetic */ C0093f f2054e;

    /* renamed from: f */
    public final /* synthetic */ C0859p f2055f;

    /* renamed from: cn1.q$a */
    public static final class C0865a extends C87413o implements C32226l<C89132b.C89134c<C49548ge1>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C0864q f2056d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0865a(C0864q qVar) {
            super(1);
            this.f2056d = qVar;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C89132b.C89134c) obj, LocaleUtil.ITALIAN);
            Log.m105924i("Finder.HeadLivingListConvert", "#rvScrollListener-onScrollStateChanged load end");
            this.f2056d.f2053d = false;
            return C13598b0.f38549a;
        }
    }

    public C0864q(C0093f fVar, C0859p pVar) {
        this.f2054e = fVar;
        this.f2055f = pVar;
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/HeadLivingListConvert$onBindViewHolder$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        super.onScrollStateChanged(recyclerView, i);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/HeadLivingListConvert$onBindViewHolder$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/HeadLivingListConvert$onBindViewHolder$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        C87412m.m108594g(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            C0093f fVar = this.f2054e;
            C0859p pVar = this.f2055f;
            if (!(layoutManager instanceof LinearLayoutManager)) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/HeadLivingListConvert$onBindViewHolder$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
                return;
            }
            boolean z = false;
            if (!(((LinearLayoutManager) layoutManager).mo16959E() == fVar.f531e.size() - 1)) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/HeadLivingListConvert$onBindViewHolder$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
                return;
            }
            if (fVar.f530d.f130382i > 0) {
                z = true;
            }
            if (z && !this.f2053d) {
                Log.m105924i("Finder.HeadLivingListConvert", "#rvScrollListener-onScrollStateChanged ready to load");
                this.f2053d = true;
                C15828e eVar = pVar.f2037f;
                C48682a91 a912 = fVar.f530d;
                eVar.mo3567c(a912.f130377d, a912.f130384n, new C0865a(this));
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/HeadLivingListConvert$onBindViewHolder$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
