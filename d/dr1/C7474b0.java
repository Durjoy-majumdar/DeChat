package dr1;

import android.app.Activity;
import android.content.Context;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.ref.Reference;
import jq3.C60905o;
import pf1.C11920q;
import pf1.C62262d0;
import rx3.C13598b0;

/* renamed from: dr1.b0 */
public final class C7474b0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C7471a0 f25692d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7474b0(C7471a0 a0Var) {
        super(0);
        this.f25692d = a0Var;
    }

    public Object invoke() {
        Reference g = AppForegroundDelegate.m161224g();
        if ((g != null ? (Activity) g.get() : null) == null) {
            g = AppForegroundDelegate.INSTANCE.mo174212f();
        }
        Object context = MMApplicationContext.getContext();
        if ((g != null ? (Activity) g.get() : null) != null) {
            context = g.get();
        }
        FinderJumpInfo finderJumpInfo = this.f25692d.f25688d;
        if (finderJumpInfo != null) {
            C62262d0 d0Var = C62262d0.f176978a;
            C87412m.m108593f(context, "context");
            d0Var.mo87320k((Context) context, new C11920q(finderJumpInfo), (C60905o) null);
        }
        return C13598b0.f38549a;
    }
}
