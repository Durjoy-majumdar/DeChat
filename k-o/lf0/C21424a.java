package lf0;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.tencent.p014mm.picker.base.view.WheelView;
import j20.C117292a;
import java.util.ArrayList;
import mf0.C21499c;
import sn0.C90259e;

/* renamed from: lf0.a */
public final class C21424a extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: d */
    public final WheelView f60631d;

    public C21424a(WheelView wheelView) {
        this.f60631d = wheelView;
    }

    public boolean onContextClick(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/picker/base/listener/LoopViewGestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onContextClick = super.onContextClick(motionEvent);
        C117292a.m165362h(onContextClick, this, "com/tencent/mm/picker/base/listener/LoopViewGestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        return onContextClick;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/picker/base/listener/LoopViewGestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onDoubleTap = super.onDoubleTap(motionEvent);
        C117292a.m165362h(onDoubleTap, this, "com/tencent/mm/picker/base/listener/LoopViewGestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return onDoubleTap;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        WheelView wheelView = this.f60631d;
        wheelView.mo22028a();
        wheelView.f49151q = wheelView.f49150p.mo109820a(new C21499c(wheelView, f2), 0, 5);
        return true;
    }

    public void onLongPress(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/picker/base/listener/LoopViewGestureListener", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        super.onLongPress(motionEvent);
        C117292a.m165361g(this, "com/tencent/mm/picker/base/listener/LoopViewGestureListener", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/picker/base/listener/LoopViewGestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
        C117292a.m165362h(onSingleTapUp, this, "com/tencent/mm/picker/base/listener/LoopViewGestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return onSingleTapUp;
    }
}
