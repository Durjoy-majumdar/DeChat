package qo3;

import android.content.DialogInterface;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: qo3.m */
public class C12920m implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C77389a f36915d;

    /* renamed from: e */
    public final /* synthetic */ C77398g f36916e;

    public C12920m(C77398g gVar, C77389a aVar) {
        this.f36916e = gVar;
        this.f36915d = aVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/widget/dialog/MMAlertDialog$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        DialogInterface.OnClickListener onClickListener = this.f36915d.f225621D;
        if (onClickListener != null) {
            onClickListener.onClick(this.f36916e, -2);
        }
        this.f36916e.cancel();
        C117292a.m165361g(this, "com/tencent/mm/ui/widget/dialog/MMAlertDialog$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
