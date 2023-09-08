package wf1;

import android.view.View;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C36570n;

/* renamed from: wf1.m */
public final class C15220m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C15193l f41432d;

    public C15220m(C15193l lVar) {
        this.f41432d = lVar;
    }

    public final void run() {
        View view = (View) ((C36570n) this.f41432d.f41395u).getValue();
        int i = this.f41432d.mo14132i3().getHeight() >= this.f41432d.mo14132i3().getMaxHeight() ? 0 : 8;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$checkRvMask$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$checkRvMask$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
