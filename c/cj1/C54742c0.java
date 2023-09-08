package cj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import dj1.C58291w0;
import fy3.C32224a;
import gy3.C87413o;
import qj1.C12360e8;
import rx3.C13598b0;

/* renamed from: cj1.c0 */
public final class C54742c0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C54820t f153445d;

    /* renamed from: e */
    public final /* synthetic */ C12360e8.C12371d f153446e;

    /* renamed from: f */
    public final /* synthetic */ String f153447f;

    /* renamed from: g */
    public final /* synthetic */ int f153448g;

    /* renamed from: h */
    public final /* synthetic */ String f153449h;

    /* renamed from: i */
    public final /* synthetic */ C58291w0 f153450i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54742c0(C54820t tVar, C12360e8.C12371d dVar, String str, int i, String str2, C58291w0 w0Var) {
        super(0);
        this.f153445d = tVar;
        this.f153446e = dVar;
        this.f153447f = str;
        this.f153448g = i;
        this.f153449h = str2;
        this.f153450i = w0Var;
    }

    public Object invoke() {
        Log.m105924i(this.f153445d.f153694d, "[WeCoin] doPostGift consumeGift onCancel errorType");
        C12360e8.C12371d dVar = this.f153446e;
        if (dVar != null) {
            C12360e8.C12371d.C12372a.m11940a(dVar, false, -3, C12360e8.C12371d.C12373b.WECOIN, this.f153447f, (Long) null, this.f153448g, this.f153449h, (String) null, this.f153450i, 144, (Object) null);
        }
        return C13598b0.f38549a;
    }
}
