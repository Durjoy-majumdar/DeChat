package hl1;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import qj1.C62699d4;

/* renamed from: hl1.g3 */
public final class C59976g3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C59988k f171126d;

    /* renamed from: e */
    public final /* synthetic */ Integer f171127e;

    public C59976g3(C59988k kVar, Integer num) {
        this.f171126d = kVar;
        this.f171127e = num;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/viewmodel/state/visitor/FinderLiveVisitorLivingUIC$onStatusChanged$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C62699d4 B = this.f171126d.mo84867B();
        if (B != null) {
            B.f178029r.mo78802a();
        }
        String str = this.f171126d.f171222i;
        Log.m105924i(str, "scene:" + this.f171127e + ", click cancel");
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/viewmodel/state/visitor/FinderLiveVisitorLivingUIC$onStatusChanged$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
