package il1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: il1.a */
public final class C8930a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C8961e f28237d;

    public C8930a(C8961e eVar) {
        this.f28237d = eVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheet$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f28237d.mo9451n();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheet$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
