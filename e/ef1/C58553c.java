package ef1;

import com.tencent.p014mm.sdk.platformtools.MMHandler;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import sx3.C110823p;

/* renamed from: ef1.c */
public final class C58553c {

    /* renamed from: a */
    public volatile boolean f167603a;

    /* renamed from: b */
    public final ConcurrentHashMap<C58555d, Object> f167604b;

    /* renamed from: c */
    public final MMHandler f167605c;

    /* renamed from: ef1.c$a */
    public static final class C58554a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Map.Entry<C58555d, Object> f167606d;

        /* renamed from: e */
        public final /* synthetic */ C7637b f167607e;

        public C58554a(Map.Entry<? extends C58555d, ? extends Object> entry, C7637b bVar) {
            this.f167606d = entry;
            this.f167607e = bVar;
        }

        public final void run() {
            this.f167606d.getKey().mo2331B1(this.f167607e);
        }
    }

    public C58553c() {
        this((String) null, 1, (C8480h) null);
    }

    public C58553c(String str) {
        C87412m.m108594g(str, "threadTag");
        this.f167604b = new ConcurrentHashMap<>();
        MMHandler mMHandler = new MMHandler(str);
        mMHandler.setLogging(false);
        this.f167605c = mMHandler;
    }

    /* renamed from: a */
    public final void mo83450a(C58555d dVar) {
        C87412m.m108594g(dVar, "observer");
        this.f167604b.put(dVar, new Object());
    }

    /* renamed from: b */
    public final void mo83451b(C7637b bVar) {
        C87412m.m108594g(bVar, "event");
        if (!this.f167603a) {
            for (Map.Entry next : this.f167604b.entrySet()) {
                if (((C58555d) next.getKey()).mo2333z1(this, bVar)) {
                    C58555d dVar = (C58555d) next.getKey();
                    if (C110823p.m151009y(dVar.f159164e, dVar.f159163d)) {
                        if (((C58555d) next.getKey()).mo2424y1()) {
                            this.f167605c.post(new C58554a(next, bVar));
                        } else {
                            ((C58555d) next.getKey()).mo2331B1(bVar);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo83452c() {
        this.f167603a = true;
        this.f167605c.quitSafely();
        for (Map.Entry<C58555d, Object> key : this.f167604b.entrySet()) {
            ((C58555d) key.getKey()).mo2332C1();
        }
        this.f167604b.clear();
    }

    /* renamed from: d */
    public final void mo83453d(C58555d dVar) {
        if (dVar != null && this.f167604b.containsKey(dVar)) {
            this.f167604b.remove(dVar);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C58553c(String str, int i, C8480h hVar) {
        this((i & 1) != 0 ? "EventDispatcher" : str);
    }
}
