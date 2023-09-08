package ve1;

import android.view.View;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: ve1.u1 */
public final class C14644u1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f40514d;

    public C14644u1(View view) {
        this.f40514d = view;
    }

    public final void run() {
        View view = this.f40514d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$showSelfFeedLikeTips$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$showSelfFeedLikeTips$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
