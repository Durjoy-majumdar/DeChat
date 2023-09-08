package ce1;

import android.view.View;
import android.widget.CheckBox;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ce1.v */
public final class C0493v implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C0479p f1217d;

    public C0493v(C0479p pVar) {
        this.f1217d = pVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/activity/uic/FinderActivityPostUIC$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        CheckBox checkBox = this.f1217d.f1193r;
        if (checkBox == null) {
            C87412m.m108603p("announceCheckBox");
            throw null;
        } else if (checkBox != null) {
            checkBox.setChecked(!checkBox.isChecked());
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/activity/uic/FinderActivityPostUIC$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            C87412m.m108603p("announceCheckBox");
            throw null;
        }
    }
}
