package hn2;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: hn2.m */
public class C46084m implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C98492e f124242d;

    public C46084m(C98492e eVar) {
        this.f124242d = eVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/setting/ui/utils/SafeSwitchTipDialog$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C98492e eVar = this.f124242d;
        eVar.f288869S = true;
        eVar.mo140680z();
        C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/utils/SafeSwitchTipDialog$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
