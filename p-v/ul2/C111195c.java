package ul2;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.tencent.p014mm.plugin.scanner.p101ui.widget.BaseScrollTabView;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import sn0.C90259e;

/* renamed from: ul2.c */
public final class C111195c extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: d */
    public final /* synthetic */ BaseScrollTabView f333006d;

    public C111195c(BaseScrollTabView baseScrollTabView) {
        this.f333006d = baseScrollTabView;
    }

    public boolean onContextClick(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/scanner/ui/widget/BaseScrollTabView$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onContextClick = super.onContextClick(motionEvent);
        C117292a.m165362h(onContextClick, this, "com/tencent/mm/plugin/scanner/ui/widget/BaseScrollTabView$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        return onContextClick;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/scanner/ui/widget/BaseScrollTabView$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onDoubleTap = super.onDoubleTap(motionEvent);
        C117292a.m165362h(onDoubleTap, this, "com/tencent/mm/plugin/scanner/ui/widget/BaseScrollTabView$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return onDoubleTap;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z = false;
        Log.m105927v("MicroMsg.BaseScrollTabView", "alvinluo onFling velocityX: %f, velocityY: %f, touchDownSelectedIndex: %d, selectedIndex: %d", Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(this.f333006d.f315945B), Integer.valueOf(this.f333006d.f315956i));
        BaseScrollTabView baseScrollTabView = this.f333006d;
        boolean z2 = baseScrollTabView.f315945B == baseScrollTabView.f315956i;
        if (Math.abs(f) > Math.abs(f2) && z2) {
            if (f <= -100.0f) {
                BaseScrollTabView baseScrollTabView2 = this.f333006d;
                int i = baseScrollTabView2.f315956i + 1;
                if (i >= 0 && i < baseScrollTabView2.f315954g.size()) {
                    z = true;
                }
                if (z) {
                    BaseScrollTabView baseScrollTabView3 = this.f333006d;
                    baseScrollTabView3.f315946C = true;
                    baseScrollTabView3.mo151707j(i, 2);
                }
            } else if (f >= 100.0f) {
                BaseScrollTabView baseScrollTabView4 = this.f333006d;
                int i2 = baseScrollTabView4.f315956i - 1;
                if (i2 >= 0 && i2 < baseScrollTabView4.f315954g.size()) {
                    z = true;
                }
                if (z) {
                    BaseScrollTabView baseScrollTabView5 = this.f333006d;
                    baseScrollTabView5.f315946C = true;
                    baseScrollTabView5.mo151707j(i2, 2);
                }
            }
        }
        return super.onFling(motionEvent, motionEvent2, f, f2);
    }

    public void onLongPress(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/scanner/ui/widget/BaseScrollTabView$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        super.onLongPress(motionEvent);
        C117292a.m165361g(this, "com/tencent/mm/plugin/scanner/ui/widget/BaseScrollTabView$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/scanner/ui/widget/BaseScrollTabView$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
        C117292a.m165362h(onSingleTapUp, this, "com/tencent/mm/plugin/scanner/ui/widget/BaseScrollTabView$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return onSingleTapUp;
    }
}
