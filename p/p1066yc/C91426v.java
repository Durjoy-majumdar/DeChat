package p1066yc;

import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.p014mm.sdk.platformtools.Log;
import eu3.C58834h;
import eu3.C97749e;
import fu3.C116901a;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import mu3.C109639a;
import mu3.C117579f;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: yc.v */
public final class C91426v implements C91415l {

    /* renamed from: a */
    public final String f262136a;

    /* renamed from: b */
    public final C13601g f262137b = C36568h.m40985a(new C91429c(this));

    /* renamed from: c */
    public HandlerThread f262138c;

    /* renamed from: d */
    public final C13601g f262139d = C36568h.m40985a(new C91428b(this));

    /* renamed from: e */
    public final C13601g f262140e = C36568h.m40985a(new C91427a(this));

    /* renamed from: yc.v$a */
    public static final class C91427a extends C87413o implements C32224a<Handler> {

        /* renamed from: d */
        public final /* synthetic */ C91426v f262141d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C91427a(C91426v vVar) {
            super(0);
            this.f262141d = vVar;
        }

        public Object invoke() {
            String str = this.f262141d.f262136a;
            int i = C58834h.f168432b;
            HandlerThread a = C97749e.m126093a(str, 5);
            C91426v vVar = this.f262141d;
            Log.m105924i("MicroMsg.SameLayerPluginHandlerThreadProvider", "Thread " + vVar.f262136a + " created");
            a.start();
            Log.m105924i("MicroMsg.SameLayerPluginHandlerThreadProvider", "Thread " + vVar.f262136a + " started");
            vVar.f262138c = a;
            return new Handler(a.getLooper());
        }
    }

    /* renamed from: yc.v$b */
    public static final class C91428b extends C87413o implements C32224a<C117579f> {

        /* renamed from: d */
        public final /* synthetic */ C91426v f262142d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C91428b(C91426v vVar) {
            super(0);
            this.f262142d = vVar;
        }

        public Object invoke() {
            C109639a aVar = (C109639a) ((C36570n) this.f262142d.f262137b).getValue();
            C87412m.m108593f(aVar, "serial");
            return new C117579f(aVar);
        }
    }

    /* renamed from: yc.v$c */
    public static final class C91429c extends C87413o implements C32224a<C109639a> {

        /* renamed from: d */
        public final /* synthetic */ C91426v f262143d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C91429c(C91426v vVar) {
            super(0);
            this.f262143d = vVar;
        }

        public Object invoke() {
            return C109639a.m148950a(this.f262143d.f262136a);
        }
    }

    public C91426v(String str) {
        C87412m.m108594g(str, "name");
        this.f262136a = str;
    }

    /* renamed from: a */
    public boolean mo125366a() {
        ((C109639a) ((C36570n) this.f262137b).getValue()).f328238b.mo182313f();
        HandlerThread handlerThread = this.f262138c;
        if (handlerThread == null) {
            return true;
        }
        boolean quitSafely = handlerThread.quitSafely();
        Log.m105924i("MicroMsg.SameLayerPluginHandlerThreadProvider", "Thread " + this.f262136a + " quited");
        return quitSafely;
    }

    /* renamed from: b */
    public Handler mo125367b() {
        return (Handler) ((C36570n) this.f262140e).getValue();
    }

    public C116901a getHandler() {
        return (C116901a) ((C36570n) this.f262139d).getValue();
    }

    public void start() {
    }
}
