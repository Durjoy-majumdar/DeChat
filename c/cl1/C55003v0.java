package cl1;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87413o;
import j50.C60735a;
import rx3.C13598b0;
import tf0.C64918r1;
import y50.C66505a;
import y50.C66514h;
import y50.C66521k0;

/* renamed from: cl1.v0 */
public final class C55003v0 extends C87413o implements C32226l<Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C39981t0 f154432d;

    /* renamed from: e */
    public final /* synthetic */ C66505a f154433e;

    /* renamed from: f */
    public final /* synthetic */ C32226l<Boolean, C13598b0> f154434f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55003v0(C39981t0 t0Var, C66505a aVar, C32226l<? super Boolean, C13598b0> lVar) {
        super(1);
        this.f154432d = t0Var;
        this.f154433e = aVar;
        this.f154434f = lVar;
    }

    public Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        Class cls = C55001u.class;
        Class cls2 = C64918r1.class;
        Log.m105924i("LiveMicIntercomSlice", "startTrtcEnterRoom errCode: " + intValue);
        boolean z = true;
        if (intValue >= 0) {
            ((C64918r1) C86312j.m106911c(cls2)).na0(this.f154432d.f107146d, 1);
            C66514h hVar = C66521k0.f191361a;
            if (hVar != null) {
                hVar.onAcceptLiveMic(this.f154433e);
            }
            C60735a iV = ((C64918r1) C86312j.m106911c(cls2)).mo89057iV();
            if (iV != null) {
                iV.mo85686c0(false);
            }
            C60735a iV2 = ((C64918r1) C86312j.m106911c(cls2)).mo89057iV();
            if (iV2 != null) {
                iV2.mo85684b0(false);
            }
            ((C64918r1) C86312j.m106911c(cls2)).mo89051eE();
        } else {
            ((C64918r1) C86312j.m106911c(cls2)).mo89053fQ(intValue, ((C55001u) this.f154432d.business(cls)).f154419p.f182322q, ((C55001u) this.f154432d.business(cls)).f154420q.f182392d);
        }
        C32226l<Boolean, C13598b0> lVar = this.f154434f;
        if (intValue < 0) {
            z = false;
        }
        lVar.invoke(Boolean.valueOf(z));
        return C13598b0.f38549a;
    }
}
