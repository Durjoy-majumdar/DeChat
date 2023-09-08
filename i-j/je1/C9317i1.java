package je1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C50682oh1;
import te3.C50829ph1;
import te3.C51163rv3;
import zc1.C66785b;

/* renamed from: je1.i1 */
public final class C9317i1 extends C60625c<C50829ph1> {

    /* renamed from: s */
    public final String f29108s = "Finder.CgiFinderPoiSearch";

    public C9317i1(int i) {
        super((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
        C47350c.C47352b bVar = new C47350c.C47352b();
        C50682oh1 oh12 = new C50682oh1();
        oh12.f139182f = i;
        oh12.f139181e = C66785b.f191882e.mo90662O5();
        bVar.f127066a = oh12;
        C50829ph1 ph12 = new C50829ph1();
        ph12.setBaseResponse(new C49966ja());
        ph12.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = ph12;
        bVar.f127068c = "/cgi-bin/micromsg-bin/findergetpostprevdata";
        bVar.f127069d = 4139;
        mo123453j(bVar.mo72403a());
        Log.m105924i("Finder.CgiFinderPoiSearch", "[init] dataType:" + i);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C50829ph1) eu32, "resp");
        String str2 = this.f29108s;
        Log.m105924i(str2, "[onCgiEnd] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread() + ' ');
    }
}
