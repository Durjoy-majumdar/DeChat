package fp0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: fp0.a */
public final class C8180a {
    /* renamed from: a */
    public static final void m8260a(View view) {
        C87412m.m108594g(view, "<this>");
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalAuthorizePesenterViewUtilsKt", "removeFromViewTree", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalAuthorizePesenterViewUtilsKt", "removeFromViewTree", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }
}
