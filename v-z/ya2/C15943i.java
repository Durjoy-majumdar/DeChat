package ya2;

import android.view.MotionEvent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ya2.i */
public final class C15943i implements View.OnTouchListener {

    /* renamed from: d */
    public static final C15943i f42829d = new C15943i();

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/music/ui/view/MusicMainSeekBar$initView$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        if (action == 0) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 1) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
        }
        view.onTouchEvent(motionEvent);
        C117292a.m165362h(true, this, "com/tencent/mm/plugin/music/ui/view/MusicMainSeekBar$initView$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
