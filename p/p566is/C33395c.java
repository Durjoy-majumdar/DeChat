package p566is;

import com.tencent.p014mm.app.C80625v0;
import cy1.C30958b;
import cy1.C30959c;
import cy1.C30960d;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import zh3.C91753f;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: is.c */
public final class C33395c extends C86301e implements C30959c {

    /* renamed from: d */
    public final C13601g f90488d = C36568h.m40985a(C33396a.f90489d);

    /* renamed from: is.c$a */
    public static final class C33396a extends C87413o implements C32224a<C30960d> {

        /* renamed from: d */
        public static final C33396a f90489d = new C33396a();

        public C33396a() {
            super(0);
        }

        public Object invoke() {
            C91753f fVar = C86709a0.m107535s().f251811i;
            C87412m.m108593f(fVar, "storage().getDataDB()");
            return new C30960d(fVar);
        }
    }

    /* renamed from: Cf */
    public void mo57902Cf(C30958b bVar) {
        ((C30960d) ((C36570n) this.f90488d).getValue()).mo57902Cf(bVar);
    }

    /* renamed from: c */
    public void mo57903c(String str) {
        C87412m.m108594g(str, "hostPath");
        ((C30960d) ((C36570n) this.f90488d).getValue()).mo57903c(str);
    }

    /* renamed from: m */
    public C30958b mo57904m(String str) {
        C87412m.m108594g(str, "hostPath");
        return ((C30960d) ((C36570n) this.f90488d).getValue()).mo57904m(str);
    }
}
