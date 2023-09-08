package xs3;

import ft3.C116895f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import ys3.C118992d;

/* renamed from: xs3.g */
public class C118902g implements C118897b {

    /* renamed from: a */
    public final List<C118992d.C118993a> f356184a = new ArrayList();

    /* renamed from: b */
    public final Pattern f356185b = Pattern.compile("^/system/xbin/ku\\.sud$|^daemonsu:|^k_worker/[1-9]\\d*:[1-9]\\d*$|^kr_worker/[1-9]\\d*:[1-9]\\d*$|^km_worker/[1-9]\\d*:[1-9]\\d*$|^tworker/[1-9]\\d*:[1-9]\\d*$|^tu_worker/[1-9]\\d*:[1-9]\\d*$|^tq_worker/[1-9]\\d*:[1-9]\\d*$|^kworker/[1-9]\\d{2}$|^permmgrd$|^360sguard$|^/data/data/[\\w\\-\\.]+/");

    /* renamed from: a */
    public void mo183595a(C118992d.C118993a aVar) {
        if (aVar.f356426c == 0 && aVar.f356425b == 1) {
            ((ArrayList) this.f356184a).add(aVar);
        }
    }

    /* renamed from: b */
    public boolean mo183596b() {
        Iterator it = ((ArrayList) this.f356184a).iterator();
        while (it.hasNext()) {
            C118992d.C118993a aVar = (C118992d.C118993a) it.next();
            C116895f.m164891c("RiskScanner", "SingleProcessAnalyzer : " + aVar.toString());
            String str = aVar.f356427d;
            if (str != null && this.f356185b.matcher(str).find()) {
                C116895f.m164890b("SingleProcessAnalyzer match : " + aVar.toString());
                return true;
            }
        }
        return false;
    }
}
