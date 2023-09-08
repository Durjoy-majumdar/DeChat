package v03;

import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import d92.C107028a;
import gy3.C87412m;
import k92.C108976d;
import te3.C64459j13;
import te3.uh4;
import te3.wh4;
import te3.xh4;

/* renamed from: v03.a */
public final class C22713a extends C108976d {

    /* renamed from: u */
    public final String f65294u = "MicroMsg.TopStoryMultiTaskHelper";

    public C22713a(C107028a aVar) {
        super(aVar);
    }

    /* renamed from: C */
    public boolean mo35808C() {
        return true;
    }

    /* renamed from: D */
    public void mo35809D(int i, String str) {
        super.mo35809D(i, str);
    }

    /* renamed from: Z */
    public final void mo35810Z(uh4 uh4, xh4 xh4) {
        C87412m.m108594g(uh4, "topStoryVideoContext");
        C87412m.m108594g(xh4, "currentVideoInfo");
        Log.m105925i(this.f65294u, "updateFloatBallData contextId:%s videoId:%s", uh4.f64648r, xh4.f64729h);
        wh4 wh4 = new wh4();
        wh4.f64676d = uh4.f64637d;
        wh4.f64677e = uh4.f64638e;
        if (Util.isNullOrNil(uh4.f64643j)) {
            wh4.f64678f = uh4.f64639f;
        } else {
            wh4.f64678f = uh4.f64643j;
        }
        wh4.f64679g = uh4.f64640g;
        wh4.f64680h = uh4.f64646p;
        wh4.f64682j = uh4.f64648r;
        wh4.f64684o = uh4.f64636A;
        wh4.f64683n = uh4.f64649s;
        wh4.f64681i = uh4.f64641h;
        wh4.f64685p = uh4.f64642i;
        wh4.f64686q = uh4.f64644n;
        wh4.f64688s = xh4.f64721W;
        wh4.f64687r.add(xh4);
        try {
            MultiTaskInfo multiTaskInfo = this.f326418a;
            C64459j13 m2 = multiTaskInfo != null ? multiTaskInfo.mo80305m2() : null;
            if (m2 != null) {
                m2.f183752e = xh4.f64725d;
            }
            MultiTaskInfo multiTaskInfo2 = this.f326418a;
            if (multiTaskInfo2 != null) {
                multiTaskInfo2.field_data = wh4.toByteArray();
            }
            mo160075M();
        } catch (Exception e) {
            Log.printErrStackTrace(this.f65294u, e, "updateFloatBallData exception:%s", e);
        }
    }

    /* renamed from: y */
    public boolean mo35811y() {
        return true;
    }
}
