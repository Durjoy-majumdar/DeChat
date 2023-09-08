package zh1;

import android.view.View;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: zh1.h */
public final class C16208h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C16203f f43423d;

    public C16208h(C16203f fVar) {
        this.f43423d = fVar;
    }

    public final void run() {
        View view = this.f43423d.f43409d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/gift/widget/GiftBatchSelectPanelWidget$adjustWidget$4", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/gift/widget/GiftBatchSelectPanelWidget$adjustWidget$4", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
