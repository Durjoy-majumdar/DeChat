package bt1;

import android.view.View;
import gy3.C8479f0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import te3.C64899zy;

/* renamed from: bt1.n */
public final class C54577n implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C54585t f153032d;

    /* renamed from: e */
    public final /* synthetic */ C8479f0<String> f153033e;

    public C54577n(C54585t tVar, C8479f0<String> f0Var) {
        this.f153032d = tVar;
        this.f153033e = f0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/widget/post/PostVideoWidget$initFakeVideoLogic$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C54585t tVar = this.f153032d;
        String str = (String) this.f153033e.f27484d;
        tVar.getClass();
        LinkedList linkedList = new LinkedList();
        C64899zy zyVar = tVar.f153060p;
        if (zyVar != null) {
            linkedList.add(tVar.mo75482n(zyVar));
        }
        tVar.mo75484p(linkedList);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/widget/post/PostVideoWidget$initFakeVideoLogic$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
