package il1;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import fy3.C32226l;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;
import wg1.C66109y0;

/* renamed from: il1.o0 */
public final class C60464o0 {

    /* renamed from: a */
    public final C32226l<Integer, C13598b0> f172376a;

    /* renamed from: b */
    public WxRecyclerView f172377b;

    /* renamed from: il1.o0$a */
    public static final class C60465a extends RecyclerView.C0130p {

        /* renamed from: d */
        public final /* synthetic */ C60464o0 f172378d;

        public C60465a(C60464o0 o0Var) {
            this.f172378d = o0Var;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicSingSongRvWidget$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            RecyclerView.LayoutManager layoutManager = this.f172378d.f172377b.getLayoutManager();
            C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            ((LinearLayoutManager) layoutManager).mo16958D();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicSingSongRvWidget$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicSingSongRvWidget$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            super.onScrolled(recyclerView, i, i2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicSingSongRvWidget$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    public C60464o0(ViewGroup viewGroup, C66109y0 y0Var, C32226l<? super Integer, C13598b0> lVar) {
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(lVar, "callback");
        this.f172376a = lVar;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.f359212mw2);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.sing_song_rv_view)");
        WxRecyclerView wxRecyclerView = (WxRecyclerView) findViewById;
        this.f172377b = wxRecyclerView;
        wxRecyclerView.mo17043c(new C60465a(this));
    }
}
