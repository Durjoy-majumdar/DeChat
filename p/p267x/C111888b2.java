package p267x;

import android.view.View;
import android.widget.Magnifier;
import com.google.android.gms.common.internal.Constants;
import gy3.C87412m;
import p1166z0.C112539e;
import p560i2.C108322d;
import p560i2.C108329n;

/* renamed from: x.b2 */
public final class C111888b2 implements C111884a2 {

    /* renamed from: a */
    public static final C111888b2 f334982a = new C111888b2();

    /* renamed from: x.b2$a */
    public static class C111889a implements C111975z1 {

        /* renamed from: a */
        public final Magnifier f334983a;

        public C111889a(Magnifier magnifier) {
            C87412m.m108594g(magnifier, "magnifier");
            this.f334983a = magnifier;
        }

        /* renamed from: a */
        public void mo163625a(long j, long j2, float f) {
            this.f334983a.show(C112539e.m153738c(j), C112539e.m153739d(j));
        }

        /* renamed from: b */
        public long mo163626b() {
            return C108329n.m146743a(this.f334983a.getWidth(), this.f334983a.getHeight());
        }

        public void dismiss() {
            this.f334983a.dismiss();
        }

        public void updateContent() {
            this.f334983a.update();
        }
    }

    /* renamed from: a */
    public boolean mo163623a() {
        return false;
    }

    /* renamed from: b */
    public C111975z1 mo163624b(C111959t1 t1Var, View view, C108322d dVar, float f) {
        C87412m.m108594g(t1Var, "style");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(dVar, Constants.PARAM_DENSITY);
        return new C111889a(new Magnifier(view));
    }
}
