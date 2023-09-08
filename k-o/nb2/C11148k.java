package nb2;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;

/* renamed from: nb2.k */
public final class C11148k implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ GestureDetector f32925d;

    public C11148k(GestureDetector gestureDetector) {
        this.f32925d = gestureDetector;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        ArrayList arrayList = new ArrayList();
        View view2 = view;
        arrayList.add(view);
        arrayList.add(motionEvent2);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$initFullScreen$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        GestureDetector gestureDetector = this.f32925d;
        C9556a aVar = new C9556a();
        aVar.mo10233c(motionEvent2);
        GestureDetector gestureDetector2 = gestureDetector;
        C117292a.m165358d(gestureDetector2, aVar.mo10232b(), "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$initFullScreen$1", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        boolean onTouchEvent = gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0));
        C117292a.m165360f(gestureDetector2, onTouchEvent, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$initFullScreen$1", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        C117292a.m165362h(onTouchEvent, this, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$initFullScreen$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return onTouchEvent;
    }
}
