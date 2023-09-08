package zo1;

import android.view.View;
import cl1.C54991o;
import j20.C117292a;
import java.util.ArrayList;
import vo1.C65770a0;

/* renamed from: zo1.o */
public final class C66938o implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C66933n f192320d;

    public C66938o(C66933n nVar) {
        this.f192320d = nVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/replay/plugin/ReplayLivingHeaderPlugin$show$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f192320d.mo14484z0().finish();
        C65770a0.C65771b bVar = C65770a0.f189184r;
        C54991o oVar = (C54991o) bVar.mo89819a().mo89804e(C54991o.class);
        if (oVar != null) {
            oVar.f154350p0 = false;
        }
        bVar.mo89820b();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/replay/plugin/ReplayLivingHeaderPlugin$show$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
