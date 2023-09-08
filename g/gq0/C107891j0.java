package gq0;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: gq0.j0 */
public final class C107891j0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C107893k0 f323053d;

    public C107891j0(C107893k0 k0Var) {
        this.f323053d = k0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/openmaterial/ListBottomSheetEnhanceLogic$buildMoreOpenWaysView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.AppBrand.ListBottomSheetEnhanceLogic", "buildMoreOpenWaysView#onClick");
        this.f323053d.f323056e.mo107572p();
        C107893k0 k0Var = this.f323053d;
        C107879e0 e0Var = k0Var.f323058g;
        if (e0Var == null) {
            e0Var = C107869a.f323008o.mo158296b(k0Var.f323055d, k0Var.f323056e, k0Var.f323057f, k0Var.f323059h, k0Var.f323060i);
            k0Var.f323058g = e0Var;
        }
        e0Var.show();
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/openmaterial/ListBottomSheetEnhanceLogic$buildMoreOpenWaysView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
