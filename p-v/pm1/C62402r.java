package pm1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: pm1.r */
public final class C62402r extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C62399p f177366d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62402r(C62399p pVar) {
        super(0);
        this.f177366d = pVar;
    }

    public Object invoke() {
        C62399p pVar = this.f177366d;
        pVar.getClass();
        int i = -1;
        C62398o oVar = new C62398o(pVar);
        boolean z = false;
        try {
            i = oVar.invoke();
        } catch (Throwable th) {
            Log.m105921e("NearbyLiveItemOnTouchEventAdapter", "safelyInvoke exception", th.getMessage());
        }
        Integer valueOf = Integer.valueOf(((Number) i).intValue());
        if (valueOf.intValue() != -1) {
            z = true;
        }
        if (!z) {
            valueOf = null;
        }
        if (valueOf != null) {
            C61926c.m72668M(new C62401q(this.f177366d, valueOf.intValue()));
        }
        return C13598b0.f38549a;
    }
}
