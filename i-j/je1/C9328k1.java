package je1;

import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C31543z5;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C51116rj1;
import te3.C51163rv3;
import te3.C51253sj1;

/* renamed from: je1.k1 */
public final class C9328k1 extends C60625c<C51253sj1> {

    /* renamed from: s */
    public final String f29145s;

    /* renamed from: t */
    public C51116rj1 f29146t;

    /* renamed from: u */
    public int f29147u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9328k1(String str, String str2, String str3, C89349b bVar, String str4) {
        super((C49712hj1) null, (C9487b) null, 2, (C8480h) null);
        C87412m.m108594g(str, "nickName");
        C87412m.m108594g(str2, "eventName");
        C87412m.m108594g(str3, SearchIntents.EXTRA_QUERY);
        C87412m.m108594g(str4, "requestId");
        this.f29145s = "Finder.CgiFinderSearchEventUtils";
        C51116rj1 rj12 = new C51116rj1();
        this.f29146t = rj12;
        rj12.f140937d = C46523h2.f125330a.mo71860b(6241, this.f172731j);
        if (C87412m.m108589b(str4, "")) {
            this.f29146t.f140940g = String.valueOf(C31543z5.m39453c());
        } else {
            this.f29146t.f140940g = str4;
        }
        if (!(str3.length() == 0)) {
            this.f29146t.f140939f = str3;
        } else {
            C51116rj1 rj13 = this.f29146t;
            rj13.f140941h = str;
            rj13.f140942i = str2;
        }
        if (bVar != null) {
            this.f29146t.f140938e = bVar;
        }
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = this.f29146t;
        C51253sj1 sj12 = new C51253sj1();
        C49966ja jaVar = new C49966ja();
        sj12.BaseResponse = jaVar;
        jaVar.f135956e = new C51163rv3();
        bVar2.f127067b = sj12;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/findersearchevent";
        bVar2.f127069d = 6241;
        mo123453j(bVar2.mo72403a());
        Log.m105924i("Finder.CgiFinderSearchEventUtils", "nickName: " + str + ", eventName: " + str2 + ", query: " + str3);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C51253sj1) eu32, "resp");
        String str2 = this.f29145s;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9328k1(String str, String str2, String str3, C89349b bVar, String str4, int i, C8480h hVar) {
        this(str, str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : bVar, (i & 16) != 0 ? "" : str4);
    }
}
