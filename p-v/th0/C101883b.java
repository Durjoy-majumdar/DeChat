package th0;

import android.graphics.Bitmap;
import android.widget.ImageView;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87413o;
import l60.C99342a;
import oh0.C100353d;
import p1081gi.C98124g;
import p434ig.C98672d;
import rx3.C13598b0;

/* renamed from: th0.b */
public final class C101883b extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ImageView f299996d;

    /* renamed from: e */
    public final /* synthetic */ Bitmap f299997e;

    /* renamed from: f */
    public final /* synthetic */ long f299998f;

    /* renamed from: g */
    public final /* synthetic */ String f299999g;

    /* renamed from: h */
    public final /* synthetic */ C98672d f300000h;

    /* renamed from: i */
    public final /* synthetic */ C8479f0<String> f300001i;

    /* renamed from: j */
    public final /* synthetic */ C98124g f300002j;

    /* renamed from: n */
    public final /* synthetic */ boolean f300003n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101883b(ImageView imageView, Bitmap bitmap, long j, String str, C98672d dVar, C8479f0<String> f0Var, C98124g gVar, boolean z) {
        super(0);
        this.f299996d = imageView;
        this.f299997e = bitmap;
        this.f299998f = j;
        this.f299999g = str;
        this.f300000h = dVar;
        this.f300001i = f0Var;
        this.f300002j = gVar;
        this.f300003n = z;
    }

    public Object invoke() {
        this.f299996d.setImageBitmap(this.f299997e);
        ((C99342a) C101880a.f299979d.mo85955a(new C100353d(this.f299998f, this.f299999g, this.f300000h, (String) this.f300001i.f27484d, C101880a.f299977b, this.f300002j))).mo138754i(this.f299996d, this.f300003n);
        return C13598b0.f38549a;
    }
}
