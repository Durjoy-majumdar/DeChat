package p1138n8;

import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.C104453c;
import p1139o8.C109965a;

/* renamed from: n8.a */
public class C109693a implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d */
    public final /* synthetic */ C104453c f328335d;

    public C109693a(C104453c cVar) {
        this.f328335d = cVar;
    }

    public boolean onPreDraw() {
        C104453c cVar = this.f328335d;
        float rotation = cVar.f309419s.getRotation();
        if (cVar.f309407g == rotation) {
            return true;
        }
        cVar.f309407g = rotation;
        cVar.getClass();
        C109965a aVar = cVar.f309410j;
        if (aVar == null) {
            return true;
        }
        float f = -cVar.f309407g;
        if (f == aVar.f329075m) {
            return true;
        }
        aVar.f329075m = f;
        aVar.invalidateSelf();
        return true;
    }
}
