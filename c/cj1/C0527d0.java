package cj1;

import cl1.C55001u;
import com.tencent.p014mm.sdk.platformtools.Log;
import dj1.C7339i0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C50617o01;
import te3.C64273c21;

/* renamed from: cj1.d0 */
public final class C0527d0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C89132b.C89134c<C50617o01> f1289d;

    /* renamed from: e */
    public final /* synthetic */ C7339i0.C7340a f1290e;

    /* renamed from: f */
    public final /* synthetic */ C54820t f1291f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0527d0(C89132b.C89134c<C50617o01> cVar, C7339i0.C7340a aVar, C54820t tVar) {
        super(0);
        this.f1289d = cVar;
        this.f1290e = aVar;
        this.f1291f = tVar;
    }

    public Object invoke() {
        C50617o01 o012;
        Class cls = C55001u.class;
        C89132b.C89134c<C50617o01> cVar = this.f1289d;
        if (!(cVar == null || (o012 = (C50617o01) cVar.f256796d) == null)) {
            C54820t tVar = this.f1291f;
            C7339i0.C7340a aVar = this.f1290e;
            C64273c21 c212 = ((C55001u) tVar.f153692b.mo71262a(cls)).f154420q;
            boolean z = false;
            if (c212 != null && o012.f138876h == c212.f182392d) {
                z = true;
            }
            if (!z) {
                String str = tVar.f153694d;
                StringBuilder sb = new StringBuilder();
                sb.append("getLotteryRecord invalid resp,liveId:");
                sb.append(Long.valueOf(o012.f138876h));
                sb.append(",current liveId:");
                C64273c21 c213 = ((C55001u) tVar.mo75777m0(cls)).f154420q;
                sb.append(c213 != null ? Long.valueOf(c213.f182392d) : null);
                Log.m105924i(str, sb.toString());
                if (aVar != null) {
                    aVar.mo8508a(3, 10123, "invalid liveId", o012);
                }
                return C13598b0.f38549a;
            }
        }
        C7339i0.C7340a aVar2 = this.f1290e;
        if (aVar2 != null) {
            C89132b.C89134c<C50617o01> cVar2 = this.f1289d;
            int i = cVar2.f256793a;
            int i2 = cVar2.f256794b;
            String str2 = cVar2.f256795c;
            T t = cVar2.f256796d;
            C87412m.m108593f(t, "it.resp");
            aVar2.mo8508a(i, i2, str2, (C50617o01) t);
        }
        return C13598b0.f38549a;
    }
}
