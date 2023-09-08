package xn0;

import d93.C45310h;

/* renamed from: xn0.d0 */
public class C53412d0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f150273d;

    /* renamed from: e */
    public final /* synthetic */ long f150274e;

    /* renamed from: f */
    public final /* synthetic */ int f150275f;

    /* renamed from: g */
    public final /* synthetic */ float f150276g;

    /* renamed from: h */
    public final /* synthetic */ C53437j0 f150277h;

    public C53412d0(C53437j0 j0Var, String str, long j, int i, float f) {
        this.f150277h = j0Var;
        this.f150273d = str;
        this.f150274e = j;
        this.f150275f = i;
        this.f150276g = f;
    }

    public void run() {
        C45310h hVar;
        C53437j0 j0Var = this.f150277h;
        if (j0Var.f150339e != null && (hVar = j0Var.f150340f) != null && hVar.mo70860c().mo69447f(42)) {
            this.f150277h.f150339e.mo73206C(this.f150273d, this.f150274e, this.f150275f, this.f150276g);
        }
    }
}
