package rr3;

import android.util.Size;
import com.tencent.p014mm.xeffect.effect.VLogEffectJNI;

/* renamed from: rr3.r */
public abstract class C110642r extends C110625c0 {

    /* renamed from: d */
    public final Size f331003d;

    /* renamed from: e */
    public final long f331004e;

    public C110642r(long j) {
        super(j);
        VLogEffectJNI vLogEffectJNI = VLogEffectJNI.INSTANCE;
        this.f331003d = vLogEffectJNI.getPagSize$renderlib_release(j);
        vLogEffectJNI.getPagImageNum$renderlib_release(j);
        this.f331004e = vLogEffectJNI.getPagDuration$renderlib_release(j);
        vLogEffectJNI.getPagFrameRate$renderlib_release(j);
    }

    /* renamed from: d */
    public final Size mo162192d() {
        return this.f331003d;
    }
}
