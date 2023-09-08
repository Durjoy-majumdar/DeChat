package p1091b3;

import android.os.Handler;
import java.util.concurrent.Callable;
import p329d3.C86165a;

/* renamed from: b3.o */
public class C113137o<T> implements Runnable {

    /* renamed from: d */
    public Callable<T> f338540d;

    /* renamed from: e */
    public C86165a<T> f338541e;

    /* renamed from: f */
    public Handler f338542f;

    /* renamed from: b3.o$a */
    public class C113138a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C86165a f338543d;

        /* renamed from: e */
        public final /* synthetic */ Object f338544e;

        public C113138a(C113137o oVar, C86165a aVar, Object obj) {
            this.f338543d = aVar;
            this.f338544e = obj;
        }

        public void run() {
            this.f338543d.accept(this.f338544e);
        }
    }

    public C113137o(Handler handler, Callable<T> callable, C86165a<T> aVar) {
        this.f338540d = callable;
        this.f338541e = aVar;
        this.f338542f = handler;
    }

    public void run() {
        T t;
        try {
            t = this.f338540d.call();
        } catch (Exception unused) {
            t = null;
        }
        this.f338542f.post(new C113138a(this, this.f338541e, t));
    }
}
