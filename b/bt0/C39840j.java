package bt0;

import android.view.MotionEvent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: bt0.j */
public class C39840j implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ C39842l f106854d;

    public C39840j(C39842l lVar) {
        this.f106854d = lVar;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/actionbar/MMPopupWindowWithMask$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 1) {
            this.f106854d.dismiss();
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/appbrand/widget/actionbar/MMPopupWindowWithMask$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/appbrand/widget/actionbar/MMPopupWindowWithMask$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
