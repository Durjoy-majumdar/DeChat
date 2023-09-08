package p175j0;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.tencent.xweb.IXWebBroadcastListener;
import d14.C45252f;
import d14.C58095x0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import p175j0.C108504h;
import p603m0.C109451j;
import p854l0.C109072c;
import rx3.C13598b0;
import rx3.C13604l;
import wx3.C15601d;

/* renamed from: j0.f2 */
public final class C108500f2 {
    /* renamed from: a */
    public static final <T> C60667k2<T> m146994a(C32224a<? extends T> aVar) {
        C108505i2<C109072c<C13604l<C32226l<C24660b0<?>, C13598b0>, C32226l<C24660b0<?>, C13598b0>>>> i2Var = C108503g2.f324826a;
        C87412m.m108594g(aVar, "calculation");
        return new C108491a0(aVar);
    }

    /* renamed from: b */
    public static final <T> C60690y0<T> m146995b(T t, C108497e2<T> e2Var) {
        C87412m.m108594g(e2Var, "policy");
        int i = C60642b.f172747a;
        return new ParcelableSnapshotMutableState(t, e2Var);
    }

    /* renamed from: c */
    public static /* synthetic */ C60690y0 m146996c(Object obj, C108497e2 e2Var, int i, Object obj2) {
        if ((i & 2) != 0) {
            e2Var = C108507n2.f324831a;
        }
        return m146995b(obj, e2Var);
    }

    /* renamed from: d */
    public static final <R> void m146997d(C32226l<? super C60667k2<?>, C13598b0> lVar, C32226l<? super C60667k2<?>, C13598b0> lVar2, C32224a<? extends R> aVar) {
        C108505i2<C109072c<C13604l<C32226l<C24660b0<?>, C13598b0>, C32226l<C24660b0<?>, C13598b0>>>> i2Var = C108503g2.f324826a;
        C87412m.m108594g(lVar, IXWebBroadcastListener.STAGE_START);
        C87412m.m108594g(lVar2, "done");
        C87412m.m108594g(aVar, "block");
        C108505i2<C109072c<C13604l<C32226l<C24660b0<?>, C13598b0>, C32226l<C24660b0<?>, C13598b0>>>> i2Var2 = C108503g2.f324826a;
        C109072c a = i2Var2.mo159371a();
        try {
            C109072c a2 = i2Var2.mo159371a();
            if (a2 == null) {
                a2 = C109451j.f327609f;
            }
            i2Var2.mo159372b(a2.add(new C13604l(lVar, lVar2)));
            aVar.invoke();
            i2Var2.mo159372b(a);
        } catch (Throwable th) {
            C108503g2.f324826a.mo159372b(a);
            throw th;
        }
    }

    /* renamed from: e */
    public static final <T> C60667k2<T> m146998e(T t, C108504h hVar, int i) {
        hVar.mo51557H(-1058319986);
        hVar.mo51557H(-492369756);
        Object q = hVar.mo51606q();
        int i2 = C108504h.f324828a;
        if (q == C108504h.C60656a.f172772a) {
            q = m146996c(t, (C108497e2) null, 2, (Object) null);
            hVar.mo51553F(q);
        }
        hVar.mo51565P();
        C60690y0 y0Var = (C60690y0) q;
        y0Var.setValue(t);
        hVar.mo51565P();
        return y0Var;
    }

    /* renamed from: f */
    public static final <T> C45252f<T> m146999f(C32224a<? extends T> aVar) {
        C87412m.m108594g(aVar, "block");
        return new C58095x0(new C60658h2(aVar, (C15601d<? super C60658h2>) null));
    }
}
