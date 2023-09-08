package il1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import dd3.C58256b;
import java.util.List;
import sx3.C110818d0;
import te3.C64234an2;
import te3.C64311db1;
import te3.C64885zm2;

/* renamed from: il1.a6 */
public final class C60343a6 implements C58256b.C58257a {

    /* renamed from: d */
    public final /* synthetic */ C60349b6 f172001d;

    /* renamed from: e */
    public final /* synthetic */ C64234an2 f172002e;

    public C60343a6(C60349b6 b6Var, C64234an2 an22) {
        this.f172001d = b6Var;
        this.f172002e = an22;
    }

    /* renamed from: r2 */
    public final void mo75059r2(String str, List<C64885zm2> list) {
        C64885zm2 zm22;
        if (!this.f172001d.f172017g && list != null && (zm22 = (C64885zm2) C110818d0.m150916N(list)) != null) {
            C64234an2 an22 = this.f172002e;
            C60349b6 b6Var = this.f172001d;
            Log.m105924i("Finder.FinderLivePostLocationWidget", "#requestLocationLikeByUser ready to save: " + str + ' ' + zm22.f186730e + ' ' + zm22.f186729d + " long=" + an22.f182094d + " lat=" + an22.f182095e);
            b6Var.f172018h = true;
            b6Var.f172016f.mo83367f(str, zm22, an22.f182094d, an22.f182095e);
            b6Var.f172016f.mo83371k();
            C64311db1 a = b6Var.f172016f.mo83363a();
            if (Util.isNullOrNil(a != null ? a.f182664g : null)) {
                C64311db1 a2 = b6Var.f172016f.mo83363a();
                if (Util.isNullOrNil(a2 != null ? a2.f182663f : null)) {
                    b6Var.f172016f.mo83372l((C64311db1) null);
                }
            }
        }
    }
}
