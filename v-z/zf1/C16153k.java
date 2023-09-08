package zf1;

import androidx.recyclerview.widget.RecyclerView;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: zf1.k */
public final class C16153k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ RecyclerView f43350d;

    /* renamed from: e */
    public final /* synthetic */ int f43351e;

    public C16153k(RecyclerView recyclerView, int i) {
        this.f43350d = recyclerView;
        this.f43351e = i;
    }

    public final void run() {
        RecyclerView recyclerView = this.f43350d;
        int i = this.f43351e;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(recyclerView, aVar.mo10232b(), "com/tencent/mm/plugin/finder/gallery/FinderGalleryTimelineContract$ViewCallback$smoothScrollToNextPosition$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        recyclerView.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(recyclerView, "com/tencent/mm/plugin/finder/gallery/FinderGalleryTimelineContract$ViewCallback$smoothScrollToNextPosition$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
    }
}
