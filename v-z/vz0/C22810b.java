package vz0;

import android.view.View;
import android.widget.CheckBox;
import gz0.C20871g;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: vz0.b */
public class C22810b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C20871g f65579d;

    public C22810b(C22813c cVar, C20871g gVar) {
        this.f65579d = gVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/card/ui/view/CardAcceptView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (((CheckBox) view).isChecked()) {
            this.f65579d.mo32577b().f59504w = true;
        } else {
            this.f65579d.mo32577b().f59504w = false;
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/view/CardAcceptView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
