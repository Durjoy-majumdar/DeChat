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
import vq1.C52984v;
import zc1.C66785b;

/* renamed from: je1.u0 */
public final class C46537u0 extends C60625c<C51143rr0> {

    /* renamed from: w */
    public static long f125389w;

    /* renamed from: s */
    public final C52984v f125390s;

    /* renamed from: t */
    public final String f125391t = "Finder.CgiFinderLikeFeed";

    /* renamed from: u */
    public C51000qr0 f125392u;

    /* renamed from: v */
    public long f125393v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46537u0(C52984v vVar, C49712hj1 hj12) {
        super(hj12, (C9487b) null, 2, (C8480h) null);
        C87412m.m108594g(vVar, "action");
        this.f125390s = vVar;
        long c = C31543z5.m39453c();
        this.f125393v = c;
        long j = f125389w;
        if (c < j) {
            f125389w = 1 + j;
            this.f125393v = j;
        }
        f125389w = this.f125393v;
        C51000qr0 qr02 = new C51000qr0();
        this.f125392u = qr02;
        C37521f.f99374d.getClass();
        qr02.f140492d = vVar.f147888d;
        C51000qr0 qr03 = this.f125392u;
        qr03.f140499n = vVar.f147889e;
        qr03.f140495g = this.f125393v;
        qr03.f140497i = C66785b.f191882e.mo90662O5();
        C51000qr0 qr04 = this.f125392u;
        qr04.f140498j = vVar.f147892h;
        qr04.f140506u = vVar.f147893i;
        qr04.f140494f = vVar.f147890f ? 3 : 4;
        qr04.f140503r = vVar.f147891g ? 1 : 0;
        C46523h2 h2Var = C46523h2.f125330a;
        qr04.f140500o = h2Var.mo71860b(3710, hj12);
        C51000qr0 qr05 = this.f125392u;
        C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
        long j2 = vVar.f147888d;
        C49842ig0 ig02 = this.f125392u.f140500o;
        int i = 0;
        qr05.f140501p = y0Var.mo83281Cu(j2, ig02 != null ? ig02.f135313e : 0);
        C49842ig0 ig03 = this.f125392u.f140500o;
        h2Var.mo71865g(ig03, C26236u.m33719b(new C13604l(Integer.valueOf(ig03 != null ? ig03.f135313e : i), Long.valueOf(vVar.f147888d))), hj12);
        if (this.f125392u.f140494f == 3) {
            lx4 lx4 = new lx4();
            C51018qv3 qv32 = new C51018qv3();
            C118418g gVar = C118418g.INSTANCE;
            qv32.mo73350k(gVar.bw0("ce_feed_like"));
            lx4.f354116e = qv32;
            C51018qv3 qv33 = new C51018qv3();
            qv33.mo73350k(gVar.mo175821hd());
            lx4.f354117f = qv33;
            C49842ig0 ig04 = this.f125392u.f140500o;
            if (ig04 != null) {
                ig04.f135314f = new C89349b(lx4.toByteArray());
            }
            C117361f.INSTANCE.mo182037oK(540999691, 5);
        }
        Log.m105924i("Finder.CgiFinderLikeFeed", "likeId:" + this.f125393v + " objectId:" + this.f125392u.f140492d + " opType:" + this.f125392u.f140494f + " likeId:" + this.f125392u.f140495g + " username:" + this.f125392u.f140497i + " action:" + vVar.f147890f + ", private:" + vVar.f147891g + " sourceType:" + vVar.f147893i);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = this.f125392u;
        C51143rr0 rr02 = new C51143rr0();
        rr02.setBaseResponse(new C49966ja());
        rr02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = rr02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderlike";
        bVar.f127069d = 3710;
        mo123453j(bVar.mo72403a());
        Log.m105924i("Finder.CgiFinderLikeFeed", "likeId:" + this.f125393v + " CgiFinderLikeComment init " + this.f125392u.f140492d + " and userName " + vVar.f147887c.getUserName() + " nickname " + vVar.f147887c.getNickName() + " totalCount:" + vVar.f147887c.getLikeCount());
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C51143rr0) eu32, "resp");
        String str2 = this.f125391t;
        Log.m105924i(str2, "likeId:" + this.f125393v + " [onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread() + " objectId:" + this.f125392u.f140492d + " opType:" + this.f125392u.f140494f + " likeId:" + this.f125392u.f140495g + " username:" + this.f125392u.f140497i + " action:" + this.f125390s.f147890f);
        C11767a aVar = C11767a.f34453a;
        aVar.mo11664f(i, i2, str);
        aVar.mo11662d(i, i2, MMApplicationContext.getContext().getString(C0966R.string.fo_));
        aVar.mo11663e(i, i2, MMApplicationContext.getContext().getString(C0966R.string.fo9));
    }
}
