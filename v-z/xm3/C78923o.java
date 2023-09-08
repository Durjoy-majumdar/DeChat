package xm3;

import android.view.MotionEvent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: xm3.o */
public final class C78923o implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ C78917n f231793d;

    public C78923o(C78917n nVar) {
        this.f231793d = nVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/mvvm/uic/base/SelectContactInitHeaderUIC$onCreate$1$1$hideVKBListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        this.f231793d.mo14600f3();
        C117292a.m165362h(false, this, "com/tencent/mm/ui/mvvm/uic/base/SelectContactInitHeaderUIC$onCreate$1$1$hideVKBListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
