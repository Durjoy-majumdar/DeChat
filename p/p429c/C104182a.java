package p429c;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.activity.C103394c;
import androidx.activity.C112842b;
import androidx.activity.OnBackPressedDispatcher;
import androidx.compose.p002ui.platform.C103691v;
import androidx.lifecycle.C0125s;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import p175j0.C108499f1;
import p175j0.C108500f2;
import p175j0.C108504h;
import p175j0.C33487v1;
import p175j0.C60647d0;
import p175j0.C60651e0;
import p175j0.C60655g0;
import p175j0.C60667k2;
import rx3.C13598b0;

/* renamed from: c.a */
public final class C104182a {

    /* renamed from: c.a$a */
    public static final class C104183a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C104186d f308441d;

        /* renamed from: e */
        public final /* synthetic */ boolean f308442e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104183a(C104186d dVar, boolean z) {
            super(0);
            this.f308441d = dVar;
            this.f308442e = z;
        }

        public Object invoke() {
            this.f308441d.setEnabled(this.f308442e);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: c.a$b */
    public static final class C104184b extends C87413o implements C32226l<C60651e0, C60647d0> {

        /* renamed from: d */
        public final /* synthetic */ OnBackPressedDispatcher f308443d;

        /* renamed from: e */
        public final /* synthetic */ C0125s f308444e;

        /* renamed from: f */
        public final /* synthetic */ C104186d f308445f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104184b(OnBackPressedDispatcher onBackPressedDispatcher, C0125s sVar, C104186d dVar) {
            super(1);
            this.f308443d = onBackPressedDispatcher;
            this.f308444e = sVar;
            this.f308445f = dVar;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C60651e0) obj, "$this$DisposableEffect");
            this.f308443d.mo164666a(this.f308444e, this.f308445f);
            return new C104187b(this.f308445f);
        }
    }

    /* renamed from: c.a$c */
    public static final class C104185c extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ boolean f308446d;

        /* renamed from: e */
        public final /* synthetic */ C32224a<C13598b0> f308447e;

        /* renamed from: f */
        public final /* synthetic */ int f308448f;

        /* renamed from: g */
        public final /* synthetic */ int f308449g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104185c(boolean z, C32224a<C13598b0> aVar, int i, int i2) {
            super(2);
            this.f308446d = z;
            this.f308447e = aVar;
            this.f308448f = i;
            this.f308449g = i2;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C104182a.m139008a(this.f308446d, this.f308447e, (C108504h) obj, this.f308448f | 1, this.f308449g);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: c.a$d */
    public static final class C104186d extends C112842b {

        /* renamed from: a */
        public final /* synthetic */ C60667k2<C32224a<C13598b0>> f308450a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104186d(C60667k2<? extends C32224a<C13598b0>> k2Var, boolean z) {
            super(z);
            this.f308450a = k2Var;
        }

        public void handleOnBackPressed() {
            this.f308450a.getValue().invoke();
        }
    }

    /* renamed from: a */
    public static final void m139008a(boolean z, C32224a<C13598b0> aVar, C108504h hVar, int i, int i2) {
        int i3;
        C87412m.m108594g(aVar, "onBack");
        C108504h z2 = hVar.mo51623z(-971160336);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (z2.mo51586g(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= z2.mo51619x(aVar) ? 32 : 16;
        }
        if (((i3 & 91) ^ 18) != 0 || !z2.mo51575a()) {
            if (i4 != 0) {
                z = true;
            }
            C60667k2<T> e = C108500f2.m146998e(aVar, z2, (i3 >> 3) & 14);
            z2.mo51557H(-3687241);
            Object q = z2.mo51606q();
            int i5 = C108504h.f324828a;
            Object obj = C108504h.C60656a.f172772a;
            if (q == obj) {
                q = new C104186d(e, z);
                z2.mo51553F(q);
            }
            z2.mo51565P();
            C104186d dVar = (C104186d) q;
            Boolean valueOf = Boolean.valueOf(z);
            z2.mo51557H(-3686552);
            boolean x = z2.mo51619x(valueOf) | z2.mo51619x(dVar);
            Object q2 = z2.mo51606q();
            if (x || q2 == obj) {
                q2 = new C104183a(dVar, z);
                z2.mo51553F(q2);
            }
            z2.mo51565P();
            C60655g0.m70936g((C32224a) q2, z2, 0);
            C108499f1<C103394c> f1Var = C104188c.f308452a;
            z2.mo51557H(1680121376);
            C103394c cVar = (C103394c) z2.mo51598m(C104188c.f308452a);
            if (cVar == null) {
                Context context = (Context) z2.mo51598m(C103691v.f306268b);
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        context = null;
                        break;
                    } else if (context instanceof C103394c) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                        C87412m.m108593f(context, "innerContext.baseContext");
                    }
                }
                cVar = (C103394c) context;
            }
            z2.mo51565P();
            if (cVar != null) {
                OnBackPressedDispatcher onBackPressedDispatcher = cVar.getOnBackPressedDispatcher();
                C87412m.m108593f(onBackPressedDispatcher, "checkNotNull(LocalOnBack…}.onBackPressedDispatcher");
                C0125s sVar = (C0125s) z2.mo51598m(C103691v.f306270d);
                C60655g0.m70931b(sVar, onBackPressedDispatcher, new C104184b(onBackPressedDispatcher, sVar, dVar), z2, 72);
            } else {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner".toString());
            }
        } else {
            z2.mo51581d();
        }
        C33487v1 l = z2.mo51596l();
        if (l != null) {
            l.mo51650a(new C104185c(z, aVar, i, i2));
        }
    }
}
