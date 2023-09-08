package x50;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.tencent.p014mm.live.core.view.LiveCameraFocusView;
import com.tencent.p014mm.live.core.view.LiveCameraOptionView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import sn0.C90259e;

/* renamed from: x50.b */
public final class C66235b extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: d */
    public final /* synthetic */ LiveCameraOptionView f190290d;

    public C66235b(LiveCameraOptionView liveCameraOptionView) {
        this.f190290d = liveCameraOptionView;
    }

    public boolean onContextClick(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/live/core/view/LiveCameraOptionView$initGestureDetecotr$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onContextClick = super.onContextClick(motionEvent);
        C117292a.m165362h(onContextClick, this, "com/tencent/mm/live/core/view/LiveCameraOptionView$initGestureDetecotr$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        return onContextClick;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/live/core/view/LiveCameraOptionView$initGestureDetecotr$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        C87412m.m108594g(motionEvent, "e");
        Log.m105924i("LiveCameraOptionView", "onDoubleTap");
        long currentTimeMillis = System.currentTimeMillis();
        LiveCameraOptionView liveCameraOptionView = this.f190290d;
        if (currentTimeMillis - liveCameraOptionView.f157147e > 1000) {
            LiveCameraOptionView.C55208a aVar = liveCameraOptionView.f157146d;
            if (aVar != null) {
                aVar.mo76416c();
            }
            this.f190290d.f157147e = System.currentTimeMillis();
        }
        C117292a.m165362h(false, this, "com/tencent/mm/live/core/view/LiveCameraOptionView$initGestureDetecotr$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return false;
    }

    public void onLongPress(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/live/core/view/LiveCameraOptionView$initGestureDetecotr$1", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        super.onLongPress(motionEvent);
        C117292a.m165361g(this, "com/tencent/mm/live/core/view/LiveCameraOptionView$initGestureDetecotr$1", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "e");
        Log.m105924i("LiveCameraOptionView", "onSingleTapConfirmed");
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/live/core/view/LiveCameraOptionView$initGestureDetecotr$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        C87412m.m108594g(motionEvent, "e");
        Log.m105924i("LiveCameraOptionView", "onSingleTapUp");
        LiveCameraOptionView.C55208a aVar = this.f190290d.f157146d;
        if (aVar != null) {
            aVar.mo76417d(motionEvent.getX(), motionEvent.getY(), this.f190290d.getWidth(), this.f190290d.getHeight(), 400);
        }
        LiveCameraFocusView liveCameraFocusView = this.f190290d.f157150h;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        ViewGroup.LayoutParams layoutParams = liveCameraFocusView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.leftMargin = ((int) x) - (liveCameraFocusView.f157141q / 2);
            marginLayoutParams.topMargin = ((int) y) - (liveCameraFocusView.f157142r / 2);
            liveCameraFocusView.setLayoutParams(marginLayoutParams);
            liveCameraFocusView.setVisibility(0);
            liveCameraFocusView.f157132e = true;
            liveCameraFocusView.f157133f = false;
            liveCameraFocusView.f157134g = false;
            liveCameraFocusView.f157135h = System.currentTimeMillis();
            liveCameraFocusView.invalidate();
        }
        C117292a.m165362h(false, this, "com/tencent/mm/live/core/view/LiveCameraOptionView$initGestureDetecotr$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return false;
    }
}
