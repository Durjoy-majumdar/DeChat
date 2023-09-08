package p812el;

import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.List;
import ob0.C47350c;
import ob0.C89132b;
import pe3.C89349b;
import sx3.C64186f0;
import te3.C101840sa;
import te3.C51365ta;

/* renamed from: el.a */
public final class C97670a extends C89132b<C51365ta> {
    public C97670a(int i, int i2, List list, C89349b bVar, C89349b bVar2, int i3, C8480h hVar) {
        i2 = (i3 & 2) != 0 ? 0 : i2;
        list = (i3 & 4) != 0 ? C64186f0.f181907d : list;
        bVar = (i3 & 8) != 0 ? null : bVar;
        bVar2 = (i3 & 16) != 0 ? null : bVar2;
        C87412m.m108594g(list, "md5List");
        C101840sa saVar = new C101840sa();
        C51365ta taVar = new C51365ta();
        saVar.f299392e = i;
        saVar.f299393f = new LinkedList<>(list);
        saVar.f299394g = i2;
        saVar.f299395h = bVar;
        saVar.f299396i = bVar2;
        C47350c.C47352b bVar3 = new C47350c.C47352b();
        bVar3.f127066a = saVar;
        bVar3.f127067b = taVar;
        bVar3.f127068c = "/cgi-bin/micromsg-bin/mmbatchemojidownload";
        bVar3.f127069d = 697;
        mo123453j(bVar3.mo72403a());
    }
}
