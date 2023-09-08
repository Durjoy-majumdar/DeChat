package p735w1;

import com.tencent.map.geolocation.sapp.TencentLocation;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import p436a1.C103264s0;
import p436a1.C103272w;
import p451b2.C104014i;
import p451b2.C104020o;
import p451b2.C104021p;
import p451b2.C104022q;
import p486d2.C106974e;
import p486d2.C106975h;
import p486d2.C31047d;
import p486d2.C31048f;
import p544h2.C108014f;
import p544h2.C108015h;
import p544h2.C32656a;
import p544h2.C32657c;
import p544h2.C32659e;
import p544h2.C32660g;
import p544h2.C32661i;
import p544h2.C32662j;
import p560i2.C33183o;
import p560i2.C33185q;
import rx3.C13603j;

/* renamed from: w1.a0 */
public final class C111686a0 {
    /* renamed from: a */
    public static final C111705z m152214a(C111705z zVar, C33183o oVar) {
        C111705z zVar2;
        C111705z zVar3;
        C106974e eVar;
        C111705z zVar4 = zVar;
        C87412m.m108594g(zVar4, "style");
        C87412m.m108594g(oVar, TencentLocation.EXTRA_DIRECTION);
        C111699r rVar = zVar4.f334379a;
        int i = C111701t.f334360e;
        C87412m.m108594g(rVar, "style");
        C108015h b = rVar.f334341a.mo158404b(C111700s.f334355d);
        long j = C33185q.m39975c(rVar.f334342b) ? C111701t.f334356a : rVar.f334342b;
        C104022q qVar = rVar.f334343c;
        if (qVar == null) {
            qVar = C104022q.f307654i;
        }
        C104022q qVar2 = qVar;
        C104020o oVar2 = rVar.f334344d;
        C104020o oVar3 = new C104020o(oVar2 != null ? oVar2.f307648a : 0);
        C104021p pVar = rVar.f334345e;
        C104021p pVar2 = new C104021p(pVar != null ? pVar.f307649a : 1);
        C104014i iVar = rVar.f334346f;
        if (iVar == null) {
            iVar = C104014i.f307636d;
        }
        C104014i iVar2 = iVar;
        String str = rVar.f334347g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j2 = C33185q.m39975c(rVar.f334348h) ? C111701t.f334357b : rVar.f334348h;
        C32656a aVar = rVar.f334349i;
        C32656a aVar2 = new C32656a(aVar != null ? aVar.f86666a : 0.0f);
        C32661i iVar3 = rVar.f334350j;
        if (iVar3 == null) {
            iVar3 = C32661i.f86672c;
        }
        C32661i iVar4 = iVar3;
        C106974e eVar2 = rVar.f334351k;
        if (eVar2 == null) {
            List<C31048f> a = C106975h.f320207a.mo57948a();
            ArrayList arrayList = new ArrayList(a.size());
            zVar3 = zVar2;
            int i2 = 0;
            for (int size = a.size(); i2 < size; size = size) {
                arrayList.add(new C31047d(a.get(i2)));
                i2++;
                a = a;
            }
            eVar = new C106974e(arrayList);
        } else {
            zVar3 = zVar2;
            eVar = eVar2;
        }
        long j3 = rVar.f334352l;
        if (!(j3 != C103272w.f304515g)) {
            j3 = C111701t.f334358c;
        }
        long j4 = j3;
        C108014f fVar = rVar.f334353m;
        if (fVar == null) {
            fVar = C108014f.f323457b;
        }
        C108014f fVar2 = fVar;
        C103264s0 s0Var = rVar.f334354n;
        if (s0Var == null) {
            s0Var = C103264s0.f304481d;
        }
        C111699r rVar2 = new C111699r(b, j, qVar2, oVar3, pVar2, iVar2, str2, j2, aVar2, iVar4, eVar, j4, fVar2, s0Var, (C111697o) null, (C8480h) null);
        C37966k kVar = zVar4.f334380b;
        int i3 = C111696l.f334340b;
        C87412m.m108594g(kVar, "style");
        C32659e eVar3 = kVar.f100437a;
        int i4 = 5;
        C32659e eVar4 = new C32659e(eVar3 != null ? eVar3.f86670a : 5);
        C32660g gVar = kVar.f100438b;
        if (gVar != null && gVar.f86671a == 3) {
            int ordinal = oVar.ordinal();
            if (ordinal == 0) {
                i4 = 4;
            } else if (ordinal != 1) {
                throw new C13603j();
            }
        } else if (gVar == null) {
            int ordinal2 = oVar.ordinal();
            if (ordinal2 == 0) {
                i4 = 1;
            } else if (ordinal2 == 1) {
                i4 = 2;
            } else {
                throw new C13603j();
            }
        } else {
            i4 = gVar.f86671a;
        }
        C32660g gVar2 = new C32660g(i4);
        long j5 = C33185q.m39975c(kVar.f100439c) ? C111696l.f334339a : kVar.f100439c;
        C32662j jVar = kVar.f100440d;
        if (jVar == null) {
            jVar = C32662j.f86675c;
        }
        kVar.getClass();
        C37966k kVar2 = new C37966k(eVar4, gVar2, j5, jVar, (C37968n) null, (C32657c) null, (C8480h) null);
        zVar.getClass();
        return new C111705z(rVar2, kVar2, (C111698p) null);
    }
}
