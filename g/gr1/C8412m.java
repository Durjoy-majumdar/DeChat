package gr1;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: gr1.m */
public final class C8412m implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ FinderFullSeekBarLayout f27409d;

    public C8412m(FinderFullSeekBarLayout finderFullSeekBarLayout) {
        this.f27409d = finderFullSeekBarLayout;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        float f;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout$enlargeSeekBarListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        FinderFullSeekBarLayout finderFullSeekBarLayout = this.f27409d;
        if (!finderFullSeekBarLayout.f17507V || !finderFullSeekBarLayout.mo4275s(view, motionEvent)) {
            this.f27409d.f17502S0 = false;
            z = false;
        } else {
            Rect rect = this.f27409d.f17500R0;
            float height = ((float) rect.top) + (((float) rect.height()) / 2.0f);
            float x = motionEvent.getX();
            Rect rect2 = this.f27409d.f17500R0;
            float f2 = x - ((float) rect2.left);
            if (f2 < 0.0f) {
                f = 0.0f;
            } else {
                if (f2 > ((float) rect2.width())) {
                    f2 = (float) this.f27409d.f17500R0.width();
                }
                f = f2;
            }
            this.f27409d.getSeekBar().onTouchEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), f, height, motionEvent.getMetaState()));
            z = true;
        }
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.f27409d.f17502S0 = false;
        }
        FinderFullSeekBarLayout finderFullSeekBarLayout2 = this.f27409d;
        if (!finderFullSeekBarLayout2.f17502S0) {
            finderFullSeekBarLayout2.getParent().requestDisallowInterceptTouchEvent(false);
        }
        C117292a.m165362h(z, this, "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout$enlargeSeekBarListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z;
    }
}
