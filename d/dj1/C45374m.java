package dj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import er1.C58739j4;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedList;
import o40.C61937h;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C50429mo2;
import te3.C51163rv3;
import te3.C51570un0;
import te3.C51713vn0;
import te3.C64273c21;
import te3.C64338e71;
import te3.C64436i61;
import zc1.C66785b;

/* renamed from: dj1.m */
public final class C45374m extends C58286q<C51713vn0> {

    /* renamed from: t */
    public final String f122882t = "Finder.CgiFinderGetLiveInfo";

    /* renamed from: u */
    public C51570un0 f122883u;

    /* renamed from: dj1.m$a */
    public interface C7344a {
        /* renamed from: a */
        void mo8518a(int i, int i2, String str, C51713vn0 vn02);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45374m(long j, int i, String str, C50429mo2 mo22, C7344a aVar) {
        super((C49712hj1) null, 1, (C8480h) null);
        C87412m.m108594g(str, "exportId");
        C51570un0 un02 = new C51570un0();
        this.f122883u = un02;
        un02.f142955d = j;
        un02.f142956e = C66785b.f191882e.mo90662O5();
        this.f122883u.f142959h = C58739j4.m68251e(C58739j4.f168176a, (C64436i61) null, (LinkedList) null, 3, (Object) null);
        C51570un0 un03 = this.f122883u;
        un03.f142957f = i;
        un03.f142958g = str;
        un03.f142960i = mo22;
        Log.m105924i("Finder.CgiFinderGetLiveInfo", "get live info liveId:" + j);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = this.f122883u;
        C51713vn0 vn02 = new C51713vn0();
        vn02.setBaseResponse(new C49966ja());
        vn02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = vn02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/findergetliveinfo";
        bVar.f127069d = 3861;
        mo123453j(bVar.mo72403a());
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        String str2;
        C64338e71 e712;
        C51713vn0 vn02 = (C51713vn0) eu32;
        C87412m.m108594g(vn02, "resp");
        String str3 = this.f122882t;
        Log.m105924i(str3, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
        if (i == 0 && i2 == 0) {
            String str4 = this.f122882t;
            Log.m105924i(str4, "get live info:" + C61937h.m72709h(vn02));
            C64273c21 c212 = vn02.f143572d;
            if (c212 == null || (e712 = c212.f182388Z) == null || (str2 = e712.f182937p) == null) {
                str2 = "";
            }
            String str5 = this.f122882t;
            Log.m105924i(str5, "[saveReplayGuidePageUrl] url = " + str2);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_REPLAY_GUIDE_URL_STRING_SYNC, str2);
        }
    }
}
