package qo3;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C101218e0;

/* renamed from: qo3.f0 */
public class C12908f0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C101218e0 f36892d;

    public C12908f0(C101218e0 e0Var) {
        this.f36892d = e0Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/widget/dialog/MMHalfBottomDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C101218e0.C12907m mVar = this.f36892d.f296373D;
        if (mVar != null) {
            mVar.mo2001a();
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/widget/dialog/MMHalfBottomDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
