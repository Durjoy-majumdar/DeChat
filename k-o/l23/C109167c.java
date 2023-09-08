package l23;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: l23.c */
public final class C109167c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C109154a f326863d;

    public C109167c(C109154a aVar) {
        this.f326863d = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/plugin/CompositionEditPlugin$checkInit$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C109154a aVar = this.f326863d;
        aVar.f326843u = true;
        aVar.f326832g.setShow(false);
        C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/plugin/CompositionEditPlugin$checkInit$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
