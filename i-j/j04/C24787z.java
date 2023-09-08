package j04;

import b04.C23649g;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import l04.C24918l;
import n04.C25143j0;
import qz3.C26052n;
import xy3.C26566c;

/* renamed from: j04.z */
public final class C24787z extends C87413o implements C32224a<C23649g<?>> {

    /* renamed from: d */
    public final /* synthetic */ C24779w f70691d;

    /* renamed from: e */
    public final /* synthetic */ C26052n f70692e;

    /* renamed from: f */
    public final /* synthetic */ C24918l f70693f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24787z(C24779w wVar, C26052n nVar, C24918l lVar) {
        super(0);
        this.f70691d = wVar;
        this.f70692e = nVar;
        this.f70693f = lVar;
    }

    public Object invoke() {
        C24779w wVar = this.f70691d;
        C24736c0 a = wVar.mo51756a(wVar.f70665a.f70645c);
        C87412m.m108591d(a);
        C24735c<C26566c, C23649g<?>> cVar = this.f70691d.f70665a.f70643a.f70626e;
        C26052n nVar = this.f70692e;
        C25143j0 returnType = this.f70693f.getReturnType();
        C87412m.m108593f(returnType, "property.returnType");
        return cVar.mo51712i(a, nVar, returnType);
    }
}
