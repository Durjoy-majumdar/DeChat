package qj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import java.util.HashMap;
import java.util.Map;
import nk1.C11198f;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: qj1.h8 */
public final class C12439h8 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C12360e8 f35815d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12439h8(C12360e8 e8Var) {
        super(0);
        this.f35815d = e8Var;
    }

    public Object invoke() {
        Log.m105924i("Finder.FinderLiveGiftSendPlugin", "hideGiftSendAgainLayout: curGiftId:" + this.f35815d.f35608r + ", curComboId:" + this.f35815d.f35610t + ", curSongName: " + this.f35815d.f35609s);
        C12360e8 e8Var = this.f35815d;
        Map<String, Boolean> map = e8Var.f35589B;
        String str = e8Var.f35610t;
        if (str == null) {
            str = "";
        }
        ((HashMap) map).put(str, Boolean.TRUE);
        C12360e8 e8Var2 = this.f35815d;
        String str2 = e8Var2.f35608r;
        C61926c.m72668M(new C12599p8(str2 == null ? "" : str2, e8Var2.f35610t, 0, e8Var2, e8Var2.f35609s));
        C12360e8 e8Var3 = this.f35815d;
        e8Var3.f35610t = "";
        e8Var3.f35612v = false;
        e8Var3.f35604R = 0;
        e8Var3.f166287d.animate().alpha(0.0f).setListener(new C12424g8(this.f35815d)).start();
        C12360e8 e8Var4 = this.f35815d;
        C11198f fVar = e8Var4.f35592E;
        if (fVar != null) {
            fVar.mo11284d(e8Var4.f35591D);
        }
        return C13598b0.f38549a;
    }
}
