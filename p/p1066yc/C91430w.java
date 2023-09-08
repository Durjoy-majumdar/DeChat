package p1066yc;

import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import eu3.C58834h;
import eu3.C97749e;
import fu3.C116901a;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: yc.w */
public final class C91430w implements C91415l {

    /* renamed from: a */
    public final String f262144a;

    /* renamed from: b */
    public final HandlerThread f262145b;

    /* renamed from: c */
    public final C13601g f262146c = C36568h.m40985a(new C91432b(this));

    /* renamed from: d */
    public final C13601g f262147d = C36568h.m40985a(new C91431a(this));

    /* renamed from: yc.w$a */
    public static final class C91431a extends C87413o implements C32224a<Handler> {

        /* renamed from: d */
        public final /* synthetic */ C91430w f262148d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C91431a(C91430w wVar) {
            super(0);
            this.f262148d = wVar;
        }

        public Object invoke() {
            return new Handler(this.f262148d.f262145b.getLooper());
        }
    }

    /* renamed from: yc.w$b */
    public static final class C91432b extends C87413o implements C32224a<MMHandler> {

        /* renamed from: d */
        public final /* synthetic */ C91430w f262149d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C91432b(C91430w wVar) {
            super(0);
            this.f262149d = wVar;
        }

        public Object invoke() {
            return new MMHandler(this.f262149d.f262145b.getLooper());
        }
    }

    public C91430w(String str) {
        C87412m.m108594g(str, "name");
        this.f262144a = str;
        int i = C58834h.f168432b;
        HandlerThread a = C97749e.m126093a(str, 5);
        Log.m105924i("MicroMsg.SameLayerPluginHandlerThreadProvider", "Thread " + str + " created");
        this.f262145b = a;
    }

    /* renamed from: a */
    public boolean mo125366a() {
        boolean quitSafely = this.f262145b.quitSafely();
        Log.m105924i("MicroMsg.SameLayerPluginHandlerThreadProvider", "Thread " + this.f262144a + " quited");
        return quitSafely;
    }

    /* renamed from: b */
    public Handler mo125367b() {
        return (Handler) ((C36570n) this.f262147d).getValue();
    }

    public C116901a getHandler() {
        return (C116901a) ((C36570n) this.f262146c).getValue();
    }

    public void start() {
        this.f262145b.start();
        C13598b0 b0Var = C13598b0.f38549a;
        Log.m105924i("MicroMsg.SameLayerPluginHandlerThreadProvider", "Thread " + this.f262144a + " started");
    }
}
