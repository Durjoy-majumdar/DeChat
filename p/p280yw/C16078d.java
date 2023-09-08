package p280yw;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86013q1;
import fj2.C45798a;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: yw.d */
public final class C16078d extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f43226d;

    /* renamed from: e */
    public final /* synthetic */ byte[] f43227e;

    /* renamed from: f */
    public final /* synthetic */ boolean f43228f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16078d(String str, byte[] bArr, boolean z) {
        super(0);
        this.f43226d = str;
        this.f43227e = bArr;
        this.f43228f = z;
    }

    public Object invoke() {
        if (C86013q1.m106450k(this.f43226d)) {
            C86013q1.m106447h(this.f43226d);
        }
        int S = C86013q1.m106437S(this.f43226d, this.f43227e);
        if (S == 0) {
            if (this.f43228f) {
                ClipboardHelper.setText(this.f43226d);
                C45798a aVar = C45798a.f123705a;
                Context context = MMApplicationContext.getContext();
                C87412m.m108593f(context, "getContext()");
                aVar.mo71265a(context, this.f43226d, this.f43227e);
            }
            C61926c.m72668M(C16076b.f43224d);
        } else {
            C61926c.m72668M(new C16077c(S));
        }
        return C13598b0.f38549a;
    }
}
