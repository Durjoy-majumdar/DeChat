package p825u8;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: u8.e */
public class C111136e {

    /* renamed from: b */
    public static C111136e f332742b;

    /* renamed from: a */
    public final Object f332743a = new Object();

    /* renamed from: u8.e$a */
    public class C111137a implements Handler.Callback {
        public C111137a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            C111136e eVar = C111136e.this;
            C111138b bVar = (C111138b) message.obj;
            synchronized (eVar.f332743a) {
                if (bVar == null) {
                    bVar.getClass();
                    throw null;
                }
            }
            return true;
        }
    }

    /* renamed from: u8.e$b */
    public static class C111138b {
    }

    public C111136e() {
        new Handler(Looper.getMainLooper(), new C111137a());
    }
}
