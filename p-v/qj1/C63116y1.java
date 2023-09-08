package qj1;

import al1.C54130j;
import android.os.Bundle;
import cl1.C54963d0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import nj3.C76912y0;
import o40.C61926c;
import qg1.C47836x;
import rx3.C13598b0;
import te3.C50639o61;

/* renamed from: qj1.y1 */
public final class C63116y1 implements C47836x.C47837a {

    /* renamed from: a */
    public final /* synthetic */ C63068w1 f179108a;

    /* renamed from: qj1.y1$a */
    public static final class C63117a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C63068w1 f179109d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63117a(C63068w1 w1Var) {
            super(0);
            this.f179109d = w1Var;
        }

        public Object invoke() {
            this.f179109d.mo88004a1();
            List<C54130j> list = ((C54963d0) this.f179109d.mo87696x0(C54963d0.class)).f154071n;
            C87412m.m108593f(list, "business(LiveLinkMicSlic…ass.java).linkMicUserList");
            C61926c.m72700y(list, C63099x1.f179059d);
            return C13598b0.f38549a;
        }
    }

    public C63116y1(C63068w1 w1Var) {
        this.f179108a = w1Var;
    }

    /* renamed from: a */
    public void mo72580a(int i, int i2, String str, C50639o61 o612) {
        C87412m.m108594g(o612, "resp");
        String str2 = this.f179108a.f178988q;
        Log.m105924i(str2, "launchRandomMatch: errType=" + i + ", errCode=" + i2 + ", errMsg=" + str);
        C63068w1 w1Var = this.f179108a;
        w1Var.f178986J = false;
        if (i == 0 && i2 == 0) {
            C58124b bVar = w1Var.f178987p;
            C58124b.C58125b bVar2 = C58124b.C58125b.FINDER_LIVE_LINK_MIC_RANDOM_PK;
            Bundle bundle = new Bundle();
            bundle.putByteArray("PARAM_FINDER_LIVE_RANDOM_MATCH_LINK_MIC_CONTACT_LIST", o612.toByteArray());
            C13598b0 b0Var = C13598b0.f38549a;
            bVar.statusChange(bVar2, bundle);
            C61926c.m72668M(new C63117a(this.f179108a));
            return;
        }
        C76912y0.makeText(w1Var.f166287d.getContext(), (CharSequence) this.f179108a.f166287d.getContext().getString(C0966R.string.drx), 0).show();
    }
}
