package il1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: il1.b */
public final class C8935b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C8961e f28242d;

    public C8935b(C8961e eVar) {
        this.f28242d = eVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheet$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f28242d.mo9768o();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheet$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
