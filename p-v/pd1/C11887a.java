package pd1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import je1.C46523h2;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C51163rv3;
import te3.C51579up0;
import te3.C51722vp0;

/* renamed from: pd1.a */
public final class C11887a extends C60625c<C51722vp0> {

    /* renamed from: s */
    public C51579up0 f34734s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11887a(long j, String str) {
        super((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
        C87412m.m108594g(str, "encryptedTopicEventId");
        C51579up0 up02 = new C51579up0();
        this.f34734s = up02;
        up02.f143008d = C46523h2.f125330a.mo71859a(6277);
        C51579up0 up03 = this.f34734s;
        up03.f143009e = j;
        up03.f143010f = str;
        Log.m105924i("Cgi.FinderGetTopicInfoCgi", "topicId: " + j);
        mo11766s();
    }

    /* renamed from: n */
    public String getKey() {
        return "6277+" + this.f34734s.f143009e + '+' + this.f34734s.f143010f;
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C51722vp0) eu32, "resp");
        Log.m105924i("Cgi.FinderGetTopicInfoCgi", "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
    }

    /* renamed from: s */
    public final void mo11766s() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = this.f34734s;
        C51722vp0 vp02 = new C51722vp0();
        vp02.setBaseResponse(new C49966ja());
        vp02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = vp02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/findergettopicinfo";
        bVar.f127069d = 6277;
        mo123453j(bVar.mo72403a());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11887a(int i, String str) {
        super((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
        C87412m.m108594g(str, "topicName");
        C51579up0 up02 = new C51579up0();
        this.f34734s = up02;
        up02.f143008d = C46523h2.f125330a.mo71859a(6277);
        C51579up0 up03 = this.f34734s;
        up03.f143011g = str;
        up03.f143012h = i;
        Log.m105924i("Cgi.FinderGetTopicInfoCgi", "topicName: " + str);
        mo11766s();
    }
}
