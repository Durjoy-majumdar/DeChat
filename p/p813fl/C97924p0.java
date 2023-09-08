package p813fl;

import androidx.recyclerview.widget.C54248l;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import p813fl.C97907h0;
import rx3.C13598b0;

/* renamed from: fl.p0 */
public abstract class C97924p0<T extends C97907h0> {

    /* renamed from: a */
    public boolean f287251a = true;

    /* renamed from: b */
    public boolean f287252b;

    /* renamed from: c */
    public C97915l0 f287253c;

    /* renamed from: fl.p0$a */
    public static final class C97925a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C97924p0<T> f287254d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97925a(C97924p0<T> p0Var) {
            super(0);
            this.f287254d = p0Var;
        }

        public Object invoke() {
            C97924p0<T> p0Var = this.f287254d;
            if (p0Var.f287253c != null) {
                T a = p0Var.mo127611a();
                C54248l.C54251c a2 = C54248l.m60949a(new C97917m0(p0Var.mo127612b().mo127614a(), a.mo127614a()), false);
                p0Var.mo127613d(a);
                C61926c.m72668M(new C97922o0(p0Var, a, a2));
            } else {
                p0Var.f287252b = false;
                p0Var.f287251a = true;
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public abstract T mo127611a();

    /* renamed from: b */
    public abstract T mo127612b();

    /* renamed from: c */
    public final synchronized void mo137253c() {
        if (this.f287252b) {
            this.f287251a = true;
        } else if (this.f287253c != null) {
            this.f287252b = true;
            C61926c.m72657B("PanelGroupModel_postUpdate", true, new C97925a(this));
        }
    }

    /* renamed from: d */
    public abstract void mo127613d(T t);

    /* renamed from: e */
    public final void mo137254e(C97915l0 l0Var) {
        if (!C87412m.m108589b(this.f287253c, l0Var)) {
            this.f287253c = l0Var;
            if (l0Var != null) {
                mo137253c();
            }
        }
    }
}
