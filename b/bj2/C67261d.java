package bj2;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: bj2.d */
public final class C67261d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C67253c f193096d;

    public C67261d(C67253c cVar) {
        this.f193096d = cVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/Biz2UIC$onCreate$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f193096d.mo91407c3().mo91411c3().dispatch(new C67281s());
        C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/Biz2UIC$onCreate$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
