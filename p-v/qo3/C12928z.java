package qo3;

import android.view.View;
import fy3.C32224a;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: qo3.z */
public class C12928z implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ View f36952d;

    public C12928z(C12925w wVar, View view) {
        this.f36952d = view;
    }

    public Object invoke() {
        View view = this.f36952d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(4);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/widget/dialog/MMCustomHalfBottomDialog$3", "invoke", "()Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/ui/widget/dialog/MMCustomHalfBottomDialog$3", "invoke", "()Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return C13598b0.f38549a;
    }
}
