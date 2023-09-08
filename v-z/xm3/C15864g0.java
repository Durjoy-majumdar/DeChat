package xm3;

import android.view.MotionEvent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: xm3.g0 */
public final class C15864g0 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ C78889f0 f42714d;

    public C15864g0(C78889f0 f0Var) {
        this.f42714d = f0Var;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/mvvm/uic/base/SelectContactSearchMvvmListUIC$onCreate$2$1$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        this.f42714d.getClass();
        this.f42714d.getClass();
        this.f42714d.getClass();
        C117292a.m165362h(false, this, "com/tencent/mm/ui/mvvm/uic/base/SelectContactSearchMvvmListUIC$onCreate$2$1$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
