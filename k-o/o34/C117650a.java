package o34;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import l34.C117453e;
import l34.C117458j;
import l34.C88379f;
import o34.C117655d;
import u34.C118572c;
import v34.C118644a;

/* renamed from: o34.a */
public final class C117650a<T> extends C118572c<T, T> {

    /* renamed from: g */
    public static final C88379f f351913g = new C117651a();

    /* renamed from: e */
    public final C117653c<T> f351914e;

    /* renamed from: f */
    public boolean f351915f;

    /* renamed from: o34.a$a */
    public static class C117651a implements C88379f {
        /* renamed from: a */
        public void mo122780a() {
        }

        /* renamed from: b */
        public void mo122781b(Object obj) {
        }

        public void onError(Throwable th) {
        }
    }

    /* renamed from: o34.a$b */
    public static final class C117652b<T> implements C117453e.C88376a<T> {

        /* renamed from: d */
        public final C117653c<T> f351916d;

        public C117652b(C117653c<T> cVar) {
            this.f351916d = cVar;
        }

        public void call(Object obj) {
            boolean z;
            C117458j jVar = (C117458j) obj;
            if (this.f351916d.compareAndSet((Object) null, jVar)) {
                jVar.mo182166e(new C118644a(new C117654b(this)));
                synchronized (this.f351916d.f351917d) {
                    C117653c<T> cVar = this.f351916d;
                    z = true;
                    if (!cVar.f351918e) {
                        cVar.f351918e = true;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    C117655d dVar = C117655d.f351922a;
                    while (true) {
                        Object poll = this.f351916d.f351919f.poll();
                        if (poll != null) {
                            dVar.mo182372a((C88379f) this.f351916d.get(), poll);
                        } else {
                            synchronized (this.f351916d.f351917d) {
                                if (this.f351916d.f351919f.isEmpty()) {
                                    this.f351916d.f351918e = false;
                                    return;
                                }
                            }
                        }
                    }
                }
            } else {
                jVar.onError(new IllegalStateException("Only one subscriber allowed!"));
            }
        }
    }

    /* renamed from: o34.a$c */
    public static final class C117653c<T> extends AtomicReference<C88379f<? super T>> {

        /* renamed from: d */
        public final Object f351917d = new Object();

        /* renamed from: e */
        public boolean f351918e;

        /* renamed from: f */
        public final ConcurrentLinkedQueue<Object> f351919f = new ConcurrentLinkedQueue<>();

        /* renamed from: g */
        public final C117655d<T> f351920g = C117655d.f351922a;
    }

    public C117650a(C117653c<T> cVar) {
        super(new C117652b(cVar));
        this.f351914e = cVar;
    }

    /* renamed from: a */
    public void mo122780a() {
        if (this.f351915f) {
            ((C88379f) this.f351914e.get()).mo122780a();
            return;
        }
        this.f351914e.f351920g.getClass();
        mo182371i(C117655d.f351923b);
    }

    /* renamed from: b */
    public void mo122781b(T t) {
        if (this.f351915f) {
            ((C88379f) this.f351914e.get()).mo122781b(t);
            return;
        }
        this.f351914e.f351920g.getClass();
        if (t == null) {
            t = C117655d.f351924c;
        }
        mo182371i(t);
    }

    /* renamed from: i */
    public final void mo182371i(Object obj) {
        synchronized (this.f351914e.f351917d) {
            this.f351914e.f351919f.add(obj);
            if (this.f351914e.get() != null) {
                C117653c<T> cVar = this.f351914e;
                if (!cVar.f351918e) {
                    this.f351915f = true;
                    cVar.f351918e = true;
                }
            }
        }
        if (this.f351915f) {
            while (true) {
                Object poll = this.f351914e.f351919f.poll();
                if (poll != null) {
                    C117653c<T> cVar2 = this.f351914e;
                    cVar2.f351920g.mo182372a((C88379f) cVar2.get(), poll);
                } else {
                    return;
                }
            }
        }
    }

    public void onError(Throwable th) {
        if (this.f351915f) {
            ((C88379f) this.f351914e.get()).onError(th);
            return;
        }
        this.f351914e.f351920g.getClass();
        mo182371i(new C117655d.C117658c(th));
    }
}
