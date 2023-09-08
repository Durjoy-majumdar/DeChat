package e24;

/* renamed from: e24.b */
public abstract class C20508b implements Runnable {

    /* renamed from: d */
    public final String f57728d;

    public C20508b(String str, Object... objArr) {
        this.f57728d = C20509c.m22204j(str, objArr);
    }

    /* renamed from: a */
    public abstract void mo31966a();

    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f57728d);
        try {
            mo31966a();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
