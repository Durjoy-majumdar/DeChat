package z90;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C24565l;
import rx3.C13598b0;

/* renamed from: z90.d */
public final /* synthetic */ class C66755d extends C24565l implements C32224a<C13598b0> {
    public C66755d(Object obj) {
        super(0, obj, C66739c.class, "performNext", "performNext()V", 0);
    }

    public Object invoke() {
        C66739c cVar = (C66739c) this.receiver;
        cVar.getClass();
        Log.m105924i("MaasMultiTemplate.MaasAlbumMultiTemplateOverlayUIC", "performNext music: " + cVar.mo90774n3());
        if (cVar.mo90775o3().f157471f) {
            if (cVar.mo90773K3(cVar.f191788y)) {
                cVar.mo90627i3();
            } else {
                cVar.mo90771I3(false, "");
                cVar.getContext().finish();
            }
        } else if (cVar.mo90774n3() || cVar.mo90773K3(cVar.f191788y)) {
            cVar.mo90627i3();
        } else {
            cVar.mo90770G3();
        }
        return C13598b0.f38549a;
    }
}
