package am3;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import gy3.C87412m;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import p329d3.C106986f;

/* renamed from: am3.a */
public final class C54139a {

    /* renamed from: f */
    public static final C106986f<C54140a> f152056f = new C106986f<>(10);

    /* renamed from: a */
    public Context f152057a;

    /* renamed from: b */
    public MMHandler f152058b;

    /* renamed from: c */
    public C54141b f152059c;

    /* renamed from: d */
    public Future<?> f152060d;

    /* renamed from: e */
    public final MMHandler.Callback f152061e;

    /* renamed from: am3.a$a */
    public static final class C54140a {

        /* renamed from: a */
        public C54139a f152062a;

        /* renamed from: b */
        public ViewGroup f152063b;

        /* renamed from: c */
        public int f152064c;

        /* renamed from: d */
        public View f152065d;

        /* renamed from: e */
        public C54142c f152066e;

        /* renamed from: f */
        public CountDownLatch f152067f;
    }

    /* renamed from: am3.a$b */
    public static final class C54141b implements Runnable {

        /* renamed from: d */
        public final C54140a f152068d;

        /* renamed from: e */
        public boolean f152069e;

        public C54141b(C54140a aVar) {
            C87412m.m108594g(aVar, "request");
            this.f152068d = aVar;
        }

        public void run() {
            MMHandler mMHandler;
            Message obtainMessage;
            this.f152069e = true;
            long currentTimeMillis = System.currentTimeMillis();
            try {
                C54140a aVar = this.f152068d;
                C54139a aVar2 = aVar.f152062a;
                LayoutInflater b = C85868k2.m106137b(aVar2 != null ? aVar2.f152057a : null);
                C54140a aVar3 = this.f152068d;
                aVar.f152065d = b.inflate(aVar3.f152064c, aVar3.f152063b, false);
            } catch (RuntimeException e) {
                Log.m105928w("MicroMsg.WxAsyncLayoutInflater", "Failed to inflate resource(" + this.f152068d.f152064c + ") in the background! Retry on the UI thread. " + e.getMessage());
            }
            C54140a aVar4 = this.f152068d;
            C54142c cVar = aVar4.f152066e;
            if (cVar != null) {
                cVar.mo74963a(aVar4.f152065d, aVar4.f152064c, aVar4.f152063b);
            }
            CountDownLatch countDownLatch = this.f152068d.f152067f;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
            C54140a aVar5 = this.f152068d;
            C54139a aVar6 = aVar5.f152062a;
            if (!(aVar6 == null || (mMHandler = aVar6.f152058b) == null || (obtainMessage = mMHandler.obtainMessage(0, aVar5)) == null)) {
                obtainMessage.sendToTarget();
            }
            Log.m105924i("MicroMsg.WxAsyncLayoutInflater", "InflateRunnable " + this.f152068d.f152064c + ' ' + (System.currentTimeMillis() - currentTimeMillis));
        }
    }

    /* renamed from: am3.a$c */
    public interface C54142c {
        /* renamed from: a */
        void mo74963a(View view, int i, ViewGroup viewGroup);
    }

    /* renamed from: am3.a$d */
    public static final class C54143d implements MMHandler.Callback {

        /* renamed from: d */
        public final /* synthetic */ C54139a f152070d;

        public C54143d(C54139a aVar) {
            this.f152070d = aVar;
        }

        public final boolean handleMessage(Message message) {
            C87412m.m108594g(message, "msg");
            Object obj = message.obj;
            C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.mm.ui.inflate.WxAsyncLayoutInflater.InflateRequest");
            C54140a aVar = (C54140a) obj;
            this.f152070d.getClass();
            aVar.f152066e = null;
            aVar.f152062a = null;
            aVar.f152063b = null;
            aVar.f152064c = 0;
            aVar.f152065d = null;
            C54139a.f152056f.mo157420b(aVar);
            return true;
        }
    }

    public C54139a(Context context) {
        C87412m.m108594g(context, "context");
        C54143d dVar = new C54143d(this);
        this.f152061e = dVar;
        this.f152057a = context;
        this.f152058b = new MMHandler(Looper.getMainLooper(), (MMHandler.Callback) dVar);
    }
}
