package dj1;

import cl1.C54979h1;
import cl1.C54991o;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.Log;
import fj1.C45795b;
import gy3.C8480h;
import gy3.C87412m;
import je1.C46523h2;
import o40.C61937h;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import rx3.C13604l;
import sx3.C26236u;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C51163rv3;
import te3.C64409h11;
import te3.C64434i11;

/* renamed from: dj1.l0 */
public final class C58283l0 extends C58286q<C64434i11> {

    /* renamed from: t */
    public final String f166891t;

    /* renamed from: u */
    public C64409h11 f166892u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58283l0(long j, long j2, String str, byte[] bArr, int i, String str2, String str3, String str4, C89349b bVar, int i2, C49712hj1 hj12, String str5, int i3, C8480h hVar) {
        super((C49712hj1) null, 1, (C8480h) null);
        String str6;
        String str7 = str;
        String str8 = str2;
        String str9 = str3;
        C49712hj1 hj13 = hj12;
        int i4 = i3;
        byte[] bArr2 = (i4 & 8) != 0 ? null : bArr;
        String str10 = (i4 & 128) != 0 ? null : str4;
        C89349b bVar2 = (i4 & 256) != 0 ? null : bVar;
        String str11 = (i4 & 2048) != 0 ? null : str5;
        C87412m.m108594g(str7, "anchorUsername");
        C87412m.m108594g(str8, "username");
        C87412m.m108594g(str9, "requestId");
        boolean z = true;
        this.f166891t = "Finder.CgiFinderLiveGetShoppingShelf";
        C64409h11 h112 = new C64409h11();
        this.f166892u = h112;
        h112.f183386f = j;
        h112.f183385e = j2;
        h112.f183388h = str7;
        h112.f183389i = i;
        h112.f183390j = str8;
        h112.f183387g = C89349b.m111674a(bArr2);
        C64409h11 h113 = this.f166892u;
        C46523h2 h2Var = C46523h2.f125330a;
        h113.f183384d = h2Var.mo71859a(4049);
        C64409h11 h114 = this.f166892u;
        h114.f183391n = str9;
        h114.f183392o = str10;
        h114.f183399v = bVar2;
        h114.f183393p = i2;
        C45795b bVar3 = C45795b.f123698n;
        h114.f183398u = (bVar3 == null || (str6 = ((C54991o) bVar3.mo71262a(C54991o.class)).f154203G1) == null) ? "" : str6;
        int i5 = 0;
        if (!(str11 == null || str11.length() == 0)) {
            z = false;
        }
        if (!z) {
            this.f166892u.f183394q = C89349b.m111675b(str11);
        }
        h2Var.mo71865g(this.f166892u.f183384d, C26236u.m33719b(new C13604l(Integer.valueOf(hj13 != null ? hj13.f134675i : i5), Long.valueOf(j2))), (C49712hj1) null);
        C47350c.C47352b bVar4 = new C47350c.C47352b();
        bVar4.f127066a = this.f166892u;
        C64434i11 i112 = new C64434i11();
        i112.setBaseResponse(new C49966ja());
        i112.getBaseResponse().f135956e = new C51163rv3();
        bVar4.f127067b = i112;
        bVar4.f127068c = "/cgi-bin/micromsg-bin/finderlivegetshopshelf";
        bVar4.f127069d = 4049;
        mo123453j(bVar4.mo72403a());
        Log.m105924i("Finder.CgiFinderLiveGetShoppingShelf", "init " + this.f166892u.f183386f + ", " + this.f166892u.f183389i + ", " + this.f166892u.f183388h + ",requestId:" + this.f166892u.f183391n + ",pullScene:" + this.f166892u.f183393p + ",ux_info:" + this.f166892u.f183394q);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C64434i11 i112 = (C64434i11) eu32;
        C87412m.m108594g(i112, "resp");
        String str2 = this.f166891t;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
        if (i == 0 && i2 == 0) {
            String str3 = this.f166891t;
            Log.m105924i(str3, "shopping list result:" + C61937h.m72709h(i112));
            FinderLiveService.f159376d.getClass();
            C56032b bVar = FinderLiveService.f159379g;
            C54979h1 h1Var = bVar != null ? (C54979h1) bVar.business(C54979h1.class) : null;
            if (h1Var != null) {
                String str4 = i112.f183590w;
                if (str4 == null) {
                    str4 = "";
                }
                h1Var.f154121M = str4;
            }
        }
    }
}
