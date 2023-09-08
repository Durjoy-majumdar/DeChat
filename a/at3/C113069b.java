package at3;

/* renamed from: at3.b */
public abstract class C113069b implements Runnable {
    /* renamed from: a */
    public abstract void mo165593a();

    /* renamed from: b */
    public abstract void mo165594b(Throwable th);

    public void run() {
        try {
            mo165593a();
        } catch (Throwable th) {
            mo165594b(th);
        }
    }
}
