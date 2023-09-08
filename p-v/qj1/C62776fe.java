package qj1;

import android.graphics.Point;
import android.view.ViewGroup;
import j50.C60735a;

/* renamed from: qj1.fe */
public final class C62776fe implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C62761ee f178193d;

    public C62776fe(C62761ee eeVar) {
        this.f178193d = eeVar;
    }

    public final void run() {
        Point point;
        C60735a c;
        C60735a c2 = this.f178193d.mo87763c();
        if (c2 != null && (point = c2.f173003P) != null) {
            C62761ee eeVar = this.f178193d;
            if (point.x == 0 && point.y == 0 && (c = eeVar.mo87763c()) != null) {
                int i = eeVar.f178164g;
                ViewGroup.LayoutParams layoutParams = eeVar.f178163f.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                c.f173003P.set(i, marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
            }
        }
    }
}
