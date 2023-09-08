package mo1;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: mo1.s */
public final class C11049s implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ RecyclerView f32800d;

    /* renamed from: e */
    public final /* synthetic */ int f32801e;

    /* renamed from: f */
    public final /* synthetic */ int f32802f;

    public C11049s(RecyclerView recyclerView, int i, int i2) {
        this.f32800d = recyclerView;
        this.f32801e = i;
        this.f32802f = i2;
    }

    public final void run() {
        RecyclerView.LayoutManager layoutManager = this.f32800d.getLayoutManager();
        C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        int i = this.f32801e;
        int i2 = this.f32802f;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i2));
        aVar.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(gridLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC$jumpToJustWatched$2", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        gridLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
        C117292a.m165359e(gridLayoutManager, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC$jumpToJustWatched$2", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
    }
}
