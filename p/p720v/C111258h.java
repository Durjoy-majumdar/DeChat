package p720v;

import fy3.C32226l;
import gy3.C87413o;
import p257w.C111669n;
import p436a1.C103272w;
import p450b1.C103981e;

/* renamed from: v.h */
public final class C111258h extends C87413o implements C32226l<C103272w, C111669n> {

    /* renamed from: d */
    public static final C111258h f333140d = new C111258h();

    public C111258h() {
        super(1);
    }

    public Object invoke(Object obj) {
        long j = ((C103272w) obj).f304517a;
        long a = C103272w.m136779a(j, C103981e.f307555r);
        float h = C103272w.m136786h(a);
        float g = C103272w.m136785g(a);
        float e = C103272w.m136783e(a);
        float[] fArr = C111263j.f333148b;
        double d = (double) 0.33333334f;
        return new C111669n(C103272w.m136782d(j), (float) Math.pow((double) C111263j.m151770a(0, h, g, e, fArr), d), (float) Math.pow((double) C111263j.m151770a(1, h, g, e, fArr), d), (float) Math.pow((double) C111263j.m151770a(2, h, g, e, fArr), d));
    }
}
