package qg1;

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
import te3.C49842ig0;
import te3.C49966ja;
import te3.C50097k91;
import te3.C50231l91;
import te3.C51163rv3;

/* renamed from: qg1.a0 */
public final class C12217a0 extends C60625c<C50231l91> {

    /* renamed from: s */
    public final int f35279s;

    /* renamed from: t */
    public final String f35280t = "Finder.CgiFinderLiveSwitchIdentity";

    /* renamed from: u */
    public C12218a f35281u;

    /* renamed from: v */
    public C50097k91 f35282v;

    /* renamed from: qg1.a0$a */
    public interface C12218a {
        /* renamed from: a */
        void mo11951a(int i, int i2, String str);

        /* renamed from: b */
        void mo11952b(C50231l91 l912);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12217a0(String str, int i, C12218a aVar) {
        super((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
        C87412m.m108594g(str, "finderUserName");
        Integer num = null;
        this.f35279s = i;
        this.f35281u = aVar;
        C50097k91 k912 = new C50097k91();
        this.f35282v = k912;
        k912.f136625f = str;
        k912.f136624e = i;
        k912.f136623d = C46523h2.f125330a.mo71859a(4163);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = this.f35282v;
        C50231l91 l912 = new C50231l91();
        l912.setBaseResponse(new C49966ja());
        l912.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = l912;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderliveswitchidentity";
        bVar.f127069d = 4163;
        mo123453j(bVar.mo72403a());
        StringBuilder sb = new StringBuilder();
        sb.append("init finder_username:");
        sb.append(this.f35282v.f136625f);
        sb.append(",target_alias_role:");
        sb.append(this.f35282v.f136624e);
        sb.append(",live_identity:");
        C49842ig0 ig02 = this.f35282v.f136623d;
        sb.append(ig02 != null ? Integer.valueOf(ig02.f135318j) : num);
        Log.m105924i("Finder.CgiFinderLiveSwitchIdentity", sb.toString());
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C50231l91 l912 = (C50231l91) eu32;
        C87412m.m108594g(l912, "resp");
        String str2 = this.f35280t;
        Log.m105924i(str2, "[onCgiEnd] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
        if (i == 0 && i2 == 0) {
            String str3 = this.f35280t;
            Log.m105924i(str3, "set finder live alias role:" + this.f35279s);
            C12218a aVar = this.f35281u;
            if (aVar != null) {
                aVar.mo11952b(l912);
                return;
            }
            return;
        }
        C12218a aVar2 = this.f35281u;
        if (aVar2 != null) {
            aVar2.mo11951a(i, i2, str);
        }
    }
}
