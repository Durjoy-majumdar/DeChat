package di1;

import androidx.lifecycle.C0120a0;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C54219z;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: di1.c */
public final class C7333c<T> extends C54219z<T> {

    /* renamed from: d */
    public C32227p<? super T, ? super T, Boolean> f25448d;

    /* renamed from: di1.c$a */
    public final class C7334a implements C0120a0<T> {

        /* renamed from: d */
        public final C0120a0<? super T> f25449d;

        /* renamed from: e */
        public T f25450e;

        /* renamed from: f */
        public final /* synthetic */ C7333c<T> f25451f;

        public C7334a(C7333c cVar, C0120a0<? super T> a0Var) {
            C87412m.m108594g(a0Var, "originObserver");
            this.f25451f = cVar;
            this.f25449d = a0Var;
        }

        public void onChanged(T t) {
            C32227p<? super T, ? super T, Boolean> pVar = this.f25451f.f25448d;
            if (pVar != null ? pVar.invoke(this.f25450e, t).booleanValue() : C87412m.m108589b(this.f25450e, t)) {
                this.f25451f.getClass();
                return;
            }
            this.f25450e = t;
            this.f25449d.onChanged(t);
        }
    }

    public C7333c(C32227p<? super T, ? super T, Boolean> pVar, int i, C8480h hVar) {
        this.f25448d = (i & 1) != 0 ? null : pVar;
    }

    public void observe(C0125s sVar, C0120a0<? super T> a0Var) {
        C87412m.m108594g(sVar, "owner");
        C87412m.m108594g(a0Var, "observer");
        super.observe(sVar, new C7334a(this, a0Var));
    }

    public void observeForever(C0120a0<? super T> a0Var) {
        C87412m.m108594g(a0Var, "observer");
        super.observeForever(new C7334a(this, a0Var));
    }
}
