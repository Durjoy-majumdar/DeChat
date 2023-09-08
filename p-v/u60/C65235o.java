package u60;

import gy3.C87412m;

/* renamed from: u60.o */
public class C65235o implements Runnable {

    /* renamed from: d */
    public C65220d f187782d;

    /* renamed from: e */
    public C65236a f187783e;

    /* renamed from: f */
    public C101960c f187784f;

    /* renamed from: u60.o$a */
    public interface C65236a {
        /* renamed from: a */
        void mo89355a(C65220d dVar, C65234n nVar);
    }

    public C65235o(C65220d dVar, C101960c cVar, C65236a aVar) {
        this.f187782d = dVar;
        this.f187784f = cVar;
        this.f187783e = aVar;
    }

    public void run() {
        C65220d dVar = this.f187782d;
        C101960c cVar = this.f187784f;
        C65236a aVar = this.f187783e;
        dVar.getClass();
        C87412m.m108594g(cVar, "loader");
        C87412m.m108594g(aVar, "watch");
        dVar.f187739d = cVar;
        dVar.f187740e = aVar;
        dVar.mo11852a();
    }
}
