package e22;

import android.view.MotionEvent;
import android.view.View;
import e22.C75516l0;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: e22.p0 */
public final class C75527p0 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ C75516l0.C75517a f221907d;

    public C75527p0(C75516l0.C75517a aVar) {
        this.f221907d = aVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/label/ui/HeaderLabelDataItem$HeaderLabelViewItem$setHolderView$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        this.f221907d.mo105836a();
        this.f221907d.mo105836a().clearFocus();
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/label/ui/HeaderLabelDataItem$HeaderLabelViewItem$setHolderView$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
