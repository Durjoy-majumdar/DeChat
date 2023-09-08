package qj1;

import android.view.View;
import com.tencent.p014mm.p136ui.C75044y4;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C36570n;

/* renamed from: qj1.bi */
public final class C12263bi implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f35347d;

    /* renamed from: e */
    public final /* synthetic */ C12786zh f35348e;

    public C12263bi(View view, C12786zh zhVar) {
        this.f35347d = view;
        this.f35348e = zhVar;
    }

    public final void run() {
        this.f35347d.setTranslationY(((float) C75044y4.m89990b(this.f35348e.f166287d.getContext()).y) / 2.0f);
        View view = this.f35347d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(0.0f));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorVRActionTipsLazyPlugin$showVrTip$1$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorVRActionTipsLazyPlugin$showVrTip$1$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        View view3 = this.f35347d;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(0);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorVRActionTipsLazyPlugin$showVrTip$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorVRActionTipsLazyPlugin$showVrTip$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f35347d.postDelayed((Runnable) ((C36570n) this.f35348e.f36608s).getValue(), 8000);
    }
}
