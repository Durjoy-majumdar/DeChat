package rr3;

import com.tencent.p014mm.xeffect.effect.VLogEffectJNI;
import rx3.C13604l;
import sx3.C90363p0;

/* renamed from: rr3.k */
public final class C110634k extends C110625c0 {

    /* renamed from: d */
    public float f331000d = 0.5f;

    public C110634k(long j) {
        super(j);
    }

    /* renamed from: c */
    public C110632i mo162185c() {
        return C110632i.GradientBlurEffect;
    }

    /* renamed from: d */
    public final void mo162191d(float f) {
        VLogEffectJNI.INSTANCE.setEffectParams$renderlib_release(this.f330969c, C90363p0.m113143b(new C13604l(8, Float.valueOf(f))));
    }
}
