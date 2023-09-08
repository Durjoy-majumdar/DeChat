package to1;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13604l;
import sn0.C90259e;

/* renamed from: to1.v */
public final class C64989v extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: d */
    public C13604l<Integer, Integer> f187109d = new C13604l<>(0, 0);

    /* renamed from: e */
    public int f187110e;

    /* renamed from: f */
    public View.OnTouchListener f187111f;

    /* renamed from: g */
    public boolean f187112g;

    public boolean onContextClick(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/record/plugin/RecorderActionDetector", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onContextClick = super.onContextClick(motionEvent);
        C117292a.m165362h(onContextClick, this, "com/tencent/mm/plugin/finder/record/plugin/RecorderActionDetector", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        return onContextClick;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/record/plugin/RecorderActionDetector", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onDoubleTap = super.onDoubleTap(motionEvent);
        C117292a.m165362h(onDoubleTap, this, "com/tencent/mm/plugin/finder/record/plugin/RecorderActionDetector", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return onDoubleTap;
    }

    public boolean onDown(MotionEvent motionEvent) {
        this.f187112g = false;
        return super.onDown(motionEvent);
    }

    public void onLongPress(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/record/plugin/RecorderActionDetector", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        Log.m105924i("MicroMsg.FinderTemplateListPlugin", "onLongPress() called with: e = " + motionEvent);
        View.OnTouchListener onTouchListener = this.f187111f;
        if (onTouchListener != null) {
            onTouchListener.onTouch((View) null, motionEvent);
        }
        this.f187112g = true;
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/record/plugin/RecorderActionDetector", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        Log.m105924i("MicroMsg.FinderTemplateListPlugin", "onSingleTapConfirmed() called with: e = " + motionEvent);
        if (motionEvent != null) {
            double d = (double) 2;
            if (((float) Math.pow((double) (((float) Math.pow((double) (motionEvent.getX() - ((Number) this.f187109d.f38555d).floatValue()), d)) + ((float) Math.pow((double) (motionEvent.getY() - ((Number) this.f187109d.f38556e).floatValue()), d))), (double) 0.5f)) < ((float) this.f187110e)) {
                View.OnTouchListener onTouchListener = this.f187111f;
                if (onTouchListener != null) {
                    MotionEvent obtain = MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);
                    obtain.setAction(0);
                    onTouchListener.onTouch((View) null, obtain);
                }
                View.OnTouchListener onTouchListener2 = this.f187111f;
                if (onTouchListener2 == null) {
                    return true;
                }
                MotionEvent obtain2 = MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);
                obtain2.setAction(1);
                onTouchListener2.onTouch((View) null, obtain2);
                return true;
            }
        }
        return false;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/record/plugin/RecorderActionDetector", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
        C117292a.m165362h(onSingleTapUp, this, "com/tencent/mm/plugin/finder/record/plugin/RecorderActionDetector", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return onSingleTapUp;
    }
}
