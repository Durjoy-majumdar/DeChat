package g34;

import j34.C117295b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: g34.e */
public class C116914e {

    /* renamed from: a */
    public final List<C116913d> f350335a;

    public C116914e() {
        this.f350335a = new ArrayList();
    }

    /* renamed from: a */
    public String mo180881a() {
        if (((ArrayList) this.f350335a).size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = ((ArrayList) this.f350335a).iterator();
        while (it.hasNext()) {
            C116913d dVar = (C116913d) it.next();
            sb.append('&');
            sb.append(C117295b.m165373b(dVar.f350333d).concat("=").concat(C117295b.m165373b(dVar.f350334e)));
        }
        return sb.toString().substring(1);
    }

    public C116914e(List<C116913d> list) {
        this.f350335a = new ArrayList(list);
    }
}
