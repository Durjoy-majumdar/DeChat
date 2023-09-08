package xm3;

import android.view.MotionEvent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: xm3.h0 */
public final class C78903h0 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ C78889f0 f231766d;

    public C78903h0(C78889f0 f0Var) {
        this.f231766d = f0Var;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/mvvm/uic/base/SelectContactSearchMvvmListUIC$onCreate$2$1$hideVKBListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        this.f231766d.mo14600f3();
        C117292a.m165362h(false, this, "com/tencent/mm/ui/mvvm/uic/base/SelectContactSearchMvvmListUIC$onCreate$2$1$hideVKBListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
