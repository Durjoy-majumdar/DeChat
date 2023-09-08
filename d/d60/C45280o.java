package d60;

import androidx.recyclerview.widget.RecyclerView;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: d60.o */
public final class C45280o implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C45272n f122649d;

    public C45280o(C45272n nVar) {
        this.f122649d = nVar;
    }

    public final void run() {
        C45272n nVar = this.f122649d;
        RecyclerView recyclerView = nVar.f122636i;
        int itemCount = nVar.f122637j.getItemCount() - 1;
        if (itemCount < 0) {
            itemCount = 0;
        }
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(itemCount));
        RecyclerView recyclerView2 = recyclerView;
        C117292a.m165358d(recyclerView2, aVar.mo10232b(), "com/tencent/mm/live/plugin/LiveCommentPlugin$banCommentCallback$1$1$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        recyclerView.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(recyclerView2, "com/tencent/mm/live/plugin/LiveCommentPlugin$banCommentCallback$1$1$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
    }
}
