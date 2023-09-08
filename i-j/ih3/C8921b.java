package ih3;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C12925w;

/* renamed from: ih3.b */
public final class C8921b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C12925w f28221d;

    public C8921b(C12925w wVar) {
        this.f28221d = wVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/sensitive/ui/PermissionSwitchCheckUtil$showHowManagePermissionDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f28221d.mo5085n();
        C117292a.m165361g(this, "com/tencent/mm/sensitive/ui/PermissionSwitchCheckUtil$showHowManagePermissionDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
