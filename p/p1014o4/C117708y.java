package p1014o4;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;

/* renamed from: o4.y */
public abstract class C117708y {

    /* renamed from: a */
    public static final String f352034a = C117693m.m165967e("WorkerFactory");

    /* renamed from: a */
    public final ListenableWorker mo182398a(Context context, String str, WorkerParameters workerParameters) {
        Class<? extends U> cls;
        ListenableWorker listenableWorker = null;
        try {
            cls = Class.forName(str).asSubclass(ListenableWorker.class);
        } catch (Throwable th) {
            C117693m c = C117693m.m165966c();
            String str2 = f352034a;
            c.mo182390b(str2, "Invalid class: " + str, th);
            cls = null;
        }
        if (cls != null) {
            try {
                listenableWorker = (ListenableWorker) cls.getDeclaredConstructor(new Class[]{Context.class, WorkerParameters.class}).newInstance(new Object[]{context, workerParameters});
            } catch (Throwable th4) {
                C117693m c2 = C117693m.m165966c();
                String str3 = f352034a;
                c2.mo182390b(str3, "Could not instantiate " + str, th4);
            }
        }
        if (listenableWorker == null || !listenableWorker.f338329g) {
            return listenableWorker;
        }
        throw new IllegalStateException(String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", new Object[]{getClass().getName(), str}));
    }
}
