package p22;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import p22.C110125k;

/* renamed from: p22.j */
public class C110124j implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C110125k f329467d;

    public C110124j(C110125k kVar) {
        this.f329467d = kVar;
    }

    public void onClick(View view) {
        C110125k.C110126a aVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/lite/keyboard/LiteAppNumberKeyboardPanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C110125k kVar = this.f329467d;
        int i = C110125k.f329468i;
        if (!kVar.f329470e && (aVar = kVar.f329471f) != null) {
            kVar.f329470e = true;
            aVar.onDone();
            kVar.f329470e = false;
        }
        this.f329467d.setVisibility(8);
        C117292a.m165361g(this, "com/tencent/mm/plugin/lite/keyboard/LiteAppNumberKeyboardPanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
