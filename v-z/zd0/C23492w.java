package zd0;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: zd0.w */
public final class C23492w implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C23466p f67388d;

    public C23492w(C23466p pVar) {
        this.f67388d = pVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog$showSample$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C23466p pVar = this.f67388d;
        if (pVar.f67308E) {
            pVar.mo36948i(false, new C23491v(pVar));
            pVar.f67308E = false;
        }
        C117292a.m165361g(this, "com/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog$showSample$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
