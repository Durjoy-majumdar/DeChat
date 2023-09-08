package iw2;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gw2.C98266k;
import gy3.C87413o;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: iw2.n0 */
public final class C98859n0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ boolean f289792d;

    /* renamed from: e */
    public final /* synthetic */ C98830g0 f289793e;

    /* renamed from: f */
    public final /* synthetic */ int f289794f;

    /* renamed from: g */
    public final /* synthetic */ int f289795g;

    /* renamed from: h */
    public final /* synthetic */ ArrayList<C98266k> f289796h;

    /* renamed from: i */
    public final /* synthetic */ C98266k f289797i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98859n0(boolean z, C98830g0 g0Var, int i, int i2, ArrayList<C98266k> arrayList, C98266k kVar) {
        super(0);
        this.f289792d = z;
        this.f289793e = g0Var;
        this.f289794f = i;
        this.f289795g = i2;
        this.f289796h = arrayList;
        this.f289797i = kVar;
    }

    public Object invoke() {
        if (this.f289792d) {
            String str = this.f289793e.f289726i;
            Log.m105924i(str, "commentChanged, will update row:" + this.f289794f + " col:" + this.f289795g);
            this.f289796h.set(this.f289795g, this.f289797i);
            this.f289793e.f289724g.mo134399g(this.f289794f, this.f289796h);
            this.f289793e.f289724g.mo134396d(this.f289794f, this.f289795g, 1);
            this.f289793e.f289724g.mo134397e();
        }
        return C13598b0.f38549a;
    }
}
