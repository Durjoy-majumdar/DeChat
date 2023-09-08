package dj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49842ig0;
import te3.C49966ja;
import te3.C51163rv3;
import te3.C51855wn0;
import te3.C51998xn0;

/* renamed from: dj1.x */
public final class C45397x extends C58286q<C51998xn0> {

    /* renamed from: t */
    public final C45398a f122915t;

    /* renamed from: u */
    public final String f122916u = "Finder.CgiFinderLiveCandidate";

    /* renamed from: v */
    public C51855wn0 f122917v;

    /* renamed from: dj1.x$a */
    public interface C45398a {
        /* renamed from: a */
        void mo70901a(int i, int i2, String str, C51998xn0 xn02);
    }

    public C45397x(C49842ig0 ig02, String str, byte[] bArr, byte[] bArr2, C45398a aVar) {
        super((C49712hj1) null, 1, (C8480h) null);
        this.f122915t = aVar;
        C51855wn0 wn02 = new C51855wn0();
        this.f122917v = wn02;
        wn02.f144153d = ig02;
        wn02.f144154e = str;
        wn02.f144156g = C89349b.m111674a(bArr);
        this.f122917v.f144155f = C89349b.m111674a(bArr2);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = this.f122917v;
        C51998xn0 xn02 = new C51998xn0();
        xn02.setBaseResponse(new C49966ja());
        xn02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = xn02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/findergetlivemiccandidatelist";
        bVar.f127069d = 6845;
        mo123453j(bVar.mo72403a());
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C51998xn0 xn02 = (C51998xn0) eu32;
        C87412m.m108594g(xn02, "resp");
        String str2 = this.f122916u;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
        C45398a aVar = this.f122915t;
        if (aVar != null) {
            aVar.mo70901a(i, i2, str, xn02);
        }
    }
}
