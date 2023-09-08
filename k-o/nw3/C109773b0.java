package nw3;

import nw3.C109804j;

/* renamed from: nw3.b0 */
public class C109773b0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f328533d;

    /* renamed from: e */
    public final /* synthetic */ int f328534e;

    /* renamed from: f */
    public final /* synthetic */ int f328535f;

    /* renamed from: g */
    public final /* synthetic */ C109804j f328536g;

    public C109773b0(C109804j jVar, String str, int i, int i2) {
        this.f328536g = jVar;
        this.f328533d = str;
        this.f328534e = i;
        this.f328535f = i2;
    }

    public void run() {
        synchronized (this.f328536g.f328705a) {
            for (C109804j.C109807c u : this.f328536g.f328705a) {
                u.mo161064u(this.f328533d, this.f328534e, this.f328535f);
            }
        }
    }
}
