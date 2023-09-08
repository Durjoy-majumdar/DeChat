package i13;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: i13.b */
public final class C8843b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C8840a f28070d;

    public C8843b(C8840a aVar) {
        this.f28070d = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/transvoice/ui/LanguageChoiceDialog$init$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f28070d.dismiss();
        C117292a.m165361g(this, "com/tencent/mm/plugin/transvoice/ui/LanguageChoiceDialog$init$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
