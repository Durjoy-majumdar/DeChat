package tn3;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: tn3.e */
public class C118500e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C118501f f354658d;

    public C118500e(C118501f fVar) {
        this.f354658d = fVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/twitter/TwitterDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((C118493b) this.f354658d.f354661e).mo183215c();
        this.f354658d.dismiss();
        C117292a.m165361g(this, "com/tencent/mm/ui/twitter/TwitterDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
