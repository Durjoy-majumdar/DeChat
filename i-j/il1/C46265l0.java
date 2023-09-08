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
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;
import wg1.C53168x;

/* renamed from: il1.l0 */
public final class C46265l0 {

    /* renamed from: a */
    public final ViewGroup f124712a;

    /* renamed from: b */
    public final C53168x f124713b;

    /* renamed from: c */
    public final C32226l<Integer, C13598b0> f124714c;

    /* renamed from: d */
    public WxRecyclerView f124715d;

    /* renamed from: e */
    public View f124716e;

    /* renamed from: f */
    public boolean f124717f;

    /* renamed from: il1.l0$a */
    public static final class C46266a extends RecyclerView.C0130p {

        /* renamed from: d */
        public final /* synthetic */ C46265l0 f124718d;

        public C46266a(C46265l0 l0Var) {
            this.f124718d = l0Var;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicRvWidget$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            RecyclerView.LayoutManager layoutManager = this.f124718d.f124715d.getLayoutManager();
            C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            int D = ((LinearLayoutManager) layoutManager).mo16958D();
            C46265l0 l0Var = this.f124718d;
            if (!l0Var.f124717f) {
                C53168x xVar = l0Var.f124713b;
                if (xVar != null && xVar.mo73861n(D)) {
                    l0Var.f124717f = true;
                    View view = l0Var.f124716e;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicRvWidget", "checkLoadMore", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicRvWidget", "checkLoadMore", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    C53168x xVar2 = l0Var.f124713b;
                    if (xVar2 != null) {
                        C53168x.C53169a.m59582a(xVar2, false, new C46270n0(l0Var), 1, (Object) null);
                    }
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicRvWidget$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicRvWidget$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            super.onScrolled(recyclerView, i, i2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicRvWidget$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    public C46265l0(ViewGroup viewGroup, C53168x xVar, C32226l<? super Integer, C13598b0> lVar) {
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(lVar, "callback");
        this.f124712a = viewGroup;
        this.f124713b = xVar;
        this.f124714c = lVar;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.h74);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.music_rv_view)");
        this.f124715d = (WxRecyclerView) findViewById;
        View findViewById2 = viewGroup.findViewById(C0966R.C0970id.h6e);
        C87412m.m108593f(findViewById2, "root.findViewById(R.id.music_footer)");
        this.f124716e = findViewById2;
        this.f124715d.mo17043c(new C46266a(this));
    }
}
