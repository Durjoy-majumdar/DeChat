package p857mg;

import android.graphics.Bitmap;
import o40.C61926c;
import p278yh.C102862b;
import p855lg.C61278a;
import r60.C101350i;
import rx3.C13598b0;
import t60.C64207e;
import x60.C102564a;

/* renamed from: mg.i */
public final class C99856i<T, R> implements C64207e {

    /* renamed from: a */
    public final /* synthetic */ C99860m f292610a;

    /* renamed from: b */
    public final /* synthetic */ String f292611b;

    /* renamed from: c */
    public final /* synthetic */ C102862b f292612c;

    /* renamed from: d */
    public final /* synthetic */ C61278a f292613d;

    /* renamed from: e */
    public final /* synthetic */ int f292614e;

    public C99856i(C99860m mVar, String str, C102862b bVar, C61278a aVar, int i) {
        this.f292610a = mVar;
        this.f292611b = str;
        this.f292612c = bVar;
        this.f292613d = aVar;
        this.f292614e = i;
    }

    /* renamed from: a */
    public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
        C13598b0 b0Var;
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            C61926c.m72668M(new C99854g(this.f292611b, this.f292610a, this.f292612c, this.f292613d, bitmap, this.f292614e));
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            C61926c.m72668M(new C99855h(this.f292611b, this.f292610a, this.f292612c, this.f292613d, this.f292614e));
        }
    }
}
