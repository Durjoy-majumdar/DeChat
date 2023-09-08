package aj1;

import a14.C53953u0;
import a14.C53973z1;
import cl1.C0680q1;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87413o;
import java.util.concurrent.CancellationException;
import rx3.C13598b0;

/* renamed from: aj1.a */
public final class C54036a extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C54037b f151305d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54036a(C54037b bVar) {
        super(1);
        this.f151305d = bVar;
    }

    public Object invoke(Object obj) {
        C0680q1.C0681a aVar;
        C53953u0 u0Var;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        String str = this.f151305d.f151306j;
        Log.m105924i(str, "checkShowLotteryResult notify close: " + booleanValue);
        if (!(!booleanValue || (aVar = this.f151305d.f151311r) == null || (u0Var = aVar.f1607d) == null)) {
            C53973z1.C53974a.m60623a(u0Var, (CancellationException) null, 1, (Object) null);
        }
        return C13598b0.f38549a;
    }
}
