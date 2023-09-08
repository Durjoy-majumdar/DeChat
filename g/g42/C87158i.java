package g42;

import com.tencent.p014mm.plugin.magicbrush.MBBuildConfig;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87413o;
import j42.C87830a;
import rx3.C13598b0;

/* renamed from: g42.i */
public final class C87158i extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C8479f0<C87830a> f252767d;

    /* renamed from: e */
    public final /* synthetic */ MBBuildConfig<?> f252768e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87158i(C8479f0<C87830a> f0Var, MBBuildConfig<?> mBBuildConfig) {
        super(0);
        this.f252767d = f0Var;
        this.f252768e = mBBuildConfig;
    }

    public Object invoke() {
        C87830a aVar = (C87830a) this.f252767d.f27484d;
        if (aVar != null) {
            aVar.mo122299o0(this.f252768e);
        }
        return C13598b0.f38549a;
    }
}
