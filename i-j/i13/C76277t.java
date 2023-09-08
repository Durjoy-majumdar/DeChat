package i13;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: i13.t */
public final class C76277t implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C76259g f223465d;

    public C76277t(C76259g gVar) {
        this.f223465d = gVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog$init$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C76259g gVar = this.f223465d;
        int i = C76259g.f223395Q0;
        gVar.mo106510K(6);
        C117292a.m165361g(this, "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog$init$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
