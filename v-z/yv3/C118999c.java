package yv3;

import bw3.C113213a;
import bw3.C113215b;
import cw3.C116546d;
import ew3.C116793c;
import java.util.HashMap;

/* renamed from: yv3.c */
public abstract class C118999c {

    /* renamed from: a */
    public C119000a f356437a = new C119000a(this);

    /* renamed from: yv3.c$a */
    public class C119000a {

        /* renamed from: a */
        public HashMap<Integer, C116546d> f356438a = new HashMap<>();

        public C119000a(C118999c cVar) {
        }
    }

    public C118999c() {
        C116793c.C116794a aVar = (C116793c.C116794a) this;
        C113213a aVar2 = new C113213a(aVar.f350119b);
        C119000a aVar3 = aVar.f356437a;
        if (!aVar3.f356438a.containsKey(aVar2)) {
            aVar3.f356438a.put(0, aVar2);
        }
        C113215b bVar = new C113215b(aVar.f350119b);
        C119000a aVar4 = aVar.f356437a;
        if (!aVar4.f356438a.containsKey(bVar)) {
            aVar4.f356438a.put(10, bVar);
        }
    }
}
