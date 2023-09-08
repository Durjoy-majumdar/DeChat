package w80;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import p206nj.C76861g;

/* renamed from: w80.a */
public final class C102360a {

    /* renamed from: a */
    public final String f301457a;

    /* renamed from: b */
    public C76861g.C47263a f301458b;

    public C102360a(String str) {
        C87412m.m108594g(str, "taskName");
        this.f301457a = str;
        C76861g.C47263a aVar = new C76861g.C47263a();
        this.f301458b = aVar;
        aVar.mo72289b();
    }

    /* renamed from: a */
    public final void mo141928a() {
        Log.m105924i("MicroMsg.CodeUtil", toString());
    }

    public String toString() {
        return "CodeMan task " + this.f301457a + " cost : " + this.f301458b.mo72288a();
    }
}
