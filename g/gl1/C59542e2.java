package gl1;

import android.os.Bundle;
import cj1.C0581o5;
import cl1.C0702z0;
import cl1.C54991o;
import d60.C58124b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import np1.C61817a;
import o40.C61926c;
import qj1.C12238a0;
import qj1.C12322e5;
import qj1.C12490l0;
import qj1.C12522mf;
import qj1.C12690u1;
import qj1.C62635aa;
import qj1.C62758ea;
import qj1.C62924pe;
import qj1.C63049v9;
import rx3.C13598b0;
import sl1.C64039c;
import te3.C52013xs0;
import te3.C64674r41;
import vk1.C65761b;
import vo1.C65808n0;
import wg1.C15253a;
import wg1.C15300h;
import xs1.C66420d;

/* renamed from: gl1.e2 */
public final class C59542e2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C59559k f170175d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59542e2(C59559k kVar) {
        super(0);
        this.f170175d = kVar;
    }

    public Object invoke() {
        C15253a aVar;
        C61817a aVar2;
        Class cls = C0702z0.class;
        C59559k kVar = this.f170175d;
        C12322e5 e5Var = kVar.f170252u;
        if (e5Var != null) {
            List<C0581o5> list = ((C0702z0) kVar.mo83051g(cls)).f1672f;
            C87412m.m108593f(list, "business(LiveMsgSlice::class.java).msgList");
            C12322e5.m11877s1(e5Var, list, false, false, 6, (Object) null);
        }
        C59559k kVar2 = this.f170175d;
        C12522mf mfVar = kVar2.f170201C;
        if (mfVar != null) {
            List<C64674r41> list2 = ((C0702z0) kVar2.mo83051g(cls)).f1674h;
            C87412m.m108593f(list2, "business(LiveMsgSlice::class.java).topMsgList");
            mfVar.mo12155e1(list2);
        }
        C64039c cVar = this.f170175d.f170211M;
        if (cVar != null) {
            cVar.mo88792f1();
        }
        C66420d dVar = this.f170175d.f170213P;
        if (dVar != null) {
            dVar.mo90516c1();
        }
        C59559k kVar3 = this.f170175d;
        C65761b bVar = kVar3.f166842f;
        if (bVar != null) {
            bVar.showAlertInfo(kVar3.f166841e);
        }
        C59559k kVar4 = this.f170175d;
        C63049v9 v9Var = kVar4.f170259z;
        if (v9Var != null) {
            List<C52013xs0> list3 = ((C0702z0) kVar4.mo83051g(cls)).f1675i;
            C87412m.m108593f(list3, "business(LiveMsgSlice::c….java).highLightCheerList");
            C61926c.m72668M(new C62635aa(v9Var, list3));
        }
        C12490l0 l0Var = this.f170175d.f170247p0;
        if (l0Var != null) {
            l0Var.mo12145e1();
        }
        ((C65808n0) this.f170175d.mo83051g(C65808n0.class)).mo89852c3();
        this.f170175d.getClass();
        C62758ea eaVar = this.f170175d.f170258y0;
        if (eaVar != null) {
            eaVar.mo87760d1();
        }
        C62924pe peVar = this.f170175d.f170200B;
        if (!(peVar == null || (aVar2 = peVar.f178556r) == null)) {
            aVar2.mo86751h();
        }
        C65761b bVar2 = this.f170175d.f166842f;
        if (bVar2 != null) {
            C58124b.C7172a.m7372a(bVar2, C58124b.C58125b.FINDER_LIVE_UPDATE_LIVE_MSG, (Bundle) null, 2, (Object) null);
        }
        C59559k kVar5 = this.f170175d;
        C12690u1 u1Var = kVar5.f170202D;
        if (u1Var != null) {
            u1Var.mo12262a1(((C54991o) kVar5.mo83051g(C54991o.class)).f154278X1.f1587c);
        }
        C63049v9 v9Var2 = this.f170175d.f170259z;
        if (v9Var2 != null) {
            v9Var2.mo87992g1();
        }
        C12238a0 a0Var = this.f170175d.f170216R;
        if (!(a0Var == null || (aVar = a0Var.f35311p) == null)) {
            ((C15300h) aVar).mo14163q();
        }
        C12490l0 l0Var2 = this.f170175d.f170247p0;
        if (l0Var2 != null) {
            l0Var2.mo12141a1();
        }
        C12490l0 l0Var3 = this.f170175d.f170247p0;
        if (l0Var3 != null) {
            l0Var3.mo12143c1();
        }
        C12490l0 l0Var4 = this.f170175d.f170247p0;
        if (l0Var4 != null) {
            l0Var4.f35929s.mo13128f(true);
        }
        return C13598b0.f38549a;
    }
}
