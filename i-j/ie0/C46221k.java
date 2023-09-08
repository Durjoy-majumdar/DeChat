package ie0;

import gy3.C87412m;
import o90.C100308d;
import p823sg.C101611g;
import q90.C101062d;

/* renamed from: ie0.k */
public final class C46221k {

    /* renamed from: a */
    public final C101611g<String, C46220j> f124592a = new C100308d(20);

    /* renamed from: a */
    public final C46220j mo71633a(String str) {
        C87412m.m108594g(str, "key");
        C46220j jVar = (C46220j) ((C101062d) this.f124592a).mo139556b(str);
        if (jVar == null) {
            return null;
        }
        String str2 = jVar.field_username;
        if (!(str2 == null || str2.length() == 0)) {
            return jVar;
        }
        return null;
    }
}
