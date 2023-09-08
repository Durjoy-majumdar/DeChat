package hn2;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: hn2.n */
public class C46085n implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C98492e f124243d;

    public C46085n(C98492e eVar) {
        this.f124243d = eVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/setting/ui/utils/SafeSwitchTipDialog$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f124243d.mo140680z();
        C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/utils/SafeSwitchTipDialog$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
