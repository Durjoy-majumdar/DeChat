package vo1;

import cl1.C39970c;
import cl1.C54974f1;
import cl1.C54979h1;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import fj1.C45795b;
import fy3.C32224a;
import gg1.C32444a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;
import o40.C61926c;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C64399gj1;

/* renamed from: vo1.n0 */
public final class C65808n0 extends C39970c<C45795b> {

    /* renamed from: f */
    public final String f189258f = "LiveRecordCountDownSlick";

    /* renamed from: g */
    public final C13601g f189259g = C36568h.m40985a(C37794a.f100107d);

    /* renamed from: h */
    public final HashMap<Long, C37795b> f189260h = new HashMap<>();

    /* renamed from: i */
    public volatile boolean f189261i;

    /* renamed from: j */
    public final C13601g f189262j;

    /* renamed from: vo1.n0$a */
    public static final class C37794a extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public static final C37794a f100107d = new C37794a();

        public C37794a() {
            super(0);
        }

        public Object invoke() {
            return Long.valueOf(C32444a.f86120Z1.mo60266n().longValue() * 60);
        }
    }

    /* renamed from: vo1.n0$b */
    public static final class C37795b {

        /* renamed from: a */
        public boolean f100108a;

        /* renamed from: b */
        public boolean f100109b;

        /* renamed from: c */
        public boolean f100110c;

        public C37795b(boolean z, boolean z2, boolean z3) {
            this.f100108a = z;
            this.f100109b = z2;
            this.f100110c = z3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37795b)) {
                return false;
            }
            C37795b bVar = (C37795b) obj;
            return this.f100108a == bVar.f100108a && this.f100109b == bVar.f100109b && this.f100110c == bVar.f100110c;
        }

        public int hashCode() {
            boolean z = this.f100108a;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            boolean z3 = this.f100109b;
            if (z3) {
                z3 = true;
            }
            int i2 = (i + (z3 ? 1 : 0)) * 31;
            boolean z4 = this.f100110c;
            if (!z4) {
                z2 = z4;
            }
            return i2 + (z2 ? 1 : 0);
        }

        public String toString() {
            return "HasToast(first=" + this.f100108a + ", second=" + this.f100109b + ", third=" + this.f100110c + ')';
        }
    }

    /* renamed from: vo1.n0$c */
    public static final class C65809c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C65808n0 f189263d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65809c(C65808n0 n0Var) {
            super(0);
            this.f189263d = n0Var;
        }

        public Object invoke() {
            C13598b0 b0Var;
            Boolean valueOf = Boolean.valueOf(this.f189263d.f189261i);
            C65808n0 n0Var = this.f189263d;
            synchronized (valueOf) {
                if (((C54974f1) n0Var.f107146d.mo71262a(C54974f1.class)).f154098g != null) {
                    if (((MTimerHandler) ((C36570n) n0Var.f189262j).getValue()).stopped() && !n0Var.f189261i) {
                        ((MTimerHandler) ((C36570n) n0Var.f189262j).getValue()).startTimer(1000);
                    }
                    b0Var = C13598b0.f38549a;
                } else {
                    b0Var = null;
                }
                if (b0Var == null) {
                    n0Var.f189260h.clear();
                    ((MTimerHandler) ((C36570n) n0Var.f189262j).getValue()).stopTimer();
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: vo1.n0$d */
    public static final class C65810d extends C87413o implements C32224a<MTimerHandler> {

        /* renamed from: d */
        public final /* synthetic */ C65808n0 f189264d;

        /* renamed from: e */
        public final /* synthetic */ C45795b f189265e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65810d(C65808n0 n0Var, C45795b bVar) {
            super(0);
            this.f189264d = n0Var;
            this.f189265e = bVar;
        }

        public Object invoke() {
            C65808n0 n0Var = this.f189264d;
            MTimerHandler mTimerHandler = new MTimerHandler(n0Var.f189258f, (MTimerHandler.CallBack) new C65812o0(n0Var, this.f189265e), true);
            mTimerHandler.setLogging(false);
            return mTimerHandler;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65808n0(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
        this.f189262j = C36568h.m40985a(new C65810d(this, bVar));
    }

    /* renamed from: c3 */
    public final void mo89852c3() {
        C64399gj1 gj12 = ((C54979h1) this.f107146d.mo71262a(C54979h1.class)).f154113E;
        if (gj12 != null && gj12.f183343d == 2) {
            this.f189260h.clear();
            ((MTimerHandler) ((C36570n) this.f189262j).getValue()).stopTimer();
            return;
        }
        C61926c.m72656A((String) null, new C65809c(this));
    }

    public void onCleared() {
        super.onCleared();
        this.f189260h.clear();
        ((MTimerHandler) ((C36570n) this.f189262j).getValue()).stopTimer();
    }
}
