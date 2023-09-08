package q11;

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

/* renamed from: q11.i */
public final class C110342i extends C53896h0 implements Closeable {

    /* renamed from: g */
    public static int f330079g;

    /* renamed from: e */
    public final C13601g f330080e = C36568h.m40985a(C110344b.f330083d);

    /* renamed from: f */
    public final C13601g f330081f = C36568h.m40985a(new C110343a(this));

    /* renamed from: q11.i$a */
    public static final class C110343a extends C87413o implements C32224a<Handler> {

        /* renamed from: d */
        public final /* synthetic */ C110342i f330082d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110343a(C110342i iVar) {
            super(0);
            this.f330082d = iVar;
        }

        public Object invoke() {
            Object value = ((C36570n) this.f330082d.f330080e).getValue();
            C87412m.m108593f(value, "<get-workThread>(...)");
            return new Handler(((HandlerThread) value).getLooper());
        }
    }

    /* renamed from: q11.i$b */
    public static final class C110344b extends C87413o implements C32224a<HandlerThread> {

        /* renamed from: d */
        public static final C110344b f330083d = new C110344b();

        public C110344b() {
            super(0);
        }

        public Object invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append("MTRHandlerThreadDispatcher-");
            int i = C110342i.f330079g;
            C110342i.f330079g = i + 1;
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
        ((Handler) ((C36570n) this.f330081f).getValue()).post(runnable);
    }

    public void close() {
        ((Handler) ((C36570n) this.f330081f).getValue()).removeMessages(0);
        Object value = ((C36570n) this.f330080e).getValue();
        C87412m.m108593f(value, "<get-workThread>(...)");
        ((HandlerThread) value).quit();
        Log.m105924i("MicroMsg.MTR.MTRHandlerThreadDispatcher", "worker thread stopped");
    }
}
