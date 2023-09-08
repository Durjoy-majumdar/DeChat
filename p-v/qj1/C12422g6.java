package qj1;

import android.view.View;
import cl1.C0689t;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: qj1.g6 */
public final class C12422g6 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C12382f6 f35784d;

    public C12422g6(C12382f6 f6Var) {
        this.f35784d = f6Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveConcertTicketPlugin$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((C0689t) this.f35784d.mo87696x0(C0689t.class)).f1625g = false;
        this.f35784d.mo10792g(8);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveConcertTicketPlugin$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
