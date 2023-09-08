package rs1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: rs1.ha */
public final class C13265ha implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C13194da f37642d;

    public C13265ha(C13194da daVar) {
        this.f37642d = daVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC$showSpeedControlArea$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C13194da.m12604j3(this.f37642d, false, false, 0.0f, 7, (Object) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC$showSpeedControlArea$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
