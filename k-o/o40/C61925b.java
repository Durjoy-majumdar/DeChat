package o40;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import p206nj.C76861g;

/* renamed from: o40.b */
public final class C61925b {

    /* renamed from: a */
    public final String f176036a;

    /* renamed from: b */
    public C76861g.C47263a f176037b;

    public C61925b(String str) {
        C87412m.m108594g(str, "taskName");
        this.f176036a = str;
        C76861g.C47263a aVar = new C76861g.C47263a();
        this.f176037b = aVar;
        aVar.mo72289b();
    }

    /* renamed from: a */
    public final void mo86838a() {
        Log.m105924i("MicroMsg.CodeUtil", toString());
    }

    public String toString() {
        return "CodeMan task " + this.f176036a + " cost : " + this.f176037b.mo72288a();
    }
}
