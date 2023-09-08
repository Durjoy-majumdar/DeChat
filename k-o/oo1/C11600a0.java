package oo1;

import android.view.View;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import di3.C86312j;
import dp1.C58413v0;
import dp1.C58417y0;
import dp1.C7435f2;
import gy3.C87412m;
import org.json.JSONObject;
import rs1.C13442s8;
import te3.C64586nn1;
import zp3.C23555k;

/* renamed from: oo1.a0 */
public final class C11600a0 extends C23555k.C23562d {

    /* renamed from: a */
    public final /* synthetic */ C11697z f34005a;

    public C11600a0(C11697z zVar) {
        this.f34005a = zVar;
    }

    /* renamed from: b */
    public void mo53b(View view, long j, long j2, boolean z) {
        Class cls = FinderCommonFeatureService.class;
        C87412m.m108594g(view, "view");
        if (z) {
            ((C58417y0) C86312j.m106911c(C58417y0.class)).vy0(5, 1, "");
            C64586nn1 R5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77246R5("FinderProfileBanner");
            C55718s0 G5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77227G5("FinderProfileBanner");
            C11697z zVar = this.f34005a;
            if (!(G5 == null || R5 == null)) {
                C58413v0.m67781i(C58413v0.f167346a, "3", G5, R5, 1, zVar.f34258b, 0, (String) null, 0, 0, 480, (Object) null);
            }
            C11697z zVar2 = this.f34005a;
            zVar2.getClass();
            C7435f2 f2Var = C7435f2.f25626a;
            C13442s8 f = C13442s8.f38060Q0.mo12873f(zVar2.f34257a);
            f2Var.mo8577a(f != null ? f.mo12861q3() : null, "red_packet_make", 0, (JSONObject) null);
        }
    }
}
