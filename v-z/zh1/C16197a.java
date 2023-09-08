package zh1;

import android.view.View;
import fy3.C32224a;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: zh1.a */
public final class C16197a extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C16198b f43394d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16197a(C16198b bVar) {
        super(0);
        this.f43394d = bVar;
    }

    public Object invoke() {
        View view = this.f43394d.f43397c;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/gift/widget/BaseGiftWidget$adjustWidget$4", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/gift/widget/BaseGiftWidget$adjustWidget$4", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return C13598b0.f38549a;
    }
}
