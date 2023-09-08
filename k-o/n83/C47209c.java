package n83;

import com.tencent.p014mm.network.C81038d0;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: n83.c */
public final class C47209c extends C87413o implements C32226l<C81038d0, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f126768d;

    /* renamed from: e */
    public final /* synthetic */ C47207a f126769e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47209c(String str, C47207a aVar) {
        super(1);
        this.f126768d = str;
        this.f126769e = aVar;
    }

    public Object invoke(Object obj) {
        C81038d0 d0Var = (C81038d0) obj;
        C87412m.m108594g(d0Var, "connection");
        String str = this.f126768d;
        C47207a aVar = this.f126769e;
        d0Var.f238054j = false;
        d0Var.f238053i = "GET";
        d0Var.f238056l = true;
        d0Var.f238063s = true;
        d0Var.f238058n = 2;
        d0Var.f238055k = str;
        aVar.mo72115b(d0Var);
        d0Var.f238057m = new C47208b(this.f126769e, d0Var);
        d0Var.mo112934h();
        return C13598b0.f38549a;
    }
}
