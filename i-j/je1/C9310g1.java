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
import rx3.C13604l;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C51163rv3;
import te3.C51829wg1;
import te3.C51970xg1;

/* renamed from: je1.g1 */
public final class C9310g1 extends C60625c<C51970xg1> {

    /* renamed from: s */
    public final String f29092s = "Finder.CgiFinderPoiSearch";

    public C9310g1(String str, String str2) {
        super((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
        C47350c.C47352b bVar = new C47350c.C47352b();
        C51829wg1 wg12 = new C51829wg1();
        wg12.f144036e = str;
        wg12.f144037f = str2;
        C13604l<Float, Float> X0 = ((C62153d) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C62153d.class)).mo9104X0();
        wg12.f144038g = ((Number) X0.f38555d).floatValue();
        wg12.f144039h = ((Number) X0.f38556e).floatValue();
        bVar.f127066a = wg12;
        C51970xg1 xg12 = new C51970xg1();
        xg12.setBaseResponse(new C49966ja());
        xg12.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = xg12;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderpoisearch";
        bVar.f127069d = 5884;
        mo123453j(bVar.mo72403a());
        Log.m105924i("Finder.CgiFinderPoiSearch", "[init] query:" + str + ", finder_username:" + str2);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C51970xg1) eu32, "resp");
        String str2 = this.f29092s;
        Log.m105924i(str2, "[onCgiEnd] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread() + ' ');
    }
}
