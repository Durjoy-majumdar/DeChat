package ok1;

import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: ok1.m */
public final class C11463m implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public final /* synthetic */ RecyclerView f33711d;

    /* renamed from: e */
    public final /* synthetic */ int f33712e;

    /* renamed from: f */
    public final /* synthetic */ int f33713f;

    public C11463m(RecyclerView recyclerView, int i, int i2) {
        this.f33711d = recyclerView;
        this.f33712e = i;
        this.f33713f = i2;
    }

    public void onGlobalLayout() {
        this.f33711d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        RecyclerView.LayoutManager layoutManager = this.f33711d.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            int i = this.f33712e;
            int i2 = this.f33713f;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i2));
            aVar.mo10233c(Integer.valueOf(i));
            C117292a.m165358d(linearLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil$rvScrollToPos$1", "onGlobalLayout", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            linearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
            C117292a.m165359e(linearLayoutManager, "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil$rvScrollToPos$1", "onGlobalLayout", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
    }
}
