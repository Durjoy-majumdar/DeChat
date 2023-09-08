package p723vf;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Printer;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: vf.c */
public class C90778c {

    /* renamed from: a */
    public static volatile HandlerThread f260685a;

    /* renamed from: b */
    public static volatile Handler f260686b;

    /* renamed from: c */
    public static volatile Handler f260687c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    public static HashSet<HandlerThread> f260688d = new HashSet<>();

    /* renamed from: a */
    public static Handler m113843a() {
        if (f260686b == null) {
            m113844b();
        }
        return f260686b;
    }

    /* renamed from: b */
    public static HandlerThread m113844b() {
        HandlerThread handlerThread;
        synchronized (C90778c.class) {
            if (f260685a == null) {
                f260685a = new HandlerThread("default_matrix_thread");
                f260685a.start();
                f260686b = new Handler(f260685a.getLooper());
                f260685a.getLooper().setMessageLogging((Printer) null);
                C118672d.m167356f("Matrix.HandlerThread", "create default handler thread, we should use these thread normal, isDebug:%s", Boolean.FALSE);
            }
            handlerThread = f260685a;
        }
        return handlerThread;
    }

    /* renamed from: c */
    public static synchronized HandlerThread m113845c(String str, int i) {
        HandlerThread handlerThread;
        synchronized (C90778c.class) {
            Iterator<HandlerThread> it = f260688d.iterator();
            while (it.hasNext()) {
                if (!it.next().isAlive()) {
                    it.remove();
                    C118672d.m167356f("Matrix.HandlerThread", "warning: remove dead handler thread with name %s", str);
                }
            }
            handlerThread = new HandlerThread(str);
            handlerThread.setPriority(i);
            handlerThread.start();
            f260688d.add(handlerThread);
            C118672d.m167356f("Matrix.HandlerThread", "warning: create new handler thread with name %s, alive thread size:%d", str, Integer.valueOf(f260688d.size()));
        }
        return handlerThread;
    }
}
