package of2;

import android.view.View;
import fy3.C32228q;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;
import te3.C52262zh;

/* renamed from: of2.b */
public final class C47373b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C47365a f127111d;

    /* renamed from: e */
    public final /* synthetic */ C52262zh f127112e;

    /* renamed from: f */
    public final /* synthetic */ int f127113f;

    /* renamed from: g */
    public final /* synthetic */ int f127114g;

    public C47373b(C47365a aVar, C52262zh zhVar, int i, int i2) {
        this.f127111d = aVar;
        this.f127112e = zhVar;
        this.f127113f = i;
        this.f127114g = i2;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/profile/ui/tab/menu/BizProfileMenuAdapter$onBindViewHolder$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C32228q<? super C52262zh, ? super Integer, ? super Integer, C13598b0> qVar = this.f127111d.f127098e;
        if (qVar != null) {
            C52262zh zhVar = this.f127112e;
            C87412m.m108593f(zhVar, "data");
            qVar.invoke(zhVar, Integer.valueOf(this.f127113f), Integer.valueOf(this.f127114g));
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/tab/menu/BizProfileMenuAdapter$onBindViewHolder$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
