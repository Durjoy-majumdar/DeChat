package eb0;

import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ob0.C117747y;
import p261wl.C15509d;
import p261wl.C15510f;
import p261wl.C38166b;
import p261wl.C38174i;

/* renamed from: eb0.d4 */
public class C116724d4 {

    /* renamed from: a */
    public static final List<C116725a> f350033a = new ArrayList();

    /* renamed from: eb0.d4$a */
    public interface C116725a {
        /* renamed from: j2 */
        C1311n mo180705j2(C1311n nVar, C117747y yVar);

        /* renamed from: s4 */
        int mo180706s4(C117747y yVar);
    }

    /* renamed from: eb0.d4$b */
    public interface C116726b extends C15510f {
        /* renamed from: j2 */
        C1311n mo14382j2(C1311n nVar, C117747y yVar);

        /* renamed from: s4 */
        int mo14383s4(C117747y yVar);
    }

    /* renamed from: a */
    public static int m164631a(C117747y yVar) {
        boolean z;
        ArrayList arrayList;
        List<C116725a> list = f350033a;
        if (((ArrayList) list).size() > 0) {
            synchronized (list) {
                arrayList = new ArrayList(list);
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C116725a aVar = (C116725a) it.next();
                try {
                    if (aVar.mo180706s4(yVar) != 0) {
                        z = true;
                        break;
                    }
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.NetWarpGate", "[intercept] interceptor : " + aVar + ", throw Exception : " + e.getMessage());
                }
            }
        }
        z = false;
        if (!z) {
            C38166b.C38167a aVar2 = (C38166b.C38167a) C38166b.m41759f(C116726b.class);
            C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar2, aVar2.f100837d.all().iterator());
            while (bVar.hasNext()) {
                C116726b bVar2 = (C116726b) ((C38174i) bVar.next()).get();
                try {
                    if (bVar2.mo14383s4(yVar) != 0) {
                        break;
                    }
                } catch (Exception e2) {
                    Log.m105920e("MicroMsg.NetWarpGate", "[intercept] interceptor : " + bVar2 + ", throw Exception : " + e2.getMessage());
                }
            }
        }
        return 0;
    }

    /* renamed from: b */
    public static C1311n m164632b(C1311n nVar, C117747y yVar) {
        ArrayList arrayList;
        C15509d<C116726b> f = C38166b.m41759f(C116726b.class);
        List<C116725a> list = f350033a;
        if (((ArrayList) list).size() <= 0) {
            C38166b.C38167a aVar = (C38166b.C38167a) f;
            if (!new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator()).hasNext()) {
                return nVar;
            }
        }
        synchronized (list) {
            arrayList = new ArrayList(list);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            nVar = ((C116725a) it.next()).mo180705j2(nVar, yVar);
        }
        C38166b.C38167a aVar2 = (C38166b.C38167a) f;
        C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar2, aVar2.f100837d.all().iterator());
        while (bVar.hasNext()) {
            nVar = ((C116726b) ((C38174i) bVar.next()).get()).mo14382j2(nVar, yVar);
        }
        return nVar;
    }
}
