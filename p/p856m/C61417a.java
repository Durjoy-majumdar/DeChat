package p856m;

import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: m.a */
public class C61417a extends C61422c {

    /* renamed from: b */
    public static volatile C61417a f174664b;

    /* renamed from: c */
    public static final Executor f174665c = new C61418a();

    /* renamed from: d */
    public static final Executor f174666d = new C61419b();

    /* renamed from: a */
    public C61422c f174667a = new C61420b();

    /* renamed from: m.a$a */
    public static class C61418a implements Executor {
        public void execute(Runnable runnable) {
            C61417a.m72117a().mo86364c(runnable);
        }
    }

    /* renamed from: m.a$b */
    public static class C61419b implements Executor {
        public void execute(Runnable runnable) {
            ((C61420b) C61417a.m72117a().f174667a).f174669b.execute(runnable);
        }
    }

    /* renamed from: a */
    public static C61417a m72117a() {
        if (f174664b != null) {
            return f174664b;
        }
        synchronized (C61417a.class) {
            if (f174664b == null) {
                f174664b = new C61417a();
            }
        }
        return f174664b;
    }

    /* renamed from: b */
    public boolean mo86363b() {
        ((C61420b) this.f174667a).getClass();
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: c */
    public void mo86364c(Runnable runnable) {
        C61420b bVar = (C61420b) this.f174667a;
        if (bVar.f174670c == null) {
            synchronized (bVar.f174668a) {
                if (bVar.f174670c == null) {
                    bVar.f174670c = C61420b.m72120a(Looper.getMainLooper());
                }
            }
        }
        bVar.f174670c.post(runnable);
    }
}
