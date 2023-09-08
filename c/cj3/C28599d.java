package cj3;

import android.view.View;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: cj3.d */
public final class C28599d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C67387c f78487d;

    public C28599d(C67387c cVar) {
        this.f78487d = cVar;
    }

    public final void run() {
        View view = this.f78487d.f193263b;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/anim/content/SizeAnimController$requestGone$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/ui/anim/content/SizeAnimController$requestGone$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
