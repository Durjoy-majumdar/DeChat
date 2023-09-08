package bh2;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import gy3.C87413o;
import k80.C108915a;
import o80.C109993a;
import rx3.C13598b0;

/* renamed from: bh2.t */
public final class C104134t extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C104119h f308115d;

    /* renamed from: e */
    public final /* synthetic */ long f308116e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104134t(C104119h hVar, long j) {
        super(0);
        this.f308115d = hVar;
        this.f308116e = j;
    }

    public Object invoke() {
        C108915a aVar = this.f308115d.f308091w;
        if (aVar != null) {
            aVar.mo160053n();
        }
        String str = this.f308115d.f308081m;
        Log.m105924i(str, "mix audio used " + Util.ticksToNow(this.f308116e));
        C109993a aVar2 = this.f308115d.f308093y;
        if (aVar2 != null) {
            aVar2.mo161327e();
        }
        this.f308115d.mo145775g(false);
        return C13598b0.f38549a;
    }
}
