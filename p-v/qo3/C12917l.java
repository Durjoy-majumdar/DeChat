package qo3;

import android.content.DialogInterface;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: qo3.l */
public class C12917l implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C77389a f36910d;

    /* renamed from: e */
    public final /* synthetic */ C77398g f36911e;

    public C12917l(C77398g gVar, C77389a aVar) {
        this.f36911e = gVar;
        this.f36910d = aVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/widget/dialog/MMAlertDialog$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        DialogInterface.OnClickListener onClickListener = this.f36910d.f225620C;
        if (onClickListener != null) {
            onClickListener.onClick(this.f36911e, -1);
        }
        if (this.f36910d.f225641X) {
            this.f36911e.dismiss();
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/widget/dialog/MMAlertDialog$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
