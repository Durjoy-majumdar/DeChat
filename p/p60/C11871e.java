package p60;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import r60.C101350i;
import rx3.C13598b0;
import t60.C101723d;

/* renamed from: p60.e */
public final class C11871e implements C101723d {

    /* renamed from: a */
    public Animation f34711a;

    /* renamed from: b */
    public C101350i<?> f34712b;

    /* renamed from: p60.e$a */
    public static final class C11872a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C11871e f34713d;

        /* renamed from: e */
        public final /* synthetic */ C101350i<?> f34714e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11872a(C11871e eVar, C101350i<?> iVar) {
            super(0);
            this.f34713d = eVar;
            this.f34714e = iVar;
        }

        public Object invoke() {
            View a;
            this.f34713d.f34711a.setDuration(320);
            C11871e eVar = this.f34713d;
            C101350i<?> iVar = eVar.f34712b;
            if (iVar == null) {
                iVar = this.f34714e;
            }
            eVar.f34711a.setAnimationListener(new C11870d(iVar));
            if (!(iVar == null || (a = iVar.mo140837a()) == null)) {
                a.startAnimation(this.f34713d.f34711a);
            }
            return C13598b0.f38549a;
        }
    }

    public C11871e(Animation animation, C101350i<?> iVar, int i, C8480h hVar) {
        animation = (i & 1) != 0 ? new AlphaAnimation(0.0f, 1.0f) : animation;
        iVar = (i & 2) != 0 ? null : iVar;
        C87412m.m108594g(animation, "animation");
        this.f34711a = animation;
        this.f34712b = iVar;
    }

    /* renamed from: a */
    public void mo11750a(C101350i<?> iVar) {
    }

    /* renamed from: b */
    public void mo11751b(C101350i<?> iVar) {
        C61926c.m72668M(new C11872a(this, iVar));
    }
}
