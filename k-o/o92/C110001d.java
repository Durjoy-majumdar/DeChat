package o92;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import l92.C109293a;

/* renamed from: o92.d */
public final class C110001d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C109999c f329184d;

    /* renamed from: e */
    public final /* synthetic */ C109293a f329185e;

    public C110001d(C109999c cVar, C109293a aVar) {
        this.f329184d = cVar;
        this.f329185e = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/multitask/tips/MultiTaskTipsHelper$showBottomSheet$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f329184d.mo161341b();
        C109293a aVar = this.f329185e;
        if (aVar != null) {
            aVar.mo160107b();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/multitask/tips/MultiTaskTipsHelper$showBottomSheet$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
