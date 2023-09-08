package je1;

import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import java.util.LinkedList;
import jp3.C9487b;
import ob0.C47350c;
import te3.C49712hj1;
import te3.C49812i81;
import te3.C49958j81;
import te3.C49966ja;
import te3.C51163rv3;

/* renamed from: je1.y0 */
public final class C46551y0 extends C60625c<C49958j81> {

    /* renamed from: s */
    public C49812i81 f125440s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46551y0(int i, String str, LinkedList<String> linkedList) {
        super((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
        C87412m.m108594g(str, "finderUsername");
        C87412m.m108594g(linkedList, "sensitiveWords");
        C49812i81 i812 = new C49812i81();
        this.f125440s = i812;
        i812.f135164d = C46523h2.f125330a.mo71859a(11726);
        C49812i81 i813 = this.f125440s;
        i813.f135165e = i;
        i813.f135167g = str;
        i813.f135166f = linkedList;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = i813;
        C49958j81 j812 = new C49958j81();
        j812.setBaseResponse(new C49966ja());
        j812.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = j812;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderlivesensitivewordmanage";
        bVar.f127069d = 11726;
        mo123453j(bVar.mo72403a());
    }
}
