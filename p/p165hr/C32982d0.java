package p165hr;

import cl1.C54991o;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di3.C86301e;
import ei3.C86522b;
import ft1.C32168b;
import gj1.C32462a;
import gy3.C87412m;
import p151er.C31669r;
import rx3.C36570n;
import te3.C51463ty0;

@C86522b
/* renamed from: hr.d0 */
public final class C32982d0 extends C86301e implements C31669r {
    public C32168b mj0() {
        C32168b bVar = new C32168b();
        bVar.f85519a = C32462a.f86251a.mo58638a();
        bVar.f85520b = C32462a.f86256f;
        C54991o oVar = (C54991o) FinderLiveService.f159376d.mo77630e(C54991o.class);
        C51463ty0 ty02 = oVar != null ? oVar.f154179A1 : null;
        if (ty02 != null) {
            bVar.f85522d = ty02.f142471f;
            bVar.f85521c = ty02.f142469d;
        }
        return bVar;
    }

    /* renamed from: vh */
    public void mo58293vh(String str) {
        C87412m.m108594g(str, "configStr");
        C32462a aVar = C32462a.f86251a;
        boolean encode = ((MultiProcessMMKV) ((C36570n) C32462a.f86254d).getValue()).encode(C32462a.f86255e, str);
        Log.m105924i("Finder.FinderLiveFrameSetDataLoader", "setDebugFrameSetConfig ret:" + encode);
    }
}
