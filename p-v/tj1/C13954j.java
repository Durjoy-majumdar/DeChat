package tj1;

import android.view.View;
import com.tencent.p014mm.p136ui.widget.LiveBottomSheetPanel;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C36570n;

/* renamed from: tj1.j */
public final class C13954j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C13931b f39197d;

    public C13954j(C13931b bVar) {
        this.f39197d = bVar;
    }

    public final void run() {
        View view = (View) ((C36570n) this.f39197d.f39138d).getValue();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveGiftPkgChooseView$showPanel$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveGiftPkgChooseView$showPanel$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((LiveBottomSheetPanel) ((C36570n) this.f39197d.f39137c).getValue()).mo78804d();
    }
}
