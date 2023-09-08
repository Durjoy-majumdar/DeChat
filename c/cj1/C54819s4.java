package cj1;

import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import dj1.C58276c;
import gy3.C87412m;
import te3.C48703af0;

/* renamed from: cj1.s4 */
public final class C54819s4 implements C58276c.C58277a {
    /* renamed from: a */
    public void mo75776a(int i, int i2, String str, C48703af0 af02) {
        C87412m.m108594g(af02, "resp");
        C28574j6 j6Var = FinderLiveService.f159364Q0;
        boolean z = j6Var != null ? j6Var.f78440b : true;
        Log.m105924i("Finder.FinderLiveService", "doActivateMic onCgiBack taskFinished:" + z);
        if (!z) {
            C28574j6 j6Var2 = FinderLiveService.f159364Q0;
            if (j6Var2 != null) {
                j6Var2.mo56065a();
            }
            FinderLiveService.f159376d.mo77624a(20000);
        }
    }
}
