package ff1;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.finder.event.recyclerview.FinderRecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: ff1.c */
public final class C58986c implements FinderRecyclerView.C55692a {

    /* renamed from: a */
    public final /* synthetic */ FinderRecyclerView f168769a;

    public C58986c(FinderRecyclerView finderRecyclerView) {
        this.f168769a = finderRecyclerView;
    }

    /* renamed from: e */
    public void mo77206e(RecyclerView recyclerView, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        Log.m105924i("FinderRecyclerView", "onPageScrollStateChanged state = " + i);
        FinderRecyclerView.C55692a aVar = this.f168769a.f158504F1;
        if (aVar != null) {
            aVar.mo77206e(recyclerView, i);
        }
    }

    /* renamed from: f */
    public void mo77207f(RecyclerView recyclerView, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        FinderRecyclerView finderRecyclerView = this.f168769a;
        int i2 = finderRecyclerView.f158506H1;
        finderRecyclerView.getClass();
        boolean z = (i2 == -1 && i == 0) ? false : true;
        Log.m105924i("FinderRecyclerView", "onPageSelected position:" + i + ", currentItem:" + this.f168769a.f158506H1 + ", needNotify:" + z);
        FinderRecyclerView finderRecyclerView2 = this.f168769a;
        if (finderRecyclerView2.f158506H1 != i) {
            finderRecyclerView2.f158506H1 = i;
            FinderRecyclerView.C55692a aVar = finderRecyclerView2.f158504F1;
            if (aVar != null && z && aVar != null) {
                aVar.mo77207f(recyclerView, i);
            }
        }
    }

    /* renamed from: g */
    public void mo77208g(RecyclerView recyclerView, int i, float f, int i2) {
        C87412m.m108594g(recyclerView, "recyclerView");
        FinderRecyclerView.C55692a aVar = this.f168769a.f158504F1;
        if (aVar != null) {
            aVar.mo77208g(recyclerView, i, f, i2);
        }
    }
}
