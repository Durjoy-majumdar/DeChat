package jb2;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import dp1.C58417y0;
import eb0.C31543z5;
import gy3.C8480h;
import gy3.C87412m;
import je1.C46523h2;
import ob0.C11385n;
import ob0.C47350c;
import ot1.C11767a;
import pe3.C47465a;
import rx3.C13604l;
import sx3.C26236u;
import te3.C49712hj1;
import te3.C49842ig0;
import te3.C51000qr0;
import te3.C51143rr0;
import zc1.C66785b;

/* renamed from: jb2.j */
public final class C46461j extends C46455a {

    /* renamed from: p */
    public static long f125158p;

    /* renamed from: i */
    public C11385n f125159i;

    /* renamed from: j */
    public final C47350c f125160j;

    /* renamed from: n */
    public C51000qr0 f125161n;

    /* renamed from: o */
    public long f125162o = C31543z5.m39453c();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46461j(long j, String str, boolean z) {
        super(0, 1, (C8480h) null);
        C87412m.m108594g(str, "finderNonceId");
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 3710;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderlike";
        bVar.f127066a = new C51000qr0();
        bVar.f127067b = new C51143rr0();
        C47350c a = bVar.mo72403a();
        this.f125160j = a;
        long j2 = this.f125162o;
        long j3 = f125158p;
        if (j2 < j3) {
            f125158p = 1 + j3;
            this.f125162o = j3;
        }
        f125158p = this.f125162o;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLikeRequest");
        C51000qr0 qr02 = (C51000qr0) aVar;
        this.f125161n = qr02;
        qr02.f140492d = j;
        qr02.f140493e = 0;
        qr02.f140494f = z ? 3 : 4;
        qr02.f140495g = this.f125162o;
        qr02.f140502q = C66785b.f191882e.mo90662O5();
        C51000qr0 qr03 = this.f125161n;
        if (qr03 != null) {
            qr03.f140498j = 91;
        }
        if (qr03 != null) {
            qr03.f140499n = str;
        }
        if (qr03 != null) {
            qr03.f140502q = "";
        }
        if (qr03 != null) {
            qr03.f140503r = 0;
        }
        if (qr03 != null) {
            qr03.f140504s = 0;
        }
        C46523h2 h2Var = C46523h2.f125330a;
        C49842ig0 a2 = h2Var.mo71859a(3710);
        a2.f135313e = 91;
        a2.f135315g = 1;
        C51000qr0 qr04 = this.f125161n;
        if (qr04 != null) {
            qr04.f140500o = a2;
        }
        if (qr04 != null) {
            qr04.f140501p = ((C58417y0) C86312j.m106911c(C58417y0.class)).mo83281Cu(j, 91);
        }
        C51000qr0 qr05 = this.f125161n;
        if (qr05 != null) {
            h2Var.mo71865g(qr05.f140500o, C26236u.m33719b(new C13604l(91, Long.valueOf(j))), (C49712hj1) null);
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C87412m.m108594g(gVar, "dispatcher");
        C87412m.m108594g(nVar, "callback");
        this.f125159i = nVar;
        return dispatch(gVar, this.f125160j, this);
    }

    public int getType() {
        return 3710;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        super.onGYNetEnd(i, i2, i3, str, uVar, bArr);
        Log.m105925i("MicroMsg.Mv.NetSceneMusicMvMVFinderLike", "netId %d | errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            C47465a aVar = this.f125160j.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLikeResponse");
            C51143rr0 rr02 = (C51143rr0) aVar;
            C11385n nVar = this.f125159i;
            if (nVar != null) {
                nVar.onSceneEnd(i2, i3, str, this);
            }
            C11767a aVar2 = C11767a.f34453a;
            aVar2.mo11664f(i2, i3, str);
            String string = MMApplicationContext.getContext().getString(C0966R.string.fo_);
            C87412m.m108593f(string, "getContext().getString(R…_failed_of_blacklist_new)");
            aVar2.mo11662d(i2, i3, string);
            String string2 = MMApplicationContext.getContext().getString(C0966R.string.fo9);
            C87412m.m108593f(string2, "getContext().getString(R…_failed_not_realname_new)");
            aVar2.mo11663e(i2, i3, string2);
            return;
        }
        C11385n nVar2 = this.f125159i;
        if (nVar2 != null) {
            nVar2.onSceneEnd(i2, i3, str, this);
        }
    }
}
