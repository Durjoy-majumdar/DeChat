package p857mg;

import android.graphics.Bitmap;
import gy3.C8479f0;
import o40.C61926c;
import p278yh.C102862b;
import p855lg.C61278a;
import r60.C101350i;
import rx3.C13598b0;
import t60.C64207e;
import x60.C102564a;

/* renamed from: mg.c */
public final class C99851c<T, R> implements C64207e {

    /* renamed from: a */
    public final /* synthetic */ C99860m f292592a;

    /* renamed from: b */
    public final /* synthetic */ C61278a f292593b;

    /* renamed from: c */
    public final /* synthetic */ C102862b f292594c;

    /* renamed from: d */
    public final /* synthetic */ C8479f0<String> f292595d;

    /* renamed from: e */
    public final /* synthetic */ Bitmap f292596e;

    public C99851c(C99860m mVar, C61278a aVar, C102862b bVar, C8479f0<String> f0Var, Bitmap bitmap) {
        this.f292592a = mVar;
        this.f292593b = aVar;
        this.f292594c = bVar;
        this.f292595d = f0Var;
        this.f292596e = bitmap;
    }

    /* renamed from: a */
    public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
        C13598b0 b0Var;
        if (((Bitmap) obj) != null) {
            C61926c.m72668M(new C99849a(this.f292592a, this.f292593b, this.f292594c, this.f292595d, this.f292596e));
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            C61926c.m72668M(new C99850b(this.f292592a, this.f292594c, this.f292596e));
        }
    }
}
