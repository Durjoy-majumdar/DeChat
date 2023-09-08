package p912nb;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: nb.a */
public class C76847a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C88909b f224669d;

    public C76847a(C88909b bVar) {
        this.f224669d = bVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/luggage/game/widget/input/WAGameInputPanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        View.OnClickListener onClickListener = this.f224669d.f256409F;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        C117292a.m165361g(this, "com/tencent/luggage/game/widget/input/WAGameInputPanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
