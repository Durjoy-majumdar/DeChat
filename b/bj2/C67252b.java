package bj2;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: bj2.b */
public final class C67252b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C67249a f193091d;

    public C67252b(C67249a aVar) {
        this.f193091d = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/Biz1UIC$onCreate$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f193091d.mo91405c3().mo91411c3().dispatch(new C67279m0());
        C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/Biz1UIC$onCreate$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
