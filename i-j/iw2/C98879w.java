package iw2;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gw2.C98266k;
import gy3.C87413o;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: iw2.w */
public final class C98879w extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ boolean f289849d;

    /* renamed from: e */
    public final /* synthetic */ C98864r f289850e;

    /* renamed from: f */
    public final /* synthetic */ int f289851f;

    /* renamed from: g */
    public final /* synthetic */ int f289852g;

    /* renamed from: h */
    public final /* synthetic */ ArrayList<C98266k> f289853h;

    /* renamed from: i */
    public final /* synthetic */ C98266k f289854i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98879w(boolean z, C98864r rVar, int i, int i2, ArrayList<C98266k> arrayList, C98266k kVar) {
        super(0);
        this.f289849d = z;
        this.f289850e = rVar;
        this.f289851f = i;
        this.f289852g = i2;
        this.f289853h = arrayList;
        this.f289854i = kVar;
    }

    public Object invoke() {
        if (this.f289849d) {
            String str = this.f289850e.f289805h;
            Log.m105924i(str, "commentChanged, will update row:" + this.f289851f + " col:" + this.f289852g);
            this.f289853h.set(this.f289852g, this.f289854i);
            this.f289850e.f289802e.mo134399g(this.f289851f, this.f289853h);
            this.f289850e.f289802e.mo134396d(this.f289851f, this.f289852g, 1);
            this.f289850e.f289802e.mo134397e();
        }
        return C13598b0.f38549a;
    }
}
