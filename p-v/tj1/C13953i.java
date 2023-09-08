package tj1;

import android.view.View;
import fy3.C32226l;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;
import rx3.C36570n;

/* renamed from: tj1.i */
public final class C13953i extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C13931b f39196d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13953i(C13931b bVar) {
        super(1);
        this.f39196d = bVar;
    }

    public Object invoke(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            View view = (View) ((C36570n) this.f39196d.f39138d).getValue();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveGiftPkgChooseView$reChooseGiftPanel$2$1$1", "invoke", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveGiftPkgChooseView$reChooseGiftPanel$2$1$1", "invoke", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return C13598b0.f38549a;
    }
}
