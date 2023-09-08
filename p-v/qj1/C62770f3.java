package qj1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import d60.C58124b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;
import te3.C64510l21;

/* renamed from: qj1.f3 */
public final class C62770f3 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ int f178178d;

    /* renamed from: e */
    public final /* synthetic */ int f178179e;

    /* renamed from: f */
    public final /* synthetic */ C62696d3 f178180f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62770f3(int i, int i2, C62696d3 d3Var) {
        super(0);
        this.f178178d = i;
        this.f178179e = i2;
        this.f178180f = d3Var;
    }

    public Object invoke() {
        Class cls = C54991o.class;
        if (this.f178178d == 0 && this.f178179e == 0) {
            C64510l21 l212 = new C64510l21();
            l212.f184023d = 0;
            l212.f184025f = 0;
            ((C54991o) this.f178180f.mo87696x0(cls)).mo75978P4(l212, false, new C62756e3(this.f178180f));
        } else if (((C54991o) this.f178180f.mo87696x0(cls)).mo75999e4()) {
            C56032b z0 = this.f178180f.mo14484z0();
            Context context = this.f178180f.f166287d.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            C56032b.showAlertDialog$default(z0, (Activity) context, "", MMApplicationContext.getContext().getResources().getString(C0966R.string.e1r), "", false, 16, (Object) null);
            if (C61926c.m72696u(((C54991o) this.f178180f.mo87696x0(cls)).f154291a1, 524288)) {
                C62627a3 a3Var = (C62627a3) this.f178180f.mo87687E0(C62627a3.class);
                if (a3Var != null) {
                    a3Var.mo87662Z0();
                }
            } else {
                C58124b.C7172a.m7372a(this.f178180f.f178019p, C58124b.C58125b.FINDER_LIVE_ANCHOR_PAUSE, (Bundle) null, 2, (Object) null);
            }
        } else {
            String str = this.f178180f.f178020q;
            Log.m105920e(str, "handleResumeLiveResp liveState:" + ((C54991o) this.f178180f.mo87696x0(cls)).f154295b1 + '!');
        }
        return C13598b0.f38549a;
    }
}
