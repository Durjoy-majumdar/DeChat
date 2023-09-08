package qj1;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;

/* renamed from: qj1.y2 */
public final class C12757y2 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ C12765z2 f36547d;

    public C12757y2(C12765z2 z2Var) {
        this.f36547d = z2Var;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        MotionEvent motionEvent2 = motionEvent;
        ArrayList arrayList = new ArrayList();
        View view2 = view;
        arrayList.add(view);
        arrayList.add(motionEvent2);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorMusicVolumePlugin$initGestureDetector$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        GestureDetector gestureDetector = this.f36547d.f36561s;
        if (gestureDetector != null) {
            C9556a aVar = new C9556a();
            aVar.mo10233c(motionEvent2);
            GestureDetector gestureDetector2 = gestureDetector;
            C117292a.m165358d(gestureDetector2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorMusicVolumePlugin$initGestureDetector$1", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            boolean onTouchEvent = gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0));
            C117292a.m165360f(gestureDetector2, onTouchEvent, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorMusicVolumePlugin$initGestureDetector$1", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            z = onTouchEvent;
        } else {
            z = false;
        }
        C117292a.m165362h(z, this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorMusicVolumePlugin$initGestureDetector$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z;
    }
}
