package je1;

import com.google.android.gms.actions.SearchIntents;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import jp3.C9487b;
import ob0.C47350c;
import pe3.C89349b;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C50809pc1;
import te3.C50942qc1;
import te3.C51163rv3;

/* renamed from: je1.c1 */
public final class C46512c1 extends C60625c<C50942qc1> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46512c1(String str, String str2, C89349b bVar, int i, C49712hj1 hj12) {
        super(hj12, (C9487b) null, 2, (C8480h) null);
        C87412m.m108594g(str, SearchIntents.EXTRA_QUERY);
        C87412m.m108594g(str2, "requestId");
        C50809pc1 pc12 = new C50809pc1();
        pc12.f139694d = C46523h2.f125330a.mo71859a(11576);
        pc12.f139695e = str;
        pc12.f139696f = bVar;
        pc12.f139698h = i;
        pc12.f139697g = str2;
        C50942qc1 qc12 = new C50942qc1();
        qc12.setBaseResponse(new C49966ja());
        qc12.getBaseResponse().f135956e = new C51163rv3();
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = pc12;
        bVar2.f127067b = qc12;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/findermixsearch";
        bVar2.f127069d = 11576;
        mo123453j(bVar2.mo72403a());
    }
}
