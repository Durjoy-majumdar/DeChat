package com.tencent.mapsdk.internal;

import android.view.animation.Interpolator;
import com.tencent.tencentmap.mapsdk.maps.model.Animation;
import com.tencent.tencentmap.mapsdk.maps.model.IAnimationSet;

/* renamed from: com.tencent.mapsdk.internal.hj */
public final class C113809hj extends C113805hi implements IAnimationSet {
    public C113809hj(boolean z) {
        if (this.f340538a == null) {
            this.f340538a = new C113823ia(z);
        }
    }

    public final boolean addAnimation(Animation animation) {
        C113820hz hzVar;
        C113820hz hzVar2;
        if (animation == null || !(animation instanceof C113805hi) || (hzVar = ((C113805hi) animation).f340538a) == null || (hzVar2 = this.f340538a) == null) {
            return false;
        }
        ((C113823ia) hzVar2).mo172213a(hzVar);
        return true;
    }

    public final void cleanAnimation() {
        C113820hz hzVar = this.f340538a;
        if (hzVar != null) {
            ((C113823ia) hzVar).mo172214c();
        }
    }

    public final void setDuration(long j) {
        C113820hz hzVar = this.f340538a;
        if (hzVar != null) {
            hzVar.mo172203a(j);
        }
    }

    public final void setInterpolator(Interpolator interpolator) {
        C113820hz hzVar = this.f340538a;
        if (hzVar != null && interpolator != null) {
            hzVar.f340560f = interpolator;
        }
    }
}
