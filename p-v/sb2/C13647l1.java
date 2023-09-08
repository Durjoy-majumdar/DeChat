package sb2;

import android.view.View;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import sb2.C13643k1;

/* renamed from: sb2.l1 */
public final class C13647l1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f38665d;

    /* renamed from: e */
    public final /* synthetic */ C13643k1.C13646b f38666e;

    public C13647l1(View view, C13643k1.C13646b bVar) {
        this.f38665d = view;
        this.f38666e = bVar;
    }

    public final void run() {
        View view = this.f38665d;
        int i = this.f38666e.f38663d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/mv/ui/uic/VisibleRecord$hide$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/mv/ui/uic/VisibleRecord$hide$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
