package l23;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: l23.b */
public final class C109164b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C109154a f326857d;

    public C109164b(C109154a aVar) {
        this.f326857d = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/plugin/CompositionEditPlugin$checkInit$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C109154a aVar = this.f326857d;
        aVar.f326843u = false;
        aVar.f326832g.setShow(false);
        C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/plugin/CompositionEditPlugin$checkInit$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
