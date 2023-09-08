package yi2;

import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: yi2.e */
public final class C16016e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C16018g f43083d;

    public C16016e(C16018g gVar) {
        this.f43083d = gVar;
    }

    public final void onClick(View view) {
        Editable text;
        String obj;
        C16013b bVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/RepairerSetValueDialog$initContentView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        EditText editText = this.f43083d.f43089j;
        if (!(editText == null || (text = editText.getText()) == null || (obj = text.toString()) == null || (bVar = this.f43083d.f43088i) == null)) {
            bVar.mo14637a(obj);
        }
        this.f43083d.dismiss();
        C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/RepairerSetValueDialog$initContentView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
