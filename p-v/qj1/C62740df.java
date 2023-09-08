package qj1;

import a14.C53973z1;
import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import f50.C58924d;
import fh1.C59062p2;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.concurrent.CancellationException;
import p50.C62197e;
import ph1.C62288c;
import ph1.C62291f;
import ph1.C62294j;
import ph1.C62297m;
import rx3.C13598b0;

/* renamed from: qj1.df */
public final class C62740df extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C63170ze f178115d;

    /* renamed from: e */
    public final /* synthetic */ boolean f178116e;

    /* renamed from: f */
    public final /* synthetic */ C59062p2 f178117f;

    /* renamed from: g */
    public final /* synthetic */ C62297m f178118g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62740df(C63170ze zeVar, boolean z, C59062p2 p2Var, C62297m mVar) {
        super(1);
        this.f178115d = zeVar;
        this.f178116e = z;
        this.f178117f = p2Var;
        this.f178118g = mVar;
    }

    public Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C53973z1 z1Var = this.f178115d.f179246t;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        this.f178115d.mo88089Z0();
        C63170ze zeVar = this.f178115d;
        zeVar.f179247u = false;
        C58924d c1 = zeVar.mo88091c1();
        if (c1 != null) {
            c1.setPlayListener(this.f178115d.mo88090a1());
        }
        String str = this.f178115d.f179243q;
        Log.m105924i(str, "switchInLiveRoom error: " + booleanValue + " oriIsSupportNestScroll: " + this.f178116e);
        C59062p2 p2Var = this.f178117f;
        if (p2Var != null) {
            p2Var.mo84273K3(false);
        }
        C62297m mVar = this.f178118g;
        if (mVar instanceof C62291f) {
            Log.m105924i(this.f178115d.f179243q, "switchInLiveRoom: FinderFluentSwitchLiveDirector");
            int i = ((C62291f) this.f178118g).mo84321f().f177092d;
            int i2 = ((C62291f) this.f178118g).mo84321f().f177093e;
            C62197e a1 = this.f178115d.mo88090a1();
            if (a1 != null) {
                a1.f176825b1 = i;
            }
            C62197e a15 = this.f178115d.mo88090a1();
            if (a15 != null) {
                a15.f176826c1 = i2;
            }
            C62197e a16 = this.f178115d.mo88090a1();
            if (a16 != null) {
                a16.f176827d1 = (i == 0 || i2 == 0) ? 0.0f : (((float) i) * 1.0f) / ((float) i2);
            }
        } else if (mVar instanceof C62288c) {
            Log.m105924i(this.f178115d.f179243q, "switchInLiveRoom: FinderFluentSwitchImageDirector");
            if (booleanValue) {
                C58924d c15 = this.f178115d.mo88091c1();
                if (c15 != null) {
                    c15.stopPlay(true);
                }
                C58924d c16 = this.f178115d.mo88091c1();
                if (c16 != null) {
                    c16.mo84115f(((C62288c) this.f178118g).f177064e.mo89087A().f177067j, 1, ((C62288c) this.f178118g).f177064e.mo89087A().f177069l);
                }
                return C13598b0.f38549a;
            }
        }
        Log.m105924i(this.f178115d.f179243q, "switchInLiveRoom statusChange");
        Bundle bundle = new Bundle();
        C62294j f = this.f178118g.mo84321f();
        C87412m.m108591d(f);
        bundle.putInt("EVT_PARAM1", f.f177092d);
        C62294j f2 = this.f178118g.mo84321f();
        C87412m.m108591d(f2);
        bundle.putInt("EVT_PARAM2", f2.f177093e);
        this.f178115d.f179242p.statusChange(C58124b.C58125b.LIVE_STATUS_RESOLUTION, bundle);
        return C13598b0.f38549a;
    }
}
