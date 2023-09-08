package wg1;

import ak1.C54067f0;
import ak1.C54116w;
import android.view.View;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import wg1.C66018i1;

/* renamed from: wg1.h1 */
public final class C66016h1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C66018i1 f189793d;

    /* renamed from: e */
    public final /* synthetic */ C66018i1.C66021c f189794e;

    public C66016h1(C66018i1 i1Var, C66018i1.C66021c cVar) {
        this.f189793d = i1Var;
        this.f189794e = cVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback$DeviceAdapter$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C65986c1 c1Var = this.f189793d.f189805g;
        if (c1Var != null) {
            c1Var.mo90020X0(this.f189794e.f189825a);
        }
        ((C54116w) C86312j.m106911c(C54116w.class)).Mx0(C54067f0.C0055f.CAST_SCREEN_CLICK_DEVICE);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback$DeviceAdapter$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
