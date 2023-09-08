package yi2;

import android.view.MotionEvent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: yi2.c */
public final class C16014c implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ C16018g f43081d;

    public C16014c(C16018g gVar) {
        this.f43081d = gVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/RepairerSetValueDialog$initContentView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        this.f43081d.cancel();
        C117292a.m165362h(true, this, "com/tencent/mm/plugin/repairer/ui/RepairerSetValueDialog$initContentView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
