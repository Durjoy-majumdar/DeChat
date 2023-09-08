package p165hr;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;
import p213oh.C11412b;
import p565ir.C60605m;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND})
/* renamed from: hr.r */
public final class C60105r extends C86301e implements C60605m {

    /* renamed from: d */
    public final String f171508d = "MicroMsg.FinderLiveExternalService";

    public void J50() {
        C56032b bVar;
        try {
            FinderLiveService.f159376d.getClass();
            Log.m105924i("Finder.FinderLiveService", "changeToPortraitFromExternal");
            C56032b bVar2 = FinderLiveService.f159379g;
            boolean z = true;
            if (bVar2 == null || !bVar2.isLandscape()) {
                z = false;
            }
            if (z && (bVar = FinderLiveService.f159379g) != null) {
                bVar.forceScreenToPortrait();
            }
        } catch (Throwable th) {
            int i = C11412b.f33577a;
            Log.printErrStackTrace(this.f171508d, th, "Fail to call FinderLiveService.changeToPortraitFromExternal()", new Object[0]);
        }
    }
}
