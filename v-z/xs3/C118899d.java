package xs3;

import ft3.C116895f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import ys3.C118992d;

/* renamed from: xs3.d */
public class C118899d implements C118897b {

    /* renamed from: a */
    public final HashSet<Integer> f356182a = new HashSet<>();

    /* renamed from: b */
    public final List<C118992d.C118993a> f356183b = new ArrayList();

    /* renamed from: a */
    public void mo183595a(C118992d.C118993a aVar) {
        if (aVar.f356426c == 0) {
            if (aVar.f356425b == 1 && !"/sbin/adbd".equals(aVar.f356427d)) {
                C116895f.m164891c("RiskScanner", "ProcessRelationAnalyzer parent : " + aVar.toString());
                this.f356182a.add(Integer.valueOf(aVar.f356424a));
            } else if (aVar.f356425b > 1 && "sh".equals(aVar.f356427d) && "/system/bin/sh".equals(aVar.f356427d)) {
                C116895f.m164891c("RiskScanner", "ProcessRelationAnalyzer child : " + aVar.toString());
                ((ArrayList) this.f356183b).add(aVar);
            }
        }
    }

    /* renamed from: b */
    public boolean mo183596b() {
        Iterator it = ((ArrayList) this.f356183b).iterator();
        while (it.hasNext()) {
            C118992d.C118993a aVar = (C118992d.C118993a) it.next();
            if (this.f356182a.contains(Integer.valueOf(aVar.f356425b))) {
                C116895f.m164890b("ProcessRelationAnalyzer match : " + aVar.toString());
                return true;
            }
        }
        return false;
    }
}
