package km1;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;

/* renamed from: km1.k */
public final class C10360k implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ C10361l f31539d;

    public C10360k(C10361l lVar) {
        this.f31539d = lVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/nearby/guide/FinderLivePageScrollGuideHelper$attachFloatView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        GestureDetector gestureDetector = this.f31539d.f31548i;
        C9556a aVar = new C9556a();
        aVar.mo10233c(motionEvent);
        GestureDetector gestureDetector2 = gestureDetector;
        C117292a.m165358d(gestureDetector2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/nearby/guide/FinderLivePageScrollGuideHelper$attachFloatView$1", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        boolean onTouchEvent = gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0));
        C117292a.m165360f(gestureDetector2, onTouchEvent, "com/tencent/mm/plugin/finder/nearby/guide/FinderLivePageScrollGuideHelper$attachFloatView$1", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        C117292a.m165362h(onTouchEvent, this, "com/tencent/mm/plugin/finder/nearby/guide/FinderLivePageScrollGuideHelper$attachFloatView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return onTouchEvent;
    }
}
