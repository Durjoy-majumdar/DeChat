package u03;

import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.plugin.ball.service.C105052s;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import te3.uh4;
import te3.wh4;
import te3.xh4;
import u73.C101987v0;
import uv0.C111237j;

/* renamed from: u03.a */
public class C22577a extends C105052s {
    public C22577a(C111237j jVar) {
        super(jVar);
    }

    /* renamed from: C0 */
    public static void m26341C0(BallInfo ballInfo) {
        if (ballInfo != null) {
            byte[] f = ballInfo.mo149043f("key_context");
            wh4 wh4 = new wh4();
            try {
                wh4.parseFrom(f);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.TopStory.TopStoryFloatBallHelper", e, "handleBallInfoClicked exception:%s", e);
            }
            if (wh4.f64687r.size() > 0) {
                uh4 uh4 = new uh4();
                uh4.f64642i = wh4.f64685p;
                uh4.f64646p = wh4.f64680h;
                xh4 xh4 = wh4.f64687r.get(0);
                uh4.f64645o = xh4;
                String str = xh4.f64729h;
                uh4.f64637d = str;
                uh4.f64639f = wh4.f64678f;
                uh4.f64638e = wh4.f64677e;
                uh4.f64640g = wh4.f64679g;
                uh4.f64641h = wh4.f64681i;
                String str2 = wh4.f64682j;
                uh4.f64648r = str2;
                uh4.f64636A = wh4.f64684o;
                uh4.f64649s = wh4.f64683n;
                uh4.f64644n = wh4.f64686q;
                uh4.f64647q = wh4.f64688s;
                Log.m105925i("MicroMsg.TopStory.TopStoryFloatBallHelper", "handleBallInfoClicked, contextId:%s videoId:%s", str2, str);
                C101987v0.m134280n(MMApplicationContext.getContext(), uh4);
                return;
            }
            Log.m105920e("MicroMsg.TopStory.TopStoryFloatBallHelper", "handleBallInfoClicked, cache video list size == 0");
        }
    }

    /* renamed from: A */
    public void mo35648A(int i, String str) {
        super.mo35648A(i, str);
        getReportInfo().f311717f = 7;
    }

    /* renamed from: D0 */
    public void mo35649D0(uh4 uh4, xh4 xh4) {
        Log.m105925i("MicroMsg.TopStory.TopStoryFloatBallHelper", "updateFloatBallData contextId:%s videoId:%s", uh4.f64648r, xh4.f64729h);
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
        wh4.f64688s = uh4.f64647q;
        wh4.f64687r.add(xh4);
        try {
            mo67998q0(xh4.f64725d);
            mo149074n0("key_context", wh4.toByteArray());
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.TopStory.TopStoryFloatBallHelper", e, "updateFloatBallData exception:%s", e);
        }
        getReportInfo().f311718g = wh4.f64678f;
        getReportInfo().f311719h = xh4.f64729h;
        getReportInfo().f311716e = wh4.f64685p;
        Log.m105919d("MicroMsg.TopStory.TopStoryFloatBallHelper", "updateFloatBallData, searchId:%s vid:%s", wh4.f64678f, xh4.f64729h);
        mo68414O();
    }

    /* renamed from: V */
    public boolean mo35650V() {
        return true;
    }

    /* renamed from: f0 */
    public boolean mo35651f0() {
        return true;
    }
}
