package a14;

/* renamed from: a14.x2 */
public final class C53968x2 {

    /* renamed from: a */
    public static final C53968x2 f151211a = new C53968x2();

    /* renamed from: b */
    public static final ThreadLocal<C53906j1> f151212b = new ThreadLocal<>();

    /* renamed from: a */
    public final C53906j1 mo74642a() {
        ThreadLocal<C53906j1> threadLocal = f151212b;
        C53906j1 j1Var = threadLocal.get();
        if (j1Var != null) {
            return j1Var;
        }
        C53890g gVar = new C53890g(Thread.currentThread());
        threadLocal.set(gVar);
        return gVar;
    }
}
