package i13;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: i13.u */
public final class C8845u implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C76259g f28072d;

    public C8845u(C76259g gVar) {
        this.f28072d = gVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog$init$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f28072d.f223422g = System.currentTimeMillis();
        C76259g gVar = this.f28072d;
        C8840a aVar = gVar.f223405J;
        if (aVar != null) {
            aVar.f28062i = gVar.f223437x;
        }
        if (aVar != null) {
            aVar.mo9687E();
        }
        C8840a aVar2 = this.f28072d.f223405J;
        if (aVar2 != null) {
            aVar2.show();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog$init$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
