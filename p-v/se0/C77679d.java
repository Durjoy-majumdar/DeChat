package se0;

import android.view.View;
import com.tencent.p014mm.openim.model.IOpenIMKefuConfirmController;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: se0.d */
public final class C77679d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C77680e f226439d;

    public C77679d(C77680e eVar) {
        this.f226439d = eVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/openim/ui/OpenIMKefuConfirmFullUIModelImpl$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        IOpenIMKefuConfirmController iOpenIMKefuConfirmController = this.f226439d.f226424e;
        if (iOpenIMKefuConfirmController != null) {
            iOpenIMKefuConfirmController.cancel();
        }
        C117292a.m165361g(this, "com/tencent/mm/openim/ui/OpenIMKefuConfirmFullUIModelImpl$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
