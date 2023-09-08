package ck3;

/* renamed from: ck3.g */
public abstract class C67398g implements Runnable {
    /* renamed from: a */
    public abstract void mo91597a();

    public final void run() {
        ThreadLocal<Boolean> threadLocal = C67394d.f193312a;
        ThreadLocal<Boolean> threadLocal2 = C67394d.f193312a;
        threadLocal2.set(Boolean.TRUE);
        mo91597a();
        threadLocal2.set(Boolean.FALSE);
    }
}
