package qj1;

import android.view.View;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: qj1.yh */
public final class C12763yh implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C12786zh f36556d;

    /* renamed from: qj1.yh$a */
    public static final class C12764a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f36557d;

        public C12764a(View view) {
            this.f36557d = view;
        }

        public final void run() {
            View view = this.f36557d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorVRActionTipsLazyPlugin$autoHideTipTask$2$1$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorVRActionTipsLazyPlugin$autoHideTipTask$2$1$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public C12763yh(C12786zh zhVar) {
        this.f36556d = zhVar;
    }

    public final void run() {
        View view = this.f36556d.f36607r;
        if (view != null && view.getVisibility() == 0) {
            view.animate().alpha(0.0f).withEndAction(new C12764a(view)).start();
        }
    }
}
