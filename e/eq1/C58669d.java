package eq1;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.p136ui.gridviewheaders.C74763a;
import com.tencent.p014mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import jq3.C9493c;
import sx3.C110823p;
import sx3.C64197v;

/* renamed from: eq1.d */
public final class C58669d extends RecyclerView.C0130p {

    /* renamed from: d */
    public final /* synthetic */ C58666b f167965d;

    public C58669d(C58666b bVar) {
        this.f167965d = bVar;
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback$initCenter$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        super.onScrollStateChanged(recyclerView, i);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback$initCenter$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback$initCenter$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        C87412m.m108594g(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        FinderStaggeredGridLayoutManager finderStaggeredGridLayoutManager = layoutManager instanceof FinderStaggeredGridLayoutManager ? (FinderStaggeredGridLayoutManager) layoutManager : null;
        if (finderStaggeredGridLayoutManager == null) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback$initCenter$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
            return;
        }
        int[] iArr = new int[finderStaggeredGridLayoutManager.f44890d];
        finderStaggeredGridLayoutManager.mo17394A(iArr);
        Integer Q = C110823p.m150991Q(iArr);
        int i3 = 0;
        int intValue = Q != null ? Q.intValue() : 0;
        C58666b bVar = this.f167965d;
        Iterator<C9493c> it = bVar.f167949c.f167945d.iterator();
        while (it.hasNext()) {
            C9493c next = it.next();
            int i4 = i3 + 1;
            if (i3 >= 0) {
                C9493c cVar = next;
                C58675j jVar = cVar instanceof C58675j ? (C58675j) cVar : null;
                if (jVar != null && intValue >= i3) {
                    TextView textView = bVar.f167961o;
                    if (textView != null) {
                        textView.setText(C74763a.m89510e().mo103935c(new Date(jVar.f167971d), bVar.f167947a));
                    } else {
                        C87412m.m108603p("dateHeaderTv");
                        throw null;
                    }
                }
                i3 = i4;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback$initCenter$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
