package jz2;

import android.view.View;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: jz2.j */
public final class C9549j {
    /* renamed from: a */
    public static final void m9235a(View view) {
        C87412m.m108594g(view, "<this>");
        view.setTag(C0966R.C0970id.kio, Integer.valueOf(view.getVisibility()));
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogicKt", "markAndGone", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogicKt", "markAndGone", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: b */
    public static final void m9236b(View view) {
        C87412m.m108594g(view, "<this>");
        Object tag = view.getTag(C0966R.C0970id.kio);
        if (tag instanceof Integer) {
            int intValue = ((Number) tag).intValue();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(intValue));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogicKt", "resumeVisibility", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogicKt", "resumeVisibility", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
