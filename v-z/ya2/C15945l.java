package ya2;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.tencent.p014mm.plugin.music.p080ui.view.WxMaxSizeRecyclerView;
import j20.C117292a;
import java.util.ArrayList;
import sn0.C90259e;

/* renamed from: ya2.l */
public final class C15945l implements GestureDetector.OnGestureListener {

    /* renamed from: d */
    public final /* synthetic */ WxMaxSizeRecyclerView f42831d;

    public C15945l(WxMaxSizeRecyclerView wxMaxSizeRecyclerView) {
        this.f42831d = wxMaxSizeRecyclerView;
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
        C117292a.m165356b("com/tencent/mm/plugin/music/ui/view/WxMaxSizeRecyclerView$gestureDetector$1", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        C117292a.m165361g(this, "com/tencent/mm/plugin/music/ui/view/WxMaxSizeRecyclerView$gestureDetector$1", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
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
        C117292a.m165356b("com/tencent/mm/plugin/music/ui/view/WxMaxSizeRecyclerView$gestureDetector$1", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        this.f42831d.getClass();
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/music/ui/view/WxMaxSizeRecyclerView$gestureDetector$1", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return false;
    }
}
