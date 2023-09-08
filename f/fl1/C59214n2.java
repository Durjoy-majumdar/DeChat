package fl1;

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
import qj1.C12399ff;
import qj1.C12490l0;
import qj1.C12522mf;
import qj1.C12690u1;
import qj1.C62635aa;
import qj1.C62758ea;
import qj1.C62924pe;
import qj1.C63049v9;
import qj1.C63068w1;
import rx3.C13598b0;
import sl1.C64039c;
import te3.C52013xs0;
import te3.C64674r41;
import vk1.C65760a;
import vo1.C65808n0;
import wg1.C15253a;
import wg1.C15300h;
import xs1.C66420d;

/* renamed from: fl1.n2 */
public final class C59214n2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C59161f f169359d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59214n2(C59161f fVar) {
        super(0);
        this.f169359d = fVar;
    }

    public Object invoke() {
        C15253a aVar;
        C61817a aVar2;
        Class cls = C0702z0.class;
        C59161f fVar = this.f169359d;
        C12322e5 e5Var = fVar.f169237t;
        if (e5Var != null) {
            List<C0581o5> list = ((C0702z0) fVar.mo83051g(cls)).f1672f;
            C87412m.m108593f(list, "business(LiveMsgSlice::class.java).msgList");
            C12322e5.m11877s1(e5Var, list, false, false, 6, (Object) null);
        }
        C59161f fVar2 = this.f169359d;
        C12522mf mfVar = fVar2.f169187B;
        if (mfVar != null) {
            List<C64674r41> list2 = ((C0702z0) fVar2.mo83051g(cls)).f1674h;
            C87412m.m108593f(list2, "business(LiveMsgSlice::class.java).topMsgList");
            mfVar.mo12155e1(list2);
        }
        C64039c cVar = this.f169359d.f169191F;
        if (cVar != null) {
            cVar.mo88792f1();
        }
        C66420d dVar = this.f169359d.f169193H;
        if (dVar != null) {
            dVar.mo90516c1();
        }
        C59161f fVar3 = this.f169359d;
        C65760a aVar3 = fVar3.f166837f;
        if (aVar3 != null) {
            aVar3.showAlertInfo(fVar3.f166836e);
        }
        C59161f fVar4 = this.f169359d;
        C63049v9 v9Var = fVar4.f169243y;
        if (v9Var != null) {
            List<C52013xs0> list3 = ((C0702z0) fVar4.mo83051g(cls)).f1675i;
            C87412m.m108593f(list3, "business(LiveMsgSlice::c….java).highLightCheerList");
            C61926c.m72668M(new C62635aa(v9Var, list3));
        }
        C12490l0 l0Var = this.f169359d.f169203R;
        if (l0Var != null) {
            l0Var.mo12145e1();
        }
        ((C65808n0) this.f169359d.mo83051g(C65808n0.class)).mo89852c3();
        C63068w1 w1Var = this.f169359d.f169201Q;
        if (w1Var != null && w1Var.mo14483f0() == 0) {
            w1Var.mo88009f1();
        }
        C62758ea eaVar = this.f169359d.f169205S;
        if (eaVar != null) {
            eaVar.mo87760d1();
        }
        C62924pe peVar = this.f169359d.f169186A;
        if (!(peVar == null || (aVar2 = peVar.f178556r) == null)) {
            aVar2.mo86751h();
        }
        C65760a aVar4 = this.f169359d.f166837f;
        if (aVar4 != null) {
            C58124b.C7172a.m7372a(aVar4, C58124b.C58125b.FINDER_LIVE_UPDATE_LIVE_MSG, (Bundle) null, 2, (Object) null);
        }
        C59161f fVar5 = this.f169359d;
        C12690u1 u1Var = fVar5.f169188C;
        if (u1Var != null) {
            u1Var.mo12262a1(((C54991o) fVar5.mo83051g(C54991o.class)).f154278X1.f1587c);
        }
        C63049v9 v9Var2 = this.f169359d.f169243y;
        if (v9Var2 != null) {
            v9Var2.mo87992g1();
        }
        C12399ff ffVar = this.f169359d.f169232p;
        if (ffVar != null) {
            C12399ff.m11974v1(ffVar, (String) null, false, 3, (Object) null);
        }
        C12399ff ffVar2 = this.f169359d.f169232p;
        if (ffVar2 != null) {
            ffVar2.mo12079c1();
        }
        C12238a0 a0Var = this.f169359d.f169195J;
        if (!(a0Var == null || (aVar = a0Var.f35311p) == null)) {
            ((C15300h) aVar).mo14163q();
        }
        C12490l0 l0Var2 = this.f169359d.f169203R;
        if (l0Var2 != null) {
            l0Var2.mo12141a1();
        }
        C12490l0 l0Var3 = this.f169359d.f169203R;
        if (l0Var3 != null) {
            l0Var3.mo12143c1();
        }
        C12490l0 l0Var4 = this.f169359d.f169203R;
        if (l0Var4 != null) {
            l0Var4.f35929s.mo13128f(true);
        }
        return C13598b0.f38549a;
    }
}
