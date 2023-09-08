package qo3;

import android.content.DialogInterface;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: qo3.i */
public class C12915i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C77389a f36906d;

    /* renamed from: e */
    public final /* synthetic */ C77398g f36907e;

    public C12915i(C77398g gVar, C77389a aVar) {
        this.f36907e = gVar;
        this.f36906d = aVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/widget/dialog/MMAlertDialog$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        DialogInterface.OnClickListener onClickListener = this.f36906d.f225620C;
        if (onClickListener != null) {
            onClickListener.onClick(this.f36907e, -1);
        }
        if (this.f36906d.f225641X) {
            this.f36907e.dismiss();
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/widget/dialog/MMAlertDialog$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
