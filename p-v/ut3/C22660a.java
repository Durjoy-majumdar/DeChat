package ut3;

import java.util.HashMap;
import ot3.C21881e;
import ot3.C21885g;

/* renamed from: ut3.a */
public class C22660a {

    /* renamed from: a */
    public static HashMap<Class, C22661a> f65183a = new HashMap<>();

    /* renamed from: ut3.a$a */
    public static class C22661a {

        /* renamed from: a */
        public int f65184a;

        /* renamed from: b */
        public int f65185b;

        /* renamed from: c */
        public String f65186c;
    }

    /* renamed from: a */
    public static boolean m26537a(Class cls, C21885g gVar) {
        if (gVar.mo34909a()) {
            return false;
        }
        C22661a aVar = f65183a.get(cls);
        if (aVar == null) {
            aVar = new C22661a();
            aVar.f65185b = gVar.f61886a;
            aVar.f65186c = gVar.f61887b;
            aVar.f65184a = 1;
            f65183a.put(cls, aVar);
        } else if (gVar.f61886a != aVar.f65185b || !gVar.f61887b.equals(aVar.f65186c)) {
            aVar.f65185b = gVar.f61886a;
            aVar.f65186c = gVar.f61887b;
            aVar.f65184a = 1;
        } else {
            int i = aVar.f65184a + 1;
            aVar.f65184a = i;
            if (i >= 2) {
                return true;
            }
        }
        C21881e.m25082a("Soter.RemoveASKStrategy", "error counter: %s", Integer.valueOf(aVar.f65184a));
        return false;
    }
}
