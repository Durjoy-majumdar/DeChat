package mo1;

import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileTabUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import gy3.C87412m;
import java.util.Collection;
import java.util.List;
import je1.C46549x3;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import sx3.C64186f0;

/* renamed from: mo1.e2 */
public final class C10995e2 implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ FinderProfileTabUIC f32705d;

    public C10995e2(FinderProfileTabUIC finderProfileTabUIC) {
        this.f32705d = finderProfileTabUIC;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C86709a0.m107524d().mo123470p(5999, this);
        if (yVar instanceof C46549x3) {
            C46549x3 x3Var = (C46549x3) yVar;
            if (!C87412m.m108589b(x3Var.f125431g, this.f32705d.f160650G) || i != 0) {
                return;
            }
            if (i2 == -1234) {
                Log.m105924i("Finder.FinderProfileTabUIC", "onSceneEnd: add qq music tab MM_ERR_DROP_CGI_BY_BUSINESS");
                FinderProfileTabUIC.m64337d4(this.f32705d);
            } else if (i2 == 0) {
                Collection collection = x3Var.f125435n;
                if (collection == null) {
                    collection = C64186f0.f181907d;
                }
                if (!collection.isEmpty()) {
                    Log.m105924i("Finder.FinderProfileTabUIC", "onSceneEnd: add qq music tab items not empty");
                    FinderProfileTabUIC.m64337d4(this.f32705d);
                    return;
                }
                List list = x3Var.f125435n;
                if (list == null) {
                    list = C64186f0.f181907d;
                }
                if (list.isEmpty()) {
                    Log.m105924i("Finder.FinderProfileTabUIC", "onSceneEnd: remove qq music tab items  empty");
                    FinderProfileTabUIC finderProfileTabUIC = this.f32705d;
                    finderProfileTabUIC.getClass();
                    C61926c.m72668M(new C11011j2(finderProfileTabUIC, false));
                }
            }
        }
    }
}
