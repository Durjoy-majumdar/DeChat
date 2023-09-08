package p1169a5;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p1222y4.C118925j;

/* renamed from: a5.b */
public class C112758b implements C112757a {

    /* renamed from: a */
    public final C118925j f337642a;

    /* renamed from: b */
    public final Handler f337643b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public final Executor f337644c = new C112759a();

    /* renamed from: a5.b$a */
    public class C112759a implements Executor {
        public C112759a() {
        }

        public void execute(Runnable runnable) {
            C112758b.this.f337643b.post(runnable);
        }
    }

    public C112758b(Executor executor) {
        this.f337642a = new C118925j(executor);
    }

    /* renamed from: a */
    public void mo164514a(Runnable runnable) {
        this.f337642a.execute(runnable);
    }
}
