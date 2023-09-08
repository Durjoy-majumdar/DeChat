package sp0;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.SystemClock;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import zt3.C119157j;

/* renamed from: sp0.c0 */
public abstract class C90275c0 {

    /* renamed from: a */
    public final CopyOnWriteArraySet<C90276a> f259152a = new CopyOnWriteArraySet<>();

    /* renamed from: b */
    public volatile Network f259153b;

    /* renamed from: c */
    public final C13601g f259154c = C36568h.m40985a(C13755d0.f38856d);

    /* renamed from: d */
    public final AtomicBoolean f259155d = new AtomicBoolean(false);

    /* renamed from: e */
    public final C13601g f259156e = C36568h.m40985a(new C90288f0(this));

    /* renamed from: f */
    public volatile long f259157f = -1;

    /* renamed from: g */
    public final C13601g f259158g = C36568h.m40985a(new C90297h0(this));

    /* renamed from: sp0.c0$a */
    public interface C90276a {
        /* renamed from: a */
        void mo13125a(Network network);
    }

    /* renamed from: sp0.c0$b */
    public static final class C90277b extends C90275c0 {

        /* renamed from: h */
        public static final C90277b f259159h = new C90277b();

        /* renamed from: i */
        public static final NetworkRequest f259160i;

        static {
            NetworkRequest build = new NetworkRequest.Builder().addCapability(12).addTransportType(0).build();
            C87412m.m108593f(build, "Builder()\n              …\n                .build()");
            f259160i = build;
        }

        public C90277b() {
            super((C8480h) null);
        }

        /* renamed from: a */
        public NetworkRequest mo124498a() {
            return f259160i;
        }
    }

    /* renamed from: sp0.c0$c */
    public static final class C90278c extends C90275c0 {

        /* renamed from: h */
        public static final C90278c f259161h = new C90278c();

        /* renamed from: i */
        public static final NetworkRequest f259162i;

        static {
            NetworkRequest build = new NetworkRequest.Builder().addTransportType(1).build();
            C87412m.m108593f(build, "Builder()\n              …\n                .build()");
            f259162i = build;
        }

        public C90278c() {
            super((C8480h) null);
        }

        /* renamed from: a */
        public NetworkRequest mo124498a() {
            return f259162i;
        }
    }

    /* renamed from: sp0.c0$d */
    public static final class C90279d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C90275c0 f259163d;

        /* renamed from: e */
        public final /* synthetic */ C90276a f259164e;

        public C90279d(C90275c0 c0Var, C90276a aVar) {
            this.f259163d = c0Var;
            this.f259164e = aVar;
        }

        public final void run() {
            if (this.f259163d.f259152a.remove(this.f259164e)) {
                Log.m105924i("MicroMsg.NetworkProvider", "provide, timeout");
                this.f259164e.mo13125a((Network) null);
            }
        }
    }

    public C90275c0(C8480h hVar) {
    }

    /* renamed from: a */
    public abstract NetworkRequest mo124498a();

    /* renamed from: b */
    public final void mo124499b(C90276a aVar) {
        C87412m.m108594g(aVar, "callback");
        Network network = this.f259153b;
        if (network != null) {
            Log.m105924i("MicroMsg.NetworkProvider", "provide, curNetwork not null");
            aVar.mo13125a(network);
            return;
        }
        this.f259152a.add(aVar);
        ((C119157j) C119157j.f356862d).mo183878i(new C90279d(this, aVar), 4000);
        this.f259157f = SystemClock.uptimeMillis() + 30000;
        if (this.f259155d.compareAndSet(false, true)) {
            Log.m105924i("MicroMsg.NetworkProvider", "doRequest, requestNetwork");
            try {
                ((ConnectivityManager) ((C36570n) this.f259154c).getValue()).requestNetwork(mo124498a(), (C90286e0) ((C36570n) this.f259156e).getValue());
                ((C119157j) C119157j.f356862d).mo183878i((Runnable) ((C36570n) this.f259158g).getValue(), 30000);
            } catch (Exception e) {
                Log.m105920e("MicroMsg.NetworkProvider", "doRequest, requestNetwork fail since " + e);
                this.f259155d.set(false);
            }
        }
    }
}
