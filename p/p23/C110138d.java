package p23;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: p23.d */
public final class C110138d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C110130b f329503d;

    public C110138d(C110130b bVar) {
        this.f329503d = bVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/plugin/timecrop/VLogTimeEditPlugin$checkInit$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f329503d.f329482f.setShow(false);
        C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/plugin/timecrop/VLogTimeEditPlugin$checkInit$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
