package i13;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: i13.i */
public final class C76265i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C76259g f223452d;

    public C76265i(C76259g gVar) {
        this.f223452d = gVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog$init$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C76259g.m91668F(this.f223452d);
        C117292a.m165361g(this, "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog$init$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
