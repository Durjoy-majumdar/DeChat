package p267x;

import android.view.View;
import android.widget.Magnifier;
import com.google.android.gms.common.internal.Constants;
import gy3.C87412m;
import iy3.C60641c;
import p1166z0.C112539e;
import p1166z0.C112540f;
import p1166z0.C112545k;
import p267x.C111888b2;
import p560i2.C108322d;

/* renamed from: x.c2 */
public final class C111893c2 implements C111884a2 {

    /* renamed from: a */
    public static final C111893c2 f334992a = new C111893c2();

    /* renamed from: x.c2$a */
    public static final class C111894a extends C111888b2.C111889a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111894a(Magnifier magnifier) {
            super(magnifier);
            C87412m.m108594g(magnifier, "magnifier");
        }

        /* renamed from: a */
        public void mo163625a(long j, long j2, float f) {
            if (!Float.isNaN(f)) {
                this.f334983a.setZoom(f);
            }
            if (C112540f.m153747c(j2)) {
                this.f334983a.show(C112539e.m153738c(j), C112539e.m153739d(j), C112539e.m153738c(j2), C112539e.m153739d(j2));
            } else {
                this.f334983a.show(C112539e.m153738c(j), C112539e.m153739d(j));
            }
        }
    }

    /* renamed from: a */
    public boolean mo163623a() {
        return true;
    }

    /* renamed from: b */
    public C111975z1 mo163624b(C111959t1 t1Var, View view, C108322d dVar, float f) {
        C87412m.m108594g(t1Var, "style");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(dVar, Constants.PARAM_DENSITY);
        if (C87412m.m108589b(t1Var, C111959t1.f335173h)) {
            return new C111894a(new Magnifier(view));
        }
        long g0 = dVar.mo143036g0(t1Var.f335175b);
        float T = dVar.mo143034T(t1Var.f335176c);
        float T2 = dVar.mo143034T(t1Var.f335177d);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (g0 != C112545k.f336974c) {
            builder.setSize(C60641c.m70921b(C112545k.m153758d(g0)), C60641c.m70921b(C112545k.m153756b(g0)));
        }
        if (!Float.isNaN(T)) {
            builder.setCornerRadius(T);
        }
        if (!Float.isNaN(T2)) {
            builder.setElevation(T2);
        }
        if (!Float.isNaN(f)) {
            builder.setInitialZoom(f);
        }
        builder.setClippingEnabled(t1Var.f335178e);
        Magnifier build = builder.build();
        C87412m.m108593f(build, "Builder(view).run {\n    …    build()\n            }");
        return new C111894a(build);
    }
}
