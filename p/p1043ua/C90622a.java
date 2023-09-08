package p1043ua;

import java.util.Map;
import zi0.C91755a;

/* renamed from: ua.a */
public abstract class C90622a implements C91755a.C91756a {
    /* renamed from: N0 */
    public void mo115839N0(String str, Map<String, String> map, C91755a.C91758c cVar) {
        mo115832Om(str, cVar);
    }

    /* renamed from: Om */
    public abstract void mo115832Om(String str, C91755a.C91758c cVar);

    public boolean equals(Object obj) {
        if (!(obj instanceof C91755a.C91756a)) {
            return false;
        }
        if (key().equalsIgnoreCase(((C91755a.C91756a) obj).key())) {
            return true;
        }
        return super.equals(obj);
    }
}
