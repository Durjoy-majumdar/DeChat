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

/* renamed from: th0.d */
public final class C101885d extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ImageView f300010d;

    /* renamed from: e */
    public final /* synthetic */ Bitmap f300011e;

    /* renamed from: f */
    public final /* synthetic */ long f300012f;

    /* renamed from: g */
    public final /* synthetic */ String f300013g;

    /* renamed from: h */
    public final /* synthetic */ C98672d f300014h;

    /* renamed from: i */
    public final /* synthetic */ C8479f0<String> f300015i;

    /* renamed from: j */
    public final /* synthetic */ C98124g f300016j;

    /* renamed from: n */
    public final /* synthetic */ boolean f300017n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101885d(ImageView imageView, Bitmap bitmap, long j, String str, C98672d dVar, C8479f0<String> f0Var, C98124g gVar, boolean z) {
        super(0);
        this.f300010d = imageView;
        this.f300011e = bitmap;
        this.f300012f = j;
        this.f300013g = str;
        this.f300014h = dVar;
        this.f300015i = f0Var;
        this.f300016j = gVar;
        this.f300017n = z;
    }

    public Object invoke() {
        this.f300010d.setImageBitmap(this.f300011e);
        ((C99342a) C101880a.f299979d.mo85955a(new C100353d(this.f300012f, this.f300013g, this.f300014h, (String) this.f300015i.f27484d, C101880a.f299977b, this.f300016j))).mo138754i(this.f300010d, this.f300017n);
        return C13598b0.f38549a;
    }
}
