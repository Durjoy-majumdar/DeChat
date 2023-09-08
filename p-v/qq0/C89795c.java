package qq0;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import in3.C87763b;
import junit.framework.Assert;

/* renamed from: qq0.c */
public final class C89795c extends C87763b {

    /* renamed from: w */
    public int f258180w = 0;

    public C89795c(Context context) {
        super(context);
        setClickable(false);
    }

    /* renamed from: O */
    public void mo122167O() {
        super.mo122167O();
        super.setWillNotDraw(true);
    }

    /* renamed from: U3 */
    public void mo6344U3(int i) {
        mo122165G(i);
        this.f258180w = i;
    }

    public void onCancelPendingInputEvents() {
        super.onCancelPendingInputEvents();
        if (getChildCount() == 1) {
            getChildAt(0).cancelPendingInputEvents();
        }
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (!(view instanceof C89813r)) {
            Assert.fail("Cant add non CapsuleBar instance here !");
        }
    }

    public FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2, 21);
    }
}
