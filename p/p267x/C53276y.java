package p267x;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: x.y */
public final class C53276y extends C87413o implements C32224a<Boolean> {

    /* renamed from: d */
    public final /* synthetic */ View f148859d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53276y(View view) {
        super(0);
        this.f148859d = view;
    }

    public Object invoke() {
        boolean z;
        ViewParent parent = this.f148859d.getParent();
        while (true) {
            if (parent == null || !(parent instanceof ViewGroup)) {
                z = false;
            } else {
                ViewGroup viewGroup = (ViewGroup) parent;
                if (viewGroup.shouldDelayChildPressedState()) {
                    z = true;
                    break;
                }
                parent = viewGroup.getParent();
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
