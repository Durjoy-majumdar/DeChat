package p009c2;

import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import p735w1.C37958a;
import p735w1.C37962b;
import p735w1.C38006x;
import p735w1.C38007y;

/* renamed from: c2.e */
public final class C104249e {

    /* renamed from: a */
    public C28482z f308573a;

    /* renamed from: b */
    public C104251f f308574b;

    public C104249e() {
        C37958a aVar = C37962b.f100430a;
        int i = C38006x.f100499c;
        C28482z zVar = new C28482z(aVar, C38006x.f100498b, (C38006x) null, (C8480h) null);
        this.f308573a = zVar;
        this.f308574b = new C104251f(aVar, zVar.f78286b, (C8480h) null);
    }

    /* renamed from: a */
    public final C28482z mo145867a(List<? extends C104247d> list) {
        C87412m.m108594g(list, "editCommands");
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            ((C104247d) list.get(i)).mo145851a(this.f308574b);
        }
        C37958a aVar = new C37958a(this.f308574b.toString(), (List) null, (List) null, 6, (C8480h) null);
        C104251f fVar = this.f308574b;
        long a = C38007y.m41701a(fVar.f308577b, fVar.f308578c);
        C104251f fVar2 = this.f308574b;
        int i2 = fVar2.f308579d;
        if (i2 != -1) {
            z = true;
        }
        C28482z zVar = new C28482z(aVar, a, z ? new C38006x(C38007y.m41701a(i2, fVar2.f308580e)) : null, (C8480h) null);
        this.f308573a = zVar;
        return zVar;
    }
}
