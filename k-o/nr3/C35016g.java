package nr3;

/* renamed from: nr3.g */
public class C35016g<T> {

    /* renamed from: a */
    public volatile T f93967a;

    /* renamed from: b */
    public byte[] f93968b = new byte[0];

    /* renamed from: c */
    public C35015b<T> f93969c;

    public C35016g(C35015b<T> bVar) {
        this.f93969c = bVar;
    }

    /* renamed from: a */
    public T mo59825a() {
        if (this.f93967a == null) {
            synchronized (this.f93968b) {
                if (this.f93967a == null) {
                    this.f93967a = this.f93969c.get();
                }
            }
        }
        return this.f93967a;
    }
}
