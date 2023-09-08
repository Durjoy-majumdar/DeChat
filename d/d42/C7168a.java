package d42;

import android.view.View;
import d42.C86177e;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: d42.a */
public final class C7168a<T extends View> implements C86177e.C86178a<T> {
    /* renamed from: a */
    public void mo8352a(Object obj) {
        View view = (View) obj;
        C87412m.m108594g(view, "view");
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(4);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/magicbrush/api/CommonViewOperationDelegateImpl", "onRequestHide", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/magicbrush/api/CommonViewOperationDelegateImpl", "onRequestHide", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
