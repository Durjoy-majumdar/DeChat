package p852fk;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: fk.b */
public class C59110b {

    /* renamed from: a */
    public static final Handler f169073a = new C59111a(Looper.getMainLooper());

    /* renamed from: fk.b$a */
    public class C59111a extends Handler {
        public C59111a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            Object obj = message.obj;
            if (obj instanceof Runnable) {
                ((Runnable) obj).run();
            }
            super.handleMessage(message);
        }
    }
}
