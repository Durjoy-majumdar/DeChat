package p857mg;

import android.graphics.Bitmap;
import com.tencent.p014mm.vfs.C86013q1;
import fy3.C32224a;
import gy3.C87413o;
import p278yh.C102862b;
import p855lg.C61278a;
import rx3.C13598b0;

/* renamed from: mg.g */
public final class C99854g extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f292599d;

    /* renamed from: e */
    public final /* synthetic */ C99860m f292600e;

    /* renamed from: f */
    public final /* synthetic */ C102862b f292601f;

    /* renamed from: g */
    public final /* synthetic */ C61278a f292602g;

    /* renamed from: h */
    public final /* synthetic */ Bitmap f292603h;

    /* renamed from: i */
    public final /* synthetic */ int f292604i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99854g(String str, C99860m mVar, C102862b bVar, C61278a aVar, Bitmap bitmap, int i) {
        super(0);
        this.f292599d = str;
        this.f292600e = mVar;
        this.f292601f = bVar;
        this.f292602g = aVar;
        this.f292603h = bitmap;
        this.f292604i = i;
    }

    public Object invoke() {
        if (!C86013q1.m106450k(this.f292599d)) {
            C99860m.m130383j(this.f292600e, this.f292601f, this.f292602g, this.f292603h, this.f292604i);
        } else {
            this.f292600e.mo139214l(this.f292602g, this.f292601f, this.f292599d, this.f292603h);
        }
        return C13598b0.f38549a;
    }
}
