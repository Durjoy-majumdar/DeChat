package je1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import dp1.C58417y0;
import eb0.C31543z5;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import jm2.C117361f;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import ot1.C11767a;
import pe3.C89349b;
import rx3.C13604l;
import sx3.C26236u;
import tc2.C118418g;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49842ig0;
import te3.C49966ja;
import te3.C51000qr0;
import te3.C51018qv3;
import te3.C51143rr0;
import te3.C51163rv3;
import te3.lx4;
import up1.C37521f;
import vq1.C52981a0;
import zc1.C66785b;

/* renamed from: je1.t0 */
public final class C46536t0 extends C60625c<C51143rr0> {

    /* renamed from: u */
    public static long f125386u;

    /* renamed from: s */
    public final String f125387s = "Finder.CgiFinderLikeComment";

    /* renamed from: t */
    public C51000qr0 f125388t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46536t0(C52981a0 a0Var, C49712hj1 hj12) {
        super(hj12, (C9487b) null, 2, (C8480h) null);
        C87412m.m108594g(a0Var, "action");
        int i = 2;
        long c = C31543z5.m39453c();
        long j = f125386u;
        if (c < j) {
            f125386u = 1 + j;
            c = j;
        }
        f125386u = c;
        C51000qr0 qr02 = new C51000qr0();
        this.f125388t = qr02;
        C37521f.f99374d.getClass();
        qr02.f140492d = a0Var.f147871c;
        C51000qr0 qr03 = this.f125388t;
        qr03.f140499n = a0Var.f147872d;
        qr03.f140493e = a0Var.f147873e.mo89532o2().commentId;
        C51000qr0 qr04 = this.f125388t;
        qr04.f140495g = c;
        if (a0Var.f147875g == 1) {
            qr04.f140497i = C66785b.f191882e.mo90662O5();
        }
        C51000qr0 qr05 = this.f125388t;
        C46523h2 h2Var = C46523h2.f125330a;
        qr05.f140500o = h2Var.mo71860b(3710, hj12);
        C51000qr0 qr06 = this.f125388t;
        qr06.f140498j = a0Var.f147875g;
        qr06.f140494f = a0Var.f147874f ? 1 : i;
        C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
        long j2 = a0Var.f147871c;
        C49842ig0 ig02 = this.f125388t.f140500o;
        int i2 = 0;
        qr06.f140501p = y0Var.mo83281Cu(j2, ig02 != null ? ig02.f135313e : 0);
        C49842ig0 ig03 = this.f125388t.f140500o;
        h2Var.mo71865g(ig03, C26236u.m33719b(new C13604l(Integer.valueOf(ig03 != null ? ig03.f135313e : i2), Long.valueOf(a0Var.f147871c))), hj12);
        if (this.f125388t.f140494f == 1) {
            lx4 lx4 = new lx4();
            C51018qv3 qv32 = new C51018qv3();
            C118418g gVar = C118418g.INSTANCE;
            qv32.mo73350k(gVar.bw0("ce_feed_comment_like"));
            lx4.f354116e = qv32;
            C51018qv3 qv33 = new C51018qv3();
            qv33.mo73350k(gVar.mo175821hd());
            lx4.f354117f = qv33;
            C49842ig0 ig04 = this.f125388t.f140500o;
            if (ig04 != null) {
                ig04.f135314f = new C89349b(lx4.toByteArray());
            }
            C117361f.INSTANCE.mo182037oK(540999690, 4);
        }
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = this.f125388t;
        C51143rr0 rr02 = new C51143rr0();
        rr02.setBaseResponse(new C49966ja());
        rr02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = rr02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderlike";
        bVar.f127069d = 3710;
        mo123453j(bVar.mo72403a());
        Log.m105924i("Finder.CgiFinderLikeComment", "CgiFinderLikeComment init " + this.f125388t.f140492d + " and userName " + this.f125388t.f140497i + " comment:" + a0Var.f147873e);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C51143rr0) eu32, "resp");
        String str2 = this.f125387s;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
        C11767a aVar = C11767a.f34453a;
        aVar.mo11664f(i, i2, str);
        aVar.mo11662d(i, i2, MMApplicationContext.getContext().getString(C0966R.string.ddm));
        aVar.mo11663e(i, i2, MMApplicationContext.getContext().getString(C0966R.string.ddl));
    }
}
