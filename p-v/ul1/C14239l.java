package ul1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C101218e0;

/* renamed from: ul1.l */
public final class C14239l implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C14221k f39764d;

    public C14239l(C14221k kVar) {
        this.f39764d = kVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback$showAttendTypeDialog$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C101218e0 e0Var = this.f39764d.f39721F;
        if (e0Var != null) {
            e0Var.mo140680z();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback$showAttendTypeDialog$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
