package hp1;

import android.view.View;
import com.google.android.material.bottomsheet.C104428a;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: hp1.c0 */
public final class C8655c0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C8657d0 f27812d;

    public C8655c0(C8657d0 d0Var) {
        this.f27812d = d0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/search/FinderHotSearchInfoDialog$initDialog$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C8657d0 d0Var = this.f27812d;
        d0Var.getClass();
        Log.m105924i("Finder.HotSearchInfoDialog", "dismissDialog");
        C104428a aVar = d0Var.f27815b;
        if (aVar != null) {
            aVar.dismiss();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/search/FinderHotSearchInfoDialog$initDialog$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
