package bo3;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import fj3.C20713c;
import gy3.C8480h;
import gy3.C87412m;
import rx3.C36570n;

/* renamed from: bo3.b */
public final class C16816b extends C113202f {

    /* renamed from: b */
    public static final C16816b f45433b = new C16816b();

    public C16816b() {
        super(0, 1, (C8480h) null);
    }

    /* renamed from: a */
    public Animator mo17861a(View view, int i, int i2, C113203g gVar) {
        C87412m.m108594g(view, "view");
        C87412m.m108594g(gVar, "animParam");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", new float[]{(-((float) i)) * 0.3f, 0.0f});
        ofFloat.setDuration(f45433b.f338710a);
        C20713c cVar = C20713c.f58572a;
        ofFloat.setInterpolator((Interpolator) ((C36570n) C20713c.f58575d).getValue());
        return ofFloat;
    }
}
