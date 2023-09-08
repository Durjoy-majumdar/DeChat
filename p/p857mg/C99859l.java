package p857mg;

import android.graphics.Bitmap;
import o40.C61926c;
import p278yh.C102862b;
import p855lg.C61278a;
import r60.C101350i;
import rx3.C13598b0;
import t60.C64207e;
import x60.C102564a;

/* renamed from: mg.l */
public final class C99859l<T, R> implements C64207e {

    /* renamed from: a */
    public final /* synthetic */ C99860m f292624a;

    /* renamed from: b */
    public final /* synthetic */ C102862b f292625b;

    /* renamed from: c */
    public final /* synthetic */ C61278a f292626c;

    /* renamed from: d */
    public final /* synthetic */ int f292627d;

    public C99859l(C99860m mVar, C102862b bVar, C61278a aVar, int i) {
        this.f292624a = mVar;
        this.f292625b = bVar;
        this.f292626c = aVar;
        this.f292627d = i;
    }

    /* renamed from: a */
    public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
        C13598b0 b0Var;
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            C61926c.m72668M(new C99857j(this.f292624a, this.f292625b, this.f292626c, bitmap, this.f292627d));
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            C61926c.m72668M(new C99858k(this.f292624a, this.f292625b, this.f292626c, this.f292627d));
        }
    }
}
