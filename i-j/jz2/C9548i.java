package jz2;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;

/* renamed from: jz2.i */
public final class C9548i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C76474e f29743d;

    public C9548i(C76474e eVar) {
        this.f29743d = eVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic$handleSecurity$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        View view2 = this.f29743d.f223857I;
        if (view2 != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic$handleSecurity$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic$handleSecurity$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic$handleSecurity$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
