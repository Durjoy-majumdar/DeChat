package bt1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import sx3.C64197v;

/* renamed from: bt1.o */
public final class C54578o implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C54585t f153034d;

    public C54578o(C54585t tVar) {
        this.f153034d = tVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/widget/post/PostVideoWidget$initNormalVideoLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C54585t tVar = this.f153034d;
        tVar.getClass();
        LinkedList linkedList = new LinkedList();
        ArrayList<String> arrayList2 = tVar.f153057m;
        if (arrayList2 != null) {
            int i = 0;
            for (T next : arrayList2) {
                int i2 = i + 1;
                if (i >= 0) {
                    linkedList.add(tVar.mo75481m((String) next, i));
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
        tVar.mo75484p(linkedList);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/widget/post/PostVideoWidget$initNormalVideoLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
