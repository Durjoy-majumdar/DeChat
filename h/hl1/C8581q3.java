package hl1;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import cj1.C54795n5;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: hl1.q3 */
public final class C8581q3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C59988k f27669d;

    public C8581q3(C59988k kVar) {
        this.f27669d = kVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/viewmodel/state/visitor/FinderLiveVisitorLivingUIC$onStatusChanged$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C54795n5 k = this.f27669d.mo83048k();
        if (k != null) {
            AppCompatActivity appCompatActivity = this.f27669d.f166847e;
            C87412m.m108592e(appCompatActivity, "null cannot be cast to non-null type android.app.Activity");
            k.mo75713Q(appCompatActivity, false);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/viewmodel/state/visitor/FinderLiveVisitorLivingUIC$onStatusChanged$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
