package dj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import je1.C46523h2;
import kt1.C46744d;
import o40.C61926c;
import o40.C61937h;
import ob0.C117747y;
import ob0.C47350c;
import ok1.C62042e;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49842ig0;
import te3.C49966ja;
import te3.C50189kx0;
import te3.C51163rv3;
import te3.C51483u21;
import te3.C51633v21;
import te3.C64479jx0;

/* renamed from: dj1.a0 */
public final class C58271a0 extends C58286q<C50189kx0> {

    /* renamed from: v */
    public static final /* synthetic */ int f166853v = 0;

    /* renamed from: t */
    public final String f166854t = "CgiFinderLiveCreateLottery";

    /* renamed from: u */
    public C64479jx0 f166855u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58271a0(C58274b0 b0Var) {
        super((C49712hj1) null, 1, (C8480h) null);
        C87412m.m108594g(b0Var, "params");
        String str = null;
        C64479jx0 jx02 = new C64479jx0();
        this.f166855u = jx02;
        jx02.f183844e = b0Var.f166859a;
        jx02.f183845f = b0Var.f166860b;
        jx02.f183846g = C61926c.m72671P(b0Var.f166861c);
        C64479jx0 jx03 = this.f166855u;
        jx03.f183847h = b0Var.f166862d;
        jx03.f183848i = b0Var.f166863e;
        C51483u21 u212 = new C51483u21();
        u212.f142563d = b0Var.f166864f;
        u212.f142564e = b0Var.f166865g;
        jx03.f183849j = u212;
        C64479jx0 jx04 = this.f166855u;
        jx04.f183850n = b0Var.f166867i;
        jx04.f183851o = b0Var.f166866h;
        C49842ig0 a = C46523h2.f125330a.mo71859a(6645);
        if (C62042e.f176370a.mo87027N0()) {
            a.f135318j = 3;
        }
        jx04.f183843d = a;
        C64479jx0 jx05 = this.f166855u;
        jx05.f183852p = b0Var.f166861c;
        jx05.f183853q = b0Var.f166868j;
        jx05.f183854r = b0Var.f166869k;
        jx05.f183855s = b0Var.f166870l;
        jx05.f183856t = b0Var.f166871m;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = jx05;
        C50189kx0 kx02 = new C50189kx0();
        kx02.setBaseResponse(new C49966ja());
        kx02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = kx02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderlivecreatelottery";
        bVar.f127069d = 6645;
        mo123453j(bVar.mo72403a());
        StringBuilder sb = new StringBuilder();
        sb.append("FinderLiveLottery,init liveId:");
        sb.append(this.f166855u.f183844e);
        sb.append(",objectId:");
        sb.append(this.f166855u.f183845f);
        sb.append(",nonceId:");
        sb.append(this.f166855u.f183852p);
        sb.append(",lotteryDuration:");
        sb.append(this.f166855u.f183847h);
        sb.append(",lotteryDescription:");
        sb.append(this.f166855u.f183848i);
        sb.append(",lotteryAttendType:");
        C51483u21 u213 = this.f166855u.f183849j;
        sb.append(u213 != null ? Integer.valueOf(u213.f142563d) : null);
        sb.append(",attendWording:");
        C51483u21 u214 = this.f166855u.f183849j;
        sb.append(u214 != null ? u214.f142564e : null);
        sb.append(",lotteryWinnerCnt:");
        sb.append(this.f166855u.f183850n);
        sb.append(",opType:");
        sb.append(this.f166855u.f183851o);
        sb.append(",setting_flag:");
        sb.append(this.f166855u.f183853q);
        sb.append(",claim_method:");
        C51633v21 v212 = this.f166855u.f183855s;
        sb.append(v212 != null ? Integer.valueOf(v212.f143256d) : null);
        sb.append('-');
        C51633v21 v213 = this.f166855u.f183855s;
        sb.append(v213 != null ? v213.f143257e : str);
        sb.append(",lottery_method_id:");
        sb.append(this.f166855u.f183856t);
        Log.m105924i("CgiFinderLiveCreateLottery", sb.toString());
    }

    /* renamed from: M */
    public C46744d mo8509M() {
        return C46744d.Enable;
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C50189kx0 kx02 = (C50189kx0) eu32;
        C87412m.m108594g(kx02, "resp");
        String str2 = this.f166854t;
        Log.m105924i(str2, "FinderLiveLottery [onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread() + ",result:" + C61937h.m72709h(kx02));
    }
}
