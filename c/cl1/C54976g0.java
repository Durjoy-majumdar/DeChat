package cl1;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fj1.C45795b;
import fy3.C32226l;
import gy3.C87413o;
import j50.C60735a;
import rx3.C13598b0;
import te3.C64894zs0;
import tf0.C64918r1;
import y50.C66505a;

/* renamed from: cl1.g0 */
public final class C54976g0 extends C87413o implements C32226l<Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C45795b f154100d;

    /* renamed from: e */
    public final /* synthetic */ String f154101e;

    /* renamed from: f */
    public final /* synthetic */ C54963d0 f154102f;

    /* renamed from: g */
    public final /* synthetic */ C64894zs0 f154103g;

    /* renamed from: h */
    public final /* synthetic */ C66505a f154104h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54976g0(C45795b bVar, String str, C54963d0 d0Var, C64894zs0 zs02, C66505a aVar) {
        super(1);
        this.f154100d = bVar;
        this.f154101e = str;
        this.f154102f = d0Var;
        this.f154103g = zs02;
        this.f154104h = aVar;
    }

    public Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        Class cls = C55001u.class;
        Class cls2 = C64918r1.class;
        Integer num = ((C54963d0) this.f154100d.mo71262a(C54963d0.class)).f154082y.get(this.f154101e);
        Log.m105924i("MMFinder.LiveLinkMicSlice", "receive accept audience mic msg  enterRoomResp: " + intValue + " linkState: " + num);
        if (num != null && num.intValue() == 3) {
            Log.m105924i("MMFinder.LiveLinkMicSlice", "seesionId:" + this.f154101e + " has closed. skip this accept.");
        } else if (intValue >= 0) {
            ((C64918r1) C86312j.m106911c(cls2)).na0(this.f154102f.f107146d, this.f154103g.f186852e);
            this.f154102f.mo75915W3(this.f154104h);
            C60735a iV = ((C64918r1) C86312j.m106911c(cls2)).mo89057iV();
            if (iV != null) {
                iV.mo85686c0(false);
            }
            C60735a iV2 = ((C64918r1) C86312j.m106911c(cls2)).mo89057iV();
            if (iV2 != null) {
                iV2.mo85684b0(false);
            }
            ((C64918r1) C86312j.m106911c(cls2)).Su0();
        } else {
            ((C64918r1) C86312j.m106911c(cls2)).mo89053fQ(intValue, ((C55001u) this.f154102f.business(cls)).f154419p.f182322q, ((C55001u) this.f154102f.business(cls)).f154420q.f182392d);
        }
        return C13598b0.f38549a;
    }
}
