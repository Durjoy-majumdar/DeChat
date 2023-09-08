package je1;

import com.google.android.gms.actions.SearchIntents;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import java.util.LinkedList;
import jp3.C9487b;
import ob0.C47350c;
import pe3.C89349b;
import te3.C49013ck1;
import te3.C49157dk1;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C51163rv3;

/* renamed from: je1.f2 */
public final class C9308f2 extends C60625c<C49157dk1> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9308f2(String str, int i, String str2, LinkedList<String> linkedList, C89349b bVar, C49712hj1 hj12) {
        super(hj12, (C9487b) null, 2, (C8480h) null);
        C87412m.m108594g(str, SearchIntents.EXTRA_QUERY);
        C87412m.m108594g(str2, "requestId");
        C87412m.m108594g(linkedList, "tags");
        C49013ck1 ck12 = new C49013ck1();
        ck12.f131789d = C46523h2.f125330a.mo71860b(10834, hj12);
        ck12.f131790e = str;
        ck12.f131791f = bVar;
        ck12.f131792g = i;
        ck12.f131793h = str2;
        ck12.f131794i = linkedList;
        C49157dk1 dk12 = new C49157dk1();
        dk12.setBaseResponse(new C49966ja());
        dk12.getBaseResponse().f135956e = new C51163rv3();
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = ck12;
        bVar2.f127067b = dk12;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/findersearchinteraction";
        bVar2.f127069d = 10834;
        mo123453j(bVar2.mo72403a());
    }
}
