package qr1;

import gy3.C87412m;
import j03.C60700d;
import sp3.C36777d;
import u23.C65003a;
import u23.C65005i;

/* renamed from: qr1.a */
public final class C101240a implements C65005i {
    /* renamed from: a */
    public C36777d mo86877a(C65003a aVar, Object obj) {
        C87412m.m108594g(aVar, "trackInfo");
        if (!(aVar instanceof C63320d)) {
            throw new IllegalStateException("trackInfo is not TPTrackThumbInfo".toString());
        } else if (obj instanceof C60700d.C60701a) {
            return new C110446b((C63320d) aVar, (C60700d.C60701a) obj);
        } else {
            throw new IllegalStateException("not set resourceLoader".toString());
        }
    }
}
