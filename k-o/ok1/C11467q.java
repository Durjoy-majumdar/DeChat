package ok1;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.SeekBar;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ok1.q */
public final class C11467q implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ SeekBar f33719d;

    /* renamed from: e */
    public final /* synthetic */ int f33720e;

    public C11467q(SeekBar seekBar, int i) {
        this.f33719d = seekBar;
        this.f33720e = i;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil$setSeekBarTouchDelegate$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        Rect rect = new Rect();
        this.f33719d.getHitRect(rect);
        if (motionEvent.getY() < ((float) (rect.top - this.f33720e)) || motionEvent.getY() > ((float) (rect.bottom + this.f33720e)) || motionEvent.getX() < ((float) rect.left) || motionEvent.getX() > ((float) rect.right)) {
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil$setSeekBarTouchDelegate$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getX() - ((float) rect.left), ((float) rect.top) + (((float) rect.height()) / 2.0f), motionEvent.getMetaState());
        C87412m.m108593f(obtain, "obtain(event.downTime,\n …         event.metaState)");
        boolean onTouchEvent = this.f33719d.onTouchEvent(obtain);
        C117292a.m165362h(onTouchEvent, this, "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil$setSeekBarTouchDelegate$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return onTouchEvent;
    }
}
