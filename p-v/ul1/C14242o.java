package ul1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C101218e0;

/* renamed from: ul1.o */
public final class C14242o implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C14221k f39767d;

    public C14242o(C14221k kVar) {
        this.f39767d = kVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback$showPrizeTypeDialog$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C101218e0 e0Var = this.f39767d.f39722G;
        if (e0Var != null) {
            e0Var.mo140680z();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback$showPrizeTypeDialog$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
