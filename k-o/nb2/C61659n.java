package nb2;

import bl3.C39818r;
import gy3.C87412m;
import java.util.List;
import jq3.C60905o;
import lq1.C61355g;
import sb2.C63756e;
import sb2.C63807m;
import sq1.C64151e;

/* renamed from: nb2.n */
public final class C61659n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C61647e f175327d;

    /* renamed from: e */
    public final /* synthetic */ C63756e f175328e;

    /* renamed from: f */
    public final /* synthetic */ C60905o f175329f;

    /* renamed from: nb2.n$a */
    public static final class C61660a implements C61355g {

        /* renamed from: a */
        public final /* synthetic */ C61647e f175330a;

        /* renamed from: b */
        public final /* synthetic */ C60905o f175331b;

        /* renamed from: c */
        public final /* synthetic */ C63756e f175332c;

        public C61660a(C61647e eVar, C60905o oVar, C63756e eVar2) {
            this.f175330a = eVar;
            this.f175331b = oVar;
            this.f175332c = eVar2;
        }

        /* renamed from: a */
        public void mo86310a(int i, List<? extends C64151e> list) {
            C87412m.m108594g(list, "data");
            this.f175330a.mo86594q(this.f175331b, this.f175332c, Integer.valueOf(i));
        }
    }

    public C61659n(C61647e eVar, C63756e eVar2, C60905o oVar) {
        this.f175327d = eVar;
        this.f175328e = eVar2;
        this.f175329f = oVar;
    }

    public final void run() {
        C61647e eVar = this.f175327d;
        C60905o oVar = this.f175329f;
        C63756e eVar2 = this.f175328e;
        ((C63807m) C39818r.f106831a.mo62444c(this.f175327d.f175299e).mo75002a(C63807m.class)).mo88604g3(eVar2.f180751s, new C61660a(eVar, oVar, eVar2));
    }
}
