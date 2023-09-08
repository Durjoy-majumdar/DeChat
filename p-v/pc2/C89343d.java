package pc2;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/* renamed from: pc2.d */
public final class C89343d {

    /* renamed from: a */
    public static final Queue<C89342c> f257320a = new PriorityQueue(11, C89344a.f257322d);

    /* renamed from: b */
    public static final C89341b f257321b;

    /* renamed from: pc2.d$a */
    public static final class C89344a<T> implements Comparator {

        /* renamed from: d */
        public static final C89344a<T> f257322d = new C89344a<>();

        public int compare(Object obj, Object obj2) {
            return ((C89342c) obj).mo11764d() - ((C89342c) obj2).mo11764d();
        }
    }

    static {
        C89343d dVar = new C89343d();
        C11886a aVar = new C11886a();
        C89341b bVar = new C89341b();
        f257321b = bVar;
        Log.m105924i("MicroMsg.Nfc.NfcDispatchLogic", "<init>");
        dVar.mo123695a(aVar);
        dVar.mo123695a(bVar);
    }

    /* renamed from: a */
    public final void mo123695a(C89342c cVar) {
        C87412m.m108594g(cVar, "processor");
        Log.m105924i("MicroMsg.Nfc.NfcDispatchLogic", "addProcessor, processor: " + cVar.getName());
        f257320a.add(cVar);
    }
}
