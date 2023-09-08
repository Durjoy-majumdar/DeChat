package com.tencent.mapsdk.internal;

import android.view.animation.Interpolator;
import com.tencent.mapsdk.internal.C113820hz;
import com.tencent.tencentmap.mapsdk.maps.model.Animation;
import com.tencent.tencentmap.mapsdk.maps.model.AnimationListener;

/* renamed from: com.tencent.mapsdk.internal.hi */
public abstract class C113805hi implements Animation {

    /* renamed from: a */
    public C113820hz f340538a = null;

    /* renamed from: b */
    public C113806a f340539b;

    /* renamed from: com.tencent.mapsdk.internal.hi$a */
    public static class C113806a implements C113820hz.C113821a {

        /* renamed from: a */
        public AnimationListener f340540a;

        public C113806a(AnimationListener animationListener) {
            this.f340540a = animationListener;
        }

        /* renamed from: b */
        public final void mo172184b() {
            if (this.f340540a != null) {
                C113865kb.m157399a((Runnable) new Runnable() {
                    public final void run() {
                        C113806a.this.f340540a.onAnimationEnd();
                    }
                });
            }
        }

        /* renamed from: a */
        public final void mo172183a() {
            if (this.f340540a != null) {
                C113865kb.m157399a((Runnable) new Runnable() {
                    public final void run() {
                        C113806a.this.f340540a.onAnimationStart();
                    }
                });
            }
        }
    }

    public AnimationListener getAnimationListener() {
        C113806a aVar = this.f340539b;
        if (aVar != null) {
            return aVar.f340540a;
        }
        return null;
    }

    public long getDuration() {
        C113820hz hzVar = this.f340538a;
        if (hzVar != null) {
            return hzVar.mo172202a();
        }
        return 0;
    }

    public Interpolator getInterpolator() {
        C113820hz hzVar = this.f340538a;
        if (hzVar != null) {
            return hzVar.f340560f;
        }
        return null;
    }

    public void setAnimationListener(AnimationListener animationListener) {
        C113806a aVar = new C113806a(animationListener);
        this.f340539b = aVar;
        C113820hz hzVar = this.f340538a;
        if (hzVar != null) {
            hzVar.mo172204a((C113820hz.C113821a) aVar);
        }
    }
}
