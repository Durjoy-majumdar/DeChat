package eb2;

import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import hb2.C59829j;
import hb2.C59830o;
import te3.C64488kb1;
import xv0.C38857m;

/* renamed from: eb2.e */
public final class C58546e extends C38857m {
    /* renamed from: G1 */
    public void mo58338G1(BallInfo ballInfo) {
    }

    /* renamed from: H */
    public void mo58339H(BallInfo ballInfo) {
    }

    /* renamed from: c2 */
    public void mo58340c2(BallInfo ballInfo) {
        C59830o oVar = C59830o.f170808a;
        StringBuilder sb = new StringBuilder();
        sb.append("onMusicStop, songName:");
        C64488kb1 kb12 = C59830o.f170818k;
        String str = null;
        sb.append(kb12 != null ? kb12.f183904d : null);
        sb.append(", singer:");
        C64488kb1 kb13 = C59830o.f170818k;
        sb.append(kb13 != null ? kb13.f183905e : null);
        Log.m105924i("MicroMsg.Mv.MvChattingDataManger", sb.toString());
        C59830o.f170827t = 2;
        if (!C59830o.f170828u) {
            oVar.mo84788b();
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("onMusicStop, songName:");
        C64488kb1 kb14 = C59829j.f170801c;
        sb4.append(kb14 != null ? kb14.f183904d : null);
        sb4.append(", singer:");
        C64488kb1 kb15 = C59829j.f170801c;
        sb4.append(kb15 != null ? kb15.f183905e : null);
        Log.m105924i("MicroMsg.Mv.MusicMvDataManager", sb4.toString());
        C59829j.f170802d = 2;
        if (!C59829j.f170803e) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("onSessionEnd, songName:");
            C64488kb1 kb16 = C59829j.f170801c;
            sb5.append(kb16 != null ? kb16.f183904d : null);
            sb5.append(", singer:");
            C64488kb1 kb17 = C59829j.f170801c;
            if (kb17 != null) {
                str = kb17.f183905e;
            }
            sb5.append(str);
            Log.m105924i("MicroMsg.Mv.MusicMvDataManager", sb5.toString());
            C59829j.f170799a = true;
            C59829j.f170805g = 0;
            C59829j.f170806h = 0;
        }
    }

    /* renamed from: t5 */
    public void mo61810t5(BallInfo ballInfo) {
        C59830o oVar = C59830o.f170808a;
        StringBuilder sb = new StringBuilder();
        sb.append("onMusicStart, songName:");
        C64488kb1 kb12 = C59830o.f170818k;
        String str = null;
        sb.append(kb12 != null ? kb12.f183904d : null);
        sb.append(", singer:");
        C64488kb1 kb13 = C59830o.f170818k;
        sb.append(kb13 != null ? kb13.f183905e : null);
        Log.m105924i("MicroMsg.Mv.MvChattingDataManger", sb.toString());
        C59830o.f170827t = 1;
        StringBuilder sb4 = new StringBuilder();
        sb4.append("onMusicStart, songName:");
        C64488kb1 kb14 = C59829j.f170801c;
        sb4.append(kb14 != null ? kb14.f183904d : null);
        sb4.append(", singer:");
        C64488kb1 kb15 = C59829j.f170801c;
        if (kb15 != null) {
            str = kb15.f183905e;
        }
        sb4.append(str);
        Log.m105924i("MicroMsg.Mv.MusicMvDataManager", sb4.toString());
        C59829j.f170802d = 1;
    }
}
