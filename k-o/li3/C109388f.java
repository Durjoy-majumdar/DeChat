package li3;

import com.google.protobuf.C16994k;
import gy3.C87412m;
import mi3.C109631i;
import mi3.C109632j;
import mi3.C24995e;
import mi3.C25001k;
import mi3.C25016p;

/* renamed from: li3.f */
public final class C109388f extends C109387c<C25016p, C25016p.C25018b> {

    /* renamed from: b */
    public C24995e.C24997b f327463b = C24995e.f71199g.toBuilder();

    public C109388f() {
        this.f327462a = C25016p.f71273z.toBuilder();
    }

    /* renamed from: c */
    public final String mo160585c() {
        String str;
        C25016p.C25018b bVar = (C25016p.C25018b) mo160583a();
        Object obj = bVar.f71294e;
        if (!(obj instanceof String)) {
            str = ((C16994k) obj).mo18752u();
            bVar.f71294e = str;
        } else {
            str = (String) obj;
        }
        C87412m.m108590c(str, "innerBuilder.path");
        return str;
    }

    /* renamed from: d */
    public void mo160586d(byte[] bArr) {
        C87412m.m108595h(bArr, "data");
        this.f327462a = C25016p.f71272A.parseFrom(bArr).toBuilder();
        C24995e eVar = ((C25016p.C25018b) mo160583a()).f71307u;
        if (eVar == null) {
            eVar = C24995e.f71199g;
        }
        this.f327463b = eVar.toBuilder();
    }

    /* renamed from: e */
    public final void mo160587e(int i) {
        C25016p.C25018b bVar = (C25016p.C25018b) mo160583a();
        C109632j jVar = i != 0 ? i != 1 ? i != 2 ? C109632j.UNRECOGNIZED : C109632j.CenterInside : C109632j.CenterCrop : C109632j.Custom;
        bVar.getClass();
        bVar.f71309w = jVar.getNumber();
        bVar.onChanged();
    }

    /* renamed from: f */
    public final void mo160588f(C99482e eVar) {
        C87412m.m108595h(eVar, "value");
        C25016p.C25018b bVar = (C25016p.C25018b) mo160583a();
        bVar.f71296g = eVar.f291673a;
        bVar.onChanged();
        C25016p.C25018b bVar2 = (C25016p.C25018b) mo160583a();
        bVar2.f71297h = eVar.f291674b;
        bVar2.onChanged();
    }

    /* renamed from: g */
    public final void mo160589g(C99482e eVar) {
        C87412m.m108595h(eVar, "value");
        C25016p.C25018b bVar = (C25016p.C25018b) mo160583a();
        bVar.f71298i = eVar.f291673a;
        bVar.onChanged();
        C25016p.C25018b bVar2 = (C25016p.C25018b) mo160583a();
        bVar2.f71299j = eVar.f291674b;
        bVar2.onChanged();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Track(trackId:");
        sb.append(((C25016p.C25018b) mo160583a()).f71293d);
        sb.append(" path:");
        sb.append(mo160585c());
        sb.append(" trackType:");
        C109631i a = C109631i.m148941a(((C25016p.C25018b) mo160583a()).f71295f);
        if (a == null) {
            a = C109631i.UNRECOGNIZED;
        }
        int ordinal = a.ordinal();
        int i = 3;
        int i2 = 0;
        if (ordinal == 1) {
            i = 2;
        } else if (ordinal != 2) {
            i = ordinal != 3 ? 0 : 1;
        }
        sb.append(i);
        sb.append(" source:");
        sb.append(new C99482e(((C25016p.C25018b) mo160583a()).f71296g, ((C25016p.C25018b) mo160583a()).f71297h));
        sb.append("  track:");
        sb.append(new C99482e(((C25016p.C25018b) mo160583a()).f71298i, ((C25016p.C25018b) mo160583a()).f71299j));
        sb.append(" playRate:");
        sb.append(((C25016p.C25018b) mo160583a()).f71306t);
        sb.append(" volume:");
        sb.append(((C25016p.C25018b) mo160583a()).f71304r);
        sb.append(" rotate:");
        sb.append(((C25016p.C25018b) mo160583a()).f71305s);
        sb.append(" resolution:");
        sb.append(new C10532d(((C25016p.C25018b) mo160583a()).f71301o, ((C25016p.C25018b) mo160583a()).f71302p));
        sb.append(" contentCrop:");
        C109632j a2 = C109632j.m148942a(((C25016p.C25018b) mo160583a()).f71309w);
        if (a2 == null) {
            a2 = C109632j.UNRECOGNIZED;
        }
        int ordinal2 = a2.ordinal();
        if (ordinal2 != 0) {
            i2 = ordinal2 != 1 ? ordinal2 != 2 ? 4 : 2 : 1;
        }
        sb.append(i2);
        sb.append(" displayRect:");
        C24995e eVar = ((C25016p.C25018b) mo160583a()).f71307u;
        if (eVar == null) {
            eVar = C24995e.f71199g;
        }
        C87412m.m108590c(eVar, "innerBuilder.cropInfo");
        C25001k b = eVar.mo52056b();
        C87412m.m108590c(b, "innerBuilder.cropInfo.displayRect");
        sb.append(C109385a.m148547b(b));
        sb.append(')');
        return sb.toString();
    }
}
