package rr3;

import com.tencent.p014mm.xeffect.effect.VLogEffectJNI;
import rx3.C13604l;
import sx3.C90363p0;

/* renamed from: rr3.b */
public final class C110622b extends C110625c0 {
    public C110622b(long j) {
        super(j);
    }

    /* renamed from: c */
    public C110632i mo162185c() {
        return C110632i.BlurEffect;
    }

    /* renamed from: d */
    public final void mo162186d(float f) {
        VLogEffectJNI.INSTANCE.setEffectParams$renderlib_release(this.f330969c, C90363p0.m113143b(new C13604l(8, Float.valueOf(f))));
    }

    /* renamed from: e */
    public final void mo162187e(float f) {
        VLogEffectJNI.INSTANCE.setEffectParams$renderlib_release(this.f330969c, C90363p0.m113143b(new C13604l(9, Float.valueOf(f))));
    }
}
