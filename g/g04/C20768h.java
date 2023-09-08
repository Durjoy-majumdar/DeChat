package g04;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import m04.C21480i;
import m04.C24980n;

/* renamed from: g04.h */
public final class C20768h extends C20767a {

    /* renamed from: b */
    public final C21480i<C20770i> f58678b;

    /* renamed from: g04.h$a */
    public static final class C20769a extends C87413o implements C32224a<C20770i> {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C20770i> f58679d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20769a(C32224a<? extends C20770i> aVar) {
            super(0);
            this.f58679d = aVar;
        }

        public Object invoke() {
            C20770i invoke = this.f58679d.invoke();
            return invoke instanceof C20767a ? ((C20767a) invoke).mo32463h() : invoke;
        }
    }

    public C20768h(C24980n nVar, C32224a<? extends C20770i> aVar) {
        C87412m.m108594g(nVar, "storageManager");
        C87412m.m108594g(aVar, "getScope");
        this.f58678b = nVar.mo52006g(new C20769a(aVar));
    }

    /* renamed from: i */
    public C20770i mo32464i() {
        return (C20770i) this.f58678b.invoke();
    }
}
