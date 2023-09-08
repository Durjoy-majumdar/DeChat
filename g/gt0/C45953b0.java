package gt0;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.widget.dialog.C84926a;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: gt0.b0 */
public class C45953b0 implements View.OnClickListener {
    public C45953b0(C84926a aVar) {
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandEvaluateDialogHelper$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "user clicked dialog inside");
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandEvaluateDialogHelper$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
