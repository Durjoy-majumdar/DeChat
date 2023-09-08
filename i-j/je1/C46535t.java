package je1;

import com.tencent.p014mm.sdk.platformtools.Log;
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
import te3.C50695ok0;
import te3.C50842pk0;
import te3.C51018qv3;
import te3.C51163rv3;
import te3.lx4;
import up1.C37521f;
import vq1.C52983e;
import zc1.C66785b;

/* renamed from: je1.t */
public final class C46535t extends C60625c<C50842pk0> {

    /* renamed from: w */
    public static long f125381w;

    /* renamed from: s */
    public final C52983e f125382s;

    /* renamed from: t */
    public final String f125383t = "Finder.CgiFinderFavFeed";

    /* renamed from: u */
    public C50695ok0 f125384u;

    /* renamed from: v */
    public long f125385v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46535t(C52983e eVar, C49712hj1 hj12) {
        super(hj12, (C9487b) null, 2, (C8480h) null);
        C87412m.m108594g(eVar, "action");
        int i = 2;
        this.f125382s = eVar;
        long c = C31543z5.m39453c();
        this.f125385v = c;
        long j = f125381w;
        if (c < j) {
            f125381w = 1 + j;
            this.f125385v = j;
        }
        f125381w = this.f125385v;
        C50695ok0 ok02 = new C50695ok0();
        this.f125384u = ok02;
        C37521f.f99374d.getClass();
        ok02.f139229e = eVar.f147881d;
        C50695ok0 ok03 = this.f125384u;
        ok03.f139231g = eVar.f147882e;
        ok03.f139232h = this.f125385v;
        ok03.f139233i = C66785b.f191882e.mo90662O5();
        C50695ok0 ok04 = this.f125384u;
        ok04.f139230f = eVar.f147883f ? 1 : i;
        C46523h2 h2Var = C46523h2.f125330a;
        ok04.f139228d = h2Var.mo71860b(3715, hj12);
        int i2 = 0;
        this.f125384u.f139234j = ((C58417y0) C86312j.m106911c(C58417y0.class)).mo83281Cu(eVar.f147881d, hj12 != null ? hj12.f134675i : 0);
        C50695ok0 ok05 = this.f125384u;
        ok05.f139235n = eVar.f147886i;
        h2Var.mo71865g(ok05.f139228d, C26236u.m33719b(new C13604l(Integer.valueOf(hj12 != null ? hj12.f134675i : i2), Long.valueOf(eVar.f147881d))), hj12);
        if (this.f125384u.f139230f == 1) {
            lx4 lx4 = new lx4();
            C51018qv3 qv32 = new C51018qv3();
            C118418g gVar = C118418g.INSTANCE;
            qv32.mo73350k(gVar.bw0("ce_feed_fav"));
            lx4.f354116e = qv32;
            C51018qv3 qv33 = new C51018qv3();
            qv33.mo73350k(gVar.mo175821hd());
            lx4.f354117f = qv33;
            C49842ig0 ig02 = this.f125384u.f139228d;
            if (ig02 != null) {
                ig02.f135314f = new C89349b(lx4.toByteArray());
            }
            C117361f.INSTANCE.mo182041q(540999701);
        }
        Log.m105924i("Finder.CgiFinderFavFeed", "likeId:" + this.f125385v + " objectId:" + this.f125384u.f139229e + " opType:" + this.f125384u.f139230f + " likeId:" + this.f125384u.f139232h + " username:" + this.f125384u.f139233i + " action:" + eVar.f147883f + " sourceType:" + eVar.f147886i);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = this.f125384u;
        C50842pk0 pk02 = new C50842pk0();
        pk02.setBaseResponse(new C49966ja());
        pk02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = pk02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderfav";
        bVar.f127069d = 3715;
        mo123453j(bVar.mo72403a());
        Log.m105924i("Finder.CgiFinderFavFeed", "likeId:" + this.f125385v + " CgiFinderLikeComment init " + this.f125384u.f139229e + " and userName " + eVar.f147880c.getUserName() + " nickname " + eVar.f147880c.getNickName() + " totalCount:" + eVar.f147880c.getLikeCount());
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C50842pk0) eu32, "resp");
        String str2 = this.f125383t;
        Log.m105924i(str2, "likeId:" + this.f125385v + " [onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread() + " objectId:" + this.f125384u.f139229e + " opType:" + this.f125384u.f139230f + " likeId:" + this.f125384u.f139232h + " username:" + this.f125384u.f139233i + " action:" + this.f125382s.f147883f);
        C11767a.f34453a.mo11664f(i, i2, str);
    }
}
