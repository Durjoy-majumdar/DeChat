package wy2;

import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C75597w2;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: wy2.k */
public final class C38401k extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f101306d;

    /* renamed from: e */
    public final /* synthetic */ C8479f0<String> f101307e;

    /* renamed from: f */
    public final /* synthetic */ C75597w2.C31525a f101308f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38401k(String str, C8479f0<String> f0Var, C75597w2.C31525a aVar) {
        super(0);
        this.f101306d = str;
        this.f101307e = f0Var;
        this.f101308f = aVar;
    }

    public Object invoke() {
        Log.m105924i("MicroMsg.TextStatus.TextStatusGetContactInterceptor", "[getContact] callback! succ=" + true + ", username=" + this.f101306d + " talker=" + ((String) this.f101307e.f27484d));
        C75597w2.C31525a aVar = this.f101308f;
        if (aVar != null) {
            aVar.mo1109a(this.f101306d, true);
        }
        return C13598b0.f38549a;
    }
}
