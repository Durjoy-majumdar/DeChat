package je1;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89132b;
import sx3.C36907w;
import te3.C49335eu3;
import te3.C49966ja;
import te3.C50405mi0;
import te3.C50564nm0;
import te3.C51163rv3;
import te3.C64558mm0;
import zc1.C66785b;

/* renamed from: je1.w1 */
public final class C60812w1 extends C89132b<C50564nm0> {

    /* renamed from: i */
    public static final C60813a f173199i = new C60813a((C8480h) null);

    /* renamed from: je1.w1$a */
    public static final class C60813a {
        public C60813a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C60812w1 mo85732a(List<? extends C50405mi0> list) {
            C87412m.m108594g(list, "usernameList");
            C60812w1 w1Var = new C60812w1();
            C47350c.C47352b bVar = new C47350c.C47352b();
            C64558mm0 mm02 = new C64558mm0();
            mm02.f184342d = C46523h2.f125330a.mo71859a(3953);
            mm02.f184344f = 1;
            mm02.f184345g = C66785b.f191882e.mo90662O5();
            mm02.f184346h.addAll(list);
            bVar.f127066a = mm02;
            C50564nm0 nm02 = new C50564nm0();
            nm02.setBaseResponse(new C49966ja());
            nm02.getBaseResponse().f135956e = new C51163rv3();
            bVar.f127067b = nm02;
            bVar.f127068c = "/cgi-bin/micromsg-bin/findergetcontactlist";
            bVar.f127069d = 3953;
            w1Var.mo123453j(bVar.mo72403a());
            return w1Var;
        }
    }

    /* renamed from: h */
    public void mo10094h(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        ArrayList arrayList;
        C50564nm0 nm02 = (C50564nm0) eu32;
        C87412m.m108594g(nm02, "resp");
        StringBuilder sb = new StringBuilder();
        sb.append("[onCgiBack] errType=");
        sb.append(i);
        sb.append(" errCode=");
        sb.append(i2);
        sb.append(" errMsg=");
        sb.append(str);
        sb.append(" resp=");
        LinkedList<FinderContact> linkedList = nm02.f138660d;
        if (linkedList != null) {
            arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
            for (FinderContact finderContact : linkedList) {
                arrayList.add(finderContact.username);
            }
        } else {
            arrayList = null;
        }
        sb.append(arrayList);
        Log.m105924i("Finder.CgiGetFinderContact", sb.toString());
    }
}
