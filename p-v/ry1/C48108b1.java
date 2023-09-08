package ry1;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ry1.b1 */
public class C48108b1 implements View.OnTouchListener {

    /* renamed from: d */
    public int f128970d = Color.argb(221, 136, 136, 136);

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/ViewChangeBgListener", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        if (action == 0) {
            if (view instanceof ImageView) {
                ImageView imageView = (ImageView) view;
                Drawable drawable = imageView.getDrawable();
                if (drawable != null) {
                    drawable.setColorFilter(this.f128970d, PorterDuff.Mode.MULTIPLY);
                    imageView.setImageDrawable(drawable);
                }
            } else if (view.getBackground() != null) {
                view.getBackground().setColorFilter(this.f128970d, PorterDuff.Mode.MULTIPLY);
            }
        } else if (action == 1 || action == 3) {
            if (view instanceof ImageView) {
                Drawable drawable2 = ((ImageView) view).getDrawable();
                if (drawable2 != null) {
                    drawable2.clearColorFilter();
                }
            } else {
                Drawable background = view.getBackground();
                if (background != null) {
                    background.clearColorFilter();
                }
            }
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/game/ui/ViewChangeBgListener", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
