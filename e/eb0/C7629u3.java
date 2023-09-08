package eb0;

import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import gy3.C87412m;
import ob0.C47350c;
import ob0.C89132b;
import te3.C50039ju2;
import te3.C50181ku2;

/* renamed from: eb0.u3 */
public final class C7629u3 extends C89132b<C50181ku2> {
    public C7629u3(String str, String str2) {
        C87412m.m108594g(str, SearchIntents.EXTRA_QUERY);
        C87412m.m108594g(str2, "region");
        C50039ju2 ju22 = new C50039ju2();
        ju22.f136341e = str;
        ju22.f136342f = str2;
        ju22.f136340d = C86709a0.m107523b().mo121110g();
        Log.m105924i("MicroMsg.MMVisionRelatedWordCgi", "req >> " + ju22.f136341e + ", " + ju22.f136342f + ", " + ju22.f136340d);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = ju22;
        bVar.f127067b = new C50181ku2();
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        bVar.f127068c = "/cgi-bin/mmbiz-bin/mmvision_relatedword";
        bVar.f127069d = 4083;
        mo123453j(bVar.mo72403a());
    }
}
