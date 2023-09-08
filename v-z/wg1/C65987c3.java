package wg1;

import android.content.Context;
import android.os.Bundle;
import cj1.C54785k6;
import cl1.C0700z;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import d60.C58124b;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import nj3.C76912y0;
import rx3.C13598b0;

/* renamed from: wg1.c3 */
public final class C65987c3 extends C87413o implements C32226l<C54785k6, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C65982b3 f189724d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65987c3(C65982b3 b3Var) {
        super(1);
        this.f189724d = b3Var;
    }

    public Object invoke(Object obj) {
        C54785k6 k6Var = (C54785k6) obj;
        C87412m.m108594g(k6Var, "item");
        this.f189724d.hide();
        if (((C54991o) this.f189724d.f189709e.mo71262a(C54991o.class)).mo75963I3()) {
            ((C0700z) this.f189724d.f189709e.mo71262a(C0700z.class)).f1662n.postValue(Boolean.FALSE);
            Bundle bundle = new Bundle();
            C65982b3 b3Var = this.f189724d;
            bundle.putString("PARAM_FINDER_LIVE_SING_SONG_NAME", k6Var.f153566a);
            b3Var.f189711g.f177936g.statusChange(C58124b.C58125b.LIVE_EVENT_SHOW_GIFT_PANEL, bundle);
        } else {
            Context context = this.f189724d.f189708d;
            C76912y0.m92767f(context, context.getResources().getString(C0966R.string.mmk));
        }
        return C13598b0.f38549a;
    }
}
