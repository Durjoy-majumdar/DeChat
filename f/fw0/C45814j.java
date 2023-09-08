package fw0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75604z3;
import eb0.z3$$g;
import f40.C86709a0;
import f62.C75700k0;
import fd0.C75742g;
import g62.C45882k;
import g62.C75880o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import md3.C47001b;
import p154fy.C87121j;
import p261wl.C38166b;
import p261wl.C38174i;
import sf0.C48374j0;
import tc0.C48627f;
import te3.C50482n20;
import te3.C52085y83;

/* renamed from: fw0.j */
public class C45814j implements C47001b, C45882k.C45884b {

    /* renamed from: d */
    public List<C47001b.C47002a> f123716d = new ArrayList();

    /* renamed from: a */
    public final void mo71278a(String str, int i) {
        Class cls = C75700k0.class;
        Log.m105925i("MicroMsg.DeleteContactService", "handel delete contact %s,%d", str, Integer.valueOf(i));
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(str);
        if (i == 0) {
            C45628s0.m50736A0(str);
            C75604z3.m90836h(str, (z3$$g) null);
            ((C87121j) C86312j.m106911c(C87121j.class)).mo71213Ot(str, 15);
            ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69763f(str);
            C75742g.m91009a(0, str);
            C75742g.m91009a(0, z1Var.mo73978v2());
            return;
        }
        z1Var.mo62868O3();
        ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69719p3(str, z1Var);
    }

    /* renamed from: fN */
    public void mo71279fN(C47001b.C47002a aVar) {
        ((ArrayList) this.f123716d).remove(aVar);
    }

    /* renamed from: gh */
    public void mo71280gh(String str) {
        Class cls = C75700k0.class;
        Log.m105925i("MicroMsg.DeleteContactService", "delete contact %s", str);
        ((C75700k0) C86709a0.m107533q(cls)).x90().mo71315mc(new C48627f(str));
        ((C75700k0) C86709a0.m107533q(cls)).x90().mo71314m3(4, this);
    }

    /* renamed from: st */
    public void mo71281st(C47001b.C47002a aVar) {
        ((ArrayList) this.f123716d).add(aVar);
    }

    /* renamed from: u1 */
    public void mo71282u1(int i, C52085y83 y832, C75880o oVar) {
        try {
            Log.m105925i("MicroMsg.DeleteContactService", "ret %d, title %d, content %s", Integer.valueOf(i), y832.f145176e, y832.f145175d);
            if (oVar.mo58568b() == 4) {
                String g = C48374j0.m53718g(((C50482n20) new C50482n20().parseFrom(oVar.mo106149a())).f138337d);
                mo71278a(g, i);
                Iterator it = ((ArrayList) this.f123716d).iterator();
                while (it.hasNext()) {
                    ((C47001b.C47002a) it.next()).mo10385v2(g, i, y832);
                }
                C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C47001b.C47003b.class);
                C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
                while (bVar.hasNext()) {
                    ((C47001b.C47003b) ((C38174i) bVar.next()).get()).mo59463v2(g, i, y832);
                }
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.DeleteContactService", e, "BaseProtoBuf parseFrom error!", new Object[0]);
        }
    }
}
