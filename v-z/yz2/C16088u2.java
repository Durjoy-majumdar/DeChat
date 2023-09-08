package yz2;

import android.view.MotionEvent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: yz2.u2 */
public final class C16088u2 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ C16089v2 f43235d;

    public C16088u2(C16089v2 v2Var) {
        this.f43235d = v2Var;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusTopicSquareScrollUIC$initView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        C16089v2 v2Var = this.f43235d;
        if (v2Var.f43238f != null) {
            v2Var.f43238f = null;
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/textstatus/ui/TextStatusTopicSquareScrollUIC$initView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
