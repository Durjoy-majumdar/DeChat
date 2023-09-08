package h33;

import android.view.View;
import h33.C108047a;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: h33.d */
public final class C108055d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C108047a f323569d;

    public C108055d(C108047a aVar) {
        this.f323569d = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/widget/PhotoEditColorPicker$checkInit$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C108047a.C108048a aVar = this.f323569d.f323562g;
        if (aVar != null) {
            aVar.mo158443a();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/widget/PhotoEditColorPicker$checkInit$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
