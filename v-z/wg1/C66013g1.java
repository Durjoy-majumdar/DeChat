package wg1;

import cl1.C54991o;
import com.tencent.p014mm.sdk.platformtools.Log;
import ej0.C58608e;
import ej0.C86525c;
import gj0.C87227a;
import hj0.C87535e;

/* renamed from: wg1.g1 */
public final class C66013g1 implements C87227a {

    /* renamed from: a */
    public final /* synthetic */ C65992e1 f189784a;

    public C66013g1(C65992e1 e1Var) {
        this.f189784a = e1Var;
    }

    /* renamed from: a */
    public void mo88410a(C87535e eVar) {
        String str = this.f189784a.f189733f;
        StringBuilder sb = new StringBuilder();
        sb.append("stop fail ");
        sb.append(eVar != null ? Integer.valueOf(eVar.f253592c) : null);
        Log.m105920e(str, sb.toString());
    }

    /* renamed from: b */
    public void mo88411b(C87535e eVar) {
        Log.m105918d(this.f189784a.f189733f, "stop success");
        C86525c cVar = this.f189784a.f189739o;
        if (cVar != null) {
            cVar.f251386e.f167798a = C58608e.C58609a.Stopped;
        }
        if (cVar != null) {
            cVar.mo121007h();
        }
        C86525c cVar2 = this.f189784a.f189739o;
        if (cVar2 != null) {
            cVar2.mo121008i();
        }
        C65992e1 e1Var = this.f189784a;
        C86525c cVar3 = e1Var.f189739o;
        if (cVar3 != null) {
            cVar3.f251389h = null;
        }
        ((C54991o) e1Var.f189731d.mo71262a(C54991o.class)).f154228M2 = null;
        C65992e1 e1Var2 = this.f189784a;
        C65989d1 d1Var = e1Var2.f189737j;
        if (d1Var != null) {
            d1Var.mo90033z0(e1Var2.f189739o);
        }
        this.f189784a.f189739o = null;
    }
}
