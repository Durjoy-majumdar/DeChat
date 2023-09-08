package w61;

import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82783z0;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C47350c;
import ob0.C89132b;
import te3.C50922q70;
import te3.C51067r70;

/* renamed from: w61.a */
public final class C53083a extends C89132b<C51067r70> {
    public C53083a(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        C50922q70 q702 = new C50922q70();
        q702.f140168d = str;
        bVar.f127066a = q702;
        bVar.f127067b = new C51067r70();
        bVar.f127068c = "/cgi-bin/micromsg-bin/mmemojitextantispam";
        bVar.f127069d = C82783z0.CTRL_INDEX;
        mo123453j(bVar.mo72403a());
        Log.m105924i("MicroMsg.CgiTextAntiSpam", "Check text anti spam " + str);
    }
}
