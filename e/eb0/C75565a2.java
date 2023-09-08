package eb0;

import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C75597w2;
import eb0.C75602z1;
import java.util.Iterator;
import p261wl.C38166b;
import p261wl.C38174i;

/* renamed from: eb0.a2 */
public class C75565a2 implements C75597w2, C31514t2 {

    /* renamed from: a */
    public C75597w2 f221989a;

    public C75565a2(C75597w2 w2Var) {
        this.f221989a = w2Var;
    }

    /* renamed from: a */
    public void mo55985a() {
        this.f221989a.mo55985a();
    }

    /* renamed from: b */
    public void mo55986b(String str) {
        Iterator<C75602z1> it = C75602z1.C75603a.f222091a.iterator();
        while (it.hasNext()) {
            C75602z1 next = it.next();
            if (next.mo105955S2(str, 0)) {
                next.mo105956g2().mo55986b(str);
                Log.m105925i("MicroMsg.GetContactServiceProxy", "[clearMapRecentDown] has consume. interceptor=%s", next);
                return;
            }
        }
        C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C75596v4.class);
        C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
        while (bVar.hasNext()) {
            C75596v4 v4Var = (C75596v4) ((C38174i) bVar.next()).get();
            if (v4Var.mo55983S2(str, 0)) {
                v4Var.mo55984g2().mo55986b(str);
                Log.m105925i("MicroMsg.GetContactServiceProxy", "[clearMapRecentDown] has consume. interceptor=%s", v4Var);
                return;
            }
        }
        this.f221989a.mo55986b(str);
    }

    /* renamed from: c */
    public void mo55987c(String str, String str2) {
        Iterator<C75602z1> it = C75602z1.C75603a.f222091a.iterator();
        while (it.hasNext()) {
            C75602z1 next = it.next();
            if (next.mo105955S2(str, 0)) {
                next.mo105956g2().mo55987c(str, str2);
                Log.m105925i("MicroMsg.GetContactServiceProxy", "[addContact] has consume. interceptor=%s", next);
                return;
            }
        }
        C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C75596v4.class);
        C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
        while (bVar.hasNext()) {
            C75596v4 v4Var = (C75596v4) ((C38174i) bVar.next()).get();
            if (v4Var.mo55983S2(str, 0)) {
                v4Var.mo55984g2().mo55987c(str, str2);
                Log.m105925i("MicroMsg.GetContactServiceProxy", "[addContact] has consume. interceptor=%s", v4Var);
                return;
            }
        }
        this.f221989a.mo55987c(str, str2);
    }

    /* renamed from: d */
    public C75597w2 mo58210d() {
        return this.f221989a;
    }

    /* renamed from: e */
    public void mo55988e(String str, String str2, C75597w2.C31525a aVar) {
        Iterator<C75602z1> it = C75602z1.C75603a.f222091a.iterator();
        while (it.hasNext()) {
            C75602z1 next = it.next();
            if (next.mo105955S2(str, 0)) {
                next.mo105956g2().mo55988e(str, str2, aVar);
                Log.m105925i("MicroMsg.GetContactServiceProxy", "[getNow] has consume. interceptor=%s", next);
                return;
            }
        }
        C38166b.C38167a aVar2 = (C38166b.C38167a) C38166b.m41759f(C75596v4.class);
        C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar2, aVar2.f100837d.all().iterator());
        while (bVar.hasNext()) {
            C75596v4 v4Var = (C75596v4) ((C38174i) bVar.next()).get();
            if (v4Var.mo55983S2(str, 0)) {
                v4Var.mo55984g2().mo55988e(str, str2, aVar);
                Log.m105925i("MicroMsg.GetContactServiceProxy", "[getNow] has consume. interceptor=%s", v4Var);
                return;
            }
        }
        this.f221989a.mo55988e(str, str2, aVar);
    }

    /* renamed from: f */
    public void mo55989f(String str) {
        Iterator<C75602z1> it = C75602z1.C75603a.f222091a.iterator();
        while (it.hasNext()) {
            C75602z1 next = it.next();
            if (next.mo105955S2(str, 0)) {
                next.mo105956g2().mo55989f(str);
                Log.m105925i("MicroMsg.GetContactServiceProxy", "[removeCallBack] has consume. interceptor=%s", next);
                return;
            }
        }
        C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C75596v4.class);
        C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
        while (bVar.hasNext()) {
            C75596v4 v4Var = (C75596v4) ((C38174i) bVar.next()).get();
            if (v4Var.mo55983S2(str, 0)) {
                v4Var.mo55984g2().mo55989f(str);
                Log.m105925i("MicroMsg.GetContactServiceProxy", "[removeCallBack] has consume. interceptor=%s", v4Var);
                return;
            }
        }
        this.f221989a.mo55989f(str);
    }

    /* renamed from: g */
    public void mo55990g(String str, int i, String str2) {
        Iterator<C75602z1> it = C75602z1.C75603a.f222091a.iterator();
        while (it.hasNext()) {
            C75602z1 next = it.next();
            if (next.mo105955S2(str, i)) {
                next.mo105956g2().mo55990g(str, i, str2);
                Log.m105925i("MicroMsg.GetContactServiceProxy", "[addContactExtra] has consume. interceptor=%s", next);
                return;
            }
        }
        C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C75596v4.class);
        C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
        while (bVar.hasNext()) {
            C75596v4 v4Var = (C75596v4) ((C38174i) bVar.next()).get();
            if (v4Var.mo55983S2(str, i)) {
                v4Var.mo55984g2().mo55990g(str, i, str2);
                Log.m105925i("MicroMsg.GetContactServiceProxy", "[addContactExtra] has consume. interceptor=%s", v4Var);
                return;
            }
        }
        this.f221989a.mo55990g(str, i, str2);
    }
}
