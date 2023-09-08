package te0;

import android.view.View;
import com.tencent.p014mm.openim.p018ui.dialog.OpenIMKefuConfirmDialogView;
import j20.C117292a;
import java.util.ArrayList;
import se0.C22361f;

/* renamed from: te0.g */
public final class C77901g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ OpenIMKefuConfirmDialogView f226962d;

    public C77901g(OpenIMKefuConfirmDialogView openIMKefuConfirmDialogView) {
        this.f226962d = openIMKefuConfirmDialogView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/openim/ui/dialog/OpenIMKefuConfirmDialogView$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C22361f.C22363b bVar = this.f226962d.f195852Y0;
        if (bVar != null) {
            bVar.mo35500b();
        }
        C117292a.m165361g(this, "com/tencent/mm/openim/ui/dialog/OpenIMKefuConfirmDialogView$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
