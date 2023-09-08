package k20;

/* renamed from: k20.c */
public class C60958c {

    /* renamed from: a */
    public static ThreadLocal<C9556a> f173611a = new ThreadLocal<>();

    /* renamed from: a */
    public static C9556a m71441a() {
        C9556a aVar = f173611a.get();
        f173611a.remove();
        return aVar;
    }

    /* renamed from: b */
    public static C9556a m71442b(int i, C9556a aVar) {
        aVar.mo10233c(Integer.valueOf(i));
        return aVar;
    }
}
