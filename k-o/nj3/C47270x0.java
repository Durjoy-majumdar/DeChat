package nj3;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: nj3.x0 */
public class C47270x0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C76901s0 f126891d;

    public C47270x0(C76901s0 s0Var) {
        this.f126891d = s0Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/base/MMToast$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f126891d.dismiss();
        C117292a.m165361g(this, "com/tencent/mm/ui/base/MMToast$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
