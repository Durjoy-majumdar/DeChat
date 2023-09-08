package iw2;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gw2.C98266k;
import gy3.C87413o;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: iw2.l */
public final class C98851l extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ boolean f289777d;

    /* renamed from: e */
    public final /* synthetic */ C98820f f289778e;

    /* renamed from: f */
    public final /* synthetic */ int f289779f;

    /* renamed from: g */
    public final /* synthetic */ int f289780g;

    /* renamed from: h */
    public final /* synthetic */ ArrayList<C98266k> f289781h;

    /* renamed from: i */
    public final /* synthetic */ C98266k f289782i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98851l(boolean z, C98820f fVar, int i, int i2, ArrayList<C98266k> arrayList, C98266k kVar) {
        super(0);
        this.f289777d = z;
        this.f289778e = fVar;
        this.f289779f = i;
        this.f289780g = i2;
        this.f289781h = arrayList;
        this.f289782i = kVar;
    }

    public Object invoke() {
        if (this.f289777d) {
            String str = this.f289778e.f289690h;
            Log.m105924i(str, "commentChanged, will update row:" + this.f289779f + " col:" + this.f289780g);
            this.f289781h.set(this.f289780g, this.f289782i);
            this.f289778e.f289689g.mo134399g(this.f289779f, this.f289781h);
            this.f289778e.f289689g.mo134396d(this.f289779f, this.f289780g, 1);
            this.f289778e.f289689g.mo134397e();
        }
        return C13598b0.f38549a;
    }
}
