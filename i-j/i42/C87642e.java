package i42;

import com.tencent.p014mm.plugin.magicbrush.MBBuildConfig;
import com.tencent.p014mm.sdk.platformtools.Log;
import d42.C86181h;
import d42.C86193x;
import e42.C7594e;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: i42.e */
public final class C87642e extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C87609c<C7594e> f253833d;

    /* renamed from: e */
    public final /* synthetic */ int f253834e;

    /* renamed from: f */
    public final /* synthetic */ boolean f253835f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87642e(C87609c<C7594e> cVar, int i, boolean z) {
        super(0);
        this.f253833d = cVar;
        this.f253834e = i;
        this.f253835f = z;
    }

    public Object invoke() {
        C86193x xVar;
        C86181h hVar;
        String str = this.f253833d.f253746t;
        Log.m105924i(str, "canvas view " + this.f253834e + " first frame rendered");
        MBBuildConfig<T> mBBuildConfig = this.f253833d.f253732f;
        if (mBBuildConfig == null || (hVar = mBBuildConfig.f248376o) == null) {
            int i = this.f253834e;
            boolean z = this.f253835f;
            if (!(mBBuildConfig == null || (xVar = mBBuildConfig.f248375n) == null)) {
                xVar.mo109588c(i, z);
            }
        } else {
            hVar.mo120584c(this.f253834e, this.f253835f);
        }
        return C13598b0.f38549a;
    }
}
