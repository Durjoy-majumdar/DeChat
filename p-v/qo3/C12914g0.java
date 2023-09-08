package qo3;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C101218e0;

/* renamed from: qo3.g0 */
public class C12914g0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C101218e0 f36905d;

    public C12914g0(C101218e0 e0Var) {
        this.f36905d = e0Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/widget/dialog/MMHalfBottomDialog$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C101218e0.C12907m mVar = this.f36905d.f296374E;
        if (mVar != null) {
            mVar.mo2001a();
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/widget/dialog/MMHalfBottomDialog$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
