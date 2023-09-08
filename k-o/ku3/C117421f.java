package ku3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.TimeUnit;
import ku3.C117409a;
import lu3.C117479j;

/* renamed from: ku3.f */
public class C117421f extends C117409a {

    /* renamed from: e */
    public C117423b f351466e = new C117423b((C117422a) null);

    /* renamed from: ku3.f$b */
    public static class C117423b implements C117409a.C117410a {

        /* renamed from: d */
        public Handler f351467d = new C117424a(this, Looper.getMainLooper());

        /* renamed from: ku3.f$b$a */
        public class C117424a extends Handler {
            public C117424a(C117423b bVar, Looper looper) {
                super(looper);
            }

            public void dispatchMessage(Message message) {
                if (message.getCallback() == null || !(message.getCallback() instanceof C117479j) || !((C117479j) message.getCallback()).isCancelled()) {
                    super.dispatchMessage(message);
                }
            }
        }

        public C117423b(C117422a aVar) {
        }

        /* renamed from: a */
        public void mo182102a(C117479j<?> jVar) {
            this.f351467d.postDelayed(jVar, jVar.getDelay(TimeUnit.MILLISECONDS));
        }
    }

    /* renamed from: a */
    public void mo182103a(C117479j<?> jVar) {
        this.f351466e.f351467d.removeCallbacks(jVar);
    }

    /* renamed from: b */
    public C117409a.C117410a mo182100b() {
        return this.f351466e;
    }

    /* renamed from: d */
    public void mo182118d() {
        this.f351466e.f351467d.removeCallbacksAndMessages((Object) null);
    }

    public String getName() {
        return "UIPool";
    }
}
