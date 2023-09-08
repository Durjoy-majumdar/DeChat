package je1;

import bl3.C39818r;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import os1.C62153d;
import pe3.C89349b;
import rx3.C13604l;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C50990qo1;
import te3.C51134ro1;
import te3.C51163rv3;

/* renamed from: je1.s1 */
public final class C9375s1 extends C60625c<C51134ro1> {

    /* renamed from: s */
    public final String f29270s = "Finder.CgiFinderPoiSearch";

    public C9375s1(String str, C89349b bVar) {
        super((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        C50990qo1 qo12 = new C50990qo1();
        qo12.f140434f = str;
        qo12.f140435g = bVar;
        C13604l<Float, Float> X0 = ((C62153d) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C62153d.class)).mo9104X0();
        qo12.f140436h = ((Number) X0.f38555d).floatValue();
        qo12.f140437i = ((Number) X0.f38556e).floatValue();
        bVar2.f127066a = qo12;
        C51134ro1 ro12 = new C51134ro1();
        ro12.setBaseResponse(new C49966ja());
        ro12.getBaseResponse().f135956e = new C51163rv3();
        bVar2.f127067b = ro12;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/finderuserpoi";
        bVar2.f127069d = 4035;
        mo123453j(bVar2.mo72403a());
        Log.m105924i("Finder.CgiFinderPoiSearch", "[init] finder_username:" + str);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C51134ro1) eu32, "resp");
        String str2 = this.f29270s;
        Log.m105924i(str2, "[onCgiEnd] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread() + ' ');
    }
}
