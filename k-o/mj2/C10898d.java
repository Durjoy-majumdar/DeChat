package mj2;

import eb0.C31543z5;
import gy3.C87412m;
import java.util.LinkedList;
import ob0.C47350c;
import ob0.C89132b;
import pe3.C89349b;
import te3.C49122dc;
import te3.C49260ec;
import te3.C49405fc;
import te3.ro4;

/* renamed from: mj2.d */
public final class C10898d extends C89132b<C49405fc> {
    public C10898d(LinkedList<ro4> linkedList) {
        C87412m.m108594g(linkedList, "dataList");
        C47350c.C47352b bVar = new C47350c.C47352b();
        C49260ec ecVar = new C49260ec();
        ecVar.f132841d = (long) C31543z5.m39455e();
        C49122dc dcVar = new C49122dc();
        dcVar.f132225d = linkedList;
        ecVar.f132842e = new C89349b(dcVar.toByteArray());
        bVar.f127066a = ecVar;
        bVar.f127067b = new C49405fc();
        bVar.f127068c = "/cgi-bin/micromsg-bin/batchuploaduserdatalist";
        bVar.f127069d = 7181;
        mo123453j(bVar.mo72403a());
    }
}
