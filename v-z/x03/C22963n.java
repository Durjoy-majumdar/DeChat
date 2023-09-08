package x03;

import android.view.GestureDetector;
import android.view.MotionEvent;
import j20.C117292a;
import java.util.ArrayList;
import sn0.C90259e;
import x03.C22960m;

/* renamed from: x03.n */
public class C22963n extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: d */
    public final /* synthetic */ C22960m f65981d;

    public C22963n(C22960m mVar) {
        this.f65981d = mVar;
    }

    public boolean onContextClick(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/video/TopStoryGestureController$2", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onContextClick = super.onContextClick(motionEvent);
        C117292a.m165362h(onContextClick, this, "com/tencent/mm/plugin/topstory/ui/video/TopStoryGestureController$2", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        return onContextClick;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/video/TopStoryGestureController$2", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        C22960m mVar = this.f65981d;
        mVar.f65965b.removeCallbacks(mVar.f65974k);
        this.f65981d.f65968e.mo36125g();
        C117292a.m165362h(true, this, "com/tencent/mm/plugin/topstory/ui/video/TopStoryGestureController$2", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return true;
    }

    public void onLongPress(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/video/TopStoryGestureController$2", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        super.onLongPress(motionEvent);
        C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/video/TopStoryGestureController$2", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C22960m.C22962b bVar = C22960m.C22962b.FastBackwardOrForward;
        if (!(motionEvent == null || motionEvent2 == null)) {
            if (this.f65981d.f65966c == C22960m.C22962b.None) {
                if (Math.abs(f) > Math.abs(f2)) {
                    this.f65981d.f65966c = bVar;
                } else if (motionEvent.getX() < ((float) (this.f65981d.f65965b.getMeasuredWidth() / 2))) {
                    this.f65981d.f65966c = C22960m.C22962b.Brightness;
                } else {
                    this.f65981d.f65966c = C22960m.C22962b.Volume;
                }
            }
            float x = motionEvent2.getX() - motionEvent.getX();
            motionEvent2.getY();
            motionEvent.getY();
            C22960m mVar = this.f65981d;
            if (mVar.f65966c == bVar) {
                if (mVar.f65972i == -1) {
                    mVar.f65968e.mo36127h();
                    mVar.f65972i = mVar.f65968e.getCurrentPosition();
                }
                mVar.f65973j = mVar.f65968e.mo36120b(mVar.f65972i, x);
            }
        }
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/video/TopStoryGestureController$2", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        C22960m mVar = this.f65981d;
        mVar.f65965b.postDelayed(mVar.f65974k, 200);
        C117292a.m165362h(true, this, "com/tencent/mm/plugin/topstory/ui/video/TopStoryGestureController$2", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return true;
    }
}
