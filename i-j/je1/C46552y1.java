package je1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89132b;
import pe3.C89349b;
import te3.C49335eu3;
import te3.C49966ja;
import te3.C51163rv3;
import te3.C51851wm0;
import te3.C51994xm0;

/* renamed from: je1.y1 */
public final class C46552y1 extends C89132b<C51994xm0> {
    public C46552y1(String str, int i, C89349b bVar, long j, int i2) {
        C87412m.m108594g(str, "finderUserName");
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        C51851wm0 wm02 = new C51851wm0();
        wm02.f144132e = str;
        wm02.f144133f = i;
        wm02.f144135h = j;
        wm02.f144134g = bVar;
        wm02.f144136i = i2;
        wm02.f144131d = C46523h2.f125330a.mo71859a(3871);
        bVar2.f127066a = wm02;
        C51994xm0 xm02 = new C51994xm0();
        xm02.setBaseResponse(new C49966ja());
        xm02.getBaseResponse().f135956e = new C51163rv3();
        bVar2.f127067b = xm02;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/findergetfeedfavlist ";
        bVar2.f127069d = 3871;
        mo123453j(bVar2.mo72403a());
        StringBuilder sb = new StringBuilder();
        sb.append("CgiGetFinderFeedLikedList init finderUsername=");
        sb.append(str);
        sb.append(" scene=");
        sb.append(i);
        sb.append(" lastBuffer=");
        sb.append(bVar != null);
        Log.m105924i("Finder.CgiGetFinderFeedLikedList", sb.toString());
    }

    /* renamed from: h */
    public void mo10094h(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        Log.m105924i("Finder.CgiGetFinderFeedLikedList", "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " resp=" + ((C51994xm0) eu32) + " thread=" + Thread.currentThread());
    }
}
