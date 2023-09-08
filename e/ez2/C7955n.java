package ez2;

import android.view.GestureDetector;
import android.view.MotionEvent;
import fy3.C32224a;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;
import sn0.C90259e;

/* renamed from: ez2.n */
public final class C7955n implements GestureDetector.OnGestureListener {

    /* renamed from: d */
    public final /* synthetic */ C32224a<C13598b0> f26640d;

    public C7955n(C32224a<C13598b0> aVar) {
        this.f26640d = aVar;
    }

    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public void onLongPress(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/convert/topic/TopicSquareItemConvert$onBindViewHolder$gestureDetector$2", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/convert/topic/TopicSquareItemConvert$onBindViewHolder$gestureDetector$2", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/convert/topic/TopicSquareItemConvert$onBindViewHolder$gestureDetector$2", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        this.f26640d.invoke();
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/textstatus/convert/topic/TopicSquareItemConvert$onBindViewHolder$gestureDetector$2", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return false;
    }
}
