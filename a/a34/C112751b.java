package a34;

import android.app.FragmentManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.HashMap;
import java.util.Map;

/* renamed from: a34.b */
public class C112751b implements Handler.Callback {

    /* renamed from: f */
    public static final C112751b f337624f = new C112751b();

    /* renamed from: d */
    public final Handler f337625d = new Handler(Looper.getMainLooper(), this);

    /* renamed from: e */
    public final Map<FragmentManager, C112752c> f337626e = new HashMap();

    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        FragmentManager fragmentManager = (FragmentManager) message.obj;
        C112752c cVar = (C112752c) fragmentManager.findFragmentByTag("io.pag.manager");
        if (!fragmentManager.isDestroyed()) {
            ((HashMap) this.f337626e).get(fragmentManager);
        }
        ((HashMap) this.f337626e).remove(fragmentManager);
        return true;
    }
}
