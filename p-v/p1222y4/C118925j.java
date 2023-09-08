package p1222y4;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: y4.j */
public class C118925j implements Executor {

    /* renamed from: d */
    public final ArrayDeque<C118926a> f356204d = new ArrayDeque<>();

    /* renamed from: e */
    public final Executor f356205e;

    /* renamed from: f */
    public final Object f356206f = new Object();

    /* renamed from: g */
    public volatile Runnable f356207g;

    /* renamed from: y4.j$a */
    public static class C118926a implements Runnable {

        /* renamed from: d */
        public final C118925j f356208d;

        /* renamed from: e */
        public final Runnable f356209e;

        public C118926a(C118925j jVar, Runnable runnable) {
            this.f356208d = jVar;
            this.f356209e = runnable;
        }

        public void run() {
            try {
                this.f356209e.run();
            } finally {
                this.f356208d.mo183604a();
            }
        }
    }

    public C118925j(Executor executor) {
        this.f356205e = executor;
    }

    /* renamed from: a */
    public void mo183604a() {
        synchronized (this.f356206f) {
            Runnable poll = this.f356204d.poll();
            this.f356207g = poll;
            if (poll != null) {
                this.f356205e.execute(this.f356207g);
            }
        }
    }

    public void execute(Runnable runnable) {
        synchronized (this.f356206f) {
            this.f356204d.add(new C118926a(this, runnable));
            if (this.f356207g == null) {
                mo183604a();
            }
        }
    }
}
