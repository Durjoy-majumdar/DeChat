package i82;

import a14.C53896h0;
import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.p014mm.sdk.platformtools.Log;
import eu3.C58834h;
import eu3.C97749e;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.io.Closeable;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import wx3.C66212f;

/* renamed from: i82.i */
public final class C108414i extends C53896h0 implements Closeable {

    /* renamed from: g */
    public static int f324626g;

    /* renamed from: e */
    public final C13601g f324627e = C36568h.m40985a(C108416b.f324630d);

    /* renamed from: f */
    public final C13601g f324628f = C36568h.m40985a(new C108415a(this));

    /* renamed from: i82.i$a */
    public static final class C108415a extends C87413o implements C32224a<Handler> {

        /* renamed from: d */
        public final /* synthetic */ C108414i f324629d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108415a(C108414i iVar) {
            super(0);
            this.f324629d = iVar;
        }

        public Object invoke() {
            Object value = ((C36570n) this.f324629d.f324627e).getValue();
            C87412m.m108593f(value, "<get-workThread>(...)");
            return new Handler(((HandlerThread) value).getLooper());
        }
    }

    /* renamed from: i82.i$b */
    public static final class C108416b extends C87413o implements C32224a<HandlerThread> {

        /* renamed from: d */
        public static final C108416b f324630d = new C108416b();

        public C108416b() {
            super(0);
        }

        public Object invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append("MTRHandlerThreadDispatcher-");
            int i = C108414i.f324626g;
            C108414i.f324626g = i + 1;
            sb.append(i);
            String sb4 = sb.toString();
            int i2 = C58834h.f168432b;
            HandlerThread a = C97749e.m126093a(sb4, -16);
            a.start();
            Log.m105924i("MicroMsg.MTR.MTRHandlerThreadDispatcher", "worker thread start");
            return a;
        }
    }

    /* renamed from: S */
    public void mo74497S(C66212f fVar, Runnable runnable) {
        C87412m.m108594g(fVar, "context");
        C87412m.m108594g(runnable, "block");
        ((Handler) ((C36570n) this.f324628f).getValue()).post(runnable);
    }

    public void close() {
        ((Handler) ((C36570n) this.f324628f).getValue()).removeMessages(0);
        Object value = ((C36570n) this.f324627e).getValue();
        C87412m.m108593f(value, "<get-workThread>(...)");
        ((HandlerThread) value).quit();
        Log.m105924i("MicroMsg.MTR.MTRHandlerThreadDispatcher", "worker thread stopped");
    }
}
